package p000;

import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pv0 implements lj0 {

    /* JADX INFO: renamed from: a */
    public C0511nl f6271a = C0511nl.m3549a(EnumC0474ml.f5074m);

    /* JADX INFO: renamed from: b */
    public sv0 f6272b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tv0 f6273c;

    public pv0(tv0 tv0Var) {
        this.f6273c = tv0Var;
    }

    @Override // p000.lj0
    /* JADX INFO: renamed from: a */
    public final void mo3228a(C0511nl c0511nl) {
        tv0.f7607o.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{c0511nl, this.f6272b.f7217a});
        this.f6271a = c0511nl;
        tv0 tv0Var = this.f6273c;
        if (tv0Var.f7610h.m4911c() && ((sv0) tv0Var.f7609g.get(tv0Var.f7610h.m4909a())).f7219c == this) {
            tv0Var.m4854j(this.f6272b);
        }
    }
}
