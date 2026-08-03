package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Dh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0644Dh implements com.facebook.ads.redexgen.core.InterfaceC1524eu {
    public android.view.View A00;
    public com.facebook.ads.redexgen.core.C0673Ek A01;
    public com.facebook.ads.redexgen.core.EnumC1539f9 A02;
    public boolean A03;
    public final android.os.Handler A04;
    public final com.facebook.ads.redexgen.core.EA A05;
    public final com.facebook.ads.redexgen.core.E4 A06;
    public final com.facebook.ads.redexgen.core.E2 A07;
    public final com.facebook.ads.redexgen.core.AbstractC0656Dt A08;
    public final boolean A09;
    public final boolean A0A;

    public C0644Dh(android.view.View view, com.facebook.ads.redexgen.core.EnumC1539f9 enumC1539f9, boolean z) {
        this(view, enumC1539f9, z, false);
    }

    public C0644Dh(android.view.View view, com.facebook.ads.redexgen.core.EnumC1539f9 enumC1539f9, boolean z, boolean z2) {
        this.A06 = new com.facebook.ads.redexgen.core.E4() { // from class: com.facebook.ads.redexgen.X.3p
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4B c4b) {
                com.facebook.ads.redexgen.core.C0644Dh.this.A06(1, 0);
            }
        };
        this.A07 = new com.facebook.ads.redexgen.core.E2() { // from class: com.facebook.ads.redexgen.X.3n
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E3 e3) {
                boolean z3;
                com.facebook.ads.redexgen.core.EnumC1539f9 enumC1539f92;
                boolean z4;
                z3 = com.facebook.ads.redexgen.core.C0644Dh.this.A03;
                if (!z3) {
                    return;
                }
                enumC1539f92 = com.facebook.ads.redexgen.core.C0644Dh.this.A02;
                if (enumC1539f92 != com.facebook.ads.redexgen.core.EnumC1539f9.A02) {
                    z4 = com.facebook.ads.redexgen.core.C0644Dh.this.A09;
                    if (!z4) {
                        com.facebook.ads.redexgen.core.C0644Dh.this.A06(0, 8);
                        return;
                    }
                }
                com.facebook.ads.redexgen.core.C0644Dh.this.A02 = null;
                com.facebook.ads.redexgen.core.C0644Dh.this.A05();
            }
        };
        this.A05 = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.3e
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
                com.facebook.ads.redexgen.core.EnumC1539f9 enumC1539f92;
                android.view.View view2;
                android.view.View view3;
                enumC1539f92 = com.facebook.ads.redexgen.core.C0644Dh.this.A02;
                if (enumC1539f92 == com.facebook.ads.redexgen.core.EnumC1539f9.A03) {
                    return;
                }
                view2 = com.facebook.ads.redexgen.core.C0644Dh.this.A00;
                view2.setAlpha(1.0f);
                view3 = com.facebook.ads.redexgen.core.C0644Dh.this.A00;
                view3.setVisibility(0);
            }
        };
        this.A08 = new com.facebook.ads.redexgen.core.C04003c(this);
        this.A03 = true;
        this.A04 = new android.os.Handler();
        this.A09 = z;
        this.A0A = z2;
        A08(view, enumC1539f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new com.facebook.ads.redexgen.core.C1538f8(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(int i, int i2) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i);
        this.A00.setVisibility(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(android.view.View view, com.facebook.ads.redexgen.core.EnumC1539f9 enumC1539f9) {
        this.A02 = enumC1539f9;
        this.A00 = view;
        this.A00.clearAnimation();
        if (enumC1539f9 == com.facebook.ads.redexgen.core.EnumC1539f9.A03) {
            this.A00.setAlpha(0.0f);
            this.A00.setVisibility(8);
        } else {
            this.A00.setAlpha(1.0f);
            this.A00.setVisibility(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1524eu
    public final void AAv(com.facebook.ads.redexgen.core.C0673Ek c0673Ek) {
        this.A01 = c0673Ek;
        c0673Ek.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1524eu
    public final void AKV(com.facebook.ads.redexgen.core.C0673Ek c0673Ek) {
        A06(1, 0);
        c0673Ek.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
