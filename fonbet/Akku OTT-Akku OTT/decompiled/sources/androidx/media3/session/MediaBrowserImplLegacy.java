package androidx.media3.session;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.session.MediaBrowser;
import androidx.media3.session.MediaBrowserImplLegacy;
import androidx.media3.session.MediaLibraryService;
import androidx.media3.session.legacy.MediaBrowserCompat;
import com.google.common.collect.G;
import com.google.common.collect.I;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
class MediaBrowserImplLegacy extends MediaControllerImplLegacy implements MediaBrowser.MediaBrowserImpl {
    private static final String TAG = "MB2ImplLegacy";
    private final HashMap<MediaLibraryService.LibraryParams, MediaBrowserCompat> browserCompats;
    private com.google.common.collect.I<String, CommandButton> commandButtonsForMediaItems;
    private final MediaBrowser instance;
    private final HashMap<String, List<SubscribeCallback>> subscribeCallbacks;

    /* renamed from: androidx.media3.session.MediaBrowserImplLegacy$2, reason: invalid class name */
    public class AnonymousClass2 extends MediaBrowserCompat.SearchCallback {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onError$1(String str, MediaBrowser.Listener listener) {
            listener.onSearchResultChanged(MediaBrowserImplLegacy.this.getInstance(), str, 0, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSearchResult$0(String str, List list, MediaBrowser.Listener listener) {
            listener.onSearchResultChanged(MediaBrowserImplLegacy.this.getInstance(), str, list.size(), null);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.SearchCallback
        public void onError(String str, @Nullable Bundle bundle) {
            MediaBrowserImplLegacy.this.getInstance().notifyBrowserListener(new C0566r(0, this, str));
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.SearchCallback
        public void onSearchResult(final String str, @Nullable Bundle bundle, final List<MediaBrowserCompat.MediaItem> list) {
            MediaBrowserImplLegacy.this.getInstance().notifyBrowserListener(new Consumer() { // from class: androidx.media3.session.q
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaBrowserImplLegacy.AnonymousClass2.this.lambda$onSearchResult$0(str, list, (MediaBrowser.Listener) obj);
                }
            });
        }
    }

    public class GetChildrenCallback extends MediaBrowserCompat.SubscriptionCallback {
        private final com.google.common.util.concurrent.x<LibraryResult<com.google.common.collect.G<MediaItem>>> future;
        private final String parentId;

        public GetChildrenCallback(com.google.common.util.concurrent.x<LibraryResult<com.google.common.collect.G<MediaItem>>> xVar, String str) {
            this.future = xVar;
            this.parentId = str;
        }

        private void onChildrenLoadedInternal(@Nullable String str, @Nullable List<MediaBrowserCompat.MediaItem> list) {
            if (TextUtils.isEmpty(str)) {
                Log.w(MediaBrowserImplLegacy.TAG, "GetChildrenCallback.onChildrenLoaded(): Ignoring empty parentId");
                return;
            }
            MediaBrowserCompat browserCompat = MediaBrowserImplLegacy.this.getBrowserCompat();
            if (browserCompat == null) {
                this.future.set(LibraryResult.ofError(-100));
                return;
            }
            browserCompat.unsubscribe(this.parentId, this);
            if (list == null) {
                this.future.set(LibraryResult.ofError(-1));
            } else {
                this.future.set(LibraryResult.ofItemList(LegacyConversions.convertBrowserItemListToMediaItemList(list), null));
            }
        }

        private void onErrorInternal() {
            this.future.set(LibraryResult.ofError(-1));
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback
        public void onChildrenLoaded(@Nullable String str, @Nullable List<MediaBrowserCompat.MediaItem> list) {
            onChildrenLoadedInternal(str, list);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback
        public void onError(@Nullable String str) {
            onErrorInternal();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback
        public void onChildrenLoaded(@Nullable String str, @Nullable List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
            onChildrenLoadedInternal(str, list);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback
        public void onError(@Nullable String str, @Nullable Bundle bundle) {
            onErrorInternal();
        }
    }

    public class GetLibraryRootCallback extends MediaBrowserCompat.ConnectionCallback {
        private final MediaLibraryService.LibraryParams params;
        private final com.google.common.util.concurrent.x<LibraryResult<MediaItem>> result;

        public GetLibraryRootCallback(com.google.common.util.concurrent.x<LibraryResult<MediaItem>> xVar, MediaLibraryService.LibraryParams libraryParams) {
            this.result = xVar;
            this.params = libraryParams;
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback
        public void onConnected() {
            ArrayList parcelableArrayList;
            MediaBrowserCompat mediaBrowserCompat = (MediaBrowserCompat) MediaBrowserImplLegacy.this.browserCompats.get(this.params);
            if (mediaBrowserCompat == null) {
                this.result.set(LibraryResult.ofError(-1));
                return;
            }
            Bundle extras = mediaBrowserCompat.getExtras();
            if (extras != null && (parcelableArrayList = extras.getParcelableArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ROOT_LIST")) != null) {
                I.a aVar = null;
                for (int i = 0; i < parcelableArrayList.size(); i++) {
                    CommandButton convertCustomBrowseActionToCommandButton = LegacyConversions.convertCustomBrowseActionToCommandButton((Bundle) parcelableArrayList.get(i));
                    if (convertCustomBrowseActionToCommandButton != null) {
                        if (aVar == null) {
                            aVar = new I.a(4).g(MediaBrowserImplLegacy.this.commandButtonsForMediaItems);
                        }
                        aVar.d(((SessionCommand) Assertions.checkNotNull(convertCustomBrowseActionToCommandButton.sessionCommand)).customAction, convertCustomBrowseActionToCommandButton);
                    }
                }
                if (aVar != null) {
                    MediaBrowserImplLegacy.this.commandButtonsForMediaItems = aVar.b();
                }
            }
            this.result.set(LibraryResult.ofItem(MediaBrowserImplLegacy.this.createRootMediaItem(mediaBrowserCompat), LegacyConversions.convertToLibraryParams(MediaBrowserImplLegacy.this.context, extras)));
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback
        public void onConnectionFailed() {
            this.result.set(LibraryResult.ofError(-3));
            MediaBrowserImplLegacy.this.release();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback
        public void onConnectionSuspended() {
            onConnectionFailed();
        }
    }

    public class SubscribeCallback extends MediaBrowserCompat.SubscriptionCallback {
        private final com.google.common.util.concurrent.x<LibraryResult<Void>> future;

        @Nullable
        private List<MediaBrowserCompat.MediaItem> receivedChildren;
        private final Bundle subscriptionOptions;
        private final String subscriptionParentId;

        public SubscribeCallback(String str, Bundle bundle, com.google.common.util.concurrent.x<LibraryResult<Void>> xVar) {
            this.subscriptionParentId = str;
            this.subscriptionOptions = bundle;
            this.future = xVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onChildrenLoadedInternal$1(String str, List list, MediaLibraryService.LibraryParams libraryParams, MediaBrowser.Listener listener) {
            listener.onChildrenChanged(MediaBrowserImplLegacy.this.getInstance(), str, list.size(), libraryParams);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onErrorInternal$0(String str, Bundle bundle, MediaBrowser.Listener listener) {
            listener.onChildrenChanged(MediaBrowserImplLegacy.this.getInstance(), str, Integer.MAX_VALUE, new MediaLibraryService.LibraryParams.Builder().setExtras(bundle).build());
        }

        private void onChildrenLoadedInternal(final String str, @Nullable final List<MediaBrowserCompat.MediaItem> list) {
            if (TextUtils.isEmpty(str)) {
                Log.w(MediaBrowserImplLegacy.TAG, "SubscribeCallback.onChildrenLoaded(): Ignoring empty parentId");
                return;
            }
            MediaBrowserCompat browserCompat = MediaBrowserImplLegacy.this.getBrowserCompat();
            if (browserCompat == null) {
                return;
            }
            if (list == null) {
                onError(this.subscriptionParentId, this.subscriptionOptions);
                return;
            }
            final MediaLibraryService.LibraryParams convertToLibraryParams = LegacyConversions.convertToLibraryParams(MediaBrowserImplLegacy.this.context, browserCompat.getNotifyChildrenChangedOptions());
            this.receivedChildren = list;
            MediaBrowserImplLegacy.this.getInstance().notifyBrowserListener(new Consumer() { // from class: androidx.media3.session.s
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaBrowserImplLegacy.SubscribeCallback.this.lambda$onChildrenLoadedInternal$1(str, list, convertToLibraryParams, (MediaBrowser.Listener) obj);
                }
            });
            this.future.set(LibraryResult.ofVoid());
        }

        private void onErrorInternal(String str, Bundle bundle) {
            if (this.future.isDone()) {
                MediaBrowserImplLegacy.this.getInstance().notifyBrowserListener(new C0578t(this, str, bundle));
            }
            this.future.set(LibraryResult.ofError(-1));
        }

        public boolean canServeGetChildrenRequest(String str, int i) {
            return this.subscriptionParentId.equals(str) && this.receivedChildren != null && i == this.subscriptionOptions.getInt(MediaBrowserCompat.EXTRA_PAGE, 0);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback
        public void onChildrenLoaded(@Nullable String str, @Nullable List<MediaBrowserCompat.MediaItem> list) {
            onChildrenLoadedInternal(this.subscriptionParentId, list);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback
        public void onError(@Nullable String str) {
            onError(this.subscriptionParentId, this.subscriptionOptions);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback
        public void onChildrenLoaded(@Nullable String str, @Nullable List<MediaBrowserCompat.MediaItem> list, @Nullable Bundle bundle) {
            onChildrenLoadedInternal(this.subscriptionParentId, list);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.SubscriptionCallback
        public void onError(@Nullable String str, @Nullable Bundle bundle) {
            onErrorInternal(this.subscriptionParentId, this.subscriptionOptions);
        }
    }

    public MediaBrowserImplLegacy(Context context, MediaBrowser mediaBrowser, SessionToken sessionToken, Bundle bundle, Looper looper, androidx.media3.common.util.BitmapLoader bitmapLoader, long j) {
        super(context, mediaBrowser, sessionToken, bundle, looper, bitmapLoader, j);
        this.browserCompats = new HashMap<>();
        this.subscribeCallbacks = new HashMap<>();
        this.instance = mediaBrowser;
        this.commandButtonsForMediaItems = com.google.common.collect.j0.i;
    }

    private static Bundle createOptionsForSubscription(@Nullable MediaLibraryService.LibraryParams libraryParams) {
        return libraryParams == null ? new Bundle() : new Bundle(libraryParams.extras);
    }

    private static Bundle createOptionsWithPagingInfo(@Nullable MediaLibraryService.LibraryParams libraryParams, int i, int i2) {
        Bundle createOptionsForSubscription = createOptionsForSubscription(libraryParams);
        createOptionsForSubscription.putInt(MediaBrowserCompat.EXTRA_PAGE, i);
        createOptionsForSubscription.putInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, i2);
        return createOptionsForSubscription;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaItem createRootMediaItem(MediaBrowserCompat mediaBrowserCompat) {
        String root = mediaBrowserCompat.getRoot();
        return new MediaItem.Builder().setMediaId(root).setMediaMetadata(new MediaMetadata.Builder().setIsBrowsable(Boolean.TRUE).setMediaType(20).setIsPlayable(Boolean.FALSE).setExtras(mediaBrowserCompat.getExtras()).build()).build();
    }

    private void evictChildrenFromSubscription(String str) {
        List<SubscribeCallback> list = this.subscribeCallbacks.get(str);
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).receivedChildren != null) {
                list.get(i).receivedChildren = null;
                return;
            }
        }
    }

    private MediaBrowserCompat getBrowserCompat(MediaLibraryService.LibraryParams libraryParams) {
        return this.browserCompats.get(libraryParams);
    }

    @Nullable
    private List<MediaBrowserCompat.MediaItem> getChildrenFromSubscription(String str, int i) {
        List<SubscribeCallback> list = this.subscribeCallbacks.get(str);
        if (list == null) {
            return null;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).canServeGetChildrenRequest(str, i)) {
                return list.get(i2).receivedChildren;
            }
        }
        return null;
    }

    @Nullable
    private static Bundle getExtras(@Nullable MediaLibraryService.LibraryParams libraryParams) {
        if (libraryParams != null) {
            return libraryParams.extras;
        }
        return null;
    }

    @Override // androidx.media3.session.MediaControllerImplLegacy, androidx.media3.session.MediaController.MediaControllerImpl
    public SessionCommands getAvailableSessionCommands() {
        return getBrowserCompat() != null ? super.getAvailableSessionCommands().buildUpon().addAllLibraryCommands().build() : super.getAvailableSessionCommands();
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.u<LibraryResult<com.google.common.collect.G<MediaItem>>> getChildren(String str, int i, int i2, @Nullable MediaLibraryService.LibraryParams libraryParams) {
        if (!getInstance().isSessionCommandAvailable(SessionCommand.COMMAND_CODE_LIBRARY_GET_CHILDREN)) {
            return com.google.common.util.concurrent.o.d(LibraryResult.ofError(-4));
        }
        MediaBrowserCompat browserCompat = getBrowserCompat();
        if (browserCompat == null) {
            return com.google.common.util.concurrent.o.d(LibraryResult.ofError(-100));
        }
        Bundle createOptionsWithPagingInfo = createOptionsWithPagingInfo(libraryParams, i, i2);
        com.google.common.util.concurrent.x xVar = new com.google.common.util.concurrent.x();
        List<MediaBrowserCompat.MediaItem> childrenFromSubscription = getChildrenFromSubscription(str, i);
        evictChildrenFromSubscription(str);
        if (childrenFromSubscription != null) {
            xVar.set(LibraryResult.ofItemList(LegacyConversions.convertBrowserItemListToMediaItemList(childrenFromSubscription), new MediaLibraryService.LibraryParams.Builder().setExtras(createOptionsWithPagingInfo).build()));
            return xVar;
        }
        browserCompat.subscribe(str, createOptionsWithPagingInfo, new GetChildrenCallback(xVar, str));
        return xVar;
    }

    @Override // androidx.media3.session.MediaControllerImplLegacy, androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.collect.G<CommandButton> getCommandButtonsForMediaItem(MediaItem mediaItem) {
        com.google.common.collect.G<String> g = mediaItem.mediaMetadata.supportedCommands;
        G.a aVar = new G.a();
        for (int i = 0; i < g.size(); i++) {
            CommandButton commandButton = this.commandButtonsForMediaItems.get(g.get(i));
            if (commandButton != null && commandButton.sessionCommand != null) {
                aVar.c(commandButton);
            }
        }
        return aVar.g();
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.u<LibraryResult<MediaItem>> getItem(String str) {
        if (!getInstance().isSessionCommandAvailable(SessionCommand.COMMAND_CODE_LIBRARY_GET_ITEM)) {
            return com.google.common.util.concurrent.o.d(LibraryResult.ofError(-4));
        }
        MediaBrowserCompat browserCompat = getBrowserCompat();
        if (browserCompat == null) {
            return com.google.common.util.concurrent.o.d(LibraryResult.ofError(-100));
        }
        final com.google.common.util.concurrent.x xVar = new com.google.common.util.concurrent.x();
        browserCompat.getItem(str, new MediaBrowserCompat.ItemCallback() { // from class: androidx.media3.session.MediaBrowserImplLegacy.1
            @Override // androidx.media3.session.legacy.MediaBrowserCompat.ItemCallback
            public void onError(String str2) {
                xVar.set(LibraryResult.ofError(-1));
            }

            @Override // androidx.media3.session.legacy.MediaBrowserCompat.ItemCallback
            public void onItemLoaded(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem != null) {
                    xVar.set(LibraryResult.ofItem(LegacyConversions.convertToMediaItem(mediaItem), null));
                } else {
                    xVar.set(LibraryResult.ofError(-3));
                }
            }
        });
        return xVar;
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.u<LibraryResult<MediaItem>> getLibraryRoot(@Nullable MediaLibraryService.LibraryParams libraryParams) {
        if (!getInstance().isSessionCommandAvailable(50000)) {
            return com.google.common.util.concurrent.o.d(LibraryResult.ofError(-4));
        }
        com.google.common.util.concurrent.x xVar = new com.google.common.util.concurrent.x();
        MediaBrowserCompat browserCompat = getBrowserCompat(libraryParams);
        if (browserCompat != null) {
            xVar.set(LibraryResult.ofItem(createRootMediaItem(browserCompat), null));
            return xVar;
        }
        Bundle bundle = libraryParams == null ? new Bundle() : LegacyConversions.convertToRootHints(libraryParams);
        bundle.putInt("androidx.media.utils.MediaBrowserCompat.extras.CUSTOM_BROWSER_ACTION_LIMIT", getInstance().getMaxCommandsForMediaItems());
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(getContext(), getConnectedToken().getComponentName(), new GetLibraryRootCallback(xVar, libraryParams), bundle);
        this.browserCompats.put(libraryParams, mediaBrowserCompat);
        mediaBrowserCompat.connect();
        return xVar;
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.u<LibraryResult<com.google.common.collect.G<MediaItem>>> getSearchResult(String str, int i, int i2, @Nullable MediaLibraryService.LibraryParams libraryParams) {
        if (!getInstance().isSessionCommandAvailable(SessionCommand.COMMAND_CODE_LIBRARY_GET_SEARCH_RESULT)) {
            return com.google.common.util.concurrent.o.d(LibraryResult.ofError(-4));
        }
        MediaBrowserCompat browserCompat = getBrowserCompat();
        if (browserCompat == null) {
            return com.google.common.util.concurrent.o.d(LibraryResult.ofError(-100));
        }
        final com.google.common.util.concurrent.x xVar = new com.google.common.util.concurrent.x();
        Bundle createOptionsWithPagingInfo = createOptionsWithPagingInfo(libraryParams, i, i2);
        createOptionsWithPagingInfo.putInt(MediaBrowserCompat.EXTRA_PAGE, i);
        createOptionsWithPagingInfo.putInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, i2);
        browserCompat.search(str, createOptionsWithPagingInfo, new MediaBrowserCompat.SearchCallback() { // from class: androidx.media3.session.MediaBrowserImplLegacy.3
            @Override // androidx.media3.session.legacy.MediaBrowserCompat.SearchCallback
            public void onError(String str2, @Nullable Bundle bundle) {
                xVar.set(LibraryResult.ofError(-1));
            }

            @Override // androidx.media3.session.legacy.MediaBrowserCompat.SearchCallback
            public void onSearchResult(String str2, @Nullable Bundle bundle, List<MediaBrowserCompat.MediaItem> list) {
                xVar.set(LibraryResult.ofItemList(LegacyConversions.convertBrowserItemListToMediaItemList(list), null));
            }
        });
        return xVar;
    }

    @Override // androidx.media3.session.MediaControllerImplLegacy, androidx.media3.session.MediaController.MediaControllerImpl
    public void release() {
        Iterator<MediaBrowserCompat> it = this.browserCompats.values().iterator();
        while (it.hasNext()) {
            it.next().disconnect();
        }
        this.browserCompats.clear();
        super.release();
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.u<LibraryResult<Void>> search(String str, @Nullable MediaLibraryService.LibraryParams libraryParams) {
        if (!getInstance().isSessionCommandAvailable(SessionCommand.COMMAND_CODE_LIBRARY_SEARCH)) {
            return com.google.common.util.concurrent.o.d(LibraryResult.ofError(-4));
        }
        MediaBrowserCompat browserCompat = getBrowserCompat();
        if (browserCompat == null) {
            return com.google.common.util.concurrent.o.d(LibraryResult.ofError(-100));
        }
        browserCompat.search(str, getExtras(libraryParams), new AnonymousClass2());
        return com.google.common.util.concurrent.o.d(LibraryResult.ofVoid());
    }

    @Override // androidx.media3.session.MediaControllerImplLegacy, androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.util.concurrent.u<SessionResult> sendCustomCommand(SessionCommand sessionCommand, Bundle bundle) {
        MediaBrowserCompat browserCompat = getBrowserCompat();
        if (browserCompat == null) {
            return com.google.common.util.concurrent.o.d(new SessionResult(-4));
        }
        final com.google.common.util.concurrent.x xVar = new com.google.common.util.concurrent.x();
        browserCompat.sendCustomAction(sessionCommand.customAction, bundle, new MediaBrowserCompat.CustomActionCallback() { // from class: androidx.media3.session.MediaBrowserImplLegacy.4
            @Override // androidx.media3.session.legacy.MediaBrowserCompat.CustomActionCallback
            public void onError(String str, @Nullable Bundle bundle2, @Nullable Bundle bundle3) {
                Bundle bundle4 = new Bundle(bundle2);
                bundle4.putAll(bundle3);
                xVar.set(new SessionResult(-1, bundle4));
            }

            @Override // androidx.media3.session.legacy.MediaBrowserCompat.CustomActionCallback
            public void onResult(String str, @Nullable Bundle bundle2, @Nullable Bundle bundle3) {
                Bundle bundle4 = new Bundle(bundle2);
                bundle4.putAll(bundle3);
                xVar.set(new SessionResult(0, bundle4));
            }
        });
        return xVar;
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.u<LibraryResult<Void>> subscribe(String str, @Nullable MediaLibraryService.LibraryParams libraryParams) {
        if (!getInstance().isSessionCommandAvailable(SessionCommand.COMMAND_CODE_LIBRARY_SUBSCRIBE)) {
            return com.google.common.util.concurrent.o.d(LibraryResult.ofError(-4));
        }
        MediaBrowserCompat browserCompat = getBrowserCompat();
        if (browserCompat == null) {
            return com.google.common.util.concurrent.o.d(LibraryResult.ofError(-100));
        }
        Bundle createOptionsForSubscription = createOptionsForSubscription(libraryParams);
        com.google.common.util.concurrent.x xVar = new com.google.common.util.concurrent.x();
        SubscribeCallback subscribeCallback = new SubscribeCallback(str, createOptionsForSubscription, xVar);
        List<SubscribeCallback> list = this.subscribeCallbacks.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.subscribeCallbacks.put(str, list);
        }
        list.add(subscribeCallback);
        browserCompat.subscribe(str, createOptionsForSubscription, subscribeCallback);
        return xVar;
    }

    @Override // androidx.media3.session.MediaBrowser.MediaBrowserImpl
    public com.google.common.util.concurrent.u<LibraryResult<Void>> unsubscribe(String str) {
        if (!getInstance().isSessionCommandAvailable(SessionCommand.COMMAND_CODE_LIBRARY_UNSUBSCRIBE)) {
            return com.google.common.util.concurrent.o.d(LibraryResult.ofError(-4));
        }
        MediaBrowserCompat browserCompat = getBrowserCompat();
        if (browserCompat == null) {
            return com.google.common.util.concurrent.o.d(LibraryResult.ofError(-100));
        }
        List<SubscribeCallback> list = this.subscribeCallbacks.get(str);
        if (list == null) {
            return com.google.common.util.concurrent.o.d(LibraryResult.ofError(-3));
        }
        for (int i = 0; i < list.size(); i++) {
            browserCompat.unsubscribe(str, list.get(i));
        }
        return com.google.common.util.concurrent.o.d(LibraryResult.ofVoid());
    }

    @Override // androidx.media3.session.MediaControllerImplLegacy
    public MediaBrowser getInstance() {
        return this.instance;
    }
}
