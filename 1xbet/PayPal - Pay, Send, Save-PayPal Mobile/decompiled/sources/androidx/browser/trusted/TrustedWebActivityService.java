package androidx.browser.trusted;

/* loaded from: classes6.dex */
public abstract class TrustedWebActivityService extends android.app.Service {
    public static final java.lang.String ACTION_TRUSTED_WEB_ACTIVITY_SERVICE = "android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE";
    public static final java.lang.String KEY_SMALL_ICON_BITMAP = "android.support.customtabs.trusted.SMALL_ICON_BITMAP";
    public static final java.lang.String KEY_SUCCESS = "androidx.browser.trusted.SUCCESS";
    public static final java.lang.String META_DATA_NAME_SMALL_ICON = "android.support.customtabs.trusted.SMALL_ICON";
    public static final int SMALL_ICON_NOT_SET = -1;
    private android.app.NotificationManager getHighSpeedVideoFpsRanges;
    int getHighResolutionOutputSizeshNQ4ISI = -1;
    private final android.support.customtabs.trusted.ITrustedWebActivityService.Stub Camera2StreamConfigurationMap = new android.support.customtabs.trusted.ITrustedWebActivityService.Stub() { // from class: androidx.browser.trusted.TrustedWebActivityService.1
        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public android.os.Bundle areNotificationsEnabled(android.os.Bundle bundle) {
            getHighSpeedVideoFpsRangesFor();
            androidx.browser.trusted.TrustedWebActivityServiceConnection.ResultArgs resultArgs = new androidx.browser.trusted.TrustedWebActivityServiceConnection.ResultArgs(androidx.browser.trusted.TrustedWebActivityService.this.onAreNotificationsEnabled(androidx.browser.trusted.TrustedWebActivityServiceConnection.NotificationsEnabledArgs.getHighResolutionOutputSizeshNQ4ISI(bundle).getHighResolutionOutputSizeshNQ4ISI));
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", resultArgs.Camera2StreamConfigurationMap);
            return bundle2;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public android.os.Bundle notifyNotificationWithChannel(android.os.Bundle bundle) {
            getHighSpeedVideoFpsRangesFor();
            androidx.browser.trusted.TrustedWebActivityServiceConnection.NotifyNotificationArgs highSpeedVideoSizes = androidx.browser.trusted.TrustedWebActivityServiceConnection.NotifyNotificationArgs.getHighSpeedVideoSizes(bundle);
            androidx.browser.trusted.TrustedWebActivityServiceConnection.ResultArgs resultArgs = new androidx.browser.trusted.TrustedWebActivityServiceConnection.ResultArgs(androidx.browser.trusted.TrustedWebActivityService.this.onNotifyNotificationWithChannel(highSpeedVideoSizes.getHighSpeedVideoFpsRanges, highSpeedVideoSizes.getHighSpeedVideoSizes, highSpeedVideoSizes.Camera2StreamConfigurationMap, highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor));
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", resultArgs.Camera2StreamConfigurationMap);
            return bundle2;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public void cancelNotification(android.os.Bundle bundle) {
            getHighSpeedVideoFpsRangesFor();
            androidx.browser.trusted.TrustedWebActivityServiceConnection.CancelNotificationArgs Camera2StreamConfigurationMap = androidx.browser.trusted.TrustedWebActivityServiceConnection.CancelNotificationArgs.Camera2StreamConfigurationMap(bundle);
            androidx.browser.trusted.TrustedWebActivityService.this.onCancelNotification(Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor, Camera2StreamConfigurationMap.Camera2StreamConfigurationMap);
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public android.os.Bundle getActiveNotifications() {
            getHighSpeedVideoFpsRangesFor();
            androidx.browser.trusted.TrustedWebActivityServiceConnection.ActiveNotificationsArgs activeNotificationsArgs = new androidx.browser.trusted.TrustedWebActivityServiceConnection.ActiveNotificationsArgs(androidx.browser.trusted.TrustedWebActivityService.this.onGetActiveNotifications());
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", activeNotificationsArgs.getHighSpeedVideoSizes);
            return bundle;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public int getSmallIconId() {
            getHighSpeedVideoFpsRangesFor();
            return androidx.browser.trusted.TrustedWebActivityService.this.onGetSmallIconId();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public android.os.Bundle getSmallIconBitmap() {
            getHighSpeedVideoFpsRangesFor();
            return androidx.browser.trusted.TrustedWebActivityService.this.onGetSmallIconBitmap();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public android.os.Bundle extraCommand(java.lang.String str, android.os.Bundle bundle, android.os.IBinder iBinder) {
            getHighSpeedVideoFpsRangesFor();
            return androidx.browser.trusted.TrustedWebActivityService.this.onExtraCommand(str, bundle, androidx.browser.trusted.TrustedWebActivityCallbackRemote.getHighSpeedVideoFpsRangesFor(iBinder));
        }

        private void getHighSpeedVideoFpsRangesFor() {
            if (androidx.browser.trusted.TrustedWebActivityService.this.getHighResolutionOutputSizeshNQ4ISI == -1) {
                java.lang.String[] packagesForUid = androidx.browser.trusted.TrustedWebActivityService.this.getPackageManager().getPackagesForUid(getCallingUid());
                int i = 0;
                if (packagesForUid == null) {
                    packagesForUid = new java.lang.String[0];
                }
                androidx.browser.trusted.Token load = androidx.browser.trusted.TrustedWebActivityService.this.getTokenStore().load();
                android.content.pm.PackageManager packageManager = androidx.browser.trusted.TrustedWebActivityService.this.getPackageManager();
                if (load != null) {
                    int length = packagesForUid.length;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if (load.matches(packagesForUid[i], packageManager)) {
                            androidx.browser.trusted.TrustedWebActivityService.this.getHighResolutionOutputSizeshNQ4ISI = getCallingUid();
                            break;
                        }
                        i++;
                    }
                }
            }
            if (androidx.browser.trusted.TrustedWebActivityService.this.getHighResolutionOutputSizeshNQ4ISI != getCallingUid()) {
                throw new java.lang.SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        }
    };

    public abstract androidx.browser.trusted.TokenStore getTokenStore();

    public android.os.Bundle onExtraCommand(java.lang.String str, android.os.Bundle bundle, androidx.browser.trusted.TrustedWebActivityCallbackRemote trustedWebActivityCallbackRemote) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.getHighSpeedVideoFpsRanges = (android.app.NotificationManager) getSystemService("notification");
    }

    public android.os.Bundle onGetSmallIconBitmap() {
        int onGetSmallIconId = onGetSmallIconId();
        android.os.Bundle bundle = new android.os.Bundle();
        if (onGetSmallIconId == -1) {
            return bundle;
        }
        bundle.putParcelable(KEY_SMALL_ICON_BITMAP, android.graphics.BitmapFactory.decodeResource(getResources(), onGetSmallIconId));
        return bundle;
    }

    public int onGetSmallIconId() {
        try {
            android.content.pm.ServiceInfo serviceInfo = getPackageManager().getServiceInfo(new android.content.ComponentName(this, getClass()), 128);
            if (serviceInfo.metaData == null) {
                return -1;
            }
            return serviceInfo.metaData.getInt(META_DATA_NAME_SMALL_ICON, -1);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // android.app.Service
    public final boolean onUnbind(android.content.Intent intent) {
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
        return super.onUnbind(intent);
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str.toLowerCase(java.util.Locale.ROOT).replace(' ', '_'));
        sb.append("_channel_id");
        return sb.toString();
    }

    public boolean onAreNotificationsEnabled(java.lang.String str) {
        if (this.getHighSpeedVideoFpsRanges != null) {
            if (androidx.core.app.NotificationManagerCompat.from(this).areNotificationsEnabled()) {
                return androidx.browser.trusted.NotificationApiHelperForO.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, getHighSpeedVideoFpsRanges(str));
            }
            return false;
        }
        throw new java.lang.IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
    }

    public void onCancelNotification(java.lang.String str, int i) {
        android.app.NotificationManager notificationManager = this.getHighSpeedVideoFpsRanges;
        if (notificationManager != null) {
            notificationManager.cancel(str, i);
            return;
        }
        throw new java.lang.IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
    }

    public android.os.Parcelable[] onGetActiveNotifications() {
        android.app.NotificationManager notificationManager = this.getHighSpeedVideoFpsRanges;
        if (notificationManager != null) {
            return androidx.browser.trusted.NotificationApiHelperForM.getHighSpeedVideoSizes(notificationManager);
        }
        throw new java.lang.IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
    }

    public boolean onNotifyNotificationWithChannel(java.lang.String str, int i, android.app.Notification notification, java.lang.String str2) {
        if (this.getHighSpeedVideoFpsRanges != null) {
            if (!androidx.core.app.NotificationManagerCompat.from(this).areNotificationsEnabled()) {
                return false;
            }
            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str2);
            android.app.Notification Camera2StreamConfigurationMap = androidx.browser.trusted.NotificationApiHelperForO.Camera2StreamConfigurationMap(this, this.getHighSpeedVideoFpsRanges, notification, highSpeedVideoFpsRanges, str2);
            if (!androidx.browser.trusted.NotificationApiHelperForO.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRanges)) {
                return false;
            }
            this.getHighSpeedVideoFpsRanges.notify(str, i, Camera2StreamConfigurationMap);
            return true;
        }
        throw new java.lang.IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
