package A1;

/* loaded from: classes.dex */
public abstract class d {
    private static volatile android.view.Choreographer choreographer;

    static {
        java.lang.Object i2;
        try {
            i2 = new A1.c(a(android.os.Looper.getMainLooper()));
        } catch (java.lang.Throwable th) {
            i2 = a.AbstractC0059a.i(th);
        }
        if (i2 instanceof h1.C0173e) {
            i2 = null;
        }
    }

    public static final android.os.Handler a(android.os.Looper looper) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            java.lang.Object invoke = android.os.Handler.class.getDeclaredMethod("createAsync", android.os.Looper.class).invoke(null, looper);
            kotlin.jvm.internal.i.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (android.os.Handler) invoke;
        }
        try {
            return (android.os.Handler) android.os.Handler.class.getDeclaredConstructor(android.os.Looper.class, android.os.Handler.Callback.class, java.lang.Boolean.TYPE).newInstance(looper, null, java.lang.Boolean.TRUE);
        } catch (java.lang.NoSuchMethodException unused) {
            return new android.os.Handler(looper);
        }
    }
}
