package androidx.media3.session;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.session.MediaLibraryService;
import androidx.media3.session.MediaLibraryServiceLegacyStub;
import androidx.media3.session.MediaSession;
import androidx.media3.session.legacy.MediaBrowserCompat;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import androidx.media3.session.legacy.MediaSessionManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
class MediaLibraryServiceLegacyStub extends MediaSessionServiceLegacyStub {
    private static final String TAG = "MLSLegacyStub";
    private final MediaSession.ControllerCb browserLegacyCbForBroadcast;
    private final MediaLibrarySessionImpl librarySessionImpl;

    public final class BrowserLegacyCb implements MediaSession.ControllerCb {
        private final MediaSessionManager.RemoteUserInfo remoteUserInfo;
        private final Object lock = new Object();

        @GuardedBy("lock")
        private final List<SearchRequest> searchRequests = new ArrayList();

        public BrowserLegacyCb(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.remoteUserInfo = remoteUserInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSearchResultChanged$0(List list) {
            int i;
            int i2;
            int i3;
            int i4;
            for (int i5 = 0; i5 < list.size(); i5++) {
                SearchRequest searchRequest = (SearchRequest) list.get(i5);
                Bundle bundle = searchRequest.extras;
                if (bundle != null) {
                    try {
                        bundle.setClassLoader(MediaLibraryServiceLegacyStub.this.librarySessionImpl.getContext().getClassLoader());
                        i = searchRequest.extras.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
                        i2 = searchRequest.extras.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
                    } catch (BadParcelableException unused) {
                        searchRequest.result.sendResult(null);
                        return;
                    }
                } else {
                    i = 0;
                    i2 = Integer.MAX_VALUE;
                }
                if (i < 0 || i2 < 1) {
                    i3 = 0;
                    i4 = Integer.MAX_VALUE;
                } else {
                    i3 = i;
                    i4 = i2;
                }
                MediaLibraryServiceLegacyStub.sendLibraryResultWithMediaItemsWhenReady(searchRequest.result, Util.transformFutureAsync(MediaLibraryServiceLegacyStub.this.librarySessionImpl.onGetSearchResultOnHandler(searchRequest.controller, searchRequest.query, i3, i4, LegacyConversions.convertToLibraryParams(MediaLibraryServiceLegacyStub.this.librarySessionImpl.getContext(), searchRequest.extras)), MediaLibraryServiceLegacyStub.this.createMediaItemsToBrowserItemsAsyncFunction()));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void registerSearchRequest(MediaSession.ControllerInfo controllerInfo, String str, @Nullable Bundle bundle, MediaBrowserServiceCompat.Result<List<MediaBrowserCompat.MediaItem>> result) {
            synchronized (this.lock) {
                this.searchRequests.add(new SearchRequest(controllerInfo, controllerInfo.getRemoteUserInfo(), str, bundle, result));
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BrowserLegacyCb) {
                return Objects.equals(this.remoteUserInfo, ((BrowserLegacyCb) obj).remoteUserInfo);
            }
            return false;
        }

        public int hashCode() {
            return ObjectsCompat.hash(this.remoteUserInfo);
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onChildrenChanged(int i, String str, int i2, @Nullable MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
            Bundle bundle = libraryParams != null ? libraryParams.extras : null;
            MediaLibraryServiceLegacyStub mediaLibraryServiceLegacyStub = MediaLibraryServiceLegacyStub.this;
            MediaSessionManager.RemoteUserInfo remoteUserInfo = this.remoteUserInfo;
            if (bundle == null) {
                bundle = Bundle.EMPTY;
            }
            mediaLibraryServiceLegacyStub.notifyChildrenChanged(remoteUserInfo, str, bundle);
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onSearchResultChanged(int i, String str, int i2, @Nullable MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
            final ArrayList arrayList = new ArrayList();
            synchronized (this.lock) {
                try {
                    for (int size = this.searchRequests.size() - 1; size >= 0; size--) {
                        SearchRequest searchRequest = this.searchRequests.get(size);
                        if (Objects.equals(this.remoteUserInfo, searchRequest.remoteUserInfo) && searchRequest.query.equals(str)) {
                            arrayList.add(searchRequest);
                            this.searchRequests.remove(size);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    Util.postOrRun(MediaLibraryServiceLegacyStub.this.librarySessionImpl.getApplicationHandler(), new Runnable() { // from class: androidx.media3.session.I2
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediaLibraryServiceLegacyStub.BrowserLegacyCb.this.lambda$onSearchResultChanged$0(arrayList);
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final class BrowserLegacyCbForBroadcast implements MediaSession.ControllerCb {
        private BrowserLegacyCbForBroadcast() {
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onChildrenChanged(int i, String str, int i2, @Nullable MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
            Bundle bundle;
            if (libraryParams == null || (bundle = libraryParams.extras) == null) {
                MediaLibraryServiceLegacyStub.this.notifyChildrenChanged(str);
            } else {
                MediaLibraryServiceLegacyStub.this.notifyChildrenChanged(str, (Bundle) Util.castNonNull(bundle));
            }
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onSearchResultChanged(int i, String str, int i2, @Nullable MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
        }
    }

    public static class SearchRequest {
        public final MediaSession.ControllerInfo controller;

        @Nullable
        public final Bundle extras;
        public final String query;
        public final MediaSessionManager.RemoteUserInfo remoteUserInfo;
        public final MediaBrowserServiceCompat.Result<List<MediaBrowserCompat.MediaItem>> result;

        public SearchRequest(MediaSession.ControllerInfo controllerInfo, MediaSessionManager.RemoteUserInfo remoteUserInfo, String str, @Nullable Bundle bundle, MediaBrowserServiceCompat.Result<List<MediaBrowserCompat.MediaItem>> result) {
            this.controller = controllerInfo;
            this.remoteUserInfo = remoteUserInfo;
            this.query = str;
            this.extras = bundle;
            this.result = result;
        }
    }

    public MediaLibraryServiceLegacyStub(MediaLibrarySessionImpl mediaLibrarySessionImpl) {
        super(mediaLibrarySessionImpl);
        this.librarySessionImpl = mediaLibrarySessionImpl;
        this.browserLegacyCbForBroadcast = new BrowserLegacyCbForBroadcast();
    }

    private static <T> void cancelAllFutures(List<com.google.common.util.concurrent.u<T>> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                list.get(i).cancel(false);
            }
        }
    }

    private com.google.common.util.concurrent.h<LibraryResult<MediaItem>, MediaBrowserCompat.MediaItem> createMediaItemToBrowserItemAsyncFunction() {
        return new C0599w2(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.util.concurrent.h<LibraryResult<com.google.common.collect.G<MediaItem>>, List<MediaBrowserCompat.MediaItem>> createMediaItemsToBrowserItemsAsyncFunction() {
        return new C0567r0(this);
    }

    @Nullable
    private MediaSession.ControllerInfo getCurrentController() {
        return getConnectedControllersManager().getController(getCurrentBrowserInfo());
    }

    private void handleBitmapFuturesAllCompletedAndSetOutputFuture(List<com.google.common.util.concurrent.u<Bitmap>> list, List<MediaItem> list2, com.google.common.util.concurrent.x<List<MediaBrowserCompat.MediaItem>> xVar) {
        Bitmap bitmap;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.google.common.util.concurrent.u<Bitmap> uVar = list.get(i);
            if (uVar != null) {
                try {
                    bitmap = (Bitmap) com.google.common.util.concurrent.o.b(uVar);
                } catch (CancellationException | ExecutionException e) {
                    Log.d(TAG, "Failed to get bitmap", e);
                }
                arrayList.add(LegacyConversions.convertToBrowserItem(list2.get(i), bitmap));
            }
            bitmap = null;
            arrayList.add(LegacyConversions.convertToBrowserItem(list2.get(i), bitmap));
        }
        xVar.set(arrayList);
    }

    private static <T> void ignoreFuture(Future<T> future) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createMediaItemToBrowserItemAsyncFunction$13(com.google.common.util.concurrent.x xVar, com.google.common.util.concurrent.u uVar) {
        if (xVar.isCancelled()) {
            uVar.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createMediaItemToBrowserItemAsyncFunction$14(com.google.common.util.concurrent.u uVar, com.google.common.util.concurrent.x xVar, MediaItem mediaItem) {
        Bitmap bitmap;
        try {
            bitmap = (Bitmap) com.google.common.util.concurrent.o.b(uVar);
        } catch (CancellationException | ExecutionException e) {
            Log.d(TAG, "failed to get bitmap", e);
            bitmap = null;
        }
        xVar.set(LegacyConversions.convertToBrowserItem(mediaItem, bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public com.google.common.util.concurrent.u lambda$createMediaItemToBrowserItemAsyncFunction$15(LibraryResult libraryResult) throws Exception {
        V v;
        Assertions.checkNotNull(libraryResult, "LibraryResult must not be null");
        final com.google.common.util.concurrent.x xVar = new com.google.common.util.concurrent.x();
        if (libraryResult.resultCode != 0 || (v = libraryResult.value) == 0) {
            xVar.set(null);
            return xVar;
        }
        final MediaItem mediaItem = (MediaItem) v;
        MediaMetadata mediaMetadata = mediaItem.mediaMetadata;
        if (mediaMetadata.artworkData == null) {
            xVar.set(LegacyConversions.convertToBrowserItem(mediaItem, null));
            return xVar;
        }
        final com.google.common.util.concurrent.u<Bitmap> decodeBitmap = this.librarySessionImpl.getBitmapLoader().decodeBitmap(mediaMetadata.artworkData);
        Runnable runnable = new Runnable() { // from class: androidx.media3.session.D2
            @Override // java.lang.Runnable
            public final void run() {
                MediaLibraryServiceLegacyStub.lambda$createMediaItemToBrowserItemAsyncFunction$13(com.google.common.util.concurrent.x.this, decodeBitmap);
            }
        };
        com.google.common.util.concurrent.j jVar = com.google.common.util.concurrent.j.a;
        xVar.addListener(runnable, jVar);
        decodeBitmap.addListener(new Runnable() { // from class: androidx.media3.session.E2
            @Override // java.lang.Runnable
            public final void run() {
                MediaLibraryServiceLegacyStub.lambda$createMediaItemToBrowserItemAsyncFunction$14(com.google.common.util.concurrent.u.this, xVar, mediaItem);
            }
        }, jVar);
        return xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createMediaItemsToBrowserItemsAsyncFunction$10(com.google.common.util.concurrent.x xVar, List list) {
        if (xVar.isCancelled()) {
            cancelAllFutures(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createMediaItemsToBrowserItemsAsyncFunction$11(AtomicInteger atomicInteger, com.google.common.collect.G g, List list, com.google.common.util.concurrent.x xVar) {
        if (atomicInteger.incrementAndGet() == g.size()) {
            handleBitmapFuturesAllCompletedAndSetOutputFuture(list, g, xVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public com.google.common.util.concurrent.u lambda$createMediaItemsToBrowserItemsAsyncFunction$12(LibraryResult libraryResult) throws Exception {
        V v;
        Assertions.checkNotNull(libraryResult, "LibraryResult must not be null");
        final com.google.common.util.concurrent.x xVar = new com.google.common.util.concurrent.x();
        if (libraryResult.resultCode != 0 || (v = libraryResult.value) == 0) {
            xVar.set(null);
            return xVar;
        }
        final com.google.common.collect.G g = (com.google.common.collect.G) v;
        if (g.isEmpty()) {
            xVar.set(new ArrayList());
            return xVar;
        }
        final ArrayList arrayList = new ArrayList();
        Runnable runnable = new Runnable() { // from class: androidx.media3.session.y2
            @Override // java.lang.Runnable
            public final void run() {
                MediaLibraryServiceLegacyStub.lambda$createMediaItemsToBrowserItemsAsyncFunction$10(com.google.common.util.concurrent.x.this, arrayList);
            }
        };
        com.google.common.util.concurrent.j jVar = com.google.common.util.concurrent.j.a;
        xVar.addListener(runnable, jVar);
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        Runnable runnable2 = new Runnable() { // from class: androidx.media3.session.z2
            @Override // java.lang.Runnable
            public final void run() {
                MediaLibraryServiceLegacyStub.this.lambda$createMediaItemsToBrowserItemsAsyncFunction$11(atomicInteger, g, arrayList, xVar);
            }
        };
        for (int i = 0; i < g.size(); i++) {
            MediaMetadata mediaMetadata = ((MediaItem) g.get(i)).mediaMetadata;
            if (mediaMetadata.artworkData == null) {
                arrayList.add(null);
                runnable2.run();
            } else {
                com.google.common.util.concurrent.u<Bitmap> decodeBitmap = this.librarySessionImpl.getBitmapLoader().decodeBitmap(mediaMetadata.artworkData);
                arrayList.add(decodeBitmap);
                decodeBitmap.addListener(runnable2, jVar);
            }
        }
        return xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCustomAction$6(String str, MediaSession.ControllerInfo controllerInfo, MediaBrowserServiceCompat.Result result, Bundle bundle) {
        SessionCommand sessionCommand = new SessionCommand(str, Bundle.EMPTY);
        if (getConnectedControllersManager().isSessionCommandAvailable(controllerInfo, sessionCommand)) {
            sendCustomActionResultWhenReady(result, this.librarySessionImpl.onCustomCommandOnHandler(controllerInfo, sessionCommand, bundle));
        } else {
            result.sendError(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onGetRoot$0(AtomicReference atomicReference, MediaSession.ControllerInfo controllerInfo, MediaLibraryService.LibraryParams libraryParams, ConditionVariable conditionVariable) {
        atomicReference.set(this.librarySessionImpl.onGetLibraryRootOnHandler(controllerInfo, libraryParams));
        conditionVariable.open();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLoadChildren$3(MediaSession.ControllerInfo controllerInfo, MediaBrowserServiceCompat.Result result, Bundle bundle, String str) {
        MediaSession.ControllerInfo controllerInfo2;
        String str2;
        if (!getConnectedControllersManager().isSessionCommandAvailable(controllerInfo, SessionCommand.COMMAND_CODE_LIBRARY_GET_CHILDREN)) {
            result.sendResult(null);
            return;
        }
        if (bundle != null) {
            bundle.setClassLoader(this.librarySessionImpl.getContext().getClassLoader());
            try {
                int i = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE);
                int i2 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE);
                if (i >= 0 && i2 > 0) {
                    try {
                        controllerInfo2 = controllerInfo;
                        str2 = str;
                        try {
                            sendLibraryResultWithMediaItemsWhenReady(result, Util.transformFutureAsync(this.librarySessionImpl.onGetChildrenOnHandler(controllerInfo, str, i, i2, LegacyConversions.convertToLibraryParams(this.librarySessionImpl.getContext(), bundle)), createMediaItemsToBrowserItemsAsyncFunction()));
                            return;
                        } catch (BadParcelableException unused) {
                        }
                    } catch (BadParcelableException unused2) {
                        controllerInfo2 = controllerInfo;
                        str2 = str;
                    }
                }
            } catch (BadParcelableException unused3) {
            }
        }
        controllerInfo2 = controllerInfo;
        str2 = str;
        sendLibraryResultWithMediaItemsWhenReady(result, Util.transformFutureAsync(this.librarySessionImpl.onGetChildrenOnHandler(controllerInfo2, str2, 0, Integer.MAX_VALUE, null), createMediaItemsToBrowserItemsAsyncFunction()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLoadItem$4(MediaSession.ControllerInfo controllerInfo, MediaBrowserServiceCompat.Result result, String str) {
        if (getConnectedControllersManager().isSessionCommandAvailable(controllerInfo, SessionCommand.COMMAND_CODE_LIBRARY_GET_ITEM)) {
            sendLibraryResultWithMediaItemWhenReady(result, Util.transformFutureAsync(this.librarySessionImpl.onGetItemOnHandler(controllerInfo, str), createMediaItemToBrowserItemAsyncFunction()));
        } else {
            result.sendResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSearch$5(MediaSession.ControllerInfo controllerInfo, MediaBrowserServiceCompat.Result result, String str, Bundle bundle) {
        if (!getConnectedControllersManager().isSessionCommandAvailable(controllerInfo, SessionCommand.COMMAND_CODE_LIBRARY_SEARCH)) {
            result.sendResult(null);
            return;
        }
        ((BrowserLegacyCb) Assertions.checkStateNotNull(controllerInfo.getControllerCb())).registerSearchRequest(controllerInfo, str, bundle, result);
        ignoreFuture(this.librarySessionImpl.onSearchOnHandler(controllerInfo, str, LegacyConversions.convertToLibraryParams(this.librarySessionImpl.getContext(), bundle)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$1(MediaSession.ControllerInfo controllerInfo, Bundle bundle, String str) {
        if (getConnectedControllersManager().isSessionCommandAvailable(controllerInfo, SessionCommand.COMMAND_CODE_LIBRARY_SUBSCRIBE)) {
            ignoreFuture(this.librarySessionImpl.onSubscribeOnHandler(controllerInfo, str, LegacyConversions.convertToLibraryParams(this.librarySessionImpl.getContext(), bundle)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUnsubscribe$2(MediaSession.ControllerInfo controllerInfo, String str) {
        if (getConnectedControllersManager().isSessionCommandAvailable(controllerInfo, SessionCommand.COMMAND_CODE_LIBRARY_UNSUBSCRIBE)) {
            ignoreFuture(this.librarySessionImpl.onUnsubscribeOnHandler(controllerInfo, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void lambda$sendCustomActionResultWhenReady$7(com.google.common.util.concurrent.u uVar, MediaBrowserServiceCompat.Result result) {
        try {
            result.sendResult(((SessionResult) Assertions.checkNotNull((SessionResult) uVar.get(), "SessionResult must not be null")).extras);
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            Log.w(TAG, "Custom action failed", e);
            result.sendError(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void lambda$sendLibraryResultWithMediaItemWhenReady$8(com.google.common.util.concurrent.u uVar, MediaBrowserServiceCompat.Result result) {
        try {
            result.sendResult((MediaBrowserCompat.MediaItem) uVar.get());
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            Log.w(TAG, "Library operation failed", e);
            result.sendResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendLibraryResultWithMediaItemsWhenReady$9(com.google.common.util.concurrent.u uVar, MediaBrowserServiceCompat.Result result) {
        try {
            List list = (List) uVar.get();
            result.sendResult(list == null ? null : MediaUtils.truncateListBySize(list, 262144));
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            Log.w(TAG, "Library operation failed", e);
            result.sendResult(null);
        }
    }

    private static void sendCustomActionResultWhenReady(final MediaBrowserServiceCompat.Result<Bundle> result, final com.google.common.util.concurrent.u<SessionResult> uVar) {
        uVar.addListener(new Runnable() { // from class: androidx.media3.session.x2
            @Override // java.lang.Runnable
            public final void run() {
                MediaLibraryServiceLegacyStub.lambda$sendCustomActionResultWhenReady$7(com.google.common.util.concurrent.u.this, result);
            }
        }, com.google.common.util.concurrent.j.a);
    }

    private static void sendLibraryResultWithMediaItemWhenReady(final MediaBrowserServiceCompat.Result<MediaBrowserCompat.MediaItem> result, final com.google.common.util.concurrent.u<MediaBrowserCompat.MediaItem> uVar) {
        uVar.addListener(new Runnable() { // from class: androidx.media3.session.t2
            @Override // java.lang.Runnable
            public final void run() {
                MediaLibraryServiceLegacyStub.lambda$sendLibraryResultWithMediaItemWhenReady$8(com.google.common.util.concurrent.u.this, result);
            }
        }, com.google.common.util.concurrent.j.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sendLibraryResultWithMediaItemsWhenReady(final MediaBrowserServiceCompat.Result<List<MediaBrowserCompat.MediaItem>> result, final com.google.common.util.concurrent.u<List<MediaBrowserCompat.MediaItem>> uVar) {
        uVar.addListener(new Runnable() { // from class: androidx.media3.session.G2
            @Override // java.lang.Runnable
            public final void run() {
                MediaLibraryServiceLegacyStub.lambda$sendLibraryResultWithMediaItemsWhenReady$9(com.google.common.util.concurrent.u.this, result);
            }
        }, com.google.common.util.concurrent.j.a);
    }

    @Override // androidx.media3.session.MediaSessionServiceLegacyStub
    public MediaSession.ControllerInfo createControllerInfo(MediaSessionManager.RemoteUserInfo remoteUserInfo, Bundle bundle) {
        return new MediaSession.ControllerInfo(remoteUserInfo, 0, 0, getMediaSessionManager().isTrustedForMediaControl(remoteUserInfo), new BrowserLegacyCb(remoteUserInfo), bundle, LegacyConversions.extractMaxCommandsForMediaItemFromRootHints(bundle));
    }

    public MediaSession.ControllerCb getBrowserLegacyCbForBroadcast() {
        return this.browserLegacyCbForBroadcast;
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public void onCustomAction(final String str, final Bundle bundle, final MediaBrowserServiceCompat.Result<Bundle> result) {
        final MediaSession.ControllerInfo currentController = getCurrentController();
        if (currentController == null) {
            result.sendError(null);
        } else {
            result.detach();
            Util.postOrRun(this.librarySessionImpl.getApplicationHandler(), new Runnable() { // from class: androidx.media3.session.C2
                @Override // java.lang.Runnable
                public final void run() {
                    MediaBrowserServiceCompat.Result result2 = result;
                    Bundle bundle2 = bundle;
                    this.lambda$onCustomAction$6(str, currentController, result2, bundle2);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.session.MediaSessionServiceLegacyStub, androidx.media3.session.legacy.MediaBrowserServiceCompat
    @Nullable
    public MediaBrowserServiceCompat.BrowserRoot onGetRoot(@Nullable String str, int i, @Nullable Bundle bundle) {
        final MediaSession.ControllerInfo currentController;
        LibraryResult libraryResult;
        if (super.onGetRoot(str, i, bundle) == null || (currentController = getCurrentController()) == null || !getConnectedControllersManager().isSessionCommandAvailable(currentController, 50000)) {
            return null;
        }
        final MediaLibraryService.LibraryParams convertToLibraryParams = LegacyConversions.convertToLibraryParams(this.librarySessionImpl.getContext(), bundle);
        final AtomicReference atomicReference = new AtomicReference();
        final ConditionVariable conditionVariable = new ConditionVariable();
        Util.postOrRun(this.librarySessionImpl.getApplicationHandler(), new Runnable() { // from class: androidx.media3.session.A2
            @Override // java.lang.Runnable
            public final void run() {
                MediaLibraryServiceLegacyStub.this.lambda$onGetRoot$0(atomicReference, currentController, convertToLibraryParams, conditionVariable);
            }
        });
        try {
            conditionVariable.block();
            libraryResult = (LibraryResult) Assertions.checkNotNull((LibraryResult) ((com.google.common.util.concurrent.u) atomicReference.get()).get(), "LibraryResult must not be null");
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            Log.e(TAG, "Couldn't get a result from onGetLibraryRoot", e);
            libraryResult = null;
        }
        if (libraryResult == null || libraryResult.resultCode != 0 || libraryResult.value == 0) {
            if (libraryResult == null || libraryResult.resultCode == 0) {
                return MediaUtils.defaultBrowserRoot;
            }
            return null;
        }
        MediaLibraryService.LibraryParams libraryParams = libraryResult.params;
        Bundle convertToRootHints = libraryParams != null ? LegacyConversions.convertToRootHints(libraryParams) : new Bundle();
        ((Bundle) Assertions.checkNotNull(convertToRootHints)).putBoolean("android.media.browse.SEARCH_SUPPORTED", getConnectedControllersManager().isSessionCommandAvailable(currentController, SessionCommand.COMMAND_CODE_LIBRARY_SEARCH));
        com.google.common.collect.G<CommandButton> commandButtonsForMediaItems = this.librarySessionImpl.getCommandButtonsForMediaItems();
        if (!commandButtonsForMediaItems.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < commandButtonsForMediaItems.size(); i2++) {
                CommandButton commandButton = commandButtonsForMediaItems.get(i2);
                SessionCommand sessionCommand = commandButton.sessionCommand;
                if (sessionCommand != null && sessionCommand.commandCode == 0) {
                    arrayList.add(LegacyConversions.convertToBundle(commandButton));
                }
            }
            if (!arrayList.isEmpty()) {
                convertToRootHints.putParcelableArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ROOT_LIST", arrayList);
            }
        }
        return new MediaBrowserServiceCompat.BrowserRoot(((MediaItem) libraryResult.value).mediaId, convertToRootHints);
    }

    @Override // androidx.media3.session.MediaSessionServiceLegacyStub, androidx.media3.session.legacy.MediaBrowserServiceCompat
    public void onLoadChildren(@Nullable String str, MediaBrowserServiceCompat.Result<List<MediaBrowserCompat.MediaItem>> result) {
        onLoadChildren(str, result, null);
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public void onLoadItem(final String str, final MediaBrowserServiceCompat.Result<MediaBrowserCompat.MediaItem> result) {
        final MediaSession.ControllerInfo currentController = getCurrentController();
        if (currentController == null) {
            result.sendResult(null);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            result.detach();
            Util.postOrRun(this.librarySessionImpl.getApplicationHandler(), new Runnable() { // from class: androidx.media3.session.H2
                @Override // java.lang.Runnable
                public final void run() {
                    MediaLibraryServiceLegacyStub.this.lambda$onLoadItem$4(currentController, result, str);
                }
            });
        } else {
            Log.w(TAG, "Ignoring empty itemId from " + currentController);
            result.sendResult(null);
        }
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public void onSearch(final String str, @Nullable final Bundle bundle, final MediaBrowserServiceCompat.Result<List<MediaBrowserCompat.MediaItem>> result) {
        final MediaSession.ControllerInfo currentController = getCurrentController();
        if (currentController == null) {
            result.sendResult(null);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.w(TAG, "Ignoring empty query from " + currentController);
            result.sendResult(null);
            return;
        }
        if (currentController.getControllerCb() instanceof BrowserLegacyCb) {
            result.detach();
            Util.postOrRun(this.librarySessionImpl.getApplicationHandler(), new Runnable() { // from class: androidx.media3.session.u2
                @Override // java.lang.Runnable
                public final void run() {
                    this.lambda$onSearch$5(currentController, result, str, bundle);
                }
            });
        }
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    @SuppressLint({"RestrictedApi"})
    public void onSubscribe(@Nullable final String str, @Nullable final Bundle bundle) {
        final MediaSession.ControllerInfo currentController = getCurrentController();
        if (currentController == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            Util.postOrRun(this.librarySessionImpl.getApplicationHandler(), new Runnable() { // from class: androidx.media3.session.B2
                @Override // java.lang.Runnable
                public final void run() {
                    MediaLibraryServiceLegacyStub.this.lambda$onSubscribe$1(currentController, bundle, str);
                }
            });
            return;
        }
        Log.w(TAG, "onSubscribe(): Ignoring empty id from " + currentController);
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    @SuppressLint({"RestrictedApi"})
    public void onUnsubscribe(@Nullable String str) {
        MediaSession.ControllerInfo currentController = getCurrentController();
        if (currentController == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            Util.postOrRun(this.librarySessionImpl.getApplicationHandler(), new RunnableC0593v2(this, currentController, str, 0));
            return;
        }
        Log.w(TAG, "onUnsubscribe(): Ignoring empty id from " + currentController);
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public void onLoadChildren(@Nullable final String str, final MediaBrowserServiceCompat.Result<List<MediaBrowserCompat.MediaItem>> result, @Nullable final Bundle bundle) {
        final MediaSession.ControllerInfo currentController = getCurrentController();
        if (currentController == null) {
            result.sendResult(null);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            result.detach();
            Util.postOrRun(this.librarySessionImpl.getApplicationHandler(), new Runnable() { // from class: androidx.media3.session.F2
                @Override // java.lang.Runnable
                public final void run() {
                    this.lambda$onLoadChildren$3(currentController, result, bundle, str);
                }
            });
        } else {
            Log.w(TAG, "onLoadChildren(): Ignoring empty parentId from " + currentController);
            result.sendResult(null);
        }
    }
}
