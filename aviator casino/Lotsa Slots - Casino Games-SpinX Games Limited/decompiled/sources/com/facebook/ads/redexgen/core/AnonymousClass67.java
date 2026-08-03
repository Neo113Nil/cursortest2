package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.67, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AnonymousClass67 extends com.facebook.ads.redexgen.core.AbstractC0797Jg implements com.facebook.ads.redexgen.core.XQ {
    public static byte[] A0L;
    public static java.lang.String[] A0M = {"XgHadHW09EVAxZ9Csjyh8Iwd", "cGY", "0gnHO0byxZtUV0t5q6", "nitlVKI6s75UlUdu4qHy2TBluRJ6Vnqb", "dqu", "CAnKNEP5j3LNWAO1IgUwk41cBq", "Gj8h5dX0pUMTu0Q6FRM85YsFx7LjGw4a", "ydUjPQqek3X4wwrCfoz9Rz5n"};
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public android.widget.RelativeLayout A00;
    public com.facebook.ads.redexgen.core.ZI A01;

    @javax.annotation.Nullable
    public com.facebook.ads.redexgen.core.InterfaceC1398cq A02;
    public com.facebook.ads.redexgen.core.C0712Fy A03;
    public com.facebook.ads.redexgen.core.C1477e8 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final android.graphics.Paint A08;
    public final android.graphics.Path A09;
    public final android.graphics.RectF A0A;
    public final com.facebook.ads.redexgen.core.C1636gi A0B;
    public final com.facebook.ads.redexgen.core.XS A0C;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A0D;
    public final com.facebook.ads.redexgen.core.C1353c7 A0E;
    public final com.facebook.ads.redexgen.core.EA A0F;
    public final com.facebook.ads.redexgen.core.E4 A0G;
    public final com.facebook.ads.redexgen.core.E2 A0H;
    public final com.facebook.ads.redexgen.core.E0 A0I;
    public final com.facebook.ads.redexgen.core.AbstractC0654Dr A0J;
    public final java.lang.String A0K;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0L, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A0M;
            if (strArr[0].length() != strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0M;
            strArr2[1] = "5LW";
            strArr2[4] = "hlZ";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 11);
            i4++;
        }
    }

    public static void A03() {
        A0L = new byte[]{68, 70, 85, 72, 82, 84, 66, 75, 120, 68, 70, 85, 67};
    }

    public abstract void A1X(com.facebook.ads.redexgen.core.C1636gi c1636gi);

    static {
        A03();
        A0O = (int) (com.facebook.ads.redexgen.core.XX.A02 * 1.0f);
        A0P = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
        A0N = (int) (com.facebook.ads.redexgen.core.XX.A02 * 6.0f);
    }

    public AnonymousClass67(com.facebook.ads.redexgen.core.C1353c7 c1353c7, boolean z, java.lang.String str, com.facebook.ads.redexgen.core.C0712Fy c0712Fy) {
        super(c1353c7, z);
        this.A09 = new android.graphics.Path();
        this.A0A = new android.graphics.RectF();
        this.A0J = new com.facebook.ads.redexgen.core.AbstractC0654Dr() { // from class: com.facebook.ads.redexgen.X.6C
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C0655Ds c0655Ds) {
                com.facebook.ads.redexgen.core.C0712Fy c0712Fy2;
                c0712Fy2 = com.facebook.ads.redexgen.core.AnonymousClass67.this.A03;
                c0712Fy2.A0P().setVolume(com.facebook.ads.redexgen.core.AnonymousClass67.this.getVideoView().getVolume());
            }
        };
        this.A0F = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.6B
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
                com.facebook.ads.redexgen.core.C0712Fy c0712Fy2;
                c0712Fy2 = com.facebook.ads.redexgen.core.AnonymousClass67.this.A03;
                c0712Fy2.A0N().AGM(((java.lang.Integer) com.facebook.ads.redexgen.core.AnonymousClass67.this.getTag(-1593835536)).intValue());
            }
        };
        this.A0H = new com.facebook.ads.redexgen.core.E2() { // from class: com.facebook.ads.redexgen.X.6A
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E3 e3) {
                com.facebook.ads.redexgen.core.C0712Fy c0712Fy2;
                c0712Fy2 = com.facebook.ads.redexgen.core.AnonymousClass67.this.A03;
                c0712Fy2.A0O().AGY(com.facebook.ads.redexgen.core.AnonymousClass67.this);
            }
        };
        this.A0G = new com.facebook.ads.redexgen.core.E4() { // from class: com.facebook.ads.redexgen.X.69
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4B c4b) {
                com.facebook.ads.redexgen.core.C0712Fy c0712Fy2;
                c0712Fy2 = com.facebook.ads.redexgen.core.AnonymousClass67.this.A03;
                c0712Fy2.A0O().AGW(com.facebook.ads.redexgen.core.AnonymousClass67.this);
            }
        };
        this.A0I = new com.facebook.ads.redexgen.core.E0() { // from class: com.facebook.ads.redexgen.X.68
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E1 e1) {
                com.facebook.ads.redexgen.core.AnonymousClass67.this.A07 = true;
                com.facebook.ads.redexgen.core.AnonymousClass67.this.A02();
            }
        };
        this.A0D = c1353c7.A0C();
        this.A0E = c1353c7;
        this.A03 = c0712Fy;
        this.A0K = str;
        this.A0B = c1353c7.A06();
        this.A0C = com.facebook.ads.redexgen.core.XS.A00(c1353c7.A06(), c1353c7.A05(), this);
        setGravity(17);
        setPadding(A0O, 0, A0O, A0O);
        com.facebook.ads.redexgen.core.YB.A0N(this, 0);
        setUpView(this.A0B);
        this.A08 = new android.graphics.Paint();
        this.A08.setColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        this.A08.setStyle(android.graphics.Paint.Style.FILL);
        this.A08.setAlpha(16);
        this.A08.setAntiAlias(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        if (this.A02 == null) {
            return;
        }
        if ((A1V() && this.A07) || (!A1V() && this.A06)) {
            this.A02.ACz();
        }
    }

    private void A04(android.view.View view) {
        view.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
        com.facebook.ads.redexgen.core.YB.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public boolean A0A() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final void A1C() {
        super.A1C();
        this.A0C.A03();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public final boolean A1O() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0797Jg
    public final void A1R() {
        if (A1V()) {
            this.A04.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0797Jg
    public final void A1S() {
        if (A1V()) {
            A1T();
            com.facebook.ads.redexgen.core.C1477e8 c1477e8 = this.A04;
            com.facebook.ads.redexgen.core.EnumC1523et enumC1523et = com.facebook.ads.redexgen.core.EnumC1523et.A02;
            if (A0M[2].length() == 4) {
                throw new java.lang.RuntimeException();
            }
            A0M[2] = "GrzUS";
            c1477e8.A05(enumC1523et);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0797Jg
    public final void A1T() {
        float volume = this.A03.A0P().getVolume();
        if (A1V()) {
            float newVolume = this.A04.getVolume();
            if (volume != newVolume) {
                com.facebook.ads.redexgen.core.C1477e8 c1477e8 = this.A04;
                if (A0M[5].length() == 9) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0M;
                strArr[1] = "cdp";
                strArr[4] = "iOc";
                c1477e8.setVolume(volume);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0797Jg
    public final boolean A1U() {
        if (A1V()) {
            boolean A06 = this.A04.A06();
            if (A0M[2].length() == 4) {
                throw new java.lang.RuntimeException();
            }
            A0M[2] = "SbvNib3Q04NWLkmSI4CaBbpy";
            if (A06) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0797Jg
    public final boolean A1V() {
        return this.A05;
    }

    public final /* synthetic */ void A1W(android.view.View view) {
        getCtaButton().A0E(A01(0, 13, 44));
    }

    public final void A1Y(java.util.Map<java.lang.String, java.lang.String> extraParams) {
        this.A04.A02();
        if (A1V()) {
            this.A04.A04(getAdEventManager(), this.A0K, extraParams);
        }
    }

    public final android.widget.RelativeLayout getMediaContainer() {
        return this.A00;
    }

    public final com.facebook.ads.redexgen.core.C1477e8 getVideoView() {
        return this.A04;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        this.A09.reset();
        this.A0A.set(0.0f, 0.0f, getWidth(), getHeight());
        this.A09.addRoundRect(this.A0A, A0N, A0N, android.graphics.Path.Direction.CW);
        canvas.drawPath(this.A09, this.A08);
        this.A0A.set(A0O, 0.0f, getWidth() - A0O, getHeight() - A0O);
        this.A09.addRoundRect(this.A0A, A0P, A0P, android.graphics.Path.Direction.CW);
        canvas.clipPath(this.A09);
        super.onDraw(canvas);
    }

    public void setAdTitleAndDescription(java.lang.String str, java.lang.String str2) {
        getTitleDescContainer().A04(str, str2, null, true, false);
    }

    public void setCTAInfo(com.facebook.ads.redexgen.core.C0896Nc c0896Nc, java.util.Map<java.lang.String, java.lang.String> extraData) {
        getCtaButton().setCta(c0896Nc, this.A0K, extraData);
    }

    public void setImageUrl(java.lang.String str) {
        this.A01.setVisibility(0);
        this.A04.setVisibility(8);
        new com.facebook.ads.redexgen.core.LM(this.A01, this.A0B).A04().A06(new com.facebook.ads.redexgen.core.C0796Jf(this)).A07(str);
    }

    public void setIsVideo(boolean z) {
        this.A05 = z;
    }

    public void setOnAssetsLoadedListener(com.facebook.ads.redexgen.core.InterfaceC1398cq interfaceC1398cq) {
        this.A02 = interfaceC1398cq;
    }

    public void setUpImageView(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this.A01 = new com.facebook.ads.redexgen.core.ZI(c1636gi);
        if (com.facebook.ads.redexgen.core.C1086Up.A1J(c1636gi)) {
            com.facebook.ads.redexgen.core.AbstractC1296bC.A00(this.A01, com.facebook.ads.redexgen.core.C1086Up.A1K(c1636gi), new com.facebook.ads.redexgen.core.ViewOnClickListenerC1404cw(this));
        }
        A04(this.A01);
    }

    public void setUpMediaContainer(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this.A00 = new android.widget.RelativeLayout(c1636gi);
        A04(this.A00);
        com.facebook.ads.redexgen.core.XR A02 = this.A0C.A02(this.A0E.A05());
        this.A0E.A06().A0H().A00(A02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A0C);
        if (this.A0E.A05().A1e() && com.facebook.ads.redexgen.core.C1086Up.A2w(this.A0B)) {
            this.A00.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1403cv(this));
        } else {
            if (!A02.A00) {
                return;
            }
            this.A00.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.cu
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.facebook.ads.redexgen.core.AnonymousClass67.this.A1W(view);
                }
            });
        }
    }

    public void setUpVideoView(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this.A04 = new com.facebook.ads.redexgen.core.C1477e8(c1636gi, new com.facebook.ads.redexgen.core.VI(this.A0K, getAdEventManager()));
        if (com.facebook.ads.redexgen.core.C1086Up.A1L(c1636gi)) {
            com.facebook.ads.redexgen.core.AbstractC1296bC.A00(this.A04, com.facebook.ads.redexgen.core.C1086Up.A1M(c1636gi), new com.facebook.ads.redexgen.core.ViewOnClickListenerC1405cx(this));
        }
        A04(this.A04);
    }

    private void setUpView(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        setUpImageView(c1636gi);
        setUpVideoView(c1636gi);
        setUpMediaContainer(c1636gi);
        this.A00.addView(this.A01);
        this.A00.addView(this.A04);
        A1X(c1636gi);
    }

    public void setVideoPlaceholderUrl(java.lang.String str) {
        this.A04.setPlaceholderUrl(str);
    }

    public void setVideoUrl(java.lang.String str) {
        this.A01.setVisibility(8);
        this.A04.setVisibility(0);
        this.A04.setVideoURI(str);
        this.A04.A03(this.A0J);
        this.A04.A03(this.A0F);
        this.A04.A03(this.A0H);
        this.A04.A03(this.A0G);
        this.A04.A03(this.A0I);
    }
}
