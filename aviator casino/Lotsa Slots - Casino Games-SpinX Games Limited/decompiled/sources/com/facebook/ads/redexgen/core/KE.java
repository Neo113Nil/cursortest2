package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class KE extends com.facebook.ads.redexgen.core.AbstractC1349c3 {
    public static byte[] A0k;
    public static java.lang.String[] A0l = {"fr3Y9tf6ePgTPq", "pEcG", "X6n0DjY1D3c56kEYNT7NkudbHULcUpi8", "xLfqb7j3EStc", "2nglUwJ7J1gVDM", "1eQzmRPEbuFcZFemJlVYaDXjMdIAS51D", "mnsD3rfSZRPYnMaeA3V0PZWjFbonJuRI", "JvQjcWyuZKXxmxTpCuNSfYxSgxmPRmOD"};
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public android.os.Handler A08;
    public android.view.View A09;
    public android.view.inputmethod.InputMethodManager A0A;
    public android.widget.LinearLayout A0B;
    public android.widget.LinearLayout A0C;
    public android.widget.TextView A0D;
    public com.facebook.ads.redexgen.core.AbstractC1801jd A0E;
    public com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc A0F;
    public com.facebook.ads.redexgen.core.M6 A0G;
    public com.facebook.ads.redexgen.core.C1265ah A0H;
    public com.facebook.ads.redexgen.core.M3 A0I;
    public com.facebook.ads.redexgen.core.C1353c7 A0J;
    public com.facebook.ads.redexgen.core.C1385cd A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public final android.os.Handler A0Z;
    public final android.view.View A0a;
    public final com.facebook.ads.redexgen.core.AbstractC0888Mt A0b;
    public final com.facebook.ads.redexgen.core.VI A0c;
    public final com.facebook.ads.redexgen.core.InterfaceC1314bU A0d;
    public final com.facebook.ads.redexgen.core.InterfaceC1327bh A0e;
    public final com.facebook.ads.redexgen.core.C1328bi A0f;
    public final com.facebook.ads.redexgen.core.DZ A0g;
    public final java.lang.Runnable A0h;
    public final boolean A0i;
    public final boolean A0j;

    public static java.lang.String A0I(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0k, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A0l;
            if (strArr[3].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0l;
            strArr2[3] = "BAn7g4Tg6kNh";
            strArr2[1] = "sSvO";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 34);
            i4++;
        }
    }

    public static void A0W() {
        A0k = new byte[]{75, 68, 65, 75, 67, 119, 91, 71, 93, 90, 75, 77, 86, 81, 79, 74, 75, 96, 82, 90, 75, 87, 80, 91, 107, 109, 123, 108, 125, 114, 119, 125, 117, 65, 120, 119, 114, 106, 123, 108, 123, 122, 98, 124, 123, 113, 122, 98, 65};
    }

    static {
        A0W();
        A0o = com.facebook.ads.redexgen.core.XV.A0E;
        A0m = com.facebook.ads.redexgen.core.XV.A0I;
        A0q = com.facebook.ads.redexgen.core.XV.A0U;
        A0n = com.facebook.ads.redexgen.core.P3.A02(-1, 77);
        A0p = com.facebook.ads.redexgen.core.XV.A05;
    }

    public KE(com.facebook.ads.redexgen.core.C1353c7 c1353c7) {
        super(c1353c7, true);
        this.A02 = 0;
        this.A0L = false;
        this.A0T = false;
        this.A0V = false;
        this.A0W = false;
        this.A0X = false;
        this.A0U = false;
        this.A0Y = false;
        this.A0P = false;
        this.A0R = false;
        this.A0Q = false;
        this.A0O = false;
        this.A07 = 0;
        this.A01 = 0;
        this.A0S = false;
        this.A0Z = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A0h = new com.facebook.ads.redexgen.core.RunnableC1370cO(this);
        this.A0N = false;
        this.A08 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A0A = (android.view.inputmethod.InputMethodManager) c1353c7.A06().getSystemService(A0I(12, 12, 29));
        this.A0J = c1353c7;
        this.A0E = this.A0J.A05();
        this.A0c = new com.facebook.ads.redexgen.core.VI(c1353c7.A05().A2E(), c1353c7.A07());
        this.A0g = this.A0J.A0E();
        if (this.A0g != null) {
            com.facebook.ads.redexgen.core.YB.A0K(this.A0g);
        }
        this.A0a = this.A0J.A03();
        this.A0b = com.facebook.ads.redexgen.core.C0889Mu.A01(c1353c7.A06(), c1353c7.A07(), c1353c7.A05().A2E(), com.facebook.ads.redexgen.core.XB.A00(c1353c7.A05().A29().A0J().A05()), new java.util.HashMap(), false, true, this.A0E.A2A());
        this.A0d = new com.facebook.ads.redexgen.core.KP(this);
        com.facebook.ads.redexgen.core.AbstractC1337br.A00(c1353c7.A06(), this, c1353c7.A05().A29().A0H().A08());
        setupLayoutConfiguration(false);
        A0R();
        A0N();
        this.A0F = new com.facebook.ads.redexgen.core.KH(this);
        postDelayed(this.A0F, 1000L);
        A0V();
        this.A0e = new com.facebook.ads.redexgen.core.KG(this);
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek = this.A0J.A02() instanceof com.facebook.ads.redexgen.core.C0673Ek ? (com.facebook.ads.redexgen.core.C0673Ek) this.A0J.A02() : null;
        this.A0f = new com.facebook.ads.redexgen.core.C1328bi(c1353c7, this.A0E, c0673Ek, this.A0J.A0C(), this.A0e, this.A0D, this.A0K, this.A0g, this.A0a);
        if (c0673Ek != null && com.facebook.ads.redexgen.core.C1086Up.A1L(getAdContextWrapper())) {
            com.facebook.ads.redexgen.core.AbstractC1296bC.A00(c0673Ek.getVideoImplView(), com.facebook.ads.redexgen.core.C1086Up.A1M(getAdContextWrapper()), new com.facebook.ads.redexgen.core.ViewOnClickListenerC1371cP(this));
        } else if (c0673Ek == null && this.A09 != null && com.facebook.ads.redexgen.core.C1086Up.A1J(getAdContextWrapper())) {
            com.facebook.ads.redexgen.core.AbstractC1296bC.A00(this.A09, com.facebook.ads.redexgen.core.C1086Up.A1K(getAdContextWrapper()), new com.facebook.ads.redexgen.core.ViewOnClickListenerC1372cQ(this));
        }
        this.A0i = c1353c7.A05().A1m();
        this.A0j = c1353c7.A05().A1z();
        getAdContextWrapper().A0F().ACI(this.A0i, this.A0j, c1353c7.A05().A2L());
    }

    public static /* synthetic */ int A03(com.facebook.ads.redexgen.core.KE ke) {
        int i = ke.A01;
        ke.A01 = i + 1;
        return i;
    }

    public static /* synthetic */ int A05(com.facebook.ads.redexgen.core.KE ke) {
        int i = ke.A07;
        ke.A07 = i + 1;
        return i;
    }

    private void A0J() {
        com.facebook.ads.redexgen.core.YB.A0J(this.A0C);
        this.A0C = new android.widget.LinearLayout(this.A0J.A06());
        com.facebook.ads.redexgen.core.YB.A0U(this.A0C, getAdContextWrapper());
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, this.A0L ? this.A03 / 4 : this.A03 / 5);
        layoutParams.addRule(12);
        this.A0C.setLayoutParams(layoutParams);
        addView(this.A0C, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K() {
        if (this.A0E.A1e() && this.A0N) {
            this.A0N = false;
            A0g(A0I(24, 18, 60));
        }
    }

    private void A0L() {
        if (this.A0E.A1e() && this.A0N) {
            this.A0N = false;
            java.util.Map<java.lang.String, java.lang.String> A05 = new com.facebook.ads.redexgen.core.C1293b9().A03(null).A02(null).A05();
            A05.put(A0I(0, 12, 10), A0I(24, 18, 60));
            getAdEventManager().AB6(this.A0E.A2E(), A05);
        }
    }

    private void A0M() {
        com.facebook.ads.redexgen.core.AbstractC1171Yb A0B;
        if (this.A0J.A05().A1x() && (A0B = this.A0J.A0B()) != null) {
            A0B.setProgressSpinnerInvisible(false);
        }
    }

    private void A0N() {
        com.facebook.ads.redexgen.core.YB.A0J(this.A0B);
        this.A0B = new android.widget.LinearLayout(this.A0J.A06());
        this.A0B.setOrientation(1);
        com.facebook.ads.redexgen.core.YB.A0K(this.A0B);
        A0T();
        this.A0B.setBackgroundColor(-1);
        addView(this.A0B);
    }

    private void A0O() {
        if (this.A0a != null) {
            com.facebook.ads.redexgen.core.YB.A0J(this.A0a);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(com.facebook.ads.redexgen.core.AbstractC1349c3.A09, com.facebook.ads.redexgen.core.AbstractC1349c3.A09);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.setMargins(com.facebook.ads.redexgen.core.AbstractC1349c3.A08, this.A06, com.facebook.ads.redexgen.core.AbstractC1349c3.A08, com.facebook.ads.redexgen.core.AbstractC1349c3.A08);
            addView(this.A0a, layoutParams);
        }
    }

    private void A0P() {
        if (this.A0g != null) {
            com.facebook.ads.redexgen.core.YB.A0J(this.A0g);
            this.A0g.setPadding(A0p, A0p, A0p, A0p);
            this.A0g.A08(-1, A0n, false);
            this.A0g.setTranslationY(0.0f);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, A0o);
            layoutParams.addRule(12);
            addView(this.A0g, layoutParams);
        }
    }

    private void A0Q() {
        com.facebook.ads.redexgen.core.AbstractC1171Yb A0B = this.A0J.A0B();
        if (A0B == null) {
            return;
        }
        A0B.setPageDetailsVisible((this.A0M || A0B.A0E()) ? false : true);
    }

    private void A0R() {
        this.A09 = this.A0J.A02();
        if (this.A09 != null) {
            if (this.A0E.A1e()) {
                this.A09.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1373cR(this));
            }
            com.facebook.ads.redexgen.core.YB.A0J(this.A09);
            com.facebook.ads.redexgen.core.YB.A0K(this.A09);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(15);
            addView(this.A09, 1, layoutParams);
        }
        this.A0D = new android.widget.TextView(this.A0J.A06());
        com.facebook.ads.redexgen.core.YB.A0K(this.A0D);
        this.A0D.setGravity(17);
        this.A0D.setTextColor(getColors().A06(true));
        this.A0D.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.A0D.setMaxLines(2);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        layoutParams2.setMargins(A0q, A0q / 2, A0q, this.A0g == null ? A0q : A0o);
        addView(this.A0D, layoutParams2);
        com.facebook.ads.redexgen.core.YB.A0K(this.A0D);
        this.A0K = new com.facebook.ads.redexgen.core.C1385cd(this.A0J.A06(), getCtaButton(), this.A0J.A05(), this.A0J.A07(), this.A0J.A0C(), this.A0J.A0F(), this.A0J.A0A(), getColors(), this.A0d);
        this.A0K.setAutoClickTime(this.A0J.A05(), this.A0J.A0B());
        com.facebook.ads.redexgen.core.YB.A0G(1010, this.A0K);
        addView(this.A0K);
        A0U();
        A0J();
        if (com.facebook.ads.redexgen.core.C1086Up.A17(this.A0J.A06())) {
            android.view.View.OnClickListener onClickListener = new com.facebook.ads.redexgen.core.ViewOnClickListenerC1374cS(this);
            this.A0C.setOnClickListener(onClickListener);
            if (this.A0J.A0B() != null) {
                android.view.View.OnClickListener onClickListener2 = new com.facebook.ads.redexgen.core.ViewOnClickListenerC1375cT(this);
                this.A0J.A0B().setCTAClickListener(onClickListener2);
            }
        }
    }

    private void A0S() {
        this.A0U = true;
        this.A0K.setVisibility(8);
        com.facebook.ads.redexgen.core.YB.A0W(this);
        removeCallbacks(this.A0F);
        com.facebook.ads.redexgen.core.YB.A0d(this.A0K);
        com.facebook.ads.redexgen.core.YB.A0d(this.A0g, this.A0a, this.A0f, this.A0D, this.A0G, this.A0J.A0B(), this.A0B, this.A0H);
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            java.lang.Object parent = getParent();
            if (parent instanceof android.view.View) {
                android.view.View parentView = (android.view.View) parent;
                parentView.setFitsSystemWindows(false);
                parentView.setPadding(0, 0, 0, 0);
            }
        }
        if (this.A09 instanceof com.facebook.ads.redexgen.core.C0673Ek) {
            com.facebook.ads.redexgen.core.C0673Ek c0673Ek = (com.facebook.ads.redexgen.core.C0673Ek) this.A09;
            java.util.Iterator<com.facebook.ads.redexgen.core.InterfaceC1524eu> it = c0673Ek.getPlugins().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.facebook.ads.redexgen.core.InterfaceC1524eu next = it.next();
                if (next instanceof com.facebook.ads.redexgen.core.AnonymousClass34) {
                    c0673Ek.A0g(next);
                    break;
                }
            }
        }
        addView(new com.facebook.ads.redexgen.core.C1365cJ(this.A0J.A06(), this.A0E, this.A0c, this.A0Z, this.A0J.A0C()).A0C(getRegularCtaForEndCard()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0T() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, this.A04);
        if (A1Q()) {
            layoutParams.setMargins(0, this.A04 / 5, 0, 0);
            layoutParams.addRule(12);
            java.lang.String[] strArr = A0l;
            if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0l;
            strArr2[3] = "lVu96jIJ4wtN";
            strArr2[1] = "vEsO";
            this.A0B.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A04 + 1, 0, 0);
        }
        android.widget.LinearLayout linearLayout = this.A0B;
        java.lang.String[] strArr3 = A0l;
        if (strArr3[4].length() != strArr3[0].length()) {
            linearLayout.setTranslationY(0.0f);
            this.A0B.setLayoutParams(layoutParams);
            return;
        }
        java.lang.String[] strArr4 = A0l;
        strArr4[6] = "ao8FhOByUXKbyI2dbjVU10hQSvAA73UK";
        strArr4[5] = "1fPkz4yBU6BXLdgQ7SVXdDzzX5ZOz4LN";
        linearLayout.setTranslationY(0.0f);
        this.A0B.setLayoutParams(layoutParams);
    }

    private void A0U() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, this.A0L ? this.A03 / 4 : this.A03 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A0D.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0K.setLayoutParams(layoutParams);
        this.A0K.A03();
    }

    private void A0V() {
        if (!this.A0U) {
            A0P();
            A0O();
        }
        A0Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0f(java.lang.String str) {
        com.facebook.ads.redexgen.core.M3 m3;
        com.facebook.ads.redexgen.core.YB.A0J(this.A0I);
        com.facebook.ads.redexgen.core.KR kr = new com.facebook.ads.redexgen.core.KR(this);
        if (this.A0J.A06().A0E() == null) {
            this.A0J.A06().A0F().A9v();
        }
        if (com.facebook.ads.redexgen.core.AbstractC1087Uq.A02(this.A0J.A06()) || this.A0J.A06().A0E() == null) {
            m3 = new com.facebook.ads.redexgen.core.M3(this.A0J.A06(), kr);
        } else {
            m3 = new com.facebook.ads.redexgen.core.M3(this.A0J.A06(), this.A0J.A06().A0E(), kr);
        }
        this.A0I = m3;
        this.A0I.setOnTouchListener(new com.facebook.ads.redexgen.core.ViewOnTouchListenerC1367cL(this));
        setUpBrowserControls(this.A0I);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A0B.addView(this.A0I, layoutParams);
        this.A0I.loadUrl(str);
    }

    private void A0g(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> A05 = new com.facebook.ads.redexgen.core.C1293b9().A03(null).A02(null).A05();
        A05.put(A0I(0, 12, 10), str);
        this.A0c.A04(com.facebook.ads.redexgen.core.VH.A0J, A05);
        this.A0J.A0C().A4j(this.A0E.A0w());
        getAdEventManager().ABM(this.A0E.A2E(), A05);
        if (com.facebook.ads.redexgen.core.C1086Up.A2U(this.A0J.A06())) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.facebook.ads.redexgen.core.AbstractC1840kH.A04, java.lang.Boolean.TRUE.toString());
            hashMap.put(com.facebook.ads.redexgen.core.AbstractC1840kH.A05, java.lang.Boolean.TRUE.toString());
            hashMap.put(com.facebook.ads.redexgen.core.AbstractC1840kH.A06, java.lang.Boolean.TRUE.toString());
            getAdEventManager().ABn(this.A0E.A2E(), hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0h(java.lang.String str) {
        if (this.A0E.A25() > 0) {
            if (this.A0E.A2O() && this.A0O) {
                return;
            }
            this.A0O = true;
            A0g(str);
            return;
        }
        if (this.A0E.A1d()) {
            A0K();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0i(boolean z) {
        if (!z && A0m()) {
            return;
        }
        this.A0M = z;
        android.animation.ObjectAnimator objectAnimator = null;
        if (!z) {
            this.A08.removeCallbacksAndMessages(null);
        } else {
            this.A01 = 0;
            this.A07 = 0;
            this.A0P = false;
            this.A0Q = false;
            this.A0R = false;
            this.A0O = false;
            A0k(!A0m(), 0);
            A0M();
        }
        if (!this.A0S) {
            postDelayed(new com.facebook.ads.redexgen.core.KQ(this, z), 250L);
        }
        java.lang.String A0I = A0I(48, 1, 26);
        if (z) {
            objectAnimator = android.animation.ObjectAnimator.ofFloat(this.A0K, A0I, this.A0K.getY(), this.A04 / 5);
        }
        android.widget.LinearLayout linearLayout = this.A0B;
        float y = this.A0B.getY();
        int i = this.A04;
        if (z) {
            i /= 5;
        }
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(linearLayout, A0I, y, i);
        ofFloat.setDuration(500L);
        if (this.A09 != null) {
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.A09, A0I, this.A09.getY(), 0.0f);
            ofFloat2.setDuration(500L);
            int height = this.A09.getHeight();
            int i2 = this.A04;
            if (z) {
                i2 /= 5;
            }
            android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofInt(height, i2).setDuration(500L);
            duration.addUpdateListener(new com.facebook.ads.redexgen.core.C1368cM(this));
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            animatorSet.playTogether(ofFloat, ofFloat2, duration);
            if (objectAnimator != null) {
                objectAnimator.setDuration(500L);
                animatorSet.playTogether(objectAnimator);
            }
            animatorSet.addListener(new com.facebook.ads.redexgen.core.C1369cN(this, z));
            if (this.A0j) {
                boolean z2 = this.A09 instanceof com.facebook.ads.redexgen.core.C0673Ek;
                java.lang.String[] strArr = A0l;
                if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0l;
                strArr2[3] = "kmPKPZPxIo82";
                strArr2[1] = "o2de";
                if (z2) {
                    ((com.facebook.ads.redexgen.core.C0673Ek) this.A09).A0c(animatorSet, z);
                }
            }
            animatorSet.start();
        }
    }

    private void A0j(boolean z) {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z);
        com.facebook.ads.redexgen.core.YB.A0J(this.A09);
        if (this.A09 == null) {
            this.A09 = this.A0J.A02();
            com.facebook.ads.redexgen.core.YB.A0K(this.A09);
        }
        boolean z2 = this.A0M;
        java.lang.String[] strArr = A0l;
        if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0l;
        strArr2[2] = "vsQMzuL85pElT0uyLkCOYkbLp6FYZ6Kp";
        strArr2[7] = "Jg0wEDfumSgIDDBadFZcUW5HjHx0Xq4t";
        if (z2) {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, this.A04 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            if (com.facebook.ads.redexgen.core.C1086Up.A1J(getAdContextWrapper()) && getResources().getConfiguration().orientation == 2 && !(this.A09 instanceof com.facebook.ads.redexgen.core.C0673Ek)) {
                layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -1);
            }
            layoutParams.addRule(13);
            A0N();
        }
        if (this.A09 != null) {
            this.A09.setTranslationY(0.0f);
            addView(this.A09, 1, layoutParams);
        }
        A0J();
        A0U();
    }

    private void A0k(boolean z, int i) {
        if (this.A0G != null && this.A0i) {
            this.A0G.setCloseButtonVisibility(z ? 0 : 4);
            com.facebook.ads.redexgen.core.C1636gi adContextWrapper = getAdContextWrapper();
            java.lang.String[] strArr = A0l;
            if (strArr[4].length() != strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0l;
            strArr2[4] = "GBT9VwLYKrAlXj";
            strArr2[0] = "vffPPOX2qjrj4g";
            adContextWrapper.A0F().ACG(!z, i);
        }
    }

    private boolean A0l() {
        return this.A0E.A29().A0H().A0B() && this.A0X && !this.A0Y && !this.A0V;
    }

    private boolean A0m() {
        return this.A0i && this.A0W;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final com.facebook.ads.redexgen.core.EnumC0885Mq A1B(java.lang.String str) {
        return this.A0K.A02(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1C() {
        this.A0Z.removeCallbacksAndMessages(null);
        A0L();
        super.A1C();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1D() {
        com.facebook.ads.redexgen.core.AbstractC1171Yb A0B = this.A0J.A0B();
        if (A0B != null) {
            A0B.setPageDetailsVisible((A1Q() || A0B.A0E()) ? false : true);
        }
        this.A0X = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1E() {
        if (this.A0J.A0B() != null) {
            this.A0J.A0B().setPageDetailsVisible(false);
        }
        this.A0X = true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1F() {
        this.A0V = false;
        this.A0W = false;
        A0k(true, 3);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1G() {
        this.A0V = this.A0E.A29().A0H().A04() > 0;
        this.A0W = true;
        A0k(false, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1H(com.facebook.ads.redexgen.core.NR nr, java.lang.String str, double d, android.os.Bundle bundle) {
        super.A1H(nr, str, d, bundle);
        this.A0K.setCta(this.A0E.A29().A0J(), this.A0E.A2E(), new java.util.HashMap<>(), this.A0d);
        java.lang.String A0F = nr.A0I().A0F();
        if (A0F != null) {
            java.lang.String description = A0F.trim();
            if (description.length() != 0) {
                this.A0D.setText(A0F);
                if (com.facebook.ads.redexgen.core.C1086Up.A17(this.A0J.A06())) {
                    android.widget.LinearLayout linearLayout = this.A0C;
                    java.lang.String[] strArr = A0l;
                    if (strArr[2].charAt(25) == strArr[7].charAt(25)) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A0l;
                    strArr2[3] = "eomTAZA5kOTO";
                    strArr2[1] = "I37n";
                    linearLayout.setClickable(true);
                }
                if (d > 0.0d) {
                    this.A02 = (int) (this.A05 / d);
                }
                this.A02 = !this.A0L ? this.A03 : this.A02;
            }
        }
        com.facebook.ads.redexgen.core.YB.A0O(this.A0C, 8);
        if (com.facebook.ads.redexgen.core.C1086Up.A17(this.A0J.A06())) {
            this.A0C.setClickable(false);
        }
        if (d > 0.0d) {
        }
        this.A02 = !this.A0L ? this.A03 : this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1I(com.facebook.ads.redexgen.core.C4K c4k) {
        super.A1I(c4k);
        if (this.A0E.A29().A0K().A04() && !A1Q()) {
            A0S();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A1N() {
        return !A1Q();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A1O() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A1P(boolean z) {
        if (A1Q()) {
            getAdContextWrapper().A0F().ACF();
            A0i(false);
            return true;
        }
        if (A0l()) {
            getAdContextWrapper().A0F().ACJ();
            this.A0f.A07(this);
            return true;
        }
        if (this.A0E.A29().A0K().A04()) {
            getAdContextWrapper().A0F().ACK();
            if (this.A09 instanceof com.facebook.ads.redexgen.core.C0673Ek) {
                com.facebook.ads.redexgen.core.C0673Ek simpleVideoView = (com.facebook.ads.redexgen.core.C0673Ek) this.A09;
                simpleVideoView.A0h(true);
            }
            A0S();
            return true;
        }
        getAdContextWrapper().A0F().ACH();
        return false;
    }

    public final boolean A1Q() {
        return this.A0M;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public int getCloseButtonStyle() {
        if (A1Q()) {
            return A0m() ? 2 : 3;
        }
        if (this.A0E.A29().A0H().A02() >= 0 && A1N() && (this.A0V || this.A0X)) {
            return 8;
        }
        if (this.A0V) {
            return 2;
        }
        if (this.A0E.A29().A0H().A0B()) {
            return 1;
        }
        if (this.A0X) {
            return 4;
        }
        if (this.A0E.A29().A0K().A04()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    private com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr getRegularCtaForEndCard() {
        com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr = new com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr(getAdContextWrapper(), this.A0J.A05().A0w(), this.A0E.A28().A01(), getAdEventManager(), this.A0J.A0C(), (com.facebook.ads.redexgen.core.C1581fp) null, this.A0J.A0A(), this.A0E.A2A());
        viewOnClickListenerC0834Kr.setViewShowsOverMedia(true);
        com.facebook.ads.redexgen.core.YB.A0K(viewOnClickListenerC0834Kr);
        viewOnClickListenerC0834Kr.setText(this.A0E.A29().A0J().A04());
        com.facebook.ads.redexgen.core.YB.A0G(1001, viewOnClickListenerC0834Kr);
        viewOnClickListenerC0834Kr.setCta(this.A0E.A29().A0J(), this.A0E.A2E(), new java.util.HashMap(), null);
        return viewOnClickListenerC0834Kr;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0j(A1Q());
        A0V();
        setupLayoutConfiguration(A1Q());
        A0T();
        if (this.A0U && android.os.Build.VERSION.SDK_INT >= 35) {
            java.lang.Object parent = getParent();
            if (parent instanceof android.view.View) {
                android.view.View parentView = (android.view.View) parent;
                parentView.setFitsSystemWindows(false);
                parentView.setPadding(0, 0, 0, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrowserProgressBarValue(int i) {
        if (this.A0H != null) {
            this.A0H.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public void setChainedWatchAndBrowseSkippableStatus(boolean z) {
        this.A0W = !z;
        A0k(z, 4);
    }

    public void setChildChainedAd(boolean z) {
        this.A0S = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleToBrowser(java.lang.String str) {
        if (this.A0G != null) {
            this.A0G.setTitle(str);
        }
    }

    private void setUpBrowserControls(com.facebook.ads.redexgen.core.M3 m3) {
        com.facebook.ads.redexgen.core.YB.A0J(this.A0G);
        this.A0G = new com.facebook.ads.redexgen.core.M6(this.A0J.A06(), m3, true, this.A0j);
        if (this.A0i) {
            java.lang.String[] strArr = A0l;
            if (strArr[4].length() != strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0l;
            strArr2[4] = "M6ycP1RHJpeE8b";
            strArr2[0] = "ycEZieyXOIyeai";
            A0k(false, 1);
        }
        m3.setBrowserNavigationListener(this.A0G.getBrowserNavigationListener());
        com.facebook.ads.redexgen.core.YB.A0K(this.A0G);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0G.setListener(new com.facebook.ads.redexgen.core.KS(this));
        this.A0G.setOnTouchListener(new com.facebook.ads.redexgen.core.ViewOnTouchListenerC1366cK(this));
        this.A0B.addView(this.A0G, layoutParams);
        com.facebook.ads.redexgen.core.YB.A0J(this.A0H);
        this.A0H = new com.facebook.ads.redexgen.core.C1265ah(this.A0J.A06(), null, android.R.attr.progressBarStyleHorizontal);
        this.A0B.addView(this.A0H, new android.widget.LinearLayout.LayoutParams(-1, A0m));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlToBrowser(java.lang.String str) {
        if (this.A0G != null) {
            this.A0G.setUrl(str);
        }
    }

    private void setupLayoutConfiguration(boolean z) {
        this.A0L = getResources().getConfiguration().orientation == 2;
        this.A06 = this.A0J.A0B() != null ? this.A0J.A0B().getToolbarHeight() : 0;
        this.A0M = z;
        this.A03 = android.content.res.Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A05 = android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels;
        android.graphics.Point point = new android.graphics.Point();
        android.view.WindowManager windowManager = (android.view.WindowManager) getAdContextWrapper().getSystemService(A0I(42, 6, 55));
        if (windowManager != null) {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                android.view.WindowMetrics windowMetrics = windowManager.getCurrentWindowMetrics();
                point.y = windowMetrics.getBounds().bottom - windowMetrics.getBounds().top;
            } else {
                windowManager.getDefaultDisplay().getRealSize(point);
            }
        }
        this.A04 = point.y > 0 ? point.y : this.A03;
        this.A02 = this.A03;
    }
}
