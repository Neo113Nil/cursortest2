package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class LK extends com.facebook.ads.redexgen.core.AbstractC1299bF {
    public static byte[] A0c;
    public static java.lang.String[] A0d = {"I67ZQjFrFoBoFyBDINMYweXdnGzWjrBB", "nht6bFtAgobmTyNcdDIU67iWeCPwsD4y", "CC", "mo2tEtHX5GxhbuvPRsbEGuKVkHRikNiM", "YFxZu97gZB0Y7sylrDsM9wWdV0Ra2Zhp", "a3e3iReWJRZsiYjOcmpSjngSmAGNHpnR", "bZqctpWVYtHdWFrvu7462EupjL9eUXJL", "SeUJXsHc50YCHkmPfJM6qpgcGH0p3S"};
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final int A0h;
    public static final int A0i;
    public static final int A0j;
    public static final int A0k;
    public static final int A0l;
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public android.animation.AnimatorSet A00;
    public int A01;
    public int A02;
    public int A03;
    public android.widget.TextView A04;
    public com.facebook.ads.redexgen.core.C1241aJ A05;
    public com.facebook.ads.redexgen.core.C1245aN A06;
    public com.facebook.ads.redexgen.core.DA A07;
    public final int A08;
    public final com.facebook.ads.redexgen.core.C0906Nm A09;
    public final com.facebook.ads.redexgen.core.C0926Og A0A;
    public final com.facebook.ads.redexgen.core.VI A0B;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A0C;
    public final java.lang.Runnable A0D;
    public final java.lang.Runnable A0E;
    public final java.lang.String A0F;
    public final android.os.Handler A0G;
    public final android.widget.ImageView A0H;
    public final android.widget.ImageView A0I;
    public final android.widget.ImageView A0J;
    public final android.widget.LinearLayout A0K;
    public final android.widget.LinearLayout A0L;
    public final android.widget.RelativeLayout A0M;
    public final android.widget.RelativeLayout A0N;
    public final android.widget.RelativeLayout A0O;
    public final android.widget.TextView A0P;
    public final android.widget.TextView A0Q;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A0R;
    public final com.facebook.ads.redexgen.core.NY A0S;
    public final com.facebook.ads.redexgen.core.C0894Na A0T;
    public final com.facebook.ads.redexgen.core.C1636gi A0U;
    public final com.facebook.ads.redexgen.core.C1241aJ A0V;
    public final com.facebook.ads.redexgen.core.DZ A0W;
    public final java.lang.Runnable A0X;
    public final java.util.concurrent.atomic.AtomicBoolean A0Y;
    public final java.util.concurrent.atomic.AtomicBoolean A0Z;
    public final boolean A0a;
    public final boolean A0b;

    public static java.lang.String A0T(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0c, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 4);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0a() {
        A0c = new byte[]{58, com.google.common.base.Ascii.DC2, 4, 2, com.google.common.base.Ascii.DC2, 60, 108, 103, 106, 121, 125, 96, 97, 80, 122, Byte.MAX_VALUE, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FS, 10, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.DLE, 9, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, 126, 116, 120, 121, com.google.common.base.Ascii.RS, 2, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.VT, 49, 6, 1, 2, 10, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FS, 49, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SUB, 96, 98, Byte.MAX_VALUE, 119, 98, 117, 99, 99, 79, 114, 113, 98, 99, 116, 102, 112, 99, 117, 116, 117, 78, 103, 120, 117, 116, 126, 98, Byte.MAX_VALUE, 98, 122, 115, 107, 109, 126, 113, 108, 115, 126, 107, 118, 112, 113, 70};
    }

    public abstract void A0u(int i);

    public abstract void A0y(android.view.ViewGroup viewGroup, android.widget.RelativeLayout relativeLayout, int i);

    static {
        A0a();
        A0n = com.facebook.ads.redexgen.core.XV.A0M;
        A0g = com.facebook.ads.redexgen.core.XV.A0Q;
        A0k = com.facebook.ads.redexgen.core.XV.A0N;
        A0l = com.facebook.ads.redexgen.core.XV.A03;
        A0m = com.facebook.ads.redexgen.core.XV.A04;
        A0h = com.facebook.ads.redexgen.core.XV.A09;
        A0j = com.facebook.ads.redexgen.core.P3.A02(-1, 128);
        A0i = com.facebook.ads.redexgen.core.P3.A02(-1, 17);
        A0o = com.facebook.ads.redexgen.core.XV.A05;
        A0e = com.facebook.ads.redexgen.core.XV.A0L;
        A0f = com.facebook.ads.redexgen.core.XV.A0X;
    }

    public LK(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr, int i, boolean z, com.facebook.ads.redexgen.core.C0894Na c0894Na, boolean z2, java.lang.String str, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.C1581fp c1581fp, com.facebook.ads.redexgen.core.Y2 y2, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, com.facebook.ads.redexgen.core.DZ dz, com.facebook.ads.redexgen.core.VI vi, boolean z3) {
        super(c1636gi, viewOnClickListenerC0834Kr, i, c0894Na, z2, str, va, interfaceC1177Yh, c1581fp, y2, abstractC1801jd.A2A(), abstractC1801jd.A1k(), abstractC1801jd.A13());
        this.A0Y = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.A0Z = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A0X = new com.facebook.ads.redexgen.core.RunnableC1300bG(this);
        this.A0E = new com.facebook.ads.redexgen.core.RunnableC1301bH(this);
        this.A0D = new com.facebook.ads.redexgen.core.RunnableC1302bI(this);
        this.A0B = vi;
        this.A0R = abstractC1801jd;
        this.A0A = com.facebook.ads.redexgen.core.AbstractC0927Oh.A00(c1636gi.A02());
        this.A0C = interfaceC1177Yh;
        this.A0F = abstractC1801jd.A2E();
        this.A09 = abstractC1801jd.A2C();
        this.A0T = c0894Na;
        this.A0S = abstractC1801jd.A29().A0I();
        this.A0U = c1636gi;
        this.A0a = z;
        this.A0b = z3;
        this.A0G = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A0H = new android.widget.ImageView(this.A0U);
        this.A0I = new android.widget.ImageView(this.A0U);
        com.facebook.ads.redexgen.core.YB.A0G(1104, this.A0H);
        com.facebook.ads.redexgen.core.YB.A0G(1105, this.A0I);
        this.A0V = com.facebook.ads.redexgen.core.AbstractC1246aO.A01(this.A0U, true, this.A0R, this.A0B, this.A0C, com.facebook.ads.redexgen.core.EnumC1244aM.A03, com.facebook.ads.redexgen.core.AbstractC1243aL.A00(this.A0R));
        com.facebook.ads.redexgen.core.YB.A0K(this.A0V);
        this.A01 = -1;
        this.A03 = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        this.A0O = A0O();
        this.A0M = A0M();
        this.A0N = A0N();
        A0V();
        A0U();
        this.A0L = new android.widget.LinearLayout(this.A0U);
        this.A0L.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
        com.facebook.ads.redexgen.core.YB.A0K(this.A0L);
        this.A0J = A0K();
        com.facebook.ads.redexgen.core.YB.A0K(this.A0J);
        if (this.A0b) {
            this.A0J.setVisibility(0);
            this.A0J.setOnClickListener(com.facebook.ads.redexgen.core.AbstractC1340bu.A03(super.A08, A0T(6, 10, 11)));
        } else {
            this.A0J.setVisibility(8);
        }
        if (super.A08.getParent() != null) {
            ((android.view.ViewGroup) super.A08.getParent()).removeView(super.A08);
        }
        this.A0Q = A0R();
        com.facebook.ads.redexgen.core.YB.A0K(this.A0Q);
        this.A0P = A0P();
        com.facebook.ads.redexgen.core.YB.A0K(this.A0P);
        this.A0W = A0S(dz);
        com.facebook.ads.redexgen.core.YB.A0K(this.A0W);
        if (this.A0R.A1i()) {
            this.A0W.setVisibility(8);
        }
        this.A0K = A0L();
        com.facebook.ads.redexgen.core.YB.A0G(1103, this.A0K);
        this.A0K.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1303bJ(this));
        A0t(8);
        setUpAdReportingInitiateView(abstractC1801jd);
        setUpCreditLineV2(abstractC1801jd);
        this.A08 = this.A0R.A29().A0H().A03();
        if (this.A0R.A10().equals(A0T(60, 14, 21)) && !abstractC1801jd.A1h() && this.A08 > 0) {
            this.A04 = A0Q();
            com.facebook.ads.redexgen.core.YB.A0K(this.A04);
        }
        this.A0G.postDelayed(this.A0E, 2000L);
    }

    public static int A0I(int i) {
        if (com.facebook.ads.redexgen.core.P3.A01(i, -1) >= 4.5d) {
            return -1;
        }
        return androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
    }

    private android.widget.ImageView A0K() {
        android.widget.ImageView imageView = new android.widget.ImageView(this.A0U);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(A0h, A0h);
        layoutParams.addRule(14);
        layoutParams.setMargins(0, 0, 0, com.facebook.ads.redexgen.core.XV.A0v);
        imageView.setLayoutParams(layoutParams);
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.CHEVRON_UP));
        return imageView;
    }

    private android.widget.LinearLayout A0L() {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A0U);
        linearLayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
        this.A0H.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        this.A0H.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.AD_CHOICE_V2_COLLAPSE));
        linearLayout.addView(this.A0H);
        this.A0I.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        this.A0I.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.AD_CHOICE_V2_EXPAND));
        linearLayout.addView(this.A0I);
        return linearLayout;
    }

    private android.widget.RelativeLayout A0M() {
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.A0U);
        relativeLayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
        relativeLayout.setClipChildren(false);
        relativeLayout.setClipToPadding(false);
        com.facebook.ads.redexgen.core.YB.A0K(relativeLayout);
        return relativeLayout;
    }

    private android.widget.RelativeLayout A0N() {
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.A0U);
        android.widget.RelativeLayout.LayoutParams childLayoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        childLayoutParams.addRule(16);
        com.facebook.ads.redexgen.core.YB.A0K(relativeLayout);
        return relativeLayout;
    }

    private android.widget.RelativeLayout A0O() {
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.A0U);
        relativeLayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        return relativeLayout;
    }

    private android.widget.TextView A0P() {
        java.lang.String A0F;
        android.widget.TextView textView = new android.widget.TextView(this.A0U);
        if (this.A0b) {
            A0F = this.A0S.A0G();
        } else {
            A0F = this.A0S.A0F();
        }
        textView.setText(A0F);
        textView.setTextColor(-1);
        textView.setMaxLines(4);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setTextAlignment(4);
        textView.setTypeface(android.graphics.Typeface.DEFAULT);
        textView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
        return textView;
    }

    private android.widget.TextView A0Q() {
        android.widget.TextView textView = new android.widget.TextView(this.A0U);
        textView.setTextColor(com.google.android.exoplayer2.ui.DefaultTimeBar.DEFAULT_BUFFERED_COLOR);
        textView.setMaxLines(1);
        textView.setTypeface(android.graphics.Typeface.DEFAULT);
        textView.setTextSize(14.0f);
        textView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
        com.facebook.ads.redexgen.core.YB.A0K(textView);
        return textView;
    }

    private android.widget.TextView A0R() {
        java.lang.String A0G;
        android.widget.TextView textView = new android.widget.TextView(this.A0U);
        if (this.A0b) {
            A0G = this.A0S.A0F();
        } else {
            A0G = this.A0S.A0G();
        }
        textView.setText(A0G);
        textView.setTextColor(-1);
        textView.setMaxLines(2);
        textView.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        textView.setTextSize(30.0f);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setTextAlignment(4);
        textView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
        return textView;
    }

    private com.facebook.ads.redexgen.core.DZ A0S(com.facebook.ads.redexgen.core.DZ dz) {
        if (dz == null) {
            dz = new com.facebook.ads.redexgen.core.DZ(this.A0U, -1);
            dz.setVisibility(8);
        }
        dz.A08(A0j, A0i, true);
        dz.setPadding(0, 0, 0, 0);
        android.widget.RelativeLayout.LayoutParams progressBarLayoutParams = new android.widget.RelativeLayout.LayoutParams(-1, A0o);
        dz.setLayoutParams(progressBarLayoutParams);
        return dz;
    }

    private void A0U() {
        this.A02 = 30;
        super.A08.setIncludeFontPadding(false);
        super.A08.setTextSize(18.0f);
        super.A08.setTextColor(this.A03);
        super.A08.setOutlineProvider(null);
        com.facebook.ads.redexgen.core.YB.A0V(super.A08, com.facebook.ads.redexgen.core.YB.A06(this.A01, this.A02));
        super.A08.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, A0g));
        com.facebook.ads.redexgen.core.YB.A0G(1001, super.A08);
    }

    private void A0V() {
        if (this.A0a) {
            super.A09.setFullCircleCorners(true);
        } else {
            super.A09.setRadius(15);
        }
        com.facebook.ads.redexgen.core.YB.A0N(super.A09, 0);
        super.A09.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(A0k, A0k));
        com.facebook.ads.redexgen.core.YB.A0K(super.A09);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0W() {
        if (this.A0B != null) {
            this.A0B.A04(com.facebook.ads.redexgen.core.VH.A0A, null);
        }
        if (this.A0A.A0O(this.A0U.A02(), true)) {
            this.A0C.AAo(this.A0F, this.A09);
        } else {
            if (android.text.TextUtils.isEmpty(this.A09.A00())) {
                return;
            }
            com.facebook.ads.redexgen.core.X6.A0O(new com.facebook.ads.redexgen.core.X6(), this.A0U, com.facebook.ads.redexgen.core.XB.A00(this.A09.A00()), this.A0F);
        }
    }

    private void A0X() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0b, 0, 0, 0);
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        this.A0K.setLayoutParams(layoutParams);
    }

    private void A0Y() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        if (this.A0R.A2U()) {
            layoutParams.setMargins(0, 0, com.facebook.ads.redexgen.core.XV.A0e, com.facebook.ads.redexgen.core.XV.A0v);
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else {
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0Z, 0, 0, 0);
            layoutParams.addRule(8, this.A0W.getId());
            layoutParams.addRule(1, this.A0W.getId());
        }
        this.A0V.setLayoutParams(layoutParams);
    }

    private void A0Z() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, A0o);
        layoutParams.width = (int) (getResources().getDisplayMetrics().widthPixels * 0.42f);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        layoutParams.setMargins(0, 0, 0, com.facebook.ads.redexgen.core.XV.A0v);
        this.A0W.setLayoutParams(layoutParams);
    }

    private void A0b(int i, int i2) {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, com.facebook.ads.redexgen.core.XV.A0b, 0);
        if (i2 == 1) {
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(0, i);
        }
        layoutParams.addRule(12);
        if (A0d[7].length() == 1) {
            throw new java.lang.RuntimeException();
        }
        A0d[2] = "Y5";
        this.A0K.setLayoutParams(layoutParams);
    }

    private void A0c(int i, int i2) {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.removeRule(7);
        layoutParams.removeRule(2);
        layoutParams.removeRule(12);
        layoutParams.removeRule(0);
        if (i2 == 1) {
            if (this.A0W.getVisibility() == 8) {
                layoutParams.setMargins(0, 0, com.facebook.ads.redexgen.core.XV.A0b, com.facebook.ads.redexgen.core.XV.A0v);
                layoutParams.addRule(12);
                layoutParams.addRule(11);
            } else {
                if (!this.A0R.A2U()) {
                    layoutParams.addRule(2, this.A0W.getId());
                    layoutParams.addRule(7, this.A0W.getId());
                } else {
                    layoutParams.addRule(12);
                    layoutParams.addRule(7, this.A0W.getId());
                }
                layoutParams.setMargins(0, 0, 0, com.facebook.ads.redexgen.core.XV.A0v);
            }
        } else {
            if (this.A0R.A2U()) {
                layoutParams.setMargins(0, 0, com.facebook.ads.redexgen.core.XV.A0b, com.facebook.ads.redexgen.core.XV.A0e);
            } else {
                layoutParams.setMargins(0, 0, com.facebook.ads.redexgen.core.XV.A0b, com.facebook.ads.redexgen.core.XV.A0v);
            }
            layoutParams.addRule(0, i);
            layoutParams.addRule(12);
        }
        this.A0V.setLayoutParams(layoutParams);
    }

    private void A0d(int i, int i2) {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, A0o);
        if (i2 == 1) {
            layoutParams.addRule(12);
            if (this.A0V.getVisibility() == 8) {
                int i3 = com.facebook.ads.redexgen.core.XV.A0b;
                if (A0d[7].length() == 1) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0d;
                strArr[5] = "Roeg9wJdjUPJmYqaO6ggHMpnVgOHkrNC";
                strArr[6] = "RHWeIYqanT4cUr8DVRS9N1g89bvSPiPo";
                layoutParams.setMargins(i3, 0, com.facebook.ads.redexgen.core.XV.A0v, com.facebook.ads.redexgen.core.XV.A0v);
                layoutParams.addRule(0, this.A0K.getId());
            } else if (this.A0R.A2U()) {
                layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0b, 0, com.facebook.ads.redexgen.core.XV.A0b, com.facebook.ads.redexgen.core.XV.A0j);
            } else {
                layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0b, 0, com.facebook.ads.redexgen.core.XV.A0b, com.facebook.ads.redexgen.core.XV.A0v);
            }
        } else {
            if (this.A0V.getVisibility() == 8) {
                layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0b, 0, com.facebook.ads.redexgen.core.XV.A0b, com.facebook.ads.redexgen.core.XV.A0v);
                layoutParams.addRule(2, this.A0K.getId());
            } else {
                layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0b, 0, com.facebook.ads.redexgen.core.XV.A0b, com.facebook.ads.redexgen.core.XV.A0o);
                layoutParams.addRule(2, this.A0V.getId());
            }
            layoutParams.addRule(0, i);
        }
        java.lang.String[] strArr2 = A0d;
        if (strArr2[0].charAt(21) != strArr2[1].charAt(21)) {
            A0d[7] = "xA2Hf";
            layoutParams.addRule(14);
            this.A0W.setLayoutParams(layoutParams);
        } else {
            A0d[2] = "yZ";
            layoutParams.addRule(14);
            this.A0W.setLayoutParams(layoutParams);
        }
    }

    private void A0e(android.view.View view) {
        if (view != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0e, 0, 0, com.facebook.ads.redexgen.core.XV.A0v);
            layoutParams.addRule(12);
            layoutParams.addRule(9);
            view.setLayoutParams(layoutParams);
        }
    }

    private void A0f(android.view.View view, int i) {
        if (view != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.removeRule(5);
            layoutParams.removeRule(12);
            layoutParams.removeRule(1);
            if (i != 1) {
                layoutParams.setMargins(0, 0, 0, com.facebook.ads.redexgen.core.XV.A0e);
                layoutParams.addRule(5, this.A0W.getId());
                layoutParams.addRule(12);
            } else if (this.A0W.getVisibility() == 8) {
                layoutParams.setMargins(0, com.facebook.ads.redexgen.core.XV.A0v, com.facebook.ads.redexgen.core.XV.A0b, 0);
                layoutParams.addRule(12);
                layoutParams.addRule(9);
            } else {
                layoutParams.setMargins(0, 0, 0, com.facebook.ads.redexgen.core.XV.A0v);
                layoutParams.addRule(12);
                layoutParams.addRule(5, this.A0W.getId());
            }
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1299bF
    public final void A0j() {
        this.A0G.removeCallbacksAndMessages(null);
        com.facebook.ads.redexgen.core.YB.A0d(this.A0O, this.A0N, super.A09, this.A0Q, super.A08, this.A0W, this.A04, this.A0P, this.A0K, this.A0V, this.A06, this.A05, this.A0J, this.A0M);
        removeAllViews();
        this.A0V.A0O();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1299bF
    public final void A0k() {
        super.A09.setOnClickListener(com.facebook.ads.redexgen.core.AbstractC1340bu.A03(super.A08, A0T(27, 4, 19)));
        this.A0Q.setOnClickListener(com.facebook.ads.redexgen.core.AbstractC1340bu.A03(super.A08, A0T(74, 5, 18)));
        this.A0P.setOnClickListener(com.facebook.ads.redexgen.core.AbstractC1340bu.A03(super.A08, A0T(16, 11, 125)));
        this.A0W.setOnClickListener(com.facebook.ads.redexgen.core.AbstractC1340bu.A03(super.A08, A0T(48, 12, 20)));
        if (this.A04 != null) {
            this.A04.setOnClickListener(com.facebook.ads.redexgen.core.AbstractC1340bu.A03(super.A08, A0T(31, 17, 106)));
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1299bF
    public void A0l(int i) {
        A0o();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1299bF
    public final void A0m(boolean z) {
        super.A0m(z);
        if (!z) {
            this.A0V.A0P();
        }
    }

    public final void A0n() {
        if (this.A04 != null) {
            this.A04.setVisibility(8);
        }
    }

    public final void A0o() {
        if (this.A00 != null) {
            this.A00.cancel();
            android.os.Handler handler = this.A0G;
            if (A0d[7].length() == 1) {
                throw new java.lang.RuntimeException();
            }
            A0d[2] = "jq";
            handler.removeCallbacks(this.A0D);
        }
    }

    public final void A0p() {
        super.A08.setIncludeFontPadding(false);
        super.A08.setTextSize(18.0f);
        super.A08.setTextColor(this.A03);
        com.facebook.ads.redexgen.core.YB.A0V(super.A08, com.facebook.ads.redexgen.core.YB.A06(this.A01, this.A02));
        super.A08.A0D();
    }

    public final void A0q() {
        super.A08.A0D();
    }

    public final void A0r() {
        if (this.A00 != null) {
            int height = super.A08.getHeight();
            float f = height * 0.1f;
            java.lang.String A0T = A0T(79, 12, 27);
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(super.A08, A0T, -f, 0.0f);
            float bounceHeight = -f;
            android.animation.ObjectAnimator animator1 = android.animation.ObjectAnimator.ofFloat(this.A0J, A0T, bounceHeight, 0.0f);
            ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
            animator1.setInterpolator(new android.view.animation.LinearInterpolator());
            this.A00.playTogether(ofFloat, animator1);
            this.A00.setDuration(600L);
            this.A00.start();
        }
    }

    public final void A0s(int i) {
        if (this.A04 != null) {
            int max = java.lang.Math.max(0, this.A08 - i);
            if (max > 0) {
                java.lang.String rewardMessage = this.A0R.A2D().A06().replace(A0T(0, 6, 101), java.lang.String.valueOf(max));
                this.A04.setText(rewardMessage);
                return;
            }
            this.A04.setVisibility(8);
        }
    }

    public final void A0t(int i) {
        if (i == 0) {
            this.A0I.setVisibility(i);
            this.A0H.setVisibility(8);
        } else {
            this.A0I.setVisibility(i);
            this.A0H.setVisibility(0);
        }
    }

    public final void A0v(long j) {
        this.A00 = new android.animation.AnimatorSet();
        this.A0G.postDelayed(this.A0D, j);
    }

    public final void A0w(android.view.View view, int i, float[] fArr) {
        android.graphics.drawable.shapes.RoundRectShape roundRectShape = new android.graphics.drawable.shapes.RoundRectShape(fArr, null, null);
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(roundRectShape);
        shapeDrawable.getPaint().setColor(i);
        view.setBackground(shapeDrawable);
    }

    public final void A0x(android.view.ViewGroup viewGroup, android.view.View view) {
        if (view != null) {
            viewGroup.addView(view);
        }
    }

    public final void A0z(android.view.ViewGroup viewGroup, boolean z, boolean z2, int i) {
        com.facebook.ads.redexgen.core.YB.A0d(this.A0K, this.A0V, this.A06, this.A0W, super.A09, this.A0Q, this.A0P, this.A04, this.A05);
        com.facebook.ads.redexgen.core.YB.A0J(this);
        int i2 = getResources().getConfiguration().orientation;
        if (z) {
            if (i2 == 2 && z2) {
                A0X();
                viewGroup.addView(this.A0K);
                A0Z();
                viewGroup.addView(this.A0W);
                A0Y();
                viewGroup.addView(this.A0V);
                A0e(this.A06);
                A0e(this.A05);
                A0x(viewGroup, this.A06);
                A0x(viewGroup, this.A05);
            } else {
                A0b(i, i2);
                viewGroup.addView(this.A0K);
                A0d(i, i2);
                viewGroup.addView(this.A0W);
                A0c(i, i2);
                viewGroup.addView(this.A0V);
                A0f(this.A06, i2);
                java.lang.String[] strArr = A0d;
                java.lang.String str = strArr[0];
                java.lang.String str2 = strArr[1];
                int charAt = str.charAt(21);
                int orientation = str2.charAt(21);
                if (charAt == orientation) {
                    throw new java.lang.RuntimeException();
                }
                A0d[3] = "nUr6kFdTvmItrv0H0Gc17HbHzXx4pqcd";
                A0f(this.A05, i2);
                A0x(viewGroup, this.A06);
                A0x(viewGroup, this.A05);
            }
            if (this.A04 != null) {
                android.widget.RelativeLayout.LayoutParams placeHolderTextParam = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                int orientation2 = this.A0W.getId();
                placeHolderTextParam.addRule(2, orientation2);
                int orientation3 = this.A0W.getId();
                placeHolderTextParam.addRule(5, orientation3);
                int orientation4 = com.facebook.ads.redexgen.core.XV.A0v;
                placeHolderTextParam.setMargins(0, 0, 0, orientation4);
                this.A04.setLayoutParams(placeHolderTextParam);
                viewGroup.addView(this.A04);
                return;
            }
            return;
        }
        int orientation5 = A0o;
        this.A0W.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, orientation5));
        if (this.A04 == null) {
            return;
        }
        this.A04.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
    }

    public final void A10(android.widget.RelativeLayout relativeLayout) {
        if (this.A04 != null && this.A04.getVisibility() == 0) {
            relativeLayout.addView(this.A04);
        }
    }

    public final boolean A11() {
        if (this.A04 != null) {
            android.widget.TextView textView = this.A04;
            if (A0d[2].length() != 2) {
                throw new java.lang.RuntimeException();
            }
            A0d[7] = "y2tlX2w0t9Zmotlnwxz";
            if (textView.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public com.facebook.ads.redexgen.core.DZ getProgressBarAnimation() {
        return this.A0W;
    }

    public void setCTAClickListener(android.view.View.OnClickListener onClickListener) {
        super.A09.setOnClickListener(onClickListener);
        this.A0Q.setOnClickListener(onClickListener);
        this.A0P.setOnClickListener(onClickListener);
        this.A0W.setOnClickListener(onClickListener);
        if (this.A04 != null) {
            android.widget.TextView textView = this.A04;
            java.lang.String[] strArr = A0d;
            if (strArr[5].charAt(17) == strArr[6].charAt(17)) {
                throw new java.lang.RuntimeException();
            }
            A0d[2] = "ZI";
            textView.setOnClickListener(onClickListener);
        }
    }

    public void setChainedAdInfo(java.lang.String str) {
        this.A04 = A0Q();
        com.facebook.ads.redexgen.core.YB.A0K(this.A04);
        this.A04.setText(str);
    }

    public void setPlaceHolderTextForRewardsConversion(java.lang.String str) {
        if (this.A04 != null) {
            this.A04.setText(str);
            android.widget.TextView textView = this.A04;
            if (A0d[2].length() != 2) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0d;
            strArr[0] = "Pip5eIC199znlU0DxQZmRsWriqsU4m1j";
            strArr[1] = "8HZRpzu4lhTkjbLOeu664VtfGmtiQHTJ";
            textView.setOnClickListener(com.facebook.ads.redexgen.core.AbstractC1340bu.A03(super.A08, A0T(31, 17, 106)));
        }
    }

    private void setUpAdReportingInitiateView(com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        if (abstractC1801jd.A2Q() || abstractC1801jd.A2U()) {
            this.A0K.setVisibility(8);
            this.A0H.setVisibility(8);
            this.A0I.setVisibility(8);
            return;
        }
        this.A0V.setVisibility(8);
    }

    private void setUpCreditLineV2(com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        if (abstractC1801jd.A2W()) {
            this.A06 = com.facebook.ads.redexgen.core.AbstractC1246aO.A02(this.A0U, com.facebook.ads.redexgen.core.EnumC1244aM.A03, abstractC1801jd);
            com.facebook.ads.redexgen.core.YB.A0K(this.A06);
        } else {
            if (!abstractC1801jd.A2V()) {
                return;
            }
            this.A05 = com.facebook.ads.redexgen.core.AbstractC1246aO.A01(this.A0U, true, this.A0R, this.A0B, this.A0C, com.facebook.ads.redexgen.core.EnumC1244aM.A03, com.facebook.ads.redexgen.core.EnumC1247aP.A04);
            com.facebook.ads.redexgen.core.YB.A0K(this.A05);
        }
    }
}
