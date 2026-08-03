package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class ED extends android.widget.RelativeLayout implements com.facebook.ads.redexgen.core.InterfaceC1524eu {
    public com.facebook.ads.redexgen.core.C0673Ek A00;

    public ED(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        super(c1636gi);
    }

    public ED(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.util.AttributeSet attributeSet, int i) {
        super(c1636gi, attributeSet, i);
        android.widget.RelativeLayout.LayoutParams params = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1524eu
    public final void AAv(com.facebook.ads.redexgen.core.C0673Ek c0673Ek) {
        this.A00 = c0673Ek;
        A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1524eu
    public final void AKV(com.facebook.ads.redexgen.core.C0673Ek c0673Ek) {
        A08();
        this.A00 = null;
    }

    public com.facebook.ads.redexgen.core.C0673Ek getVideoView() {
        return this.A00;
    }
}
