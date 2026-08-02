package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes8.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    protected static final Class<?> f41924a;

    /* renamed from: b, reason: collision with root package name */
    protected static final Field f41925b;

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f41926c;

    /* renamed from: d, reason: collision with root package name */
    protected static final Method f41927d;

    /* renamed from: e, reason: collision with root package name */
    protected static final Method f41928e;

    /* renamed from: f, reason: collision with root package name */
    protected static final Method f41929f;

    /* renamed from: g, reason: collision with root package name */
    private static final Handler f41930g = new Handler(Looper.getMainLooper());

    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0762d f41931a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f41932b;

        a(C0762d c0762d, Object obj) {
            this.f41931a = c0762d;
            this.f41932b = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f41931a.f41937a = this.f41932b;
        }
    }

    final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f41933a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0762d f41934b;

        b(Application application, C0762d c0762d) {
            this.f41933a = application;
            this.f41934b = c0762d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f41933a.unregisterActivityLifecycleCallbacks(this.f41934b);
        }
    }

    final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f41935a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f41936b;

        c(Object obj, Object obj2) {
            this.f41935a = obj;
            this.f41936b = obj2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Method method = d.f41927d;
                Object obj = this.f41936b;
                Object obj2 = this.f41935a;
                if (method != null) {
                    method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f41928e.invoke(obj2, obj, Boolean.FALSE);
                }
            } catch (RuntimeException e11) {
                if (e11.getClass() == RuntimeException.class && e11.getMessage() != null && e11.getMessage().startsWith("Unable to stop")) {
                    throw e11;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    /* renamed from: androidx.core.app.d$d, reason: collision with other inner class name */
    private static final class C0762d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        Object f41937a;

        /* renamed from: b, reason: collision with root package name */
        private Activity f41938b;

        /* renamed from: c, reason: collision with root package name */
        private final int f41939c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f41940d = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f41941e = false;

        /* renamed from: f, reason: collision with root package name */
        private boolean f41942f = false;

        C0762d(@NonNull Activity activity) {
            this.f41938b = activity;
            this.f41939c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (this.f41938b == activity) {
                this.f41938b = null;
                this.f41941e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (!this.f41941e || this.f41942f || this.f41940d || !d.a(this.f41937a, this.f41939c, activity)) {
                return;
            }
            this.f41942f = true;
            this.f41937a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (this.f41938b == activity) {
                this.f41940d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|1|2|3|4|5|6|7|8|9|10|(12:33|34|13|(6:29|30|16|(3:24|25|26)|20|21)|15|16|(1:18)|24|25|26|20|21)|12|13|(0)|15|16|(0)|24|25|26|20|21) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Class<?> cls;
        Field field;
        Field field2;
        Method declaredMethod;
        Class<?> cls2;
        Method declaredMethod2;
        Class<?> cls3;
        int i11;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f41924a = cls;
        try {
            field = Activity.class.getDeclaredField("mMainThread");
            field.setAccessible(true);
        } catch (Throwable unused2) {
            field = null;
        }
        f41925b = field;
        try {
            field2 = Activity.class.getDeclaredField("mToken");
            field2.setAccessible(true);
        } catch (Throwable unused3) {
            field2 = null;
        }
        f41926c = field2;
        Class<?> cls4 = f41924a;
        Class cls5 = Boolean.TYPE;
        if (cls4 != null) {
            try {
                declaredMethod = cls4.getDeclaredMethod("performStopActivity", IBinder.class, cls5, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
            }
            f41927d = declaredMethod;
            cls2 = f41924a;
            if (cls2 != null) {
                try {
                    declaredMethod2 = cls2.getDeclaredMethod("performStopActivity", IBinder.class, cls5);
                    declaredMethod2.setAccessible(true);
                } catch (Throwable unused5) {
                }
                f41928e = declaredMethod2;
                cls3 = f41924a;
                i11 = Build.VERSION.SDK_INT;
                if ((i11 != 26 || i11 == 27) && cls3 != null) {
                    Class cls6 = Integer.TYPE;
                    Class cls7 = Boolean.TYPE;
                    Method declaredMethod3 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls6, cls7, Configuration.class, Configuration.class, cls7, cls7);
                    declaredMethod3.setAccessible(true);
                    method = declaredMethod3;
                }
                f41929f = method;
            }
            declaredMethod2 = null;
            f41928e = declaredMethod2;
            cls3 = f41924a;
            i11 = Build.VERSION.SDK_INT;
            if (i11 != 26) {
            }
            Class cls62 = Integer.TYPE;
            Class cls72 = Boolean.TYPE;
            Method declaredMethod32 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls62, cls72, Configuration.class, Configuration.class, cls72, cls72);
            declaredMethod32.setAccessible(true);
            method = declaredMethod32;
            f41929f = method;
        }
        declaredMethod = null;
        f41927d = declaredMethod;
        cls2 = f41924a;
        if (cls2 != null) {
        }
        declaredMethod2 = null;
        f41928e = declaredMethod2;
        cls3 = f41924a;
        i11 = Build.VERSION.SDK_INT;
        if (i11 != 26) {
        }
        Class cls622 = Integer.TYPE;
        Class cls722 = Boolean.TYPE;
        Method declaredMethod322 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls622, cls722, Configuration.class, Configuration.class, cls722, cls722);
        declaredMethod322.setAccessible(true);
        method = declaredMethod322;
        f41929f = method;
    }

    protected static boolean a(Object obj, int i11, Activity activity) {
        try {
            Object obj2 = f41926c.get(activity);
            if (obj2 == obj && activity.hashCode() == i11) {
                f41930g.postAtFrontOfQueue(new c(f41925b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.app.Application] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.core.app.d$d] */
    /* JADX WARN: Type inference failed for: r4v6 */
    static boolean b(@NonNull Activity activity) {
        Object obj;
        C0762d c0762d;
        Application application;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            activity.recreate();
            return true;
        }
        ?? r22 = 27;
        ?? r42 = 26;
        boolean z11 = i11 == 26 || i11 == 27;
        Method method = f41929f;
        if ((!z11 || method != null) && (f41928e != null || f41927d != null)) {
            try {
                Object obj2 = f41926c.get(activity);
                if (obj2 != null && (obj = f41925b.get(activity)) != null) {
                    Application application2 = activity.getApplication();
                    C0762d c0762d2 = new C0762d(activity);
                    application2.registerActivityLifecycleCallbacks(c0762d2);
                    Handler handler = f41930g;
                    handler.post(new a(c0762d2, obj2));
                    Handler handler2 = (i11 == 26 || i11 == 27) ? 1 : null;
                    try {
                        if (handler2 != null) {
                            handler2 = handler;
                            try {
                                Boolean bool = Boolean.FALSE;
                                r22 = application2;
                                r42 = c0762d2;
                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                            } catch (Throwable th2) {
                                th = th2;
                                application = application2;
                                c0762d = c0762d2;
                                handler2.post(new b(application, c0762d));
                                throw th;
                            }
                        } else {
                            r22 = application2;
                            r42 = c0762d2;
                            handler2 = handler;
                            activity.recreate();
                        }
                        handler2.post(new b(r22, r42));
                        return true;
                    } catch (Throwable th3) {
                        th = th3;
                        application = r22;
                        c0762d = r42;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
