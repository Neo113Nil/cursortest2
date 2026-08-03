package com.fyber.inneractive.sdk.flow.storepromo.loader.network;

/* loaded from: classes3.dex */
public final class a extends com.fyber.inneractive.sdk.network.c1 {
    public int q;

    public a(java.lang.String str, com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks.b bVar) {
        super(bVar, str, null);
    }

    @Override // com.fyber.inneractive.sdk.network.c1, com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.o0 a(com.fyber.inneractive.sdk.network.l lVar, java.util.Map map, int i) {
        int a2;
        int a3 = com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b.a("sp_max_size", 307200, 0);
        this.q = a3;
        int i2 = a3 + 10;
        if (lVar != null && (a2 = com.fyber.inneractive.sdk.network.t0.a(lVar.d)) >= 0) {
            i2 = a2;
        }
        long j = i2;
        int i3 = this.q;
        if (j <= i3) {
            return super.a(lVar, map, i);
        }
        throw new com.fyber.inneractive.sdk.flow.storepromo.loader.network.exception.a("The image exceeds the maximal size: " + i3 + ", actual size: " + i2);
    }
}
