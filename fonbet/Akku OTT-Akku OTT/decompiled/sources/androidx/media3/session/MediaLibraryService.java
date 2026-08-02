package androidx.media3.session;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSourceBitmapLoader;
import androidx.media3.session.MediaLibraryService;
import androidx.media3.session.MediaSession;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class MediaLibraryService extends MediaSessionService {
    public static final String SERVICE_INTERFACE = "androidx.media3.session.MediaLibraryService";

    public static final class LibraryParams {

        @UnstableApi
        public final Bundle extras;
        public final boolean isOffline;
        public final boolean isRecent;
        public final boolean isSuggested;
        private static final String FIELD_EXTRAS = Util.intToStringMaxRadix(0);
        private static final String FIELD_RECENT = Util.intToStringMaxRadix(1);
        private static final String FIELD_OFFLINE = Util.intToStringMaxRadix(2);
        private static final String FIELD_SUGGESTED = Util.intToStringMaxRadix(3);

        public static final class Builder {
            private Bundle extras = Bundle.EMPTY;
            private boolean offline;
            private boolean recent;
            private boolean suggested;

            public LibraryParams build() {
                return new LibraryParams(this.extras, this.recent, this.offline, this.suggested);
            }

            @UnstableApi
            public Builder setExtras(Bundle bundle) {
                this.extras = (Bundle) Assertions.checkNotNull(bundle);
                return this;
            }

            public Builder setOffline(boolean z) {
                this.offline = z;
                return this;
            }

            public Builder setRecent(boolean z) {
                this.recent = z;
                return this;
            }

            public Builder setSuggested(boolean z) {
                this.suggested = z;
                return this;
            }
        }

        @UnstableApi
        public static LibraryParams fromBundle(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(FIELD_EXTRAS);
            boolean z = bundle.getBoolean(FIELD_RECENT, false);
            boolean z2 = bundle.getBoolean(FIELD_OFFLINE, false);
            boolean z3 = bundle.getBoolean(FIELD_SUGGESTED, false);
            if (bundle2 == null) {
                bundle2 = Bundle.EMPTY;
            }
            return new LibraryParams(bundle2, z, z2, z3);
        }

        @UnstableApi
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(FIELD_EXTRAS, this.extras);
            bundle.putBoolean(FIELD_RECENT, this.isRecent);
            bundle.putBoolean(FIELD_OFFLINE, this.isOffline);
            bundle.putBoolean(FIELD_SUGGESTED, this.isSuggested);
            return bundle;
        }

        private LibraryParams(Bundle bundle, boolean z, boolean z2, boolean z3) {
            this.extras = new Bundle(bundle);
            this.isRecent = z;
            this.isOffline = z2;
            this.isSuggested = z3;
        }
    }

    public static final class MediaLibrarySession extends MediaSession {

        @UnstableApi
        public static final int LIBRARY_ERROR_REPLICATION_MODE_FATAL = 1;

        @UnstableApi
        public static final int LIBRARY_ERROR_REPLICATION_MODE_NONE = 0;

        @UnstableApi
        public static final int LIBRARY_ERROR_REPLICATION_MODE_NON_FATAL = 2;

        public static final class Builder extends MediaSession.BuilderBase<MediaLibrarySession, Builder, Callback> {
            private int libraryErrorReplicationMode;

            public Builder(MediaLibraryService mediaLibraryService, Player player, Callback callback) {
                this((Context) mediaLibraryService, player, callback);
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            @UnstableApi
            public /* bridge */ /* synthetic */ Builder setCommandButtonsForMediaItems(List list) {
                return setCommandButtonsForMediaItems((List<CommandButton>) list);
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            @UnstableApi
            public /* bridge */ /* synthetic */ Builder setCustomLayout(List list) {
                return setCustomLayout((List<CommandButton>) list);
            }

            @UnstableApi
            public Builder setLibraryErrorReplicationMode(int i) {
                this.libraryErrorReplicationMode = i;
                return this;
            }

            @Override // androidx.media3.session.MediaSession.BuilderBase
            @UnstableApi
            public /* bridge */ /* synthetic */ Builder setMediaButtonPreferences(List list) {
                return setMediaButtonPreferences((List<CommandButton>) list);
            }

            @UnstableApi
            public Builder(Context context, Player player, Callback callback) {
                super(context, player, callback);
                this.libraryErrorReplicationMode = 1;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media3.session.MediaSession.BuilderBase
            public MediaLibrarySession build() {
                if (this.bitmapLoader == null) {
                    this.bitmapLoader = new CacheBitmapLoader(new DataSourceBitmapLoader(this.context));
                }
                return new MediaLibrarySession(this.context, this.f54id, this.player, this.sessionActivity, this.customLayout, this.mediaButtonPreferences, this.commandButtonsForMediaItems, this.callback, this.tokenExtras, this.sessionExtras, (androidx.media3.common.util.BitmapLoader) Assertions.checkNotNull(this.bitmapLoader), this.playIfSuppressed, this.isPeriodicPositionUpdateEnabled, this.libraryErrorReplicationMode);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media3.session.MediaSession.BuilderBase
            @UnstableApi
            public Builder setBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
                return (Builder) super.setBitmapLoader(bitmapLoader);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media3.session.MediaSession.BuilderBase
            @UnstableApi
            public Builder setCommandButtonsForMediaItems(List<CommandButton> list) {
                return (Builder) super.setCommandButtonsForMediaItems(list);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media3.session.MediaSession.BuilderBase
            @UnstableApi
            public Builder setCustomLayout(List<CommandButton> list) {
                return (Builder) super.setCustomLayout(list);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media3.session.MediaSession.BuilderBase
            public Builder setExtras(Bundle bundle) {
                return (Builder) super.setExtras(bundle);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media3.session.MediaSession.BuilderBase
            public Builder setId(String str) {
                return (Builder) super.setId(str);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media3.session.MediaSession.BuilderBase
            @UnstableApi
            public Builder setMediaButtonPreferences(List<CommandButton> list) {
                return (Builder) super.setMediaButtonPreferences(list);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media3.session.MediaSession.BuilderBase
            @UnstableApi
            public Builder setPeriodicPositionUpdateEnabled(boolean z) {
                return (Builder) super.setPeriodicPositionUpdateEnabled(z);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media3.session.MediaSession.BuilderBase
            public Builder setSessionActivity(PendingIntent pendingIntent) {
                return (Builder) super.setSessionActivity(pendingIntent);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media3.session.MediaSession.BuilderBase
            @UnstableApi
            public Builder setSessionExtras(Bundle bundle) {
                return (Builder) super.setSessionExtras(bundle);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media3.session.MediaSession.BuilderBase
            @UnstableApi
            public Builder setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
                return (Builder) super.setShowPlayButtonIfPlaybackIsSuppressed(z);
            }
        }

        public interface Callback extends MediaSession.Callback {
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            static /* synthetic */ com.google.common.util.concurrent.u lambda$onSubscribe$0(MediaSession.ControllerInfo controllerInfo, MediaLibrarySession mediaLibrarySession, String str, LibraryParams libraryParams, LibraryResult libraryResult) throws Exception {
                V v;
                Boolean bool;
                if (libraryResult.resultCode == 0 && (v = libraryResult.value) != 0 && (bool = ((MediaItem) v).mediaMetadata.isBrowsable) != null && bool.booleanValue()) {
                    if (controllerInfo.getControllerVersion() != 0) {
                        mediaLibrarySession.notifyChildrenChanged(controllerInfo, str, Integer.MAX_VALUE, libraryParams);
                    }
                    return com.google.common.util.concurrent.o.d(LibraryResult.ofVoid());
                }
                int i = libraryResult.resultCode;
                if (i == 0) {
                    i = -3;
                }
                return com.google.common.util.concurrent.o.d(LibraryResult.ofError(i));
            }

            default com.google.common.util.concurrent.u<LibraryResult<com.google.common.collect.G<MediaItem>>> onGetChildren(MediaLibrarySession mediaLibrarySession, MediaSession.ControllerInfo controllerInfo, String str, @IntRange(from = 0) int i, @IntRange(from = 1) int i2, @Nullable LibraryParams libraryParams) {
                return com.google.common.util.concurrent.o.d(LibraryResult.ofError(-6));
            }

            default com.google.common.util.concurrent.u<LibraryResult<MediaItem>> onGetItem(MediaLibrarySession mediaLibrarySession, MediaSession.ControllerInfo controllerInfo, String str) {
                return com.google.common.util.concurrent.o.d(LibraryResult.ofError(-6));
            }

            default com.google.common.util.concurrent.u<LibraryResult<MediaItem>> onGetLibraryRoot(MediaLibrarySession mediaLibrarySession, MediaSession.ControllerInfo controllerInfo, @Nullable LibraryParams libraryParams) {
                return com.google.common.util.concurrent.o.d(LibraryResult.ofError(-6));
            }

            default com.google.common.util.concurrent.u<LibraryResult<com.google.common.collect.G<MediaItem>>> onGetSearchResult(MediaLibrarySession mediaLibrarySession, MediaSession.ControllerInfo controllerInfo, String str, @IntRange(from = 0) int i, @IntRange(from = 1) int i2, @Nullable LibraryParams libraryParams) {
                return com.google.common.util.concurrent.o.d(LibraryResult.ofError(-6));
            }

            default com.google.common.util.concurrent.u<LibraryResult<Void>> onSearch(MediaLibrarySession mediaLibrarySession, MediaSession.ControllerInfo controllerInfo, String str, @Nullable LibraryParams libraryParams) {
                return com.google.common.util.concurrent.o.d(LibraryResult.ofError(-6));
            }

            default com.google.common.util.concurrent.u<LibraryResult<Void>> onSubscribe(final MediaLibrarySession mediaLibrarySession, final MediaSession.ControllerInfo controllerInfo, final String str, @Nullable final LibraryParams libraryParams) {
                return Util.transformFutureAsync(onGetItem(mediaLibrarySession, controllerInfo, str), new com.google.common.util.concurrent.h() { // from class: androidx.media3.session.s2
                    @Override // com.google.common.util.concurrent.h
                    public final com.google.common.util.concurrent.u apply(Object obj) {
                        com.google.common.util.concurrent.u lambda$onSubscribe$0;
                        lambda$onSubscribe$0 = MediaLibraryService.MediaLibrarySession.Callback.lambda$onSubscribe$0(controllerInfo, mediaLibrarySession, str, libraryParams, (LibraryResult) obj);
                        return lambda$onSubscribe$0;
                    }
                });
            }

            default com.google.common.util.concurrent.u<LibraryResult<Void>> onUnsubscribe(MediaLibrarySession mediaLibrarySession, MediaSession.ControllerInfo controllerInfo, String str) {
                return com.google.common.util.concurrent.o.d(LibraryResult.ofVoid());
            }
        }

        public MediaLibrarySession(Context context, String str, Player player, @Nullable PendingIntent pendingIntent, com.google.common.collect.G<CommandButton> g, com.google.common.collect.G<CommandButton> g2, com.google.common.collect.G<CommandButton> g3, MediaSession.Callback callback, Bundle bundle, Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z, boolean z2, int i) {
            super(context, str, player, pendingIntent, g, g2, g3, callback, bundle, bundle2, bitmapLoader, z, z2, i);
        }

        @UnstableApi
        public void clearReplicatedLibraryError() {
            getImpl().clearReplicatedLibraryError();
        }

        @Override // androidx.media3.session.MediaSession
        public /* bridge */ /* synthetic */ MediaSessionImpl createImpl(Context context, String str, Player player, @Nullable PendingIntent pendingIntent, com.google.common.collect.G g, com.google.common.collect.G g2, com.google.common.collect.G g3, MediaSession.Callback callback, Bundle bundle, Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z, boolean z2, int i) {
            return createImpl(context, str, player, pendingIntent, (com.google.common.collect.G<CommandButton>) g, (com.google.common.collect.G<CommandButton>) g2, (com.google.common.collect.G<CommandButton>) g3, callback, bundle, bundle2, bitmapLoader, z, z2, i);
        }

        @UnstableApi
        public com.google.common.collect.G<MediaSession.ControllerInfo> getSubscribedControllers(String str) {
            return getImpl().getSubscribedControllers(str);
        }

        public void notifyChildrenChanged(MediaSession.ControllerInfo controllerInfo, String str, @IntRange(from = 0) int i, @Nullable LibraryParams libraryParams) {
            Assertions.checkArgument(i >= 0);
            getImpl().notifyChildrenChanged((MediaSession.ControllerInfo) Assertions.checkNotNull(controllerInfo), Assertions.checkNotEmpty(str), i, libraryParams);
        }

        public void notifySearchResultChanged(MediaSession.ControllerInfo controllerInfo, String str, @IntRange(from = 0) int i, @Nullable LibraryParams libraryParams) {
            Assertions.checkArgument(i >= 0);
            getImpl().notifySearchResultChanged((MediaSession.ControllerInfo) Assertions.checkNotNull(controllerInfo), Assertions.checkNotEmpty(str), i, libraryParams);
        }

        @Override // androidx.media3.session.MediaSession
        public MediaLibrarySessionImpl createImpl(Context context, String str, Player player, @Nullable PendingIntent pendingIntent, com.google.common.collect.G<CommandButton> g, com.google.common.collect.G<CommandButton> g2, com.google.common.collect.G<CommandButton> g3, MediaSession.Callback callback, Bundle bundle, Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z, boolean z2, int i) {
            return new MediaLibrarySessionImpl(this, context, str, player, pendingIntent, g, g2, g3, (Callback) callback, bundle, bundle2, bitmapLoader, z, z2, i);
        }

        @Override // androidx.media3.session.MediaSession
        public MediaLibrarySessionImpl getImpl() {
            return (MediaLibrarySessionImpl) super.getImpl();
        }

        public void notifyChildrenChanged(String str, @IntRange(from = 0) int i, @Nullable LibraryParams libraryParams) {
            Assertions.checkArgument(i >= 0);
            getImpl().notifyChildrenChanged(Assertions.checkNotEmpty(str), i, libraryParams);
        }
    }

    @Override // androidx.media3.session.MediaSessionService, android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        if (intent == null) {
            return null;
        }
        return SERVICE_INTERFACE.equals(intent.getAction()) ? getServiceBinder() : super.onBind(intent);
    }

    @Override // androidx.media3.session.MediaSessionService
    @Nullable
    public abstract MediaLibrarySession onGetSession(MediaSession.ControllerInfo controllerInfo);
}
