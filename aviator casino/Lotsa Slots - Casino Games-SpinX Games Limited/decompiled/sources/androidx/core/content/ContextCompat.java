package androidx.core.content;

/* loaded from: classes.dex */
public class ContextCompat {
    private static final java.lang.String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final java.lang.String TAG = "ContextCompat";
    private static final java.lang.Object sSync = new java.lang.Object();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RegisterReceiverFlags {
    }

    protected ContextCompat() {
    }

    public static boolean startActivities(android.content.Context context, android.content.Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static boolean startActivities(android.content.Context context, android.content.Intent[] intentArr, android.os.Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    public static void startActivity(android.content.Context context, android.content.Intent intent, android.os.Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static java.io.File getDataDir(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return androidx.core.content.ContextCompat.Api24Impl.getDataDir(context);
        }
        java.lang.String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new java.io.File(str);
        }
        return null;
    }

    public static java.io.File[] getObbDirs(android.content.Context context) {
        return context.getObbDirs();
    }

    public static java.io.File[] getExternalFilesDirs(android.content.Context context, java.lang.String str) {
        return context.getExternalFilesDirs(str);
    }

    public static java.io.File[] getExternalCacheDirs(android.content.Context context) {
        return context.getExternalCacheDirs();
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context context, int i) {
        return androidx.core.content.ContextCompat.Api21Impl.getDrawable(context, i);
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context context, int i) {
        return androidx.core.content.res.ResourcesCompat.getColorStateList(context.getResources(), i, context.getTheme());
    }

    public static int getColor(android.content.Context context, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return androidx.core.content.ContextCompat.Api23Impl.getColor(context, i);
        }
        return context.getResources().getColor(i);
    }

    public static int checkSelfPermission(android.content.Context context, java.lang.String str) {
        androidx.core.util.ObjectsCompat.requireNonNull(str, "permission must be non-null");
        if (android.os.Build.VERSION.SDK_INT >= 33 || !android.text.TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, android.os.Process.myPid(), android.os.Process.myUid());
        }
        return androidx.core.app.NotificationManagerCompat.from(context).areNotificationsEnabled() ? 0 : -1;
    }

    public static java.io.File getNoBackupFilesDir(android.content.Context context) {
        return androidx.core.content.ContextCompat.Api21Impl.getNoBackupFilesDir(context);
    }

    public static java.io.File getCodeCacheDir(android.content.Context context) {
        return androidx.core.content.ContextCompat.Api21Impl.getCodeCacheDir(context);
    }

    private static java.io.File createFilesDir(java.io.File file) {
        synchronized (sSync) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                android.util.Log.w(TAG, "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }

    public static android.content.Context createDeviceProtectedStorageContext(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return androidx.core.content.ContextCompat.Api24Impl.createDeviceProtectedStorageContext(context);
        }
        return null;
    }

    public static boolean isDeviceProtectedStorage(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return androidx.core.content.ContextCompat.Api24Impl.isDeviceProtectedStorage(context);
        }
        return false;
    }

    public static java.util.concurrent.Executor getMainExecutor(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.content.ContextCompat.Api28Impl.getMainExecutor(context);
        }
        return androidx.core.os.ExecutorCompat.create(new android.os.Handler(context.getMainLooper()));
    }

    public static void startForegroundService(android.content.Context context, android.content.Intent intent) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.content.ContextCompat.Api26Impl.startForegroundService(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static android.view.Display getDisplayOrDefault(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.content.ContextCompat.Api30Impl.getDisplayOrDefault(context);
        }
        return ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static <T> T getSystemService(android.content.Context context, java.lang.Class<T> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return (T) androidx.core.content.ContextCompat.Api23Impl.getSystemService(context, cls);
        }
        java.lang.String systemServiceName = getSystemServiceName(context, cls);
        if (systemServiceName != null) {
            return (T) context.getSystemService(systemServiceName);
        }
        return null;
    }

    public static android.content.Intent registerReceiver(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, int i) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i);
    }

    public static android.content.Intent registerReceiver(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 4) != 0) {
            throw new java.lang.IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i2 != 0) {
            i |= 2;
        }
        int i3 = i;
        int i4 = i3 & 2;
        if (i4 == 0 && (i3 & 4) == 0) {
            throw new java.lang.IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i4 != 0 && (i3 & 4) != 0) {
            throw new java.lang.IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.core.content.ContextCompat.Api33Impl.registerReceiver(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.content.ContextCompat.Api26Impl.registerReceiver(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        if ((i3 & 4) != 0 && str == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static java.lang.String getSystemServiceName(android.content.Context context, java.lang.Class<?> cls) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return androidx.core.content.ContextCompat.Api23Impl.getSystemServiceName(context, cls);
        }
        return androidx.core.content.ContextCompat.LegacyServiceMapHolder.SERVICES.get(cls);
    }

    public static java.lang.String getString(android.content.Context context, int i) {
        return getContextForLanguage(context).getString(i);
    }

    public static android.content.Context getContextForLanguage(android.content.Context context) {
        androidx.core.os.LocaleListCompat applicationLocales = androidx.core.app.LocaleManagerCompat.getApplicationLocales(context);
        if (android.os.Build.VERSION.SDK_INT > 32 || applicationLocales.isEmpty()) {
            return context;
        }
        android.content.res.Configuration configuration = new android.content.res.Configuration(context.getResources().getConfiguration());
        androidx.core.os.ConfigurationCompat.setLocales(configuration, applicationLocales);
        return context.createConfigurationContext(configuration);
    }

    public static java.lang.String getAttributionTag(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.content.ContextCompat.Api30Impl.getAttributionTag(context);
        }
        return null;
    }

    public static android.content.Context createAttributionContext(android.content.Context context, java.lang.String str) {
        return android.os.Build.VERSION.SDK_INT >= 30 ? androidx.core.content.ContextCompat.Api30Impl.createAttributionContext(context, str) : context;
    }

    static java.lang.String obtainAndCheckReceiverPermission(android.content.Context context) {
        java.lang.String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (androidx.core.content.PermissionChecker.checkSelfPermission(context, str) == 0) {
            return str;
        }
        throw new java.lang.RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    private static final class LegacyServiceMapHolder {
        static final java.util.HashMap<java.lang.Class<?>, java.lang.String> SERVICES;

        private LegacyServiceMapHolder() {
        }

        static {
            java.util.HashMap<java.lang.Class<?>, java.lang.String> hashMap = new java.util.HashMap<>();
            SERVICES = hashMap;
            if (android.os.Build.VERSION.SDK_INT >= 22) {
                hashMap.put(android.telephony.SubscriptionManager.class, "telephony_subscription_service");
                hashMap.put(android.app.usage.UsageStatsManager.class, "usagestats");
            }
            hashMap.put(android.appwidget.AppWidgetManager.class, "appwidget");
            hashMap.put(android.os.BatteryManager.class, "batterymanager");
            hashMap.put(android.hardware.camera2.CameraManager.class, "camera");
            hashMap.put(android.app.job.JobScheduler.class, "jobscheduler");
            hashMap.put(android.content.pm.LauncherApps.class, "launcherapps");
            hashMap.put(android.media.projection.MediaProjectionManager.class, "media_projection");
            hashMap.put(android.media.session.MediaSessionManager.class, "media_session");
            hashMap.put(android.content.RestrictionsManager.class, "restrictions");
            hashMap.put(android.telecom.TelecomManager.class, "telecom");
            hashMap.put(android.media.tv.TvInputManager.class, "tv_input");
            hashMap.put(android.app.AppOpsManager.class, "appops");
            hashMap.put(android.view.accessibility.CaptioningManager.class, "captioning");
            hashMap.put(android.hardware.ConsumerIrManager.class, "consumer_ir");
            hashMap.put(android.print.PrintManager.class, "print");
            hashMap.put(android.bluetooth.BluetoothManager.class, com.ironsource.T3.d);
            hashMap.put(android.hardware.display.DisplayManager.class, "display");
            hashMap.put(android.os.UserManager.class, "user");
            hashMap.put(android.hardware.input.InputManager.class, "input");
            hashMap.put(android.media.MediaRouter.class, "media_router");
            hashMap.put(android.net.nsd.NsdManager.class, "servicediscovery");
            hashMap.put(android.view.accessibility.AccessibilityManager.class, "accessibility");
            hashMap.put(android.accounts.AccountManager.class, "account");
            hashMap.put(android.app.ActivityManager.class, "activity");
            hashMap.put(android.app.AlarmManager.class, androidx.core.app.NotificationCompat.CATEGORY_ALARM);
            hashMap.put(android.media.AudioManager.class, "audio");
            hashMap.put(android.content.ClipboardManager.class, "clipboard");
            hashMap.put(android.net.ConnectivityManager.class, "connectivity");
            hashMap.put(android.app.admin.DevicePolicyManager.class, "device_policy");
            hashMap.put(android.app.DownloadManager.class, com.vungle.ads.internal.presenter.NativeAdPresenter.DOWNLOAD);
            hashMap.put(android.os.DropBoxManager.class, "dropbox");
            hashMap.put(android.view.inputmethod.InputMethodManager.class, "input_method");
            hashMap.put(android.app.KeyguardManager.class, "keyguard");
            hashMap.put(android.view.LayoutInflater.class, "layout_inflater");
            hashMap.put(android.location.LocationManager.class, com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION);
            hashMap.put(android.nfc.NfcManager.class, "nfc");
            hashMap.put(android.app.NotificationManager.class, com.helpshift.util.ConfigValues.SOURCE_NOTIFICATION);
            hashMap.put(android.os.PowerManager.class, "power");
            hashMap.put(android.app.SearchManager.class, com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH);
            hashMap.put(android.hardware.SensorManager.class, "sensor");
            hashMap.put(android.os.storage.StorageManager.class, com.ironsource.X3.a.k);
            hashMap.put(android.telephony.TelephonyManager.class, androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
            hashMap.put(android.view.textservice.TextServicesManager.class, "textservices");
            hashMap.put(android.app.UiModeManager.class, "uimode");
            hashMap.put(android.hardware.usb.UsbManager.class, "usb");
            hashMap.put(android.os.Vibrator.class, "vibrator");
            hashMap.put(android.app.WallpaperManager.class, "wallpaper");
            hashMap.put(android.net.wifi.p2p.WifiP2pManager.class, "wifip2p");
            hashMap.put(android.net.wifi.WifiManager.class, com.ironsource.T3.b);
            hashMap.put(android.view.WindowManager.class, "window");
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static android.graphics.drawable.Drawable getDrawable(android.content.Context context, int i) {
            return context.getDrawable(i);
        }

        static java.io.File getNoBackupFilesDir(android.content.Context context) {
            return context.getNoBackupFilesDir();
        }

        static java.io.File getCodeCacheDir(android.content.Context context) {
            return context.getCodeCacheDir();
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static int getColor(android.content.Context context, int i) {
            return context.getColor(i);
        }

        static <T> T getSystemService(android.content.Context context, java.lang.Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static java.lang.String getSystemServiceName(android.content.Context context, java.lang.Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static java.io.File getDataDir(android.content.Context context) {
            return context.getDataDir();
        }

        static android.content.Context createDeviceProtectedStorageContext(android.content.Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static boolean isDeviceProtectedStorage(android.content.Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static android.content.Intent registerReceiver(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i) {
            if ((i & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, androidx.core.content.ContextCompat.obtainAndCheckReceiverPermission(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
        }

        static android.content.ComponentName startForegroundService(android.content.Context context, android.content.Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static java.util.concurrent.Executor getMainExecutor(android.content.Context context) {
            return context.getMainExecutor();
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static java.lang.String getAttributionTag(android.content.Context context) {
            return context.getAttributionTag();
        }

        static android.view.Display getDisplayOrDefault(android.content.Context context) {
            try {
                return context.getDisplay();
            } catch (java.lang.UnsupportedOperationException unused) {
                android.util.Log.w(androidx.core.content.ContextCompat.TAG, "The context:" + context + " is not associated with any display. Return a fallback display instead.");
                return ((android.hardware.display.DisplayManager) context.getSystemService(android.hardware.display.DisplayManager.class)).getDisplay(0);
            }
        }

        static android.content.Context createAttributionContext(android.content.Context context, java.lang.String str) {
            return context.createAttributionContext(str);
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static android.content.Intent registerReceiver(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        }
    }
}
