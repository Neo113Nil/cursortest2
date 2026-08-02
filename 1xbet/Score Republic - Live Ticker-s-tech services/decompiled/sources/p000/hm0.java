package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hm0 {
    /* JADX INFO: renamed from: a */
    public static hm0 m2292a(Object obj) {
        zg1.m5905p(obj, "item is null");
        return new vm0(obj);
    }

    /* JADX INFO: renamed from: b */
    public final void m2293b(xm0 xm0Var) {
        zg1.m5905p(xm0Var, "observer is null");
        try {
            mo2294c(xm0Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            wo1.m5394u(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo2294c(xm0 xm0Var);

    /* JADX INFO: renamed from: d */
    public final hm0 m2295d(hm0 hm0Var) {
        zg1.m5905p(hm0Var, "other is null");
        return new nm0(this, hm0Var, 2);
    }
}
