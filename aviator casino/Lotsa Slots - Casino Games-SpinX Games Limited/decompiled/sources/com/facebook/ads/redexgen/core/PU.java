package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class PU extends com.facebook.ads.redexgen.core.AbstractC1171Yb {
    public static byte[] A03;
    public com.facebook.ads.redexgen.core.C1636gi A00;
    public com.facebook.ads.redexgen.core.InterfaceC1170Ya A01;
    public final com.facebook.ads.redexgen.core.ZM A02;

    static {
        A05();
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 75);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-75, -34, -31, -27, -41, -110, -77, -42};
    }

    public PU(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, int i) {
        super(c1636gi);
        this.A00 = c1636gi;
        setGravity(16);
        A04();
        this.A02 = new com.facebook.ads.redexgen.core.ZM(this.A00, abstractC1801jd, i);
        A03();
    }

    private void A03() {
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        this.A02.setContentDescription(A02(0, 8, 39));
        this.A02.setActionClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1187Yr(this));
        addView(this.A02, layoutParams);
    }

    private void A04() {
        android.view.View view = new android.view.View(this.A00);
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public final void A0A() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public final void A0B() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public final void A0C(float f, int i) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public final void A0D(com.facebook.ads.redexgen.core.C0894Na c0894Na, boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public final boolean A0E() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public int getToolbarActionMode() {
        return this.A02.getToolbarActionMode();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public int getToolbarHeight() {
        return com.facebook.ads.redexgen.core.AbstractC1171Yb.A01;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public com.facebook.ads.redexgen.core.InterfaceC1170Ya getToolbarListener() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setAdReportingVisible(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setCTAClickListener(android.view.View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setCTAClickListener(com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setFullscreen(boolean z) {
    }

    public void setInitialUnskippableSeconds(int i) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setPageDetails(com.facebook.ads.redexgen.core.C0906Nm c0906Nm, java.lang.String str, int i, com.facebook.ads.redexgen.core.C0912Ns c0912Ns) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setPageDetailsVisible(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setProgress(float f) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setProgressClickListener(android.view.View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setProgressImage(com.facebook.ads.redexgen.core.YM ym) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setProgressImmediate(float f) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setProgressSpinnerInvisible(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setToolbarActionMessage(java.lang.String str) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setToolbarActionMode(int i) {
        this.A02.setToolbarActionMode(i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setToolbarListener(com.facebook.ads.redexgen.core.InterfaceC1170Ya interfaceC1170Ya) {
        this.A01 = interfaceC1170Ya;
    }
}
