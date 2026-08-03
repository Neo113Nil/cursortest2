package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Kd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0820Kd extends com.facebook.ads.redexgen.core.AbstractC1299bF {
    public static byte[] A0J;
    public static java.lang.String[] A0K = {"U1MfpI1C6bH5E6SUUi1isARh9jp", "U", "Ubu5RVHkDHh3GnMyAX4EkYenDqWvQs6J", "Crj7vvGLMnYJtX1VpNFn8xcnVkyg9fPV", "3oNG9AhO9bk5LTGV0GcEQxoD", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "kfjfnNCZtD", "orAcnrCTNYiJWv2aZLW"};
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public static final int A0V;
    public int A00;
    public int A01;
    public android.widget.LinearLayout A02;
    public android.widget.TextView A03;
    public android.widget.TextView A04;
    public android.widget.TextView A05;
    public com.facebook.ads.redexgen.core.NY A06;
    public com.facebook.ads.redexgen.core.C0894Na A07;
    public com.facebook.ads.redexgen.core.C0896Nc A08;
    public com.facebook.ads.redexgen.core.C1332bm A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final android.widget.LinearLayout A0D;
    public final android.widget.RelativeLayout A0E;
    public final android.widget.RelativeLayout A0F;
    public final android.widget.TextView A0G;
    public final com.facebook.ads.redexgen.core.C1636gi A0H;
    public final boolean A0I;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0J, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 95);
        }
        return new java.lang.String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A04() {
        this.A0E.removeAllViews();
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = A0O;
        this.A0E.setLayoutParams(layoutParams);
        com.facebook.ads.redexgen.core.YB.A0K(this.A0E);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(super.A04, super.A04);
        layoutParams2.addRule(15);
        layoutParams2.addRule(9);
        this.A0E.addView(super.A09, layoutParams2);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = A0P;
        layoutParams3.addRule(1, super.A09.getId());
        layoutParams3.addRule(15);
        this.A0E.addView(this.A0F, layoutParams3);
        this.A0F.removeAllViews();
        com.facebook.ads.redexgen.core.YB.A0K(this.A05);
        this.A05.setLayoutParams(com.facebook.ads.redexgen.core.AbstractC1299bF.A0B);
        this.A05.setTextColor(this.A0B ? this.A07.A07(true) : -1);
        com.facebook.ads.redexgen.core.YB.A0a(this.A05, true, 18);
        this.A0F.addView(this.A05);
        this.A02.setOrientation(0);
        this.A02.setGravity(16);
        android.widget.RelativeLayout.LayoutParams layoutParams4 = new android.widget.RelativeLayout.LayoutParams(-2, A0Q);
        layoutParams4.topMargin = A0P / 2;
        layoutParams4.addRule(3, this.A05.getId());
        this.A0F.addView(this.A02, layoutParams4);
        this.A02.removeAllViews();
        this.A09.setGravity(16);
        this.A02.addView(this.A09, new android.widget.LinearLayout.LayoutParams(-2, -1));
        this.A04.setTextColor(this.A0B ? this.A07.A07(true) : -1);
        this.A04.setGravity(16);
        this.A04.setIncludeFontPadding(false);
        com.facebook.ads.redexgen.core.YB.A0a(this.A04, false, 14);
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(-2, -1);
        layoutParams5.leftMargin = A0P;
        this.A02.addView(this.A04, layoutParams5);
    }

    public static void A09() {
        A0J = new byte[]{-80, -64};
    }

    static {
        A09();
        A0U = com.facebook.ads.redexgen.core.P3.A02(-1, 77);
        A0O = com.facebook.ads.redexgen.core.XV.A0Z;
        A0P = com.facebook.ads.redexgen.core.XV.A0v;
        A0L = com.facebook.ads.redexgen.core.XV.A0g;
        A0N = (int) (com.facebook.ads.redexgen.core.XX.A02 * 144.0f);
        A0M = (int) (com.facebook.ads.redexgen.core.XX.A02 * 48.0f);
        A0Q = (int) (com.facebook.ads.redexgen.core.XX.A02 * 16.0f);
        A0V = (int) (com.facebook.ads.redexgen.core.XX.A02 * 14.0f);
        A0R = (int) (com.facebook.ads.redexgen.core.C0938Os.A08 * 21.0f);
        A0S = (int) (com.facebook.ads.redexgen.core.C0938Os.A08 * 12.0f);
        A0T = (int) (com.facebook.ads.redexgen.core.C0938Os.A08 * 10.0f);
    }

    public C0820Kd(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr, int i, boolean z, com.facebook.ads.redexgen.core.C0894Na c0894Na, boolean z2, java.lang.String str, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.C1581fp c1581fp, com.facebook.ads.redexgen.core.Y2 y2, com.facebook.ads.redexgen.core.C0900Ng c0900Ng, boolean z3, java.lang.String str2, boolean z4) {
        super(c1636gi, viewOnClickListenerC0834Kr, i, c0894Na, z2, str, va, interfaceC1177Yh, c1581fp, y2, c0900Ng, z3, str2);
        this.A0C = false;
        this.A00 = 0;
        this.A01 = 0;
        this.A0A = true;
        this.A0H = c1636gi;
        super.A09.setFullCircleCorners(z);
        setPadding(A0O, A0O, A0O, A0L);
        this.A0E = new android.widget.RelativeLayout(getContext());
        this.A05 = new android.widget.TextView(getContext());
        this.A02 = new android.widget.LinearLayout(getContext());
        this.A09 = new com.facebook.ads.redexgen.core.C1332bm(this.A0H, A0V, 5, A0U, -1);
        this.A0F = new android.widget.RelativeLayout(getContext());
        this.A0D = new android.widget.LinearLayout(getContext());
        this.A04 = new android.widget.TextView(getContext());
        this.A03 = new android.widget.TextView(getContext());
        super.A06.addView(this.A0E);
        super.A06.addView(this.A0D);
        this.A0G = new android.widget.TextView(getContext());
        this.A07 = c0894Na;
        this.A0I = com.facebook.ads.redexgen.core.C1086Up.A17(c1636gi);
        com.facebook.ads.redexgen.core.YB.A0U(this, c1636gi);
        this.A0B = com.facebook.ads.redexgen.core.C1086Up.A2c(this.A0H);
        A0A();
        if (z4) {
            this.A03.setVisibility(8);
            this.A0D.setVisibility(8);
        }
    }

    public C0820Kd(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr, int i, boolean z, com.facebook.ads.redexgen.core.C0894Na c0894Na, boolean z2, java.lang.String str, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.C1581fp c1581fp, com.facebook.ads.redexgen.core.Y2 y2, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        this(c1636gi, viewOnClickListenerC0834Kr, i, z, c0894Na, false, str, va, interfaceC1177Yh, c1581fp, y2, abstractC1801jd.A2A(), abstractC1801jd.A1k(), abstractC1801jd.A13(), abstractC1801jd.A1t());
    }

    private android.graphics.drawable.GradientDrawable A00(int i, float f) {
        android.graphics.drawable.GradientDrawable drawable = new android.graphics.drawable.GradientDrawable();
        drawable.setCornerRadius(f);
        drawable.setColor(i);
        return drawable;
    }

    private void A02() {
        super.A08.setPadding(0, 0, 0, 0);
        super.A08.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, A0M));
    }

    private void A03() {
        android.widget.LinearLayout.LayoutParams layoutParams;
        this.A0D.setOrientation(1);
        this.A0D.setPadding(0, 0, 0, A0O);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.A0E.getId());
        this.A0D.setLayoutParams(layoutParams2);
        this.A0D.removeAllViews();
        this.A03.setMaxLines(2);
        this.A03.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.A03.setGravity(16);
        this.A03.setTextColor(this.A0B ? this.A07.A06(true) : -1);
        com.facebook.ads.redexgen.core.YB.A0a(this.A03, false, 16);
        if (this.A0I) {
            layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        }
        this.A0D.addView(this.A03, layoutParams);
    }

    private void A05() {
        if (super.A01 != null) {
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            super.A01.setPadding(0, 0, 0, A0S);
            super.A01.setText(super.A02);
            super.A01.setTextColor(-1);
            com.facebook.ads.redexgen.core.YB.A0a(super.A01, false, 15);
            super.A01.setLayoutParams(layoutParams);
        }
    }

    private void A06() {
        if (super.A00 != null) {
            super.A00.removeAllViews();
            super.A00.setOrientation(1);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
            layoutParams.setMargins(0, A0R, 0, A0R);
            super.A00.setGravity(17);
            super.A00.setPadding(A0S, A0S, A0S, A0S);
            super.A00.setLayoutParams(layoutParams);
            com.facebook.ads.redexgen.core.YB.A0V(super.A00, A00(-1121112787, A0T));
            A05();
            A02();
            if (super.A01 != null) {
                super.A00.addView(super.A01);
            }
            super.A00.addView(super.A08);
        }
    }

    private void A07() {
        android.widget.LinearLayout.LayoutParams layoutParams;
        this.A0G.setMaxLines(1);
        this.A0G.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.A0G.setGravity(17);
        this.A0G.setTextColor(this.A0B ? this.A07.A07(true) : -1);
        this.A0G.setAllCaps(true);
        com.facebook.ads.redexgen.core.YB.A0a(this.A0G, false, 12);
        new android.widget.LinearLayout.LayoutParams(-1, -2);
        if (this.A0I) {
            layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        }
        layoutParams.topMargin = A0O;
        this.A0G.setLayoutParams(layoutParams);
    }

    private void A08() {
        if (this.A06 == null) {
            return;
        }
        android.widget.TextView textView = this.A05;
        com.facebook.ads.redexgen.core.NY ny = this.A06;
        if (A0K[2].charAt(28) == 'n') {
            throw new java.lang.RuntimeException();
        }
        A0K[2] = "SIvKbfulzllrpdkfdrym2tho7PogZ3oV";
        textView.setText(ny.A0G());
        this.A03.setText(this.A06.A04());
        this.A0G.setText(this.A06.A0E());
        if (android.text.TextUtils.isEmpty(this.A08.A04())) {
            com.facebook.ads.redexgen.core.YB.A0H(super.A08);
        }
        if (android.text.TextUtils.isEmpty(this.A06.A0E())) {
            com.facebook.ads.redexgen.core.YB.A0H(this.A0G);
        }
        if (android.text.TextUtils.isEmpty(this.A06.A0C())) {
            this.A02.setVisibility(8);
            return;
        }
        this.A02.setVisibility(0);
        this.A09.setRating(java.lang.Float.parseFloat(this.A06.A0C()));
        if (this.A06.A09() == null) {
            return;
        }
        this.A04.setText(A01(0, 1, 41) + java.text.NumberFormat.getNumberInstance().format(java.lang.Integer.parseInt(this.A06.A09())) + A01(1, 1, 56));
    }

    private final void A0A() {
        removeAllViews();
        if (this.A0A) {
            A0C();
        } else {
            A0B();
        }
    }

    private final void A0B() {
        setWeightSum(5.0f);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = !super.A03 ? 4.0f : 3.0f;
        layoutParams.bottomMargin = A0L - A0O;
        super.A06.setLayoutParams(layoutParams);
        com.facebook.ads.redexgen.core.YB.A0J(super.A06);
        addView(super.A06);
        if (!super.A03) {
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(0, A0M);
            layoutParams2.bottomMargin = A0L / 2;
            layoutParams2.weight = 1.0f;
            layoutParams2.gravity = 80;
            super.A08.setLayoutParams(layoutParams2);
            super.A08.setMinWidth(A0N);
            com.facebook.ads.redexgen.core.YB.A0J(super.A08);
            addView(super.A08);
        } else if (super.A00 != null) {
            android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(0, -2);
            layoutParams3.weight = 2.0f;
            super.A00.setLayoutParams(layoutParams3);
            super.A00.requestLayout();
        }
        com.facebook.ads.redexgen.core.YB.A0J(this.A0G);
        android.widget.LinearLayout.LayoutParams socialContextParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        socialContextParams.topMargin = 0;
        socialContextParams.bottomMargin = A0P;
        this.A0D.addView(this.A0G, socialContextParams);
        this.A0D.setPadding(0, 0, 0, 0);
        this.A0G.setGravity(3);
    }

    private final void A0C() {
        super.A06.setLayoutParams(com.facebook.ads.redexgen.core.AbstractC1299bF.A0B);
        A04();
        A03();
        if (!super.A03) {
            A02();
        } else {
            A06();
        }
        A07();
        A08();
        com.facebook.ads.redexgen.core.YB.A0J(super.A06);
        if (!super.A03) {
            com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr = super.A08;
            if (A0K[5].length() == 26) {
                throw new java.lang.RuntimeException();
            }
            A0K[5] = "AjTT";
            com.facebook.ads.redexgen.core.YB.A0J(viewOnClickListenerC0834Kr);
        }
        addView(super.A06);
        if (!super.A03) {
            com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr2 = super.A08;
            if (A0K[4].length() != 24) {
                addView(viewOnClickListenerC0834Kr2);
            } else {
                A0K[4] = "rq1KML2CIBWnAolyigIp8Fd7";
                addView(viewOnClickListenerC0834Kr2);
            }
        } else if (super.A00 != null) {
            addView(super.A00);
        }
        com.facebook.ads.redexgen.core.YB.A0J(this.A0G);
        addView(this.A0G);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1299bF
    public final void A0k() {
        super.A0k();
        this.A09.setOnClickListener(super.A05);
        this.A0G.setOnClickListener(super.A05);
        this.A04.setOnClickListener(super.A05);
        this.A03.setOnClickListener(super.A05);
        this.A05.setOnClickListener(super.A05);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1299bF
    public final void A0l(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.A0A = z;
        setOrientation(this.A0A ? 1 : 0);
        A0A();
        bringToFront();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1299bF
    public final android.view.View getExpandableLayout() {
        return this.A0D;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.A00 == 0) {
            this.A00 = this.A03.getHeight();
            this.A01 = this.A0G.getHeight();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1299bF
    public void setInfo(com.facebook.ads.redexgen.core.NY ny, com.facebook.ads.redexgen.core.C0896Nc c0896Nc, java.lang.String str, java.lang.String str2, com.facebook.ads.redexgen.core.InterfaceC1151Xh interfaceC1151Xh, com.facebook.ads.redexgen.core.InterfaceC1314bU interfaceC1314bU) {
        super.setInfo(ny, c0896Nc, str, str2, interfaceC1151Xh, interfaceC1314bU);
        this.A06 = ny;
        this.A08 = c0896Nc;
        A08();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1299bF
    public void setTitleMaxLines(int i) {
        this.A05.setMaxLines(i);
        this.A05.setEllipsize(android.text.TextUtils.TruncateAt.END);
    }
}
