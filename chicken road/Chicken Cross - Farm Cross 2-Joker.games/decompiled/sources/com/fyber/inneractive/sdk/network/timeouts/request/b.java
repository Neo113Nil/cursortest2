package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.k;

/* loaded from: classes4.dex */
public final class b extends a {
    public b(k kVar, String str) {
        super(str, kVar, null);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(k kVar, String str) {
        kVar.getClass();
        String str2 = str + "_global_timeout";
        int i = k.d(str) ? 30000 : 10000;
        Integer a2 = kVar.a(str2);
        return a2 != null ? a2.intValue() : i;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b(k kVar, String str) {
        kVar.getClass();
        String a2 = k.a(str, "min", "rat");
        "read".equalsIgnoreCase(str);
        Integer a3 = kVar.a(a2);
        if (a3 != null) {
            return a3.intValue();
        }
        return 5000;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c(k kVar, String str) {
        kVar.getClass();
        String a2 = k.a(str, "rat_perc");
        int i = "read".equalsIgnoreCase(str) ? 15 : 10;
        Integer a3 = kVar.a(a2);
        return a3 != null ? a3.intValue() : i;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(k kVar) {
        kVar.getClass();
        Integer a2 = kVar.a(k.a("timeout", "threshold"));
        if (a2 != null) {
            return a2.intValue();
        }
        return 300;
    }
}
