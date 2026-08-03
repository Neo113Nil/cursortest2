package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class KD extends com.facebook.ads.redexgen.core.AbstractC1349c3 {
    public android.widget.RelativeLayout A00;
    public android.widget.RelativeLayout A01;
    public com.facebook.ads.redexgen.core.InterfaceC1466dx A02;
    public com.facebook.ads.redexgen.core.C0683Eu A03;
    public com.facebook.ads.redexgen.core.C0673Ek A04;
    public com.facebook.ads.redexgen.core.C4L A05;
    public final android.widget.LinearLayout A06;
    public final android.widget.LinearLayout A07;
    public final android.widget.LinearLayout A08;
    public final android.widget.LinearLayout A09;
    public final android.widget.RelativeLayout A0A;
    public final com.facebook.ads.redexgen.core.C1636gi A0B;
    public final com.facebook.ads.redexgen.core.C1353c7 A0C;
    public final com.facebook.ads.redexgen.core.EA A0D;
    public final com.facebook.ads.redexgen.core.E2 A0E;
    public static java.lang.String[] A0F = {"dHduAtxHUODsuZJhGBZCL", "yuyhTKr6448pVSOhbbO3QanDkg1Btrke", "", "Gtku4tEVnL9u23uc2EIXKUUStEslbjmu", "uz", "Ug", "s4BqeuLW7FPjKDKoSZG73iWJUNxNcWet", "kGKRi0uYqdf74JFz2mP0bKfaoGbNkKkY"};
    public static final int A0V = (int) (com.facebook.ads.redexgen.core.XX.A02 * 24.0f);
    public static final int A0U = (int) (com.facebook.ads.redexgen.core.XX.A02 * 8.0f);
    public static final int A0N = (int) (com.facebook.ads.redexgen.core.XX.A02 * 1.0f);
    public static final int A0O = com.facebook.ads.redexgen.core.XV.A0f;
    public static final int A0T = com.facebook.ads.redexgen.core.XV.A0i;
    public static final int A0I = com.facebook.ads.redexgen.core.XV.A0s;
    public static final int A0W = com.facebook.ads.redexgen.core.XV.A0v;
    public static final int A0J = com.facebook.ads.redexgen.core.XV.A0b;
    public static final int A0L = com.facebook.ads.redexgen.core.XV.A0b;
    public static final int A0K = com.facebook.ads.redexgen.core.XV.A0v;
    public static final int A0M = com.facebook.ads.redexgen.core.XV.A0v;
    public static final int A0P = (int) (com.facebook.ads.redexgen.core.XX.A02 * 12.0f);
    public static final int A0H = (int) (com.facebook.ads.redexgen.core.XX.A02 * 40.0f);
    public static final int A0S = com.facebook.ads.redexgen.core.XV.A0b;
    public static final int A0R = com.facebook.ads.redexgen.core.XV.A0f;
    public static final int A0Q = (int) (com.facebook.ads.redexgen.core.XX.A02 * 16.0f);
    public static final int A0G = (int) (com.facebook.ads.redexgen.core.XX.A02 * 6.0f);

    public KD(com.facebook.ads.redexgen.core.C1353c7 c1353c7) {
        super(c1353c7, false);
        this.A0E = new com.facebook.ads.redexgen.core.E2() { // from class: com.facebook.ads.redexgen.X.6G
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E3 e3) {
                com.facebook.ads.redexgen.core.InterfaceC1466dx interfaceC1466dx;
                com.facebook.ads.redexgen.core.InterfaceC1466dx interfaceC1466dx2;
                interfaceC1466dx = com.facebook.ads.redexgen.core.KD.this.A02;
                if (interfaceC1466dx == null) {
                    return;
                }
                interfaceC1466dx2 = com.facebook.ads.redexgen.core.KD.this.A02;
                interfaceC1466dx2.AKE();
            }
        };
        this.A0D = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.6F
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
                com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
                c0673Ek = com.facebook.ads.redexgen.core.KD.this.A04;
                c0673Ek.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A02, 20);
            }
        };
        this.A0B = c1353c7.A06();
        this.A0C = c1353c7;
        this.A06 = new android.widget.LinearLayout(this.A0B);
        this.A09 = new android.widget.LinearLayout(this.A0B);
        this.A0A = new android.widget.RelativeLayout(this.A0B);
        this.A08 = new android.widget.LinearLayout(this.A0B);
        this.A07 = new android.widget.LinearLayout(this.A0B);
        A08();
    }

    private android.widget.LinearLayout A00() {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A0B);
        linearLayout.setOrientation(0);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        linearLayout.setWeightSum(3.0f);
        linearLayout.setPadding(A0U, A0U, A0U, A0U);
        java.lang.String A0C = this.A0C.A05().A29().A0I().A0C();
        java.lang.String A01 = this.A0C.A05().A29().A0I().A01();
        java.lang.String A05 = this.A0C.A05().A29().A0I().A05();
        if (!android.text.TextUtils.isEmpty(A0C)) {
            com.facebook.ads.redexgen.core.YM ym = com.facebook.ads.redexgen.core.YM.RATINGS;
            com.facebook.ads.redexgen.core.AbstractC1801jd A052 = this.A0C.A05();
            java.lang.String[] strArr = A0F;
            if (strArr[4].length() != strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            A0F[2] = "";
            android.widget.LinearLayout videoMetaDataLayout = A01(ym, A052.A29().A0I().A0C());
            linearLayout.addView(videoMetaDataLayout);
        }
        if (!android.text.TextUtils.isEmpty(A05)) {
            android.widget.LinearLayout videoMetaDataLayout2 = A01(com.facebook.ads.redexgen.core.YM.APP_DOWNLOAD_ICON, this.A0C.A05().A29().A0I().A05());
            linearLayout.addView(videoMetaDataLayout2);
        }
        if (!android.text.TextUtils.isEmpty(A01)) {
            android.widget.LinearLayout videoMetaDataLayout3 = A01(com.facebook.ads.redexgen.core.YM.APP_SIZE_ICON, this.A0C.A05().A29().A0I().A01());
            linearLayout.addView(videoMetaDataLayout3);
        }
        layoutParams.addRule(12);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(1);
        return linearLayout;
    }

    private android.widget.LinearLayout A01(com.facebook.ads.redexgen.core.YM ym, java.lang.String str) {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A0B);
        linearLayout.setOrientation(0);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, A0V);
        layoutParams.weight = 1.0f;
        linearLayout.setGravity(17);
        layoutParams.setMargins(A0T, A0T, A0T, A0T);
        linearLayout.setLayoutParams(layoutParams);
        com.facebook.ads.redexgen.core.YB.A0V(linearLayout, com.facebook.ads.redexgen.core.YB.A06(Integer.MIN_VALUE, A0Q));
        com.facebook.ads.redexgen.core.C1324be c1324be = new com.facebook.ads.redexgen.core.C1324be(this.A0C.A06(), 0, -1, ym);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(A0P, A0P);
        layoutParams2.gravity = 16;
        c1324be.setLayoutParams(layoutParams2);
        linearLayout.addView(c1324be);
        android.widget.TextView textView = new android.widget.TextView(this.A0B);
        textView.setText(str);
        textView.setTextColor(-1);
        com.facebook.ads.redexgen.core.YB.A0a(textView, false, 12);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        layoutParams3.setMargins(A0W, 0, 0, 0);
        textView.setLayoutParams(layoutParams3);
        linearLayout.addView(textView);
        return linearLayout;
    }

    private final android.widget.RelativeLayout A02(java.lang.String str, int i, com.facebook.ads.redexgen.core.YM ym) {
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.A0B);
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, A0H);
        relativeLayout.setPadding(A0J, 0, A0J, 0);
        com.facebook.ads.redexgen.core.YB.A0V(relativeLayout, com.facebook.ads.redexgen.core.YB.A06(i, A0G));
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setGravity(16);
        android.widget.TextView textView = new android.widget.TextView(this.A0B);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(9);
        textView.setText(str);
        textView.setTextColor(-1);
        com.facebook.ads.redexgen.core.YB.A0a(textView, true, 15);
        textView.setLayoutParams(layoutParams2);
        relativeLayout.addView(textView);
        com.facebook.ads.redexgen.core.C1324be iconView = new com.facebook.ads.redexgen.core.C1324be(this.A0C.A06(), 0, -1, ym);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(A0P, A0P);
        layoutParams3.addRule(11);
        layoutParams3.setMargins(0, A0I, 0, 0);
        iconView.setLayoutParams(layoutParams3);
        relativeLayout.addView(iconView);
        return relativeLayout;
    }

    private android.widget.TextView A03(java.lang.String str, boolean z, int i, int i2, int i3) {
        android.widget.TextView textView = new android.widget.TextView(this.A0B);
        textView.setText(str);
        textView.setTextColor(i2);
        com.facebook.ads.redexgen.core.YB.A0a(textView, z, i);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(A0K, 0, A0K, i3);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private com.facebook.ads.redexgen.core.C0673Ek A05() {
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek = new com.facebook.ads.redexgen.core.C0673Ek(this.A0C.A06());
        com.facebook.ads.redexgen.core.YB.A0V(c0673Ek, com.facebook.ads.redexgen.core.YB.A06(436207616, A0Q));
        c0673Ek.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.A05 = new com.facebook.ads.redexgen.core.C4L(this.A0B, getAdEventManager(), c0673Ek, this.A0C.A05().A2E(), 0, 0, true, null, null);
        if (com.facebook.ads.redexgen.core.C1086Up.A20(this.A0B)) {
            this.A03 = new com.facebook.ads.redexgen.core.C0683Eu(this.A0B, getAdEventManager(), c0673Ek, this.A0C.A05().A2E(), false, this.A05, null);
        } else {
            this.A03 = null;
        }
        return c0673Ek;
    }

    private void A07() {
        this.A00 = A02(this.A0C.A05().A16(), -14977820, com.facebook.ads.redexgen.core.YM.RIGHT_ARROW_ICON);
        this.A01 = A02(this.A0C.A05().A19(), -13816531, com.facebook.ads.redexgen.core.YM.SKIP_ARROW);
        android.view.View divider = getDivider();
        android.widget.LinearLayout linearLayout = this.A09;
        android.view.View divider2 = this.A00;
        linearLayout.addView(divider2);
        this.A09.addView(divider);
        android.widget.LinearLayout linearLayout2 = this.A09;
        android.view.View divider3 = this.A01;
        linearLayout2.addView(divider3);
        this.A00.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1377cV(this));
        this.A01.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1378cW(this));
    }

    private void A08() {
        new com.facebook.ads.redexgen.core.VI(this.A0C.A05().A2E(), getAdEventManager()).A04(com.facebook.ads.redexgen.core.VH.A0f, null);
        com.facebook.ads.redexgen.core.AbstractC1337br.A00(this.A0C.A06(), this, this.A0C.A05().A29().A0H().A08());
        int A00 = this.A0C.A00();
        this.A09.setOrientation(1);
        A09();
        A0A(A00);
        addView(this.A06);
        A0B(A00);
        android.widget.RelativeLayout relativeLayout = this.A0A;
        int orientation = A0Q;
        com.facebook.ads.redexgen.core.YB.A0V(relativeLayout, com.facebook.ads.redexgen.core.YB.A06(436207616, orientation));
        A0C(A00);
        this.A04 = A05();
        this.A0A.addView(this.A04);
        this.A0A.addView(A00());
        this.A06.addView(this.A0A);
        A07();
        this.A06.addView(this.A09);
        this.A04.setVideoURI(this.A0C.A05().A29().A0H().A09());
        this.A04.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A02, 20);
        this.A04.getEventBus().A03(this.A0E, this.A0D);
    }

    private void A09() {
        this.A08.setOrientation(1);
        this.A07.setOrientation(1);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
        this.A08.setLayoutParams(layoutParams);
        layoutParams.weight = 1.0f;
        A0D(this.A08);
        A0D(this.A07);
        this.A06.addView(this.A08);
        this.A09.addView(this.A07);
    }

    private void A0A(int i) {
        int height;
        int width;
        this.A06.setOrientation(i == 1 ? 1 : 0);
        if (this.A0B.A0E() == null || this.A0B.A0E().getWindowManager() == null) {
            return;
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        this.A0B.A0E().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int marginHorizontal = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (i == 1) {
            height = marginHorizontal / 6;
            width = i2 / 8;
            this.A06.setWeightSum(6.0f);
        } else {
            height = marginHorizontal / 8;
            width = i2 / 6;
            this.A06.setWeightSum(2.0f);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(height, width, height, width);
        layoutParams.addRule(14);
        this.A06.setLayoutParams(layoutParams);
        setRewardDescContainerVisibility(i);
    }

    private void A0B(int i) {
        android.widget.LinearLayout.LayoutParams layoutParams;
        if (i == 1) {
            layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
            layoutParams.setMargins(0, A0S, 0, 0);
            layoutParams.weight = 2.0f;
            this.A09.setGravity(0);
        } else {
            layoutParams = new android.widget.LinearLayout.LayoutParams(0, -1);
            layoutParams.setMargins(A0R, 0, 0, 0);
            layoutParams.weight = 1.0f;
            this.A09.setGravity(16);
        }
        this.A09.setLayoutParams(layoutParams);
    }

    private void A0C(int i) {
        android.widget.LinearLayout.LayoutParams layoutParams;
        if (i == 1) {
            layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
        } else {
            layoutParams = new android.widget.LinearLayout.LayoutParams(0, -1);
        }
        layoutParams.weight = i == 1 ? 3.0f : 1.0f;
        this.A0A.setLayoutParams(layoutParams);
    }

    private void A0D(android.widget.LinearLayout linearLayout) {
        android.widget.TextView summaryView = A03(this.A0C.A05().A18(), true, 24, -657931, A0M);
        android.widget.TextView titleView = A03(this.A0C.A05().A17(), false, 15, -1, A0L);
        linearLayout.addView(summaryView);
        linearLayout.addView(titleView);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final com.facebook.ads.redexgen.core.EnumC0885Mq A1B(java.lang.String str) {
        return com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1C() {
        super.A1C();
        if (this.A03 != null) {
            this.A03.A07();
        }
        if (this.A05 != null) {
            this.A05.A0p();
        }
        this.A04.getEventBus().A04(this.A0E, this.A0D);
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A1O() {
        return true;
    }

    public final void A1Q(com.facebook.ads.redexgen.core.C4L c4l) {
        if (this.A05 != null) {
            this.A05.A0o(c4l);
        }
    }

    private android.view.View getDivider() {
        android.view.View view = new android.view.View(this.A0B);
        view.setBackgroundColor(-10131605);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, A0N);
        layoutParams.setMargins(0, A0O, 0, A0O);
        view.setLayoutParams(layoutParams);
        return view;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0A(configuration.orientation);
        A0B(configuration.orientation);
        A0C(configuration.orientation);
        requestLayout();
    }

    private void setRewardDescContainerVisibility(int i) {
        if (i == 1) {
            this.A08.setVisibility(0);
            this.A07.setVisibility(8);
        } else {
            this.A08.setVisibility(8);
            this.A07.setVisibility(0);
        }
    }

    public void setVideoAdViewListener(com.facebook.ads.redexgen.core.InterfaceC1466dx interfaceC1466dx) {
        this.A02 = interfaceC1466dx;
    }
}
