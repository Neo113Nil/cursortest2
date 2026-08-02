package p000;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class el0 extends AbstractC0727tf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gl0 f2108a;

    public el0(gl0 gl0Var) {
        this.f2108a = gl0Var;
    }

    @Override // p000.AbstractC0727tf
    /* JADX INFO: renamed from: e */
    public final String mo1438e() {
        return this.f2108a.f2801b;
    }

    @Override // p000.AbstractC0727tf
    /* JADX INFO: renamed from: f */
    public final xe1 mo1439f(wp0 wp0Var, C0095ce c0095ce) {
        jl0 jl0Var = this.f2108a.f2803d;
        Logger logger = jl0.f3965c0;
        Executor executor = c0095ce.f1226b;
        if (executor == null) {
            executor = jl0Var.f4007h;
        }
        C0062bh c0062bh = new C0062bh(wp0Var, executor, c0095ce, jl0Var.f3997Z, jl0Var.f3980I ? null : this.f2108a.f2803d.f4005f.f157j.f3319m, this.f2108a.f2803d.f3983L);
        c0062bh.f874s = this.f2108a.f2803d.f4013n;
        return c0062bh;
    }
}
