package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class DR implements com.facebook.ads.redexgen.core.InterfaceC1550fK {
    public int A00;
    public android.animation.ValueAnimator A01;
    public com.facebook.ads.redexgen.core.EnumC1549fJ A02 = com.facebook.ads.redexgen.core.EnumC1549fJ.A04;
    public final int A03;
    public final int A04;
    public final android.view.View A05;

    public DR(android.view.View view, int i, int i2, int i3) {
        this.A05 = view;
        this.A03 = i;
        this.A00 = i2;
        this.A04 = i3;
    }

    private android.animation.ValueAnimator A00(int i, int i2, android.view.View view) {
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(this.A03);
        ofInt.addUpdateListener(new com.facebook.ads.redexgen.core.C1553fN(this, view));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z) {
        if (z) {
            this.A02 = com.facebook.ads.redexgen.core.EnumC1549fJ.A05;
            this.A01 = A00(this.A00, this.A04, this.A05);
            this.A01.addListener(new com.facebook.ads.redexgen.core.C1552fM(this));
            this.A01.start();
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        com.facebook.ads.redexgen.core.YB.A0H(this.A05);
        this.A02 = com.facebook.ads.redexgen.core.EnumC1549fJ.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z) {
        com.facebook.ads.redexgen.core.YB.A0L(this.A05);
        if (z) {
            this.A02 = com.facebook.ads.redexgen.core.EnumC1549fJ.A03;
            this.A01 = A00(this.A04, this.A00, this.A05);
            this.A01.addListener(new com.facebook.ads.redexgen.core.C1551fL(this));
            this.A01.start();
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = com.facebook.ads.redexgen.core.EnumC1549fJ.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1550fK
    public final void A4A(boolean z, boolean z2) {
        if (z2) {
            A07(z);
        } else {
            A08(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1550fK
    public final com.facebook.ads.redexgen.core.EnumC1549fJ A9B() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1550fK
    public final void cancel() {
        if (this.A01 != null) {
            this.A01.cancel();
        }
    }
}
