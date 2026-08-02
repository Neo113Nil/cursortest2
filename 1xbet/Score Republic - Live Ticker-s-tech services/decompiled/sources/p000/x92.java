package p000;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class x92 extends n92 implements p92 {

    /* JADX INFO: renamed from: p */
    public static final p61 f8873p = new p61(3);

    /* JADX INFO: renamed from: o */
    public final Exception f8874o;

    public x92(UUID uuid, String str, Exception exc, ga2 ga2Var) {
        super("<missing root>", uuid, str, ga2Var);
        this.f8874o = exc;
    }

    @Override // p000.p92
    /* JADX INFO: renamed from: b */
    public final Exception mo3884b() {
        return this.f8874o;
    }

    @Override // p000.ha2
    /* JADX INFO: renamed from: d */
    public final da2 mo2246d() {
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
        if (z) {
            AtomicReference atomicReference = s92.f7076a;
        }
        return new y92(str, this, da2Var, z, ga2Var);
    }
}
