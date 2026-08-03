package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Pe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0950Pe extends com.facebook.ads.redexgen.core.AbstractC1171Yb {
    public static byte[] A08;
    public static java.lang.String[] A09 = {"fERBvMHNNnzy3nk4ZNYWfuNmaphricqR", "36dIUinCjWD1st1oFa", "LXwDs8sQ22ml4TxQk7X9Yy2PND6TLebQ", "XXrP48rjLtmBZR3EppDVWeHK64Oiflqr", "lJVaLdSDUZo8CZ4Z9dOQvPM3HMB2ksyr", "0Ja0eNtF0Cq6bAhyEs6lkKXZN09pMEMJ", "OH638NDLRGGNEgbxKp", "sf1pLwcEB21wXoeUmJKgsuWxlp0ZYlJT"};
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final java.lang.Integer A0D;
    public static final java.lang.Integer A0E;
    public int A00;
    public com.facebook.ads.redexgen.core.InterfaceC1175Yf A01;
    public float A02;
    public com.facebook.ads.redexgen.core.InterfaceC1170Ya A03;
    public boolean A04;
    public final com.facebook.ads.redexgen.core.C1636gi A05;
    public final com.facebook.ads.redexgen.core.C1174Ye A06;
    public final com.facebook.ads.redexgen.core.EnumC1176Yg A07;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 124);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{110, 65, 66, 94, 72, com.google.common.base.Ascii.CR, 108, 73};
        java.lang.String[] strArr = A09;
        if (strArr[6].length() != strArr[1].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A09;
        strArr2[6] = "7Gx7HJtPRSPh20N7Kw";
        strArr2[1] = "xYim5uVBO0YQkaepUH";
    }

    static {
        A07();
        A0A = com.facebook.ads.redexgen.core.XV.A0C;
        A0C = com.facebook.ads.redexgen.core.XV.A0H;
        A0B = (int) (A0C / 2.0d);
        A0D = 855638016;
        A0E = null;
    }

    public C0950Pe(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.EnumC1176Yg enumC1176Yg, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, int i, com.facebook.ads.redexgen.core.InterfaceC1175Yf interfaceC1175Yf) {
        super(c1636gi);
        this.A00 = 0;
        this.A04 = true;
        this.A05 = c1636gi;
        this.A07 = enumC1176Yg;
        this.A01 = interfaceC1175Yf;
        A04();
        this.A06 = new com.facebook.ads.redexgen.core.C1174Ye(this.A05, abstractC1801jd, this.A07, i);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 48;
        this.A06.setContentDescription(A03(0, 8, 81));
        this.A06.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1173Yd(this));
        addView(this.A06, layoutParams);
        A06();
    }

    private void A04() {
        android.view.View view = new android.view.View(this.A05);
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    private void A05() {
        android.graphics.Rect requestedMargins = getRequestedMargins();
        if (this.A01 != null && requestedMargins != null) {
            this.A01.AEZ(getToolbarHeight());
        }
    }

    private void A06() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.Yc
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
                    return com.facebook.ads.redexgen.core.C0950Pe.this.A0F(view, windowInsets);
                }
            });
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public final void A0A() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public final void A0B() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public final void A0C(float f, int i) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public final void A0D(com.facebook.ads.redexgen.core.C0894Na c0894Na, boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public final boolean A0E() {
        return false;
    }

    public final /* synthetic */ android.view.WindowInsets A0F(android.view.View view, android.view.WindowInsets windowInsets) {
        int cutoutInsetTop;
        android.view.DisplayCutout cutout = windowInsets.getDisplayCutout();
        if (cutout != null && (cutoutInsetTop = cutout.getSafeInsetTop()) != this.A00) {
            this.A00 = cutoutInsetTop;
            A05();
        }
        return windowInsets;
    }

    public final void A0G() {
        if (this.A03 != null && this.A04) {
            com.facebook.ads.redexgen.core.InterfaceC1170Ya interfaceC1170Ya = this.A03;
            if (A09[4].charAt(19) != 'Q') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A09;
            strArr[7] = "Nz9FTwNSu9sKseNM42ZlibQZooapJX2m";
            strArr[0] = "gMFqMi1vQ9rk8jIPSWsyy3tPRxgAiTUd";
            interfaceC1170Ya.ACl(this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public android.graphics.Rect getRequestedMargins() {
        if (getResources().getConfiguration().orientation == 1) {
            int i = com.facebook.ads.redexgen.core.XV.A0u;
            int i2 = com.facebook.ads.redexgen.core.XV.A0c;
            int orientation = this.A00;
            return new android.graphics.Rect(i, i2 + orientation, 0, 0);
        }
        return new android.graphics.Rect(com.facebook.ads.redexgen.core.XV.A0u, com.facebook.ads.redexgen.core.XV.A0v, 0, 0);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public int getToolbarActionMode() {
        return this.A06.A09();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public int getToolbarHeight() {
        if (this.A07 == com.facebook.ads.redexgen.core.EnumC1176Yg.A08) {
            if (getResources().getConfiguration().orientation == 1) {
                int i = this.A00;
                int orientation = A0C;
                int i2 = i + orientation;
                int orientation2 = com.facebook.ads.redexgen.core.XV.A0c;
                return i2 + (orientation2 * 2);
            }
            int i3 = A0C;
            int orientation3 = com.facebook.ads.redexgen.core.XV.A0v;
            return i3 + (orientation3 * 2);
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public com.facebook.ads.redexgen.core.InterfaceC1170Ya getToolbarListener() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A05();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A05();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setAdReportingVisible(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setCTAClickListener(android.view.View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setCTAClickListener(com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr) {
    }

    private void setClickable(float f) {
        boolean z;
        if (f > 0.0f) {
            boolean A19 = com.facebook.ads.redexgen.core.C1086Up.A19(this.A05);
            if (A09[4].charAt(19) != 'Q') {
                throw new java.lang.RuntimeException();
            }
            A09[5] = "CynGSFEo4busEIaNEzQQTo6NoR2HzSp3";
            if (!A19) {
                z = false;
                this.A04 = z;
            }
        }
        z = true;
        this.A04 = z;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setFullscreen(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setPageDetails(com.facebook.ads.redexgen.core.C0906Nm c0906Nm, java.lang.String str, int i, com.facebook.ads.redexgen.core.C0912Ns c0912Ns) {
        this.A02 = i * 1000;
        setClickable(this.A02);
        this.A06.A0A(this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setPageDetailsVisible(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setProgress(float f) {
        float f2 = (f / 100.0f) * this.A02;
        float remainingMs = 0.0f;
        if (this.A02 - f2 > 0.0f) {
            float remainingMs2 = this.A02;
            remainingMs = remainingMs2 - f2;
        }
        this.A06.A0B(remainingMs);
        setClickable(remainingMs);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setProgressClickListener(android.view.View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setProgressImage(com.facebook.ads.redexgen.core.YM ym) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setProgressImmediate(float f) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setProgressSpinnerInvisible(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setToolbarActionMessage(java.lang.String str) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setToolbarActionMode(int i) {
        this.A06.A0C(i);
        if (i == 0) {
            setProgress(100.0f);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1171Yb
    public void setToolbarListener(com.facebook.ads.redexgen.core.InterfaceC1170Ya interfaceC1170Ya) {
        this.A03 = interfaceC1170Ya;
    }
}
