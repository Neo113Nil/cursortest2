package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class FH extends com.facebook.ads.redexgen.core.AbstractC0984Qq<com.facebook.ads.redexgen.core.FC> {
    public final int A00;
    public final com.facebook.ads.redexgen.core.C1636gi A01;
    public final com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A02;
    public final java.util.List<java.lang.String> A03;

    public FH(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.util.List<java.lang.String> screenshotUrls, int i, com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr) {
        this.A03 = screenshotUrls;
        this.A00 = i;
        this.A01 = c1636gi;
        this.A02 = viewOnClickListenerC0834Kr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC0984Qq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.FC A0F(android.view.ViewGroup viewGroup, int i) {
        com.facebook.ads.redexgen.core.FD fd = new com.facebook.ads.redexgen.core.FD(this.A01);
        if (com.facebook.ads.redexgen.core.C1086Up.A1D(this.A01)) {
            fd.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1503eZ(this));
        }
        return new com.facebook.ads.redexgen.core.FC(fd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC0984Qq
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0K(com.facebook.ads.redexgen.core.FC fc, int i) {
        java.lang.String str = this.A03.get(i);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -1);
        int startSpacing = this.A00 * 4;
        if (i != 0) {
            startSpacing = this.A00;
        }
        marginLayoutParams.setMargins(startSpacing, 0, i >= A0B() + (-1) ? this.A00 * 4 : this.A00, 0);
        fc.A0p().setLayoutParams(marginLayoutParams);
        fc.A0p().A00(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0984Qq
    public final int A0B() {
        return this.A03.size();
    }
}
