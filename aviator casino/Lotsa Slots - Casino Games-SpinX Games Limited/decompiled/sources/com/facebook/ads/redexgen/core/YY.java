package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class YY implements android.view.View.OnClickListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0906Nm A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.VI A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.YZ A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.InterfaceC1177Yh A03;
    public final /* synthetic */ java.lang.String A04;

    public YY(com.facebook.ads.redexgen.core.YZ yz, com.facebook.ads.redexgen.core.VI vi, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, java.lang.String str, com.facebook.ads.redexgen.core.C0906Nm c0906Nm) {
        this.A02 = yz;
        this.A01 = vi;
        this.A03 = interfaceC1177Yh;
        this.A04 = str;
        this.A00 = c0906Nm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.C0926Og c0926Og;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.C1636gi c1636gi2;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A01.A04(com.facebook.ads.redexgen.core.VH.A0A, null);
            c0926Og = this.A02.A02;
            c1636gi = this.A02.A03;
            if (c0926Og.A0O(c1636gi.A02(), true)) {
                this.A03.AAo(this.A04, this.A00);
            } else if (!android.text.TextUtils.isEmpty(this.A00.A00())) {
                com.facebook.ads.redexgen.core.X6 x6 = new com.facebook.ads.redexgen.core.X6();
                c1636gi2 = this.A02.A03;
                com.facebook.ads.redexgen.core.X6.A0O(x6, c1636gi2, com.facebook.ads.redexgen.core.XB.A00(this.A00.A00()), this.A04);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
