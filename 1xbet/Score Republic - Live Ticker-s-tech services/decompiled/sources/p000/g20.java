package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g20 implements vy0 {

    /* JADX INFO: renamed from: j */
    public static final int f2582j = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    @Override // p000.vy0
    /* JADX INFO: renamed from: a */
    public final void mo1970a(y30 y30Var) {
        if (y30Var != null) {
            m1973d(y30Var);
        } else {
            zg1.m5905p(y30Var, "s is null");
            m1973d(new wa1(y30Var));
        }
    }

    /* JADX INFO: renamed from: b */
    public final g30 m1971b(r60 r60Var) {
        zg1.m5905p(r60Var, "mapper is null");
        zg1.m5906q("maxConcurrency", Integer.MAX_VALUE);
        return new g30(this, r60Var);
    }

    /* JADX INFO: renamed from: c */
    public final w30 m1972c() {
        int i = f2582j;
        zg1.m5906q("bufferSize", i);
        AtomicReference atomicReference = new AtomicReference();
        return new w30(new t30(atomicReference, i), this, atomicReference, i);
    }

    /* JADX INFO: renamed from: d */
    public final void m1973d(y30 y30Var) {
        zg1.m5905p(y30Var, "s is null");
        try {
            mo844e(y30Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            wo1.m5394u(th);
            vt1.m5196h(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo844e(y30 y30Var);
}
