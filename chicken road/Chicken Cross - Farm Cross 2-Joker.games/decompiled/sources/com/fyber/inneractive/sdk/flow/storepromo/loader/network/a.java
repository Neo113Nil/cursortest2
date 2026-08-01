package com.fyber.inneractive.sdk.flow.storepromo.loader.network;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.c1;
import com.fyber.inneractive.sdk.network.l;
import com.fyber.inneractive.sdk.network.o0;
import com.fyber.inneractive.sdk.network.t0;
import java.util.Map;

/* loaded from: classes4.dex */
public final class a extends c1 {
    public int r;

    public a(String str, com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks.b bVar) {
        super(bVar, str, null);
    }

    @Override // com.fyber.inneractive.sdk.network.c1, com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i) {
        int a2;
        int a3 = IAConfigManager.R.u.b.a("sp_max_size", 307200, 0);
        this.r = a3;
        int i2 = a3 + 10;
        if (lVar != null && (a2 = t0.a(lVar.d)) >= 0) {
            i2 = a2;
        }
        long j = i2;
        int i3 = this.r;
        if (j <= i3) {
            return super.a(lVar, map, i);
        }
        throw new com.fyber.inneractive.sdk.flow.storepromo.loader.network.exception.a("The image exceeds the maximal size: " + i3 + ", actual size: " + i2);
    }
}
