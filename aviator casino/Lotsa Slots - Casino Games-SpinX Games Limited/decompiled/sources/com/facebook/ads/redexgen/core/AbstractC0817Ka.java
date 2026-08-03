package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ka, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0817Ka extends com.facebook.ads.redexgen.core.AbstractC1349c3 implements com.facebook.ads.redexgen.core.XQ {
    public static byte[] A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public com.facebook.ads.redexgen.core.C0649Dm A00;
    public com.facebook.ads.redexgen.core.DR A01;
    public com.facebook.ads.redexgen.core.DA A02;
    public final android.os.Handler A03;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A04;
    public final com.facebook.ads.redexgen.core.NR A05;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A06;
    public final com.facebook.ads.redexgen.core.AbstractC1299bF A07;
    public final com.facebook.ads.redexgen.core.XS A08;
    public final java.util.concurrent.atomic.AtomicBoolean A09;

    public static java.lang.String A0L(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 98);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0M() {
        A0A = new byte[]{-117, -96, -104, -104, -104, -104, -104, -104, -104, 60, 72, 70, 7, 63, 58, 60, 62, 59, 72, 72, 68, 7, 58, kotlin.io.encoding.Base64.padSymbol, 76, 7, 66, 71, 77, 62, 75, 76, 77, 66, 77, 66, 58, 69, 7, 60, 69, 66, 60, 68, 62, kotlin.io.encoding.Base64.padSymbol, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 76, 74, com.google.common.base.Ascii.VT, 67, 62, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 66, 63, 76, 76, 72, com.google.common.base.Ascii.VT, 62, 65, 80, com.google.common.base.Ascii.VT, 70, 75, 81, 66, 79, 80, 81, 70, 81, 70, 62, 73, com.google.common.base.Ascii.VT, 67, 70, 75, 70, 80, 69, 60, 62, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 81, 70, 83, 70, 81, 86, com.google.common.base.Ascii.ETB, 10, com.google.common.base.Ascii.FS, 6, com.google.common.base.Ascii.ETB, 9, 10, 9, 4, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SO, 9, 10, com.google.common.base.Ascii.DC4};
    }

    public abstract com.facebook.ads.redexgen.core.AbstractC1299bF A1R(com.facebook.ads.redexgen.core.C1353c7 c1353c7, com.facebook.ads.redexgen.core.NR nr, java.lang.String str);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A1U() {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(super.A07.A06());
        linearLayout.setOrientation(1);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        android.widget.TextView textView = new android.widget.TextView(super.A07.A06());
        textView.setText(super.A07.A05().A1E());
        textView.setTextColor(-1);
        com.facebook.ads.redexgen.core.YB.A0a(textView, true, 24);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(com.facebook.ads.redexgen.core.XV.A0q, 0, com.facebook.ads.redexgen.core.XV.A0q, com.facebook.ads.redexgen.core.XV.A0b);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams2);
        com.facebook.ads.redexgen.core.C1330bk c1330bk = new com.facebook.ads.redexgen.core.C1330bk(super.A07.A06());
        c1330bk.setRadius(15);
        com.facebook.ads.redexgen.core.YB.A0N(c1330bk, 0);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(A0E, A0E);
        layoutParams3.gravity = 17;
        c1330bk.setLayoutParams(layoutParams3);
        new com.facebook.ads.redexgen.core.LM(c1330bk, super.A07.A06()).A05(A0E, A0E).A07(super.A07.A05().A2C().A01());
        android.widget.TextView textView2 = new android.widget.TextView(super.A07.A06());
        textView2.setText(java.lang.String.format(java.util.Locale.US, super.A07.A05().A1F(), super.A07.A05().A29().A0I().A0G()));
        textView2.setTextColor(-1);
        com.facebook.ads.redexgen.core.YB.A0a(textView2, false, 17);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(com.facebook.ads.redexgen.core.XV.A0f, com.facebook.ads.redexgen.core.XV.A0b, com.facebook.ads.redexgen.core.XV.A0f, 0);
        textView2.setGravity(1);
        textView2.setLayoutParams(layoutParams4);
        linearLayout.addView(textView);
        linearLayout.addView(c1330bk);
        linearLayout.addView(textView2);
        addView(linearLayout);
        addView(A0J());
        if (this.A04.A2M() && this.A04.A2R()) {
            addView(A00(super.A07.A06(), super.A07.A05(), super.A07.A08(), com.facebook.ads.redexgen.core.EnumC1244aM.A07, super.A07.A0C()));
        }
        if (this.A04.A2W()) {
            addView(A01(super.A07.A06(), com.facebook.ads.redexgen.core.EnumC1244aM.A07));
        }
    }

    static {
        A0M();
        A0H = (int) (com.facebook.ads.redexgen.core.XX.A02 * 48.0f);
        A0G = (int) (com.facebook.ads.redexgen.core.XX.A02 * 80.0f);
        A0E = (int) (com.facebook.ads.redexgen.core.XX.A02 * 120.0f);
        A0F = (int) (com.facebook.ads.redexgen.core.XX.A02 * 128.0f);
        A0L = (int) (com.facebook.ads.redexgen.core.XX.A02 * 16.0f);
        A0B = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
        A0K = (int) (com.facebook.ads.redexgen.core.XX.A02 * 44.0f);
        A0I = com.facebook.ads.redexgen.core.XV.A0v;
        A0J = (int) (com.facebook.ads.redexgen.core.XX.A02 * 12.0f);
        A0N = (int) (com.facebook.ads.redexgen.core.XX.A02 * 12.0f);
        A0M = (int) (com.facebook.ads.redexgen.core.XX.A02 * 26.0f);
        A0C = com.facebook.ads.redexgen.core.P3.A02(-1, 77);
        A0D = com.facebook.ads.redexgen.core.P3.A02(A0C, 90);
    }

    public AbstractC0817Ka(com.facebook.ads.redexgen.core.C1353c7 c1353c7, boolean z) {
        super(c1353c7, z);
        this.A03 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A09 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A04 = c1353c7.A05();
        this.A08 = com.facebook.ads.redexgen.core.XS.A00(c1353c7.A06(), this.A04, this);
        this.A05 = this.A04.A29();
        this.A07 = A0K(c1353c7);
        if (this.A04.A1w()) {
            this.A07.setVisibility(8);
        }
        com.facebook.ads.redexgen.core.AbstractC1171Yb A0B2 = c1353c7.A0B();
        this.A06 = c1353c7.A0C();
        if (A0B2 != null) {
            A0B2.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, A0B2.getToolbarHeight()));
            A0B2.setPageDetailsVisible(false);
        }
    }

    private android.widget.ImageView A0J() {
        android.widget.ImageView imageView = new android.widget.ImageView(super.A07.A06());
        imageView.setImageBitmap(android.graphics.Bitmap.createScaledBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.NAV_CROSS), com.facebook.ads.redexgen.core.XV.A0e, com.facebook.ads.redexgen.core.XV.A0e, true));
        imageView.setColorFilter(-1);
        android.graphics.drawable.GradientDrawable circleBackground = new android.graphics.drawable.GradientDrawable();
        circleBackground.setShape(1);
        circleBackground.setColor(android.graphics.Color.parseColor(A0L(0, 9, 6)));
        imageView.setBackground(circleBackground);
        imageView.setPadding(com.facebook.ads.redexgen.core.XV.A0Y, com.facebook.ads.redexgen.core.XV.A0Y, com.facebook.ads.redexgen.core.XV.A0Y, com.facebook.ads.redexgen.core.XV.A0Y);
        imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.by
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.facebook.ads.redexgen.core.AbstractC0817Ka.this.A1W(view);
            }
        });
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, com.facebook.ads.redexgen.core.XV.A0r, com.facebook.ads.redexgen.core.XV.A0b, 0);
        layoutParams.addRule(11);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    private com.facebook.ads.redexgen.core.AbstractC1299bF A0K(com.facebook.ads.redexgen.core.C1353c7 c1353c7) {
        java.lang.String clickEvent;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        if (this.A04.A1w()) {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        }
        layoutParams.addRule(12);
        if (c1353c7.A05().A10().equals(A0L(91, 14, 67))) {
            clickEvent = com.facebook.ads.redexgen.core.EnumC1529ez.A04.A03();
        } else {
            clickEvent = A0L(9, 37, 119);
        }
        com.facebook.ads.redexgen.core.AbstractC1299bF A1R = A1R(c1353c7, this.A05, clickEvent);
        A1R.getCTAButton().getCtaActionHelper().A08(this.A04);
        A1R.getCTAButton().setCreativeAsCtaLoggingHelper(this.A08);
        this.A02 = new com.facebook.ads.redexgen.core.DA(A1R, 400, 100, 0);
        com.facebook.ads.redexgen.core.YB.A0K(A1R);
        A1R.A0l(c1353c7.A00());
        if (com.facebook.ads.redexgen.core.C1086Up.A17(c1353c7.A06())) {
            A1R.A0k();
            if (c1353c7.A0B() != null) {
                c1353c7.A0B().setCTAClickListener(getCtaButton());
            }
        }
        addView(A1R, layoutParams);
        A1R.getCTAButton().A0F(this.A04, c1353c7.A0B());
        return A1R;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public void A1C() {
        super.A1C();
        this.A03.removeCallbacksAndMessages(null);
        if (this.A04 != null && this.A04.A29().A0L() != null) {
            com.facebook.ads.redexgen.core.XI.A06(super.A07.A06().A02(), this.A04.A29().A0L());
        }
        this.A08.A03();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public void A1H(com.facebook.ads.redexgen.core.NR nr, java.lang.String str, double d, android.os.Bundle bundle) {
        super.A1H(nr, str, d, bundle);
        this.A07.setInfo(nr.A0I(), nr.A0J(), str, this.A04.A2C().A01(), super.A07.A09(), null);
    }

    public final int A1Q(com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb) {
        return abstractC1171Yb == null ? com.facebook.ads.redexgen.core.AbstractC1171Yb.A00 : abstractC1171Yb.getToolbarHeight();
    }

    public void A1S() {
        android.view.View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            this.A00 = new com.facebook.ads.redexgen.core.C0649Dm(true, false);
            if (this.A01 != null) {
                this.A00.A0L(this.A01);
            }
            com.facebook.ads.redexgen.core.C0894Na A01 = this.A04.A28().A01();
            this.A00.A0L(new com.facebook.ads.redexgen.core.DB(getAdDetailsView().getCTAButton(), androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, -1, A01.A0A(true)));
            android.graphics.drawable.Drawable startDrawable = com.facebook.ads.redexgen.core.YB.A08(A0C, A0D, A0B);
            this.A00.A0L(new com.facebook.ads.redexgen.core.DS(getAdDetailsView().getCTAButton(), androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, startDrawable, com.facebook.ads.redexgen.core.YB.A05(A01.A09(true), A0B)));
            this.A00.A0L(new com.facebook.ads.redexgen.core.DQ(expandableLayout, androidx.compose.material.TextFieldImplKt.AnimationDuration, false));
            this.A00.A0K(com.ironsource.E9.b.g);
        }
    }

    public final void A1T() {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(super.A07.A06());
        linearLayout.setOrientation(1);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        android.widget.TextView textView = new android.widget.TextView(super.A07.A06());
        textView.setText(super.A07.A05().A15());
        textView.setTextColor(-1);
        com.facebook.ads.redexgen.core.YB.A0a(textView, false, 15);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(A0L, A0L, A0L, A0L);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams2);
        com.facebook.ads.redexgen.core.C1324be c1324be = new com.facebook.ads.redexgen.core.C1324be(super.A07.A06(), 0, -13524404, com.facebook.ads.redexgen.core.YM.REWARD_GRANTED_ICON);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(A0H, A0H);
        layoutParams3.gravity = 17;
        c1324be.setLayoutParams(layoutParams3);
        linearLayout.addView(c1324be);
        linearLayout.addView(textView);
        addView(linearLayout);
    }

    public final void A1V(int i, android.view.ViewGroup viewGroup, android.widget.RelativeLayout relativeLayout) {
        if (getAdDetailsView() instanceof com.facebook.ads.redexgen.core.LK) {
            if ((getAdDetailsView() instanceof com.facebook.ads.redexgen.core.C6V) || (getAdDetailsView() instanceof com.facebook.ads.redexgen.core.C6U)) {
                com.facebook.ads.redexgen.core.YB.A0J(getAdDetailsView());
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                if (getResources().getConfiguration().orientation == 2) {
                    layoutParams.addRule(1, relativeLayout.getId());
                    getAdDetailsView().setLayoutParams(layoutParams);
                    viewGroup.addView(getAdDetailsView());
                } else {
                    addView(getAdDetailsView(), layoutParams);
                }
            }
            getAdDetailsView().A0l(i);
            ((com.facebook.ads.redexgen.core.LK) getAdDetailsView()).A0y(viewGroup, relativeLayout, i);
        }
    }

    public final /* synthetic */ void A1W(android.view.View view) {
        this.A06.A4j(A0L(46, 45, 123));
    }

    public com.facebook.ads.redexgen.core.AbstractC1801jd getAdDataBundle() {
        return this.A04;
    }

    public com.facebook.ads.redexgen.core.DA getAdDetailsAnimation() {
        return this.A02;
    }

    public com.facebook.ads.redexgen.core.AbstractC1299bF getAdDetailsView() {
        return this.A07;
    }

    public com.facebook.ads.redexgen.core.NR getAdInfo() {
        return this.A05;
    }

    public com.facebook.ads.redexgen.core.C0649Dm getAnimationPlugin() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A09.get() && (this.A04.A29().A0K().A02().isEmpty() || this.A04.A29().A0K().A03() || this.A04.A1j())) {
            return;
        }
        getAdDetailsView().A0l(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.view.View expandableLayout;
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A04.A29().A0K().A03() && !this.A04.A1j() && !this.A04.A1w() && (expandableLayout = getAdDetailsView().getExpandableLayout()) != null && z && this.A01 == null) {
            this.A01 = new com.facebook.ads.redexgen.core.DR(expandableLayout, androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, expandableLayout.getHeight(), 0);
            this.A00.A0L(this.A01);
            this.A00.A0J();
        }
    }
}
