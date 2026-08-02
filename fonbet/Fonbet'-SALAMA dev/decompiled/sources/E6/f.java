package E6;

import a.AbstractC0603a;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import f6.C1112e;
import t6.h;

/* loaded from: classes2.dex */
public abstract class f {
    private static volatile Choreographer choreographer;

    static {
        Object h6;
        try {
            h6 = new e(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            h6 = AbstractC0603a.h(th);
        }
        if (h6 instanceof C1112e) {
            h6 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            h.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
