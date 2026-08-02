package n1;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import d1.C0949b;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: n1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1452g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15310a = d1.n.g("ProcessUtils");

    public static boolean a(Context context, C0949b c0949b) {
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT >= 28) {
            str = Application.getProcessName();
        } else {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, AbstractC1452g.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, null);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th) {
                d1.n.d().b(f15310a, "Unable to check ActivityThread for processName", th);
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
        c0949b.getClass();
        return !TextUtils.isEmpty(null) ? TextUtils.equals(str, null) : TextUtils.equals(str, context.getApplicationInfo().processName);
    }
}
