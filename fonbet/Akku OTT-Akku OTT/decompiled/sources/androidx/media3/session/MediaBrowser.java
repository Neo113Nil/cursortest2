package androidx.media3.session;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSourceBitmapLoader;
import androidx.media3.session.MediaController;
import androidx.media3.session.MediaLibraryService;

/* loaded from: classes3.dex */
public final class MediaBrowser extends MediaController {
    private static final String WRONG_THREAD_ERROR_MESSAGE = "MediaBrowser method is called from a wrong thread. See javadoc of MediaController for details.";
    private MediaBrowserImpl impl;

    public static final class Builder {
        private androidx.media3.common.util.BitmapLoader bitmapLoader;
        private final Context context;
        private int maxCommandsForMediaItems;
        private final SessionToken token;
        private Bundle connectionHints = Bundle.EMPTY;
        private Listener listener = new Listener() { // from class: androidx.media3.session.MediaBrowser.Builder.1
        };
        private Looper applicationLooper = Util.getCurrentOrMainLooper();
        private long platformSessionCallbackAggregationTimeoutMs = 100;

        public Builder(Context context, SessionToken sessionToken) {
            this.context = (Context) Assertions.checkNotNull(context);
            this.token = (SessionToken) Assertions.checkNotNull(sessionToken);
        }

        public com.google.common.util.concurrent.u<MediaBrowser> buildAsync() {
            final MediaControllerHolder mediaControllerHolder = new MediaControllerHolder(this.applicationLooper);
            if (this.token.isLegacySession() && this.bitmapLoader == null) {
                this.bitmapLoader = new CacheBitmapLoader(new DataSourceBitmapLoader(this.context));
            }
            final MediaBrowser mediaBrowser = new MediaBrowser(this.context, this.token, this.connectionHints, this.listener, this.applicationLooper, mediaControllerHolder, this.bitmapLoader, this.maxCommandsForMediaItems, this.platformSessionCallbackAggregationTimeoutMs);
            Util.postOrRun(new Handler(this.applicationLooper), new Runnable() { // from class: androidx.media3.session.n
                @Override // java.lang.Runnable
                public final void run() {
                    MediaControllerHolder.this.setController(mediaBrowser);
                }
            });
            return mediaControllerHolder;
        }

        @UnstableApi
        public Builder experimentalSetPlatformSessionCallbackAggregationTimeoutMs(long j) {
            this.platformSessionCallbackAggregationTimeoutMs = j;
            return this;
        }

        public Builder setApplicationLooper(Looper looper) {
            this.applicationLooper = (Looper) Assertions.checkNotNull(looper);
            return this;
        }

        @UnstableApi
        public Builder setBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
            this.bitmapLoader = (androidx.media3.common.util.BitmapLoader) Assertions.checkNotNull(bitmapLoader);
            return this;
        }

        public Builder setConnectionHints(Bundle bundle) {
            this.connectionHints = new Bundle((Bundle) Assertions.checkNotNull(bundle));
            return this;
        }

        public Builder setListener(Listener listener) {
            this.listener = (Listener) Assertions.checkNotNull(listener);
            return this;
        }

        @UnstableApi
        public Builder setMaxCommandsForMediaItems(int i) {
            Assertions.checkArgument(i >= 0);
            this.maxCommandsForMediaItems = i;
            return this;
        }
    }

    public interface Listener extends MediaController.Listener {
        default void onChildrenChanged(MediaBrowser mediaBrowser, String str, @IntRange(from = 0) int i, @Nullable MediaLibraryService.LibraryParams libraryParams) {
        }

        default void onSearchResultChanged(MediaBrowser mediaBrowser, String str, @IntRange(from = 0) int i, @Nullable MediaLibraryService.LibraryParams libraryParams) {
        }
    }

    public interface MediaBrowserImpl extends MediaController.MediaControllerImpl {
        com.google.common.util.concurrent.u<LibraryResult<com.google.common.collect.G<MediaItem>>> getChildren(String str, int i, int i2, @Nullable MediaLibraryService.LibraryParams libraryParams);

        com.google.common.util.concurrent.u<LibraryResult<MediaItem>> getItem(String str);

        com.google.common.util.concurrent.u<LibraryResult<MediaItem>> getLibraryRoot(@Nullable MediaLibraryService.LibraryParams libraryParams);

        com.google.common.util.concurrent.u<LibraryResult<com.google.common.collect.G<MediaItem>>> getSearchResult(String str, int i, int i2, @Nullable MediaLibraryService.LibraryParams libraryParams);

        com.google.common.util.concurrent.u<LibraryResult<Void>> search(String str, @Nullable MediaLibraryService.LibraryParams libraryParams);

        com.google.common.util.concurrent.u<LibraryResult<Void>> subscribe(String str, @Nullable MediaLibraryService.LibraryParams libraryParams);

        com.google.common.util.concurrent.u<LibraryResult<Void>> unsubscribe(String str);
    }

    public MediaBrowser(Context context, SessionToken sessionToken, Bundle bundle, Listener listener, Looper looper, MediaController.ConnectionCallback connectionCallback, @Nullable androidx.media3.common.util.BitmapLoader bitmapLoader, int i, long j) {
        super(context, sessionToken, bundle, listener, looper, connectionCallback, bitmapLoader, i, j);
    }

    private static <V> com.google.common.util.concurrent.u<LibraryResult<V>> createDisconnectedFuture() {
        return com.google.common.util.concurrent.o.d(LibraryResult.ofError(-100));
    }

    private void verifyApplicationThread() {
        Assertions.checkState(Looper.myLooper() == getApplicationLooper(), WRONG_THREAD_ERROR_MESSAGE);
    }

    public com.google.common.util.concurrent.u<LibraryResult<com.google.common.collect.G<MediaItem>>> getChildren(String str, @IntRange(from = 0) int i, @IntRange(from = 1) int i2, @Nullable MediaLibraryService.LibraryParams libraryParams) {
        verifyApplicationThread();
        Assertions.checkNotEmpty(str, "parentId must not be empty");
        Assertions.checkArgument(i >= 0, "page must not be negative");
        Assertions.checkArgument(i2 >= 1, "pageSize must not be less than 1");
        return isConnected() ? ((MediaBrowserImpl) Assertions.checkNotNull(this.impl)).getChildren(str, i, i2, libraryParams) : createDisconnectedFuture();
    }

    public com.google.common.util.concurrent.u<LibraryResult<MediaItem>> getItem(String str) {
        verifyApplicationThread();
        Assertions.checkNotEmpty(str, "mediaId must not be empty");
        return isConnected() ? ((MediaBrowserImpl) Assertions.checkNotNull(this.impl)).getItem(str) : createDisconnectedFuture();
    }

    public com.google.common.util.concurrent.u<LibraryResult<MediaItem>> getLibraryRoot(@Nullable MediaLibraryService.LibraryParams libraryParams) {
        verifyApplicationThread();
        return isConnected() ? ((MediaBrowserImpl) Assertions.checkNotNull(this.impl)).getLibraryRoot(libraryParams) : createDisconnectedFuture();
    }

    public com.google.common.util.concurrent.u<LibraryResult<com.google.common.collect.G<MediaItem>>> getSearchResult(String str, @IntRange(from = 0) int i, @IntRange(from = 1) int i2, @Nullable MediaLibraryService.LibraryParams libraryParams) {
        verifyApplicationThread();
        Assertions.checkNotEmpty(str, "query must not be empty");
        Assertions.checkArgument(i >= 0, "page must not be negative");
        Assertions.checkArgument(i2 >= 1, "pageSize must not be less than 1");
        return isConnected() ? ((MediaBrowserImpl) Assertions.checkNotNull(this.impl)).getSearchResult(str, i, i2, libraryParams) : createDisconnectedFuture();
    }

    public void notifyBrowserListener(Consumer<Listener> consumer) {
        Listener listener = (Listener) this.listener;
        if (listener != null) {
            Util.postOrRun(this.applicationHandler, new androidx.browser.trusted.h(1, consumer, listener));
        }
    }

    public com.google.common.util.concurrent.u<LibraryResult<Void>> search(String str, @Nullable MediaLibraryService.LibraryParams libraryParams) {
        verifyApplicationThread();
        Assertions.checkNotEmpty(str, "query must not be empty");
        return isConnected() ? ((MediaBrowserImpl) Assertions.checkNotNull(this.impl)).search(str, libraryParams) : createDisconnectedFuture();
    }

    public com.google.common.util.concurrent.u<LibraryResult<Void>> subscribe(String str, @Nullable MediaLibraryService.LibraryParams libraryParams) {
        verifyApplicationThread();
        Assertions.checkNotEmpty(str, "parentId must not be empty");
        return isConnected() ? ((MediaBrowserImpl) Assertions.checkNotNull(this.impl)).subscribe(str, libraryParams) : createDisconnectedFuture();
    }

    public com.google.common.util.concurrent.u<LibraryResult<Void>> unsubscribe(String str) {
        verifyApplicationThread();
        Assertions.checkNotEmpty(str, "parentId must not be empty");
        return isConnected() ? ((MediaBrowserImpl) Assertions.checkNotNull(this.impl)).unsubscribe(str) : createDisconnectedFuture();
    }

    @Override // androidx.media3.session.MediaController
    public MediaBrowserImpl createImpl(Context context, SessionToken sessionToken, Bundle bundle, Looper looper, @Nullable androidx.media3.common.util.BitmapLoader bitmapLoader, long j) {
        MediaBrowserImpl mediaBrowserImplLegacy = sessionToken.isLegacySession() ? new MediaBrowserImplLegacy(context, this, sessionToken, bundle, looper, (androidx.media3.common.util.BitmapLoader) Assertions.checkNotNull(bitmapLoader), j) : new MediaBrowserImplBase(context, this, sessionToken, bundle, looper);
        this.impl = mediaBrowserImplLegacy;
        return mediaBrowserImplLegacy;
    }
}
