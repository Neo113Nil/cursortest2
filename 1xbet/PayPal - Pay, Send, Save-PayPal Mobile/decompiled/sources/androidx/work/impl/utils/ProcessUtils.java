package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\"\u0019\u0010\t\u001a\u00070\b¢\u0006\u0002\b\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/work/Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "", "isDefaultProcess", "(Landroid/content/Context;Landroidx/work/Configuration;)Z", "p0", "", "getHighSpeedVideoSizes", "(Landroid/content/Context;)Ljava/lang/String;", "Lorg/jspecify/annotations/NonNull;", "Camera2StreamConfigurationMap", "Ljava/lang/String;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProcessUtils {
    private static final java.lang.String Camera2StreamConfigurationMap;

    static {
        java.lang.String tagWithPrefix = androidx.work.Logger.tagWithPrefix("ProcessUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "");
        Camera2StreamConfigurationMap = tagWithPrefix;
    }

    public static final boolean isDefaultProcess(android.content.Context context, androidx.work.Configuration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(context);
        java.lang.String defaultProcessName = configuration.getDefaultProcessName();
        if (defaultProcessName != null && defaultProcessName.length() != 0) {
            return kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoSizes, configuration.getDefaultProcessName());
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoSizes, context.getApplicationInfo().processName);
    }

    private static final java.lang.String getHighSpeedVideoSizes(android.content.Context context) {
        java.lang.Object obj;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.work.impl.utils.Api28Impl.INSTANCE.Camera2StreamConfigurationMap();
        }
        try {
            java.lang.reflect.Method declaredMethod = java.lang.Class.forName("android.app.ActivityThread", false, androidx.work.WorkManager.class.getClassLoader()).getDeclaredMethod("currentProcessName", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            java.lang.Object invoke = declaredMethod.invoke(null, new java.lang.Object[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNull(invoke);
            if (invoke instanceof java.lang.String) {
                return (java.lang.String) invoke;
            }
        } catch (java.lang.Throwable th) {
            androidx.work.Logger.get().debug(Camera2StreamConfigurationMap, "Unable to check ActivityThread for processName", th);
        }
        int myPid = android.os.Process.myPid();
        java.lang.Object systemService = context.getSystemService("activity");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        java.util.Iterator<T> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((android.app.ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                break;
            }
        }
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (android.app.ActivityManager.RunningAppProcessInfo) obj;
        if (runningAppProcessInfo != null) {
            return runningAppProcessInfo.processName;
        }
        return null;
    }
}
