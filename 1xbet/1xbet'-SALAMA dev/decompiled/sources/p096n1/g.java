package p096n1;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import p023d1.b;
import p023d1.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f15316a = n.g("ProcessUtils");

    public static boolean a(Context context, b bVar) {
        String processName;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
        } else {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, g.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                if (!(objInvoke instanceof String)) {
                    int iMyPid = Process.myPid();
                    ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                    if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                processName = null;
                                break;
                            }
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (next.pid == iMyPid) {
                                processName = next.processName;
                                break;
                            }
                        }
                    } else {
                        processName = null;
                        break;
                    }
                } else {
                    processName = (String) objInvoke;
                }
            } catch (Throwable th) {
                n.d().b(f15316a, "Unable to check ActivityThread for processName", th);
            }
        }
        bVar.getClass();
        return !TextUtils.isEmpty(null) ? TextUtils.equals(processName, null) : TextUtils.equals(processName, context.getApplicationInfo().processName);
    }
}
