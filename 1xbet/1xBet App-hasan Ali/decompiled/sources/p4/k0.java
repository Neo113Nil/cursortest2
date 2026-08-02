package p4;

/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f18800a = new ThreadLocal();

    public static K a() {
        ThreadLocal threadLocal = f18800a;
        K k5 = (K) threadLocal.get();
        if (k5 != null) {
            return k5;
        }
        C2264d c2264d = new C2264d(Thread.currentThread());
        threadLocal.set(c2264d);
        return c2264d;
    }
}
