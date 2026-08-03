package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class PJ extends android.widget.RelativeLayout implements com.facebook.ads.redexgen.core.InterfaceC1178Yi {
    public static byte[] A0I;
    public static java.lang.String[] A0J = {"Y2tLUsDODtMhR26nUTjgcf2Vsahx4NqH", "jeJcN29vgPpMzSifPXWuZ7pAdZm9Wqf2", "wmqo1ZnOkD5hT7Q2PTM2Rmfb8E0dvO0q", "HRpfHPl8fLQTElVXg4xSXmMBPaXasYNs", "iTsM9Wr3SkT3Gti7sj459w9nLERpcX3u", "RuGpU2jfWShvYQ0LG0oJmnDCVLSRyRSk", "2xHjamT", "xqcRJe7Fu2poXHQJNQ1kBRmSVDyUhFcS"};
    public static final int A0K;
    public static final int A0L;
    public android.view.View A00;
    public com.facebook.ads.redexgen.core.XO A01;
    public com.facebook.ads.redexgen.core.C1241aJ A02;
    public com.facebook.ads.redexgen.core.C1245aN A03;
    public com.facebook.ads.redexgen.core.C1459dq A04;
    public boolean A05;
    public boolean A06;
    public com.facebook.ads.redexgen.core.NN A07;
    public com.facebook.ads.redexgen.core.C1504ea A08;
    public boolean A09;
    public final android.os.Handler A0A;
    public final com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC1167Xx A0B;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A0C;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A0D;
    public final com.facebook.ads.redexgen.core.C1636gi A0E;
    public final com.facebook.ads.redexgen.core.VA A0F;
    public final com.facebook.ads.redexgen.core.VI A0G;
    public final com.facebook.ads.redexgen.core.AbstractC1171Yb A0H;

    public static java.lang.String A0Q(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 37);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0X() {
        A0I = new byte[]{-93, -81, -83, 110, -90, -95, -93, -91, -94, -81, -81, -85, 110, -95, -92, -77, 110, -87, -82, -76, -91, -78, -77, -76, -87, -76, -87, -95, -84, 110, -87, -83, -80, -78, -91, -77, -77, -87, -81, -82, 110, -84, -81, -89, -89, -91, -92};
    }

    public abstract com.facebook.ads.redexgen.core.AbstractC1171Yb A0b();

    public abstract void A0d();

    public abstract boolean A0l();

    public abstract int getCloseButtonStyle();

    static {
        A0X();
        A0K = (int) (com.facebook.ads.redexgen.core.XX.A02 * 16.0f);
        A0L = (int) (com.facebook.ads.redexgen.core.XX.A02 * 12.0f);
    }

    public PJ(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        super(c1636gi);
        this.A09 = false;
        this.A06 = false;
        this.A05 = false;
        this.A0A = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A0E = c1636gi;
        this.A0F = va;
        this.A0C = interfaceC1177Yh;
        this.A0B = new com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC1167Xx(this);
        this.A0D = abstractC1801jd;
        this.A0G = new com.facebook.ads.redexgen.core.VI(this.A0D.A2E(), this.A0F);
        this.A0H = A0b();
        if (this.A0D.A2M()) {
            A0R();
        }
        if (this.A0D.A2W()) {
            A0S();
        }
    }

    private com.facebook.ads.redexgen.core.C0894Na A0O(int i) {
        if (i == 1) {
            return this.A07.A01();
        }
        return this.A07.A00();
    }

    private void A0R() {
        this.A02 = com.facebook.ads.redexgen.core.AbstractC1246aO.A01(this.A0E, true, this.A0D, this.A0G, this.A0C, com.facebook.ads.redexgen.core.EnumC1244aM.A03, com.facebook.ads.redexgen.core.AbstractC1243aL.A00(this.A0D));
        com.facebook.ads.redexgen.core.YB.A0K(this.A02);
    }

    private void A0S() {
        this.A03 = com.facebook.ads.redexgen.core.AbstractC1246aO.A02(this.A0E, com.facebook.ads.redexgen.core.EnumC1244aM.A03, this.A0D);
        this.A03.setBackgroundColor(-2145637581);
        com.facebook.ads.redexgen.core.YB.A0K(this.A03);
    }

    private void A0T() {
        removeAllViews();
        com.facebook.ads.redexgen.core.YB.A0J(this);
    }

    private void A0U() {
        if (this.A03 != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(9);
            layoutParams.addRule(12);
            layoutParams.setMargins(A0K, A0L, 0, A0K);
            addView(this.A03, layoutParams);
        }
    }

    private void A0V() {
        if (this.A02 != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            layoutParams.setMargins(0, A0L, A0K, A0K);
            addView(this.A02, layoutParams);
        }
    }

    private void A0W() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        if (A0i() && this.A04 == null) {
            this.A06 = true;
            this.A04 = new com.facebook.ads.redexgen.core.Cdo(this.A0E, this.A0D.A29().A0I(), this.A0D.A2C()).A0A(this.A0D.A28().A01()).A0F();
            com.facebook.ads.redexgen.core.VK.A04(this.A04, this.A0G, com.facebook.ads.redexgen.core.VH.A0U);
            this.A0C.A44(this, 0, layoutParams);
            this.A0C.A44(this.A04, 1, layoutParams);
            this.A04.A04(new com.facebook.ads.redexgen.core.PO(this));
            return;
        }
        this.A0C.A44(this, 0, layoutParams);
    }

    private void A0Y(com.facebook.ads.redexgen.core.C0894Na c0894Na, boolean z) {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        com.facebook.ads.redexgen.core.YB.A0K(this.A0H);
        if (this.A0D.A1a()) {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, com.facebook.ads.redexgen.core.XV.A0N, 0, 0);
        } else {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, this.A0H.getToolbarHeight());
            this.A0H.A0D(c0894Na, com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr.A05(this.A0D));
        }
        layoutParams.addRule(10);
        addView(this.A0H, layoutParams);
    }

    public final void A0c() {
        if (this.A00 == null || !(this.A00 instanceof com.facebook.ads.redexgen.core.AbstractC1349c3)) {
            return;
        }
        if (A0j()) {
            ((com.facebook.ads.redexgen.core.AbstractC1349c3) this.A00).A1G();
        } else {
            ((com.facebook.ads.redexgen.core.AbstractC1349c3) this.A00).A1F();
        }
    }

    public final void A0e(int i) {
        this.A01 = new com.facebook.ads.redexgen.core.XO(i, new com.facebook.ads.redexgen.core.PM(this, i));
        this.A05 = true;
        A0c();
        this.A01.A07();
    }

    public final void A0f(android.view.View view, boolean z, int i) {
        this.A0H.setFullscreen(z);
        this.A00 = view;
        this.A0B.A05(com.facebook.ads.redexgen.core.EnumC1166Xw.A02);
        A0T();
        com.facebook.ads.redexgen.core.C0894Na colorInfo = A0O(i);
        A0Y(colorInfo, z);
        com.facebook.ads.redexgen.core.YB.A0N(this, colorInfo.A08(false));
        if (this.A0D.A2M() || this.A0D.A2W()) {
            com.facebook.ads.redexgen.core.YB.A0J(this.A02);
            com.facebook.ads.redexgen.core.YB.A0J(this.A03);
            A0V();
            A0U();
            this.A0H.A08();
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        if (this.A0D.A2M() && this.A02 != null) {
            layoutParams.addRule(2, this.A02.getId());
            layoutParams.addRule(3, this.A0H.getId());
        } else if (this.A0D.A2W() && this.A03 != null) {
            layoutParams.addRule(2, this.A03.getId());
            layoutParams.addRule(3, this.A0H.getId());
        } else {
            if (A0J[7].charAt(11) != 'o') {
                throw new java.lang.RuntimeException();
            }
            A0J[6] = "TscrWlY";
            layoutParams.addRule(12);
            layoutParams.setMargins(0, z ? 0 : this.A0H.getToolbarHeight(), 0, 0);
        }
        if (this.A0D.A1a()) {
            layoutParams.addRule(3, this.A0H.getId());
        }
        addView(view, layoutParams);
        if (this.A0C != null) {
            A0W();
            if (A0J[4].charAt(20) == 'd') {
                throw new java.lang.RuntimeException();
            }
            A0J[4] = "m39AQqqO1eeHQzy3cGs8gEkGcDq1cYC0";
            if (z) {
                this.A0B.A05(com.facebook.ads.redexgen.core.EnumC1166Xw.A03);
            }
        }
    }

    public final void A0g(com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        this.A0B.A04(c0998Re.A05().getWindow());
        this.A07 = this.A0D.A28();
        com.facebook.ads.redexgen.core.NR nr = null;
        com.facebook.ads.redexgen.core.NR adInfo = this.A0D.A29();
        if (adInfo != null) {
            com.facebook.ads.redexgen.core.NR adInfo2 = this.A0D.A29();
            if (adInfo2 != null) {
                nr = this.A0D.A29();
            }
        }
        this.A0H.setPageDetails(this.A0D.A2C(), this.A0D.A2E(), nr != null ? nr.A0H().A04() : 0, this.A0D.A2D());
        this.A0H.setToolbarListener(new com.facebook.ads.redexgen.core.PT(this, c0998Re));
    }

    public final void A0h(com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new com.facebook.ads.redexgen.core.AnimationAnimationListenerC1190Yu(this, this, c0998Re));
        startAnimation(alphaAnimation);
    }

    public final boolean A0i() {
        return !this.A0D.A2G().isEmpty() && this.A0D.A29().A0W();
    }

    public final boolean A0j() {
        return this.A05;
    }

    public final boolean A0k() {
        return this.A06;
    }

    public void AFA(boolean z) {
        if (this.A01 != null && this.A01.A05()) {
            this.A01.A06();
        }
        if (z) {
            return;
        }
        com.facebook.ads.redexgen.core.C1241aJ c1241aJ = this.A02;
        java.lang.String[] strArr = A0J;
        if (strArr[2].charAt(15) == strArr[5].charAt(15)) {
            throw new java.lang.RuntimeException();
        }
        A0J[3] = "yojvKCm4Uw77fUAiEEOH9Gl1ktXD1GAA";
        if (c1241aJ != null) {
            this.A02.A0P();
        }
    }

    public void AFi(boolean z) {
        if (this.A01 != null && !this.A01.A04()) {
            this.A01.A07();
        }
    }

    public com.facebook.ads.redexgen.core.VA getAdEventManager() {
        return this.A0F;
    }

    public com.facebook.ads.redexgen.core.InterfaceC1177Yh getAudienceNetworkListener() {
        return this.A0C;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public java.lang.String getCurrentClientToken() {
        return this.A0D.A2E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A0B.A03();
        this.A0H.setToolbarListener(null);
        this.A0A.removeCallbacksAndMessages(null);
        if (this.A02 != null) {
            this.A02.A0O();
        }
        A0T();
    }

    public void setImpressionRecordingFlag(com.facebook.ads.redexgen.core.Y2 y2) {
        y2.A05();
        if (getAudienceNetworkListener() != null) {
            if (this.A09) {
                getAudienceNetworkListener().A4j(new com.facebook.ads.redexgen.core.MG().A8G());
            } else {
                getAudienceNetworkListener().A4j(A0Q(0, 47, 27));
            }
        }
    }

    public void setListener(com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
    }

    public void setServerSideRewardHandler(com.facebook.ads.redexgen.core.C1504ea c1504ea) {
        this.A08 = c1504ea;
    }
}
