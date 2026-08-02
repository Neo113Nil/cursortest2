package androidx.core.app;

/* loaded from: classes7.dex */
public class NotificationChannelCompat {
    public static final java.lang.String DEFAULT_CHANNEL_ID = "miscellaneous";
    java.lang.String Camera2StreamConfigurationMap;
    java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    java.lang.String getHighSpeedVideoFpsRanges;
    final java.lang.String getHighSpeedVideoFpsRangesFor;
    android.media.AudioAttributes getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.CharSequence getInputFormats;
    boolean getInputSizeshNQ4ISI;
    java.lang.String getOutputFormats;
    int getOutputMinFrameDuration;
    android.net.Uri getOutputMinFrameDurationlomOqCM;
    long[] getOutputSizes;
    boolean getOutputSizeshNQ4ISI;
    private boolean getOutputStallDuration;
    boolean getOutputStallDurationlomOqCM;
    private int isOutputSupportedFor;
    private boolean isOutputSupportedForhNQ4ISI;
    private boolean toString;

    public static class Builder {
        private final androidx.core.app.NotificationChannelCompat getHighResolutionOutputSizeshNQ4ISI;

        public Builder(java.lang.String str, int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.core.app.NotificationChannelCompat(str, i);
        }

        public androidx.core.app.NotificationChannelCompat.Builder setName(java.lang.CharSequence charSequence) {
            this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats = charSequence;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setImportance(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration = i;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setDescription(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap = str;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setGroup(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges = str;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setShowBadge(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizeshNQ4ISI = z;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setSound(android.net.Uri uri, android.media.AudioAttributes audioAttributes) {
            this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDurationlomOqCM = uri;
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes = audioAttributes;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setLightsEnabled(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI = z;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setLightColor(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor = i;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setVibrationEnabled(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI.getOutputStallDurationlomOqCM = z;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setVibrationPattern(long[] jArr) {
            this.getHighResolutionOutputSizeshNQ4ISI.getOutputStallDurationlomOqCM = jArr != null && jArr.length > 0;
            this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizes = jArr;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setConversationId(java.lang.String str, java.lang.String str2) {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats = str;
                this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI = str2;
            }
            return this;
        }

        public androidx.core.app.NotificationChannelCompat build() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    NotificationChannelCompat(java.lang.String str, int i) {
        this.getOutputSizeshNQ4ISI = true;
        this.getOutputMinFrameDurationlomOqCM = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;
        this.getHighSpeedVideoSizesFor = 0;
        this.getHighSpeedVideoFpsRangesFor = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str);
        this.getOutputMinFrameDuration = i;
        this.getHighSpeedVideoSizes = android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    NotificationChannelCompat(android.app.NotificationChannel notificationChannel) {
        this(androidx.core.app.NotificationChannelCompat.Api26Impl.getInputFormats(notificationChannel), androidx.core.app.NotificationChannelCompat.Api26Impl.getHighSpeedVideoSizesFor(notificationChannel));
        this.getInputFormats = androidx.core.app.NotificationChannelCompat.Api26Impl.getOutputFormats(notificationChannel);
        this.Camera2StreamConfigurationMap = androidx.core.app.NotificationChannelCompat.Api26Impl.getHighSpeedVideoSizes(notificationChannel);
        this.getHighSpeedVideoFpsRanges = androidx.core.app.NotificationChannelCompat.Api26Impl.Camera2StreamConfigurationMap(notificationChannel);
        this.getOutputSizeshNQ4ISI = androidx.core.app.NotificationChannelCompat.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(notificationChannel);
        this.getOutputMinFrameDurationlomOqCM = androidx.core.app.NotificationChannelCompat.Api26Impl.getOutputSizeshNQ4ISI(notificationChannel);
        this.getHighSpeedVideoSizes = androidx.core.app.NotificationChannelCompat.Api26Impl.getHighSpeedVideoFpsRanges(notificationChannel);
        this.getInputSizeshNQ4ISI = androidx.core.app.NotificationChannelCompat.Api26Impl.getOutputStallDuration(notificationChannel);
        this.getHighSpeedVideoSizesFor = androidx.core.app.NotificationChannelCompat.Api26Impl.getOutputMinFrameDuration(notificationChannel);
        this.getOutputStallDurationlomOqCM = androidx.core.app.NotificationChannelCompat.Api26Impl.getOutputSizes(notificationChannel);
        this.getOutputSizes = androidx.core.app.NotificationChannelCompat.Api26Impl.getOutputStallDurationlomOqCM(notificationChannel);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.getOutputFormats = androidx.core.app.NotificationChannelCompat.Api30Impl.getHighResolutionOutputSizeshNQ4ISI(notificationChannel);
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.core.app.NotificationChannelCompat.Api30Impl.getHighSpeedVideoSizes(notificationChannel);
        }
        this.getOutputStallDuration = androidx.core.app.NotificationChannelCompat.Api26Impl.getHighSpeedVideoFpsRangesFor(notificationChannel);
        this.isOutputSupportedFor = androidx.core.app.NotificationChannelCompat.Api26Impl.getInputSizeshNQ4ISI(notificationChannel);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.isOutputSupportedForhNQ4ISI = androidx.core.app.NotificationChannelCompat.Api29Impl.getHighResolutionOutputSizeshNQ4ISI(notificationChannel);
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.toString = androidx.core.app.NotificationChannelCompat.Api30Impl.getHighSpeedVideoFpsRangesFor(notificationChannel);
        }
    }

    android.app.NotificationChannel getHighSpeedVideoFpsRangesFor() {
        java.lang.String str;
        java.lang.String str2;
        android.app.NotificationChannel highSpeedVideoSizes = androidx.core.app.NotificationChannelCompat.Api26Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, this.getOutputMinFrameDuration);
        androidx.core.app.NotificationChannelCompat.Api26Impl.Camera2StreamConfigurationMap(highSpeedVideoSizes, this.Camera2StreamConfigurationMap);
        androidx.core.app.NotificationChannelCompat.Api26Impl.getHighSpeedVideoSizes(highSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
        androidx.core.app.NotificationChannelCompat.Api26Impl.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes, this.getOutputSizeshNQ4ISI);
        androidx.core.app.NotificationChannelCompat.Api26Impl.Camera2StreamConfigurationMap(highSpeedVideoSizes, this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoSizes);
        androidx.core.app.NotificationChannelCompat.Api26Impl.getHighSpeedVideoFpsRanges(highSpeedVideoSizes, this.getInputSizeshNQ4ISI);
        androidx.core.app.NotificationChannelCompat.Api26Impl.getHighSpeedVideoFpsRanges(highSpeedVideoSizes, this.getHighSpeedVideoSizesFor);
        androidx.core.app.NotificationChannelCompat.Api26Impl.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes, this.getOutputSizes);
        androidx.core.app.NotificationChannelCompat.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes, this.getOutputStallDurationlomOqCM);
        if (android.os.Build.VERSION.SDK_INT >= 30 && (str = this.getOutputFormats) != null && (str2 = this.getHighResolutionOutputSizeshNQ4ISI) != null) {
            androidx.core.app.NotificationChannelCompat.Api30Impl.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes, str, str2);
        }
        return highSpeedVideoSizes;
    }

    public androidx.core.app.NotificationChannelCompat.Builder toBuilder() {
        return new androidx.core.app.NotificationChannelCompat.Builder(this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration).setName(this.getInputFormats).setDescription(this.Camera2StreamConfigurationMap).setGroup(this.getHighSpeedVideoFpsRanges).setShowBadge(this.getOutputSizeshNQ4ISI).setSound(this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoSizes).setLightsEnabled(this.getInputSizeshNQ4ISI).setLightColor(this.getHighSpeedVideoSizesFor).setVibrationEnabled(this.getOutputStallDurationlomOqCM).setVibrationPattern(this.getOutputSizes).setConversationId(this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public java.lang.String getId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.CharSequence getName() {
        return this.getInputFormats;
    }

    public java.lang.String getDescription() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getImportance() {
        return this.getOutputMinFrameDuration;
    }

    public android.net.Uri getSound() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public android.media.AudioAttributes getAudioAttributes() {
        return this.getHighSpeedVideoSizes;
    }

    public boolean shouldShowLights() {
        return this.getInputSizeshNQ4ISI;
    }

    public int getLightColor() {
        return this.getHighSpeedVideoSizesFor;
    }

    public boolean shouldVibrate() {
        return this.getOutputStallDurationlomOqCM;
    }

    public long[] getVibrationPattern() {
        return this.getOutputSizes;
    }

    public boolean canShowBadge() {
        return this.getOutputSizeshNQ4ISI;
    }

    public java.lang.String getGroup() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.lang.String getParentChannelId() {
        return this.getOutputFormats;
    }

    public java.lang.String getConversationId() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean canBypassDnd() {
        return this.getOutputStallDuration;
    }

    public int getLockscreenVisibility() {
        return this.isOutputSupportedFor;
    }

    public boolean canBubble() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public boolean isImportantConversation() {
        return this.toString;
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static android.app.NotificationChannel getHighSpeedVideoSizes(java.lang.String str, java.lang.CharSequence charSequence, int i) {
            return new android.app.NotificationChannel(str, charSequence, i);
        }

        static java.lang.String getInputFormats(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        static int getHighSpeedVideoSizesFor(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        static java.lang.CharSequence getOutputFormats(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        static java.lang.String getHighSpeedVideoSizes(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        static void Camera2StreamConfigurationMap(android.app.NotificationChannel notificationChannel, java.lang.String str) {
            notificationChannel.setDescription(str);
        }

        static java.lang.String Camera2StreamConfigurationMap(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        static void getHighSpeedVideoSizes(android.app.NotificationChannel notificationChannel, java.lang.String str) {
            notificationChannel.setGroup(str);
        }

        static boolean getHighResolutionOutputSizeshNQ4ISI(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        static void getHighSpeedVideoFpsRangesFor(android.app.NotificationChannel notificationChannel, boolean z) {
            notificationChannel.setShowBadge(z);
        }

        static android.net.Uri getOutputSizeshNQ4ISI(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        static void Camera2StreamConfigurationMap(android.app.NotificationChannel notificationChannel, android.net.Uri uri, android.media.AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        static android.media.AudioAttributes getHighSpeedVideoFpsRanges(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        static boolean getOutputStallDuration(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        static void getHighSpeedVideoFpsRanges(android.app.NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableLights(z);
        }

        static int getOutputMinFrameDuration(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        static void getHighSpeedVideoFpsRanges(android.app.NotificationChannel notificationChannel, int i) {
            notificationChannel.setLightColor(i);
        }

        static boolean getOutputSizes(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.app.NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableVibration(z);
        }

        static long[] getOutputStallDurationlomOqCM(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        static void getHighSpeedVideoFpsRangesFor(android.app.NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        static boolean getHighSpeedVideoFpsRangesFor(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        static int getInputSizeshNQ4ISI(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static boolean getHighResolutionOutputSizeshNQ4ISI(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.canBubble();
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static java.lang.String getHighResolutionOutputSizeshNQ4ISI(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        static java.lang.String getHighSpeedVideoSizes(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getConversationId();
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.app.NotificationChannel notificationChannel, java.lang.String str, java.lang.String str2) {
            notificationChannel.setConversationId(str, str2);
        }

        static boolean getHighSpeedVideoFpsRangesFor(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.isImportantConversation();
        }
    }
}
