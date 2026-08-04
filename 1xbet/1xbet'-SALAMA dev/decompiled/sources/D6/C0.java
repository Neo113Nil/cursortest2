package D6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1776a = new ThreadLocal();

    public static X a() {
        ThreadLocal threadLocal = f1776a;
        X x4 = (X) threadLocal.get();
        if (x4 != null) {
            return x4;
        }
        C0125i c0125i = new C0125i(Thread.currentThread());
        threadLocal.set(c0125i);
        return c0125i;
    }
}
