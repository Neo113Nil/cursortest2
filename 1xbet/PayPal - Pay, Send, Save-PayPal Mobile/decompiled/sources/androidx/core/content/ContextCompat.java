package androidx.core.content;

/* loaded from: classes.dex */
public class ContextCompat {
    private static final java.lang.String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final java.lang.String TAG = "ContextCompat";

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface RegisterReceiverFlags {
    }

    public static boolean startActivities(android.content.Context context, android.content.Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static boolean startActivities(android.content.Context context, android.content.Intent[] intentArr, android.os.Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    @androidx.annotation.ReplaceWith(expression = "context.startActivity(intent, options)")
    @java.lang.Deprecated
    public static void startActivity(android.content.Context context, android.content.Intent intent, android.os.Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static java.io.File getDataDir(android.content.Context context) {
        return androidx.core.content.ContextCompat.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(context);
    }

    @androidx.annotation.ReplaceWith(expression = "context.getObbDirs()")
    @java.lang.Deprecated
    public static java.io.File[] getObbDirs(android.content.Context context) {
        return context.getObbDirs();
    }

    @androidx.annotation.ReplaceWith(expression = "context.getExternalFilesDirs(type)")
    @java.lang.Deprecated
    public static java.io.File[] getExternalFilesDirs(android.content.Context context, java.lang.String str) {
        return context.getExternalFilesDirs(str);
    }

    @androidx.annotation.ReplaceWith(expression = "context.getExternalCacheDirs()")
    @java.lang.Deprecated
    public static java.io.File[] getExternalCacheDirs(android.content.Context context) {
        return context.getExternalCacheDirs();
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context context, int i) {
        return context.getDrawable(i);
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context context, int i) {
        return androidx.core.content.res.ResourcesCompat.getColorStateList(context.getResources(), i, context.getTheme());
    }

    public static int getColor(android.content.Context context, int i) {
        return context.getColor(i);
    }

    public static int checkSelfPermission(android.content.Context context, java.lang.String str) {
        androidx.core.util.ObjectsCompat.requireNonNull(str, "permission must be non-null");
        if (android.os.Build.VERSION.SDK_INT >= 33 || !android.text.TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, android.os.Process.myPid(), android.os.Process.myUid());
        }
        return androidx.core.app.NotificationManagerCompat.from(context).areNotificationsEnabled() ? 0 : -1;
    }

    public static java.io.File getNoBackupFilesDir(android.content.Context context) {
        return context.getNoBackupFilesDir();
    }

    public static java.io.File getCodeCacheDir(android.content.Context context) {
        return context.getCodeCacheDir();
    }

    public static android.content.Context createDeviceProtectedStorageContext(android.content.Context context) {
        return androidx.core.content.ContextCompat.Api24Impl.getHighSpeedVideoFpsRangesFor(context);
    }

    public static boolean isDeviceProtectedStorage(android.content.Context context) {
        return androidx.core.content.ContextCompat.Api24Impl.getHighSpeedVideoFpsRanges(context);
    }

    public static java.util.concurrent.Executor getMainExecutor(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.content.ContextCompat.Api28Impl.getHighResolutionOutputSizeshNQ4ISI(context);
        }
        return androidx.core.os.ExecutorCompat.create(new android.os.Handler(context.getMainLooper()));
    }

    public static void startForegroundService(android.content.Context context, android.content.Intent intent) {
        androidx.core.content.ContextCompat.Api26Impl.getHighSpeedVideoSizes(context, intent);
    }

    public static android.view.Display getDisplayOrDefault(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.content.ContextCompat.Api30Impl.getHighSpeedVideoFpsRangesFor(context);
        }
        return ((android.view.WindowManager) context.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME)).getDefaultDisplay();
    }

    public static <T> T getSystemService(android.content.Context context, java.lang.Class<T> cls) {
        return (T) context.getSystemService(cls);
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
            return androidx.core.content.ContextCompat.Api33Impl.getHighSpeedVideoSizes(context, broadcastReceiver, intentFilter, str, handler, i3);
        }
        return androidx.core.content.ContextCompat.Api26Impl.Camera2StreamConfigurationMap(context, broadcastReceiver, intentFilter, str, handler, i3);
    }

    public static java.lang.String getSystemServiceName(android.content.Context context, java.lang.Class<?> cls) {
        return context.getSystemServiceName(cls);
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
            return androidx.core.content.ContextCompat.Api30Impl.getHighSpeedVideoSizes(context);
        }
        return null;
    }

    public static android.content.Context createAttributionContext(android.content.Context context, java.lang.String str) {
        return android.os.Build.VERSION.SDK_INT >= 30 ? androidx.core.content.ContextCompat.Api30Impl.getHighSpeedVideoFpsRangesFor(context, str) : context;
    }

    static java.lang.String obtainAndCheckReceiverPermission(android.content.Context context) {
        java.lang.String str = context.getApplicationContext().getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (androidx.core.content.PermissionChecker.checkSelfPermission(context, str) == 0) {
            return str;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            str = context.getOpPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
            if (androidx.core.content.PermissionChecker.checkSelfPermission(context, str) == 0) {
                return str;
            }
        }
        throw new java.lang.RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    /* loaded from: classes7.dex */
    static class Api24Impl {
        private Api24Impl() {
        }

        static java.io.File getHighResolutionOutputSizeshNQ4ISI(android.content.Context context) {
            return context.getDataDir();
        }

        static android.content.Context getHighSpeedVideoFpsRangesFor(android.content.Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static boolean getHighSpeedVideoFpsRanges(android.content.Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* loaded from: classes3.dex */
    static class Api26Impl {
        private Api26Impl() {
        }

        static android.content.Intent Camera2StreamConfigurationMap(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i) {
            if ((i & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, androidx.core.content.ContextCompat.obtainAndCheckReceiverPermission(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
        }

        static android.content.ComponentName getHighSpeedVideoSizes(android.content.Context context, android.content.Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* loaded from: classes3.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        static java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI(android.content.Context context) {
            return context.getMainExecutor();
        }
    }

    /* loaded from: classes7.dex */
    static class Api30Impl {
        private Api30Impl() {
        }

        static java.lang.String getHighSpeedVideoSizes(android.content.Context context) {
            return context.getAttributionTag();
        }

        static android.view.Display getHighSpeedVideoFpsRangesFor(android.content.Context context) {
            try {
                return context.getDisplay();
            } catch (java.lang.UnsupportedOperationException unused) {
                return ((android.hardware.display.DisplayManager) context.getSystemService(android.hardware.display.DisplayManager.class)).getDisplay(0);
            }
        }

        static android.content.Context getHighSpeedVideoFpsRangesFor(android.content.Context context, java.lang.String str) {
            return context.createAttributionContext(str);
        }
    }

    /* loaded from: classes7.dex */
    static class Api33Impl {
        private Api33Impl() {
        }

        static android.content.Intent getHighSpeedVideoSizes(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        }
    }
}
