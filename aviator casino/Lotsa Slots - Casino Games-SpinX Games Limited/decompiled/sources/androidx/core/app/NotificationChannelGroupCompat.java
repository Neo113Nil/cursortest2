package androidx.core.app;

/* loaded from: classes.dex */
public class NotificationChannelGroupCompat {
    private boolean mBlocked;
    private java.util.List<androidx.core.app.NotificationChannelCompat> mChannels;
    java.lang.String mDescription;
    final java.lang.String mId;
    java.lang.CharSequence mName;

    public static class Builder {
        final androidx.core.app.NotificationChannelGroupCompat mGroup;

        public Builder(java.lang.String str) {
            this.mGroup = new androidx.core.app.NotificationChannelGroupCompat(str);
        }

        public androidx.core.app.NotificationChannelGroupCompat.Builder setName(java.lang.CharSequence charSequence) {
            this.mGroup.mName = charSequence;
            return this;
        }

        public androidx.core.app.NotificationChannelGroupCompat.Builder setDescription(java.lang.String str) {
            this.mGroup.mDescription = str;
            return this;
        }

        public androidx.core.app.NotificationChannelGroupCompat build() {
            return this.mGroup;
        }
    }

    NotificationChannelGroupCompat(java.lang.String str) {
        this.mChannels = java.util.Collections.emptyList();
        this.mId = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str);
    }

    NotificationChannelGroupCompat(android.app.NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, java.util.Collections.emptyList());
    }

    NotificationChannelGroupCompat(android.app.NotificationChannelGroup notificationChannelGroup, java.util.List<android.app.NotificationChannel> list) {
        this(androidx.core.app.NotificationChannelGroupCompat.Api26Impl.getId(notificationChannelGroup));
        this.mName = androidx.core.app.NotificationChannelGroupCompat.Api26Impl.getName(notificationChannelGroup);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.mDescription = androidx.core.app.NotificationChannelGroupCompat.Api28Impl.getDescription(notificationChannelGroup);
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.mBlocked = androidx.core.app.NotificationChannelGroupCompat.Api28Impl.isBlocked(notificationChannelGroup);
            this.mChannels = getChannelsCompat(androidx.core.app.NotificationChannelGroupCompat.Api26Impl.getChannels(notificationChannelGroup));
        } else {
            this.mChannels = getChannelsCompat(list);
        }
    }

    private java.util.List<androidx.core.app.NotificationChannelCompat> getChannelsCompat(java.util.List<android.app.NotificationChannel> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.app.NotificationChannel notificationChannel : list) {
            if (this.mId.equals(androidx.core.app.NotificationChannelGroupCompat.Api26Impl.getGroup(notificationChannel))) {
                arrayList.add(new androidx.core.app.NotificationChannelCompat(notificationChannel));
            }
        }
        return arrayList;
    }

    android.app.NotificationChannelGroup getNotificationChannelGroup() {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return null;
        }
        android.app.NotificationChannelGroup createNotificationChannelGroup = androidx.core.app.NotificationChannelGroupCompat.Api26Impl.createNotificationChannelGroup(this.mId, this.mName);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.app.NotificationChannelGroupCompat.Api28Impl.setDescription(createNotificationChannelGroup, this.mDescription);
        }
        return createNotificationChannelGroup;
    }

    public androidx.core.app.NotificationChannelGroupCompat.Builder toBuilder() {
        return new androidx.core.app.NotificationChannelGroupCompat.Builder(this.mId).setName(this.mName).setDescription(this.mDescription);
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

    public boolean isBlocked() {
        return this.mBlocked;
    }

    public java.util.List<androidx.core.app.NotificationChannelCompat> getChannels() {
        return this.mChannels;
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static android.app.NotificationChannelGroup createNotificationChannelGroup(java.lang.String str, java.lang.CharSequence charSequence) {
            return new android.app.NotificationChannelGroup(str, charSequence);
        }

        static java.lang.String getId(android.app.NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        static java.lang.CharSequence getName(android.app.NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getName();
        }

        static java.util.List<android.app.NotificationChannel> getChannels(android.app.NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getChannels();
        }

        static java.lang.String getGroup(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static boolean isBlocked(android.app.NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.isBlocked();
        }

        static java.lang.String getDescription(android.app.NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getDescription();
        }

        static void setDescription(android.app.NotificationChannelGroup notificationChannelGroup, java.lang.String str) {
            notificationChannelGroup.setDescription(str);
        }
    }
}
