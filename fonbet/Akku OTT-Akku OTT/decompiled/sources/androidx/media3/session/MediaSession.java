package androidx.media3.session;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Rating;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSourceBitmapLoader;
import androidx.media3.session.MediaLibraryService;
import androidx.media3.session.MediaSession;
import androidx.media3.session.SessionCommands;
import androidx.media3.session.legacy.MediaSessionManager;
import com.google.common.collect.G;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public class MediaSession {
    private final MediaSessionImpl impl;
    private static final Object STATIC_LOCK = new Object();

    @GuardedBy("STATIC_LOCK")
    private static final HashMap<String, MediaSession> SESSION_ID_TO_SESSION_MAP = new HashMap<>();

    @RequiresApi(31)
    public static final class Api31 {
        private Api31() {
        }

        public static boolean isActivity(PendingIntent pendingIntent) {
            boolean isActivity;
            isActivity = pendingIntent.isActivity();
            return isActivity;
        }
    }

    public static final class Builder extends BuilderBase<MediaSession, Builder, Callback> {
        public Builder(Context context, Player player) {
            super(context, player, new Callback() { // from class: androidx.media3.session.MediaSession.Builder.1
            });
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public MediaSession build() {
            if (this.bitmapLoader == null) {
                this.bitmapLoader = new CacheBitmapLoader(new DataSourceBitmapLoader(this.context));
            }
            return new MediaSession(this.context, this.f54id, this.player, this.sessionActivity, this.customLayout, this.mediaButtonPreferences, this.commandButtonsForMediaItems, this.callback, this.tokenExtras, this.sessionExtras, (androidx.media3.common.util.BitmapLoader) Assertions.checkNotNull(this.bitmapLoader), this.playIfSuppressed, this.isPeriodicPositionUpdateEnabled, 0);
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

        @Override // androidx.media3.session.MediaSession.BuilderBase
        @UnstableApi
        public /* bridge */ /* synthetic */ Builder setMediaButtonPreferences(List list) {
            return setMediaButtonPreferences((List<CommandButton>) list);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.media3.session.MediaSession.BuilderBase
        @UnstableApi
        public Builder setBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
            return (Builder) super.setBitmapLoader(bitmapLoader);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.media3.session.MediaSession.BuilderBase
        public Builder setCallback(Callback callback) {
            return (Builder) super.setCallback((Builder) callback);
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

    public static abstract class BuilderBase<SessionT extends MediaSession, BuilderT extends BuilderBase<SessionT, BuilderT, CallbackT>, CallbackT extends Callback> {
        androidx.media3.common.util.BitmapLoader bitmapLoader;
        CallbackT callback;
        com.google.common.collect.G<CommandButton> commandButtonsForMediaItems;
        final Context context;
        com.google.common.collect.G<CommandButton> customLayout;

        /* renamed from: id, reason: collision with root package name */
        String f54id;
        boolean isPeriodicPositionUpdateEnabled;
        com.google.common.collect.G<CommandButton> mediaButtonPreferences;
        boolean playIfSuppressed;
        final Player player;

        @Nullable
        PendingIntent sessionActivity;
        Bundle sessionExtras;
        Bundle tokenExtras;

        public BuilderBase(Context context, Player player, CallbackT callbackt) {
            this.context = (Context) Assertions.checkNotNull(context);
            this.player = (Player) Assertions.checkNotNull(player);
            Assertions.checkArgument(player.canAdvertiseSession());
            this.f54id = "";
            this.callback = callbackt;
            this.tokenExtras = new Bundle();
            this.sessionExtras = new Bundle();
            G.b bVar = com.google.common.collect.G.b;
            com.google.common.collect.i0 i0Var = com.google.common.collect.i0.e;
            this.customLayout = i0Var;
            this.mediaButtonPreferences = i0Var;
            this.playIfSuppressed = true;
            this.isPeriodicPositionUpdateEnabled = true;
            this.commandButtonsForMediaItems = i0Var;
        }

        public abstract SessionT build();

        public BuilderT setBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
            this.bitmapLoader = (androidx.media3.common.util.BitmapLoader) Assertions.checkNotNull(bitmapLoader);
            return this;
        }

        public BuilderT setCallback(CallbackT callbackt) {
            this.callback = (CallbackT) Assertions.checkNotNull(callbackt);
            return this;
        }

        public BuilderT setCommandButtonsForMediaItems(List<CommandButton> list) {
            this.commandButtonsForMediaItems = com.google.common.collect.G.j(list);
            return this;
        }

        public BuilderT setCustomLayout(List<CommandButton> list) {
            this.customLayout = com.google.common.collect.G.j(list);
            return this;
        }

        public BuilderT setExtras(Bundle bundle) {
            this.tokenExtras = new Bundle((Bundle) Assertions.checkNotNull(bundle));
            return this;
        }

        public BuilderT setId(String str) {
            this.f54id = (String) Assertions.checkNotNull(str);
            return this;
        }

        public BuilderT setMediaButtonPreferences(List<CommandButton> list) {
            this.mediaButtonPreferences = com.google.common.collect.G.j(list);
            return this;
        }

        public BuilderT setPeriodicPositionUpdateEnabled(boolean z) {
            this.isPeriodicPositionUpdateEnabled = z;
            return this;
        }

        public BuilderT setSessionActivity(PendingIntent pendingIntent) {
            if (Build.VERSION.SDK_INT >= 31) {
                Assertions.checkArgument(Api31.isActivity(pendingIntent));
            }
            this.sessionActivity = (PendingIntent) Assertions.checkNotNull(pendingIntent);
            return this;
        }

        public BuilderT setSessionExtras(Bundle bundle) {
            this.sessionExtras = new Bundle((Bundle) Assertions.checkNotNull(bundle));
            return this;
        }

        public BuilderT setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
            this.playIfSuppressed = z;
            return this;
        }
    }

    public interface Callback {
        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ com.google.common.util.concurrent.u lambda$onSetMediaItems$0(int i, long j, List list) throws Exception {
            return com.google.common.util.concurrent.o.d(new MediaItemsWithStartPosition(list, i, j));
        }

        default com.google.common.util.concurrent.u<List<MediaItem>> onAddMediaItems(MediaSession mediaSession, ControllerInfo controllerInfo, List<MediaItem> list) {
            Iterator<MediaItem> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().localConfiguration == null) {
                    return com.google.common.util.concurrent.o.c(new UnsupportedOperationException());
                }
            }
            return com.google.common.util.concurrent.o.d(list);
        }

        default ConnectionResult onConnect(MediaSession mediaSession, ControllerInfo controllerInfo) {
            return new ConnectionResult.AcceptedResultBuilder(mediaSession).build();
        }

        default com.google.common.util.concurrent.u<SessionResult> onCustomCommand(MediaSession mediaSession, ControllerInfo controllerInfo, SessionCommand sessionCommand, Bundle bundle) {
            return com.google.common.util.concurrent.o.d(new SessionResult(-6));
        }

        default void onDisconnected(MediaSession mediaSession, ControllerInfo controllerInfo) {
        }

        @UnstableApi
        default boolean onMediaButtonEvent(MediaSession mediaSession, ControllerInfo controllerInfo, Intent intent) {
            return false;
        }

        @UnstableApi
        default com.google.common.util.concurrent.u<MediaItemsWithStartPosition> onPlaybackResumption(MediaSession mediaSession, ControllerInfo controllerInfo) {
            return com.google.common.util.concurrent.o.c(new UnsupportedOperationException());
        }

        @Deprecated
        default int onPlayerCommandRequest(MediaSession mediaSession, ControllerInfo controllerInfo, int i) {
            return 0;
        }

        @UnstableApi
        default void onPlayerInteractionFinished(MediaSession mediaSession, ControllerInfo controllerInfo, Player.Commands commands) {
        }

        default void onPostConnect(MediaSession mediaSession, ControllerInfo controllerInfo) {
        }

        @UnstableApi
        default com.google.common.util.concurrent.u<MediaItemsWithStartPosition> onSetMediaItems(MediaSession mediaSession, ControllerInfo controllerInfo, List<MediaItem> list, final int i, final long j) {
            return Util.transformFutureAsync(onAddMediaItems(mediaSession, controllerInfo, list), new com.google.common.util.concurrent.h() { // from class: androidx.media3.session.a3
                @Override // com.google.common.util.concurrent.h
                public final com.google.common.util.concurrent.u apply(Object obj) {
                    com.google.common.util.concurrent.u lambda$onSetMediaItems$0;
                    lambda$onSetMediaItems$0 = MediaSession.Callback.lambda$onSetMediaItems$0(i, j, (List) obj);
                    return lambda$onSetMediaItems$0;
                }
            });
        }

        default com.google.common.util.concurrent.u<SessionResult> onSetRating(MediaSession mediaSession, ControllerInfo controllerInfo, String str, Rating rating) {
            return com.google.common.util.concurrent.o.d(new SessionResult(-6));
        }

        default com.google.common.util.concurrent.u<SessionResult> onSetRating(MediaSession mediaSession, ControllerInfo controllerInfo, Rating rating) {
            return com.google.common.util.concurrent.o.d(new SessionResult(-6));
        }
    }

    public static final class ConnectionResult {
        public final Player.Commands availablePlayerCommands;
        public final SessionCommands availableSessionCommands;

        @Nullable
        @UnstableApi
        public final com.google.common.collect.G<CommandButton> customLayout;
        public final boolean isAccepted;

        @Nullable
        @UnstableApi
        public final com.google.common.collect.G<CommandButton> mediaButtonPreferences;

        @Nullable
        @UnstableApi
        public final PendingIntent sessionActivity;

        @Nullable
        @UnstableApi
        public final Bundle sessionExtras;

        @UnstableApi
        public static final SessionCommands DEFAULT_SESSION_COMMANDS = new SessionCommands.Builder().addAllSessionCommands().build();

        @UnstableApi
        public static final SessionCommands DEFAULT_SESSION_AND_LIBRARY_COMMANDS = new SessionCommands.Builder().addAllLibraryCommands().addAllSessionCommands().build();

        @UnstableApi
        public static final Player.Commands DEFAULT_PLAYER_COMMANDS = new Player.Commands.Builder().addAllCommands().build();

        @UnstableApi
        public static class AcceptedResultBuilder {
            private Player.Commands availablePlayerCommands = ConnectionResult.DEFAULT_PLAYER_COMMANDS;
            private SessionCommands availableSessionCommands;

            @Nullable
            private com.google.common.collect.G<CommandButton> customLayout;

            @Nullable
            private com.google.common.collect.G<CommandButton> mediaButtonPreferences;

            @Nullable
            private PendingIntent sessionActivity;

            @Nullable
            private Bundle sessionExtras;

            public AcceptedResultBuilder(MediaSession mediaSession) {
                this.availableSessionCommands = mediaSession instanceof MediaLibraryService.MediaLibrarySession ? ConnectionResult.DEFAULT_SESSION_AND_LIBRARY_COMMANDS : ConnectionResult.DEFAULT_SESSION_COMMANDS;
            }

            public ConnectionResult build() {
                return new ConnectionResult(true, this.availableSessionCommands, this.availablePlayerCommands, this.customLayout, this.mediaButtonPreferences, this.sessionExtras, this.sessionActivity);
            }

            public AcceptedResultBuilder setAvailablePlayerCommands(Player.Commands commands) {
                this.availablePlayerCommands = (Player.Commands) Assertions.checkNotNull(commands);
                return this;
            }

            public AcceptedResultBuilder setAvailableSessionCommands(SessionCommands sessionCommands) {
                this.availableSessionCommands = (SessionCommands) Assertions.checkNotNull(sessionCommands);
                return this;
            }

            public AcceptedResultBuilder setCustomLayout(@Nullable List<CommandButton> list) {
                this.customLayout = list == null ? null : com.google.common.collect.G.j(list);
                return this;
            }

            public AcceptedResultBuilder setMediaButtonPreferences(@Nullable List<CommandButton> list) {
                this.mediaButtonPreferences = list == null ? null : com.google.common.collect.G.j(list);
                return this;
            }

            public AcceptedResultBuilder setSessionActivity(@Nullable PendingIntent pendingIntent) {
                this.sessionActivity = pendingIntent;
                return this;
            }

            public AcceptedResultBuilder setSessionExtras(Bundle bundle) {
                this.sessionExtras = bundle;
                return this;
            }
        }

        public static ConnectionResult accept(SessionCommands sessionCommands, Player.Commands commands) {
            return new ConnectionResult(true, sessionCommands, commands, null, null, null, null);
        }

        public static ConnectionResult reject() {
            SessionCommands sessionCommands = SessionCommands.EMPTY;
            Player.Commands commands = Player.Commands.EMPTY;
            G.b bVar = com.google.common.collect.G.b;
            com.google.common.collect.i0 i0Var = com.google.common.collect.i0.e;
            return new ConnectionResult(false, sessionCommands, commands, i0Var, i0Var, Bundle.EMPTY, null);
        }

        private ConnectionResult(boolean z, SessionCommands sessionCommands, Player.Commands commands, @Nullable com.google.common.collect.G<CommandButton> g, @Nullable com.google.common.collect.G<CommandButton> g2, @Nullable Bundle bundle, @Nullable PendingIntent pendingIntent) {
            this.isAccepted = z;
            this.availableSessionCommands = sessionCommands;
            this.availablePlayerCommands = commands;
            this.customLayout = g;
            this.mediaButtonPreferences = g2;
            this.sessionExtras = bundle;
            this.sessionActivity = pendingIntent;
        }
    }

    public interface ControllerCb {
        default void onAudioAttributesChanged(int i, AudioAttributes audioAttributes) throws RemoteException {
        }

        default void onAvailableCommandsChangedFromPlayer(int i, Player.Commands commands) throws RemoteException {
        }

        default void onAvailableCommandsChangedFromSession(int i, SessionCommands sessionCommands, Player.Commands commands) throws RemoteException {
        }

        default void onChildrenChanged(int i, String str, int i2, @Nullable MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
        }

        default void onDeviceInfoChanged(int i, DeviceInfo deviceInfo) throws RemoteException {
        }

        default void onDeviceVolumeChanged(int i, int i2, boolean z) throws RemoteException {
        }

        default void onDisconnected(int i) {
        }

        default void onError(int i, SessionError sessionError) throws RemoteException {
        }

        default void onIsLoadingChanged(int i, boolean z) throws RemoteException {
        }

        default void onIsPlayingChanged(int i, boolean z) throws RemoteException {
        }

        default void onLibraryResult(int i, LibraryResult<?> libraryResult) throws RemoteException {
        }

        default void onMediaItemTransition(int i, @Nullable MediaItem mediaItem, int i2) throws RemoteException {
        }

        default void onMediaMetadataChanged(int i, MediaMetadata mediaMetadata) throws RemoteException {
        }

        default void onPeriodicSessionPositionInfoChanged(int i, SessionPositionInfo sessionPositionInfo, boolean z, boolean z2, int i2) throws RemoteException {
        }

        default void onPlayWhenReadyChanged(int i, boolean z, int i2) throws RemoteException {
        }

        default void onPlaybackParametersChanged(int i, PlaybackParameters playbackParameters) throws RemoteException {
        }

        default void onPlaybackStateChanged(int i, int i2, @Nullable PlaybackException playbackException) throws RemoteException {
        }

        default void onPlaybackSuppressionReasonChanged(int i, int i2) throws RemoteException {
        }

        default void onPlayerChanged(int i, @Nullable PlayerWrapper playerWrapper, PlayerWrapper playerWrapper2) throws RemoteException {
        }

        default void onPlayerError(int i, @Nullable PlaybackException playbackException) throws RemoteException {
        }

        default void onPlayerInfoChanged(int i, PlayerInfo playerInfo, Player.Commands commands, boolean z, boolean z2) throws RemoteException {
        }

        default void onPlaylistMetadataChanged(int i, MediaMetadata mediaMetadata) throws RemoteException {
        }

        default void onPositionDiscontinuity(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) throws RemoteException {
        }

        default void onRenderedFirstFrame(int i) throws RemoteException {
        }

        default void onRepeatModeChanged(int i, int i2) throws RemoteException {
        }

        default void onSearchResultChanged(int i, String str, int i2, @Nullable MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
        }

        default void onSeekBackIncrementChanged(int i, long j) throws RemoteException {
        }

        default void onSeekForwardIncrementChanged(int i, long j) throws RemoteException {
        }

        default void onSessionActivityChanged(int i, @Nullable PendingIntent pendingIntent) throws RemoteException {
        }

        default void onSessionExtrasChanged(int i, Bundle bundle) throws RemoteException {
        }

        default void onSessionResult(int i, SessionResult sessionResult) throws RemoteException {
        }

        default void onShuffleModeEnabledChanged(int i, boolean z) throws RemoteException {
        }

        default void onTimelineChanged(int i, Timeline timeline, int i2) throws RemoteException {
        }

        default void onTrackSelectionParametersChanged(int i, TrackSelectionParameters trackSelectionParameters) throws RemoteException {
        }

        default void onTracksChanged(int i, Tracks tracks) throws RemoteException {
        }

        default void onVideoSizeChanged(int i, VideoSize videoSize) throws RemoteException {
        }

        default void onVolumeChanged(int i, float f) throws RemoteException {
        }

        default void sendCustomCommand(int i, SessionCommand sessionCommand, Bundle bundle) throws RemoteException {
        }

        default void setCustomLayout(int i, List<CommandButton> list) throws RemoteException {
        }

        default void setMediaButtonPreferences(int i, List<CommandButton> list) throws RemoteException {
        }
    }

    public static final class ControllerInfo {

        @UnstableApi
        public static final int LEGACY_CONTROLLER_INTERFACE_VERSION = 0;
        public static final String LEGACY_CONTROLLER_PACKAGE_NAME = "android.media.session.MediaController";
        public static final int LEGACY_CONTROLLER_VERSION = 0;
        private final Bundle connectionHints;

        @Nullable
        private final ControllerCb controllerCb;
        private final int interfaceVersion;
        private final boolean isTrusted;
        private final int libraryVersion;
        private final int maxCommandsForMediaItems;
        private final MediaSessionManager.RemoteUserInfo remoteUserInfo;

        public ControllerInfo(MediaSessionManager.RemoteUserInfo remoteUserInfo, int i, int i2, boolean z, @Nullable ControllerCb controllerCb, Bundle bundle, int i3) {
            this.remoteUserInfo = remoteUserInfo;
            this.libraryVersion = i;
            this.interfaceVersion = i2;
            this.isTrusted = z;
            this.controllerCb = controllerCb;
            this.connectionHints = bundle;
            this.maxCommandsForMediaItems = i3;
        }

        public static ControllerInfo createLegacyControllerInfo() {
            return new ControllerInfo(new MediaSessionManager.RemoteUserInfo("android.media.session.MediaController", -1, -1), 0, 0, false, null, Bundle.EMPTY, 0);
        }

        @VisibleForTesting(otherwise = 2)
        public static ControllerInfo createTestOnlyControllerInfo(String str, int i, int i2, int i3, int i4, boolean z, Bundle bundle) {
            return new ControllerInfo(new MediaSessionManager.RemoteUserInfo(str, i, i2), i3, i4, z, null, bundle, 0);
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof ControllerInfo)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            ControllerInfo controllerInfo = (ControllerInfo) obj;
            ControllerCb controllerCb = this.controllerCb;
            return (controllerCb == null && controllerInfo.controllerCb == null) ? this.remoteUserInfo.equals(controllerInfo.remoteUserInfo) : Objects.equals(controllerCb, controllerInfo.controllerCb);
        }

        public Bundle getConnectionHints() {
            return new Bundle(this.connectionHints);
        }

        @Nullable
        public ControllerCb getControllerCb() {
            return this.controllerCb;
        }

        public int getControllerVersion() {
            return this.libraryVersion;
        }

        @UnstableApi
        public int getInterfaceVersion() {
            return this.interfaceVersion;
        }

        @UnstableApi
        public int getMaxCommandsForMediaItems() {
            return this.maxCommandsForMediaItems;
        }

        public String getPackageName() {
            return this.remoteUserInfo.getPackageName();
        }

        public MediaSessionManager.RemoteUserInfo getRemoteUserInfo() {
            return this.remoteUserInfo;
        }

        public int getUid() {
            return this.remoteUserInfo.getUid();
        }

        public int hashCode() {
            return Objects.hash(this.controllerCb, this.remoteUserInfo);
        }

        @UnstableApi
        public boolean isTrusted() {
            return this.isTrusted;
        }

        public String toString() {
            return "ControllerInfo {pkg=" + this.remoteUserInfo.getPackageName() + ", uid=" + this.remoteUserInfo.getUid() + "}";
        }
    }

    public interface Listener {
        void onNotificationRefreshRequired(MediaSession mediaSession);

        boolean onPlayRequested(MediaSession mediaSession);
    }

    @UnstableApi
    public static final class MediaItemsWithStartPosition {
        public final com.google.common.collect.G<MediaItem> mediaItems;
        public final int startIndex;
        public final long startPositionMs;

        public MediaItemsWithStartPosition(List<MediaItem> list, int i, long j) {
            this.mediaItems = com.google.common.collect.G.j(list);
            this.startIndex = i;
            this.startPositionMs = j;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaItemsWithStartPosition)) {
                return false;
            }
            MediaItemsWithStartPosition mediaItemsWithStartPosition = (MediaItemsWithStartPosition) obj;
            return this.mediaItems.equals(mediaItemsWithStartPosition.mediaItems) && this.startIndex == mediaItemsWithStartPosition.startIndex && this.startPositionMs == mediaItemsWithStartPosition.startPositionMs;
        }

        public int hashCode() {
            return com.google.common.primitives.e.b(this.startPositionMs) + (((this.mediaItems.hashCode() * 31) + this.startIndex) * 31);
        }
    }

    public MediaSession(Context context, String str, Player player, @Nullable PendingIntent pendingIntent, com.google.common.collect.G<CommandButton> g, com.google.common.collect.G<CommandButton> g2, com.google.common.collect.G<CommandButton> g3, Callback callback, Bundle bundle, Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z, boolean z2, int i) {
        synchronized (STATIC_LOCK) {
            HashMap<String, MediaSession> hashMap = SESSION_ID_TO_SESSION_MAP;
            if (hashMap.containsKey(str)) {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
            hashMap.put(str, this);
        }
        this.impl = createImpl(context, str, player, pendingIntent, g, g2, g3, callback, bundle, bundle2, bitmapLoader, z, z2, i);
    }

    @Nullable
    public static MediaSession getSession(Uri uri) {
        synchronized (STATIC_LOCK) {
            try {
                for (MediaSession mediaSession : SESSION_ID_TO_SESSION_MAP.values()) {
                    if (Objects.equals(mediaSession.getUri(), uri)) {
                        return mediaSession;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void broadcastCustomCommand(SessionCommand sessionCommand, Bundle bundle) {
        Assertions.checkNotNull(sessionCommand);
        Assertions.checkNotNull(bundle);
        Assertions.checkArgument(sessionCommand.commandCode == 0, "command must be a custom command");
        this.impl.broadcastCustomCommand(sessionCommand, bundle);
    }

    public final void clearListener() {
        this.impl.clearMediaSessionListener();
    }

    public MediaSessionImpl createImpl(Context context, String str, Player player, @Nullable PendingIntent pendingIntent, com.google.common.collect.G<CommandButton> g, com.google.common.collect.G<CommandButton> g2, com.google.common.collect.G<CommandButton> g3, Callback callback, Bundle bundle, Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z, boolean z2, int i) {
        return new MediaSessionImpl(this, context, str, player, pendingIntent, g, g2, g3, callback, bundle, bundle2, bitmapLoader, z, z2);
    }

    @UnstableApi
    public final androidx.media3.common.util.BitmapLoader getBitmapLoader() {
        return this.impl.getBitmapLoader();
    }

    public final List<ControllerInfo> getConnectedControllers() {
        return this.impl.getConnectedControllers();
    }

    @Nullable
    public final ControllerInfo getControllerForCurrentRequest() {
        return this.impl.getControllerForCurrentRequest();
    }

    @UnstableApi
    public com.google.common.collect.G<CommandButton> getCustomLayout() {
        return this.impl.getCustomLayout();
    }

    public final String getId() {
        return this.impl.getId();
    }

    public MediaSessionImpl getImpl() {
        return this.impl;
    }

    @Nullable
    public final IBinder getLegacyBrowserServiceBinder() {
        return this.impl.getLegacyBrowserServiceBinder();
    }

    @UnstableApi
    public com.google.common.collect.G<CommandButton> getMediaButtonPreferences() {
        return this.impl.getMediaButtonPreferences();
    }

    @Nullable
    @UnstableApi
    public ControllerInfo getMediaNotificationControllerInfo() {
        return this.impl.getMediaNotificationControllerInfo();
    }

    @UnstableApi
    public final MediaSession.Token getPlatformToken() {
        return this.impl.getPlatformToken();
    }

    public final Player getPlayer() {
        return this.impl.getPlayerWrapper().getWrappedPlayer();
    }

    @Nullable
    public final PendingIntent getSessionActivity() {
        return this.impl.getSessionActivity();
    }

    public Bundle getSessionExtras() {
        return this.impl.getSessionExtras();
    }

    @UnstableApi
    public final boolean getShowPlayButtonIfPlaybackIsSuppressed() {
        return this.impl.shouldPlayIfSuppressed();
    }

    public final SessionToken getToken() {
        return this.impl.getToken();
    }

    @VisibleForTesting
    public final Uri getUri() {
        return this.impl.getUri();
    }

    public final void handleControllerConnectionFromService(IMediaController iMediaController, ControllerInfo controllerInfo) {
        this.impl.connectFromService(iMediaController, controllerInfo);
    }

    @UnstableApi
    public final boolean isAutoCompanionController(ControllerInfo controllerInfo) {
        return this.impl.isAutoCompanionController(controllerInfo);
    }

    @UnstableApi
    public final boolean isAutomotiveController(ControllerInfo controllerInfo) {
        return this.impl.isAutomotiveController(controllerInfo);
    }

    @UnstableApi
    public boolean isMediaNotificationController(ControllerInfo controllerInfo) {
        return this.impl.isMediaNotificationController(controllerInfo);
    }

    public final boolean isReleased() {
        return this.impl.isReleased();
    }

    public final void release() {
        try {
            synchronized (STATIC_LOCK) {
                SESSION_ID_TO_SESSION_MAP.remove(this.impl.getId());
            }
            this.impl.release();
        } catch (Exception unused) {
        }
    }

    public final com.google.common.util.concurrent.u<SessionResult> sendCustomCommand(ControllerInfo controllerInfo, SessionCommand sessionCommand, Bundle bundle) {
        Assertions.checkNotNull(controllerInfo);
        Assertions.checkNotNull(sessionCommand);
        Assertions.checkNotNull(bundle);
        Assertions.checkArgument(sessionCommand.commandCode == 0, "command must be a custom command");
        return this.impl.sendCustomCommand(controllerInfo, sessionCommand, bundle);
    }

    @UnstableApi
    public final void sendError(ControllerInfo controllerInfo, SessionError sessionError) {
        this.impl.sendError(controllerInfo, sessionError);
    }

    public final void setAvailableCommands(ControllerInfo controllerInfo, SessionCommands sessionCommands, Player.Commands commands) {
        Assertions.checkNotNull(controllerInfo, "controller must not be null");
        Assertions.checkNotNull(sessionCommands, "sessionCommands must not be null");
        Assertions.checkNotNull(commands, "playerCommands must not be null");
        this.impl.setAvailableCommands(controllerInfo, sessionCommands, commands);
    }

    public final com.google.common.util.concurrent.u<SessionResult> setCustomLayout(ControllerInfo controllerInfo, List<CommandButton> list) {
        Assertions.checkNotNull(controllerInfo, "controller must not be null");
        Assertions.checkNotNull(list, "layout must not be null");
        return this.impl.setCustomLayout(controllerInfo, com.google.common.collect.G.j(list));
    }

    public final void setLegacyControllerConnectionTimeoutMs(long j) {
        this.impl.setLegacyControllerConnectionTimeoutMs(j);
    }

    public final void setListener(Listener listener) {
        this.impl.setMediaSessionListener(listener);
    }

    @UnstableApi
    public final com.google.common.util.concurrent.u<SessionResult> setMediaButtonPreferences(ControllerInfo controllerInfo, List<CommandButton> list) {
        Assertions.checkNotNull(controllerInfo, "controller must not be null");
        Assertions.checkNotNull(list, "media button preferences must not be null");
        return this.impl.setMediaButtonPreferences(controllerInfo, com.google.common.collect.G.j(list));
    }

    @UnstableApi
    public final void setPlaybackException(ControllerInfo controllerInfo, @Nullable PlaybackException playbackException) {
        this.impl.setPlaybackException(controllerInfo, playbackException);
    }

    public final void setPlayer(Player player) {
        Assertions.checkNotNull(player);
        Assertions.checkArgument(player.canAdvertiseSession());
        Assertions.checkArgument(player.getApplicationLooper() == getPlayer().getApplicationLooper());
        Assertions.checkState(player.getApplicationLooper() == Looper.myLooper());
        this.impl.setPlayer(player);
    }

    @UnstableApi
    public final void setSessionActivity(@Nullable PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 31 && pendingIntent != null) {
            Assertions.checkArgument(Api31.isActivity(pendingIntent));
        }
        this.impl.setSessionActivity(pendingIntent);
    }

    public final void setSessionExtras(Bundle bundle) {
        this.impl.setSessionExtras(new Bundle(bundle));
    }

    @VisibleForTesting
    public final void setSessionPositionUpdateDelayMs(long j) {
        this.impl.setSessionPositionUpdateDelayMsOnHandler(j);
    }

    @UnstableApi
    public final void sendError(SessionError sessionError) {
        this.impl.sendError(sessionError);
    }

    @UnstableApi
    public final void setPlaybackException(@Nullable PlaybackException playbackException) {
        this.impl.setPlaybackException(playbackException);
    }

    public final void setSessionExtras(ControllerInfo controllerInfo, Bundle bundle) {
        Assertions.checkNotNull(controllerInfo, "controller must not be null");
        this.impl.setSessionExtras(controllerInfo, new Bundle(bundle));
    }

    public final void setCustomLayout(List<CommandButton> list) {
        Assertions.checkNotNull(list, "layout must not be null");
        this.impl.setCustomLayout(com.google.common.collect.G.j(list));
    }

    @UnstableApi
    public final void setMediaButtonPreferences(List<CommandButton> list) {
        Assertions.checkNotNull(list, "media button preferences must not be null");
        this.impl.setMediaButtonPreferences(com.google.common.collect.G.j(list));
    }

    @UnstableApi
    public final void setSessionActivity(ControllerInfo controllerInfo, @Nullable PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 31 && pendingIntent != null) {
            Assertions.checkArgument(Api31.isActivity(pendingIntent));
        }
        this.impl.setSessionActivity(controllerInfo, pendingIntent);
    }
}
