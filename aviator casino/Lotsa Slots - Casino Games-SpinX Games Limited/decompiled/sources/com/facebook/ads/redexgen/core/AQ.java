package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class AQ implements com.facebook.ads.redexgen.core.InterfaceC2132pF {
    public static java.lang.String[] A04 = {"fHQEiP1zlTMmcDhuRJvCUYhlqM3A1WdS", "0xjR5o24wRXCnK6P48nvJnLVp1A7yIdC", "SqWyKblZmsOi3mnFjBlOyIvINI4fuoz1", "GUT90kd8g0iIA", "yfLAFjbfQv", "f1jCtkpjn8LmH02gI7EE0X95Og8KENXi", "pIy67q2NMZ", "VUF0F4IbO37j7MJUWX75PYUeN7L9nYYd"};
    public int A00;
    public com.facebook.ads.redexgen.core.C04565i A01;
    public final java.util.ArrayList<com.facebook.ads.redexgen.core.InterfaceC04675t> A02 = new java.util.ArrayList<>(1);
    public final boolean A03;

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public /* synthetic */ java.util.Map A8t() {
        return com.facebook.ads.redexgen.core.C5X.A00(this);
    }

    public AQ(boolean z) {
        this.A03 = z;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void A0D(com.facebook.ads.redexgen.core.C04565i c04565i, boolean z) {
        this.A01 = c04565i;
        for (int i = 0; i < i; i++) {
            this.A02.get(i).AGH(this, c04565i, this.A03, z);
        }
    }

    public final void A0E() {
        com.facebook.ads.redexgen.core.C04565i c04565i = (com.facebook.ads.redexgen.core.C04565i) com.facebook.ads.redexgen.core.C5C.A0f(this.A01);
        for (int i = 0; i < this.A00; i++) {
            this.A02.get(i).AGG(this, c04565i, this.A03);
        }
        this.A01 = null;
    }

    public final void A0F(int i) {
        com.facebook.ads.redexgen.core.C04565i c04565i = (com.facebook.ads.redexgen.core.C04565i) com.facebook.ads.redexgen.core.C5C.A0f(this.A01);
        for (int i2 = 0; i2 < this.A00; i2++) {
            this.A02.get(i2).ADK(this, c04565i, this.A03, i);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0G(com.facebook.ads.redexgen.core.C04565i c04565i) {
        for (int i = 0; i < i; i++) {
            this.A02.get(i);
            if (A04[7].charAt(14) == 'P') {
                throw new java.lang.RuntimeException();
            }
            A04[2] = "KcnUkvSyZAFqCmq9nk7LLPyjKQRUe1pa";
        }
    }

    public final void A0H(com.facebook.ads.redexgen.core.C04565i c04565i) {
        A0D(c04565i, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final void A43(com.facebook.ads.redexgen.core.InterfaceC04675t interfaceC04675t) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(interfaceC04675t);
        if (!this.A02.contains(interfaceC04675t)) {
            this.A02.add(interfaceC04675t);
            this.A00++;
        }
    }
}
