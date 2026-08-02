package androidx.browser.trusted;

/* loaded from: classes6.dex */
public final class TrustedWebActivityServiceConnection {
    private final android.support.customtabs.trusted.ITrustedWebActivityService Camera2StreamConfigurationMap;
    private final android.content.ComponentName getHighSpeedVideoFpsRangesFor;

    TrustedWebActivityServiceConnection(android.support.customtabs.trusted.ITrustedWebActivityService iTrustedWebActivityService, android.content.ComponentName componentName) {
        this.Camera2StreamConfigurationMap = iTrustedWebActivityService;
        this.getHighSpeedVideoFpsRangesFor = componentName;
    }

    public final boolean areNotificationsEnabled(java.lang.String str) throws android.os.RemoteException {
        androidx.browser.trusted.TrustedWebActivityServiceConnection.NotificationsEnabledArgs notificationsEnabledArgs = new androidx.browser.trusted.TrustedWebActivityServiceConnection.NotificationsEnabledArgs(str);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("android.support.customtabs.trusted.CHANNEL_NAME", notificationsEnabledArgs.getHighResolutionOutputSizeshNQ4ISI);
        return androidx.browser.trusted.TrustedWebActivityServiceConnection.ResultArgs.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap.areNotificationsEnabled(bundle)).Camera2StreamConfigurationMap;
    }

    public final boolean notify(java.lang.String str, int i, android.app.Notification notification, java.lang.String str2) throws android.os.RemoteException {
        androidx.browser.trusted.TrustedWebActivityServiceConnection.NotifyNotificationArgs notifyNotificationArgs = new androidx.browser.trusted.TrustedWebActivityServiceConnection.NotifyNotificationArgs(str, i, notification, str2);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("android.support.customtabs.trusted.PLATFORM_TAG", notifyNotificationArgs.getHighSpeedVideoFpsRanges);
        bundle.putInt("android.support.customtabs.trusted.PLATFORM_ID", notifyNotificationArgs.getHighSpeedVideoSizes);
        bundle.putParcelable("android.support.customtabs.trusted.NOTIFICATION", notifyNotificationArgs.Camera2StreamConfigurationMap);
        bundle.putString("android.support.customtabs.trusted.CHANNEL_NAME", notifyNotificationArgs.getHighSpeedVideoFpsRangesFor);
        return androidx.browser.trusted.TrustedWebActivityServiceConnection.ResultArgs.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap.notifyNotificationWithChannel(bundle)).Camera2StreamConfigurationMap;
    }

    public final void cancel(java.lang.String str, int i) throws android.os.RemoteException {
        androidx.browser.trusted.TrustedWebActivityServiceConnection.CancelNotificationArgs cancelNotificationArgs = new androidx.browser.trusted.TrustedWebActivityServiceConnection.CancelNotificationArgs(str, i);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("android.support.customtabs.trusted.PLATFORM_TAG", cancelNotificationArgs.getHighSpeedVideoFpsRangesFor);
        bundle.putInt("android.support.customtabs.trusted.PLATFORM_ID", cancelNotificationArgs.Camera2StreamConfigurationMap);
        this.Camera2StreamConfigurationMap.cancelNotification(bundle);
    }

    public final android.os.Parcelable[] getActiveNotifications() throws android.os.RemoteException {
        return androidx.browser.trusted.TrustedWebActivityServiceConnection.ActiveNotificationsArgs.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap.getActiveNotifications()).getHighSpeedVideoSizes;
    }

    public final int getSmallIconId() throws android.os.RemoteException {
        return this.Camera2StreamConfigurationMap.getSmallIconId();
    }

    public final android.graphics.Bitmap getSmallIconBitmap() throws android.os.RemoteException {
        return (android.graphics.Bitmap) this.Camera2StreamConfigurationMap.getSmallIconBitmap().getParcelable(androidx.browser.trusted.TrustedWebActivityService.KEY_SMALL_ICON_BITMAP);
    }

    public final android.content.ComponentName getComponentName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    static class NotifyNotificationArgs {
        public final android.app.Notification Camera2StreamConfigurationMap;
        public final java.lang.String getHighSpeedVideoFpsRanges;
        public final java.lang.String getHighSpeedVideoFpsRangesFor;
        public final int getHighSpeedVideoSizes;

        NotifyNotificationArgs(java.lang.String str, int i, android.app.Notification notification, java.lang.String str2) {
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighSpeedVideoSizes = i;
            this.Camera2StreamConfigurationMap = notification;
            this.getHighSpeedVideoFpsRangesFor = str2;
        }

        public static androidx.browser.trusted.TrustedWebActivityServiceConnection.NotifyNotificationArgs getHighSpeedVideoSizes(android.os.Bundle bundle) {
            androidx.browser.trusted.TrustedWebActivityServiceConnection.getHighSpeedVideoFpsRanges(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            androidx.browser.trusted.TrustedWebActivityServiceConnection.getHighSpeedVideoFpsRanges(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            androidx.browser.trusted.TrustedWebActivityServiceConnection.getHighSpeedVideoFpsRanges(bundle, "android.support.customtabs.trusted.NOTIFICATION");
            androidx.browser.trusted.TrustedWebActivityServiceConnection.getHighSpeedVideoFpsRanges(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new androidx.browser.trusted.TrustedWebActivityServiceConnection.NotifyNotificationArgs(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (android.app.Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    static class CancelNotificationArgs {
        public final int Camera2StreamConfigurationMap;
        public final java.lang.String getHighSpeedVideoFpsRangesFor;

        CancelNotificationArgs(java.lang.String str, int i) {
            this.getHighSpeedVideoFpsRangesFor = str;
            this.Camera2StreamConfigurationMap = i;
        }

        public static androidx.browser.trusted.TrustedWebActivityServiceConnection.CancelNotificationArgs Camera2StreamConfigurationMap(android.os.Bundle bundle) {
            androidx.browser.trusted.TrustedWebActivityServiceConnection.getHighSpeedVideoFpsRanges(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            androidx.browser.trusted.TrustedWebActivityServiceConnection.getHighSpeedVideoFpsRanges(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            return new androidx.browser.trusted.TrustedWebActivityServiceConnection.CancelNotificationArgs(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
        }
    }

    static class ResultArgs {
        public final boolean Camera2StreamConfigurationMap;

        ResultArgs(boolean z) {
            this.Camera2StreamConfigurationMap = z;
        }

        public static androidx.browser.trusted.TrustedWebActivityServiceConnection.ResultArgs getHighResolutionOutputSizeshNQ4ISI(android.os.Bundle bundle) {
            androidx.browser.trusted.TrustedWebActivityServiceConnection.getHighSpeedVideoFpsRanges(bundle, "android.support.customtabs.trusted.NOTIFICATION_SUCCESS");
            return new androidx.browser.trusted.TrustedWebActivityServiceConnection.ResultArgs(bundle.getBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS"));
        }
    }

    static class ActiveNotificationsArgs {
        public final android.os.Parcelable[] getHighSpeedVideoSizes;

        ActiveNotificationsArgs(android.os.Parcelable[] parcelableArr) {
            this.getHighSpeedVideoSizes = parcelableArr;
        }

        public static androidx.browser.trusted.TrustedWebActivityServiceConnection.ActiveNotificationsArgs getHighSpeedVideoSizes(android.os.Bundle bundle) {
            androidx.browser.trusted.TrustedWebActivityServiceConnection.getHighSpeedVideoFpsRanges(bundle, "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS");
            return new androidx.browser.trusted.TrustedWebActivityServiceConnection.ActiveNotificationsArgs(bundle.getParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS"));
        }
    }

    static class NotificationsEnabledArgs {
        public final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        NotificationsEnabledArgs(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        public static androidx.browser.trusted.TrustedWebActivityServiceConnection.NotificationsEnabledArgs getHighResolutionOutputSizeshNQ4ISI(android.os.Bundle bundle) {
            androidx.browser.trusted.TrustedWebActivityServiceConnection.getHighSpeedVideoFpsRanges(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new androidx.browser.trusted.TrustedWebActivityServiceConnection.NotificationsEnabledArgs(bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    static void getHighSpeedVideoFpsRanges(android.os.Bundle bundle, java.lang.String str) {
        if (!bundle.containsKey(str)) {
            throw new java.lang.IllegalArgumentException("Bundle must contain ".concat(java.lang.String.valueOf(str)));
        }
    }

    public final android.os.Bundle sendExtraCommand(java.lang.String str, android.os.Bundle bundle, final androidx.browser.trusted.TrustedWebActivityCallback trustedWebActivityCallback) throws android.os.RemoteException {
        android.support.customtabs.trusted.ITrustedWebActivityCallback.Stub stub = trustedWebActivityCallback == null ? null : new android.support.customtabs.trusted.ITrustedWebActivityCallback.Stub() { // from class: androidx.browser.trusted.TrustedWebActivityServiceConnection.1
            @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback
            public int getInterfaceVersion() {
                return 1;
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback
            public void onExtraCallback(java.lang.String str2, android.os.Bundle bundle2) throws android.os.RemoteException {
                androidx.browser.trusted.TrustedWebActivityCallback.this.onExtraCallback(str2, bundle2);
            }
        };
        return this.Camera2StreamConfigurationMap.extraCommand(str, bundle, stub != null ? stub.asBinder() : null);
    }
}
