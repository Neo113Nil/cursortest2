package p000;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q92 extends n92 {

    /* JADX INFO: renamed from: o */
    public final da2 f6431o;

    public q92(String str, n92 n92Var, da2 da2Var, ga2 ga2Var) {
        super(str, n92Var, ga2Var);
        a90.m123g(da2Var.f1603c);
        this.f6431o = da2Var;
    }

    @Override // p000.ha2
    /* JADX INFO: renamed from: d */
    public final da2 mo2246d() {
        return da2.m1144a(this.f6431o, mo2245c());
    }

    public q92(String str, UUID uuid, String str2, da2 da2Var, ga2 ga2Var) {
        super(str, uuid, str2, ga2Var);
        a90.m123g(da2Var.f1603c);
        this.f6431o = da2Var;
    }
}
