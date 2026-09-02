package b1;

/* loaded from: classes.dex */
public abstract class Z {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f649a = new ThreadLocal();

    public static C a() {
        ThreadLocal threadLocal = f649a;
        C c2 = (C) threadLocal.get();
        if (c2 != null) {
            return c2;
        }
        C0015c c0015c = new C0015c(Thread.currentThread());
        threadLocal.set(c0015c);
        return c0015c;
    }
}
