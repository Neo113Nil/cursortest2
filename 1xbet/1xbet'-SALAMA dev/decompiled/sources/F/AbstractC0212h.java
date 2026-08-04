package F;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: F.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0212h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f2435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f2436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f2437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f2438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f2439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Method f2440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Handler f2441g = new Handler(Looper.getMainLooper());

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f2435a = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f2436b = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f2437c = declaredField2;
        Class cls2 = f2435a;
        if (cls2 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
                declaredMethod = null;
            }
        }
        f2438d = declaredMethod;
        Class cls3 = f2435a;
        if (cls3 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls3.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
                declaredMethod2 = null;
            }
        }
        f2439e = declaredMethod2;
        Class cls4 = f2435a;
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 == 26 || i7 == 27) && cls4 != null) {
            try {
                Class cls5 = Integer.TYPE;
                Class cls6 = Boolean.TYPE;
                Method declaredMethod3 = cls4.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls5, cls6, Configuration.class, Configuration.class, cls6, cls6);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f2440f = method;
    }
}
