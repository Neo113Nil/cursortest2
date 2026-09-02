package z1;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f8570a = new java.lang.ThreadLocal();

    public static z1.H a() {
        java.lang.ThreadLocal threadLocal = f8570a;
        z1.H h2 = (z1.H) threadLocal.get();
        if (h2 != null) {
            return h2;
        }
        z1.C1051d c1051d = new z1.C1051d(java.lang.Thread.currentThread());
        threadLocal.set(c1051d);
        return c1051d;
    }
}
