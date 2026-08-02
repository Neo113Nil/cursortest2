package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xv0 extends nj0 {

    /* JADX INFO: renamed from: a */
    public static final boolean f9089a;

    static {
        f9089a = !gw0.m2161a(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"));
    }

    @Override // p000.nj0
    /* JADX INFO: renamed from: a */
    public final String mo1102a() {
        return "pick_first";
    }

    @Override // p000.nj0
    /* JADX INFO: renamed from: b */
    public final mj0 mo1103b(AbstractC0477mo abstractC0477mo) {
        return f9089a ? new tv0(abstractC0477mo) : new wv0(abstractC0477mo);
    }

    @Override // p000.nj0
    /* JADX INFO: renamed from: c */
    public final dr0 mo1104c(Map map) {
        try {
            return new dr0(new uv0(wo1.m5382g("shuffleAddressList", map)));
        } catch (RuntimeException e) {
            return new dr0(ja1.f3883m.m2839g(e).m2840h("Failed parsing configuration for pick_first"));
        }
    }
}
