package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.6g, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04806g extends com.facebook.ads.redexgen.core.AbstractC0936Oq {
    public static java.lang.String[] A0E = {"vPMRmT88mgqFEke8ATcV4DjUXhfKSOnR", "vcxzG3inNeckkmEQerBRT2lbis8VS7m7", "eUyvpit7R4E8S", "81xoNnBskiL3NHuExK0jouL0xNUbAz24", "9rRUUXnOqMhF40SMgnak6Kzhg0roR6HI", "NGPySEd1uSK0pWi3", "38FqFi34P3eGFZ4PzNWUjtJ56H9UGtdy", "zzAANKTeXLAH5LLCmw3IQOJWh4jGOg5d"};
    public com.facebook.ads.redexgen.core.C4L A00;
    public boolean A01;
    public boolean A02;
    public final android.view.ViewGroup A03;
    public final com.facebook.ads.redexgen.core.C1042Sx A04;
    public final com.facebook.ads.redexgen.core.VA A05;
    public final com.facebook.ads.redexgen.core.C0673Ek A06;
    public final com.facebook.ads.redexgen.core.EA A07;
    public final com.facebook.ads.redexgen.core.E8 A08;
    public final com.facebook.ads.redexgen.core.C0646Dj A09;
    public final com.facebook.ads.redexgen.core.ViewOnClickListenerC0643Dg A0A;
    public final com.facebook.ads.redexgen.core.C0642Df A0B;
    public final com.facebook.ads.redexgen.core.AbstractC1580fo A0C;
    public final com.facebook.ads.redexgen.core.C1581fp A0D;

    public C04806g(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.VI vi, android.view.View.OnClickListener onClickListener, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        super(c1636gi, onClickListener, vi, abstractC1801jd);
        this.A02 = false;
        this.A01 = false;
        this.A07 = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.6p
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
                com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
                if (com.facebook.ads.redexgen.core.C1086Up.A1T(((com.facebook.ads.redexgen.core.AbstractC0936Oq) com.facebook.ads.redexgen.core.C04806g.this).A08)) {
                    c0673Ek = com.facebook.ads.redexgen.core.C04806g.this.A06;
                    c0673Ek.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A02, 30);
                }
            }
        };
        this.A08 = new com.facebook.ads.redexgen.core.C04886o(this);
        this.A05 = va;
        this.A04 = c1042Sx;
        this.A0C = A00();
        this.A0D = A07();
        this.A03 = new android.widget.FrameLayout(c1636gi);
        addView(this.A03, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.A06 = A01(vi);
        this.A0A = A04();
        this.A09 = A03();
        this.A0B = A06(vi);
        com.facebook.ads.redexgen.core.YB.A0K(this.A0B);
        A0F();
    }

    private com.facebook.ads.redexgen.core.C0935Op A00() {
        return new com.facebook.ads.redexgen.core.C0935Op(this);
    }

    private com.facebook.ads.redexgen.core.C0673Ek A01(com.facebook.ads.redexgen.core.VI vi) {
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek = new com.facebook.ads.redexgen.core.C0673Ek(super.A08);
        com.facebook.ads.redexgen.core.YB.A0K(c0673Ek);
        c0673Ek.setFunnelLoggingHandler(vi);
        c0673Ek.getEventBus().A03(this.A07, this.A08);
        if (com.facebook.ads.redexgen.core.C1086Up.A1V(super.A08)) {
            c0673Ek.setVolume(0.0f);
        }
        if (!com.facebook.ads.redexgen.core.C1086Up.A1Q(super.A08)) {
            c0673Ek.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1194Yy(this));
        }
        android.widget.RelativeLayout.LayoutParams videoLayoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        videoLayoutParams.addRule(13);
        addView(c0673Ek, videoLayoutParams);
        return c0673Ek;
    }

    private com.facebook.ads.redexgen.core.C0646Dj A03() {
        com.facebook.ads.redexgen.core.C0646Dj c0646Dj = new com.facebook.ads.redexgen.core.C0646Dj(super.A08);
        c0646Dj.setTextColor(-1);
        com.facebook.ads.redexgen.core.YB.A0a(c0646Dj, false, 12);
        c0646Dj.setGravity(17);
        this.A06.A0f(c0646Dj);
        return c0646Dj;
    }

    private com.facebook.ads.redexgen.core.ViewOnClickListenerC0643Dg A04() {
        com.facebook.ads.redexgen.core.ViewOnClickListenerC0643Dg viewOnClickListenerC0643Dg = new com.facebook.ads.redexgen.core.ViewOnClickListenerC0643Dg(super.A08);
        this.A06.A0f(viewOnClickListenerC0643Dg);
        return viewOnClickListenerC0643Dg;
    }

    private com.facebook.ads.redexgen.core.C0642Df A06(com.facebook.ads.redexgen.core.VI vi) {
        com.facebook.ads.redexgen.core.C0642Df c0642Df = new com.facebook.ads.redexgen.core.C0642Df(super.A08, vi, true);
        c0642Df.setBackgroundPaintColor(855638016);
        this.A06.A0f(c0642Df);
        return c0642Df;
    }

    private com.facebook.ads.redexgen.core.C1581fp A07() {
        return new com.facebook.ads.redexgen.core.C1581fp(this, 50, true, new java.lang.ref.WeakReference(this.A0C), super.A08);
    }

    private void A08() {
        if (getVisibility() == 0 && this.A01 && hasWindowFocus()) {
            this.A0D.A0U();
            return;
        }
        if (super.A05 != null) {
            super.A05.A0P();
        }
        this.A0D.A0V();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0936Oq
    public final void A0D() {
        this.A0D.A0V();
        this.A06.getEventBus().A04(this.A07, this.A08);
        this.A06.A0W();
        if (super.A05 != null) {
            super.A05.A0O();
        }
        com.facebook.ads.redexgen.core.YB.A0J(this.A06);
        if (this.A00 != null) {
            com.facebook.ads.redexgen.core.C4L c4l = this.A00;
            if (A0E[1].charAt(6) != 'i') {
                throw new java.lang.RuntimeException();
            }
            A0E[6] = "QSSPJpdXUUt8XbGqouva3DO5ILergMU2";
            c4l.A0p();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0936Oq
    public final void A0E() {
        super.A0E();
        this.A0B.A09();
        this.A02 = true;
        this.A0D.A0U();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0936Oq
    public final void A0F() {
        super.A0F();
        if (com.facebook.ads.redexgen.core.C1086Up.A1W(super.A08)) {
            com.facebook.ads.redexgen.core.YB.A0J(this.A0A);
            this.A0A.setLayoutParams(A0C(true, false));
            addView(this.A0A);
        }
        if (com.facebook.ads.redexgen.core.C1086Up.A1S(super.A08)) {
            com.facebook.ads.redexgen.core.YB.A0J(this.A09);
            this.A09.setLayoutParams(A0C(true, true));
            addView(this.A09);
        }
        if (com.facebook.ads.redexgen.core.C1086Up.A1U(super.A08)) {
            com.facebook.ads.redexgen.core.YB.A0J(this.A0B);
            this.A0B.setLayoutParams(A0C(false, false));
            addView(this.A0B);
        }
        com.facebook.ads.redexgen.core.C1227a5 c1227a5 = super.A04;
        if (A0E[6].charAt(23) != '5') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0E;
        strArr[5] = "QWCSfSUWuFerXIpv";
        strArr[2] = "7tLHnRgEmKXMN";
        if (c1227a5 != null) {
            com.facebook.ads.redexgen.core.YB.A0J(super.A04);
            if (com.facebook.ads.redexgen.core.C1086Up.A1U(super.A08)) {
                super.A04.setLayoutParams(com.facebook.ads.redexgen.core.AbstractC0936Oq.A0A(this.A0B));
            } else {
                super.A04.setLayoutParams(com.facebook.ads.redexgen.core.AbstractC0936Oq.A0A(null));
            }
            addView(super.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0936Oq
    public final boolean A0G() {
        return this.A06.A0l();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0936Oq
    public final boolean A0H() {
        if (getMeasuredWidth() <= 0 || this.A06.getMeasuredWidth() <= 0) {
            return true;
        }
        int measuredWidth = (int) ((getMeasuredWidth() - this.A06.getMeasuredWidth()) / 2.0d);
        int i = com.facebook.ads.redexgen.core.AbstractC0936Oq.A0D;
        int widthGap = com.facebook.ads.redexgen.core.AbstractC0936Oq.A0C;
        return measuredWidth > i + (widthGap * 2);
    }

    public final com.facebook.ads.redexgen.core.C04806g A0I(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.A06.setVideoURI(this.A04.A0T(str2));
        this.A00 = new com.facebook.ads.redexgen.core.C4L(super.A08, this.A05, this.A06, str);
        if (str3 != null && !android.text.TextUtils.isEmpty(str3)) {
            new com.facebook.ads.redexgen.core.LM(this.A03, super.A08).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new com.facebook.ads.redexgen.core.C0934Oo(this)).A07(str3);
        }
        if (str5 != null) {
            this.A0A.setPlayAccessibilityLabel(str4);
        }
        if (str5 != null) {
            this.A0A.setPauseAccessibilityLabel(str5);
        }
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0936Oq
    public int getMediaViewId() {
        return this.A06.getId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A01 = true;
        A08();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A01 = false;
        A08();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(android.view.View view, int i) {
        super.onVisibilityChanged(view, i);
        A08();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A08();
    }
}
