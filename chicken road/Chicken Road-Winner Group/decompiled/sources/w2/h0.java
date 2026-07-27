package w2;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f10506a = new ThreadLocal();

    public static H a() {
        ThreadLocal threadLocal = f10506a;
        H h3 = (H) threadLocal.get();
        if (h3 != null) {
            return h3;
        }
        C1225d c1225d = new C1225d(Thread.currentThread());
        threadLocal.set(c1225d);
        return c1225d;
    }
}
