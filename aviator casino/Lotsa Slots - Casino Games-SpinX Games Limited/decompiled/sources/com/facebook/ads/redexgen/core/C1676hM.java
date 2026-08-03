package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1676hM extends com.facebook.ads.redexgen.core.N2 {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"G2rh", "Fb5x", "6CyVQJjLjUxkB4NOtEwwqOuY7kB2daf", "v2svMG5ZVzKjVXyH1MXvdM9krQWCKsNq", "oRWr7RpHwOoI3beQIRyDA09DO9LlUwST", "SjgxBMhR0kRV74MEQavsGpgIJGrbvWLl", "8l9W", "lapvzpZuNASF"};
    public android.view.View A00;
    public final com.facebook.ads.redexgen.core.C0997Rd A01;
    public final com.facebook.ads.redexgen.core.AnonymousClass76 A02;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 16);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {69, 103, 104, 104, 105, 114, 38, 118, 116, 99, 117, 99, 104, 114, 38, 104, 115, 106, 106, 38, 103, 98, 80, 111, 99, 113};
        if (A04[7].length() == 31) {
            throw new java.lang.RuntimeException();
        }
        A04[0] = "ScK1";
        A03 = bArr;
    }

    static {
        A03();
    }

    public C1676hM(com.facebook.ads.redexgen.core.C0997Rd c0997Rd) {
        this.A02 = c0997Rd.A09();
        this.A01 = c0997Rd;
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0C() {
        this.A02.A0F().A4U();
        com.facebook.ads.redexgen.core.WT.A00(new com.facebook.ads.redexgen.core.C1678hO(this));
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0D() {
        this.A02.A0F().A4X();
        com.facebook.ads.redexgen.core.WT.A00(new com.facebook.ads.redexgen.core.C1677hN(this));
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0E(android.view.View view) {
        if (view != null) {
            com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass76 = this.A02;
            java.lang.String[] strArr = A04;
            if (strArr[6].length() != strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            A04[0] = "eqHc";
            anonymousClass76.A0F().A4W();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if ((this.A00 instanceof com.facebook.ads.redexgen.core.LV) || (this.A00 instanceof com.facebook.ads.redexgen.core.Z2)) {
                com.facebook.ads.redexgen.core.AbstractC1113Vs.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            com.facebook.ads.redexgen.core.C05107k controller = this.A01.A08();
            if (controller != null) {
                controller.A0L();
            }
            com.facebook.ads.redexgen.core.WT.A00(new com.facebook.ads.redexgen.core.C1679hP(this));
            this.A01.A0B(this.A01.A07(), this.A00);
            if (com.facebook.ads.redexgen.core.C1086Up.A1C(this.A01.A07().getContext())) {
                com.facebook.ads.redexgen.core.C1290b6 c1290b6 = new com.facebook.ads.redexgen.core.C1290b6();
                this.A01.A0D(c1290b6);
                c1290b6.A0C(this.A01.getPlacementId());
                c1290b6.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0J() != null) {
                    c1290b6.A09(this.A01.A08().A0J().A0C());
                }
                if (this.A00 instanceof com.facebook.ads.redexgen.core.LV) {
                    c1290b6.A0A(((com.facebook.ads.redexgen.core.LV) this.A00).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new com.facebook.ads.redexgen.core.ViewOnLongClickListenerC1005Rl(this, c1290b6));
                this.A00.getOverlay().add(c1290b6);
                return;
            }
            return;
        }
        throw new java.lang.IllegalStateException(A02(0, 26, 22));
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0F(com.facebook.ads.redexgen.core.N1 n1) {
        this.A02.A0F().A4V(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0M();
        }
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0G(com.facebook.ads.redexgen.core.C1108Vm c1108Vm) {
        this.A02.A0F().A3N(com.facebook.ads.redexgen.core.Y1.A01(this.A01.A04()), c1108Vm.A03().getErrorCode(), c1108Vm.A04());
        com.facebook.ads.redexgen.core.WT.A00(new com.facebook.ads.redexgen.core.C1680hQ(this, c1108Vm));
    }
}
