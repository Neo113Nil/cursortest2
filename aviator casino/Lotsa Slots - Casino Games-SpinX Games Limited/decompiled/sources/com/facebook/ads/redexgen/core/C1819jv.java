package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1819jv extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1818ju A00;
    public final /* synthetic */ java.util.Map A01;
    public final /* synthetic */ java.util.Map A02;

    public C1819jv(com.facebook.ads.redexgen.core.C1818ju c1818ju, java.util.Map map, java.util.Map map2) {
        this.A00 = c1818ju;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        com.facebook.ads.redexgen.core.C1806ji c1806ji;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.C1806ji c1806ji2;
        c1806ji = this.A00.A01;
        if (!android.text.TextUtils.isEmpty(c1806ji.A7O())) {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Map<java.lang.String, java.lang.String> extraData = this.A02;
            hashMap.putAll(extraData);
            java.util.Map<java.lang.String, java.lang.String> extraData2 = this.A01;
            hashMap.putAll(extraData2);
            c1636gi = this.A00.A0A;
            com.facebook.ads.redexgen.core.VA A0A = c1636gi.A0A();
            c1806ji2 = this.A00.A01;
            A0A.AC3(c1806ji2.A7O(), hashMap);
        }
    }
}
