package com.fyber.inneractive.sdk.network.timeouts.request;

import com.fyber.inneractive.sdk.config.global.features.k;

/* loaded from: classes4.dex */
public final class d extends a {
    public d(String str, k kVar, String str2) {
        super(str, kVar, str2);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(k kVar, String str) {
        return kVar.c(str, this.l);
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int b(k kVar, String str) {
        String str2 = this.l;
        kVar.getClass();
        String a2 = k.a(str, "min", "rat", k.e(str2));
        "read".equalsIgnoreCase(str);
        Integer a3 = kVar.a(k.a(str, "min", "rat", "all_mediators"));
        int intValue = a3 != null ? a3.intValue() : 5000;
        Integer a4 = kVar.a(a2);
        return a4 != null ? a4.intValue() : intValue;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int c(k kVar, String str) {
        String str2 = this.l;
        kVar.getClass();
        String a2 = k.a(str, "rat", "perc", k.e(str2));
        String a3 = k.a(str, "rat", "perc", "all_mediators");
        int i = "read".equalsIgnoreCase(str) ? 15 : 10;
        Integer a4 = kVar.a(a3);
        if (a4 != null) {
            i = a4.intValue();
        }
        Integer a5 = kVar.a(a2);
        return a5 != null ? a5.intValue() : i;
    }

    @Override // com.fyber.inneractive.sdk.network.timeouts.request.a
    public final int a(k kVar) {
        String str = this.l;
        kVar.getClass();
        String a2 = k.a("timeout", "threshold", k.e(str));
        Integer a3 = kVar.a(k.a("timeout", "threshold", "all_mediators"));
        int intValue = a3 != null ? a3.intValue() : 300;
        Integer a4 = kVar.a(a2);
        return a4 != null ? a4.intValue() : intValue;
    }
}
