package androidx.core.app;

/* loaded from: classes.dex */
public class NotificationChannelCompat {
    public static final java.lang.String DEFAULT_CHANNEL_ID = "miscellaneous";
    private static final int DEFAULT_LIGHT_COLOR = 0;
    private static final boolean DEFAULT_SHOW_BADGE = true;
    android.media.AudioAttributes mAudioAttributes;
    private boolean mBypassDnd;
    private boolean mCanBubble;
    java.lang.String mConversationId;
    java.lang.String mDescription;
    java.lang.String mGroupId;
    final java.lang.String mId;
    int mImportance;
    private boolean mImportantConversation;
    int mLightColor;
    boolean mLights;
    private int mLockscreenVisibility;
    java.lang.CharSequence mName;
    java.lang.String mParentId;
    boolean mShowBadge;
    android.net.Uri mSound;
    boolean mVibrationEnabled;
    long[] mVibrationPattern;

    public static class Builder {
        private final androidx.core.app.NotificationChannelCompat mChannel;

        public Builder(java.lang.String str, int i) {
            this.mChannel = new androidx.core.app.NotificationChannelCompat(str, i);
        }

        public androidx.core.app.NotificationChannelCompat.Builder setName(java.lang.CharSequence charSequence) {
            this.mChannel.mName = charSequence;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setImportance(int i) {
            this.mChannel.mImportance = i;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setDescription(java.lang.String str) {
            this.mChannel.mDescription = str;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setGroup(java.lang.String str) {
            this.mChannel.mGroupId = str;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setShowBadge(boolean z) {
            this.mChannel.mShowBadge = z;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setSound(android.net.Uri uri, android.media.AudioAttributes audioAttributes) {
            this.mChannel.mSound = uri;
            this.mChannel.mAudioAttributes = audioAttributes;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setLightsEnabled(boolean z) {
            this.mChannel.mLights = z;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setLightColor(int i) {
            this.mChannel.mLightColor = i;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setVibrationEnabled(boolean z) {
            this.mChannel.mVibrationEnabled = z;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setVibrationPattern(long[] jArr) {
            this.mChannel.mVibrationEnabled = jArr != null && jArr.length > 0;
            this.mChannel.mVibrationPattern = jArr;
            return this;
        }

        public androidx.core.app.NotificationChannelCompat.Builder setConversationId(java.lang.String str, java.lang.String str2) {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                this.mChannel.mParentId = str;
                this.mChannel.mConversationId = str2;
            }
            return this;
        }

        public androidx.core.app.NotificationChannelCompat build() {
            return this.mChannel;
        }
    }

    NotificationChannelCompat(java.lang.String str, int i) {
        this.mShowBadge = true;
        this.mSound = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;
        this.mLightColor = 0;
        this.mId = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str);
        this.mImportance = i;
        this.mAudioAttributes = android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    NotificationChannelCompat(android.app.NotificationChannel notificationChannel) {
        this(androidx.core.app.NotificationChannelCompat.Api26Impl.getId(notificationChannel), androidx.core.app.NotificationChannelCompat.Api26Impl.getImportance(notificationChannel));
        this.mName = androidx.core.app.NotificationChannelCompat.Api26Impl.getName(notificationChannel);
        this.mDescription = androidx.core.app.NotificationChannelCompat.Api26Impl.getDescription(notificationChannel);
        this.mGroupId = androidx.core.app.NotificationChannelCompat.Api26Impl.getGroup(notificationChannel);
        this.mShowBadge = androidx.core.app.NotificationChannelCompat.Api26Impl.canShowBadge(notificationChannel);
        this.mSound = androidx.core.app.NotificationChannelCompat.Api26Impl.getSound(notificationChannel);
        this.mAudioAttributes = androidx.core.app.NotificationChannelCompat.Api26Impl.getAudioAttributes(notificationChannel);
        this.mLights = androidx.core.app.NotificationChannelCompat.Api26Impl.shouldShowLights(notificationChannel);
        this.mLightColor = androidx.core.app.NotificationChannelCompat.Api26Impl.getLightColor(notificationChannel);
        this.mVibrationEnabled = androidx.core.app.NotificationChannelCompat.Api26Impl.shouldVibrate(notificationChannel);
        this.mVibrationPattern = androidx.core.app.NotificationChannelCompat.Api26Impl.getVibrationPattern(notificationChannel);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.mParentId = androidx.core.app.NotificationChannelCompat.Api30Impl.getParentChannelId(notificationChannel);
            this.mConversationId = androidx.core.app.NotificationChannelCompat.Api30Impl.getConversationId(notificationChannel);
        }
        this.mBypassDnd = androidx.core.app.NotificationChannelCompat.Api26Impl.canBypassDnd(notificationChannel);
        this.mLockscreenVisibility = androidx.core.app.NotificationChannelCompat.Api26Impl.getLockscreenVisibility(notificationChannel);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.mCanBubble = androidx.core.app.NotificationChannelCompat.Api29Impl.canBubble(notificationChannel);
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.mImportantConversation = androidx.core.app.NotificationChannelCompat.Api30Impl.isImportantConversation(notificationChannel);
        }
    }

    android.app.NotificationChannel getNotificationChannel() {
        java.lang.String str;
        java.lang.String str2;
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return null;
        }
        android.app.NotificationChannel createNotificationChannel = androidx.core.app.NotificationChannelCompat.Api26Impl.createNotificationChannel(this.mId, this.mName, this.mImportance);
        androidx.core.app.NotificationChannelCompat.Api26Impl.setDescription(createNotificationChannel, this.mDescription);
        androidx.core.app.NotificationChannelCompat.Api26Impl.setGroup(createNotificationChannel, this.mGroupId);
        androidx.core.app.NotificationChannelCompat.Api26Impl.setShowBadge(createNotificationChannel, this.mShowBadge);
        androidx.core.app.NotificationChannelCompat.Api26Impl.setSound(createNotificationChannel, this.mSound, this.mAudioAttributes);
        androidx.core.app.NotificationChannelCompat.Api26Impl.enableLights(createNotificationChannel, this.mLights);
        androidx.core.app.NotificationChannelCompat.Api26Impl.setLightColor(createNotificationChannel, this.mLightColor);
        androidx.core.app.NotificationChannelCompat.Api26Impl.setVibrationPattern(createNotificationChannel, this.mVibrationPattern);
        androidx.core.app.NotificationChannelCompat.Api26Impl.enableVibration(createNotificationChannel, this.mVibrationEnabled);
        if (android.os.Build.VERSION.SDK_INT >= 30 && (str = this.mParentId) != null && (str2 = this.mConversationId) != null) {
            androidx.core.app.NotificationChannelCompat.Api30Impl.setConversationId(createNotificationChannel, str, str2);
        }
        return createNotificationChannel;
    }

    public androidx.core.app.NotificationChannelCompat.Builder toBuilder() {
        return new androidx.core.app.NotificationChannelCompat.Builder(this.mId, this.mImportance).setName(this.mName).setDescription(this.mDescription).setGroup(this.mGroupId).setShowBadge(this.mShowBadge).setSound(this.mSound, this.mAudioAttributes).setLightsEnabled(this.mLights).setLightColor(this.mLightColor).setVibrationEnabled(this.mVibrationEnabled).setVibrationPattern(this.mVibrationPattern).setConversationId(this.mParentId, this.mConversationId);
    }

    public java.lang.String getId() {
        return this.mId;
    }

    public java.lang.CharSequence getName() {
        return this.mName;
    }

    public java.lang.String getDescription() {
        return this.mDescription;
    }

    public int getImportance() {
        return this.mImportance;
    }

    public android.net.Uri getSound() {
        return this.mSound;
    }

    public android.media.AudioAttributes getAudioAttributes() {
        return this.mAudioAttributes;
    }

    public boolean shouldShowLights() {
        return this.mLights;
    }

    public int getLightColor() {
        return this.mLightColor;
    }

    public boolean shouldVibrate() {
        return this.mVibrationEnabled;
    }

    public long[] getVibrationPattern() {
        return this.mVibrationPattern;
    }

    public boolean canShowBadge() {
        return this.mShowBadge;
    }

    public java.lang.String getGroup() {
        return this.mGroupId;
    }

    public java.lang.String getParentChannelId() {
        return this.mParentId;
    }

    public java.lang.String getConversationId() {
        return this.mConversationId;
    }

    public boolean canBypassDnd() {
        return this.mBypassDnd;
    }

    public int getLockscreenVisibility() {
        return this.mLockscreenVisibility;
    }

    public boolean canBubble() {
        return this.mCanBubble;
    }

    public boolean isImportantConversation() {
        return this.mImportantConversation;
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static android.app.NotificationChannel createNotificationChannel(java.lang.String str, java.lang.CharSequence charSequence, int i) {
            return new android.app.NotificationChannel(str, charSequence, i);
        }

        static java.lang.String getId(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        static int getImportance(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        static java.lang.CharSequence getName(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        static java.lang.String getDescription(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        static void setDescription(android.app.NotificationChannel notificationChannel, java.lang.String str) {
            notificationChannel.setDescription(str);
        }

        static java.lang.String getGroup(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        static void setGroup(android.app.NotificationChannel notificationChannel, java.lang.String str) {
            notificationChannel.setGroup(str);
        }

        static boolean canShowBadge(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        static void setShowBadge(android.app.NotificationChannel notificationChannel, boolean z) {
            notificationChannel.setShowBadge(z);
        }

        static android.net.Uri getSound(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        static void setSound(android.app.NotificationChannel notificationChannel, android.net.Uri uri, android.media.AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        static android.media.AudioAttributes getAudioAttributes(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        static boolean shouldShowLights(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        static void enableLights(android.app.NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableLights(z);
        }

        static int getLightColor(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        static void setLightColor(android.app.NotificationChannel notificationChannel, int i) {
            notificationChannel.setLightColor(i);
        }

        static boolean shouldVibrate(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }

        static void enableVibration(android.app.NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableVibration(z);
        }

        static long[] getVibrationPattern(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        static void setVibrationPattern(android.app.NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        static boolean canBypassDnd(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        static int getLockscreenVisibility(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static boolean canBubble(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.canBubble();
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static java.lang.String getParentChannelId(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        static java.lang.String getConversationId(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getConversationId();
        }

        static void setConversationId(android.app.NotificationChannel notificationChannel, java.lang.String str, java.lang.String str2) {
            notificationChannel.setConversationId(str, str2);
        }

        static boolean isImportantConversation(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.isImportantConversation();
        }
    }
}
