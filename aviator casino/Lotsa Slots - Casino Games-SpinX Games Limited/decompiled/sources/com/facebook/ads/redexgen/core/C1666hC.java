package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1666hC extends com.facebook.ads.redexgen.core.C1006Rm implements com.facebook.ads.internal.api.MediaViewApi, com.facebook.ads.internal.context.Repairable, com.facebook.ads.redexgen.core.T4, com.facebook.ads.redexgen.core.InterfaceC1198Zc {
    public static byte[] A0L;
    public static java.lang.String[] A0M = {"opPNeHLRCwNMjghH70VvpS5N8kNNBiJu", "eEOY2RUjN4bpbDsCyz0GPhNNbfKnjNLD", "VFQc0pqb8IELGhnpfLoj2hUSBo2VhTCu", "GBUHck22", "gxS7cL5mKFosIlCCzwl1gr8LaZQoy", "JvRhV7isjcFk5", "Q8NK4BrUIZ6kI5bk", "yT7QEu4e"};
    public static final java.lang.String A0N;
    public android.view.View A02;
    public android.view.View A03;
    public android.widget.ImageView A04;
    public android.widget.ImageView A05;
    public android.widget.RelativeLayout A06;
    public com.facebook.ads.MediaView A07;
    public com.facebook.ads.MediaViewListener A08;
    public com.facebook.ads.MediaViewVideoRenderer A09;
    public com.facebook.ads.internal.api.AdComponentViewParentApi A0A;
    public com.facebook.ads.redexgen.core.C1636gi A0C;
    public com.facebook.ads.redexgen.core.XO A0D;
    public com.facebook.ads.redexgen.core.C0x A0E;
    public com.facebook.ads.redexgen.core.C1289b5 A0F;
    public com.facebook.ads.redexgen.core.C1317bX A0G;
    public com.facebook.ads.redexgen.core.AnonymousClass62 A0H;
    public com.facebook.ads.redexgen.core.C1484eF A0I;
    public boolean A0J;
    public boolean A0K;
    public com.facebook.ads.redexgen.core.EnumC1015Rv A0B = com.facebook.ads.redexgen.core.EnumC1015Rv.A04;
    public int A01 = 0;
    public int A00 = 0;

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0L, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A0M;
            if (strArr[6].length() == strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0M;
            strArr2[6] = "ck5ggAbj2vioxfDq";
            strArr2[4] = "NneLGMvrJ83sFMBsADIKrHrKRcoTv";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 74);
            i4++;
        }
    }

    public static void A0C() {
        A0L = new byte[]{-61, -31, -14, -17, -11, -13, -27, -20, -96, -14, -27, -18, -28, -27, -14, -27, -14, -96, -19, -11, -13, -12, -96, -30, -27, -96, -13, -27, -12, -96, -30, -27, -26, -17, -14, -27, -96, -18, -31, -12, -23, -10, -27, -63, -28, -82, 9, 5, 4, 56, 39, 44, 40, 49, 38, 40, 17, 40, 55, 58, 50, 53, 46, -52, -16, -28, -22, -24, -93, -11, -24, -15, -25, -24, -11, -24, -11, -93, -16, -8, -10, -9, -93, -27, -24, -93, -10, -24, -9, -93, -27, -24, -23, -14, -11, -24, -93, -15, -28, -9, -20, -7, -24, -60, -25, -79, -7, com.google.common.base.Ascii.GS, 17, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.NAK, -48, 34, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, 34, com.google.common.base.Ascii.NAK, 34, -48, com.google.common.base.Ascii.GS, 37, 35, 36, -48, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.NAK, -48, 35, com.google.common.base.Ascii.NAK, 36, -48, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.US, 34, com.google.common.base.Ascii.NAK, -48, com.google.common.base.Ascii.RS, 17, 36, com.google.common.base.Ascii.EM, 38, com.google.common.base.Ascii.NAK, -14, 17, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.NAK, 34, -15, com.google.common.base.Ascii.DC4, -34, -83, -46, -38, -59, -48, -51, -56, -124, -70, -51, -55, -37, -124, -57, -45, -46, -41, -40, -42, -39, -57, -40, -45, -42, -124, -44, -59, -42, -59, -47, -41, -124, -40, -35, -44, -55, -110, -62, -43, -24, -35, -22, -39, -108, -75, -40, -108, -67, -41, -29, -30, -108, -35, -25, -108, -30, -23, -32, -32, -94, -26, -7, -12, -11, -1, -80, 2, -11, -2, -12, -11, 2, -11, 2, -80, -3, 5, 3, 4, -80, -14, -11, -80, 3, -11, 4, -80, -14, -11, -10, -1, 2, -11, -80, -2, -15, 4, -7, 6, -11, -47, -12, -66, -41, -26, -33, -70, -58, -60, -123, -67, -72, -70, -68, -71, -58, -58, -62, -123, -72, -69, -54, -123, -59, -72, -53, -64, -51, -68, -123, -70, -61, -64, -70, -62, -68, -69, -15, -28, -33, -32, -22, -48, -19, -25, -72};
    }

    static {
        A0C();
        A0N = com.facebook.ads.MediaView.class.getSimpleName();
    }

    private void A06() {
        this.A0C.A0F().ABd();
        this.A0G = new com.facebook.ads.redexgen.core.C1317bX(this.A0C, false);
        this.A0G.setImagePadding(com.facebook.ads.redexgen.core.XV.A0A);
        this.A0G.setImage(com.facebook.ads.redexgen.core.YM.FILL_CLOSE);
        this.A0G.A03(0, -7829368, 0, false);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(com.facebook.ads.redexgen.core.XV.A0G, com.facebook.ads.redexgen.core.XV.A0G);
        layoutParams.addRule(11);
        layoutParams.addRule(6, this.A02.getId());
        layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A0U, com.facebook.ads.redexgen.core.XV.A0U, com.facebook.ads.redexgen.core.XV.A00);
        A0D(this.A0G, layoutParams);
        this.A0A.bringChildToFront(this.A0G);
    }

    private void A07() {
        if (this.A0H != null) {
            this.A0H.setVisibility(8);
            com.facebook.ads.redexgen.core.Ph.A0A(this.A0H.getDynamicWebViewController().A0O(), new android.graphics.drawable.ColorDrawable(0));
            this.A07.removeView(this.A0H);
            this.A0H = null;
        }
    }

    private void A08() {
        if (this.A0D != null && !this.A0D.A04()) {
            this.A0D.A06();
        }
    }

    private void A09() {
        if (this.A0D != null && !this.A0D.A04()) {
            this.A0D.A07();
        }
    }

    private void A0A() {
        if (!this.A0K) {
            if (this.A03 != null) {
                com.facebook.ads.redexgen.core.YB.A0J(this.A0E);
            }
            float f = com.facebook.ads.redexgen.core.XX.A02;
            float density = 4.0f * f;
            int hPadding = java.lang.Math.round(density);
            float density2 = 12.0f * f;
            int vPadding = java.lang.Math.round(density2);
            this.A0E.setChildSpacing(hPadding);
            this.A0E.setPadding(0, vPadding, 0, vPadding);
            this.A0E.setVisibility(8);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03 = this.A0E;
            this.A07.addView(this.A03, layoutParams);
            return;
        }
        throw new java.lang.IllegalStateException(A05(0, 46, 54));
    }

    private void A0B() {
        com.facebook.ads.redexgen.core.EnumC1146Xc.A04(this.A07, com.facebook.ads.redexgen.core.EnumC1146Xc.A0B);
        com.facebook.ads.redexgen.core.EnumC1146Xc.A04(this.A0F, com.facebook.ads.redexgen.core.EnumC1146Xc.A0B);
        com.facebook.ads.redexgen.core.EnumC1146Xc.A04(this.A09, com.facebook.ads.redexgen.core.EnumC1146Xc.A0B);
        com.facebook.ads.redexgen.core.EnumC1146Xc.A04(this.A03, com.facebook.ads.redexgen.core.EnumC1146Xc.A0B);
    }

    private final void A0D(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        A01(false);
        this.A07.addView(view, layoutParams);
        A01(true);
    }

    private void A0E(android.view.View view, com.facebook.ads.redexgen.core.UK uk) {
        if (this.A0I != null) {
            this.A07.removeView(this.A0I);
        }
        if (!uk.A1t()) {
            return;
        }
        java.lang.String A1I = uk.A1I();
        if (this.A07.getContext() == null) {
            return;
        }
        this.A0I = com.facebook.ads.redexgen.core.AbstractC1483eE.A01(this.A0C, A1I);
        if (this.A0I != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(5, view.getId());
            layoutParams.addRule(7, view.getId());
            layoutParams.addRule(6, view.getId());
            layoutParams.addRule(8, view.getId());
            layoutParams.addRule(16, view.getId());
            layoutParams.addRule(17, view.getId());
            A0D(this.A0I, layoutParams);
            this.A0A.bringChildToFront(this.A0I);
        }
    }

    private void A0F(android.widget.ImageView imageView) {
        if (!this.A0K) {
            android.widget.ImageView imageView2 = this.A04;
            if (A0M[5].length() != 13) {
                throw new java.lang.RuntimeException();
            }
            A0M[1] = "0pGJtKTiEG7M1QZmgSqLESVqtH6XSoGw";
            if (imageView2 != null) {
                com.facebook.ads.redexgen.core.YB.A0J(this.A04);
            }
            imageView.setVisibility(8);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A07.addView(imageView, layoutParams);
            imageView.setId(com.facebook.ads.redexgen.core.YB.A00());
            this.A04 = imageView;
            return;
        }
        throw new java.lang.IllegalStateException(A05(106, 49, 102));
    }

    private final void A0G(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.util.AttributeSet attributeSet, int i, int i2, com.facebook.ads.MediaView mediaView) {
        this.A07 = mediaView;
        A0F(new android.widget.ImageView(c1636gi, attributeSet, i, i2));
        A0S(new com.facebook.ads.redexgen.core.C1289b5(c1636gi, attributeSet, i, i2));
        this.A0E = new com.facebook.ads.redexgen.core.C0x(c1636gi, attributeSet, i);
        A0A();
        setVideoRenderer(new com.facebook.ads.DefaultMediaViewVideoRenderer(c1636gi, attributeSet, i, i2));
        A0B();
    }

    private final void A0H(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.util.AttributeSet attributeSet, int i, com.facebook.ads.MediaView mediaView) {
        this.A07 = mediaView;
        A0F(new android.widget.ImageView(c1636gi, attributeSet, i));
        A0S(new com.facebook.ads.redexgen.core.C1289b5(c1636gi, attributeSet, i));
        this.A0E = new com.facebook.ads.redexgen.core.C0x(c1636gi, attributeSet, i);
        A0A();
        setVideoRenderer(new com.facebook.ads.DefaultMediaViewVideoRenderer(c1636gi, attributeSet, i));
        A0B();
    }

    private final void A0I(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.util.AttributeSet attributeSet, com.facebook.ads.MediaView mediaView) {
        this.A07 = mediaView;
        A0F(new android.widget.ImageView(c1636gi, attributeSet));
        A0S(new com.facebook.ads.redexgen.core.C1289b5(c1636gi, attributeSet));
        this.A0E = new com.facebook.ads.redexgen.core.C0x(c1636gi, attributeSet);
        A0A();
        setVideoRenderer(new com.facebook.ads.DefaultMediaViewVideoRenderer(c1636gi, attributeSet));
        A0B();
    }

    private final void A0J(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.MediaView mediaView) {
        this.A07 = mediaView;
        A0F(new android.widget.ImageView(c1636gi));
        A0S(new com.facebook.ads.redexgen.core.C1289b5(c1636gi));
        this.A0E = new com.facebook.ads.redexgen.core.C0x(c1636gi);
        A0A();
        setVideoRenderer(new com.facebook.ads.DefaultMediaViewVideoRenderer(c1636gi));
        A0B();
    }

    private void A0K(com.facebook.ads.redexgen.core.UK uk) {
        uk.A1j(this);
    }

    private void A0L(final com.facebook.ads.redexgen.core.UK uk) {
        if (this.A0G != null) {
            this.A0G.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Rw
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.facebook.ads.redexgen.core.C1666hC.this.A0Z(uk, view);
                }
            });
        }
    }

    private void A0M(com.facebook.ads.redexgen.core.UK uk) {
        if (this.A0D != null) {
            this.A0D.A06();
            this.A0D = null;
        }
        if (this.A0G != null) {
            this.A07.removeView(this.A0G);
            this.A0G = null;
        }
        if (uk.A1q()) {
            A06();
            A0L(uk);
            A0P(uk);
            A0K(uk);
        }
    }

    private void A0N(com.facebook.ads.redexgen.core.UK uk) {
        this.A00 = 0;
        if (this.A05 != null) {
            this.A07.removeView(this.A05);
            java.lang.String[] strArr = A0M;
            if (strArr[2].charAt(31) != strArr[0].charAt(31)) {
                throw new java.lang.RuntimeException();
            }
            A0M[5] = "SLqcyKPzacI72";
            this.A05 = null;
        }
        if (uk.A1r()) {
            this.A0C.A0F().ABe();
            this.A05 = new android.widget.ImageView(this.A0C);
            this.A05.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.FILL_CLOSE));
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(com.facebook.ads.redexgen.core.XV.A0G, com.facebook.ads.redexgen.core.XV.A0G);
            layoutParams.addRule(11);
            layoutParams.addRule(6, this.A02.getId());
            layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A0U, com.facebook.ads.redexgen.core.XV.A0U, com.facebook.ads.redexgen.core.XV.A00);
            A0D(this.A05, layoutParams);
            this.A0A.bringChildToFront(this.A05);
            A0O(uk);
        }
    }

    private void A0O(final com.facebook.ads.redexgen.core.UK uk) {
        if (this.A05 != null) {
            this.A05.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Rx
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.facebook.ads.redexgen.core.C1666hC.this.A0a(uk, view);
                }
            });
        }
    }

    private void A0P(com.facebook.ads.redexgen.core.UK uk) {
        if (this.A0G != null) {
            int A0y = uk.A0y();
            this.A0D = new com.facebook.ads.redexgen.core.XO(A0y, new com.facebook.ads.redexgen.core.C1667hD(this, A0y));
            this.A0D.A07();
        }
    }

    private void A0Q(final com.facebook.ads.redexgen.core.UK uk, boolean z) {
        if (this.A06 != null) {
            this.A07.removeView(this.A06);
            if (A0M[5].length() != 13) {
                throw new java.lang.RuntimeException();
            }
            A0M[5] = "ljpGBw4ulgnIo";
            this.A06 = null;
        }
        if (uk.A13() != null && uk.A13().A2U()) {
            this.A06 = new android.widget.RelativeLayout(this.A0C);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            if (z) {
                layoutParams.addRule(10);
            } else {
                layoutParams.addRule(12);
                layoutParams.addRule(21);
            }
            com.facebook.ads.redexgen.core.C1227a5 c1227a5 = new com.facebook.ads.redexgen.core.C1227a5(this.A0C, com.facebook.ads.redexgen.core.EnumC1244aM.A05);
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            if (z) {
                layoutParams2.setMargins(com.facebook.ads.redexgen.core.XV.A0A, com.facebook.ads.redexgen.core.XV.A0A, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A00);
            } else {
                int i = com.facebook.ads.redexgen.core.XV.A00;
                java.lang.String[] strArr = A0M;
                if (strArr[6].length() == strArr[4].length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0M;
                strArr2[2] = "wMv0uQjYnC0gE49Cu2XgtVhibZPJIfwu";
                strArr2[0] = "eHWX3hnc2MQEr3W9NzLO2AooGOj1mFxu";
                layoutParams2.setMargins(i, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A0U, com.facebook.ads.redexgen.core.XV.A0U);
            }
            this.A06.addView(c1227a5, layoutParams2);
            c1227a5.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Ry
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    com.facebook.ads.redexgen.core.C1666hC.this.A0Y(uk, view);
                }
            });
            A0D(this.A06, layoutParams);
            this.A0A.bringChildToFront(this.A06);
        }
    }

    private void A0R(com.facebook.ads.redexgen.core.UK uk, boolean z, com.facebook.ads.redexgen.core.C1098Vb c1098Vb) {
        com.facebook.ads.redexgen.core.LM A04 = new com.facebook.ads.redexgen.core.LM(this.A04, this.A0C).A04();
        if (z) {
            A04.A06(new com.facebook.ads.redexgen.core.C1674hK(this, uk));
        }
        A04.A07(c1098Vb.getUrl());
    }

    private void A0S(com.facebook.ads.redexgen.core.C1289b5 c1289b5) {
        if (!this.A0K) {
            if (this.A0F != null) {
                this.A07.removeView(this.A0F);
            }
            c1289b5.setVisibility(8);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A07.addView(c1289b5, layoutParams);
            this.A0F = c1289b5;
            return;
        }
        throw new java.lang.IllegalStateException(A05(63, 43, 57));
    }

    private boolean A0T(com.facebook.ads.NativeAd nativeAd) {
        java.util.List<com.facebook.ads.NativeAd> carousel = ((com.facebook.ads.redexgen.core.S2) nativeAd.getNativeAdApi()).A04();
        if (carousel == null) {
            return false;
        }
        java.util.Iterator<com.facebook.ads.NativeAd> it = carousel.iterator();
        while (it.hasNext()) {
            if (it.next().getAdCoverImage() == null) {
                return false;
            }
        }
        if (A0M[5].length() != 13) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0M;
        strArr[6] = "NNKiamhSotpSBh0S";
        strArr[4] = "WQowSckFUFZtjqKDGN1yGWQ8HKryj";
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0U(com.facebook.ads.NativeAd nativeAd) {
        return !android.text.TextUtils.isEmpty(((com.facebook.ads.redexgen.core.S2) nativeAd.getNativeAdApi()).A03());
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0316, code lost:
    
        if (r2.getAdCoverImage() != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0318, code lost:
    
        new com.facebook.ads.redexgen.core.LM(r17.A07, r17.A0C).A05(r17.A07.getHeight(), r17.A07.getWidth()).A06(new com.facebook.ads.redexgen.core.C1670hG(r17, r2)).A07(r2.getAdCoverImage().getUrl());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0349, code lost:
    
        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x034b, code lost:
    
        android.util.Log.i(com.facebook.ads.redexgen.core.C1666hC.A0N, A05(292, 9, 49) + ((com.facebook.ads.redexgen.core.S2) r18.getNativeAdApi()).A03());
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0375, code lost:
    
        A0E(r17.A09, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x039f, code lost:
    
        if (r2.getAdCoverImage() != null) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0W(com.facebook.ads.NativeAd nativeAd) {
        com.facebook.ads.redexgen.core.AbstractC1802je abstractC1802je;
        android.view.ViewParent viewParent;
        com.facebook.ads.redexgen.core.C1636gi adObjectContext = ((com.facebook.ads.redexgen.core.UK) nativeAd.getInternalNativeAd()).A16();
        adObjectContext.A0O(this);
        this.A0C.A0L(adObjectContext);
        this.A0C.A0K(adObjectContext.A0F());
        this.A0K = true;
        com.facebook.ads.redexgen.core.UK A0L2 = com.facebook.ads.redexgen.core.UK.A0L(nativeAd.getInternalNativeAd());
        A0L2.A1a(this.A07);
        this.A04.setVisibility(8);
        this.A04.setImageDrawable(null);
        if (A0L2.A13() != null && A0L2.A13().A1g()) {
            if (!android.text.TextUtils.isEmpty(A0L2.A13().A29().A0H().A09())) {
                this.A0B = com.facebook.ads.redexgen.core.EnumC1015Rv.A05;
                A0L2.A16().A0F().AJt(com.facebook.ads.redexgen.core.M5.A0A);
            } else {
                this.A0B = com.facebook.ads.redexgen.core.EnumC1015Rv.A03;
                A0L2.A16().A0F().AJt(com.facebook.ads.redexgen.core.M5.A09);
            }
            A07();
            this.A0F.setVisibility(8);
            this.A0F.setImage(null, null);
            this.A09.setVisibility(8);
            this.A09.unsetNativeAd();
            ((com.facebook.ads.redexgen.core.C1019Rz) this.A09.getMediaViewVideoRendererApi()).A03();
            if (this.A03 != null) {
                this.A03.setVisibility(8);
                if (this.A03 instanceof com.facebook.ads.redexgen.core.C1280aw) {
                    ((com.facebook.ads.redexgen.core.C1280aw) this.A03).A04();
                } else {
                    ((com.facebook.ads.redexgen.core.C7M) this.A03).setAdapter(null);
                }
            }
            A01(false);
            this.A0H = new com.facebook.ads.redexgen.core.AnonymousClass62(this.A0C, this.A0C.A0A(), new com.facebook.ads.redexgen.core.C1672hI(this, A0L2, nativeAd), A0L2.A13(), A05(261, 31, 13), 4, A0L2.A1E());
            com.facebook.ads.redexgen.core.EnumC1146Xc.A04(this.A0H, com.facebook.ads.redexgen.core.EnumC1146Xc.A0B);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            this.A07.addView(this.A0H, layoutParams);
            this.A02 = this.A0H;
            bringChildToFront(this.A0H);
            this.A0H.setVisibility(0);
            A0E(this.A0H, A0L2);
            A01(true);
        } else if (A0T(nativeAd)) {
            this.A0B = com.facebook.ads.redexgen.core.EnumC1015Rv.A02;
            A0L2.A16().A0F().AJt(com.facebook.ads.redexgen.core.M5.A04);
            boolean z = A0L2.A1C() == com.facebook.ads.redexgen.core.EnumC1101Ve.A0B;
            if (!com.facebook.ads.redexgen.core.C1086Up.A2v(this.A0C) || z) {
                this.A03 = this.A0E;
                ((com.facebook.ads.redexgen.core.C0x) this.A03).setCurrentPosition(0);
                ((com.facebook.ads.redexgen.core.C0x) this.A03).setShowTextInCarousel(z);
                if (z) {
                    final com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A0C;
                    final com.facebook.ads.redexgen.core.C0x c0x = (com.facebook.ads.redexgen.core.C0x) this.A03;
                    final java.util.List<com.facebook.ads.redexgen.core.UK> A1N = A0L2.A1N();
                    final com.facebook.ads.redexgen.core.C1100Vd A1B = A0L2.A1B();
                    abstractC1802je = new com.facebook.ads.redexgen.core.AbstractC1802je(c1636gi, c0x, A1N, A1B) { // from class: com.facebook.ads.redexgen.X.7r
                        public final com.facebook.ads.redexgen.core.C1636gi A00;
                        public final com.facebook.ads.redexgen.core.C1100Vd A01;

                        {
                            super(c0x, A1N, c1636gi);
                            this.A00 = c1636gi;
                            this.A01 = A1B == null ? new com.facebook.ads.redexgen.core.C1100Vd() : A1B;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // com.facebook.ads.redexgen.core.AbstractC0984Qq
                        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
                        public final com.facebook.ads.redexgen.core.PX A0F(android.view.ViewGroup viewGroup, int i) {
                            return new com.facebook.ads.redexgen.core.PX(new com.facebook.ads.redexgen.core.C1183Yn(this.A00, this.A01));
                        }

                        @Override // com.facebook.ads.redexgen.core.AbstractC0984Qq
                        /* renamed from: A0Q */
                        public final void A0K(com.facebook.ads.redexgen.core.PX px, int i) {
                            super.A0K(px, i);
                            com.facebook.ads.redexgen.core.C1183Yn c1183Yn = (com.facebook.ads.redexgen.core.C1183Yn) px.A0p();
                            A0O(c1183Yn.getImageCardView(), i);
                            if (((com.facebook.ads.redexgen.core.AbstractC1802je) this).A01.get(i) != null) {
                                c1183Yn.setTitle(((com.facebook.ads.redexgen.core.AbstractC1802je) this).A01.get(i).getAdHeadline());
                                c1183Yn.setSubtitle(((com.facebook.ads.redexgen.core.AbstractC1802je) this).A01.get(i).getAdLinkDescription());
                                c1183Yn.setButtonText(((com.facebook.ads.redexgen.core.AbstractC1802je) this).A01.get(i).getAdCallToAction());
                            }
                            com.facebook.ads.redexgen.core.UK uk = ((com.facebook.ads.redexgen.core.AbstractC1802je) this).A01.get(i);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(c1183Yn);
                            uk.A1V(c1183Yn, c1183Yn, arrayList);
                        }
                    };
                } else {
                    final com.facebook.ads.redexgen.core.C0x c0x2 = (com.facebook.ads.redexgen.core.C0x) this.A03;
                    final java.util.List<com.facebook.ads.redexgen.core.UK> A1N2 = A0L2.A1N();
                    final com.facebook.ads.redexgen.core.C1636gi c1636gi2 = this.A0C;
                    abstractC1802je = new com.facebook.ads.redexgen.core.AbstractC1802je(c0x2, A1N2, c1636gi2) { // from class: com.facebook.ads.redexgen.X.7q
                        public final com.facebook.ads.redexgen.core.C1636gi A00;

                        {
                            this.A00 = c1636gi2;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // com.facebook.ads.redexgen.core.AbstractC0984Qq
                        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
                        public final com.facebook.ads.redexgen.core.PX A0F(android.view.ViewGroup viewGroup, int i) {
                            return new com.facebook.ads.redexgen.core.PX(new com.facebook.ads.redexgen.core.C1189Yt(this.A00));
                        }

                        @Override // com.facebook.ads.redexgen.core.AbstractC0984Qq
                        /* renamed from: A0Q, reason: merged with bridge method [inline-methods] */
                        public final void A0K(com.facebook.ads.redexgen.core.PX px, int i) {
                            super.A0K(px, i);
                            com.facebook.ads.redexgen.core.C1189Yt c1189Yt = (com.facebook.ads.redexgen.core.C1189Yt) px.A0p();
                            com.facebook.ads.redexgen.core.ZI imageView = (com.facebook.ads.redexgen.core.ZI) c1189Yt.getImageCardView();
                            imageView.setImageDrawable(null);
                            A0O(imageView, i);
                            com.facebook.ads.redexgen.core.UK childAd = ((com.facebook.ads.redexgen.core.AbstractC1802je) this).A01.get(i);
                            childAd.A16().A0L(this.A00);
                            childAd.A1U(c1189Yt, c1189Yt);
                        }
                    };
                }
                abstractC1802je.A0P(new com.facebook.ads.redexgen.core.C1671hH(this, A0L2));
                ((com.facebook.ads.redexgen.core.C7M) this.A03).setAdapter(abstractC1802je);
            } else {
                A01(false);
                int width = this.A07.getWidth();
                if (width == 0) {
                    if (this.A07.getParent() instanceof android.view.ViewGroup) {
                        viewParent = this.A07.getParent();
                    } else {
                        viewParent = null;
                    }
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewParent;
                    while (width == 0 && viewGroup != null) {
                        width = viewGroup.getWidth();
                        boolean z2 = viewGroup.getParent() instanceof android.view.ViewGroup;
                        java.lang.String[] strArr = A0M;
                        if (strArr[2].charAt(31) != strArr[0].charAt(31)) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr2 = A0M;
                        strArr2[6] = "X2xGJjQ8zu6cU8Eo";
                        strArr2[4] = "AZj2zr3QMe0wQwV9kynIxRcnRDB4X";
                        viewGroup = (android.view.ViewGroup) (z2 ? viewGroup.getParent() : null);
                    }
                }
                com.facebook.ads.redexgen.core.YB.A0J(this.A03);
                android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(13);
                this.A03 = new com.facebook.ads.redexgen.core.C1280aw(this.A0C);
                this.A07.addView(this.A03, layoutParams2);
                ((com.facebook.ads.redexgen.core.C1280aw) this.A03).A05(A0L2, width);
                com.facebook.ads.redexgen.core.YB.A0K(this.A03);
                A01(true);
            }
            this.A02 = this.A03;
            A07();
            this.A0F.setVisibility(8);
            this.A0F.setImage(null, null);
            this.A09.setVisibility(8);
            this.A09.unsetNativeAd();
            ((com.facebook.ads.redexgen.core.C1019Rz) this.A09.getMediaViewVideoRendererApi()).A03();
            bringChildToFront(this.A03);
            this.A03.setVisibility(0);
            A0E(this.A03, A0L2);
        } else {
            boolean A0U = A0U(nativeAd);
            java.lang.String[] strArr3 = A0M;
            if (strArr3[3].length() != strArr3[7].length()) {
                throw new java.lang.RuntimeException();
            }
            A0M[5] = "QrlGDx1qLp0kN";
            if (A0U) {
                this.A0B = com.facebook.ads.redexgen.core.EnumC1015Rv.A05;
                this.A01 = ((com.facebook.ads.redexgen.core.S2) nativeAd.getNativeAdApi()).A01();
                A0L2.A16().A0F().AJt(com.facebook.ads.redexgen.core.M5.A0D);
                A0L2.A1n(this.A0J);
                this.A02 = this.A09.getMediaViewVideoRendererApi().getVideoView();
                A07();
                this.A0F.setVisibility(8);
                this.A0F.setImage(null, null);
                if (this.A03 != null) {
                    this.A03.setVisibility(8);
                    if (this.A03 instanceof com.facebook.ads.redexgen.core.C1280aw) {
                        ((com.facebook.ads.redexgen.core.C1280aw) this.A03).A04();
                    } else {
                        ((com.facebook.ads.redexgen.core.C7M) this.A03).setAdapter(null);
                    }
                }
                bringChildToFront(this.A09);
                com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer = this.A09;
                java.lang.String[] strArr4 = A0M;
                if (strArr4[2].charAt(31) != strArr4[0].charAt(31)) {
                    java.lang.String[] strArr5 = A0M;
                    strArr5[2] = "KRt7yuKunmEFowe58PEdTHnfFAzQvUNu";
                    strArr5[0] = "FpiuEPXAVB8biFGx18DJjcPDa6TrT1Ju";
                    mediaViewVideoRenderer.setNativeAd(nativeAd);
                    ((com.facebook.ads.redexgen.core.C1019Rz) this.A09.getMediaViewVideoRendererApi()).A04(nativeAd);
                    this.A09.setVisibility(0);
                } else {
                    java.lang.String[] strArr6 = A0M;
                    strArr6[6] = "rknJE6EzKshvoL3E";
                    strArr6[4] = "1VlRGSe6v9ZgAEzaXTE4MJVCDSD8V";
                    mediaViewVideoRenderer.setNativeAd(nativeAd);
                    ((com.facebook.ads.redexgen.core.C1019Rz) this.A09.getMediaViewVideoRendererApi()).A04(nativeAd);
                    this.A09.setVisibility(0);
                }
            } else if (nativeAd.getAdCoverImage() != null) {
                this.A0B = com.facebook.ads.redexgen.core.EnumC1015Rv.A03;
                A0L2.A16().A0F().AJt(com.facebook.ads.redexgen.core.M5.A0B);
                this.A02 = this.A0F.getBodyImageView();
                A07();
                this.A09.setVisibility(8);
                this.A09.unsetNativeAd();
                ((com.facebook.ads.redexgen.core.C1019Rz) this.A09.getMediaViewVideoRendererApi()).A03();
                if (this.A03 != null) {
                    this.A03.setVisibility(8);
                    if (this.A03 instanceof com.facebook.ads.redexgen.core.C1280aw) {
                        ((com.facebook.ads.redexgen.core.C1280aw) this.A03).A04();
                    } else {
                        ((com.facebook.ads.redexgen.core.C7M) this.A03).setAdapter(null);
                    }
                }
                bringChildToFront(this.A0F);
                this.A0F.setVisibility(0);
                new com.facebook.ads.redexgen.core.LM(this.A0F, this.A0C).A05(this.A07.getHeight(), this.A07.getWidth()).A06(new com.facebook.ads.redexgen.core.C1669hF(this, A0L2)).A07(A0L2.getAdCoverImage().getUrl());
                A0E(this.A0F, A0L2);
            }
        }
        A0Q(A0L2, false);
        A0M(A0L2);
        A0N(A0L2);
    }

    public final void A0X(com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi, boolean z) {
        com.facebook.ads.redexgen.core.C1636gi A16 = ((com.facebook.ads.redexgen.core.UK) nativeAdBaseApi).A16();
        com.facebook.ads.redexgen.core.C1636gi adObjectContext = this.A0C;
        adObjectContext.A0L(A16);
        A16.A0O(this);
        this.A0K = true;
        com.facebook.ads.redexgen.core.UK A0L2 = com.facebook.ads.redexgen.core.UK.A0L(nativeAdBaseApi);
        A0L2.A1Z(this.A07);
        this.A0F.setVisibility(8);
        this.A0F.setImage(null, null);
        this.A09.setVisibility(8);
        this.A09.unsetNativeAd();
        ((com.facebook.ads.redexgen.core.C1019Rz) this.A09.getMediaViewVideoRendererApi()).A03();
        if (this.A03 != null) {
            this.A03.setVisibility(8);
            if (this.A03 instanceof com.facebook.ads.redexgen.core.C1280aw) {
                ((com.facebook.ads.redexgen.core.C1280aw) this.A03).A04();
            } else {
                ((com.facebook.ads.redexgen.core.C7M) this.A03).setAdapter(null);
            }
        }
        this.A04.setVisibility(0);
        bringChildToFront(this.A04);
        this.A02 = this.A04;
        com.facebook.ads.redexgen.core.C1098Vb adIcon = A0L2.getAdIcon();
        if (adIcon != null) {
            com.facebook.ads.redexgen.core.C1042Sx A14 = A0L2.A14();
            if (A0M[1].charAt(7) == 'A') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0M;
            strArr[3] = "8vonm0Gh";
            strArr[7] = "EfYx5Mmt";
            android.graphics.Bitmap A0N2 = A14.A0N(adIcon.getUrl());
            if (A0N2 != null) {
                this.A04.setImageBitmap(A0N2);
                if (z) {
                    this.A07.post(new com.facebook.ads.redexgen.core.C1675hL(this, A0L2));
                }
            } else {
                A0R(A0L2, z, adIcon);
            }
        } else {
            com.facebook.ads.redexgen.core.InterfaceC1066Tv A1A = A0L2.A1A();
            com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.NATIVE_AD_IS_NOT_LOADED;
            A16.A0F().A3N(A0L2.A11(), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            if (A1A != null) {
                A1A.ADp(com.facebook.ads.redexgen.core.C1108Vm.A00(adErrorType));
            }
            android.util.Log.e(A05(46, 17, 121), adErrorType.getDefaultErrorMessage());
            if (nativeAdBaseApi.isAdLoaded()) {
                com.facebook.ads.redexgen.core.C1636gi adObjectContext2 = this.A0C;
                adObjectContext2.A08().ABC(A05(258, 3, 44), com.facebook.ads.redexgen.core.AbstractC1048Td.A0W, new com.facebook.ads.redexgen.core.C1049Te(A05(192, 23, 42)));
            }
        }
        A0E(this.A04, A0L2);
        if (A0L2.A1s() && !A0L2.A1p()) {
            A0Q(A0L2, true);
        }
    }

    public final /* synthetic */ void A0Y(com.facebook.ads.redexgen.core.UK uk, android.view.View view) {
        this.A0C.A0F().AAy(com.facebook.ads.redexgen.core.EnumC1244aM.A05.name().toLowerCase(java.util.Locale.US));
        uk.A1O();
    }

    public final /* synthetic */ void A0Z(com.facebook.ads.redexgen.core.UK uk, android.view.View view) {
        if (this.A0D != null && uk.A17() != null) {
            if (this.A0D.A04()) {
                this.A0C.A0F().ABb();
                uk.A17().A04();
            } else {
                this.A0C.A0F().ABc();
                uk.A17().onClick(view);
            }
        }
    }

    public final /* synthetic */ void A0a(com.facebook.ads.redexgen.core.UK uk, android.view.View view) {
        if (uk.A17() != null) {
            if (this.A00 < uk.A0z()) {
                this.A0C.A0F().ABZ();
                uk.A17().onClick(view);
            } else {
                this.A0C.A0F().ABY();
                uk.A17().A04();
            }
            this.A00++;
        }
    }

    public final boolean A0b() {
        if (this.A03 != null) {
            android.view.View view = this.A03;
            if (A0M[5].length() != 13) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0M;
            strArr[3] = "f43XNCk8";
            strArr[7] = "DdRxJSTL";
            if (view.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.T4
    public final com.facebook.ads.redexgen.core.C1636gi A6m() {
        return this.A0C;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1198Zc
    public final void ACr() {
        A09();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1198Zc
    public final void ACs() {
        A08();
    }

    @Override // com.facebook.ads.redexgen.core.C1006Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(android.view.View view) {
        if (view != this.A03 && view != this.A09 && view != this.A0F) {
            android.widget.ImageView imageView = this.A04;
            if (A0M[5].length() != 13) {
                throw new java.lang.RuntimeException();
            }
            A0M[1] = "R8dYcckG0onv7yQggjKFRkmHXZbq9UJh";
            if (view != imageView) {
                return;
            }
        }
        this.A0A.bringChildToFront(view);
        if (this.A0I != null) {
            this.A0A.bringChildToFront(this.A0I);
        }
        if (this.A06 != null) {
            this.A0A.bringChildToFront(this.A06);
        }
        if (this.A0G != null) {
            this.A0A.bringChildToFront(this.A0G);
        }
        if (this.A05 != null) {
            this.A0A.bringChildToFront(this.A05);
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void destroy() {
        this.A09.pause(false);
        this.A09.getMediaViewVideoRendererApi().destroy();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final com.facebook.ads.internal.api.AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final android.view.View getAdContentsView() {
        return this.A02;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaHeight() {
        if (this.A0F.getVisibility() == 0) {
            return this.A0F.getImageHeight();
        }
        if (this.A09.getVisibility() == 0) {
            return this.A09.getMediaViewVideoRendererApi().getVideoView().getHeight();
        }
        if (this.A07.getVisibility() == 0) {
            return this.A07.getHeight();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (r3.getVisibility() == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        return r4.A09.getMediaViewVideoRendererApi().getVideoView().getWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (r4.A07.getVisibility() != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        return r4.A07.getWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r3.getVisibility() == 0) goto L14;
     */
    @Override // com.facebook.ads.internal.api.MediaViewApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getMediaWidth() {
        if (this.A0F.getVisibility() == 0) {
            int imageWidth = this.A0F.getImageWidth();
            java.lang.String[] strArr = A0M;
            if (strArr[2].charAt(31) != strArr[0].charAt(31)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0M;
            strArr2[6] = "us0p5hBNoGIfish2";
            strArr2[4] = "DFvDCw92fILzmemlu9XfPwpsPQRiq";
            return imageWidth;
        }
        com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer = this.A09;
        if (A0M[1].charAt(7) != 'A') {
            java.lang.String[] strArr3 = A0M;
            strArr3[3] = "7zc9sXuG";
            strArr3[7] = "ncWuDUJK";
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getVideoDuration() {
        this.A0C.A0F().ABm();
        return this.A01;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void initialize(com.facebook.ads.internal.api.AdViewConstructorParams adViewConstructorParams, com.facebook.ads.MediaView mediaView) {
        android.content.Context context = adViewConstructorParams.getContext();
        if (context instanceof com.facebook.ads.redexgen.core.C1636gi) {
            this.A0C = (com.facebook.ads.redexgen.core.C1636gi) context;
        } else {
            this.A0C = com.facebook.ads.redexgen.core.C1009Rp.A03(context);
        }
        this.A0C.A0O(this);
        switch (adViewConstructorParams.getInitializationType()) {
            case 0:
                A0J(this.A0C, mediaView);
                break;
            case 1:
                A0I(this.A0C, adViewConstructorParams.getAttributeSet(), mediaView);
                break;
            case 2:
                com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A0C;
                android.util.AttributeSet attributeSet = adViewConstructorParams.getAttributeSet();
                if (A0M[1].charAt(7) == 'A') {
                    throw new java.lang.RuntimeException();
                }
                A0M[1] = "4tObUcmoIw93Quo4uXvWt9YCbUPkknut";
                A0H(c1636gi, attributeSet, adViewConstructorParams.getDefStyleAttr(), mediaView);
                break;
            case 3:
                A0G(this.A0C, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), adViewConstructorParams.getDefStyleRes(), mediaView);
                break;
            default:
                throw new java.lang.IllegalArgumentException(A05(155, 37, 26));
        }
        A01(true);
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final boolean isVideoContent() {
        this.A0C.A0F().ABl();
        return this.A0B == com.facebook.ads.redexgen.core.EnumC1015Rv.A05;
    }

    @Override // com.facebook.ads.redexgen.core.C1006Rm, com.facebook.ads.internal.api.AdComponentViewApi
    public final void onAttachedToView(com.facebook.ads.internal.api.AdComponentView adComponentView, com.facebook.ads.internal.api.AdComponentViewParentApi adComponentViewParentApi) {
        super.onAttachedToView(adComponentView, adComponentViewParentApi);
        this.A0A = adComponentViewParentApi;
    }

    @Override // com.facebook.ads.redexgen.core.C1006Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A09();
    }

    @Override // com.facebook.ads.redexgen.core.C1006Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A08();
    }

    @Override // com.facebook.ads.redexgen.core.C1006Rm, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            A09();
        } else {
            A08();
        }
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(java.lang.Throwable th) {
        int width = this.A07.getWidth();
        int currentHeight = this.A07.getHeight();
        if (width > 0 && currentHeight > 0) {
            this.A07.repair(th);
            this.A07.getLayoutParams().width = width;
            this.A07.getLayoutParams().height = currentHeight;
            this.A07.setBackgroundColor(-3355444);
            return;
        }
        this.A07.repair(th);
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setListener(com.facebook.ads.MediaViewListener mediaViewListener) {
        this.A08 = mediaViewListener;
        if (mediaViewListener == null) {
            ((com.facebook.ads.redexgen.core.C1019Rz) this.A09.getMediaViewVideoRendererApi()).A07(null);
        } else {
            ((com.facebook.ads.redexgen.core.C1019Rz) this.A09.getMediaViewVideoRendererApi()).A07(new com.facebook.ads.redexgen.core.C1668hE(this, mediaViewListener));
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setVideoRenderer(com.facebook.ads.MediaViewVideoRenderer mediaViewVideoRenderer) {
        if (!this.A0K) {
            if (this.A09 != null) {
                this.A07.removeView(this.A09);
                this.A09.getMediaViewVideoRendererApi().destroy();
            }
            ((com.facebook.ads.redexgen.core.C1019Rz) mediaViewVideoRenderer.getMediaViewVideoRendererApi()).A05(this.A0C.A0A());
            mediaViewVideoRenderer.setVisibility(8);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            ((com.facebook.ads.redexgen.core.C1666hC) this.A07.getMediaViewApi()).A0D(mediaViewVideoRenderer, layoutParams);
            this.A09 = mediaViewVideoRenderer;
            this.A0J = !(this.A09 instanceof com.facebook.ads.DefaultMediaViewVideoRenderer);
            mediaViewVideoRenderer.setId(com.facebook.ads.redexgen.core.YB.A00());
            return;
        }
        throw new java.lang.IllegalStateException(A05(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 43, 70));
    }
}
