package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1299bF extends android.widget.LinearLayout {
    public static byte[] A0A;
    public static final android.widget.LinearLayout.LayoutParams A0B;
    public android.widget.LinearLayout A00;
    public android.widget.TextView A01;
    public java.lang.String A02;
    public boolean A03;
    public final int A04;
    public final android.view.View.OnClickListener A05;
    public final android.widget.RelativeLayout A06;
    public final com.facebook.ads.redexgen.core.C1636gi A07;
    public final com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A08;
    public final com.facebook.ads.redexgen.core.C1330bk A09;

    public static java.lang.String A0h(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 11);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0i() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public abstract void A0l(int i);

    static {
        A0i();
        A0B = new android.widget.LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC1299bF(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr, int i, com.facebook.ads.redexgen.core.C0894Na c0894Na, boolean z, java.lang.String str, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.C1581fp c1581fp, com.facebook.ads.redexgen.core.Y2 y2, com.facebook.ads.redexgen.core.C0900Ng c0900Ng, boolean z2, java.lang.String str2) {
        super(c1636gi);
        this.A02 = A0h(0, 0, 37);
        com.facebook.ads.redexgen.core.YB.A0K(this);
        this.A07 = c1636gi;
        this.A04 = i;
        this.A03 = z2;
        this.A02 = str2;
        this.A09 = new com.facebook.ads.redexgen.core.C1330bk(c1636gi);
        com.facebook.ads.redexgen.core.YB.A0N(this.A09, 0);
        com.facebook.ads.redexgen.core.YB.A0K(this.A09);
        if (z2) {
            this.A00 = new android.widget.LinearLayout(c1636gi);
            this.A01 = new android.widget.TextView(c1636gi);
            com.facebook.ads.redexgen.core.YB.A0K(this.A01);
        }
        if (viewOnClickListenerC0834Kr == null) {
            this.A08 = new com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr(c1636gi, str, c0894Na, z, va, interfaceC1177Yh, c1581fp, y2, c0900Ng);
        } else {
            this.A08 = viewOnClickListenerC0834Kr;
        }
        com.facebook.ads.redexgen.core.YB.A0G(1001, this.A08);
        this.A05 = com.facebook.ads.redexgen.core.AbstractC1340bu.A03(this.A08, A0h(0, 9, 52));
        this.A06 = new android.widget.RelativeLayout(c1636gi);
        this.A06.setLayoutParams(A0B);
        com.facebook.ads.redexgen.core.YB.A0K(this.A06);
    }

    public void A0j() {
    }

    public void A0k() {
        this.A09.setOnClickListener(this.A05);
    }

    public void A0m(boolean z) {
    }

    public final com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr getCTAButton() {
        return this.A08;
    }

    public android.view.View getExpandableLayout() {
        return null;
    }

    public final android.widget.ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(com.facebook.ads.redexgen.core.NY ny, com.facebook.ads.redexgen.core.C0896Nc c0896Nc, java.lang.String str, java.lang.String str2, com.facebook.ads.redexgen.core.InterfaceC1151Xh interfaceC1151Xh, com.facebook.ads.redexgen.core.InterfaceC1314bU interfaceC1314bU) {
        this.A08.setCta(c0896Nc, str, new java.util.HashMap(), interfaceC1151Xh, interfaceC1314bU);
        new com.facebook.ads.redexgen.core.LM(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i) {
    }
}
