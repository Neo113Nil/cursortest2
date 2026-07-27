package D4;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f527a = new ThreadLocal();

    public static O a() {
        ThreadLocal threadLocal = f527a;
        O o2 = (O) threadLocal.get();
        if (o2 != null) {
            return o2;
        }
        C0004d c0004d = new C0004d(Thread.currentThread());
        threadLocal.set(c0004d);
        return c0004d;
    }
}
