package androidx.media3.session;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Player;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.session.MediaLibraryService;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;
import androidx.media3.session.legacy.MediaSessionCompat;
import com.google.common.collect.G;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
class MediaLibrarySessionImpl extends MediaSessionImpl {
    private static final String RECENT_LIBRARY_ROOT_MEDIA_ID = "androidx.media3.session.recent.root";
    private final MediaLibraryService.MediaLibrarySession.Callback callback;
    private final com.google.common.collect.B<MediaSession.ControllerCb, String> controllerToSubscribedParentIds;
    private final MediaLibraryService.MediaLibrarySession instance;
    private final int libraryErrorReplicationMode;
    private final com.google.common.collect.B<String, MediaSession.ControllerInfo> parentIdToSubscribedControllers;

    public MediaLibrarySessionImpl(MediaLibraryService.MediaLibrarySession mediaLibrarySession, Context context, String str, Player player, @Nullable PendingIntent pendingIntent, com.google.common.collect.G<CommandButton> g, com.google.common.collect.G<CommandButton> g2, com.google.common.collect.G<CommandButton> g3, MediaLibraryService.MediaLibrarySession.Callback callback, Bundle bundle, Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z, boolean z2, int i) {
        super(mediaLibrarySession, context, str, player, pendingIntent, g, g2, g3, callback, bundle, bundle2, bitmapLoader, z, z2);
        this.instance = mediaLibrarySession;
        this.callback = callback;
        this.libraryErrorReplicationMode = i;
        this.parentIdToSubscribedControllers = new com.google.common.collect.B<>();
        this.controllerToSubscribedParentIds = new com.google.common.collect.B<>();
    }

    private com.google.common.util.concurrent.u<LibraryResult<com.google.common.collect.G<MediaItem>>> getRecentMediaItemAtDeviceBootTime(MediaSession.ControllerInfo controllerInfo, @Nullable final MediaLibraryService.LibraryParams libraryParams) {
        final com.google.common.util.concurrent.x xVar = new com.google.common.util.concurrent.x();
        if (isMediaNotificationControllerConnected()) {
            controllerInfo = (MediaSession.ControllerInfo) Assertions.checkNotNull(getMediaNotificationControllerInfo());
        }
        com.google.common.util.concurrent.o.a(this.callback.onPlaybackResumption(this.instance, controllerInfo), new com.google.common.util.concurrent.n<MediaSession.MediaItemsWithStartPosition>() { // from class: androidx.media3.session.MediaLibrarySessionImpl.1
            @Override // com.google.common.util.concurrent.n
            public void onFailure(Throwable th) {
                xVar.set(LibraryResult.ofError(-1, libraryParams));
                Log.e(MediaSessionImpl.TAG, "Failed fetching recent media item at boot time: " + th.getMessage(), th);
            }

            @Override // com.google.common.util.concurrent.n
            public void onSuccess(MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition) {
                if (mediaItemsWithStartPosition.mediaItems.isEmpty()) {
                    xVar.set(LibraryResult.ofError(-2, libraryParams));
                } else {
                    xVar.set(LibraryResult.ofItemList(com.google.common.collect.G.n(mediaItemsWithStartPosition.mediaItems.get(Math.max(0, Math.min(mediaItemsWithStartPosition.startIndex, mediaItemsWithStartPosition.mediaItems.size() - 1)))), libraryParams));
                }
            }
        }, com.google.common.util.concurrent.j.a);
        return xVar;
    }

    private boolean isReplicationErrorCode(int i) {
        return i == -102 || i == -105;
    }

    private boolean isSubscribed(MediaSession.ControllerCb controllerCb, String str) {
        return this.controllerToSubscribedParentIds.c(controllerCb, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyChildrenChanged$4(String str, int i, MediaLibraryService.LibraryParams libraryParams, MediaSession.ControllerCb controllerCb, int i2) throws RemoteException {
        if (isSubscribed(controllerCb, str)) {
            controllerCb.onChildrenChanged(i2, str, i, libraryParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onGetChildrenOnHandler$0(com.google.common.util.concurrent.u uVar, MediaSession.ControllerInfo controllerInfo, int i) {
        LibraryResult<?> libraryResult = (LibraryResult) tryGetFutureResult(uVar);
        if (libraryResult != null) {
            maybeUpdateLegacyErrorState(controllerInfo, libraryResult);
            verifyResultItems(libraryResult, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onGetItemOnHandler$1(com.google.common.util.concurrent.u uVar, MediaSession.ControllerInfo controllerInfo) {
        LibraryResult<?> libraryResult = (LibraryResult) tryGetFutureResult(uVar);
        if (libraryResult != null) {
            maybeUpdateLegacyErrorState(controllerInfo, libraryResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onGetSearchResultOnHandler$6(com.google.common.util.concurrent.u uVar, MediaSession.ControllerInfo controllerInfo, int i) {
        LibraryResult<?> libraryResult = (LibraryResult) tryGetFutureResult(uVar);
        if (libraryResult != null) {
            maybeUpdateLegacyErrorState(controllerInfo, libraryResult);
            verifyResultItems(libraryResult, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSearchOnHandler$5(com.google.common.util.concurrent.u uVar, MediaSession.ControllerInfo controllerInfo) {
        LibraryResult<?> libraryResult = (LibraryResult) tryGetFutureResult(uVar);
        if (libraryResult != null) {
            maybeUpdateLegacyErrorState(controllerInfo, libraryResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribeOnHandler$2(com.google.common.util.concurrent.u uVar, MediaSession.ControllerInfo controllerInfo, String str) {
        LibraryResult libraryResult = (LibraryResult) tryGetFutureResult(uVar);
        if (libraryResult == null || libraryResult.resultCode != 0) {
            lambda$onUnsubscribeOnHandler$3(controllerInfo, str);
        }
    }

    private void maybeUpdateLegacyErrorState(MediaSession.ControllerInfo controllerInfo, LibraryResult<?> libraryResult) {
        if (this.libraryErrorReplicationMode == 0 || controllerInfo.getControllerVersion() != 0) {
            return;
        }
        if (isReplicationErrorCode(libraryResult.resultCode)) {
            getMediaSessionLegacyStub().setLegacyError(libraryResult, this.libraryErrorReplicationMode == 1);
        }
        if (libraryResult.resultCode == 0) {
            getMediaSessionLegacyStub().clearLegacyErrorStatus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOrRunOnApplicationHandler(Runnable runnable) {
        Util.postOrRun(getApplicationHandler(), runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: removeSubscription, reason: merged with bridge method [inline-methods] */
    public void lambda$onUnsubscribeOnHandler$3(MediaSession.ControllerInfo controllerInfo, String str) {
        MediaSession.ControllerCb controllerCb = (MediaSession.ControllerCb) Assertions.checkNotNull(controllerInfo.getControllerCb());
        this.parentIdToSubscribedControllers.remove(str, controllerInfo);
        this.controllerToSubscribedParentIds.remove(controllerCb, str);
    }

    @Nullable
    private static <T> T tryGetFutureResult(Future<T> future) {
        Assertions.checkState(future.isDone());
        try {
            return future.get();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            Log.w(MediaSessionImpl.TAG, "Library operation failed", e);
            return null;
        }
    }

    private static void verifyResultItems(LibraryResult<com.google.common.collect.G<MediaItem>> libraryResult, int i) {
        if (libraryResult.resultCode == 0) {
            List list = (List) Assertions.checkNotNull(libraryResult.value);
            if (list.size() <= i) {
                return;
            }
            throw new IllegalStateException("Invalid size=" + list.size() + ", pageSize=" + i);
        }
    }

    public void clearReplicatedLibraryError() {
        getMediaSessionLegacyStub().clearLegacyErrorStatus();
    }

    @Override // androidx.media3.session.MediaSessionImpl
    public MediaSessionServiceLegacyStub createLegacyBrowserService(MediaSessionCompat.Token token) {
        MediaLibraryServiceLegacyStub mediaLibraryServiceLegacyStub = new MediaLibraryServiceLegacyStub(this);
        mediaLibraryServiceLegacyStub.initialize(token);
        return mediaLibraryServiceLegacyStub;
    }

    @Override // androidx.media3.session.MediaSessionImpl
    public void dispatchRemoteControllerTaskWithoutReturn(MediaSessionImpl.RemoteControllerTask remoteControllerTask) {
        super.dispatchRemoteControllerTaskWithoutReturn(remoteControllerTask);
        MediaLibraryServiceLegacyStub legacyBrowserService = getLegacyBrowserService();
        if (legacyBrowserService != null) {
            try {
                remoteControllerTask.run(legacyBrowserService.getBrowserLegacyCbForBroadcast(), 0);
            } catch (RemoteException e) {
                Log.e(MediaSessionImpl.TAG, "Exception in using media1 API", e);
            }
        }
    }

    @Override // androidx.media3.session.MediaSessionImpl
    public List<MediaSession.ControllerInfo> getConnectedControllers() {
        List<MediaSession.ControllerInfo> connectedControllers = super.getConnectedControllers();
        MediaLibraryServiceLegacyStub legacyBrowserService = getLegacyBrowserService();
        if (legacyBrowserService == null) {
            return connectedControllers;
        }
        com.google.common.collect.G<MediaSession.ControllerInfo> connectedControllers2 = legacyBrowserService.getConnectedControllersManager().getConnectedControllers();
        G.a i = com.google.common.collect.G.i(connectedControllers2.size() + connectedControllers.size());
        i.e(connectedControllers);
        i.e(connectedControllers2);
        return i.g();
    }

    public com.google.common.collect.G<MediaSession.ControllerInfo> getSubscribedControllers(String str) {
        return com.google.common.collect.G.j(this.parentIdToSubscribedControllers.l(str));
    }

    @Override // androidx.media3.session.MediaSessionImpl
    public boolean isConnected(MediaSession.ControllerInfo controllerInfo) {
        if (super.isConnected(controllerInfo)) {
            return true;
        }
        MediaLibraryServiceLegacyStub legacyBrowserService = getLegacyBrowserService();
        return legacyBrowserService != null && legacyBrowserService.getConnectedControllersManager().isConnected(controllerInfo);
    }

    public void notifyChildrenChanged(String str, int i, @Nullable MediaLibraryService.LibraryParams libraryParams) {
        List<MediaSession.ControllerInfo> connectedControllers = this.instance.getConnectedControllers();
        for (int i2 = 0; i2 < connectedControllers.size(); i2++) {
            notifyChildrenChanged(connectedControllers.get(i2), str, i, libraryParams);
        }
    }

    public void notifySearchResultChanged(MediaSession.ControllerInfo controllerInfo, final String str, final int i, @Nullable final MediaLibraryService.LibraryParams libraryParams) {
        if (isMediaNotificationControllerConnected() && isMediaNotificationController(controllerInfo) && (controllerInfo = getSystemUiControllerInfo()) == null) {
            return;
        }
        dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.N2
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                controllerCb.onSearchResultChanged(i2, str, i, libraryParams);
            }
        });
    }

    @Override // androidx.media3.session.MediaSessionImpl
    public void onDisconnectedOnHandler(MediaSession.ControllerInfo controllerInfo) {
        Iterator it = com.google.common.collect.M.j(this.controllerToSubscribedParentIds.l((MediaSession.ControllerCb) Assertions.checkNotNull(controllerInfo.getControllerCb()))).iterator();
        while (it.hasNext()) {
            lambda$onUnsubscribeOnHandler$3(controllerInfo, (String) it.next());
        }
        super.onDisconnectedOnHandler(controllerInfo);
    }

    public com.google.common.util.concurrent.u<LibraryResult<com.google.common.collect.G<MediaItem>>> onGetChildrenOnHandler(final MediaSession.ControllerInfo controllerInfo, String str, int i, final int i2, @Nullable MediaLibraryService.LibraryParams libraryParams) {
        if (Objects.equals(str, RECENT_LIBRARY_ROOT_MEDIA_ID)) {
            return !canResumePlaybackOnStart() ? com.google.common.util.concurrent.o.d(LibraryResult.ofError(-6)) : getPlayerWrapper().getPlaybackState() == 1 ? getRecentMediaItemAtDeviceBootTime(controllerInfo, libraryParams) : com.google.common.util.concurrent.o.d(LibraryResult.ofItemList(com.google.common.collect.G.n(new MediaItem.Builder().setMediaId("androidx.media3.session.recent.item").setMediaMetadata(new MediaMetadata.Builder().setIsBrowsable(Boolean.FALSE).setIsPlayable(Boolean.TRUE).build()).build()), libraryParams));
        }
        final com.google.common.util.concurrent.u<LibraryResult<com.google.common.collect.G<MediaItem>>> onGetChildren = this.callback.onGetChildren(this.instance, resolveControllerInfoForCallback(controllerInfo), str, i, i2, libraryParams);
        onGetChildren.addListener(new Runnable() { // from class: androidx.media3.session.J2
            @Override // java.lang.Runnable
            public final void run() {
                MediaLibrarySessionImpl.this.lambda$onGetChildrenOnHandler$0(onGetChildren, controllerInfo, i2);
            }
        }, new K2(this));
        return onGetChildren;
    }

    public com.google.common.util.concurrent.u<LibraryResult<MediaItem>> onGetItemOnHandler(final MediaSession.ControllerInfo controllerInfo, String str) {
        final com.google.common.util.concurrent.u<LibraryResult<MediaItem>> onGetItem = this.callback.onGetItem(this.instance, resolveControllerInfoForCallback(controllerInfo), str);
        onGetItem.addListener(new Runnable() { // from class: androidx.media3.session.M2
            @Override // java.lang.Runnable
            public final void run() {
                MediaLibrarySessionImpl.this.lambda$onGetItemOnHandler$1(onGetItem, controllerInfo);
            }
        }, new K2(this));
        return onGetItem;
    }

    public com.google.common.util.concurrent.u<LibraryResult<MediaItem>> onGetLibraryRootOnHandler(MediaSession.ControllerInfo controllerInfo, @Nullable MediaLibraryService.LibraryParams libraryParams) {
        return (libraryParams != null && libraryParams.isRecent && isSystemUiController(controllerInfo)) ? !canResumePlaybackOnStart() ? com.google.common.util.concurrent.o.d(LibraryResult.ofError(-6)) : com.google.common.util.concurrent.o.d(LibraryResult.ofItem(new MediaItem.Builder().setMediaId(RECENT_LIBRARY_ROOT_MEDIA_ID).setMediaMetadata(new MediaMetadata.Builder().setIsBrowsable(Boolean.TRUE).setIsPlayable(Boolean.FALSE).build()).build(), libraryParams)) : this.callback.onGetLibraryRoot(this.instance, resolveControllerInfoForCallback(controllerInfo), libraryParams);
    }

    public com.google.common.util.concurrent.u<LibraryResult<com.google.common.collect.G<MediaItem>>> onGetSearchResultOnHandler(final MediaSession.ControllerInfo controllerInfo, String str, int i, final int i2, @Nullable MediaLibraryService.LibraryParams libraryParams) {
        final com.google.common.util.concurrent.u<LibraryResult<com.google.common.collect.G<MediaItem>>> onGetSearchResult = this.callback.onGetSearchResult(this.instance, resolveControllerInfoForCallback(controllerInfo), str, i, i2, libraryParams);
        onGetSearchResult.addListener(new Runnable() { // from class: androidx.media3.session.O2
            @Override // java.lang.Runnable
            public final void run() {
                MediaLibrarySessionImpl.this.lambda$onGetSearchResultOnHandler$6(onGetSearchResult, controllerInfo, i2);
            }
        }, new K2(this));
        return onGetSearchResult;
    }

    public com.google.common.util.concurrent.u<LibraryResult<Void>> onSearchOnHandler(final MediaSession.ControllerInfo controllerInfo, String str, @Nullable MediaLibraryService.LibraryParams libraryParams) {
        final com.google.common.util.concurrent.u<LibraryResult<Void>> onSearch = this.callback.onSearch(this.instance, resolveControllerInfoForCallback(controllerInfo), str, libraryParams);
        onSearch.addListener(new Runnable() { // from class: androidx.media3.session.Q2
            @Override // java.lang.Runnable
            public final void run() {
                MediaLibrarySessionImpl.this.lambda$onSearchOnHandler$5(onSearch, controllerInfo);
            }
        }, new K2(this));
        return onSearch;
    }

    public com.google.common.util.concurrent.u<LibraryResult<Void>> onSubscribeOnHandler(final MediaSession.ControllerInfo controllerInfo, final String str, @Nullable MediaLibraryService.LibraryParams libraryParams) {
        this.controllerToSubscribedParentIds.put((MediaSession.ControllerCb) Assertions.checkNotNull(controllerInfo.getControllerCb()), str);
        this.parentIdToSubscribedControllers.put(str, controllerInfo);
        final com.google.common.util.concurrent.u<LibraryResult<Void>> uVar = (com.google.common.util.concurrent.u) Assertions.checkNotNull(this.callback.onSubscribe(this.instance, resolveControllerInfoForCallback(controllerInfo), str, libraryParams), "onSubscribe must return non-null future");
        uVar.addListener(new Runnable() { // from class: androidx.media3.session.L2
            @Override // java.lang.Runnable
            public final void run() {
                MediaLibrarySessionImpl.this.lambda$onSubscribeOnHandler$2(uVar, controllerInfo, str);
            }
        }, new K2(this));
        return uVar;
    }

    public com.google.common.util.concurrent.u<LibraryResult<Void>> onUnsubscribeOnHandler(final MediaSession.ControllerInfo controllerInfo, final String str) {
        com.google.common.util.concurrent.u<LibraryResult<Void>> onUnsubscribe = this.callback.onUnsubscribe(this.instance, resolveControllerInfoForCallback(controllerInfo), str);
        onUnsubscribe.addListener(new Runnable() { // from class: androidx.media3.session.R2
            @Override // java.lang.Runnable
            public final void run() {
                MediaLibrarySessionImpl.this.lambda$onUnsubscribeOnHandler$3(controllerInfo, str);
            }
        }, new K2(this));
        return onUnsubscribe;
    }

    @Override // androidx.media3.session.MediaSessionImpl
    @Nullable
    public MediaLibraryServiceLegacyStub getLegacyBrowserService() {
        return (MediaLibraryServiceLegacyStub) super.getLegacyBrowserService();
    }

    public void notifyChildrenChanged(MediaSession.ControllerInfo controllerInfo, final String str, final int i, @Nullable final MediaLibraryService.LibraryParams libraryParams) {
        if (isMediaNotificationControllerConnected() && isMediaNotificationController(controllerInfo) && (controllerInfo = getSystemUiControllerInfo()) == null) {
            return;
        }
        dispatchRemoteControllerTaskWithoutReturn(controllerInfo, new MediaSessionImpl.RemoteControllerTask() { // from class: androidx.media3.session.P2
            @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
            public final void run(MediaSession.ControllerCb controllerCb, int i2) {
                MediaLibrarySessionImpl.this.lambda$notifyChildrenChanged$4(str, i, libraryParams, controllerCb, i2);
            }
        });
    }
}
