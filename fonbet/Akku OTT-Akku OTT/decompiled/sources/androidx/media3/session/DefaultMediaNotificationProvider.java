package androidx.media3.session;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Player;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.session.CommandButton;
import androidx.media3.session.DefaultMediaNotificationProvider;
import androidx.media3.session.MediaNotification;
import androidx.media3.session.MediaStyleNotificationHelper;
import com.google.common.collect.G;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

@UnstableApi
/* loaded from: classes3.dex */
public class DefaultMediaNotificationProvider implements MediaNotification.Provider {
    public static final String COMMAND_KEY_COMPACT_VIEW_INDEX = "androidx.media3.session.command.COMPACT_VIEW_INDEX";
    public static final String DEFAULT_CHANNEL_ID = "default_channel_id";

    @StringRes
    public static final int DEFAULT_CHANNEL_NAME_RESOURCE_ID = R.string.default_notification_channel_name;
    public static final int DEFAULT_NOTIFICATION_ID = 1001;
    public static final String GROUP_KEY = "media3_group_key";
    private static final String TAG = "NotificationProvider";
    private final String channelId;

    @StringRes
    private final int channelNameResourceId;
    private final Context context;
    private final NotificationIdProvider notificationIdProvider;
    private final NotificationManager notificationManager;
    private OnBitmapLoadedFutureCallback pendingOnBitmapLoadedFutureCallback;

    @DrawableRes
    private int smallIconResourceId;

    @RequiresApi(26)
    public static class Api26 {
        private Api26() {
        }

        public static void createNotificationChannel(NotificationManager notificationManager, String str, String str2) {
            NotificationChannel b = androidx.browser.trusted.c.b(str, str2);
            if (Build.VERSION.SDK_INT <= 27) {
                b.setShowBadge(false);
            }
            notificationManager.createNotificationChannel(b);
        }
    }

    @RequiresApi(31)
    public static class Api31 {
        private Api31() {
        }

        public static void setForegroundServiceBehavior(NotificationCompat.Builder builder) {
            builder.setForegroundServiceBehavior(1);
        }
    }

    public static final class Builder {
        private boolean built;
        private final Context context;
        private NotificationIdProvider notificationIdProvider = new K4();
        private String channelId = DefaultMediaNotificationProvider.DEFAULT_CHANNEL_ID;

        @StringRes
        private int channelNameResourceId = DefaultMediaNotificationProvider.DEFAULT_CHANNEL_NAME_RESOURCE_ID;

        public Builder(Context context) {
            this.context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$new$0(MediaSession mediaSession) {
            return 1001;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$setNotificationId$1(int i, MediaSession mediaSession) {
            return i;
        }

        public DefaultMediaNotificationProvider build() {
            Assertions.checkState(!this.built);
            DefaultMediaNotificationProvider defaultMediaNotificationProvider = new DefaultMediaNotificationProvider(this);
            this.built = true;
            return defaultMediaNotificationProvider;
        }

        public Builder setChannelId(String str) {
            this.channelId = str;
            return this;
        }

        public Builder setChannelName(@StringRes int i) {
            this.channelNameResourceId = i;
            return this;
        }

        public Builder setNotificationId(final int i) {
            this.notificationIdProvider = new NotificationIdProvider() { // from class: androidx.media3.session.k
                @Override // androidx.media3.session.DefaultMediaNotificationProvider.NotificationIdProvider
                public final int getNotificationId(MediaSession mediaSession) {
                    int lambda$setNotificationId$1;
                    lambda$setNotificationId$1 = DefaultMediaNotificationProvider.Builder.lambda$setNotificationId$1(i, mediaSession);
                    return lambda$setNotificationId$1;
                }
            };
            return this;
        }

        public Builder setNotificationIdProvider(NotificationIdProvider notificationIdProvider) {
            this.notificationIdProvider = notificationIdProvider;
            return this;
        }
    }

    public interface NotificationIdProvider {
        int getNotificationId(MediaSession mediaSession);
    }

    public static class OnBitmapLoadedFutureCallback implements com.google.common.util.concurrent.n<Bitmap> {
        private final NotificationCompat.Builder builder;
        private boolean discarded;
        private final int notificationId;
        private final MediaNotification.Provider.Callback onNotificationChangedCallback;

        public OnBitmapLoadedFutureCallback(int i, NotificationCompat.Builder builder, MediaNotification.Provider.Callback callback) {
            this.notificationId = i;
            this.builder = builder;
            this.onNotificationChangedCallback = callback;
        }

        public void discardIfPending() {
            this.discarded = true;
        }

        @Override // com.google.common.util.concurrent.n
        public void onFailure(Throwable th) {
            if (this.discarded) {
                return;
            }
            Log.w(DefaultMediaNotificationProvider.TAG, DefaultMediaNotificationProvider.getBitmapLoadErrorMessage(th));
        }

        @Override // com.google.common.util.concurrent.n
        public void onSuccess(Bitmap bitmap) {
            if (this.discarded) {
                return;
            }
            this.builder.setLargeIcon(bitmap);
            this.onNotificationChangedCallback.onNotificationChanged(new MediaNotification(this.notificationId, this.builder.build()));
        }
    }

    private void ensureNotificationChannel() {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationChannel = this.notificationManager.getNotificationChannel(this.channelId);
            if (notificationChannel != null) {
                return;
            }
            Api26.createNotificationChannel(this.notificationManager, this.channelId, this.context.getString(this.channelNameResourceId));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getBitmapLoadErrorMessage(Throwable th) {
        return "Failed to load bitmap: " + th.getMessage();
    }

    private static long getPlaybackStartTimeEpochMs(Player player) {
        if (!player.isPlaying() || player.isPlayingAd() || player.isCurrentMediaItemDynamic() || player.getPlaybackParameters().speed != 1.0f) {
            return -9223372036854775807L;
        }
        return System.currentTimeMillis() - player.getContentPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(MediaSession mediaSession) {
        return 1001;
    }

    public int[] addNotificationActions(MediaSession mediaSession, com.google.common.collect.G<CommandButton> g, NotificationCompat.Builder builder, MediaNotification.ActionFactory actionFactory) {
        int[] iArr = new int[3];
        int[] iArr2 = new int[3];
        Arrays.fill(iArr, -1);
        Arrays.fill(iArr2, -1);
        boolean z = false;
        for (int i = 0; i < g.size(); i++) {
            CommandButton commandButton = g.get(i);
            if (commandButton.sessionCommand != null) {
                builder.addAction(actionFactory.createCustomActionFromCustomCommandButton(mediaSession, commandButton));
            } else {
                Assertions.checkState(commandButton.playerCommand != -1);
                builder.addAction(actionFactory.createMediaAction(mediaSession, IconCompat.createWithResource(this.context, commandButton.iconResId), commandButton.displayName, commandButton.playerCommand));
            }
            int i2 = commandButton.extras.getInt(COMMAND_KEY_COMPACT_VIEW_INDEX, -1);
            if (i2 >= 0 && i2 < 3) {
                iArr[i2] = i;
                z = true;
            } else if (commandButton.slots.a(0) == 2) {
                iArr2[0] = i;
            } else if (commandButton.slots.a(0) == 1) {
                iArr2[1] = i;
            } else if (commandButton.slots.a(0) == 3) {
                iArr2[2] = i;
            }
        }
        if (!z) {
            int i3 = 0;
            for (int i4 = 0; i4 < 3; i4++) {
                int i5 = iArr2[i4];
                if (i5 != -1) {
                    iArr[i3] = i5;
                    i3++;
                }
            }
        }
        for (int i6 = 0; i6 < 3; i6++) {
            if (iArr[i6] == -1) {
                return Arrays.copyOf(iArr, i6);
            }
        }
        return iArr;
    }

    @Override // androidx.media3.session.MediaNotification.Provider
    public final MediaNotification createNotification(MediaSession mediaSession, com.google.common.collect.G<CommandButton> g, MediaNotification.ActionFactory actionFactory, MediaNotification.Provider.Callback callback) {
        ensureNotificationChannel();
        G.a aVar = new G.a();
        for (int i = 0; i < g.size(); i++) {
            CommandButton commandButton = g.get(i);
            SessionCommand sessionCommand = commandButton.sessionCommand;
            if (sessionCommand != null && sessionCommand.commandCode == 0 && commandButton.isEnabled) {
                aVar.c(g.get(i));
            }
        }
        Player player = mediaSession.getPlayer();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this.context, this.channelId);
        int notificationId = this.notificationIdProvider.getNotificationId(mediaSession);
        MediaStyleNotificationHelper.MediaStyle mediaStyle = new MediaStyleNotificationHelper.MediaStyle(mediaSession);
        mediaStyle.setShowActionsInCompactView(addNotificationActions(mediaSession, getMediaButtons(mediaSession, player.getAvailableCommands(), aVar.g(), !Util.shouldShowPlayButton(player, mediaSession.getShowPlayButtonIfPlaybackIsSuppressed())), builder, actionFactory));
        if (player.isCommandAvailable(18)) {
            MediaMetadata mediaMetadata = player.getMediaMetadata();
            builder.setContentTitle(getNotificationContentTitle(mediaMetadata)).setContentText(getNotificationContentText(mediaMetadata));
            com.google.common.util.concurrent.u<Bitmap> loadBitmapFromMetadata = mediaSession.getBitmapLoader().loadBitmapFromMetadata(mediaMetadata);
            if (loadBitmapFromMetadata != null) {
                OnBitmapLoadedFutureCallback onBitmapLoadedFutureCallback = this.pendingOnBitmapLoadedFutureCallback;
                if (onBitmapLoadedFutureCallback != null) {
                    onBitmapLoadedFutureCallback.discardIfPending();
                }
                if (loadBitmapFromMetadata.isDone()) {
                    try {
                        builder.setLargeIcon((Bitmap) com.google.common.util.concurrent.o.b(loadBitmapFromMetadata));
                    } catch (CancellationException | ExecutionException e) {
                        Log.w(TAG, getBitmapLoadErrorMessage(e));
                    }
                } else {
                    OnBitmapLoadedFutureCallback onBitmapLoadedFutureCallback2 = new OnBitmapLoadedFutureCallback(notificationId, builder, callback);
                    this.pendingOnBitmapLoadedFutureCallback = onBitmapLoadedFutureCallback2;
                    Handler applicationHandler = mediaSession.getImpl().getApplicationHandler();
                    Objects.requireNonNull(applicationHandler);
                    com.google.common.util.concurrent.o.a(loadBitmapFromMetadata, onBitmapLoadedFutureCallback2, new androidx.browser.customtabs.f(applicationHandler));
                }
            }
        }
        long playbackStartTimeEpochMs = getPlaybackStartTimeEpochMs(player);
        boolean z = playbackStartTimeEpochMs != -9223372036854775807L;
        if (!z) {
            playbackStartTimeEpochMs = 0;
        }
        builder.setWhen(playbackStartTimeEpochMs).setShowWhen(z).setUsesChronometer(z);
        if (Build.VERSION.SDK_INT >= 31) {
            Api31.setForegroundServiceBehavior(builder);
        }
        return new MediaNotification(notificationId, builder.setContentIntent(mediaSession.getSessionActivity()).setDeleteIntent(actionFactory.createNotificationDismissalIntent(mediaSession)).setOnlyAlertOnce(true).setSmallIcon(this.smallIconResourceId).setStyle(mediaStyle).setVisibility(1).setOngoing(false).setGroup(GROUP_KEY).build());
    }

    public com.google.common.collect.G<CommandButton> getMediaButtons(MediaSession mediaSession, Player.Commands commands, com.google.common.collect.G<CommandButton> g, boolean z) {
        com.google.common.collect.G<CommandButton> customLayoutFromMediaButtonPreferences = CommandButton.getCustomLayoutFromMediaButtonPreferences(g, true, true);
        boolean containsButtonForSlot = CommandButton.containsButtonForSlot(customLayoutFromMediaButtonPreferences, 2);
        boolean containsButtonForSlot2 = CommandButton.containsButtonForSlot(customLayoutFromMediaButtonPreferences, 3);
        G.a aVar = new G.a();
        int i = 0;
        if (containsButtonForSlot) {
            aVar.c(customLayoutFromMediaButtonPreferences.get(0).copyWithSlots(com.google.common.primitives.b.b(2)));
            i = 1;
        } else if (commands.containsAny(7, 6)) {
            aVar.c(new CommandButton.Builder(CommandButton.ICON_PREVIOUS).setPlayerCommand(6).setDisplayName(this.context.getString(R.string.media3_controls_seek_to_previous_description)).build());
        }
        if (commands.contains(1)) {
            if (z) {
                aVar.c(new CommandButton.Builder(CommandButton.ICON_PAUSE).setPlayerCommand(1).setDisplayName(this.context.getString(R.string.media3_controls_pause_description)).build());
            } else {
                aVar.c(new CommandButton.Builder(CommandButton.ICON_PLAY).setPlayerCommand(1).setDisplayName(this.context.getString(R.string.media3_controls_play_description)).build());
            }
        }
        if (containsButtonForSlot2) {
            aVar.c(customLayoutFromMediaButtonPreferences.get(i).copyWithSlots(com.google.common.primitives.b.b(3)));
            i++;
        } else if (commands.containsAny(9, 8)) {
            aVar.c(new CommandButton.Builder(CommandButton.ICON_NEXT).setPlayerCommand(8).setDisplayName(this.context.getString(R.string.media3_controls_seek_to_next_description)).build());
        }
        while (i < customLayoutFromMediaButtonPreferences.size()) {
            aVar.c(customLayoutFromMediaButtonPreferences.get(i).copyWithSlots(com.google.common.primitives.b.b(6)));
            i++;
        }
        return aVar.g();
    }

    @Nullable
    public CharSequence getNotificationContentText(MediaMetadata mediaMetadata) {
        return mediaMetadata.artist;
    }

    @Nullable
    public CharSequence getNotificationContentTitle(MediaMetadata mediaMetadata) {
        return mediaMetadata.title;
    }

    @Override // androidx.media3.session.MediaNotification.Provider
    public final boolean handleCustomCommand(MediaSession mediaSession, String str, Bundle bundle) {
        return false;
    }

    public final void setSmallIcon(@DrawableRes int i) {
        this.smallIconResourceId = i;
    }

    public DefaultMediaNotificationProvider(Context context) {
        this(context, new C0510i(0), DEFAULT_CHANNEL_ID, DEFAULT_CHANNEL_NAME_RESOURCE_ID);
    }

    public DefaultMediaNotificationProvider(Context context, NotificationIdProvider notificationIdProvider, String str, int i) {
        this.context = context;
        this.notificationIdProvider = notificationIdProvider;
        this.channelId = str;
        this.channelNameResourceId = i;
        this.notificationManager = (NotificationManager) Assertions.checkStateNotNull((NotificationManager) context.getSystemService("notification"));
        this.smallIconResourceId = R.drawable.media3_notification_small_icon;
    }

    private DefaultMediaNotificationProvider(Builder builder) {
        this(builder.context, builder.notificationIdProvider, builder.channelId, builder.channelNameResourceId);
    }
}
