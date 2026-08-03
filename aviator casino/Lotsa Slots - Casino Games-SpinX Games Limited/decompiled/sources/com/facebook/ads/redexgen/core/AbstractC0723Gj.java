package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Gj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0723Gj extends android.widget.FrameLayout implements com.facebook.ads.redexgen.core.InterfaceC1178Yi {
    public static byte[] A0F;
    public static java.lang.String[] A0G = {"TjJo4iSgng0vXhs45r72rqpPNY8skILr", "91ouIxxhnH3Z5", "W0nriFofCJUyd1UjJ1D34NnkecurTiQg", "io9DF8pP4zbnzlMZ0cU9ebyf5c8MGTpw", "GW5XhaY0JB8EDDs", "wmyPNYIHMh217", "CqbXOmo7iYNySqq5By1vz3nqMfrwlLlZ", "8HyCFF6UzaJGyjOzTS3wQDIkiaQQj"};
    public static final android.widget.RelativeLayout.LayoutParams A0H;
    public boolean A00;
    public android.view.ViewGroup A01;
    public boolean A02;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A03;
    public final com.facebook.ads.redexgen.core.C1042Sx A04;
    public final com.facebook.ads.redexgen.core.C1636gi A05;
    public final com.facebook.ads.redexgen.core.VA A06;
    public final com.facebook.ads.redexgen.core.VI A07;
    public final com.facebook.ads.redexgen.core.Y2 A08;
    public final com.facebook.ads.redexgen.core.AbstractC1171Yb A09;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A0A;
    public final com.facebook.ads.redexgen.core.ZU A0B;
    public final com.facebook.ads.redexgen.core.C1581fp A0C;
    public final com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC1167Xx A0D;
    public final com.facebook.ads.redexgen.core.AbstractC1580fo A0E;

    public static java.lang.String A0Z(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 39);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0b() {
        A0F = new byte[]{-22, -19, -4, -23, -24};
    }

    public abstract void A0g();

    public abstract void A0h();

    public abstract void A0k(com.facebook.ads.redexgen.core.C0998Re c0998Re);

    public abstract boolean A0l();

    public abstract boolean A0m();

    static {
        A0b();
        A0H = new android.widget.RelativeLayout.LayoutParams(-1, -1);
    }

    public AbstractC0723Gj(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.ZU zu, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
        super(c1636gi);
        this.A02 = false;
        this.A0E = new com.facebook.ads.redexgen.core.H8(this);
        this.A08 = new com.facebook.ads.redexgen.core.Y2();
        this.A00 = false;
        this.A05 = c1636gi;
        this.A0B = zu;
        this.A06 = va;
        this.A03 = abstractC1801jd;
        this.A04 = c1042Sx;
        this.A0A = interfaceC1177Yh;
        this.A07 = new com.facebook.ads.redexgen.core.VI(this.A03.A2E(), this.A06);
        this.A0C = new com.facebook.ads.redexgen.core.C1581fp(this, 1, new java.lang.ref.WeakReference(this.A0E), this.A05);
        this.A0C.A0W(this.A03.A0m());
        this.A0C.A0X(this.A03.A0n());
        this.A09 = A0Y();
        this.A0D = new com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC1167Xx(this);
        this.A0D.A05(com.facebook.ads.redexgen.core.EnumC1166Xw.A02);
        if (!A0m() && android.os.Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    private com.facebook.ads.redexgen.core.AbstractC1171Yb A0Y() {
        com.facebook.ads.redexgen.core.AbstractC1171Yb A0c = A0c();
        A0c.setFullscreen(true);
        int A04 = this.A03.A29().A0H().A04();
        A0c.setPageDetails(this.A03.A2C(), this.A03.A2E(), A04, this.A03.A2D());
        A0c.A0D(this.A03.A28().A01(), com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr.A05(this.A03));
        if (this.A03.A29().A0H().A02() == 0) {
            this.A02 = true;
            A0c.setToolbarActionMode(8);
        } else if (A04 < 0 && this.A03.A29().A0S()) {
            A0c.setToolbarActionMode(4);
        }
        if (this.A03.A29().A0H().A02() >= 0) {
            A0c.setProgressSpinnerInvisible(true);
        }
        A0c.setToolbarListener(new com.facebook.ads.redexgen.core.C0725Gl(this));
        return A0c;
    }

    private void A0a() {
        if (this.A03.A29().A0W()) {
            com.facebook.ads.redexgen.core.C1459dq A0F2 = new com.facebook.ads.redexgen.core.Cdo(this.A05, this.A03.A29().A0I(), this.A03.A2C()).A0A(this.A03.A28().A01()).A0F();
            com.facebook.ads.redexgen.core.VK.A04(A0F2, this.A07, com.facebook.ads.redexgen.core.VH.A0U);
            addView(A0F2, A0H);
            A0F2.A04(new com.facebook.ads.redexgen.core.C0738Gy(this));
            return;
        }
        A0h();
    }

    public com.facebook.ads.redexgen.core.AbstractC1171Yb A0c() {
        if (A0m()) {
            if (this.A03.A1W()) {
                return new com.facebook.ads.redexgen.core.C0950Pe(this.A05, getAppOpenAdVariant(), this.A03, 8, new com.facebook.ads.redexgen.core.C0729Gp(this));
            }
            return new com.facebook.ads.redexgen.core.PU(this.A05, this.A03, 1);
        }
        return new com.facebook.ads.internal.view.FullScreenAdToolbar(this.A05, this.A0A, this.A07, 1, this.A03.A22(), this.A03.A1s());
    }

    public void A0d() {
        android.graphics.Rect requestedMargins;
        if (!this.A03.A1W() || (requestedMargins = this.A09.getRequestedMargins()) == null) {
            return;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.A09.getLayoutParams();
        layoutParams.setMargins(requestedMargins.left, requestedMargins.top, requestedMargins.right, requestedMargins.bottom);
        this.A09.setLayoutParams(layoutParams);
    }

    public final void A0e() {
        if (!this.A00) {
            this.A0C.A0U();
            this.A00 = true;
        }
    }

    public final void A0f() {
        if (this.A09.getToolbarActionMode() == 8) {
            this.A09.setToolbarActionMode(2);
        }
        if (this.A03.A29().A0H().A07() != null) {
            this.A03.A29().A0H().A07().A0S(0);
        }
        this.A03.A2K(false);
        this.A03.A29().A0M(-1);
    }

    public final void A0i(int i, com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc abstractRunnableC1123Wc, com.facebook.ads.redexgen.core.DZ dz) {
        new com.facebook.ads.redexgen.core.XO(i, new com.facebook.ads.redexgen.core.H0(this, i, dz, abstractRunnableC1123Wc)).A07();
    }

    public final void A0j(android.view.ViewGroup viewGroup) {
        if (this.A03.A1W() && getAppOpenAdVariant() == com.facebook.ads.redexgen.core.EnumC1176Yg.A08) {
            com.facebook.ads.redexgen.core.C1331bl c1331bl = new com.facebook.ads.redexgen.core.C1331bl(this.A05);
            c1331bl.setRadius(com.facebook.ads.redexgen.core.XV.A0v);
            c1331bl.addView(viewGroup, new android.view.ViewGroup.LayoutParams(-1, -1));
            this.A01 = c1331bl;
            return;
        }
        this.A01 = viewGroup;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AAu(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        this.A0A.A45(this, A0H);
        A0k(c0998Re);
        A0a();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AIv(android.os.Bundle bundle) {
    }

    private com.facebook.ads.redexgen.core.EnumC1176Yg getAppOpenAdVariant() {
        if (this.A03.A0v().equals(A0Z(0, 5, 93))) {
            return com.facebook.ads.redexgen.core.EnumC1176Yg.A08;
        }
        return com.facebook.ads.redexgen.core.EnumC1176Yg.A09;
    }

    public java.lang.Integer getBackgroundColorForToolbar() {
        if (this.A03.A1W()) {
            return getAppOpenAdVariant().A03;
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public java.lang.String getCurrentClientToken() {
        return this.A03.A2E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!A0m() && android.os.Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
        A0d();
        if (A0G[6].charAt(4) == 'Z') {
            throw new java.lang.RuntimeException();
        }
        A0G[3] = "kF6RESICu85JPno09mseATff07y9WxI4";
    }

    public void onDestroy() {
        this.A0D.A03();
        if (!android.text.TextUtils.isEmpty(this.A03.A2E())) {
            this.A06.AB7(this.A03.A2E(), new com.facebook.ads.redexgen.core.C1293b9().A03(this.A0C).A02(this.A08).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        this.A08.A06(this.A05, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
    }

    public void setUpFullscreenMode(boolean z) {
        com.facebook.ads.redexgen.core.EnumC1166Xw enumC1166Xw;
        if (z) {
            enumC1166Xw = com.facebook.ads.redexgen.core.EnumC1166Xw.A03;
        } else {
            enumC1166Xw = com.facebook.ads.redexgen.core.EnumC1166Xw.A02;
        }
        this.A0D.A05(enumC1166Xw);
    }
}
