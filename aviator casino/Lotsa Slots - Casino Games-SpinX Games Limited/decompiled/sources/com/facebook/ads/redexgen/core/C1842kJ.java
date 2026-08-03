package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1842kJ implements com.facebook.ads.redexgen.core.InterfaceC0891Mw {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1636gi A00;
    public final /* synthetic */ java.lang.String A01;
    public final /* synthetic */ org.json.JSONObject A02;

    public C1842kJ(org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.String str) {
        this.A02 = jSONObject;
        this.A00 = c1636gi;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Mw
    public final java.lang.String A7O() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Mw
    public final java.util.Collection<java.lang.String> A7p() {
        return com.facebook.ads.redexgen.core.AbstractC0892Mx.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Mw
    public final com.facebook.ads.redexgen.core.EnumC0890Mv A8K() {
        return com.facebook.ads.redexgen.core.AbstractC0892Mx.A00(this.A02);
    }
}
