package androidx.core.app;

/* loaded from: classes7.dex */
public class NotificationChannelGroupCompat {
    java.lang.CharSequence Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    java.lang.String getHighSpeedVideoFpsRanges;
    private java.util.List<androidx.core.app.NotificationChannelCompat> getHighSpeedVideoFpsRangesFor;
    final java.lang.String getHighSpeedVideoSizes;

    public static class Builder {
        final androidx.core.app.NotificationChannelGroupCompat getHighSpeedVideoSizes;

        public Builder(java.lang.String str) {
            this.getHighSpeedVideoSizes = new androidx.core.app.NotificationChannelGroupCompat(str);
        }

        public androidx.core.app.NotificationChannelGroupCompat.Builder setName(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap = charSequence;
            return this;
        }

        public androidx.core.app.NotificationChannelGroupCompat.Builder setDescription(java.lang.String str) {
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges = str;
            return this;
        }

        public androidx.core.app.NotificationChannelGroupCompat build() {
            return this.getHighSpeedVideoSizes;
        }
    }

    NotificationChannelGroupCompat(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = java.util.Collections.emptyList();
        this.getHighSpeedVideoSizes = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str);
    }

    NotificationChannelGroupCompat(android.app.NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, java.util.Collections.emptyList());
    }

    NotificationChannelGroupCompat(android.app.NotificationChannelGroup notificationChannelGroup, java.util.List<android.app.NotificationChannel> list) {
        this(androidx.core.app.NotificationChannelGroupCompat.Api26Impl.getHighSpeedVideoFpsRanges(notificationChannelGroup));
        this.Camera2StreamConfigurationMap = androidx.core.app.NotificationChannelGroupCompat.Api26Impl.getHighSpeedVideoFpsRangesFor(notificationChannelGroup);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.getHighSpeedVideoFpsRanges = androidx.core.app.NotificationChannelGroupCompat.Api28Impl.Camera2StreamConfigurationMap(notificationChannelGroup);
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.core.app.NotificationChannelGroupCompat.Api28Impl.getHighResolutionOutputSizeshNQ4ISI(notificationChannelGroup);
            this.getHighSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(androidx.core.app.NotificationChannelGroupCompat.Api26Impl.Camera2StreamConfigurationMap(notificationChannelGroup));
        } else {
            this.getHighSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(list);
        }
    }

    private java.util.List<androidx.core.app.NotificationChannelCompat> getHighSpeedVideoFpsRangesFor(java.util.List<android.app.NotificationChannel> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.app.NotificationChannel notificationChannel : list) {
            if (this.getHighSpeedVideoSizes.equals(androidx.core.app.NotificationChannelGroupCompat.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(notificationChannel))) {
                arrayList.add(new androidx.core.app.NotificationChannelCompat(notificationChannel));
            }
        }
        return arrayList;
    }

    android.app.NotificationChannelGroup getHighSpeedVideoFpsRangesFor() {
        android.app.NotificationChannelGroup highSpeedVideoSizes = androidx.core.app.NotificationChannelGroupCompat.Api26Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.app.NotificationChannelGroupCompat.Api28Impl.getHighSpeedVideoFpsRanges(highSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
        }
        return highSpeedVideoSizes;
    }

    public androidx.core.app.NotificationChannelGroupCompat.Builder toBuilder() {
        return new androidx.core.app.NotificationChannelGroupCompat.Builder(this.getHighSpeedVideoSizes).setName(this.Camera2StreamConfigurationMap).setDescription(this.getHighSpeedVideoFpsRanges);
    }

    public java.lang.String getId() {
        return this.getHighSpeedVideoSizes;
    }

    public java.lang.CharSequence getName() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.String getDescription() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean isBlocked() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.util.List<androidx.core.app.NotificationChannelCompat> getChannels() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static android.app.NotificationChannelGroup getHighSpeedVideoSizes(java.lang.String str, java.lang.CharSequence charSequence) {
            return new android.app.NotificationChannelGroup(str, charSequence);
        }

        static java.lang.String getHighSpeedVideoFpsRanges(android.app.NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        static java.lang.CharSequence getHighSpeedVideoFpsRangesFor(android.app.NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getName();
        }

        static java.util.List<android.app.NotificationChannel> Camera2StreamConfigurationMap(android.app.NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getChannels();
        }

        static java.lang.String getHighResolutionOutputSizeshNQ4ISI(android.app.NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static boolean getHighResolutionOutputSizeshNQ4ISI(android.app.NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.isBlocked();
        }

        static java.lang.String Camera2StreamConfigurationMap(android.app.NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getDescription();
        }

        static void getHighSpeedVideoFpsRanges(android.app.NotificationChannelGroup notificationChannelGroup, java.lang.String str) {
            notificationChannelGroup.setDescription(str);
        }
    }
}
