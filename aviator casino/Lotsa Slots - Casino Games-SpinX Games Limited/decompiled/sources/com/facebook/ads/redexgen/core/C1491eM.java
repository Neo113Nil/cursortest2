package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.eM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1491eM {
    public com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A00;
    public final com.facebook.ads.redexgen.core.NN A01;
    public final com.facebook.ads.redexgen.core.NY A02;
    public final com.facebook.ads.redexgen.core.C0897Nd A03;
    public final com.facebook.ads.redexgen.core.C0906Nm A04;
    public final com.facebook.ads.redexgen.core.C1636gi A05;
    public final com.facebook.ads.redexgen.core.VI A06;
    public static final int A09 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
    public static final int A07 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 72.0f);
    public static final int A08 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 8.0f);

    public C1491eM(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        this.A05 = c1636gi;
        this.A06 = new com.facebook.ads.redexgen.core.VI(abstractC1801jd.A2E(), va);
        this.A01 = abstractC1801jd.A28();
        this.A02 = abstractC1801jd.A29().A0I();
        this.A04 = abstractC1801jd.A2C();
        this.A03 = abstractC1801jd.A29().A0K();
    }

    private android.view.View A00(com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr) {
        com.facebook.ads.redexgen.core.C1336bq c1336bq = new com.facebook.ads.redexgen.core.C1336bq(this.A05, this.A01.A01(), true, false, false);
        c1336bq.A04(this.A02.A0G(), this.A02.A04(), null, false, true);
        c1336bq.setAlignment(17);
        com.facebook.ads.redexgen.core.C1330bk c1330bk = new com.facebook.ads.redexgen.core.C1330bk(this.A05);
        com.facebook.ads.redexgen.core.YB.A0N(c1330bk, 0);
        c1330bk.setRadius(50);
        new com.facebook.ads.redexgen.core.LM(c1330bk, this.A05).A04().A07(this.A04.A01());
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c1330bk, new android.widget.LinearLayout.LayoutParams(A07, A07));
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c1336bq, layoutParams);
        if (viewOnClickListenerC0834Kr != null) {
            com.facebook.ads.redexgen.core.YB.A0J(viewOnClickListenerC0834Kr);
            linearLayout.addView(viewOnClickListenerC0834Kr, layoutParams);
            viewOnClickListenerC0834Kr.setPadding(com.facebook.ads.redexgen.core.XV.A0Z, 0, com.facebook.ads.redexgen.core.XV.A0Z, 0);
            if (android.text.TextUtils.isEmpty(viewOnClickListenerC0834Kr.getText())) {
                com.facebook.ads.redexgen.core.YB.A0H(viewOnClickListenerC0834Kr);
            }
        }
        return linearLayout;
    }

    private com.facebook.ads.redexgen.core.C7M A01() {
        com.facebook.ads.redexgen.core.C7M c7m = new com.facebook.ads.redexgen.core.C7M(this.A05);
        c7m.setLayoutManager(new com.facebook.ads.redexgen.core.C1706hr(this.A05, 0, false));
        c7m.setAdapter(new com.facebook.ads.redexgen.core.FH(this.A05, this.A03.A02(), A09, this.A00));
        return c7m;
    }

    private final com.facebook.ads.redexgen.core.EnumC1490eL A02() {
        if (!this.A03.A02().isEmpty()) {
            return com.facebook.ads.redexgen.core.EnumC1490eL.A03;
        }
        return com.facebook.ads.redexgen.core.EnumC1490eL.A02;
    }

    public final android.util.Pair<com.facebook.ads.redexgen.core.EnumC1490eL, android.view.View> A03(com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr) {
        android.view.View A01;
        this.A00 = viewOnClickListenerC0834Kr;
        com.facebook.ads.redexgen.core.EnumC1490eL A02 = A02();
        switch (A02) {
            case A03:
                A01 = A01();
                break;
            default:
                A01 = A00(this.A00);
                break;
        }
        com.facebook.ads.redexgen.core.VK.A04(A01, this.A06, com.facebook.ads.redexgen.core.VH.A0S);
        return new android.util.Pair<>(A02, A01);
    }
}
