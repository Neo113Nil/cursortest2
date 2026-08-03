package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.eq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1520eq extends android.widget.RelativeLayout {
    public static java.lang.String[] A04 = {"Ym3c0mHmt8I3OfABPCOx9UJ2Q16UuduY", "K4DkQJV", "KARr27mhou56jkSxhuic5Eo8", "doL6IsbVcBXoE3lEPdAb4lspmNlkYQBg", "ZiamaIcezCYLNnFM0CzM2w39hefukKsr", "QAAEQWAERntefxGdirzkY0W9ygCVb18Z", "ecvamyNjiJSZyZ2FY2suHBqgS12IICXX", "BDk4Rb0w5P1ojifCZQT7pVNvZTakDsaU"};
    public static final int A05 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
    public int A00;
    public com.facebook.ads.redexgen.core.C3S A01;
    public java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC1519ep> A02;
    public final com.facebook.ads.redexgen.core.InterfaceC1576fk A03;

    public C1520eq(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.InterfaceC1576fk interfaceC1576fk) {
        super(c1636gi);
        this.A00 = 0;
        this.A03 = interfaceC1576fk;
        com.facebook.ads.redexgen.core.YB.A0J((android.view.View) this.A03);
        addView(this.A03.getView(), new android.widget.RelativeLayout.LayoutParams(-1, -1));
    }

    private void A00(android.animation.AnimatorSet animatorSet, final int i, final boolean z) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.facebook.ads.redexgen.X.em
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.facebook.ads.redexgen.core.C1520eq.this.A04(z, i, valueAnimator);
            }
        });
        animatorSet.playTogether(ofFloat);
    }

    public final void A01(android.animation.AnimatorSet animatorSet, boolean z) {
        if (z) {
            this.A03.getView().setClipToOutline(true);
            com.facebook.ads.redexgen.core.C1517en c1517en = new com.facebook.ads.redexgen.core.C1517en(this);
            this.A03.getView().setOutlineProvider(c1517en);
            if (this.A01 != null) {
                this.A01.setClipToOutline(true);
                this.A01.setOutlineProvider(c1517en);
            }
            A00(animatorSet, A05, true);
            return;
        }
        this.A03.getView().setClipToOutline(false);
        this.A03.getView().setOutlineProvider(android.view.ViewOutlineProvider.BACKGROUND);
        if (this.A01 != null) {
            this.A01.setClipToOutline(false);
            this.A01.setOutlineProvider(android.view.ViewOutlineProvider.BACKGROUND);
        }
        A00(animatorSet, this.A00, false);
    }

    public final void A02(com.facebook.ads.redexgen.core.ED ed) {
        addView(ed, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.A01 = (com.facebook.ads.redexgen.core.C3S) ed;
    }

    public final void A03(com.facebook.ads.redexgen.core.ED ed) {
        com.facebook.ads.redexgen.core.YB.A0J(ed);
        this.A01 = null;
    }

    public final /* synthetic */ void A04(boolean z, int i, android.animation.ValueAnimator valueAnimator) {
        float curInterpolatedTime = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        if (!z) {
            curInterpolatedTime = 1.0f - curInterpolatedTime;
        }
        float interpolatedTime = i;
        this.A00 = (int) (interpolatedTime * curInterpolatedTime);
        requestLayout();
    }

    public final boolean A05() {
        return this.A03.A9r();
    }

    public int getCurrentPosition() {
        return this.A03.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ((android.view.View) this.A03).layout(this.A00, this.A00, getWidth() - this.A00, getHeight() - this.A00);
        if (this.A01 != null) {
            this.A01.layout(this.A00, this.A00, getWidth() - this.A00, getHeight() - this.A00);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z = false;
        int heightSpecSize = this.A03.getVideoWidth() + (this.A00 * 2);
        int widthSpecMode = this.A03.getVideoHeight() + (this.A00 * 2);
        int width = getDefaultSize(heightSpecSize, i);
        int height = getDefaultSize(widthSpecMode, i2);
        if (heightSpecSize > 0 && widthSpecMode > 0) {
            z = true;
            int mode = android.view.View.MeasureSpec.getMode(i);
            int heightSpecMode = android.view.View.MeasureSpec.getSize(i);
            int widthSpecSize = android.view.View.MeasureSpec.getMode(i2);
            int mVideoHeight = android.view.View.MeasureSpec.getSize(i2);
            if (mode != 1073741824 || widthSpecSize != 1073741824) {
                if (mode == 1073741824) {
                    width = heightSpecMode;
                    height = (width * widthSpecMode) / heightSpecSize;
                    if (widthSpecSize == Integer.MIN_VALUE && height > mVideoHeight) {
                        height = mVideoHeight;
                    }
                } else if (widthSpecSize == 1073741824) {
                    height = mVideoHeight;
                    width = (height * heightSpecSize) / widthSpecMode;
                    if (mode == Integer.MIN_VALUE && width > heightSpecMode) {
                        width = heightSpecMode;
                    }
                } else {
                    width = heightSpecSize;
                    height = widthSpecMode;
                    if (widthSpecSize == Integer.MIN_VALUE && height > mVideoHeight) {
                        height = mVideoHeight;
                        width = (height * heightSpecSize) / widthSpecMode;
                    }
                    if (mode == Integer.MIN_VALUE && width > heightSpecMode) {
                        width = heightSpecMode;
                        height = (width * widthSpecMode) / heightSpecSize;
                    }
                }
            } else {
                width = heightSpecMode;
                height = mVideoHeight;
                int mVideoWidth = heightSpecSize * height;
                if (mVideoWidth < width * widthSpecMode) {
                    int width2 = height * heightSpecSize;
                    java.lang.String[] strArr = A04;
                    java.lang.String str = strArr[2];
                    java.lang.String str2 = strArr[1];
                    int mVideoWidth2 = str.length();
                    if (mVideoWidth2 == str2.length()) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A04;
                    strArr2[5] = "U4zbj2Wm0uAraatZAyMG0dkAaN2sbGyV";
                    strArr2[7] = "NaQeXa1xIolrwrGsNa3PifVvRhjqFXGF";
                    width = width2 / widthSpecMode;
                } else {
                    int mVideoWidth3 = heightSpecSize * height;
                    if (mVideoWidth3 > width * widthSpecMode) {
                        height = (width * widthSpecMode) / heightSpecSize;
                    }
                }
            }
        }
        setMeasuredDimension(width, height);
        if (!z || this.A02 == null) {
            return;
        }
        java.lang.ref.WeakReference<com.facebook.ads.redexgen.core.InterfaceC1519ep> weakReference = this.A02;
        int mVideoWidth4 = A04[6].charAt(8);
        if (mVideoWidth4 != 105) {
            throw new java.lang.RuntimeException();
        }
        A04[3] = "u6I59svdNPk3v5MrivI4HijRJO25VXOb";
        if (weakReference.get() != null) {
            this.A02.get().AGT();
        }
    }

    public void setRoundedCornersVideoStyle(float f) {
        this.A03.getView().setClipToOutline(true);
        this.A03.getView().setOutlineProvider(new com.facebook.ads.redexgen.core.C1518eo(this, f));
    }

    public void setViewImplInflationListener(com.facebook.ads.redexgen.core.InterfaceC1519ep interfaceC1519ep) {
        this.A02 = new java.lang.ref.WeakReference<>(interfaceC1519ep);
    }
}
