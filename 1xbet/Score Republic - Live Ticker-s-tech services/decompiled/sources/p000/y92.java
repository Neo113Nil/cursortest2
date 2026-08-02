package p000;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class y92 extends q92 implements p92 {

    /* JADX INFO: renamed from: p */
    public final Exception f9250p;

    /* JADX INFO: renamed from: q */
    public final boolean f9251q;

    /* JADX WARN: Multi-variable type inference failed */
    public y92(String str, p92 p92Var, da2 da2Var, boolean z, ga2 ga2Var) {
        super("<missing root>:".concat(str), (n92) p92Var, da2.m1144a(da2Var, ca2.f1208f), ga2Var);
        this.f9250p = p92Var.mo3884b();
        this.f9251q = z;
    }

    @Override // p000.p92
    /* JADX INFO: renamed from: b */
    public final Exception mo3884b() {
        return this.f9250p;
    }

    @Override // p000.ha2
    /* JADX INFO: renamed from: c */
    public final da2 mo2245c() {
        return ca2.f1207e;
    }

    @Override // p000.ha2
    /* JADX INFO: renamed from: g */
    public final ha2 mo2247g(String str, da2 da2Var, ga2 ga2Var) {
        AtomicReference atomicReference = s92.f7076a;
        return mo3885h(str, da2Var, true, ga2Var);
    }

    @Override // p000.p92
    /* JADX INFO: renamed from: h */
    public final y92 mo3885h(String str, da2 da2Var, boolean z, ga2 ga2Var) {
        boolean z2 = this.f9251q;
        if (z && !z2) {
            AtomicReference atomicReference = s92.f7076a;
        }
        boolean z3 = true;
        if ((!z || z2) && !z2) {
            z3 = false;
        }
        return new y92(str, this, da2Var, z3, ga2Var);
    }

    public y92(UUID uuid, String str, String str2, da2 da2Var, Exception exc, ga2 ga2Var) {
        super("<missing root>:".concat(str2), uuid, str, da2.m1144a(da2Var, ca2.f1208f), ga2Var);
        this.f9250p = exc;
        this.f9251q = false;
    }
}
