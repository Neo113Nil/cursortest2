package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.6M, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C6M extends com.facebook.ads.redexgen.core.AbstractC0797Jg {
    public com.facebook.ads.redexgen.core.ZI A00;
    public com.facebook.ads.redexgen.core.InterfaceC1398cq A01;
    public com.facebook.ads.redexgen.core.C1477e8 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public android.widget.RelativeLayout A06;
    public com.facebook.ads.redexgen.core.C0712Fy A07;
    public final com.facebook.ads.redexgen.core.C1636gi A08;
    public final com.facebook.ads.redexgen.core.EA A09;
    public final com.facebook.ads.redexgen.core.E4 A0A;
    public final com.facebook.ads.redexgen.core.E2 A0B;
    public final com.facebook.ads.redexgen.core.E0 A0C;
    public final com.facebook.ads.redexgen.core.AbstractC0654Dr A0D;
    public final java.lang.String A0E;
    public final android.graphics.Paint A0F;
    public final android.graphics.Path A0G;
    public final android.graphics.RectF A0H;
    public final com.facebook.ads.redexgen.core.C1353c7 A0I;
    public static java.lang.String[] A0J = {"MpRqvkZj1q70y", "JmeA7cKwz52Cf66UfzrPr0LMRH4SYAx7", "6sdDVsKAMYqDcEUPGSGZSzHS1QCr5tGd", "kTGZxaoWJV94XtNMqSwvdL", "Mc6tnSsqpweEwwZBrEzxWewdD5U0ZBnH", "pH8A6EuZ6tOwC2LEaYgoPeYfMAE", "hIXMP87egv28CzL5Z81pRvvAccgq29VA", "kjeLkimcHFb7T02SebLVQF"};
    public static final int A0L = (int) (com.facebook.ads.redexgen.core.XX.A02 * 0.0f);
    public static final int A0M = (int) (com.facebook.ads.redexgen.core.XX.A02 * 9.0f);
    public static final int A0K = (int) (com.facebook.ads.redexgen.core.XX.A02 * 9.0f);

    public C6M(com.facebook.ads.redexgen.core.C1353c7 c1353c7, boolean z, java.lang.String str, com.facebook.ads.redexgen.core.C0712Fy c0712Fy) {
        super(c1353c7, z);
        this.A0G = new android.graphics.Path();
        this.A0H = new android.graphics.RectF();
        this.A0D = new com.facebook.ads.redexgen.core.AbstractC0654Dr() { // from class: com.facebook.ads.redexgen.X.6S
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C0655Ds c0655Ds) {
                if (com.facebook.ads.redexgen.core.C6M.this.getVideoView() != null) {
                    com.facebook.ads.redexgen.core.C6M.this.A07.A0P().setVolume(com.facebook.ads.redexgen.core.C6M.this.getVideoView().getVolume());
                }
            }
        };
        this.A09 = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.6R
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
                com.facebook.ads.redexgen.core.C6M.this.A01();
                java.lang.Object tag = com.facebook.ads.redexgen.core.C6M.this.getTag(-1593835536);
                if (tag != null) {
                    com.facebook.ads.redexgen.core.C6M.this.A07.A0N().AGM(((java.lang.Integer) tag).intValue());
                }
            }
        };
        this.A0B = new com.facebook.ads.redexgen.core.E2() { // from class: com.facebook.ads.redexgen.X.6Q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E3 e3) {
                com.facebook.ads.redexgen.core.C6M.this.A00();
                com.facebook.ads.redexgen.core.C6M.this.A07.A0O().AGY(com.facebook.ads.redexgen.core.C6M.this);
            }
        };
        this.A0A = new com.facebook.ads.redexgen.core.E4() { // from class: com.facebook.ads.redexgen.X.6O
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4B c4b) {
                com.facebook.ads.redexgen.core.C6M.this.A01();
                com.facebook.ads.redexgen.core.C6M.this.A07.A0O().AGW(com.facebook.ads.redexgen.core.C6M.this);
            }
        };
        this.A0C = new com.facebook.ads.redexgen.core.E0() { // from class: com.facebook.ads.redexgen.X.6N
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E1 e1) {
                com.facebook.ads.redexgen.core.C6M.this.A05 = true;
                com.facebook.ads.redexgen.core.C6M.this.A02();
            }
        };
        this.A0I = c1353c7;
        this.A07 = c0712Fy;
        this.A0E = str;
        this.A08 = c1353c7.A06();
        setGravity(17);
        setPadding(A0L, 0, A0L, A0L);
        com.facebook.ads.redexgen.core.YB.A0N(this, 0);
        setUpView(this.A08);
        this.A0F = new android.graphics.Paint();
        this.A0F.setColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        this.A0F.setStyle(android.graphics.Paint.Style.FILL);
        this.A0F.setAlpha(16);
        this.A0F.setAntiAlias(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        if (this.A0I.A0E() != null && this.A02 != null) {
            com.facebook.ads.redexgen.core.DZ A0E = this.A0I.A0E();
            com.facebook.ads.redexgen.core.C0673Ek simpleVideoView = this.A02.getSimpleVideoView();
            if (A0J[2].charAt(30) != 'G') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0J;
            strArr[6] = "7Tm7E6hvxl2lrINlaGqN4b4kJs9I709m";
            strArr[1] = "njm7q4dCrj2NJr9FsCrNNlLowJdEGDJD";
            A0E.AAv(simpleVideoView);
            if (com.facebook.ads.redexgen.core.C1086Up.A2L(getContext())) {
                this.A0I.A0E().A09(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (this.A0I.A0E() != null) {
            this.A0I.A0E().A06();
            if (this.A02 != null) {
                this.A0I.A0E().AKV(this.A02.getSimpleVideoView());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r3 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A02() {
        if (this.A01 == null) {
            return;
        }
        if (A1V()) {
            boolean z = this.A05;
            if (A0J[4].charAt(16) == 'S') {
                throw new java.lang.RuntimeException();
            }
            A0J[4] = "H2PvwmHOgvOi5klEuL8elNjNTBtJADxS";
        }
        if (A1V() || !this.A04) {
            return;
        }
        this.A01.ACz();
    }

    private void A03(android.view.View view) {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        if (view == null || (layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.addRule(13, -1);
        view.setLayoutParams(layoutParams);
    }

    public static void A04(android.view.View view) {
        view.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
        com.facebook.ads.redexgen.core.YB.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A0A() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A1O() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0797Jg
    public final void A1R() {
        if (A1V() && this.A02 != null) {
            com.facebook.ads.redexgen.core.C1477e8 c1477e8 = this.A02;
            if (A0J[4].charAt(16) == 'S') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0J;
            strArr[0] = "PPsdw83Xwgr8n";
            strArr[5] = "5ciU0wOzbld7CiHKSmuHpDfStOE";
            c1477e8.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0797Jg
    public final void A1S() {
        if (A1V()) {
            A1T();
            if (this.A02 != null) {
                this.A02.A05(com.facebook.ads.redexgen.core.EnumC1523et.A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0797Jg
    public final void A1T() {
        float volume = this.A07.A0P().getVolume();
        if (!A1V() || this.A02 == null) {
            return;
        }
        float newVolume = this.A02.getVolume();
        if (volume != newVolume) {
            this.A02.setVolume(volume);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0797Jg
    public final boolean A1U() {
        return A1V() && this.A02 != null && this.A02.A06();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0797Jg
    public final boolean A1V() {
        return this.A03;
    }

    public final void A1W(java.util.Map<java.lang.String, java.lang.String> extraParams) {
        if (this.A02 != null) {
            this.A02.A02();
            if (A1V()) {
                this.A02.A04(getAdEventManager(), this.A0E, extraParams);
            }
        }
    }

    public final com.facebook.ads.redexgen.core.C1477e8 getVideoView() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        this.A0G.reset();
        this.A0H.set(0.0f, 0.0f, getWidth(), getHeight());
        int i = 0;
        int radius = getResources().getConfiguration().orientation;
        boolean z = radius == 1;
        if (z) {
            i = A0K;
        }
        this.A0G.addRoundRect(this.A0H, i, i, android.graphics.Path.Direction.CW);
        canvas.drawPath(this.A0G, this.A0F);
        android.graphics.RectF rectF = this.A0H;
        int radius2 = A0L;
        float f = radius2;
        int width = getWidth();
        int radius3 = A0L;
        float f2 = width - radius3;
        int height = getHeight();
        int radius4 = A0L;
        rectF.set(f, 0.0f, f2, height - radius4);
        if (z) {
            i = A0M;
        }
        this.A0G.addRoundRect(this.A0H, i, i, android.graphics.Path.Direction.CW);
        canvas.clipPath(this.A0G);
        super.onDraw(canvas);
    }

    public void setCTAInfo(com.facebook.ads.redexgen.core.C0896Nc c0896Nc, java.util.Map<java.lang.String, java.lang.String> extraData) {
        getCtaButton().setCta(c0896Nc, this.A0E, extraData);
    }

    public void setImageUrl(java.lang.String str) {
        if (this.A00 != null) {
            this.A00.setVisibility(0);
            new com.facebook.ads.redexgen.core.LM(this.A00, this.A08).A04().A06(new com.facebook.ads.redexgen.core.C0821Ke(this)).A07(str);
        }
        if (this.A02 != null) {
            this.A02.setVisibility(8);
        }
    }

    public void setIsVideo(boolean z) {
        this.A03 = z;
    }

    public void setOnAssetsLoadedListener(com.facebook.ads.redexgen.core.InterfaceC1398cq interfaceC1398cq) {
        this.A01 = interfaceC1398cq;
    }

    public void setUpImageView(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this.A00 = new com.facebook.ads.redexgen.core.ZI(c1636gi);
        if (com.facebook.ads.redexgen.core.C1086Up.A1J(c1636gi)) {
            com.facebook.ads.redexgen.core.AbstractC1296bC.A00(this.A00, com.facebook.ads.redexgen.core.C1086Up.A1K(c1636gi), new com.facebook.ads.redexgen.core.ViewOnClickListenerC1322bc(this));
        }
        A04(this.A00);
    }

    public void setUpMediaContainer(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this.A06 = new android.widget.RelativeLayout(c1636gi);
        A04(this.A06);
        if (this.A00 != null) {
            this.A06.addView(this.A00);
            A03(this.A00);
        }
        if (this.A02 != null) {
            this.A06.addView(this.A02);
            A03(this.A02);
        }
        addView(this.A06);
    }

    public void setUpVideoView(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this.A02 = new com.facebook.ads.redexgen.core.C1477e8(c1636gi, new com.facebook.ads.redexgen.core.VI(this.A0E, getAdEventManager()));
        if (com.facebook.ads.redexgen.core.C1086Up.A1L(c1636gi)) {
            com.facebook.ads.redexgen.core.AbstractC1296bC.A00(this.A02, com.facebook.ads.redexgen.core.C1086Up.A1M(c1636gi), new com.facebook.ads.redexgen.core.ViewOnClickListenerC1323bd(this));
        }
        com.facebook.ads.redexgen.core.C1477e8 c1477e8 = this.A02;
        if (A0J[2].charAt(30) != 'G') {
            throw new java.lang.RuntimeException();
        }
        A0J[4] = "tNSgYVifT5FMSy2OwNBjuNxtKDkDnPPF";
        A04(c1477e8);
    }

    private void setUpView(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        setUpImageView(c1636gi);
        setUpVideoView(c1636gi);
        setUpMediaContainer(c1636gi);
    }

    public void setVideoPlaceholderUrl(java.lang.String str) {
        if (this.A02 != null) {
            this.A02.setPlaceholderUrl(str);
        }
    }

    public void setVideoUrl(java.lang.String str) {
        if (this.A00 != null) {
            this.A00.setVisibility(8);
        }
        com.facebook.ads.redexgen.core.C1477e8 c1477e8 = this.A02;
        java.lang.String[] strArr = A0J;
        if (strArr[6].charAt(10) != strArr[1].charAt(10)) {
            throw new java.lang.RuntimeException();
        }
        A0J[2] = "Key351avhXFGNIES0xzUdjVz8AR1nkGO";
        if (c1477e8 != null) {
            this.A02.setVisibility(0);
            this.A02.setVideoURI(str);
            this.A02.A03(this.A0D);
            this.A02.A03(this.A09);
            this.A02.A03(this.A0B);
            this.A02.A03(this.A0A);
            this.A02.A03(this.A0C);
        }
    }
}
