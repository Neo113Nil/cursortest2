package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ji, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0799Ji extends com.facebook.ads.redexgen.core.AbstractC1349c3 {
    public static byte[] A0e;
    public static java.lang.String[] A0f = {"f8QpfXiibO7PJ4", "00U3", "QiVJCyNgR8A0MkWyBq6Sbwgp9SRG2Fs1", "mRNBH9qX8UoqoKTWOWXmqQrDEDoanN5e", "rH0ZwdBUaXUf9W", "YRkVnZkRMq0VwRkFeWVEZBfHhK", "H8ri0FbqOBWJinUWmvrCS", "7rqKKWYNcxFyr7Opoa7bPZ9HiZbpRRd0"};
    public static final int A0g;
    public int A00;
    public int A01;
    public android.widget.ImageView A02;
    public android.widget.LinearLayout A03;
    public android.widget.RelativeLayout A04;
    public android.widget.RelativeLayout A05;
    public com.facebook.ads.redexgen.core.M8 A06;
    public com.facebook.ads.redexgen.core.C1265ah A07;
    public com.facebook.ads.redexgen.core.M3 A08;
    public com.facebook.ads.redexgen.core.C1313bT A09;
    public com.facebook.ads.redexgen.core.C1328bi A0A;
    public com.facebook.ads.redexgen.core.C1365cJ A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final float A0Q;
    public final android.os.Handler A0R;
    public final android.os.Handler A0S;
    public final android.view.View A0T;
    public final android.view.View A0U;
    public final android.view.inputmethod.InputMethodManager A0V;
    public final com.facebook.ads.redexgen.core.AbstractC0888Mt A0W;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A0X;
    public final com.facebook.ads.redexgen.core.VI A0Y;
    public final com.facebook.ads.redexgen.core.LK A0Z;
    public final com.facebook.ads.redexgen.core.InterfaceC1314bU A0a;
    public final com.facebook.ads.redexgen.core.C1353c7 A0b;
    public final java.lang.Runnable A0c;
    public final boolean A0d;

    public static java.lang.String A0L(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0e, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 95);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0Y() {
        A0e = new byte[]{35, 44, 41, 35, 43, com.google.common.base.Ascii.US, 51, 47, 53, 50, 35, 37, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.US, 1, 4, 5, 46, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DC4, 5, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.NAK, 75, 77, 91, 76, 93, 82, 87, 93, 85, 97, 88, 87, 82, 74, 91, 76, 91, 90, 38};
    }

    static {
        A0Y();
        A0g = com.facebook.ads.redexgen.core.XV.A0I;
    }

    public C0799Ji(com.facebook.ads.redexgen.core.C1353c7 c1353c7) {
        super(c1353c7, true);
        this.A0K = false;
        this.A0M = false;
        this.A0N = false;
        this.A0L = false;
        this.A0O = false;
        this.A0G = false;
        this.A0I = false;
        this.A0H = false;
        this.A0F = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A0J = false;
        this.A0P = false;
        this.A0E = false;
        this.A0S = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A0C = true;
        this.A0c = new com.facebook.ads.redexgen.core.RunnableC1390ci(this);
        this.A0a = new com.facebook.ads.redexgen.core.C0810Jt(this);
        this.A0R = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A0V = (android.view.inputmethod.InputMethodManager) c1353c7.A06().getSystemService(A0L(12, 12, 46));
        this.A0b = c1353c7;
        this.A0X = this.A0b.A05();
        this.A0Y = new com.facebook.ads.redexgen.core.VI(c1353c7.A05().A2E(), c1353c7.A07());
        this.A0Q = A00(c1353c7);
        this.A0U = this.A0b.A03();
        this.A0W = com.facebook.ads.redexgen.core.C0889Mu.A01(c1353c7.A06(), c1353c7.A07(), c1353c7.A05().A2E(), com.facebook.ads.redexgen.core.XB.A00(c1353c7.A05().A29().A0J().A05()), new java.util.HashMap(), false, true, this.A0X.A2A());
        com.facebook.ads.redexgen.core.AbstractC1337br.A00(c1353c7.A06(), this, c1353c7.A05().A29().A0H().A08());
        this.A0D = false;
        this.A0T = this.A0b.A02();
        this.A0Z = A0F(this.A0b);
        addView(this.A0Z);
        com.facebook.ads.redexgen.core.YB.A0K(this.A0Z);
        this.A0Z.getProgressBarAnimation().setShouldClearAnimationWhenVideoCompleted(false);
        A0T();
        A0R();
        A0S();
        A0W();
        if (this.A0T != null && A0w()) {
            this.A0A = A0I((com.facebook.ads.redexgen.core.C0673Ek) this.A0T);
        }
        this.A0d = c1353c7.A05().A1m();
        getAdContextWrapper().A0F().ACI(this.A0d, true, c1353c7.A05().A2L());
        if (!(this.A0T instanceof com.facebook.ads.redexgen.core.C0673Ek)) {
            A0P();
        }
        A0O();
    }

    private float A00(com.facebook.ads.redexgen.core.C1353c7 c1353c7) {
        if (this.A0b.A02() instanceof com.facebook.ads.redexgen.core.C0673Ek) {
            double A0k = c1353c7.A05().A0k();
            java.lang.String[] strArr = A0f;
            if (strArr[0].length() != strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            A0f[7] = "8ZXxKRs86BLRZmcfqRB4QIE0v7vA7Zkm";
            float mAspectRatio = (float) A0k;
            return mAspectRatio;
        }
        float mAspectRatio2 = new com.facebook.ads.redexgen.core.C1042Sx(c1353c7.A06()).A0M(this.A0X.A29().A0H().A08());
        return mAspectRatio2;
    }

    public static /* synthetic */ int A02(com.facebook.ads.redexgen.core.C0799Ji c0799Ji) {
        int i = c0799Ji.A00;
        c0799Ji.A00 = i + 1;
        return i;
    }

    public static /* synthetic */ int A04(com.facebook.ads.redexgen.core.C0799Ji c0799Ji) {
        int i = c0799Ji.A01;
        c0799Ji.A01 = i + 1;
        return i;
    }

    private com.facebook.ads.redexgen.core.LK A0F(com.facebook.ads.redexgen.core.C1353c7 c1353c7) {
        com.facebook.ads.redexgen.core.LK A03 = new com.facebook.ads.redexgen.core.C1338bs(this.A0Q, c1353c7.A05().A0w(), c1353c7.A06(), getColors(), c1353c7.A05(), c1353c7.A0C(), getCtaButton(), com.facebook.ads.redexgen.core.AbstractC0817Ka.A0G, true, c1353c7.A07(), c1353c7.A0F(), c1353c7.A0A(), c1353c7.A0E(), c1353c7.A08(), true).A03();
        android.widget.RelativeLayout.LayoutParams adDetailsParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        adDetailsParams.addRule(12);
        A03.setVisibility(8);
        A03.setLayoutParams(adDetailsParams);
        if (c1353c7.A0G() != null) {
            java.lang.String A0G = c1353c7.A0G();
            java.lang.String[] strArr = A0f;
            if (strArr[5].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0f;
            strArr2[2] = "VZhN7WRkFtQENMyvVst4luqikh6KPW2a";
            strArr2[3] = "z0fI7TK2oK2liNoF2nj9L3f0XJiqwQYs";
            A03.setChainedAdInfo(A0G);
        }
        return A03;
    }

    private com.facebook.ads.redexgen.core.C1328bi A0I(com.facebook.ads.redexgen.core.C0673Ek c0673Ek) {
        return new com.facebook.ads.redexgen.core.C1328bi(this.A0b, this.A0X, c0673Ek, this.A0b.A0C(), new com.facebook.ads.redexgen.core.K4(this), this.A0U, this.A0Z, this.A03);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M() {
        if (this.A0X.A1e() && this.A0E) {
            this.A0E = false;
            A0n(A0L(24, 18, 97));
        }
    }

    private void A0N() {
        if (this.A0X.A1e() && this.A0E) {
            this.A0E = false;
            java.util.Map<java.lang.String, java.lang.String> A05 = new com.facebook.ads.redexgen.core.C1293b9().A03(null).A02(null).A05();
            A05.put(A0L(0, 12, 31), A0L(24, 18, 97));
            getAdEventManager().AB6(this.A0X.A2E(), A05);
        }
    }

    private void A0O() {
        if (!A0y()) {
            return;
        }
        this.A02 = new android.widget.ImageView(this.A0b.A06());
        addView(this.A02);
        this.A02.setVisibility(4);
        new com.facebook.ads.redexgen.core.LM(this.A02, this.A0b.A06()).A04().A06(new com.facebook.ads.redexgen.core.K3(this)).A07(this.A0X.A29().A0H().A08());
    }

    private void A0P() {
        this.A0b.A06().A0F().AKh(com.facebook.ads.redexgen.core.XL.A00(this.A0Q), getResources().getConfiguration().orientation, false, this.A0b.A0G() != null, com.facebook.ads.redexgen.core.AbstractC0888Mt.A0A());
        this.A05 = new android.widget.RelativeLayout(this.A0b.A06());
        this.A04 = new android.widget.RelativeLayout(this.A0b.A06());
        if (this.A0T != null) {
            com.facebook.ads.redexgen.core.YB.A0d(this.A0T);
            android.widget.RelativeLayout relativeLayout = this.A04;
            java.lang.String[] strArr = A0f;
            if (strArr[2].charAt(22) == strArr[3].charAt(22)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0f;
            strArr2[0] = "ObNU9T88skhfra";
            strArr2[4] = "gcdrQI7RHa0S1U";
            relativeLayout.addView(this.A0T);
        }
        this.A05.addView(this.A04, new android.widget.RelativeLayout.LayoutParams(-2, -2));
        com.facebook.ads.redexgen.core.YB.A0K(this.A04);
        addView(this.A05, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        com.facebook.ads.redexgen.core.YB.A0K(this.A05);
        A0Z(getResources().getConfiguration().orientation);
        this.A0Z.setVisibility(0);
        A0t(this.A0D, false);
        this.A0Z.A0u(getResources().getConfiguration().orientation);
        this.A0Z.bringToFront();
    }

    private void A0Q() {
        com.facebook.ads.redexgen.core.AbstractC1171Yb A0B;
        if (this.A0b.A05().A1x() && (A0B = this.A0b.A0B()) != null) {
            A0B.setProgressSpinnerInvisible(false);
        }
    }

    private void A0R() {
        com.facebook.ads.redexgen.core.YB.A0J(this.A03);
        this.A03 = new android.widget.LinearLayout(this.A0b.A06());
        this.A03.setOrientation(1);
        com.facebook.ads.redexgen.core.YB.A0K(this.A03);
        A0t(this.A0D, false);
        this.A03.setBackgroundColor(-1);
        addView(this.A03);
    }

    private void A0S() {
        if (this.A0b.A05().A1X() && this.A0W != null && com.facebook.ads.redexgen.core.XL.A03(this.A0Q)) {
            this.A09 = new com.facebook.ads.redexgen.core.C1313bT(this.A0b.A06(), this.A0b.A0C(), this.A0b.A05().A0l(), this.A0W, this.A0Z.getCTAButton(), this.A0Z);
            addView(this.A09.getBrowserPeekView());
            this.A0S.postDelayed(new com.facebook.ads.redexgen.core.RunnableC1389ch(this), 5900L);
        }
    }

    private void A0T() {
        if (this.A0T != null && this.A0X.A1e()) {
            this.A0T.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1392ck(this));
        }
        com.facebook.ads.redexgen.core.YB.A0J(this.A0T);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        if (this.A0T != null) {
            addView(this.A0T, layoutParams);
            com.facebook.ads.redexgen.core.YB.A0K(this.A0T);
        }
        if (com.facebook.ads.redexgen.core.C1086Up.A17(this.A0b.A06())) {
            android.view.View.OnClickListener onClickListener = new com.facebook.ads.redexgen.core.ViewOnClickListenerC1393cl(this);
            this.A0Z.setCTAClickListener(onClickListener);
            if (this.A0b.A0B() != null) {
                android.view.View.OnClickListener onClickListener2 = new com.facebook.ads.redexgen.core.ViewOnClickListenerC1394cm(this);
                this.A0b.A0B().setCTAClickListener(onClickListener2);
            }
        }
        if (this.A0T != null) {
            if (com.facebook.ads.redexgen.core.C1086Up.A1L(getAdContextWrapper())) {
                com.facebook.ads.redexgen.core.AbstractC1296bC.A00(this.A0T, com.facebook.ads.redexgen.core.C1086Up.A1M(getAdContextWrapper()), new com.facebook.ads.redexgen.core.ViewOnClickListenerC1395cn(this));
                return;
            }
            com.facebook.ads.redexgen.core.C1636gi adContextWrapper = getAdContextWrapper();
            if (A0f[6].length() == 10) {
                throw new java.lang.RuntimeException();
            }
            A0f[7] = "Oiyftodkn5sp5o8TW1yBI7W6XQQ10Nb7";
            if (!com.facebook.ads.redexgen.core.C1086Up.A1J(adContextWrapper)) {
                return;
            }
            com.facebook.ads.redexgen.core.AbstractC1296bC.A00(this.A0T, com.facebook.ads.redexgen.core.C1086Up.A1K(getAdContextWrapper()), new com.facebook.ads.redexgen.core.ViewOnClickListenerC1396co(this));
        }
    }

    private void A0U() {
        if (this.A0U != null) {
            com.facebook.ads.redexgen.core.YB.A0J(this.A0U);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(com.facebook.ads.redexgen.core.AbstractC1349c3.A0A, com.facebook.ads.redexgen.core.AbstractC1349c3.A0A);
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A09, com.facebook.ads.redexgen.core.XV.A0N, com.facebook.ads.redexgen.core.XV.A09, com.facebook.ads.redexgen.core.XV.A05);
            layoutParams.addRule(9);
            layoutParams.addRule(10);
            addView(this.A0U, layoutParams);
        }
    }

    private void A0V() {
        com.facebook.ads.redexgen.core.AbstractC1171Yb A0B = this.A0b.A0B();
        if (A0B == null) {
            return;
        }
        A0B.setPageDetailsVisible((this.A0D || A0B.A0E()) ? false : true);
        java.lang.String[] strArr = A0f;
        if (strArr[2].charAt(22) == strArr[3].charAt(22)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0f;
        strArr2[2] = "1yoT7KI3snCc494ZeQVfvKcwdedzZqUL";
        strArr2[3] = "maitTS2j9i61dN9OwsPG0RZMowmllQ6i";
    }

    private void A0W() {
        if (!this.A0L) {
            A0U();
        }
        A0V();
    }

    private void A0X() {
        com.facebook.ads.redexgen.core.DZ A0E = this.A0b.A0E();
        if (A0E == null) {
            return;
        }
        int videoDuration = this.A0T != null ? ((com.facebook.ads.redexgen.core.C0673Ek) this.A0T).getDuration() : 0;
        if (A0E.getCustomDuration() > videoDuration) {
            A0E.setCustomDuration(videoDuration);
        }
    }

    private void A0Z(int i) {
        android.view.ViewGroup viewGroup;
        android.widget.RelativeLayout adjacentView;
        if (this.A0T == null) {
            return;
        }
        if (A0w()) {
            viewGroup = (android.view.ViewGroup) this.A0T;
            adjacentView = (android.widget.RelativeLayout) ((com.facebook.ads.redexgen.core.C0673Ek) this.A0T).getVideoView();
            ((com.facebook.ads.redexgen.core.C0673Ek) this.A0T).A0Z(i);
        } else {
            A0a(i);
            viewGroup = this.A05;
            adjacentView = this.A04;
        }
        if (viewGroup != null) {
            A0c(i, viewGroup, adjacentView);
        }
    }

    private void A0a(int i) {
        if (this.A0T == null || this.A04 == null) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.A0T.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.removeRule(10);
        layoutParams.removeRule(9);
        if (i == 1) {
            layoutParams.width = -1;
            layoutParams.height = -2;
            layoutParams.addRule(10);
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
            if (com.facebook.ads.redexgen.core.XL.A05(this.A0Q)) {
                layoutParams.addRule(13);
                layoutParams.addRule(14);
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.A04.getLayoutParams();
                layoutParams2.addRule(14);
                android.widget.RelativeLayout relativeLayout = this.A04;
                if (A0f[6].length() == 10) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0f;
                strArr[5] = "iCwgI3rcmLyVygWAbxB5hffDSu";
                strArr[1] = "9hOX";
                relativeLayout.setLayoutParams(layoutParams2);
            } else {
                layoutParams.addRule(9);
            }
        }
        this.A0T.setLayoutParams(layoutParams);
    }

    private void A0b(int i) {
        if (this.A0U != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.A0U.getLayoutParams();
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A09, i, com.facebook.ads.redexgen.core.XV.A09, com.facebook.ads.redexgen.core.XV.A05);
            this.A0U.setLayoutParams(layoutParams);
        }
    }

    private final void A0c(int i, android.view.ViewGroup viewGroup, android.widget.RelativeLayout relativeLayout) {
        if (relativeLayout == null) {
            return;
        }
        com.facebook.ads.redexgen.core.YB.A0J(this.A0Z);
        if ((this.A0Z instanceof com.facebook.ads.redexgen.core.C6V) || (this.A0Z instanceof com.facebook.ads.redexgen.core.C6U)) {
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams.addRule(1, relativeLayout.getId());
                this.A0Z.setLayoutParams(layoutParams);
                viewGroup.addView(this.A0Z);
            } else {
                addView(this.A0Z, layoutParams);
            }
        } else if (this.A0Z instanceof com.facebook.ads.redexgen.core.C6T) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(12);
            this.A0Z.setLayoutParams(layoutParams2);
            addView(this.A0Z, layoutParams2);
        }
        this.A0Z.A0l(i);
        this.A0Z.A0y(viewGroup, relativeLayout, i);
    }

    private void A0d(android.view.ViewGroup viewGroup, android.view.View view, int i) {
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        if (i == 1) {
            layoutParams2.width = -1;
            layoutParams2.height = -2;
        } else {
            layoutParams2.width = -2;
            layoutParams2.height = -1;
        }
        layoutParams2.removeRule(14);
        viewGroup.setLayoutParams(layoutParams);
        view.setLayoutParams(layoutParams2);
        A0Z(i);
    }

    private void A0e(android.view.ViewGroup viewGroup, android.view.View view, com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb, int i) {
        com.facebook.ads.redexgen.core.YB.A0d(this.A03);
        com.facebook.ads.redexgen.core.YB.A0J(abstractC1171Yb);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0T, com.facebook.ads.redexgen.core.XV.A0N, 0, 0);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams toolbarParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        if (i == 1) {
            toolbarParams.width = -1;
            toolbarParams.height = -2;
        } else {
            toolbarParams.width = -2;
            toolbarParams.height = -1;
        }
        toolbarParams.removeRule(14);
        viewGroup.setLayoutParams(layoutParams2);
        view.setLayoutParams(toolbarParams);
        this.A0Z.A0z(viewGroup, false, false, this.A03.getId());
        A0Z(i);
        viewGroup.addView(abstractC1171Yb, layoutParams);
    }

    private void A0f(android.view.ViewGroup viewGroup, android.view.View view, com.facebook.ads.redexgen.core.AbstractC1171Yb abstractC1171Yb, int i) {
        com.facebook.ads.redexgen.core.YB.A0J(this.A03);
        com.facebook.ads.redexgen.core.YB.A0J(abstractC1171Yb);
        com.facebook.ads.redexgen.core.YB.A0J(this.A0Z);
        boolean A05 = com.facebook.ads.redexgen.core.XL.A05(this.A0Q);
        boolean isBrowserBelowMediaView = i == 1;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        if (!this.A0X.A2U() || i != 2 || !A05) {
            A0b(com.facebook.ads.redexgen.core.XV.A0N);
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0T, com.facebook.ads.redexgen.core.XV.A0N, 0, 0);
        } else {
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0T, com.facebook.ads.redexgen.core.XV.A0B, 0, 0);
            A0b(com.facebook.ads.redexgen.core.XV.A0B);
        }
        android.widget.RelativeLayout.LayoutParams parentLayoutParam = (android.widget.RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams2.removeRule(14);
        layoutParams2.removeRule(9);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) this.A03.getLayoutParams();
        layoutParams3.removeRule(3);
        layoutParams3.removeRule(1);
        boolean isBrowserBelowMediaView2 = isBrowserBelowMediaView || A05;
        if (isBrowserBelowMediaView2) {
            parentLayoutParam.height = getHeightPixels() / 4;
            layoutParams2.height = getHeightPixels() / 4;
            layoutParams2.addRule(14);
            layoutParams3.addRule(3, viewGroup.getId());
        } else {
            if (this.A0T != null && A0w()) {
                ((com.facebook.ads.redexgen.core.C0673Ek) this.A0T).A0Z(i);
            } else {
                A0a(i);
            }
            parentLayoutParam.height = -1;
            layoutParams2.height = -1;
            layoutParams2.addRule(9);
            layoutParams3.addRule(1, view.getId());
        }
        parentLayoutParam.addRule(9);
        parentLayoutParam.addRule(10);
        viewGroup.setLayoutParams(parentLayoutParam);
        layoutParams2.width = -2;
        view.setLayoutParams(layoutParams2);
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.setMargins(0, 0, 0, 0);
        this.A03.setLayoutParams(layoutParams3);
        if (isBrowserBelowMediaView2) {
            addView(this.A03);
            addView(abstractC1171Yb, layoutParams);
        } else {
            viewGroup.addView(this.A03);
            int id = this.A03.getId();
            if (A0f[7].charAt(21) == '6') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0f;
            strArr[2] = "7JaGKtDxzcfwUdZHrMC5peuenb4R08oC";
            strArr[3] = "WhY5lESONlEwbbLTXD1P91R7rTQEAxl9";
            layoutParams.addRule(0, id);
            viewGroup.addView(abstractC1171Yb, layoutParams);
        }
        this.A0Z.A0z(viewGroup, true, A05, this.A03.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0m(java.lang.String str) {
        com.facebook.ads.redexgen.core.M3 m3;
        com.facebook.ads.redexgen.core.YB.A0J(this.A08);
        com.facebook.ads.redexgen.core.KA ka = new com.facebook.ads.redexgen.core.KA(this);
        if (this.A0b.A06().A0E() == null) {
            this.A0b.A06().A0F().A9v();
        }
        if (com.facebook.ads.redexgen.core.AbstractC1087Uq.A02(this.A0b.A06()) || this.A0b.A06().A0E() == null) {
            m3 = new com.facebook.ads.redexgen.core.M3(this.A0b.A06(), ka);
        } else {
            m3 = new com.facebook.ads.redexgen.core.M3(this.A0b.A06(), this.A0b.A06().A0E(), ka);
        }
        this.A08 = m3;
        this.A08.setOnTouchListener(new com.facebook.ads.redexgen.core.ViewOnTouchListenerC1386ce(this));
        setUpBrowserControls(this.A08);
        this.A03.addView(this.A08, new android.widget.LinearLayout.LayoutParams(-1, -1));
        this.A08.loadUrl(str);
    }

    private void A0n(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> A05 = new com.facebook.ads.redexgen.core.C1293b9().A03(null).A02(null).A05();
        A05.put(A0L(0, 12, 31), str);
        this.A0Y.A04(com.facebook.ads.redexgen.core.VH.A0J, A05);
        this.A0b.A0C().A4j(this.A0X.A0w());
        getAdEventManager().ABM(this.A0X.A2E(), A05);
        if (com.facebook.ads.redexgen.core.C1086Up.A2U(this.A0b.A06())) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.facebook.ads.redexgen.core.AbstractC1840kH.A04, java.lang.Boolean.TRUE.toString());
            hashMap.put(com.facebook.ads.redexgen.core.AbstractC1840kH.A05, java.lang.Boolean.TRUE.toString());
            hashMap.put(com.facebook.ads.redexgen.core.AbstractC1840kH.A06, java.lang.Boolean.TRUE.toString());
            getAdEventManager().ABn(this.A0X.A2E(), hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0o(java.lang.String str) {
        if (this.A0X.A25() > 0) {
            if (this.A0X.A2O() && this.A0F) {
                return;
            }
            this.A0F = true;
            A0n(str);
            return;
        }
        if (this.A0X.A1d()) {
            A0M();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0p(java.lang.String str) {
        if (!this.A0D) {
            this.A0Z.getCTAButton().A0E(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0q(boolean z) {
        if (!z && A0x()) {
            return;
        }
        this.A0D = z;
        if (z) {
            this.A00 = 0;
            this.A01 = 0;
            this.A0G = false;
            this.A0H = false;
            this.A0I = false;
            this.A0F = false;
            A0s(!A0x(), 0);
            A0Q();
        } else {
            this.A0R.removeCallbacksAndMessages(null);
        }
        if (!this.A0J) {
            postDelayed(new com.facebook.ads.redexgen.core.K6(this, z), 250L);
        }
        android.widget.LinearLayout linearLayout = this.A03;
        float y = this.A03.getY();
        float heightPixels = getHeightPixels();
        if (z) {
            if (A0f[7].charAt(21) == '6') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0f;
            strArr[5] = "hio5BYluDvHiSt1DGRQHr7K5cg";
            strArr[1] = "0MBl";
            heightPixels /= 4.0f;
        }
        float[] fArr = {y, heightPixels};
        java.lang.String A0L = A0L(42, 1, 0);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(linearLayout, A0L, fArr);
        ofFloat.setDuration(500L);
        if (this.A0T != null) {
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.A0T, A0L, this.A0T.getY(), 0.0f);
            ofFloat2.setDuration(500L);
            int height = this.A0T.getHeight();
            int heightPixels2 = getHeightPixels();
            if (z) {
                heightPixels2 /= 4;
            }
            android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofInt(height, heightPixels2).setDuration(500L);
            duration.addUpdateListener(new com.facebook.ads.redexgen.core.C1387cf(this));
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            animatorSet.playTogether(ofFloat, ofFloat2, duration);
            animatorSet.addListener(new com.facebook.ads.redexgen.core.C1388cg(this, z));
            if (this.A0T instanceof com.facebook.ads.redexgen.core.C0673Ek) {
                ((com.facebook.ads.redexgen.core.C0673Ek) this.A0T).A0c(animatorSet, z);
            }
        }
        A0t(this.A0D, true);
        java.lang.String[] strArr2 = A0f;
        if (strArr2[0].length() != strArr2[4].length()) {
            throw new java.lang.RuntimeException();
        }
        A0f[7] = "lHjeSTcy3i9rYziz9k5lFO2SBDOz5dmU";
        if (!z && this.A08 != null) {
            com.facebook.ads.redexgen.core.M3 m3 = this.A08;
            if (A0f[7].charAt(21) != '6') {
                A0f[7] = "CSTMrgBvM8lyRSCUouINeSS4n16b06JB";
                m3.destroy();
            } else {
                m3.destroy();
            }
        }
    }

    private void A0r(boolean z) {
        this.A0L = true;
        this.A0Z.A0o();
        com.facebook.ads.redexgen.core.YB.A0d(this.A0A, this.A06, this.A03, this.A0U, this.A0Z, this.A0T, this.A0b.A0E(), this.A05, this.A04, this.A0b.A0B());
        if (this.A09 != null) {
            this.A09.A0B();
        }
        com.facebook.ads.redexgen.core.YB.A0W(this);
        if (this.A02 != null) {
            this.A02.setVisibility(0);
        }
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            java.lang.Object parent = getParent();
            if (parent instanceof android.view.View) {
                android.view.View view = (android.view.View) parent;
                view.setFitsSystemWindows(false);
                view.setPadding(0, 0, 0, 0);
            }
        }
        android.view.View view2 = this.A0T;
        if (A0f[6].length() == 10) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0f;
        strArr[5] = "Cvniwq1c5lbs2HOl3mraOy3NaR";
        strArr[1] = "MPMP";
        if (view2 != null && A0w()) {
            com.facebook.ads.redexgen.core.C0673Ek c0673Ek = (com.facebook.ads.redexgen.core.C0673Ek) this.A0T;
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
        this.A0B = new com.facebook.ads.redexgen.core.C1365cJ(this.A0b.A06(), this.A0X, this.A0Y, this.A0S, this.A0b.A0C());
        this.A0B.A0I(z);
        addView(this.A0B.A0C(getRegularCtaForEndCard()));
        if (!z) {
            if (this.A0b.A0B() != null) {
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(10);
                layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0T, com.facebook.ads.redexgen.core.XV.A0N, 0, 0);
                addView(this.A0b.A0B(), layoutParams);
                this.A0b.A0B().bringToFront();
            }
            this.A0C = true;
            if (this.A0b.A0D() != null) {
                this.A0b.A0D().AFw(true);
                if (this.A0b.A0B() != null && this.A0b.A05().A29().A0K().A00() > 0) {
                    this.A0C = false;
                    if (this.A0b.A05().A2P()) {
                        this.A0b.A0B().setToolbarActionMode(8);
                    } else {
                        this.A0b.A0B().setToolbarActionMode(2);
                    }
                    new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.facebook.ads.redexgen.core.RunnableC1391cj(this), this.A0b.A05().A29().A0K().A00());
                }
            }
        }
    }

    private void A0s(boolean z, int i) {
        if (this.A06 != null && this.A0d) {
            this.A06.setCloseButtonVisibility(4);
            getAdContextWrapper().A0F().ACG(!z, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0t(boolean z, boolean z2) {
        if (A0v()) {
            return;
        }
        com.facebook.ads.redexgen.core.AbstractC1171Yb A0B = this.A0b.A0B();
        if (A0f[6].length() == 10) {
            throw new java.lang.RuntimeException();
        }
        A0f[6] = "gQE173ac";
        if (A0B == null) {
            return;
        }
        android.view.ViewGroup parentView = getParentView();
        if (A0f[6].length() == 10) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0f;
        strArr[2] = "HI7slczAopnLrQVo6YkGF0EaDN2P2XJ6";
        strArr[3] = "Ht1OtVWvCs2jCygEm2rJxJr9xXXDE1GX";
        android.view.View containerView = getContainerView();
        if (parentView == null || containerView == null) {
            return;
        }
        int i = getResources().getConfiguration().orientation;
        if (z) {
            A0f(parentView, containerView, A0B, i);
        } else if (z2) {
            A0e(parentView, containerView, A0B, i);
        } else {
            A0d(parentView, containerView, i);
        }
    }

    private boolean A0u() {
        if (this.A0X.A29().A0H().A0B() && this.A0N) {
            boolean z = this.A0O;
            java.lang.String[] strArr = A0f;
            if (strArr[5].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0f;
            strArr2[2] = "CULoRpyPQpgDQm7q7yLjDGE92r3i5BFz";
            strArr2[3] = "FD29Dr2zGBD96QEWLn0naQvlBTnIp70Y";
            if (!z && !this.A0M) {
                return true;
            }
        }
        return false;
    }

    private boolean A0v() {
        return this.A0T == null || (A0w() && !this.A0P);
    }

    private boolean A0w() {
        return this.A0T != null && (this.A0T instanceof com.facebook.ads.redexgen.core.C0673Ek);
    }

    private boolean A0x() {
        return this.A0d;
    }

    private boolean A0y() {
        return this.A0X.A29().A0V() && this.A0X.A29().A0K().A04();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final com.facebook.ads.redexgen.core.EnumC0885Mq A1B(java.lang.String str) {
        com.facebook.ads.redexgen.core.EnumC0885Mq enumC0885Mq = com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
        if (!A1R()) {
            com.facebook.ads.redexgen.core.C1365cJ c1365cJ = this.A0B;
            java.lang.String[] strArr = A0f;
            if (strArr[0].length() != strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0f;
            strArr2[5] = "mDHIeobZMaiDBC6GT0NjXylYqI";
            strArr2[1] = "9M0w";
            if (c1365cJ != null && this.A0B.A0E() != null) {
                return this.A0B.A0E().A0E(str);
            }
            return getCtaButton().A0E(str);
        }
        return enumC0885Mq;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1C() {
        A0N();
        this.A0S.removeCallbacksAndMessages(null);
        this.A0Z.A0j();
        if (this.A0B != null) {
            this.A0B.A0F();
        }
        if (this.A09 != null) {
            this.A09.A0B();
            this.A09 = null;
        }
        super.A1C();
        java.lang.String[] strArr = A0f;
        if (strArr[5].length() == strArr[1].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0f;
        strArr2[5] = "320DltLTniR8mdOryPF1IAFoFp";
        strArr2[1] = "a388";
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1D() {
        com.facebook.ads.redexgen.core.AbstractC1171Yb A0B = this.A0b.A0B();
        if (A0B != null) {
            A0B.setPageDetailsVisible((A1R() || A0B.A0E()) ? false : true);
        }
        this.A0N = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1E() {
        if (this.A0b.A0B() != null) {
            this.A0b.A0B().setPageDetailsVisible(false);
        }
        this.A0N = true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1F() {
        this.A0M = false;
        A0s(true, 3);
        this.A0Z.A0n();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1G() {
        this.A0M = this.A0X.A29().A0H().A04() > 0;
        A0s(false, 2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1H(com.facebook.ads.redexgen.core.NR nr, java.lang.String str, double d, android.os.Bundle bundle) {
        super.A1H(nr, str, d, bundle);
        this.A0Z.setInfo(nr.A0I(), nr.A0J(), str, this.A0X.A2C().A01(), this.A0b.A09(), this.A0a);
        this.A0Z.getCTAButton().setIsInAppBrowser(true);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1I(com.facebook.ads.redexgen.core.C4K c4k) {
        super.A1I(c4k);
        if (A0y() && !A1R()) {
            A0r(true);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1J(com.facebook.ads.redexgen.core.E1 e1) {
        super.A1J(e1);
        this.A0b.A06().A0F().AKh(com.facebook.ads.redexgen.core.XL.A00(this.A0Q), getResources().getConfiguration().orientation, true, false, com.facebook.ads.redexgen.core.AbstractC0888Mt.A0A());
        this.A0P = true;
        A0Z(getResources().getConfiguration().orientation);
        this.A0Z.setVisibility(0);
        A0t(this.A0D, false);
        this.A0Z.A0u(getResources().getConfiguration().orientation);
        this.A0Z.bringToFront();
        A0X();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1K(com.facebook.ads.redexgen.core.C4A c4a, int i) {
        super.A1K(c4a, i);
        int duration = this.A0T != null ? ((com.facebook.ads.redexgen.core.C0673Ek) this.A0T).getDuration() : 0;
        int videoDuration = c4a.A00();
        int i2 = (duration * i) + videoDuration;
        if (A0f[7].charAt(21) == '6') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0f;
        strArr[0] = "smnJ2j3iSPWePz";
        strArr[4] = "RsYNc9pmOTKXmH";
        int videoDuration2 = i2 / 1000;
        this.A0Z.A0s(videoDuration2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1L(boolean z) {
        super.A1L(z);
        this.A0Z.A0m(z);
        if (this.A0B != null) {
            this.A0B.A0H(z);
        }
        if (this.A09 != null && getResources().getConfiguration().orientation == 1) {
            this.A09.A0C();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A1M() {
        return A0y();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A1N() {
        return !A1R();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A1O() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A1P(boolean z) {
        if (A0u()) {
            getAdContextWrapper().A0F().ACJ();
            if (this.A0A != null) {
                this.A0A.A07(this);
            }
            return true;
        }
        if (A0y()) {
            getAdContextWrapper().A0F().ACK();
            if (this.A0T instanceof com.facebook.ads.redexgen.core.C0673Ek) {
                com.facebook.ads.redexgen.core.C0673Ek simpleVideoView = (com.facebook.ads.redexgen.core.C0673Ek) this.A0T;
                simpleVideoView.A0h(true);
            }
            A0r(true);
            return true;
        }
        getAdContextWrapper().A0F().ACH();
        return false;
    }

    public final void A1Q(boolean z) {
        A0r(z);
    }

    public final boolean A1R() {
        return this.A0D;
    }

    public final boolean A1S() {
        return this.A0L;
    }

    public final boolean A1T() {
        return this.A0C;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public int getCloseButtonStyle() {
        if (this.A0X.A29().A0H().A02() >= 0 && A1N()) {
            boolean z = this.A0M;
            if (A0f[6].length() == 10) {
                throw new java.lang.RuntimeException();
            }
            A0f[7] = "Ls3R1IhphSEeti0RclvzrDjIYGWvTtJZ";
            if (z || this.A0N) {
                return 8;
            }
        }
        if (this.A0M) {
            return 2;
        }
        if (this.A0X.A29().A0H().A0B()) {
            return 1;
        }
        if (this.A0N) {
            return 4;
        }
        if (A0y()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    private android.view.View getContainerView() {
        if (this.A0T != null && A0w()) {
            return ((com.facebook.ads.redexgen.core.C0673Ek) this.A0T).getVideoView();
        }
        return this.A04;
    }

    private int getHeightPixels() {
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        return displayMetrics.heightPixels;
    }

    private android.view.ViewGroup getParentView() {
        if (A0w()) {
            return (android.view.ViewGroup) this.A0T;
        }
        return this.A05;
    }

    private com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr getRegularCtaForEndCard() {
        com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr = new com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr(getAdContextWrapper(), this.A0b.A05().A0w(), this.A0X.A28().A01(), getAdEventManager(), this.A0b.A0C(), (com.facebook.ads.redexgen.core.C1581fp) null, this.A0b.A0A(), this.A0X.A2A());
        viewOnClickListenerC0834Kr.setViewShowsOverMedia(true);
        com.facebook.ads.redexgen.core.YB.A0K(viewOnClickListenerC0834Kr);
        viewOnClickListenerC0834Kr.setText(this.A0X.A29().A0J().A04());
        com.facebook.ads.redexgen.core.YB.A0G(1001, viewOnClickListenerC0834Kr);
        viewOnClickListenerC0834Kr.setCta(this.A0X.A29().A0J(), this.A0X.A2E(), new java.util.HashMap(), null);
        return viewOnClickListenerC0834Kr;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A0L) {
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                java.lang.Object parent = getParent();
                if (parent instanceof android.view.View) {
                    android.view.View view = (android.view.View) parent;
                    view.setFitsSystemWindows(false);
                    view.setPadding(0, 0, 0, 0);
                    return;
                }
                return;
            }
            return;
        }
        A0t(this.A0D, false);
        if (this.A09 != null) {
            this.A09.A0D(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public void setChainedWatchAndBrowseSkippableStatus(boolean z) {
        A0s(z, 4);
    }

    public void setChildChainedAd(boolean z) {
        this.A0J = z;
    }

    private void setUpBrowserControls(com.facebook.ads.redexgen.core.M3 m3) {
        com.facebook.ads.redexgen.core.YB.A0J(this.A06);
        this.A06 = new com.facebook.ads.redexgen.core.M8(this.A0b.A06(), m3, true);
        if (this.A0d) {
            A0s(false, 1);
        }
        m3.setBrowserNavigationListener(this.A06.getBrowserNavigationListener());
        com.facebook.ads.redexgen.core.YB.A0K(this.A06);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0U, com.facebook.ads.redexgen.core.XV.A0U, com.facebook.ads.redexgen.core.XV.A0U, com.facebook.ads.redexgen.core.XV.A0U);
        this.A06.setListener(new com.facebook.ads.redexgen.core.C0801Jk(this));
        this.A03.addView(this.A06, layoutParams);
        com.facebook.ads.redexgen.core.YB.A0J(this.A07);
        this.A07 = new com.facebook.ads.redexgen.core.C1265ah(this.A0b.A06(), null, android.R.attr.progressBarStyleHorizontal);
        this.A03.addView(this.A07, new android.widget.LinearLayout.LayoutParams(-1, A0g));
    }
}
