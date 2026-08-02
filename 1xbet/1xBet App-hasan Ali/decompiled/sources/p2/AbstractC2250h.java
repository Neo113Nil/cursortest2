package p2;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import f2.C1944b;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: p2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2250h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18703a = f2.m.f("ProcessUtils");

    public static boolean a(Context context, C1944b c1944b) {
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT >= 28) {
            str = Application.getProcessName();
        } else {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, AbstractC2250h.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, null);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th) {
                f2.m.d().a(f18703a, "Unable to check ActivityThread for processName", th);
            }
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == myPid) {
                        str = runningAppProcessInfo.processName;
                        break;
                    }
                }
            }
            str = null;
        }
        c1944b.getClass();
        return !TextUtils.isEmpty(null) ? TextUtils.equals(str, null) : TextUtils.equals(str, context.getApplicationInfo().processName);
    }
}
