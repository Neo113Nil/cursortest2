package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cd1 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f1223a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static AbstractC0412kx m918a() {
        ThreadLocal threadLocal = f1223a;
        AbstractC0412kx abstractC0412kx = (AbstractC0412kx) threadLocal.get();
        if (abstractC0412kx != null) {
            return abstractC0412kx;
        }
        C0465mc c0465mc = new C0465mc(Thread.currentThread());
        threadLocal.set(c0465mc);
        return c0465mc;
    }
}
