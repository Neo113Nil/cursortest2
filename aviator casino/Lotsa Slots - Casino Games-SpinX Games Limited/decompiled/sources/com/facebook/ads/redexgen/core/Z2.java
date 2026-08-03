package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class Z2 extends android.widget.FrameLayout {
    public static byte[] A0D;
    public static java.lang.String[] A0E = {"EYRP1PEEhxzmFZofVXiCCrEXWQs6qPAa", "IPRTBS", "NsAYUXCCkxBbK0XyUhCt1xHChz5fZfMK", "fEJJ0", "6651Qynk9CVpAvzNTMvYSQKVDYa6iazW", "nD7S5n7VHEDKGeK1PzI1a27Vk58dSaaa", "vFV0GS7SjmRPmH7mLZ5yrXn6gSrRknN8", "LPfldR2r"};
    public static final int A0F;
    public boolean A00;
    public final com.facebook.ads.redexgen.core.C1806ji A01;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A02;
    public final com.facebook.ads.redexgen.core.C1636gi A03;
    public final com.facebook.ads.redexgen.core.VA A04;
    public final com.facebook.ads.redexgen.core.VI A05;
    public final com.facebook.ads.redexgen.core.Y2 A06;
    public final com.facebook.ads.redexgen.core.C0942Ow A07;
    public final com.facebook.ads.redexgen.core.AbstractC0936Oq A08;
    public final com.facebook.ads.redexgen.core.AbstractC1580fo A09;
    public final com.facebook.ads.redexgen.core.C1581fp A0A;
    public final java.lang.String A0B;
    public final java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.Z1> A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public Z2(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.Z1> weakReference, int i, int i2, int i3, int i4, com.facebook.ads.redexgen.core.C1806ji c1806ji, java.lang.String str) {
        super(c1636gi);
        this.A06 = new com.facebook.ads.redexgen.core.Y2();
        this.A03 = c1636gi;
        this.A04 = va;
        this.A01 = c1806ji;
        this.A0C = weakReference;
        this.A0B = str;
        com.facebook.ads.redexgen.core.AbstractC1801jd A0F2 = this.A01.A0F();
        if (A0F2 == null) {
            throw new java.lang.IllegalStateException(A09(0, 32, 86));
        }
        this.A02 = this.A01.A0F();
        com.facebook.ads.redexgen.core.YB.A0N(this, -1);
        this.A05 = new com.facebook.ads.redexgen.core.VI(this.A01.A7O(), this.A04);
        this.A09 = A06();
        this.A0A = A07(i, i4, i2, i3);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(c1636gi);
        linearLayout.setOrientation(1);
        addView(linearLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.A08 = A04(c1042Sx);
        if (this.A08 != null) {
            linearLayout.addView(this.A08, new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        this.A07 = A02(A0F2);
        linearLayout.addView(this.A07, new android.widget.LinearLayout.LayoutParams(-1, -2));
    }

    public static java.lang.String A09(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 99);
            if (A0E[6].charAt(17) == 'I') {
                throw new java.lang.RuntimeException();
            }
            A0E[6] = "HyV3wef6DGt1nbLL1fRSvAmBe6VeBas4";
            copyOfRange[i4] = b;
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0F() {
        A0D = new byte[]{-6, com.google.common.base.Ascii.GS, -39, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SUB, 45, com.google.common.base.Ascii.SUB, -39, com.google.common.base.Ascii.ESC, 46, 39, com.google.common.base.Ascii.GS, 37, com.google.common.base.Ascii.RS, -39, 34, 44, -39, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SUB, 39, 39, 40, 45, -39, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.RS, -39, 39, 46, 37, 37, 52, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 62, -1, 55, 50, 52, 54, 51, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 60, -1, 50, 53, 68, -1, 51, 50, 63, 63, 54, 67, -1, 52, kotlin.io.encoding.Base64.padSymbol, 58, 52, 60, 54, 53};
    }

    static {
        A0F();
        A0F = (int) (com.facebook.ads.redexgen.core.XX.A02 * 40.0f);
    }

    private com.facebook.ads.redexgen.core.C0942Ow A02(com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd) {
        com.facebook.ads.redexgen.core.C0894Na A00;
        com.facebook.ads.redexgen.core.NR A29 = abstractC1801jd.A29();
        com.facebook.ads.redexgen.core.PW pw = new com.facebook.ads.redexgen.core.PW() { // from class: com.facebook.ads.redexgen.X.6f
            public static byte[] A01;
            public static java.lang.String[] A02 = {"69whQSJFXzC5tMS1mvBQof2SK7ErE5ZD", "1jHEgafKgZ1qGtZeFln5jYEaZuoTSi1L", "X7dL0uEA8hI8yFDxVjmpGWGPGaRf3imC", "xkNxR1N5ht6u5HrBYV6Jaj9BRbbqvvjX", "FzWiIV8jsRMCATg74qRy8XJg", "NPgeBhkCK5cdUCtVbQG3V7Bzbyz9qF6p", "wkBgnizDM2wMuU", "fQJYdDBiu8hI0YoMzyDMv7ESaoH1tCRU"};

            public static java.lang.String A00(int i, int i2, int i3) {
                byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
                int i4 = 0;
                while (true) {
                    int length = copyOfRange.length;
                    java.lang.String[] strArr = A02;
                    if (strArr[5].charAt(30) == strArr[3].charAt(30)) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A02;
                    strArr2[5] = "zFlqgUHcpRBmVFunDUsFQIo1zDN3Ly6W";
                    strArr2[3] = "vgtBZdmtnd3XTM9GsG6r3isUaM0HNLHl";
                    if (i4 >= length) {
                        return new java.lang.String(copyOfRange);
                    }
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 4);
                    i4++;
                }
            }

            public static void A01() {
                A01 = new byte[]{-102};
            }

            static {
                A01();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1177Yh
            public final void A4j(java.lang.String str) {
                java.lang.String str2;
                com.facebook.ads.redexgen.core.C1636gi c1636gi;
                java.lang.StringBuilder append = new java.lang.StringBuilder().append(str).append(A00(0, 1, 92));
                str2 = com.facebook.ads.redexgen.core.Z2.this.A0B;
                android.content.Intent intent = new android.content.Intent(append.append(str2).toString());
                c1636gi = com.facebook.ads.redexgen.core.Z2.this.A03;
                com.facebook.ads.redexgen.core.P2.A00(c1636gi).A07(intent);
            }
        };
        if (getOrientation() == 1) {
            A00 = abstractC1801jd.A28().A01();
        } else {
            com.facebook.ads.redexgen.core.NN A28 = abstractC1801jd.A28();
            java.lang.String[] strArr = A0E;
            if (strArr[1].length() == strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            A0E[7] = "bY8FFe1Y";
            A00 = A28.A00();
        }
        com.facebook.ads.redexgen.core.C0942Ow c0942Ow = new com.facebook.ads.redexgen.core.C0942Ow(this.A03, A0F, A00, A29.A0J().A06(), A09(32, 31, 110), this.A04, pw, this.A0A, this.A06, abstractC1801jd.A2A());
        c0942Ow.setInfo(A29.A0I(), A29.A0J(), this.A01.A7O(), abstractC1801jd.A2C().A01(), null, null);
        if (com.facebook.ads.redexgen.core.C1086Up.A1N(this.A03)) {
            c0942Ow.A0k();
        }
        return c0942Ow;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.6q] */
    private com.facebook.ads.redexgen.core.AbstractC0936Oq A04(com.facebook.ads.redexgen.core.C1042Sx c1042Sx) {
        final com.facebook.ads.redexgen.core.ViewOnClickListenerC1195Yz viewOnClickListenerC1195Yz = new com.facebook.ads.redexgen.core.ViewOnClickListenerC1195Yz(this);
        java.lang.String videoUrl = this.A01.A0e();
        if (A0H(c1042Sx, this.A01) && videoUrl != null) {
            com.facebook.ads.redexgen.core.C04806g videoView = new com.facebook.ads.redexgen.core.C04806g(this.A03, this.A04, c1042Sx, this.A05, viewOnClickListenerC1195Yz, this.A02).A0I(this.A01.A7O(), videoUrl, this.A01.A0H() != null ? this.A01.A0H().getUrl() : null, this.A01.A0R(), this.A01.A0Q());
            if (com.facebook.ads.redexgen.core.C1086Up.A1R(this.A03)) {
                setViewAsCTA(videoView);
            }
            return videoView;
        }
        com.facebook.ads.redexgen.core.C1098Vb A0H = this.A01.A0H();
        if (A0H == null) {
            return null;
        }
        final com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A03;
        final com.facebook.ads.redexgen.core.VI vi = this.A05;
        final com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd = this.A02;
        com.facebook.ads.redexgen.core.C04906q A0I = new com.facebook.ads.redexgen.core.AbstractC0936Oq(c1636gi, viewOnClickListenerC1195Yz, vi, abstractC1801jd) { // from class: com.facebook.ads.redexgen.X.6q
            public final com.facebook.ads.redexgen.core.C1289b5 A00;

            {
                super(c1636gi, viewOnClickListenerC1195Yz, vi, abstractC1801jd);
                this.A00 = new com.facebook.ads.redexgen.core.C1289b5(c1636gi);
                addView(this.A00, new android.widget.RelativeLayout.LayoutParams(-1, -1));
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC0936Oq
            public final void A0E() {
                super.A0E();
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC0936Oq
            public final void A0F() {
                super.A0F();
                if (this.A04 != null) {
                    com.facebook.ads.redexgen.core.YB.A0J(this.A04);
                    this.A04.setLayoutParams(com.facebook.ads.redexgen.core.AbstractC0936Oq.A0A(null));
                    addView(this.A04);
                }
            }

            public final com.facebook.ads.redexgen.core.C04906q A0I(java.lang.String str) {
                new com.facebook.ads.redexgen.core.LM(this.A00, this.A08).A05(this.A00.getHeight(), this.A00.getWidth()).A06(new com.facebook.ads.redexgen.core.C0937Or(this)).A07(str);
                A0F();
                return this;
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC0936Oq
            public int getMediaViewId() {
                return this.A00.getId();
            }
        }.A0I(A0H.getUrl());
        if (com.facebook.ads.redexgen.core.C1086Up.A1P(this.A03)) {
            setViewAsCTA(A0I);
        }
        return A0I;
    }

    private com.facebook.ads.redexgen.core.C0921Ob A06() {
        return new com.facebook.ads.redexgen.core.C0921Ob(this);
    }

    private com.facebook.ads.redexgen.core.C1581fp A07(int i, int i2, int i3, int i4) {
        com.facebook.ads.redexgen.core.C1581fp c1581fp = new com.facebook.ads.redexgen.core.C1581fp(this, i, i2, true, new java.lang.ref.WeakReference(this.A09), this.A03);
        c1581fp.A0W(i3);
        c1581fp.A0X(i4);
        return c1581fp;
    }

    private void A0C() {
        java.lang.String A0M = this.A01.A0M();
        if (!android.text.TextUtils.isEmpty(A0M)) {
            com.facebook.ads.redexgen.core.X6 x6 = new com.facebook.ads.redexgen.core.X6();
            com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A03;
            android.net.Uri A00 = com.facebook.ads.redexgen.core.XB.A00(A0M);
            java.lang.String adChoicesLinkUrl = this.A01.A7O();
            com.facebook.ads.redexgen.core.X6.A0O(x6, c1636gi, A00, adChoicesLinkUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A05.A04(com.facebook.ads.redexgen.core.VH.A0A, null);
        if (!com.facebook.ads.redexgen.core.AbstractC0927Oh.A00(this.A03.A02()).A0O(this.A03, false)) {
            A0C();
            return;
        }
        com.facebook.ads.redexgen.core.AbstractC1199Zd A01 = com.facebook.ads.redexgen.core.AbstractC1200Ze.A01(this.A03, this.A04, this.A01.A7O(), this);
        if (A01 == null) {
            A0C();
            return;
        }
        com.facebook.ads.redexgen.core.YB.A0W(this);
        addView(A01, new android.widget.FrameLayout.LayoutParams(-1, -1));
        A01.A0N();
    }

    private void A0E() {
        if (getVisibility() == 0 && this.A00 && hasWindowFocus()) {
            this.A0A.A0U();
        } else {
            this.A0A.A0V();
        }
    }

    public static boolean A0H(com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.C1806ji c1806ji) {
        java.lang.String A0e = c1806ji.A0e();
        if (android.text.TextUtils.isEmpty(A0e)) {
            return false;
        }
        java.lang.String videoUrl = c1042Sx.A0T(A0e);
        return !android.text.TextUtils.isEmpty(videoUrl);
    }

    public final void A0I() {
        if (this.A08 != null) {
            this.A08.A0D();
        }
        if (this.A0A != null) {
            this.A0A.A0V();
        }
        com.facebook.ads.redexgen.core.YB.A0J(this);
    }

    public final void A0J() {
        if (this.A08 != null) {
            com.facebook.ads.redexgen.core.AbstractC0936Oq abstractC0936Oq = this.A08;
            if (A0E[2].charAt(13) == 'c') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0E;
            strArr[0] = "hgkEcT5pEsAUKYMkvVnojxGMD5WCOUSh";
            strArr[5] = "qBRuzdoZQfMYUt1SZmDdshQz8Ndd8EXP";
            abstractC0936Oq.A0E();
        }
    }

    private int getOrientation() {
        android.app.Activity activity = this.A03.A0E();
        if (activity != null) {
            return activity.getResources().getConfiguration().orientation;
        }
        return 1;
    }

    public com.facebook.ads.redexgen.core.C1581fp getViewabilityChecker() {
        return this.A0A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A00 = true;
        A0E();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00 = false;
        A0E();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(android.view.View view, int i) {
        super.onVisibilityChanged(view, i);
        A0E();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A0E();
    }

    private void setViewAsCTA(android.view.View view) {
        view.setOnClickListener(new com.facebook.ads.redexgen.core.Z0(this));
    }
}
