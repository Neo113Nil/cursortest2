package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.c3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1349c3 extends android.widget.RelativeLayout {
    public static final int A08 = com.facebook.ads.redexgen.core.XV.A0b;
    public static final int A09 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 28.0f);
    public static final int A0A = (int) (com.facebook.ads.redexgen.core.XX.A02 * 32.0f);
    public com.facebook.ads.redexgen.core.C0894Na A00;
    public boolean A01;
    public com.facebook.ads.redexgen.core.C1241aJ A02;
    public final com.facebook.ads.redexgen.core.C1636gi A03;
    public final com.facebook.ads.redexgen.core.VA A04;
    public final com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A05;
    public final com.facebook.ads.redexgen.core.C1336bq A06;
    public final com.facebook.ads.redexgen.core.C1353c7 A07;

    public abstract boolean A1O();

    public AbstractC1349c3(com.facebook.ads.redexgen.core.C1353c7 c1353c7, boolean z) {
        super(c1353c7.A06());
        com.facebook.ads.redexgen.core.C0894Na A00;
        this.A07 = c1353c7;
        this.A03 = c1353c7.A06();
        this.A04 = c1353c7.A07();
        if (c1353c7.A00() == 1) {
            A00 = c1353c7.A05().A28().A01();
        } else {
            A00 = c1353c7.A05().A28().A00();
        }
        this.A00 = A00;
        this.A01 = z;
        this.A05 = new com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr(c1353c7.A06(), c1353c7.A05(), this.A00, c1353c7.A07(), c1353c7.A0C(), c1353c7.A0F(), c1353c7.A0A(), c1353c7.A09());
        this.A05.setRoundedCornersEnabled(A02());
        this.A05.setViewShowsOverMedia(A0A());
        this.A05.setV2Design(A04());
        com.facebook.ads.redexgen.core.YB.A0G(1001, this.A05);
        this.A06 = new com.facebook.ads.redexgen.core.C1336bq(this.A03, this.A00, this.A01, A03(), A0B());
        com.facebook.ads.redexgen.core.YB.A0K(this.A06);
    }

    public final com.facebook.ads.redexgen.core.C1241aJ A00(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.VI vi, com.facebook.ads.redexgen.core.EnumC1244aM enumC1244aM, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
        this.A02 = com.facebook.ads.redexgen.core.AbstractC1246aO.A01(c1636gi, true, abstractC1801jd, vi, interfaceC1177Yh, enumC1244aM, com.facebook.ads.redexgen.core.AbstractC1243aL.A00(abstractC1801jd));
        com.facebook.ads.redexgen.core.YB.A0K(this.A02);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        if (abstractC1801jd.A2U()) {
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0b, com.facebook.ads.redexgen.core.XV.A0r, 0, 0);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else {
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0b, 0, 0, com.facebook.ads.redexgen.core.XV.A0b);
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
        this.A02.setLayoutParams(layoutParams);
        return this.A02;
    }

    public final com.facebook.ads.redexgen.core.C1245aN A01(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.EnumC1244aM enumC1244aM) {
        com.facebook.ads.redexgen.core.C1245aN A02 = com.facebook.ads.redexgen.core.AbstractC1246aO.A02(c1636gi, enumC1244aM, this.A07.A05());
        com.facebook.ads.redexgen.core.YB.A0K(A02);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0b, 0, 0, com.facebook.ads.redexgen.core.XV.A0b);
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        A02.setLayoutParams(layoutParams);
        return A02;
    }

    public boolean A02() {
        return true;
    }

    public boolean A03() {
        return true;
    }

    public final boolean A04() {
        if (this.A07.A05().A29().A0H().A07() == null) {
            return this.A07.A05().A1w() || this.A07.A05().A1y();
        }
        return this.A07.A05().A1n();
    }

    public boolean A0A() {
        return true;
    }

    public boolean A0B() {
        return true;
    }

    public com.facebook.ads.redexgen.core.EnumC0885Mq A1B(java.lang.String str) {
        return getCtaButton().A0E(str);
    }

    public void A1C() {
        if (this.A02 != null) {
            this.A02.A0O();
        }
    }

    public void A1D() {
    }

    public void A1E() {
    }

    public void A1F() {
    }

    public void A1G() {
    }

    public void A1H(com.facebook.ads.redexgen.core.NR nr, java.lang.String str, double d, android.os.Bundle bundle) {
        this.A06.A04(nr.A0I().A0F(), nr.A0I().A04(), null, false, !A1O() && d > 0.0d && d < 1.0d);
        this.A05.setCta(nr.A0J(), str, new java.util.HashMap());
    }

    public void A1I(com.facebook.ads.redexgen.core.C4K c4k) {
    }

    public void A1J(com.facebook.ads.redexgen.core.E1 e1) {
    }

    public void A1K(com.facebook.ads.redexgen.core.C4A c4a, int i) {
    }

    public void A1L(boolean z) {
        if (!z && this.A02 != null) {
            this.A02.A0P();
        }
    }

    public boolean A1M() {
        return false;
    }

    public boolean A1N() {
        return true;
    }

    public boolean A1P(boolean z) {
        return false;
    }

    public com.facebook.ads.redexgen.core.C1636gi getAdContextWrapper() {
        return this.A03;
    }

    public com.facebook.ads.redexgen.core.VA getAdEventManager() {
        return this.A04;
    }

    public int getCloseButtonStyle() {
        return 0;
    }

    public com.facebook.ads.redexgen.core.C0894Na getColors() {
        return this.A00;
    }

    public com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr getCtaButton() {
        return this.A05;
    }

    public com.facebook.ads.redexgen.core.C1336bq getTitleDescContainer() {
        return this.A06;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.facebook.ads.redexgen.core.C0894Na A00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            A00 = this.A07.A05().A28().A01();
        } else {
            A00 = this.A07.A05().A28().A00();
        }
        this.A00 = A00;
        this.A05.setViewShowsOverMedia(A0A());
        this.A05.setUpButtonColors(this.A00);
        this.A06.A03(this.A00, this.A01);
    }

    public void setAccidentalClickCappingListener(com.facebook.ads.redexgen.core.InterfaceC0886Mr interfaceC0886Mr) {
        getCtaButton().getCtaActionHelper().A07(interfaceC0886Mr);
    }

    public void setChainedWatchAndBrowseSkippableStatus(boolean z) {
    }
}
