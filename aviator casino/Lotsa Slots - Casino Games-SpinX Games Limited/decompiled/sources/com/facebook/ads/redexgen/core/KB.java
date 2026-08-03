package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class KB extends com.facebook.ads.redexgen.core.AbstractC1349c3 {
    public static byte[] A0W;
    public static java.lang.String[] A0X = {"UQ7TFs74lcUdZuEisIQQex1S2hJkyBQJ", "myvpLMPCiy1Db21mRiA", "GFipZK8NVLufipAPgP", "AfraUSEhnPTRS4j1c1sVruXnc5XHPJ9d", "a5o2PCnXzYQrRDOC9DPzRLQmHH", "zC9Q5dVrf3DuizGN", "cBKGhAcqgckkizLMVTE8MrLSp3snJrYL", "vsEAc6f0BLlcSapFKHSSbJlGpIzpiVSU"};
    public static final int A0Y;
    public int A00;
    public int A01;
    public android.widget.ImageView A02;
    public android.widget.ImageView A03;
    public android.widget.LinearLayout A04;
    public com.facebook.ads.redexgen.core.C0926Og A05;
    public com.facebook.ads.redexgen.core.C1241aJ A06;
    public com.facebook.ads.redexgen.core.C1245aN A07;
    public com.facebook.ads.redexgen.core.InterfaceC1466dx A08;
    public com.facebook.ads.redexgen.core.C0683Eu A09;
    public com.facebook.ads.redexgen.core.C4L A0A;
    public final android.os.Handler A0B;
    public final android.widget.ImageView A0C;
    public final android.widget.RelativeLayout A0D;
    public final android.widget.RelativeLayout A0E;
    public final android.widget.RelativeLayout A0F;
    public final android.widget.RelativeLayout A0G;
    public final android.widget.RelativeLayout A0H;
    public final android.widget.TextView A0I;
    public final android.widget.TextView A0J;
    public final android.widget.TextView A0K;
    public final android.widget.TextView A0L;
    public final android.widget.TextView A0M;
    public final com.facebook.ads.redexgen.core.C1636gi A0N;
    public final com.facebook.ads.redexgen.core.VI A0O;
    public final com.facebook.ads.redexgen.core.C1330bk A0P;
    public final com.facebook.ads.redexgen.core.C1332bm A0Q;
    public final com.facebook.ads.redexgen.core.C1353c7 A0R;
    public final com.facebook.ads.redexgen.core.C0673Ek A0S;
    public final com.facebook.ads.redexgen.core.EA A0T;
    public final com.facebook.ads.redexgen.core.E2 A0U;
    public final java.lang.Runnable A0V;

    public static java.lang.String A0J(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0W, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_PARENTAL_CONTROL_RESTRICTED);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0R() {
        A0W = new byte[]{-24, com.google.common.base.Ascii.SUB, 41, 60, 49, 54, 47, -77, -68, -65, -12};
    }

    static {
        A0R();
        A0Y = (int) (com.facebook.ads.redexgen.core.XX.A02 * 16.0f);
    }

    public KB(com.facebook.ads.redexgen.core.C1353c7 c1353c7) {
        super(c1353c7, false);
        this.A0B = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A0U = new com.facebook.ads.redexgen.core.E2() { // from class: com.facebook.ads.redexgen.X.6E
            public static java.lang.String[] A01 = {"1XAudPm5bNoLpQjIPSZWPFOeb", "KPQovwGp6PfJEyzo2xgnSN1gmGV3wBfO", "MSOuoVglH1pxZtUt86IkEaCPI", "Ahn71CuWf", "XCR0a8v2bJ8TOqmTegoErV6kR", "kQ55lQ8tRAtObxY9GvDk6DQ4l", "65Z7gaQiVm7Q6XjyGmw2uvR6b", "4ArQv5JqOif9H4kcX07xj56lI8DuBc1Y"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E3 e3) {
                com.facebook.ads.redexgen.core.InterfaceC1466dx interfaceC1466dx;
                com.facebook.ads.redexgen.core.InterfaceC1466dx interfaceC1466dx2;
                interfaceC1466dx = com.facebook.ads.redexgen.core.KB.this.A08;
                if (interfaceC1466dx != null) {
                    com.facebook.ads.redexgen.core.KB kb = com.facebook.ads.redexgen.core.KB.this;
                    if (A01[3].length() != 9) {
                        throw new java.lang.RuntimeException();
                    }
                    A01[3] = "L2P2qOlVB";
                    interfaceC1466dx2 = kb.A08;
                    interfaceC1466dx2.AKE();
                }
            }
        };
        this.A0T = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.6D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
                com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
                c0673Ek = com.facebook.ads.redexgen.core.KB.this.A0S;
                c0673Ek.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A02, 20);
            }
        };
        this.A0V = new com.facebook.ads.redexgen.core.RunnableC1379cX(this);
        this.A0N = c1353c7.A06();
        this.A0R = c1353c7;
        this.A0O = new com.facebook.ads.redexgen.core.VI(this.A0R.A05().A2E(), getAdEventManager());
        this.A0O.A04(com.facebook.ads.redexgen.core.VH.A0f, null);
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A00 = displayMetrics.heightPixels;
        this.A01 = displayMetrics.widthPixels;
        this.A0S = A0G();
        com.facebook.ads.redexgen.core.YB.A0K(this.A0S);
        this.A0S.setVideoURI(this.A0R.A05().A29().A0H().A09());
        this.A0S.A0e(com.facebook.ads.redexgen.core.EnumC1523et.A02, 20);
        this.A0S.getEventBus().A03(this.A0U, this.A0T);
        this.A0G = A06();
        com.facebook.ads.redexgen.core.YB.A0K(this.A0G);
        A0L();
        A0M();
        this.A0P = A0D();
        com.facebook.ads.redexgen.core.YB.A0K(this.A0P);
        this.A0L = A0B();
        com.facebook.ads.redexgen.core.YB.A0K(this.A0L);
        this.A0Q = A0E();
        com.facebook.ads.redexgen.core.YB.A0K(this.A0Q);
        this.A0J = A09();
        com.facebook.ads.redexgen.core.YB.A0K(this.A0J);
        this.A0C = A01();
        com.facebook.ads.redexgen.core.YB.A0K(this.A0C);
        this.A0I = A08();
        com.facebook.ads.redexgen.core.YB.A0K(this.A0I);
        this.A0E = A05();
        com.facebook.ads.redexgen.core.YB.A0K(this.A0E);
        this.A0D = A04();
        com.facebook.ads.redexgen.core.YB.A0K(this.A0D);
        this.A0K = A0A();
        com.facebook.ads.redexgen.core.YB.A0K(this.A0K);
        this.A0M = A0C();
        com.facebook.ads.redexgen.core.YB.A0K(this.A0M);
        this.A0H = A07(getWatchAdCtaText(), 654311423);
        com.facebook.ads.redexgen.core.YB.A0K(this.A0H);
        this.A0F = A07(this.A0R.A05().A1A(), -16226561);
        com.facebook.ads.redexgen.core.YB.A0K(this.A0F);
        com.facebook.ads.redexgen.core.AbstractC1337br.A00(this.A0R.A06(), this, this.A0R.A05().A29().A0H().A08());
        int i = getResources().getConfiguration().orientation;
        A0h(i);
        addView(this.A0S);
        A0S(i);
        A0K();
    }

    private android.widget.ImageView A01() {
        android.widget.ImageView imageView = new android.widget.ImageView(this.A0N);
        imageView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.DOWNLOAD_ICON));
        return imageView;
    }

    private android.widget.LinearLayout A03() {
        this.A02 = new android.widget.ImageView(this.A0N);
        this.A03 = new android.widget.ImageView(this.A0N);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A0N);
        this.A02.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        this.A02.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.AD_CHOICE_V2_COLLAPSE));
        linearLayout.addView(this.A02);
        this.A03.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        this.A03.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.AD_CHOICE_V2_EXPAND));
        linearLayout.addView(this.A03);
        android.widget.RelativeLayout.LayoutParams adReportingLayoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        adReportingLayoutParams.addRule(12);
        adReportingLayoutParams.addRule(11);
        linearLayout.setLayoutParams(adReportingLayoutParams);
        return linearLayout;
    }

    private android.widget.RelativeLayout A04() {
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.A0N);
        relativeLayout.addView(this.A0L);
        if (this.A0R.A05().A1p()) {
            relativeLayout.addView(this.A0Q);
            relativeLayout.addView(this.A0J);
        } else {
            android.widget.RelativeLayout relativeLayout2 = this.A0E;
            java.lang.String[] strArr = A0X;
            if (strArr[2].length() == strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0X;
            strArr2[2] = "DGMgcqNKmRBhEzUZj1";
            strArr2[4] = "QbI2wW46F5loixSEU5hnRqKbb5";
            relativeLayout.addView(relativeLayout2);
        }
        return relativeLayout;
    }

    private android.widget.RelativeLayout A05() {
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.A0N.A02());
        relativeLayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
        relativeLayout.addView(this.A0C);
        relativeLayout.addView(this.A0I);
        return relativeLayout;
    }

    private android.widget.RelativeLayout A06() {
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.A0N.A02());
        relativeLayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -1));
        return relativeLayout;
    }

    private android.widget.RelativeLayout A07(java.lang.String str, int i) {
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this.A0N);
        relativeLayout.setPadding(com.facebook.ads.redexgen.core.XV.A0b, com.facebook.ads.redexgen.core.XV.A0b, com.facebook.ads.redexgen.core.XV.A0b, com.facebook.ads.redexgen.core.XV.A0b);
        com.facebook.ads.redexgen.core.YB.A0V(relativeLayout, com.facebook.ads.redexgen.core.YB.A06(i, 30));
        relativeLayout.setGravity(16);
        android.widget.TextView textView = new android.widget.TextView(this.A0N);
        android.widget.RelativeLayout.LayoutParams contentTextViewParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        contentTextViewParams.addRule(14);
        textView.setText(str);
        textView.setTextColor(-1);
        com.facebook.ads.redexgen.core.YB.A0a(textView, true, 14);
        textView.setLayoutParams(contentTextViewParams);
        relativeLayout.addView(textView);
        return relativeLayout;
    }

    private android.widget.TextView A08() {
        android.widget.TextView textView = new android.widget.TextView(this.A0N);
        textView.setText(this.A0R.A05().A29().A0I().A01());
        textView.setTextColor(-2130706433);
        textView.setMaxLines(1);
        textView.setTypeface(android.graphics.Typeface.DEFAULT);
        textView.setTextSize(12.0f);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        return textView;
    }

    private android.widget.TextView A09() {
        android.widget.TextView textView = new android.widget.TextView(this.A0N);
        textView.setText(getRatingText());
        textView.setTextColor(-2130706433);
        textView.setMaxLines(1);
        textView.setTypeface(android.graphics.Typeface.DEFAULT);
        textView.setTextSize(12.0f);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setTextAlignment(4);
        return textView;
    }

    private android.widget.TextView A0A() {
        android.widget.TextView textView = new android.widget.TextView(this.A0N);
        textView.setText(java.lang.String.format(java.util.Locale.US, this.A0R.A05().A1B(), this.A0R.A05().A29().A0I().A0G()));
        textView.setTextColor(-1);
        textView.setMaxLines(3);
        textView.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        textView.setTextSize(24.0f);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setTextAlignment(4);
        return textView;
    }

    private android.widget.TextView A0B() {
        android.widget.TextView textView = new android.widget.TextView(this.A0N);
        textView.setText(this.A0R.A05().A29().A0I().A0G());
        textView.setTextColor(-1);
        textView.setMaxLines(2);
        textView.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        textView.setTextSize(18.0f);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        return textView;
    }

    private android.widget.TextView A0C() {
        android.widget.TextView textView = new android.widget.TextView(this.A0N);
        textView.setText(getWatchAdCtaText());
        textView.setTextColor(-1);
        textView.setMaxLines(1);
        textView.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        textView.setTextSize(14.0f);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setTextAlignment(4);
        return textView;
    }

    private com.facebook.ads.redexgen.core.C1330bk A0D() {
        com.facebook.ads.redexgen.core.C1330bk c1330bk = new com.facebook.ads.redexgen.core.C1330bk(this.A0N);
        com.facebook.ads.redexgen.core.YB.A0N(c1330bk, 0);
        int i = (int) (this.A00 * 0.13f);
        new com.facebook.ads.redexgen.core.LM(c1330bk, this.A0N).A05(i, i).A07(this.A0R.A05().A2C().A01());
        return c1330bk;
    }

    private com.facebook.ads.redexgen.core.C1332bm A0E() {
        com.facebook.ads.redexgen.core.C1332bm c1332bm = new com.facebook.ads.redexgen.core.C1332bm(this.A0N, A0Y, 5, 0, -1);
        c1332bm.setRating(getRating());
        return c1332bm;
    }

    private com.facebook.ads.redexgen.core.C0673Ek A0G() {
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek = new com.facebook.ads.redexgen.core.C0673Ek(this.A0R.A06());
        this.A0A = new com.facebook.ads.redexgen.core.C4L(this.A0N, getAdEventManager(), c0673Ek, this.A0R.A05().A2E(), 0, 0, true, null, null);
        if (com.facebook.ads.redexgen.core.C1086Up.A20(this.A0N)) {
            this.A09 = new com.facebook.ads.redexgen.core.C0683Eu(this.A0N, getAdEventManager(), c0673Ek, this.A0R.A05().A2E(), false, this.A0A, null);
        } else {
            java.lang.String[] strArr = A0X;
            if (strArr[2].length() == strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0X;
            strArr2[2] = "hx8qxgvoIW6xceGAWf";
            strArr2[4] = "wYZsMrXjcXuhFUuKsEl8E0dQOo";
            this.A09 = null;
        }
        c0673Ek.setRoundedCornerVideoView(44.0f);
        return c0673Ek;
    }

    private void A0K() {
        this.A0F.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1381cZ(this));
        if (this.A0R.A05().A1p()) {
            this.A0M.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1382ca(this));
        } else {
            this.A0H.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1383cb(this));
        }
    }

    private void A0L() {
        if (this.A0R.A05().A2M()) {
            this.A06 = A00(this.A0N, this.A0R.A05(), this.A0O, com.facebook.ads.redexgen.core.EnumC1244aM.A06, this.A0R.A0C());
            com.facebook.ads.redexgen.core.YB.A0K(this.A06);
        } else {
            if (!this.A0R.A05().A1p()) {
                return;
            }
            this.A05 = com.facebook.ads.redexgen.core.AbstractC0927Oh.A00(this.A0N.A02());
            this.A04 = A03();
            com.facebook.ads.redexgen.core.YB.A0K(this.A04);
            A0O();
        }
    }

    private void A0M() {
        if (this.A0R.A05().A2W()) {
            this.A07 = A01(this.A0N, com.facebook.ads.redexgen.core.EnumC1244aM.A06);
            com.facebook.ads.redexgen.core.YB.A0K(this.A07);
        }
    }

    private void A0N() {
        if (this.A0R.A05().A1p() && getRating() == 0.0f) {
            this.A0D.setVisibility(8);
            this.A0J.setVisibility(8);
            this.A0Q.setVisibility(8);
        }
        if (this.A0R.A05().A1q() && android.text.TextUtils.isEmpty(this.A0R.A05().A29().A0I().A01())) {
            this.A0D.setVisibility(8);
            this.A0E.setVisibility(8);
        }
        this.A0D.setVisibility(0);
    }

    private void A0O() {
        if (this.A04 != null) {
            this.A04.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1380cY(this));
        }
        A0T(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P() {
        this.A0O.A04(com.facebook.ads.redexgen.core.VH.A0A, null);
        com.facebook.ads.redexgen.core.C0906Nm A2C = this.A0R.A05().A2C();
        if (this.A05 != null && this.A05.A0O(this.A0N.A02(), true)) {
            this.A0R.A0C().AAo(this.A0R.A05().A2E(), A2C);
        } else {
            if (android.text.TextUtils.isEmpty(A2C.A00())) {
                return;
            }
            com.facebook.ads.redexgen.core.X6.A0O(new com.facebook.ads.redexgen.core.X6(), this.A0N, com.facebook.ads.redexgen.core.XB.A00(A2C.A00()), this.A0R.A05().A2E());
        }
    }

    private void A0Q() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(1, this.A0C.getId());
        layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0d, 0, 0, 0);
        layoutParams.addRule(15);
        this.A0I.setLayoutParams(layoutParams);
    }

    private void A0S(int i) {
        if (i == 1) {
            addView(this.A0P);
            addView(this.A0D);
            addView(this.A0K);
            addView(this.A0F);
            if (this.A0R.A05().A1p()) {
                addView(this.A0M);
                if (this.A04 != null) {
                    addView(this.A04);
                }
            } else {
                addView(this.A0H);
            }
        } else {
            this.A0G.addView(this.A0P);
            this.A0G.addView(this.A0D);
            this.A0G.addView(this.A0K);
            this.A0G.addView(this.A0F);
            if (this.A0R.A05().A1p()) {
                this.A0G.addView(this.A0M);
                if (this.A04 != null) {
                    addView(this.A04);
                }
            } else {
                this.A0G.addView(this.A0H);
            }
            addView(this.A0G);
        }
        if (this.A06 != null && this.A0R.A05().A2M()) {
            addView(this.A06);
            java.lang.String[] strArr = A0X;
            if (strArr[6].charAt(9) != strArr[0].charAt(9)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0X;
            strArr2[6] = "keLlcznYvctfEvjur1LzpEy2BPaBqrBv";
            strArr2[0] = "SZjrRhAKecjSc6vp3MPbWHckPYKJoG5j";
            if (this.A04 != null) {
                this.A04.setVisibility(8);
            }
        }
        if (this.A07 != null && this.A0R.A05().A2W()) {
            addView(this.A07);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0T(int i) {
        if (this.A03 == null || this.A02 == null) {
            return;
        }
        if (i == 0) {
            this.A03.setVisibility(i);
            this.A02.setVisibility(8);
        } else {
            this.A03.setVisibility(i);
            this.A02.setVisibility(0);
        }
    }

    private void A0U(int i) {
        int rightMargin;
        if (this.A04 == null) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.A04.getLayoutParams();
        if (i == 1) {
            rightMargin = com.facebook.ads.redexgen.core.XV.A0n;
        } else {
            rightMargin = (int) (this.A01 * 0.1f);
        }
        layoutParams.setMargins(0, 0, rightMargin, 0);
        this.A04.setLayoutParams(layoutParams);
    }

    private void A0V(int i) {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        if (i == 1) {
            if (this.A0R.A05().A1p()) {
                layoutParams.addRule(3, this.A0P.getId());
            } else {
                layoutParams.addRule(3, this.A0S.getId());
            }
            layoutParams.setMargins(0, com.facebook.ads.redexgen.core.XV.A0b, 0, 0);
            layoutParams.addRule(14);
        } else {
            layoutParams.addRule(1, this.A0P.getId());
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0b, 0, 0, 0);
        }
        this.A0D.setLayoutParams(layoutParams);
        A0N();
    }

    private void A0W(int i) {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, this.A0L.getId());
        layoutParams.setMargins(0, com.facebook.ads.redexgen.core.XV.A0o, 0, 0);
        if (i == 1) {
            layoutParams.addRule(14);
        }
        this.A0E.setLayoutParams(layoutParams);
    }

    private void A0X(int i) {
        if (this.A07 == null) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        int i2 = com.facebook.ads.redexgen.core.XV.A0b;
        if (i == 1) {
            i2 = com.facebook.ads.redexgen.core.XV.A0n;
        }
        int leftMargin = com.facebook.ads.redexgen.core.XV.A0b;
        layoutParams.setMargins(i2, 0, 0, leftMargin);
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        this.A07.setLayoutParams(layoutParams);
    }

    private void A0Y(int i) {
        if (this.A06 == null) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        int i2 = com.facebook.ads.redexgen.core.XV.A0b;
        if (i == 1) {
            i2 = com.facebook.ads.redexgen.core.XV.A0n;
        }
        if (this.A0R.A05().A2U()) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            layoutParams.setMargins(i2, com.facebook.ads.redexgen.core.XV.A0r, 0, 0);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
            layoutParams.setMargins(i2, 0, 0, com.facebook.ads.redexgen.core.XV.A0b);
        }
        this.A06.setLayoutParams(layoutParams);
    }

    private void A0Z(int i) {
        int i2;
        if (i == 1) {
            i2 = (int) (this.A00 * 0.13f);
            if (this.A0R.A05().A1q()) {
                com.facebook.ads.redexgen.core.C1330bk c1330bk = this.A0P;
                java.lang.String[] strArr = A0X;
                if (strArr[5].length() == strArr[1].length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0X;
                strArr2[6] = "T7WF8ct6Ecp3fFl6k8FlzT3xp8EZwOPe";
                strArr2[0] = "49nlYj8CnceEqKl67yYD9azFmPqqLBPu";
                c1330bk.setVisibility(8);
            } else {
                this.A0P.setRadius(30);
            }
        } else {
            i2 = (int) (this.A01 * 0.08f);
            this.A0P.setRadius(18);
            this.A0P.setVisibility(0);
        }
        int i3 = 0;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i2, i2);
        if (i == 1) {
            i3 = (-i2) / 2;
            layoutParams.addRule(14);
            layoutParams.addRule(3, this.A0S.getId());
        }
        layoutParams.setMargins(0, i3, 0, 0);
        this.A0P.setLayoutParams(layoutParams);
    }

    private void A0a(int i) {
        int topMargin;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, this.A0L.getId());
        if (i == 1) {
            topMargin = com.facebook.ads.redexgen.core.XV.A0v;
            layoutParams.addRule(14);
        } else {
            topMargin = com.facebook.ads.redexgen.core.XV.A0o;
        }
        layoutParams.setMargins(0, topMargin, 0, 0);
        this.A0Q.setLayoutParams(layoutParams);
        this.A0Q.setItemSpacing(com.facebook.ads.redexgen.core.XV.A0v);
    }

    private void A0b(int i) {
        int i2;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, this.A0Q.getId());
        if (i == 1) {
            i2 = com.facebook.ads.redexgen.core.XV.A0v;
        } else {
            i2 = com.facebook.ads.redexgen.core.XV.A0o;
        }
        layoutParams.setMargins(0, i2, 0, 0);
        if (i == 1) {
            layoutParams.addRule(14);
        }
        this.A0J.setLayoutParams(layoutParams);
    }

    private void A0c(int i) {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        if (i == 1) {
            layoutParams.addRule(3, this.A0D.getId());
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0q, com.facebook.ads.redexgen.core.XV.A0b, com.facebook.ads.redexgen.core.XV.A0q, 0);
        } else {
            layoutParams.addRule(3, this.A0P.getId());
            layoutParams.setMargins(0, com.facebook.ads.redexgen.core.XV.A0e, 0, 0);
        }
        this.A0K.setLayoutParams(layoutParams);
    }

    private void A0d(int i) {
        if (i == 2) {
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -1);
            layoutParams.addRule(15);
            if (!com.facebook.ads.redexgen.core.XL.A05((float) this.A0R.A05().A0k())) {
                layoutParams.addRule(6, this.A0S.getId());
            } else {
                this.A0G.setGravity(17);
            }
            layoutParams.setMargins(0, 0, (int) (this.A01 * 0.1f), 0);
            layoutParams.addRule(13);
            layoutParams.addRule(1, this.A0S.getId());
            this.A0G.setLayoutParams(layoutParams);
        }
    }

    private void A0e(int i) {
        android.view.View view;
        int i2;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        if (i == 1) {
            if (this.A0R.A05().A1p()) {
                view = this.A0M;
                i2 = com.facebook.ads.redexgen.core.XV.A0e;
            } else {
                view = this.A0H;
                i2 = com.facebook.ads.redexgen.core.XV.A0v;
            }
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0n, 0, com.facebook.ads.redexgen.core.XV.A0n, i2);
            layoutParams.addRule(2, view.getId());
        } else {
            int topMargin = com.facebook.ads.redexgen.core.XV.A0k;
            if (this.A0R.A05().A2M()) {
                topMargin = com.facebook.ads.redexgen.core.XV.A0f;
            }
            layoutParams.setMargins(0, topMargin, 0, 0);
            int topMargin2 = this.A0K.getId();
            layoutParams.addRule(3, topMargin2);
        }
        this.A0F.setLayoutParams(layoutParams);
    }

    private void A0f(int i) {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        if (i == 1) {
            this.A0L.setTextAlignment(4);
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0p, 0, com.facebook.ads.redexgen.core.XV.A0p, 0);
        } else {
            this.A0L.setTextAlignment(5);
        }
        this.A0L.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0g(int i) {
        int i2;
        android.widget.RelativeLayout.LayoutParams layoutParams;
        int rightMargin;
        double A0k = this.A0R.A05().A0k();
        int i3 = 0;
        int topMargin = 0;
        int i4 = 0;
        if (i == 1) {
            if (com.facebook.ads.redexgen.core.XL.A05((float) A0k)) {
                rightMargin = (int) (this.A00 * 0.2f);
                java.lang.String[] strArr = A0X;
                if (strArr[6].charAt(9) == strArr[0].charAt(9)) {
                    java.lang.String[] strArr2 = A0X;
                    strArr2[2] = "r4F6E4irn5aDyLCCoL";
                    strArr2[4] = "HLlNT1vJDSE83AAt2A8wGZErAg";
                    i4 = rightMargin;
                }
                throw new java.lang.RuntimeException();
            }
            if (com.facebook.ads.redexgen.core.XL.A04((float) A0k)) {
                i4 = (int) (this.A00 * 0.1f);
                rightMargin = (int) (this.A00 * 0.3f);
            } else {
                i4 = (int) (this.A00 * 0.1f);
                float f = this.A00;
                java.lang.String[] strArr3 = A0X;
                if (strArr3[6].charAt(9) != strArr3[0].charAt(9)) {
                    java.lang.String[] strArr4 = A0X;
                    strArr4[7] = "VrmCvLPumx9qmsQ5AqX8D26sv2xEwmDs";
                    strArr4[3] = "M5pl3CqSLX5dAxkk9LSq9NmEjnkhG5Xr";
                    rightMargin = (int) (f * 0.4f);
                } else {
                    java.lang.String[] strArr5 = A0X;
                    strArr5[5] = "itXi3sFkhsJNNNlf";
                    strArr5[1] = "UwAjH2H8fcKmgRPVcHr";
                    rightMargin = (int) (f * 0.4f);
                }
            }
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, rightMargin);
            layoutParams.setMargins(i3, i4, topMargin, 0);
            if (i != 2) {
                layoutParams.addRule(15);
            } else {
                layoutParams.addRule(14);
            }
            this.A0S.setLayoutParams(layoutParams);
        }
        if (com.facebook.ads.redexgen.core.XL.A03((float) A0k)) {
            i3 = (int) (this.A01 * 0.2f);
            topMargin = (int) (this.A01 * 0.1f);
            i2 = (int) (this.A01 * 0.15f);
        } else {
            boolean A05 = com.facebook.ads.redexgen.core.XL.A05((float) A0k);
            java.lang.String[] strArr6 = A0X;
            if (strArr6[7].charAt(31) != strArr6[3].charAt(31)) {
                java.lang.String[] strArr7 = A0X;
                strArr7[7] = "ZplkNnpiZffIY1LttQt1XVs2T7MKHARy";
                strArr7[3] = "uFxfhHDbtwTjfaa8IDnniTCsCIFPOnZP";
                if (A05) {
                    topMargin = (int) (this.A01 * 0.1f);
                    i3 = topMargin;
                    i2 = (int) (this.A01 * 0.32f);
                } else if (com.facebook.ads.redexgen.core.XL.A04((float) A0k)) {
                    i3 = (int) (this.A01 * 0.15f);
                    topMargin = (int) (this.A01 * 0.1f);
                    i2 = (int) (this.A01 * 0.27f);
                } else {
                    i3 = (int) (this.A01 * 0.15f);
                    topMargin = (int) (this.A01 * 0.1f);
                    i2 = (int) (this.A01 * 0.215f);
                }
            }
            throw new java.lang.RuntimeException();
        }
        layoutParams = new android.widget.RelativeLayout.LayoutParams(i2, -2);
        layoutParams.setMargins(i3, i4, topMargin, 0);
        if (i != 2) {
        }
        this.A0S.setLayoutParams(layoutParams);
    }

    private void A0h(int i) {
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A00 = displayMetrics.heightPixels;
        this.A01 = displayMetrics.widthPixels;
        A0d(i);
        A0g(i);
        A0Z(i);
        A0f(i);
        A0b(i);
        A0Q();
        A0W(i);
        A0a(i);
        A0V(i);
        A0c(i);
        if (this.A0R.A05().A1p()) {
            A0j(i);
            java.lang.String[] strArr = A0X;
            if (strArr[5].length() == strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0X;
            strArr2[7] = "aYm4mmhUzY2q09M7FsCiyOSpkxFbKaZW";
            strArr2[3] = "02gWjTBSQrtOfJ7daRHeBoWCiPeJp89r";
            A0U(i);
        } else {
            A0i(i);
        }
        A0Y(i);
        java.lang.String[] strArr3 = A0X;
        if (strArr3[5].length() != strArr3[1].length()) {
            java.lang.String[] strArr4 = A0X;
            strArr4[2] = "tL7wIN5OEPzS4IRzlt";
            strArr4[4] = "pnOaA9DlQTYkC3KVcwnBrIvrHl";
            A0X(i);
            A0e(i);
            return;
        }
        java.lang.String[] strArr5 = A0X;
        strArr5[6] = "MDf5St22kcgabUjosByBKwB24Lkknw12";
        strArr5[0] = "UByTvfFM4cGo3K13JgxsnaHo1RTqGnlv";
        A0X(i);
        A0e(i);
    }

    private void A0i(int i) {
        int i2;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        if (i == 1) {
            if (this.A0R.A05().A2M() && this.A06 != null) {
                if (this.A0R.A05().A2W() && this.A07 != null) {
                    layoutParams.addRule(2, this.A07.getId());
                    i2 = com.facebook.ads.redexgen.core.XV.A0b;
                } else if (this.A0R.A05().A2U()) {
                    layoutParams.addRule(12);
                    i2 = com.facebook.ads.redexgen.core.XV.A0k;
                } else {
                    layoutParams.addRule(2, this.A06.getId());
                    i2 = com.facebook.ads.redexgen.core.XV.A0b;
                }
            } else {
                layoutParams.addRule(12);
                i2 = com.facebook.ads.redexgen.core.XV.A0q;
            }
            int bottomMargin = com.facebook.ads.redexgen.core.XV.A0n;
            layoutParams.setMargins(bottomMargin, 0, com.facebook.ads.redexgen.core.XV.A0n, i2);
        } else {
            layoutParams.addRule(3, this.A0F.getId());
            layoutParams.setMargins(0, com.facebook.ads.redexgen.core.XV.A0v, 0, 0);
        }
        android.widget.RelativeLayout relativeLayout = this.A0H;
        java.lang.String[] strArr = A0X;
        if (strArr[2].length() == strArr[4].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0X;
        strArr2[2] = "xJXeUykDDwk7QxqpMI";
        strArr2[4] = "KNHMaHGzFmfIejDiEBJDCMbgtc";
        relativeLayout.setLayoutParams(layoutParams);
    }

    private void A0j(int i) {
        int i2;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        if (i == 1) {
            if (this.A0R.A05().A2M() && this.A06 != null) {
                if (this.A0R.A05().A2W() && this.A07 != null) {
                    layoutParams.addRule(2, this.A07.getId());
                    i2 = com.facebook.ads.redexgen.core.XV.A0b;
                } else if (this.A0R.A05().A2U()) {
                    layoutParams.addRule(12);
                    i2 = com.facebook.ads.redexgen.core.XV.A0m;
                } else {
                    layoutParams.addRule(2, this.A06.getId());
                    i2 = com.facebook.ads.redexgen.core.XV.A0b;
                }
            } else {
                layoutParams.addRule(12);
                i2 = com.facebook.ads.redexgen.core.XV.A0q;
            }
            layoutParams.setMargins(0, 0, 0, i2);
            layoutParams.addRule(14);
        } else {
            layoutParams.setMargins(0, com.facebook.ads.redexgen.core.XV.A0b, 0, 0);
            layoutParams.addRule(3, this.A0F.getId());
            layoutParams.addRule(14);
        }
        this.A0M.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final com.facebook.ads.redexgen.core.EnumC0885Mq A1B(java.lang.String str) {
        return com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1C() {
        super.A1C();
        if (this.A09 != null) {
            this.A09.A07();
        }
        com.facebook.ads.redexgen.core.C4L c4l = this.A0A;
        java.lang.String[] strArr = A0X;
        if (strArr[2].length() == strArr[4].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0X;
        strArr2[6] = "tdEFFGfq1cVEZpxqy9rgZPT1BZ8plSyJ";
        strArr2[0] = "YynlqIxuvciXAw4AWnNfF7pWFOOJrehC";
        if (c4l != null) {
            this.A0A.A0p();
        }
        this.A0B.removeCallbacksAndMessages(null);
        this.A0S.getEventBus().A04(this.A0U, this.A0T);
        this.A08 = null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A1O() {
        return true;
    }

    public final void A1Q(com.facebook.ads.redexgen.core.C4L c4l) {
        if (this.A0A != null) {
            this.A0A.A0o(c4l);
        }
    }

    private float getRating() {
        try {
            float rating = java.lang.Float.parseFloat(this.A0R.A05().A29().A0I().A0C());
            return rating;
        } catch (java.lang.NumberFormatException unused) {
            return 0.0f;
        }
    }

    private java.lang.String getRatingText() {
        java.lang.StringBuilder append = new java.lang.StringBuilder().append(java.lang.String.format(java.util.Locale.US, A0J(7, 4, 37), java.lang.Float.valueOf(getRating())));
        java.lang.String ratingText = A0J(0, 7, 95);
        return append.append(ratingText).toString();
    }

    private java.lang.String getWatchAdCtaText() {
        return java.lang.String.format(java.util.Locale.US, this.A0R.A05().A1C(), java.lang.Integer.valueOf(this.A0R.A05().A29().A0H().A03()));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.facebook.ads.redexgen.core.YB.A0d(this.A0P, this.A0D, this.A0K, this.A0F, this.A0H, this.A0M, this.A04, this.A06, this.A07, this.A0G);
        A0h(configuration.orientation);
        A0S(configuration.orientation);
    }

    public void setVideoAdViewListener(com.facebook.ads.redexgen.core.InterfaceC1466dx interfaceC1466dx) {
        this.A08 = interfaceC1466dx;
    }
}
