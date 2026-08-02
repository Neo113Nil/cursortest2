package q4;

import G4.l;
import W3.j;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* renamed from: q4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2314d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f18898a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object p5;
        try {
            p5 = new C2313c(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            p5 = l.p(th);
        }
        if (p5 instanceof j) {
            p5 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.os.Handler", invoke);
        return (Handler) invoke;
    }
}
