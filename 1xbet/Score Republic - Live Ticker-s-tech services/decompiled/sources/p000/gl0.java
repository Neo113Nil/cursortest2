package p000;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class gl0 extends AbstractC0727tf {

    /* JADX INFO: renamed from: b */
    public final String f2801b;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ jl0 f2803d;

    /* JADX INFO: renamed from: a */
    public final AtomicReference f2800a = new AtomicReference(jl0.f3970h0);

    /* JADX INFO: renamed from: c */
    public final el0 f2802c = new el0(this);

    public gl0(jl0 jl0Var, String str) {
        this.f2803d = jl0Var;
        a90.m127k(str, "authority");
        this.f2801b = str;
    }

    @Override // p000.AbstractC0727tf
    /* JADX INFO: renamed from: e */
    public final String mo1438e() {
        return this.f2801b;
    }

    @Override // p000.AbstractC0727tf
    /* JADX INFO: renamed from: f */
    public final xe1 mo1439f(wp0 wp0Var, C0095ce c0095ce) {
        jl0 jl0Var = this.f2803d;
        gc1 gc1Var = jl0Var.f4012m;
        AtomicReference atomicReference = this.f2800a;
        Object obj = atomicReference.get();
        wk0 wk0Var = jl0.f3970h0;
        if (obj != wk0Var) {
            return m2121g(wp0Var, c0095ce);
        }
        gc1Var.execute(new RunnableC0897y0(15, this));
        if (atomicReference.get() != wk0Var) {
            return m2121g(wp0Var, c0095ce);
        }
        if (jl0Var.f3978G.get()) {
            return new C0776ur(2);
        }
        fl0 fl0Var = new fl0(this, C0697sm.m4537b(), wp0Var, c0095ce);
        gc1Var.execute(new RunnableC0529o2(24, this, fl0Var));
        return fl0Var;
    }

    /* JADX INFO: renamed from: g */
    public final xe1 m2121g(wp0 wp0Var, C0095ce c0095ce) {
        ke0 ke0Var = (ke0) this.f2800a.get();
        el0 el0Var = this.f2802c;
        if (ke0Var == null) {
            return el0Var.mo1439f(wp0Var, c0095ce);
        }
        if (!(ke0Var instanceof rl0)) {
            return new al0(ke0Var, el0Var, this.f2803d.f4007h, wp0Var, c0095ce);
        }
        sl0 sl0Var = ((rl0) ke0Var).f6885b;
        ql0 ql0Var = (ql0) sl0Var.f7141b.get((String) wp0Var.f8621m);
        if (ql0Var == null) {
            ql0Var = (ql0) sl0Var.f7142c.get((String) wp0Var.f8622n);
        }
        if (ql0Var == null) {
            ql0Var = sl0Var.f7140a;
        }
        if (ql0Var != null) {
            c0095ce = c0095ce.m921c(ql0.f6529g, ql0Var);
        }
        return el0Var.mo1439f(wp0Var, c0095ce);
    }

    /* JADX INFO: renamed from: h */
    public final void m2122h(ke0 ke0Var) {
        LinkedHashSet linkedHashSet;
        AtomicReference atomicReference = this.f2800a;
        ke0 ke0Var2 = (ke0) atomicReference.get();
        atomicReference.set(ke0Var);
        if (ke0Var2 != jl0.f3970h0 || (linkedHashSet = this.f2803d.f3973B) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((fl0) it.next()).m1880u();
        }
    }
}
