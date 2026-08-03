package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class NO extends android.widget.RelativeLayout implements com.facebook.ads.redexgen.core.InterfaceC1178Yi {
    public static byte[] A0h;
    public static java.lang.String[] A0i = {"HOR7o31Iej4cYWuhQXExnEuENMywT0cc", "lMe4cl58LNQGNUAHyasApQ9JUE0svDiV", "D3sd2x1kxAGmbwUwbgSwAdGIbJmc5gOO", "0qcoppWNPh", "IKOWodR4Z8ze5gnDmb", "KTSiIx6w", "wnW3I4EzpNnUTo4gipPMifUFglZZiY67", "f8O"};
    public static final int A0j;
    public static final int A0k;
    public static final int A0l;
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final android.widget.RelativeLayout.LayoutParams A0p;
    public android.view.View A00;
    public android.widget.LinearLayout A01;
    public android.widget.RelativeLayout A02;
    public android.widget.RelativeLayout A03;
    public android.widget.RelativeLayout A04;
    public android.widget.Toast A05;
    public com.facebook.ads.redexgen.core.C0998Re A06;
    public com.facebook.ads.redexgen.core.XO A07;
    public com.facebook.ads.redexgen.core.C1241aJ A08;
    public com.facebook.ads.redexgen.core.C1245aN A09;
    public com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A0A;
    public com.facebook.ads.redexgen.core.C1487eI A0B;
    public com.facebook.ads.redexgen.core.C1504ea A0C;
    public java.lang.String A0D;
    public java.lang.String A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final android.os.Handler A0N;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A0O;
    public final com.facebook.ads.redexgen.core.C0908No A0P;
    public final com.facebook.ads.redexgen.core.InterfaceC1004Rk A0Q;
    public final com.facebook.ads.redexgen.core.C1636gi A0R;
    public final com.facebook.ads.redexgen.core.VA A0S;
    public final com.facebook.ads.redexgen.core.VI A0T;
    public final com.facebook.ads.redexgen.core.XO A0U;
    public final com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC1167Xx A0V;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A0W;
    public final com.facebook.ads.redexgen.core.ZU A0X;
    public final com.facebook.ads.redexgen.core.InterfaceC1327bh A0Y;
    public final com.facebook.ads.redexgen.core.C1328bi A0Z;
    public final com.facebook.ads.redexgen.core.C1491eM A0a;
    public final java.util.concurrent.atomic.AtomicBoolean A0b;
    public final java.util.concurrent.atomic.AtomicBoolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final com.facebook.ads.redexgen.core.AbstractC1171Yb A0g;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public NO(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, java.lang.String str, com.facebook.ads.redexgen.core.ZU zu, boolean z) {
        super(c1636gi);
        java.lang.String A0D = A0D(0, 0, 113);
        this.A0E = A0D;
        this.A0D = A0D;
        this.A0Q = new com.facebook.ads.redexgen.core.OV(this);
        this.A0c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A0b = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.A0K = false;
        this.A0M = true;
        this.A0H = false;
        this.A0G = false;
        this.A0N = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A0F = false;
        this.A0f = z;
        this.A0R = c1636gi;
        this.A0W = interfaceC1177Yh;
        this.A0S = va;
        this.A0O = abstractC1801jd;
        this.A0P = abstractC1801jd.A29().A0H().A07();
        this.A0T = new com.facebook.ads.redexgen.core.VI(this.A0O.A2E(), this.A0S);
        this.A0X = zu;
        this.A0C = new com.facebook.ads.redexgen.core.C1504ea(c1636gi, this.A0X, str, this.A0W);
        if (abstractC1801jd.A29().A0H().A07() != null) {
            this.A0I = abstractC1801jd.A29().A0H().A07().A0X();
            this.A0E = abstractC1801jd.A29().A0H().A07().A0O();
            this.A0D = abstractC1801jd.A29().A0H().A07().A0N();
        }
        this.A0J = this.A0O.A29().A0S() && this.A0O.A29().A0H().A03() > 0;
        this.A0e = this.A0O.A29().A0H().A0B();
        if (this.A0P == null) {
            this.A0W.A4j(this.A0X.A81());
            this.A0W.A4j(this.A0X.A7w());
        }
        int A03 = this.A0P != null ? !this.A0P.A0c() ? (this.A0J && this.A0e) ? this.A0O.A29().A0H().A03() : this.A0P.A0C() : this.A0P.A0E() : 0;
        this.A0c.set(!this.A0P.A0W());
        com.facebook.ads.redexgen.core.OV ov = null;
        this.A0U = new com.facebook.ads.redexgen.core.XO(A03, new com.facebook.ads.redexgen.core.C0915Nv(this, ov));
        this.A0d = com.facebook.ads.redexgen.core.C1086Up.A0o(this.A0R);
        this.A0g = A07();
        if (this.A0P.A0c()) {
            this.A0g.A09();
        }
        this.A0a = new com.facebook.ads.redexgen.core.C1491eM(this.A0R, this.A0S, this.A0O);
        com.facebook.ads.redexgen.core.AbstractC1337br.A00(c1636gi, this, abstractC1801jd.A29().A0H().A08());
        this.A0V = new com.facebook.ads.redexgen.core.ViewOnSystemUiVisibilityChangeListenerC1167Xx(this);
        this.A0V.A05(com.facebook.ads.redexgen.core.EnumC1166Xw.A02);
        if (com.facebook.ads.redexgen.core.C1086Up.A2K(this.A0R)) {
            this.A0g.setProgressSpinnerInvisible(true);
        }
        com.facebook.ads.redexgen.core.NP np = new com.facebook.ads.redexgen.core.NP(this, ov);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(A0D(56, 9, 90), this.A0X.A8l());
        this.A0B = new com.facebook.ads.redexgen.core.C1487eI(this.A0R, this.A0O, this.A0P, this.A0S, np, hashMap);
        A0K();
        this.A0W.A45(this, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        A0H();
        this.A0Y = new com.facebook.ads.redexgen.core.C0919Nz(this);
        this.A0Z = new com.facebook.ads.redexgen.core.C1328bi(this.A0R, this.A0g, this.A0O, (com.facebook.ads.redexgen.core.C0673Ek) null, this.A0W, this.A0Y, this.A0A, this.A02, this.A0B);
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
        if (this.A0P.A0c()) {
            this.A0R.A0F().AEU();
        }
    }

    public static java.lang.String A0D(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0h, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 107);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0P() {
        A0h = new byte[]{124, 85, 123, 83, 69, 67, 83, 125, 49, 62, 59, 49, 57, com.google.common.base.Ascii.CR, kotlin.io.encoding.Base64.padSymbol, 32, 59, 53, 59, 60, com.google.common.base.Ascii.SI, 0, 5, com.google.common.base.Ascii.SI, 7, 51, com.google.common.base.Ascii.US, 3, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SI, 9, 62, 57, 35, 50, 37, 36, 35, 62, 35, 62, 54, 59, 87, 88, 77, 80, 79, 92, 102, 90, 85, 80, 90, 82, 65, 93, 80, 82, 84, 92, 84, 95, 69, 104, Byte.MAX_VALUE, 109, 123, 104, 126, Byte.MAX_VALUE, 126, 69, 108, 115, 126, Byte.MAX_VALUE, 117, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.US, 0, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.RS, 54, 10, 5, 0, 10, 2};
    }

    static {
        A0P();
        A0p = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        A0k = com.facebook.ads.redexgen.core.XV.A0N;
        A0l = com.facebook.ads.redexgen.core.XV.A09;
        A0o = com.facebook.ads.redexgen.core.XV.A07;
        A0m = com.facebook.ads.redexgen.core.XV.A05;
        A0n = com.facebook.ads.redexgen.core.P3.A02(-1, 77);
        A0j = com.facebook.ads.redexgen.core.XV.A0U;
    }

    public NO(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, java.lang.String str, com.facebook.ads.redexgen.core.ZU zu) {
        this(c1636gi, va, interfaceC1177Yh, abstractC1801jd, str, zu, false);
    }

    private com.facebook.ads.internal.view.FullScreenAdToolbar A07() {
        com.facebook.ads.internal.view.FullScreenAdToolbar fullScreenAdToolbar = new com.facebook.ads.internal.view.FullScreenAdToolbar(this.A0R, this.A0W, this.A0T, 0, this.A0O.A22(), this.A0I);
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.A0D(this.A0O.A28().A01(), com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr.A05(this.A0O));
        fullScreenAdToolbar.setPageDetailsVisible(false);
        fullScreenAdToolbar.setPageDetails(this.A0O.A2C(), this.A0O.A2E(), this.A0P.A0C(), this.A0O.A2D());
        fullScreenAdToolbar.setToolbarListener(new com.facebook.ads.redexgen.core.C0916Nw(this));
        return fullScreenAdToolbar;
    }

    private com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A09() {
        if (this.A0B == null || this.A0B.getViewabilityChecker() == null || this.A0B.getTouchDataRecorder() == null) {
            return null;
        }
        com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr = new com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr(this.A0R, this.A0X.A7M(), this.A0O.A28().A01(), this.A0S, this.A0W, this.A0B.getViewabilityChecker(), this.A0B.getTouchDataRecorder(), this.A0O.A2A());
        com.facebook.ads.redexgen.core.YB.A0K(viewOnClickListenerC0834Kr);
        viewOnClickListenerC0834Kr.setText(this.A0O.A29().A0J().A04());
        viewOnClickListenerC0834Kr.setTextSize(14.0f);
        viewOnClickListenerC0834Kr.setPadding(com.facebook.ads.redexgen.core.XV.A02, com.facebook.ads.redexgen.core.XV.A02, com.facebook.ads.redexgen.core.XV.A02, com.facebook.ads.redexgen.core.XV.A02);
        viewOnClickListenerC0834Kr.setOnClickListener(new com.facebook.ads.redexgen.core.Z6(this));
        return viewOnClickListenerC0834Kr;
    }

    private com.facebook.ads.redexgen.core.C1336bq A0B() {
        com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A0R;
        com.facebook.ads.redexgen.core.C0894Na A01 = this.A0O.A28().A01();
        int i = !this.A0J ? 16 : 17;
        boolean z = this.A0J;
        java.lang.String[] strArr = A0i;
        if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0i;
        strArr2[7] = "YLS";
        strArr2[4] = "sNsC3VBoYaF6TxGjee";
        com.facebook.ads.redexgen.core.C1336bq c1336bq = new com.facebook.ads.redexgen.core.C1336bq(c1636gi, A01, true, i, !z ? 14 : 13, 0);
        c1336bq.A04(this.A0O.A29().A0I().A0G(), this.A0O.A29().A0I().A0F(), null, false, true);
        android.widget.TextView descriptionTv = c1336bq.getDescriptionTextView();
        descriptionTv.setAlpha(0.8f);
        descriptionTv.setMaxLines(1);
        descriptionTv.setEllipsize(android.text.TextUtils.TruncateAt.END);
        android.widget.TextView descriptionTv2 = c1336bq.getTitleTextView();
        descriptionTv2.setMaxLines(1);
        descriptionTv2.setEllipsize(android.text.TextUtils.TruncateAt.END);
        return c1336bq;
    }

    private void A0G() {
        java.lang.String A01;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(A0k, A0k);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        com.facebook.ads.redexgen.core.C1330bk c1330bk = new com.facebook.ads.redexgen.core.C1330bk(this.A0R);
        com.facebook.ads.redexgen.core.YB.A0N(c1330bk, 0);
        com.facebook.ads.redexgen.core.YB.A0K(c1330bk);
        new com.facebook.ads.redexgen.core.LM(c1330bk, this.A0R).A05(A0k, A0k).A07(this.A0O.A2C().A01());
        android.widget.TextView textView = new android.widget.TextView(this.A0R);
        com.facebook.ads.redexgen.core.YB.A0K(textView);
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(this.A0O.A28().A01().A07(true));
        textView.setText(this.A0O.A29().A0I().A0G());
        textView.setTextSize(!this.A0I ? 16.0f : 17.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        com.facebook.ads.redexgen.core.C1332bm c1332bm = new com.facebook.ads.redexgen.core.C1332bm(this.A0R, !this.A0I ? A0o : A0m, 5, A0n, -1);
        c1332bm.setGravity(16);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -1);
        android.widget.TextView textView2 = new android.widget.TextView(this.A0R);
        textView2.setTextColor(this.A0O.A28().A01().A07(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        if (!this.A0I) {
            textView2.setTextSize(13.0f);
        }
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -1);
        layoutParams3.leftMargin = com.facebook.ads.redexgen.core.XV.A0U;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A0R);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        android.widget.RelativeLayout.LayoutParams layoutParams4 = new android.widget.RelativeLayout.LayoutParams(-2, A0l);
        layoutParams4.topMargin = com.facebook.ads.redexgen.core.XV.A0U / 2;
        layoutParams4.addRule(3, textView.getId());
        linearLayout.addView(c1332bm, layoutParams2);
        linearLayout.addView(textView2, layoutParams3);
        android.widget.RelativeLayout.LayoutParams ratingInfoContainerParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        ratingInfoContainerParams.leftMargin = com.facebook.ads.redexgen.core.XV.A0U;
        ratingInfoContainerParams.addRule(1, c1330bk.getId());
        ratingInfoContainerParams.addRule(15);
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(getContext());
        relativeLayout.addView(linearLayout, layoutParams4);
        relativeLayout.addView(textView);
        if (this.A04 != null) {
            this.A04.removeAllViews();
            this.A04.addView(relativeLayout, ratingInfoContainerParams);
            this.A04.addView(c1330bk, layoutParams);
        }
        if (android.text.TextUtils.isEmpty(this.A0O.A29().A0I().A0C())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        c1332bm.setRating(java.lang.Float.parseFloat(this.A0O.A29().A0I().A0C()));
        if (this.A0O.A29().A0I().A09() == null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(A0D(0, 1, 63));
        if (!this.A0I) {
            A01 = java.text.NumberFormat.getNumberInstance().format(java.lang.Integer.parseInt(this.A0O.A29().A0I().A09()));
        } else {
            A01 = com.facebook.ads.redexgen.core.AbstractC1150Xg.A01(java.lang.Integer.parseInt(this.A0O.A29().A0I().A09()));
        }
        sb.append(A01);
        sb.append(A0D(1, 1, 23));
        textView2.setText(sb.toString());
    }

    private void A0H() {
        if (this.A0P.A0W()) {
            A0J();
        } else {
            A0O();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I() {
        this.A0L = true;
        if (this.A0O.A29().A0S()) {
            this.A0C.A06();
            this.A0W.A4k(this.A0X.A6l(), new com.facebook.ads.redexgen.core.C4K(0, 0));
        }
    }

    private void A0J() {
        com.facebook.ads.redexgen.core.C1459dq A0F = new com.facebook.ads.redexgen.core.Cdo(this.A0R, this.A0O.A29().A0I(), this.A0O.A2C()).A0A(this.A0O.A28().A01()).A0D(this.A0P.A0Q()).A0C(this.A0P.A0K()).A09(2000).A0E(this.A0I).A0B(this.A0E).A0F();
        com.facebook.ads.redexgen.core.VK.A04(A0F, this.A0T, com.facebook.ads.redexgen.core.VH.A0U);
        addView(A0F, A0p);
        A0F.A04(new com.facebook.ads.redexgen.core.C0918Ny(this));
    }

    private void A0K() {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        this.A0A = A09();
        this.A02 = new android.widget.RelativeLayout(getContext());
        com.facebook.ads.redexgen.core.YB.A0K(this.A02);
        this.A04 = new android.widget.RelativeLayout(getContext());
        com.facebook.ads.redexgen.core.YB.A0K(this.A04);
        if (this.A0d) {
            A0G();
        } else {
            android.widget.RelativeLayout relativeLayout = this.A04;
            com.facebook.ads.redexgen.core.C1336bq A0B = A0B();
            android.widget.RelativeLayout.LayoutParams iconAndMetaDataContainerParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            relativeLayout.addView(A0B, iconAndMetaDataContainerParams);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, com.facebook.ads.redexgen.core.XV.A09, 0);
        this.A02.addView(this.A04, layoutParams2);
        if (this.A0A != null) {
            com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr = this.A0A;
            java.lang.String[] strArr = A0i;
            if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
                throw new java.lang.RuntimeException();
            }
            A0i[3] = com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE;
            layoutParams2.addRule(0, viewOnClickListenerC0834Kr.getId());
            if (!this.A0I) {
                layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(6, this.A04.getId());
                layoutParams.addRule(8, this.A04.getId());
            } else {
                layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                com.facebook.ads.redexgen.core.YB.A0V(this.A0A, com.facebook.ads.redexgen.core.YB.A06(-16738826, A0j));
                this.A0A.setStateListAnimator(null);
                this.A0A.setPadding(com.facebook.ads.redexgen.core.XV.A0B, com.facebook.ads.redexgen.core.XV.A06, com.facebook.ads.redexgen.core.XV.A0B, com.facebook.ads.redexgen.core.XV.A06);
                com.facebook.ads.redexgen.core.YB.A0Z(this.A0A);
            }
            layoutParams.addRule(11);
            this.A02.addView(this.A0A, layoutParams);
        }
        com.facebook.ads.redexgen.core.YB.A0K(this.A0g);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(10);
        this.A01 = new android.widget.LinearLayout(getContext());
        com.facebook.ads.redexgen.core.YB.A0K(this.A01);
        android.widget.RelativeLayout.LayoutParams adWebViewParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        adWebViewParams.setMargins(com.facebook.ads.redexgen.core.XV.A09, com.facebook.ads.redexgen.core.XV.A05, com.facebook.ads.redexgen.core.XV.A09, com.facebook.ads.redexgen.core.XV.A05);
        adWebViewParams.addRule(12);
        this.A01.setOrientation(1);
        android.widget.RelativeLayout.LayoutParams toolbarParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        toolbarParams.setMargins(com.facebook.ads.redexgen.core.XV.A09, 0, com.facebook.ads.redexgen.core.XV.A09, 0);
        toolbarParams.addRule(3, this.A0g.getId());
        toolbarParams.addRule(2, this.A01.getId());
        this.A01.addView(this.A02, new android.widget.RelativeLayout.LayoutParams(-2, -2));
        this.A03 = new android.widget.RelativeLayout(getContext());
        com.facebook.ads.redexgen.core.YB.A0K(this.A03);
        this.A01.addView(this.A03);
        if (this.A0O.A2M()) {
            this.A0g.A08();
            A0M();
        }
        if (this.A0O.A2W()) {
            A0L();
        }
        this.A0g.setVisibility(4);
        this.A0B.setVisibility(4);
        this.A02.setVisibility(4);
        addView(this.A0g, layoutParams3);
        addView(this.A0B, toolbarParams);
        addView(this.A01, adWebViewParams);
        if (this.A0P.A0Y()) {
            this.A0B.A0C();
        }
    }

    private void A0L() {
        this.A09 = com.facebook.ads.redexgen.core.AbstractC1246aO.A02(this.A0R, com.facebook.ads.redexgen.core.EnumC1244aM.A03, this.A0O);
        com.facebook.ads.redexgen.core.YB.A0K(this.A09);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.topMargin = com.facebook.ads.redexgen.core.XV.A09;
        this.A03.addView(this.A09, layoutParams);
    }

    private void A0M() {
        this.A08 = com.facebook.ads.redexgen.core.AbstractC1246aO.A01(this.A0R, true, this.A0O, this.A0T, this.A0W, com.facebook.ads.redexgen.core.EnumC1244aM.A03, com.facebook.ads.redexgen.core.AbstractC1243aL.A00(this.A0O));
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.topMargin = com.facebook.ads.redexgen.core.XV.A09;
        this.A03.addView(this.A08, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        if (this.A0O.A2M() && this.A08 != null) {
            this.A08.A0P();
            if (this.A0O.A2U()) {
                com.facebook.ads.redexgen.core.AbstractC1243aL.A04(this.A0R, com.facebook.ads.redexgen.core.EnumC1244aM.A02);
            } else {
                com.facebook.ads.redexgen.core.AbstractC1243aL.A05(this.A0R, com.facebook.ads.redexgen.core.EnumC1244aM.A02);
            }
        }
        if (this.A0O.A2W() && this.A09 != null) {
            com.facebook.ads.redexgen.core.AbstractC1243aL.A06(this.A0R, com.facebook.ads.redexgen.core.EnumC1244aM.A02);
        }
        new com.facebook.ads.redexgen.core.VI(this.A0O.A2E(), this.A0S).A04(com.facebook.ads.redexgen.core.VH.A0z, null);
        this.A0b.set(true);
        com.facebook.ads.redexgen.core.YB.A0W(this);
        com.facebook.ads.redexgen.core.YB.A0H(this.A0B);
        com.facebook.ads.redexgen.core.YB.A0d(this.A0Z, this.A00, this.A0B);
        if (this.A0I) {
            boolean z = this.A0d;
            java.lang.String[] strArr = A0i;
            if (strArr[7].length() == strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0i;
            strArr2[6] = "qNCG6dDJsAPFbWTySRxInyS8ppXyMF33";
            strArr2[1] = "jWdNFAVobp8QAHjjZXwWCxlFqJ2u0nxR";
            if (z) {
                com.facebook.ads.redexgen.core.YB.A0H(this.A0g);
            }
        } else {
            com.facebook.ads.redexgen.core.YB.A0L(this.A0g);
        }
        com.facebook.ads.redexgen.core.YB.A0L(this.A0A);
        android.util.Pair<com.facebook.ads.redexgen.core.EnumC1490eL, android.view.View> A03 = this.A0a.A03(this.A0A);
        this.A00 = (android.view.View) A03.second;
        switch (com.facebook.ads.redexgen.core.Z7.A00[((com.facebook.ads.redexgen.core.EnumC1490eL) A03.first).ordinal()]) {
            case 1:
                android.widget.RelativeLayout.LayoutParams screenshotParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                screenshotParams.setMargins(0, this.A0g.getToolbarHeight(), 0, 0);
                if (!this.A0I) {
                    com.facebook.ads.redexgen.core.YB.A0L(this.A02);
                    screenshotParams.addRule(2, this.A01.getId());
                    addView(this.A00, screenshotParams);
                    break;
                } else {
                    android.view.View c1453dj = new com.facebook.ads.redexgen.core.C1453dj(this.A0R, this.A0O.A2C(), this.A0O.A29().A0I(), A09(), this.A0D, new com.facebook.ads.redexgen.core.Z5(this));
                    android.widget.RelativeLayout.LayoutParams screenshotParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                    if (this.A0O.A2M()) {
                        screenshotParams2.addRule(2, this.A01.getId());
                        if (this.A02 != null) {
                            com.facebook.ads.redexgen.core.YB.A0O(this.A02, 8);
                        }
                    }
                    addView(c1453dj, screenshotParams2);
                    android.view.View view = this.A0g;
                    java.lang.String[] strArr3 = A0i;
                    if (strArr3[7].length() == strArr3[4].length()) {
                        A0i[5] = "GuR3tgtU";
                        removeView(view);
                        break;
                    } else {
                        java.lang.String[] strArr4 = A0i;
                        strArr4[0] = "xaRPgQ1Vn5AR5k4AW07eBuZz1tirIodN";
                        strArr4[2] = "10QTFu18AzpwL0fCi5Lt2x9tRdyuYXAR";
                        removeView(view);
                        break;
                    }
                }
            case 2:
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                if (this.A0O.A2M()) {
                    layoutParams.addRule(2, this.A01.getId());
                    if (this.A02 != null) {
                        com.facebook.ads.redexgen.core.YB.A0O(this.A02, 8);
                    }
                } else {
                    com.facebook.ads.redexgen.core.YB.A0d(this.A01);
                }
                addView(this.A00, layoutParams);
                break;
        }
        if (this.A0P.A0c()) {
            this.A0R.A0F().AEP();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O() {
        com.facebook.ads.redexgen.core.YB.A0W(this);
        if (!this.A0P.A0Y()) {
            this.A0B.A0C();
        }
        this.A0g.setVisibility(0);
        this.A0B.setVisibility(0);
        if (this.A02 != null) {
            android.widget.RelativeLayout relativeLayout = this.A02;
            java.lang.String[] strArr = A0i;
            if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
                throw new java.lang.RuntimeException();
            }
            A0i[3] = "XO2ZpTY6Mgvz2u";
            relativeLayout.setVisibility(0);
        }
        if (this.A0A != null && this.A0O.A25() > 0 && this.A07 == null) {
            this.A07 = new com.facebook.ads.redexgen.core.XO(this.A0O.A25(), new com.facebook.ads.redexgen.core.C0917Nx(this));
            this.A07.A07();
        }
        this.A0U.A07();
        if (this.A08 != null && this.A0O.A2Q()) {
            com.facebook.ads.redexgen.core.C1241aJ c1241aJ = this.A08;
            java.lang.String[] strArr2 = A0i;
            if (strArr2[0].charAt(6) != strArr2[2].charAt(6)) {
                c1241aJ.A0Q();
            } else {
                A0i[5] = "teHq37vz";
                c1241aJ.A0Q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(int i) {
        java.lang.String valueOf = java.lang.String.valueOf(i);
        android.widget.Toast toast = this.A05;
        java.lang.String A0J = this.A0P.A0J();
        java.lang.String progress = A0D(2, 6, 75);
        com.facebook.ads.redexgen.core.YB.A0b(toast, A0J.replace(progress, valueOf), 49, 0, com.facebook.ads.redexgen.core.XV.A0T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0W(boolean z, java.lang.String str) {
        this.A0H = true;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(A0D(8, 12, 57), z ? A0D(79, 13, 2) : A0D(44, 12, 82));
        hashMap.put(A0D(20, 12, 7), str);
        new com.facebook.ads.redexgen.core.C1315bV(this.A0R, this.A0X.A7M(), this.A0B.getViewabilityChecker(), this.A0B.getTouchDataRecorder(), this.A0S, this.A0O.A2A(), this.A0W).A05(this.A0O.A2E(), this.A0O.A29().A0J().A05(), hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0X() {
        return this.A0O.A10().equals(A0D(65, 14, 113)) || (this.A0O.A10().equals(A0D(32, 12, 60)) && this.A0O.A29().A0V());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0Y() {
        return this.A0e && !this.A0K && !this.A0M && this.A0P.A0C() < this.A0O.A29().A0H().A03();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AAu(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        this.A06 = c0998Re;
        this.A06.A0A(this.A0Q);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFA(boolean z) {
        this.A0U.A06();
        this.A0G = true;
        if (!this.A0F && !z && this.A08 != null) {
            this.A08.A0P();
        }
        this.A0F = false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AFi(boolean z) {
        if ((!this.A0e || !this.A0M) && !this.A0K) {
            boolean z2 = this.A0c.get();
            java.lang.String[] strArr = A0i;
            if (strArr[6].charAt(22) == strArr[1].charAt(22)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0i;
            strArr2[0] = "5YF9hd1VnayjDYXn8X9NIXHiJcVpNWhU";
            strArr2[2] = "6mHNY01g6eF3bUPoEn1oonlPgYyDS663";
            if (z2) {
                com.facebook.ads.redexgen.core.XO xo = this.A0U;
                java.lang.String[] strArr3 = A0i;
                if (strArr3[6].charAt(22) != strArr3[1].charAt(22)) {
                    java.lang.String[] strArr4 = A0i;
                    strArr4[7] = "SY9";
                    strArr4[4] = "T1jNCZgiG5fRSAcWDF";
                    if (xo.A05()) {
                        return;
                    }
                } else {
                    java.lang.String[] strArr5 = A0i;
                    strArr5[7] = "0UX";
                    strArr5[4] = "cSjXeSxWsZqlnq3791";
                    if (xo.A05()) {
                        return;
                    }
                }
                this.A0U.A07();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AIv(android.os.Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public java.lang.String getCurrentClientToken() {
        return this.A0O.A2E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void onDestroy() {
        this.A0V.A03();
        if (this.A08 != null) {
            this.A08.A0O();
        }
        if (this.A06 != null) {
            this.A06.A0B(this.A0Q);
        }
        if (this.A0B != null) {
            if (!android.text.TextUtils.isEmpty(this.A0O.A2E())) {
                this.A0S.AB7(this.A0O.A2E(), new com.facebook.ads.redexgen.core.C1293b9().A03(this.A0B.getViewabilityChecker()).A02(this.A0B.getTouchDataRecorder()).A05());
            }
            com.facebook.ads.redexgen.core.C1487eI c1487eI = this.A0B;
            java.lang.String[] strArr = A0i;
            if (strArr[0].charAt(6) != strArr[2].charAt(6)) {
                throw new java.lang.RuntimeException();
            }
            A0i[3] = "Lk0Kz0u4YEu";
            c1487eI.A0D();
        }
        this.A0U.A06();
        this.A0g.setToolbarListener(null);
        this.A0N.removeCallbacksAndMessages(null);
        this.A05 = null;
        this.A06 = null;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            AFi(false);
        } else {
            this.A0F = true;
            AFA(false);
        }
    }

    public void setListener(com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
    }

    public void setServerSideRewardHandler(com.facebook.ads.redexgen.core.C1504ea c1504ea) {
        this.A0C = c1504ea;
    }
}
