package androidx.work.impl.utils;

/* compiled from: ProcessUtils.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"TAG", "", "getProcessName", "context", "Landroid/content/Context;", "isDefaultProcess", "", "configuration", "Landroidx/work/Configuration;", "work-runtime_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ProcessUtils {
    private static final java.lang.String TAG;

    static {
        java.lang.String tagWithPrefix = androidx.work.Logger.tagWithPrefix("ProcessUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "tagWithPrefix(\"ProcessUtils\")");
        TAG = tagWithPrefix;
    }

    public static final boolean isDefaultProcess(android.content.Context context, androidx.work.Configuration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "configuration");
        java.lang.String processName = getProcessName(context);
        java.lang.String defaultProcessName = configuration.getDefaultProcessName();
        if (defaultProcessName != null && defaultProcessName.length() != 0) {
            return kotlin.jvm.internal.Intrinsics.areEqual(processName, configuration.getDefaultProcessName());
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(processName, context.getApplicationInfo().processName);
    }

    private static final java.lang.String getProcessName(android.content.Context context) {
        java.lang.Object obj;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.work.impl.utils.Api28Impl.INSTANCE.getProcessName();
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
            androidx.work.Logger.get().debug(TAG, "Unable to check ActivityThread for processName", th);
        }
        int myPid = android.os.Process.myPid();
        java.lang.Object systemService = context.getSystemService("activity");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
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
