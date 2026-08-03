package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.5h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04555h extends com.facebook.ads.redexgen.core.AbstractC0775Ij {
    public static java.lang.String[] A09 = {"48gXxVXafINQx", "X9eHMFtmNxkudREV2ga0mL63IUwpVFyn", "fDHVKSg", "BJ3S", "6p1nQLD", "GwvdfXoW7Tkcgx6xI32", "XjSW5yJHqMwpzXQP1hTrWYHuzeodWOV3", "mLwcnNPCnn6Mi"};
    public static final android.widget.RelativeLayout.LayoutParams A0A = new android.widget.RelativeLayout.LayoutParams(-1, -1);
    public com.facebook.ads.redexgen.core.XO A00;
    public com.facebook.ads.redexgen.core.AbstractC1349c3 A01;
    public com.facebook.ads.redexgen.core.DZ A02;
    public final int A03;
    public final android.widget.ImageView A04;
    public final com.facebook.ads.redexgen.core.VI A05;
    public final com.facebook.ads.redexgen.core.AbstractC1171Yb A06;
    public final com.facebook.ads.redexgen.core.InterfaceC1456dm A07;
    public final java.util.concurrent.atomic.AtomicBoolean A08;

    public C04555h(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.ZU zu, int i, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb, com.facebook.ads.redexgen.core.VI vi, boolean z, boolean z2, com.facebook.ads.redexgen.core.InterfaceC1456dm interfaceC1456dm, int i2, int i3) {
        super(c1636gi, zu, va, abstractC1801jd, i, z, z2, interfaceC1177Yh, i3);
        this.A08 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A03 = i2;
        this.A07 = interfaceC1456dm;
        this.A04 = new android.widget.ImageView(getContext());
        this.A06 = abstractC1171Yb;
        this.A05 = vi;
        if (abstractC1801jd.A1c()) {
            this.A02 = new com.facebook.ads.redexgen.core.DZ(c1636gi, this.A03);
        }
        this.A04.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.A04.setAdjustViewBounds(true);
        new com.facebook.ads.redexgen.core.LM(this.A04, c1636gi).A05(abstractC1801jd.A29().A0H().A00(), abstractC1801jd.A29().A0H().A01()).A06(new com.facebook.ads.redexgen.core.C0773Ih(this)).A07(abstractC1801jd.A29().A0H().A08());
        A08(c1636gi.getResources().getConfiguration().orientation);
    }

    private com.facebook.ads.redexgen.core.AbstractC1349c3 A02(int i) {
        if (this.A04.getParent() != null) {
            com.facebook.ads.redexgen.core.YB.A0J(this.A04);
        }
        boolean z = i != 2;
        com.facebook.ads.redexgen.core.C1352c6 c1352c6 = new com.facebook.ads.redexgen.core.C1352c6(super.A07, super.A08, this.A0B, super.A06, this.A04, this.A0D, this.A0A);
        com.facebook.ads.redexgen.core.C1352c6 interstitialLayoutParamsBuilder = c1352c6.A0J(this.A06.getToolbarHeight());
        interstitialLayoutParamsBuilder.A0P(this.A06).A0I(i).A0T(z).A0S(super.A00).A0M(this.A05);
        if (this.A02 != null) {
            c1352c6.A0R(this.A02);
        }
        c1352c6.A0L(com.facebook.ads.redexgen.core.C0889Mu.A00(super.A07, super.A08, "", com.facebook.ads.redexgen.core.XB.A00(super.A06.A29().A0J().A05()), new java.util.HashMap(), super.A06.A2A()));
        c1352c6.A0Q(this.A07);
        return com.facebook.ads.redexgen.core.AbstractC1350c4.A00(c1352c6.A0U(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A08.get()) {
            A1F();
        }
    }

    private void A08(int i) {
        com.facebook.ads.redexgen.core.YB.A0J(this.A01);
        this.A01 = A02(i);
        if (this.A01 instanceof com.facebook.ads.redexgen.core.KE) {
            ((com.facebook.ads.redexgen.core.KE) this.A01).setChildChainedAd(true);
        } else if (this.A01 instanceof com.facebook.ads.redexgen.core.C0799Ji) {
            com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c3 = this.A01;
            java.lang.String[] strArr = A09;
            if (strArr[1].charAt(0) != strArr[6].charAt(0)) {
                throw new java.lang.RuntimeException();
            }
            A09[5] = "Sp2NSSouatJBlog5Q54";
            ((com.facebook.ads.redexgen.core.C0799Ji) abstractC1349c3).setChildChainedAd(true);
        }
        addView(this.A01, 0, A0A);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final com.facebook.ads.redexgen.core.EnumC0885Mq A1D(java.lang.String str) {
        return this.A01.A1B(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final void A1E() {
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(super.A07)) {
            super.A07.A0B().AKU(this.A04);
        }
        if (this.A01 != null) {
            this.A01.A1C();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final void A1G() {
        if (this.A01 instanceof com.facebook.ads.redexgen.core.C0819Kc) {
            com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c3 = this.A01;
            java.lang.String[] strArr = A09;
            if (strArr[7].length() != strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            A09[3] = "fHRV";
            ((com.facebook.ads.redexgen.core.C0819Kc) abstractC1349c3).A1Q();
            return;
        }
        if (this.A01 instanceof com.facebook.ads.redexgen.core.C0799Ji) {
            ((com.facebook.ads.redexgen.core.C0799Ji) this.A01).A1Q(false);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final void A1H() {
        int A02 = super.A06.A29().A0H().A02();
        int secondsForNextCta = this.A03;
        if (secondsForNextCta > 0) {
            this.A00 = new com.facebook.ads.redexgen.core.XO(this.A03, 100.0f, 100L, new android.os.Handler(android.os.Looper.getMainLooper()), new com.facebook.ads.redexgen.core.C0771If(this));
            this.A00.A07();
            if (A02 >= 0) {
                this.A06.setProgressSpinnerInvisible(true);
            }
            if (A02 != 0) {
                int secondsForNextCta2 = this.A03;
                if (A02 < secondsForNextCta2) {
                    if (A02 <= 0) {
                        return;
                    }
                    new com.facebook.ads.redexgen.core.XO(A02, new com.facebook.ads.redexgen.core.C0769Id(this)).A07();
                    return;
                }
            }
            this.A06.setToolbarActionMode(8);
            return;
        }
        this.A07.AFw(false);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final void A1I(boolean z) {
        this.A01.setChainedWatchAndBrowseSkippableStatus(z);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final void A1J(boolean z) {
        if (this.A00 != null && this.A00.A05()) {
            this.A00.A06();
        }
        if (this.A01 != null) {
            this.A01.A1L(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final void A1K(boolean z) {
        if (this.A00 != null && !this.A00.A04()) {
            this.A00.A07();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final boolean A1L() {
        if (this.A01.A1M()) {
            if (!(this.A01 instanceof com.facebook.ads.redexgen.core.C0819Kc) || ((com.facebook.ads.redexgen.core.C0819Kc) this.A01).A1R()) {
                return (this.A01 instanceof com.facebook.ads.redexgen.core.C0799Ji) && !((com.facebook.ads.redexgen.core.C0799Ji) this.A01).A1S();
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final boolean A1M() {
        if (this.A01 instanceof com.facebook.ads.redexgen.core.C0819Kc) {
            return ((com.facebook.ads.redexgen.core.C0819Kc) this.A01).A1R();
        }
        boolean z = this.A01 instanceof com.facebook.ads.redexgen.core.C0799Ji;
        java.lang.String[] strArr = A09;
        if (strArr[1].charAt(0) != strArr[6].charAt(0)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A09;
        strArr2[2] = "VUX6Wbk";
        strArr2[4] = "Kq1l7t9";
        if (z) {
            return ((com.facebook.ads.redexgen.core.C0799Ji) this.A01).A1S();
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public final boolean A1N() {
        if (this.A01 instanceof com.facebook.ads.redexgen.core.C0819Kc) {
            return ((com.facebook.ads.redexgen.core.C0819Kc) this.A01).A1S();
        }
        if (this.A01 instanceof com.facebook.ads.redexgen.core.C0799Ji) {
            return ((com.facebook.ads.redexgen.core.C0799Ji) this.A01).A1T();
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij
    public com.facebook.ads.redexgen.core.C1454dk getFullScreenAdStyle() {
        com.facebook.ads.redexgen.core.C0894Na colors = this.A01.getColors();
        return new com.facebook.ads.redexgen.core.C1454dk(this.A01.A1O(), com.facebook.ads.redexgen.core.C1454dk.A07, colors, com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr.A05(super.A06), colors.A08(this.A01.A1O() || (this.A01 instanceof com.facebook.ads.redexgen.core.AbstractC0817Ka)), null);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0775Ij, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A01 instanceof com.facebook.ads.redexgen.core.C0819Kc) {
            this.A01.onConfigurationChanged(configuration);
        } else if (!super.A06.A29().A0T()) {
            A08(configuration.orientation);
        }
    }
}
