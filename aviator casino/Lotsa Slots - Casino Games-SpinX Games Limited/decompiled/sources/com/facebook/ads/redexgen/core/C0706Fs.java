package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Fs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0706Fs extends com.facebook.ads.redexgen.core.AbstractC1580fo {
    public final /* synthetic */ com.facebook.ads.redexgen.core.VA A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.Y2 A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1474e5 A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0704Fq A03;
    public final /* synthetic */ java.lang.String A04;
    public final /* synthetic */ java.util.Map A05;

    public C0706Fs(com.facebook.ads.redexgen.core.C0704Fq c0704Fq, java.lang.String str, com.facebook.ads.redexgen.core.C1474e5 c1474e5, com.facebook.ads.redexgen.core.VA va, java.util.Map map, com.facebook.ads.redexgen.core.Y2 y2) {
        this.A03 = c0704Fq;
        this.A04 = str;
        this.A02 = c1474e5;
        this.A00 = va;
        this.A05 = map;
        this.A01 = y2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1580fo
    public final void A03() {
        com.facebook.ads.redexgen.core.C1581fp c1581fp;
        android.util.SparseBooleanArray sparseBooleanArray;
        com.facebook.ads.redexgen.core.C1581fp c1581fp2;
        com.facebook.ads.redexgen.core.C0900Ng c0900Ng;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        android.util.SparseBooleanArray sparseBooleanArray2;
        c1581fp = this.A03.A02;
        if (!c1581fp.A0Z() && !android.text.TextUtils.isEmpty(this.A04)) {
            sparseBooleanArray = this.A03.A05;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                com.facebook.ads.redexgen.core.VA va = this.A00;
                java.lang.String str = this.A04;
                com.facebook.ads.redexgen.core.C1293b9 c1293b9 = new com.facebook.ads.redexgen.core.C1293b9(this.A05);
                c1581fp2 = this.A03.A03;
                va.ABJ(str, c1293b9.A03(c1581fp2).A02(this.A01).A05());
                c0900Ng = this.A03.A00;
                c1636gi = this.A03.A06;
                com.facebook.ads.redexgen.core.C0900Ng.A07(c0900Ng, c1636gi);
                sparseBooleanArray2 = this.A03.A05;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}
