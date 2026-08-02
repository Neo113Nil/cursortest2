package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class x00 {

    /* JADX INFO: renamed from: a */
    public final C0547ok f8730a;

    /* JADX INFO: renamed from: b */
    public final C0666rs f8731b;

    /* JADX INFO: renamed from: c */
    public C0615qe f8732c;

    /* JADX WARN: Multi-variable type inference failed */
    public x00(hd0 hd0Var, m10 m10Var, C0547ok c0547ok, C0666rs c0666rs, Executor executor) throws Exception {
        g20 m20Var;
        g20 m20Var2;
        this.f8730a = c0547ok;
        this.f8731b = c0666rs;
        ((l10) m10Var).m3141c().m5127c(executor, new C0042ay(8));
        p51 p51Var = hd0Var.f3170f;
        w30 w30Var = hd0Var.f3165a;
        w30 w30Var2 = hd0Var.f3174j.f9139b;
        w30 w30Var3 = hd0Var.f3166b;
        int i = g20.f2582j;
        zg1.m5905p(w30Var, "source1 is null");
        zg1.m5905p(w30Var2, "source2 is null");
        zg1.m5905p(w30Var3, "source3 is null");
        int i2 = 1;
        r20 r20Var = new r20(i2, new vy0[]{w30Var, w30Var2, w30Var3});
        wa0 wa0Var = t22.f7257b;
        int i3 = g20.f2582j;
        zg1.m5906q("maxConcurrency", 3);
        zg1.m5906q("bufferSize", i3);
        if (r20Var instanceof a51) {
            Object objCall = ((a51) r20Var).call();
            m20Var = objCall == null ? z20.f9582k : new x30(objCall, wa0Var);
        } else {
            m20Var = new m20(r20Var, i3);
        }
        u20 u20Var = new u20(m20Var, new C0042ay(20));
        g51 g51Var = p51Var.f5991a;
        zg1.m5905p(g51Var, "scheduler is null");
        zg1.m5906q("bufferSize", i3);
        g30 g30Var = new g30(u20Var, g51Var, i3);
        cd0 cd0Var = new cd0(hd0Var, i2);
        zg1.m5906q("prefetch", 2);
        if (g30Var instanceof a51) {
            Object objCall2 = ((a51) g30Var).call();
            m20Var2 = objCall2 == null ? z20.f9582k : new x30(objCall2, cd0Var);
        } else {
            m20Var2 = new m20(g30Var, cd0Var);
        }
        g51 g51Var2 = p51Var.f5992b;
        zg1.m5905p(g51Var2, "scheduler is null");
        zg1.m5906q("bufferSize", i3);
        new g30(m20Var2, g51Var2, i3).m1973d(new ch0(new C0468mf(i2, this)));
    }
}
