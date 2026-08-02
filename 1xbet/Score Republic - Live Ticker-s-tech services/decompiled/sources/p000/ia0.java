package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ia0 {
    private static volatile Choreographer choreographer;

    static {
        Object o21Var;
        try {
            o21Var = new ha0(m2580a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            o21Var = new o21(th);
        }
        if (o21Var instanceof o21) {
            o21Var = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Handler m2580a(Looper looper) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        objInvoke.getClass();
        return (Handler) objInvoke;
    }
}
