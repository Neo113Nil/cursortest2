package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1711hw implements com.facebook.ads.redexgen.core.QD {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C7Q A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.Q8 A01;

    public C1711hw(com.facebook.ads.redexgen.core.C7Q c7q, com.facebook.ads.redexgen.core.Q8 q8) {
        this.A00 = c7q;
        this.A01 = q8;
    }

    @Override // com.facebook.ads.redexgen.core.QD
    public final java.lang.Object A5G(int i) {
        com.facebook.ads.redexgen.core.Q6 compatInfo = this.A01.A00(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.core.QD
    public final java.util.List<java.lang.Object> A6Y(java.lang.String str, int i) {
        java.util.List<com.facebook.ads.redexgen.core.Q6> A03 = this.A01.A03(str, i);
        if (A03 == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int infoCount = A03.size();
        for (int i2 = 0; i2 < infoCount; i2++) {
            arrayList.add(A03.get(i2).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.core.QD
    public final java.lang.Object A6Z(int i) {
        com.facebook.ads.redexgen.core.Q6 compatInfo = this.A01.A01(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.core.QD
    public final boolean AGv(int i, int i2, android.os.Bundle bundle) {
        return this.A01.A04(i, i2, bundle);
    }
}
