package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.6H, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C6H extends com.facebook.ads.redexgen.core.AbstractC0817Ka {
    public static byte[] A0K;
    public static java.lang.String[] A0L = {"zra6hnpaifP7bxfZB5bQOHnqie2tQjg", "wy9og3M9LeWlDzkU0RS7zgtaq3xQKlMR", "jyAiwm88v9hsYzrfl9gFIABQTfRULZfl", "Wwy1p0nUO1H5ggrsb6VvEsAvpBZyxSvp", "wjN7zQjrZyyYli8cgu97rk5B2y3BycTh", "DSxnyYt0igg0K0GbJ5jSMl2rvJzineXI", "irrLwQMNjn2DglpbBC8hfvG7oGwbzPRC", "9jAewdJckPVrzkqluL1z0QkIRDh51Ovv"};
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
    public static final int A0W;
    public static final int A0X;
    public static final int A0Y;
    public android.view.View A00;
    public android.view.View A01;
    public android.widget.ImageView A02;
    public com.facebook.ads.redexgen.core.C1636gi A03;
    public com.facebook.ads.redexgen.core.XO A04;
    public com.facebook.ads.redexgen.core.AbstractC1171Yb A05;
    public com.facebook.ads.redexgen.core.AbstractC1349c3 A06;
    public com.facebook.ads.redexgen.core.C1365cJ A07;
    public com.facebook.ads.redexgen.core.C1491eM A08;
    public com.facebook.ads.redexgen.core.C1497eS A09;
    public com.facebook.ads.redexgen.core.DA A0A;
    public boolean A0B;
    public boolean A0C;
    public final android.os.Handler A0D;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A0E;
    public final com.facebook.ads.redexgen.core.InterfaceC1327bh A0F;
    public final com.facebook.ads.redexgen.core.C1328bi A0G;
    public final com.facebook.ads.redexgen.core.C1353c7 A0H;
    public final com.facebook.ads.redexgen.core.C0673Ek A0I;
    public final com.facebook.ads.redexgen.core.DZ A0J;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0K, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 85);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0D() {
        A0K = new byte[]{-23, -117, 1, -6, com.google.common.base.Ascii.SI, -2, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.CR, -6, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CR, 2, 7, 0, com.google.common.base.Ascii.CAN, -6, 7, 2, 6, -6, com.google.common.base.Ascii.CR, 2, 8, 7, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.CAN, 9, 5, -6, com.google.common.base.Ascii.DC2, -2, -3, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.GS, 33, 19, 45, 32, 19, 37, com.google.common.base.Ascii.SI, 32, com.google.common.base.Ascii.DC2, 45, 33, 17, 32, 19, 19, com.google.common.base.Ascii.FS, 45, 33, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.GS, 37, com.google.common.base.Ascii.FS, -7, -29, -11, 1, -25, -16, -26, 1, -27, -29, -12, -26, 1, -11, -22, -15, -7, -16, -17, -19, -33, -20, -35, -26, -29, -35, -27};
    }

    static {
        A0D();
        A0P = com.facebook.ads.redexgen.core.XV.A0b;
        A0X = com.facebook.ads.redexgen.core.XV.A0Z;
        A0M = (int) (com.facebook.ads.redexgen.core.XX.A02 * 8.0f);
        A0N = (int) (com.facebook.ads.redexgen.core.XX.A02 * 10.0f);
        A0S = (int) (com.facebook.ads.redexgen.core.XX.A02 * 20.0f);
        A0T = (int) (com.facebook.ads.redexgen.core.XX.A02 * 13.0f);
        A0Q = (int) (com.facebook.ads.redexgen.core.XX.A02 * 48.0f);
        A0W = (int) (com.facebook.ads.redexgen.core.XX.A02 * 14.0f);
        A0U = (int) (com.facebook.ads.redexgen.core.XX.A02 * 12.0f);
        A0O = com.facebook.ads.redexgen.core.XV.A0v;
        A0V = com.facebook.ads.redexgen.core.P3.A02(-1, 77);
        A0R = (int) (com.facebook.ads.redexgen.core.XX.A02 * 16.0f);
        A0Y = (int) (com.facebook.ads.redexgen.core.XX.A02 * 12.0f);
    }

    public C6H(com.facebook.ads.redexgen.core.C1353c7 c1353c7) {
        super(c1353c7, false);
        this.A0D = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A0C = false;
        this.A0B = false;
        this.A03 = c1353c7.A06();
        this.A05 = c1353c7.A0B();
        this.A0H = c1353c7;
        this.A01 = new android.view.View(this.A03);
        com.facebook.ads.redexgen.core.YB.A0K(this.A01);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A0A();
        this.A0E = c1353c7.A0C();
        com.facebook.ads.redexgen.core.AbstractC1337br.A00(c1353c7.A06(), this, getAdInfo().A0H().A08());
        this.A0I = A02(c1353c7);
        com.facebook.ads.redexgen.core.YB.A0K(this.A0I);
        getAdDetailsView().bringToFront();
        if (!A04()) {
            this.A0J = A03(c1353c7);
        } else {
            this.A0J = null;
        }
        if (getAdDataBundle().A1u()) {
            if (this.A0J != null) {
                this.A0J.setVisibility(8);
            }
            getAdDetailsView().setVisibility(8);
            A09();
        }
        A1S();
        this.A08 = new com.facebook.ads.redexgen.core.C1491eM(this.A03, c1353c7.A07(), getAdDataBundle());
        this.A0F = new com.facebook.ads.redexgen.core.KW(this);
        this.A0G = A01(c1353c7);
        com.facebook.ads.redexgen.core.XR A02 = super.A08.A02(getAdDataBundle());
        this.A03.A0H().A00(A02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(super.A08);
        if (A02.A00) {
            this.A0I.getVideoImplView().setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1356cA(this));
        } else if (com.facebook.ads.redexgen.core.C1086Up.A1L(getAdContextWrapper())) {
            com.facebook.ads.redexgen.core.AbstractC1296bC.A00(this.A0I.getVideoImplView(), com.facebook.ads.redexgen.core.C1086Up.A1M(getAdContextWrapper()), new com.facebook.ads.redexgen.core.ViewOnClickListenerC1357cB(this));
        }
        if (c1353c7.A05().A1o()) {
            if (this.A0H.A05().A1r()) {
                this.A06 = new com.facebook.ads.redexgen.core.KB(c1353c7);
            } else {
                this.A06 = new com.facebook.ads.redexgen.core.KD(c1353c7);
            }
            android.view.View view = this.A06;
            android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            addView(view, layoutParams2);
            getAdDetailsView().setVisibility(8);
        }
    }

    private com.facebook.ads.redexgen.core.C1328bi A01(com.facebook.ads.redexgen.core.C1353c7 c1353c7) {
        if (this.A0J != null) {
            return new com.facebook.ads.redexgen.core.C1328bi(c1353c7, getAdDataBundle(), this.A0I, this.A0J, getAdDetailsView(), this.A0E, this.A0F);
        }
        return new com.facebook.ads.redexgen.core.C1328bi(c1353c7, getAdDataBundle(), this.A0I, this.A0E, this.A0F, getAdDetailsView());
    }

    private com.facebook.ads.redexgen.core.C0673Ek A02(com.facebook.ads.redexgen.core.C1353c7 c1353c7) {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek = (com.facebook.ads.redexgen.core.C0673Ek) c1353c7.A02();
        if (c0673Ek == null) {
            c0673Ek = new com.facebook.ads.redexgen.core.C0673Ek(this.A03);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        if (getAdDataBundle().A1u()) {
            c0673Ek.getVideoView().setPadding(c0673Ek.getVideoView().getPaddingLeft(), c0673Ek.getVideoView().getPaddingTop(), c0673Ek.getVideoView().getPaddingRight(), c0673Ek.getVideoView().getPaddingBottom() + A0Y);
        }
        layoutParams2.addRule(13);
        addView(c0673Ek, layoutParams2);
        int A1Q = A1Q(c1353c7.A0B());
        this.A02 = (android.widget.ImageView) c1353c7.A03();
        if (this.A02 != null) {
            if (!A04()) {
                android.widget.ImageView imageView = this.A02;
                int i = com.facebook.ads.redexgen.core.AbstractC0817Ka.A0J;
                int toolbarHeight = com.facebook.ads.redexgen.core.AbstractC0817Ka.A0J;
                imageView.setPadding(i, toolbarHeight, com.facebook.ads.redexgen.core.AbstractC0817Ka.A0J, com.facebook.ads.redexgen.core.AbstractC0817Ka.A0J);
                layoutParams = new android.widget.RelativeLayout.LayoutParams(com.facebook.ads.redexgen.core.AbstractC0817Ka.A0K, com.facebook.ads.redexgen.core.AbstractC0817Ka.A0K);
                layoutParams.setMargins(0, A1Q, com.facebook.ads.redexgen.core.AbstractC0817Ka.A0I, 0);
                layoutParams.addRule(11);
            } else {
                layoutParams = new android.widget.RelativeLayout.LayoutParams(com.facebook.ads.redexgen.core.AbstractC1349c3.A0A, com.facebook.ads.redexgen.core.AbstractC1349c3.A0A);
                int i2 = com.facebook.ads.redexgen.core.XV.A0b;
                int toolbarHeight2 = com.facebook.ads.redexgen.core.XV.A0r;
                layoutParams.setMargins(i2, toolbarHeight2, com.facebook.ads.redexgen.core.XV.A0b, com.facebook.ads.redexgen.core.XV.A0Z);
                layoutParams.addRule(9);
            }
            layoutParams.addRule(10);
            c0673Ek.addView(this.A02, layoutParams);
        }
        return c0673Ek;
    }

    private com.facebook.ads.redexgen.core.DZ A03(com.facebook.ads.redexgen.core.C1353c7 c1353c7) {
        com.facebook.ads.redexgen.core.DZ A0E = c1353c7.A0E();
        if (A0E == null) {
            return null;
        }
        A0E.A08(-1, com.facebook.ads.redexgen.core.AbstractC0817Ka.A0C, false);
        A0E.setPadding(com.facebook.ads.redexgen.core.AbstractC0817Ka.A0N, com.facebook.ads.redexgen.core.AbstractC0817Ka.A0N, com.facebook.ads.redexgen.core.AbstractC0817Ka.A0N, com.facebook.ads.redexgen.core.AbstractC0817Ka.A0N);
        android.widget.RelativeLayout.LayoutParams progressBarLayoutParams = new android.widget.RelativeLayout.LayoutParams(-1, com.facebook.ads.redexgen.core.AbstractC0817Ka.A0M);
        progressBarLayoutParams.addRule(12);
        addView(A0E, progressBarLayoutParams);
        return A0E;
    }

    private void A05() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        if (this.A09 != null) {
            addView(this.A09.A0W(), layoutParams);
        }
    }

    private void A06() {
        this.A07 = new com.facebook.ads.redexgen.core.C1365cJ(this.A0H.A06(), getAdDataBundle(), this.A0H.A08(), this.A0D, this.A0H.A0C());
        addView(this.A07.A0C(getCtaButton()));
    }

    private void A07() {
        com.facebook.ads.redexgen.core.YB.A0d(this.A02, getCtaButton(), getAdDetailsView(), this.A01, this.A0G, this.A0H.A0B());
        for (com.facebook.ads.redexgen.core.InterfaceC1524eu interfaceC1524eu : this.A0I.getPlugins()) {
            if (interfaceC1524eu instanceof com.facebook.ads.redexgen.core.AnonymousClass34) {
                this.A0I.A0g(interfaceC1524eu);
                return;
            }
        }
    }

    private void A08() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0H();
            this.A0I.A0g(getAnimationPlugin());
        }
    }

    private void A09() {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(getContext());
        A0E(relativeLayout);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, A0P, 0);
        android.widget.RelativeLayout relativeLayout2 = new android.widget.RelativeLayout(getContext());
        android.widget.RelativeLayout.LayoutParams appMetadataLayoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        appMetadataLayoutParams.setMargins(A0P, A0X, A0P, A0X);
        appMetadataLayoutParams.addRule(12);
        relativeLayout2.addView(relativeLayout, layoutParams2);
        com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr ctaButton = getCtaButton();
        ctaButton.setTextSize(14.0f);
        ctaButton.setIncludeFontPadding(false);
        ctaButton.setTextColor(-1);
        layoutParams2.addRule(0, ctaButton.getId());
        if (!getAdDataBundle().A1s()) {
            ctaButton.setPadding(A0N, A0N, A0N, A0N);
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(6, relativeLayout.getId());
            layoutParams.addRule(8, relativeLayout.getId());
            ctaButton.setBackgroundColor(-12549889);
        } else {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            com.facebook.ads.redexgen.core.YB.A0V(ctaButton, com.facebook.ads.redexgen.core.YB.A06(-16738826, A0M));
            ctaButton.setPadding(A0S, A0T, A0S, A0T);
            ctaButton.setStateListAnimator(null);
            com.facebook.ads.redexgen.core.YB.A0Z(ctaButton);
        }
        layoutParams.addRule(11);
        if (ctaButton.getParent() != null) {
            com.facebook.ads.redexgen.core.YB.A0d(ctaButton);
        }
        relativeLayout2.addView(ctaButton, layoutParams);
        addView(relativeLayout2, appMetadataLayoutParams);
        relativeLayout2.bringToFront();
    }

    private void A0A() {
        if (this.A05 != null && !getAdDataBundle().A1W()) {
            this.A0A = new com.facebook.ads.redexgen.core.DA(this.A05, 400, -this.A05.getToolbarHeight(), 0);
        }
    }

    private void A0B() {
        new com.facebook.ads.redexgen.core.VI(getAdDataBundle().A2E(), getAdEventManager()).A04(com.facebook.ads.redexgen.core.VH.A0z, null);
        if (!getAdInfo().A0V()) {
            return;
        }
        super.A09.set(true);
        com.facebook.ads.redexgen.core.YB.A0W(this);
        com.facebook.ads.redexgen.core.YB.A0d(this.A0J, this.A0G, this.A00);
        com.facebook.ads.redexgen.core.YB.A0L(this.A05);
        android.util.Pair<com.facebook.ads.redexgen.core.EnumC1490eL, android.view.View> A03 = this.A08.A03(getCtaButton());
        this.A00 = (android.view.View) A03.second;
        A0F((com.facebook.ads.redexgen.core.EnumC1490eL) A03.first);
        if (getAdInfo().A0K().A00() >= 0) {
            this.A0B = true;
            if (this.A05 != null) {
                this.A05.setToolbarActionMode(getAdDataBundle().A2P() ? 8 : 2);
                this.A05.setProgressImmediate(0.0f);
            }
            this.A04 = new com.facebook.ads.redexgen.core.XO((int) getAdInfo().A0K().A00(), 20.0f, 20L, new android.os.Handler(android.os.Looper.getMainLooper()), new com.facebook.ads.redexgen.core.KV(this));
            this.A04.A07();
        }
    }

    private void A0C() {
        if (this.A0A != null) {
            this.A0A.A4A(true, false);
        }
        if (!A04() && !getAdDataBundle().A1u() && getAdDetailsAnimation() != null) {
            com.facebook.ads.redexgen.core.DA adDetailsAnimation = getAdDetailsAnimation();
            java.lang.String[] strArr = A0L;
            if (strArr[3].charAt(21) == strArr[6].charAt(21)) {
                throw new java.lang.RuntimeException();
            }
            A0L[1] = "NNplzEPPEJhw482VYN3vhqCWu3reteuX";
            adDetailsAnimation.A4A(true, false);
        }
    }

    private void A0E(android.widget.RelativeLayout relativeLayout) {
        int i;
        java.lang.String formattingRatingCount;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(A0Q, A0Q);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        com.facebook.ads.redexgen.core.C1330bk c1330bk = new com.facebook.ads.redexgen.core.C1330bk(this.A03);
        com.facebook.ads.redexgen.core.YB.A0N(c1330bk, 0);
        com.facebook.ads.redexgen.core.YB.A0K(c1330bk);
        new com.facebook.ads.redexgen.core.LM(c1330bk, this.A03).A05(A0Q, A0Q).A07(getAdDataBundle().A2C().A01());
        android.widget.TextView textView = new android.widget.TextView(this.A03);
        com.facebook.ads.redexgen.core.YB.A0K(textView);
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(getAdDataBundle().A28().A01().A07(true));
        textView.setText(getAdDataBundle().A29().A0I().A0G());
        textView.setTextSize(!getAdDataBundle().A1s() ? 16.0f : 17.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A03;
        if (!getAdDataBundle().A1s()) {
            i = A0W;
        } else {
            i = A0U;
        }
        com.facebook.ads.redexgen.core.C1332bm c1332bm = new com.facebook.ads.redexgen.core.C1332bm(c1636gi, i, 5, A0V, -1);
        c1332bm.setGravity(16);
        android.widget.LinearLayout.LayoutParams ratingCountParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
        android.widget.TextView textView2 = new android.widget.TextView(this.A03);
        textView2.setTextColor(getAdDataBundle().A28().A01().A07(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        if (!getAdDataBundle().A1s()) {
            textView2.setTextSize(13.0f);
        }
        android.widget.LinearLayout.LayoutParams starRatingContainerParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
        starRatingContainerParams.leftMargin = A0O;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A03);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        android.widget.RelativeLayout.LayoutParams ratingInfoContainerParams = new android.widget.RelativeLayout.LayoutParams(-2, A0R);
        ratingInfoContainerParams.topMargin = A0O / 2;
        ratingInfoContainerParams.addRule(3, textView.getId());
        linearLayout.addView(c1332bm, ratingCountParams);
        linearLayout.addView(textView2, starRatingContainerParams);
        android.widget.RelativeLayout.LayoutParams iconParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        iconParams.leftMargin = A0O;
        iconParams.addRule(1, c1330bk.getId());
        iconParams.addRule(15);
        android.widget.RelativeLayout relativeLayout2 = new android.widget.RelativeLayout(getContext());
        relativeLayout2.addView(linearLayout, ratingInfoContainerParams);
        relativeLayout2.addView(textView);
        relativeLayout.addView(relativeLayout2, iconParams);
        relativeLayout.addView(c1330bk, layoutParams);
        if (android.text.TextUtils.isEmpty(getAdDataBundle().A29().A0I().A0C())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        c1332bm.setRating(java.lang.Float.parseFloat(getAdDataBundle().A29().A0I().A0C()));
        if (getAdDataBundle().A29().A0I().A09() == null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(A04(0, 1, 108));
        if (!getAdDataBundle().A1s()) {
            formattingRatingCount = java.text.NumberFormat.getNumberInstance().format(java.lang.Integer.parseInt(getAdDataBundle().A29().A0I().A09()));
        } else {
            formattingRatingCount = com.facebook.ads.redexgen.core.AbstractC1150Xg.A01(java.lang.Integer.parseInt(getAdDataBundle().A29().A0I().A09()));
        }
        sb.append(formattingRatingCount);
        java.lang.String formattingRatingCount2 = A04(1, 1, 13);
        sb.append(formattingRatingCount2);
        java.lang.String formattingRatingCount3 = sb.toString();
        textView2.setText(formattingRatingCount3);
    }

    private void A0F(com.facebook.ads.redexgen.core.EnumC1490eL enumC1490eL) {
        if (!getAdDataBundle().A29().A0K().A02().isEmpty()) {
            if (getAdDataBundle().A29().A0K().A03()) {
                this.A09 = new com.facebook.ads.redexgen.core.C1497eS(this.A03, getAdDataBundle(), this.A0E, getCtaButton(), this.A0D, this.A0H.A08());
                com.facebook.ads.redexgen.core.YB.A0d(this.A05, getAdDetailsView(), this.A02);
                A05();
                return;
            }
        } else if (getAdDataBundle().A29().A0K().A03() || getAdDataBundle().A29().A0K().A04()) {
            A07();
            A06();
            return;
        }
        A0G(enumC1490eL);
    }

    private void A0G(com.facebook.ads.redexgen.core.EnumC1490eL enumC1490eL) {
        if (this.A00 == null) {
        }
        this.A0I.A0h(false);
        this.A0I.setVisibility(8);
        switch (enumC1490eL) {
            case A03:
                getAdDetailsView().setVisibility(0);
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, A1Q(this.A05), 0, 0);
                layoutParams.addRule(2, getAdDetailsView().getId());
                addView(this.A00, layoutParams);
                break;
            case A02:
                com.facebook.ads.redexgen.core.YB.A0d(getAdDetailsView());
                android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(com.facebook.ads.redexgen.core.AbstractC0817Ka.A0L, com.facebook.ads.redexgen.core.AbstractC0817Ka.A0L, com.facebook.ads.redexgen.core.AbstractC0817Ka.A0L, com.facebook.ads.redexgen.core.AbstractC0817Ka.A0L);
                addView(this.A00, layoutParams2);
                break;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0817Ka, com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1C() {
        super.A1C();
        A08();
        getAdDetailsView().A0j();
        if (this.A09 != null) {
            this.A09.A0Y();
        }
        if (this.A07 != null) {
            this.A07.A0F();
        }
        this.A0D.removeCallbacksAndMessages(null);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0817Ka, com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1H(com.facebook.ads.redexgen.core.NR nr, java.lang.String str, double d, android.os.Bundle bundle) {
        super.A1H(nr, str, d, bundle);
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        if (!bundle.getBoolean(A04(2, 31, 100), false)) {
            A0C();
        }
        if (bundle.getBoolean(A04(57, 18, 77), false)) {
            A0B();
        }
        if (bundle.getBoolean(A04(33, 24, 121), false)) {
            this.A0G.A07(this);
        }
        if (A04()) {
            boolean z = getAdDetailsView() instanceof com.facebook.ads.redexgen.core.LK;
            if (A0L[2].charAt(18) == 'X') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0L;
            strArr[3] = "TYF9Gze5okVE8nAMFw0kZuTKWJAG4GPN";
            strArr[6] = "e5C8lQxoH1vEX5uTYGqpe7vBIorNDTyW";
            if (z) {
                ((com.facebook.ads.redexgen.core.LK) getAdDetailsView()).A0q();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1I(com.facebook.ads.redexgen.core.C4K c4k) {
        super.A1I(c4k);
        if (A04()) {
            com.facebook.ads.redexgen.core.AbstractC1801jd adDataBundle = getAdDataBundle();
            if (A0L[4].charAt(31) == 'A') {
                throw new java.lang.RuntimeException();
            }
            A0L[0] = "gTgOd0";
            if (!adDataBundle.A1W()) {
                removeView(getAdDetailsView());
            }
        }
        A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1J(com.facebook.ads.redexgen.core.E1 e1) {
        super.A1J(e1);
        if (this.A06 != null && this.A06.getVisibility() == 0) {
            return;
        }
        if (A04()) {
            this.A03.A0F().AKh(com.facebook.ads.redexgen.core.XL.A00((float) this.A0H.A05().A0k()), getResources().getConfiguration().orientation, true, false, com.facebook.ads.redexgen.core.AbstractC0888Mt.A0C(this.A0H.A04()));
        }
        A1a(getResources().getConfiguration().orientation);
        if (getAdDataBundle().A1e()) {
            this.A0I.setOnClickListener(getCtaButton());
        }
        if (A04()) {
            getAdDetailsView().setVisibility(0);
            if (getAdDetailsView() instanceof com.facebook.ads.redexgen.core.LK) {
                ((com.facebook.ads.redexgen.core.LK) getAdDetailsView()).A0u(getResources().getConfiguration().orientation);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1K(com.facebook.ads.redexgen.core.C4A c4a, int i) {
        super.A1K(c4a, i);
        int videoLengthMs = c4a.A00();
        int remainingVideoTimeInMillis = this.A0I.getDuration();
        int videoLengthMs2 = remainingVideoTimeInMillis - videoLengthMs;
        if (getAnimationPlugin() != null && videoLengthMs2 < 3000 && getAnimationPlugin().A0M()) {
            getAnimationPlugin().A0I();
        }
        if ((getAdDetailsView() instanceof com.facebook.ads.redexgen.core.LK) && !this.A0H.A05().A1r()) {
            int currentPosMs = c4a.A00();
            ((com.facebook.ads.redexgen.core.LK) getAdDetailsView()).A0s(((remainingVideoTimeInMillis * i) + currentPosMs) / 1000);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1L(boolean z) {
        super.A1L(z);
        getAdDetailsView().A0m(z);
        if (this.A06 != null) {
            this.A06.A1L(z);
        }
        if (this.A09 != null) {
            this.A09.A0e(z);
        }
        com.facebook.ads.redexgen.core.C1365cJ c1365cJ = this.A07;
        if (A0L[2].charAt(18) == 'X') {
            throw new java.lang.RuntimeException();
        }
        A0L[0] = "DykuMGFkjhCaLudJ";
        if (c1365cJ != null) {
            this.A07.A0H(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A1M() {
        return getAdInfo().A0V();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A1O() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A1P(boolean z) {
        if (z && !this.A0C && !super.A09.get()) {
            this.A0G.A07(this);
            return true;
        }
        if (!getAdInfo().A0V()) {
            return false;
        }
        boolean z2 = super.A09.get();
        if (A0L[4].charAt(31) == 'A') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0L;
        strArr[3] = "EPxoCM5ZHywZjaL2iUUSFMk3WFd5m6XL";
        strArr[6] = "lTBjgNJWw5Z4CB7iubQhWZLtOmC1X7yD";
        if (!z2) {
            this.A0I.A0d(com.facebook.ads.redexgen.core.EnumC1515el.A08);
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0817Ka
    public final com.facebook.ads.redexgen.core.AbstractC1299bF A1R(com.facebook.ads.redexgen.core.C1353c7 c1353c7, com.facebook.ads.redexgen.core.NR nr, java.lang.String str) {
        double A0k = c1353c7.A05().A0k();
        if (A04()) {
            return new com.facebook.ads.redexgen.core.C1338bs((float) A0k, str, c1353c7.A06(), getColors(), c1353c7.A05(), c1353c7.A0C(), getCtaButton(), com.facebook.ads.redexgen.core.AbstractC0817Ka.A0G, false, c1353c7.A07(), c1353c7.A0F(), c1353c7.A0A(), c1353c7.A0E(), c1353c7.A08(), false).A03();
        }
        return new com.facebook.ads.redexgen.core.C0820Kd(c1353c7.A06(), getCtaButton(), com.facebook.ads.redexgen.core.AbstractC0817Ka.A0H, nr.A0I().A00() == com.facebook.ads.redexgen.core.NW.A05, getColors(), nr.A0J().A06(), str, c1353c7.A07(), c1353c7.A0C(), c1353c7.A0F(), c1353c7.A0A(), c1353c7.A05());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0817Ka
    public final void A1S() {
        super.A1S();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().AAv(this.A0I);
        }
    }

    public final void A1X() {
        getCtaButton().A0E(A04(75, 9, 37));
    }

    public final void A1Y() {
        if (getAdDetailsView() instanceof com.facebook.ads.redexgen.core.LK) {
            ((com.facebook.ads.redexgen.core.LK) getAdDetailsView()).setPlaceHolderTextForRewardsConversion(getAdDataBundle().A1A());
        }
    }

    public final void A1Z() {
        new com.facebook.ads.redexgen.core.VI(this.A0H.A05().A2E(), getAdEventManager()).A04(com.facebook.ads.redexgen.core.VH.A0h, null);
        if (this.A0H.A0B() != null) {
            com.facebook.ads.redexgen.core.AbstractC1171Yb A0B = this.A0H.A0B();
            if (A0L[4].charAt(31) == 'A') {
                throw new java.lang.RuntimeException();
            }
            A0L[2] = "qVUXWES3bTCAG5k5pbCpCu4g17099rEp";
            A0B.setVisibility(8);
            removeView(this.A0H.A0B());
        }
        removeView(this.A06);
        removeView(this.A0I);
        A08();
        removeView(getAdDetailsView());
        removeView(this.A0J);
        removeView(this.A00);
        if (this.A09 != null) {
            removeView(this.A09.A0X());
        }
        if (this.A0H.A05().A1r()) {
            A1U();
        } else {
            A1T();
        }
    }

    public final void A1a(int i) {
        if (!A04()) {
            return;
        }
        this.A03.A0F().AKj(i);
        this.A0I.A0Z(i);
        A1V(i, this.A0I, (android.widget.RelativeLayout) this.A0I.getVideoView());
    }

    public final void A1b(com.facebook.ads.redexgen.core.C4L c4l) {
        if (this.A06 != null) {
            if (this.A06 instanceof com.facebook.ads.redexgen.core.KB) {
                ((com.facebook.ads.redexgen.core.KB) this.A06).A1Q(c4l);
            }
            if (this.A06 instanceof com.facebook.ads.redexgen.core.KD) {
                ((com.facebook.ads.redexgen.core.KD) this.A06).A1Q(c4l);
            }
            this.A06.A1C();
            com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c3 = this.A06;
            java.lang.String[] strArr = A0L;
            if (strArr[3].charAt(21) == strArr[6].charAt(21)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0L;
            strArr2[3] = "wl3lZ2t8QgZzPvgxh0a22wDB24cvqHL6";
            strArr2[6] = "goKzKnMqtJl7yehw7GAGrdNRW8UKCTH6";
            removeView(abstractC1349c3);
            this.A06 = null;
        }
        getAdDetailsView().setVisibility(0);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public int getCloseButtonStyle() {
        if (getAdDataBundle().A1v() && this.A05 != null) {
            return this.A05.getToolbarActionMode();
        }
        if (this.A0B) {
            if (getAdDataBundle().A2P()) {
                return 8;
            }
            return 2;
        }
        if (A1M() && !super.A09.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0817Ka, com.facebook.ads.redexgen.core.AbstractC1349c3, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A06 != null) {
            com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c3 = this.A06;
            if (A0L[0].length() == 5) {
                throw new java.lang.RuntimeException();
            }
            A0L[4] = "EpyE2nRNkziEqwhglEeRfTluajKoT9IB";
            if (abstractC1349c3.getVisibility() == 0) {
                getAdDetailsView().setVisibility(8);
                return;
            }
        }
        if (getAdDataBundle().A29().A0K().A03() && this.A09 != null && super.A09.get()) {
            this.A09.A0a(configuration.orientation);
        } else {
            A1a(configuration.orientation);
        }
    }

    public void setVideoAdViewListener(com.facebook.ads.redexgen.core.InterfaceC1466dx interfaceC1466dx) {
        if (this.A06 instanceof com.facebook.ads.redexgen.core.KB) {
            ((com.facebook.ads.redexgen.core.KB) this.A06).setVideoAdViewListener(interfaceC1466dx);
        }
        if (this.A06 instanceof com.facebook.ads.redexgen.core.KD) {
            ((com.facebook.ads.redexgen.core.KD) this.A06).setVideoAdViewListener(interfaceC1466dx);
        }
    }
}
