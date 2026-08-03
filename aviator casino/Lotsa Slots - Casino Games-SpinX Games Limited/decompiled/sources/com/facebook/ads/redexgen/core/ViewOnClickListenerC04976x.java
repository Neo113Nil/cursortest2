package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.6x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class ViewOnClickListenerC04976x extends com.facebook.ads.redexgen.core.PZ implements android.view.View.OnClickListener, android.view.View.OnTouchListener {
    public static int A09;
    public static int A0A;
    public static int A0B;
    public static int A0C;
    public static int A0D;
    public static byte[] A0E;
    public static java.lang.String[] A0F = {"KCgVVt0Ap7UjFwdZVPwtujaSBd4wOGh", "pwlBzpehZvT0dx09nfsqJf3x9Ohs0th5", "vfZ4vr2K2y2ARDvqPAWs6IAB7KSzcYkK", "bFCbuQIkoS9nYpv83ewRiG67IWanvmGf", "GLbAB0S4L", "VAKU94yPMVJGstkAs9GlkzAfXtUrDcQU", "ELeO8zIeBErz", "BBoYkiBeDILGrcaYIrD29JxsdoJmJVn4"};
    public int A00;
    public int A01;
    public com.facebook.ads.redexgen.core.VI A02;
    public boolean A03;
    public final int A04;
    public final android.os.Handler A05;
    public final android.view.inputmethod.InputMethodManager A06;
    public final java.lang.Runnable A07;
    public final java.lang.String A08;

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0F[6].length() != 12) {
                throw new java.lang.RuntimeException();
            }
            A0F[6] = "rGUQ6sPwqM0P";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
            i4++;
        }
    }

    public static void A09() {
        A0E = new byte[]{94, 81, 84, 94, 86, 98, 78, 82, 72, 79, 94, 88, 36, 40, 42, 105, 33, 38, 36, 34, 37, 40, 40, 44, 105, 38, 35, 52, 105, 37, 38, 41, 41, 34, 53, 105, 36, 43, 46, 36, 44, 34, 35, 118, 122, 120, 59, 115, 116, 118, 112, 119, 122, 122, 126, 59, 116, 113, 102, 59, 124, 123, 97, 112, 103, 102, 97, 124, 97, 124, 116, 121, 59, 118, 121, 124, 118, 126, 112, 113, 2, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.FF, 79, 7, 0, 2, 4, 3, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SO, 10, 79, 0, 5, com.google.common.base.Ascii.DC2, 79, com.google.common.base.Ascii.SI, 0, com.google.common.base.Ascii.NAK, 8, com.google.common.base.Ascii.ETB, 4, 79, 0, 5, 62, 2, com.google.common.base.Ascii.CR, 8, 2, 10, 53, 50, 44, 41, 40, 3, 49, 57, 40, 52, 51, 56, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.EM, 52, 9, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SI, 52, 8, 7, 2, 8, 0, 52, 2, 10, 9, 52, 8, 7, 2, 8, 0, com.google.common.base.Ascii.CAN, 81, 87, 65, 86, 123, 70, 81, 66, 66, 65, 86, 65, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 123, 71, 72, 77, 71, 79, 123, 77, 69, 70, 123, 80, 93, 84, 77, 74, 67};
    }

    static {
        A09();
        A0B = 450;
        A09 = 500;
        A0A = 50;
        A0D = 450;
        A0C = androidx.compose.material.TextFieldImplKt.AnimationDuration;
    }

    public ViewOnClickListenerC04976x(com.facebook.ads.redexgen.core.C0998Re c0998Re, com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, java.lang.String str, int i) {
        super(c0998Re, c1636gi, va, interfaceC1177Yh, false);
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = false;
        this.A07 = new com.facebook.ads.redexgen.core.RunnableC1180Yk(this);
        this.A08 = str;
        this.A05 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A06 = (android.view.inputmethod.InputMethodManager) c1636gi.getSystemService(A05(112, 12, 70));
        this.A04 = i;
    }

    public static /* synthetic */ int A02(com.facebook.ads.redexgen.core.ViewOnClickListenerC04976x viewOnClickListenerC04976x) {
        int i = viewOnClickListenerC04976x.A00;
        viewOnClickListenerC04976x.A00 = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        com.facebook.ads.redexgen.core.YB.A0N(this, androidx.media3.common.C.ENCODING_PCM_32BIT_BIG_ENDIAN);
    }

    private void A07() {
        if (this.A08 == null) {
            return;
        }
        if (com.facebook.ads.internal.protocol.AdPlacementType.BANNER.name().equals(this.A08)) {
            super.A08.A0E(A05(12, 31, 93), null);
            return;
        }
        if (com.facebook.ads.internal.protocol.AdPlacementType.NATIVE.name().equals(this.A08)) {
            super.A08.A0E(A05(80, 32, 123), null);
        } else if (com.facebook.ads.internal.protocol.AdPlacementType.INTERSTITIAL.name().equals(this.A08)) {
            super.A08.A0E(A05(43, 37, 15), null);
        } else {
            if (!com.facebook.ads.internal.protocol.AdPlacementType.REWARDED_VIDEO.name().equals(this.A08)) {
                return;
            }
            super.A08.A0E(com.facebook.ads.redexgen.core.EnumC1529ez.A04.A03(), null);
        }
    }

    private void A08() {
        com.facebook.ads.redexgen.core.YB.A0N(this, 0);
    }

    public static /* synthetic */ boolean A0B(android.view.View view, android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.PZ
    public final com.facebook.ads.redexgen.core.InterfaceC1274aq A0F() {
        return new com.facebook.ads.redexgen.core.C0949Pd(this);
    }

    @Override // com.facebook.ads.redexgen.core.PZ
    public final void A0G() {
        com.facebook.ads.redexgen.core.YB.A0N(this, androidx.media3.common.C.ENCODING_PCM_32BIT_BIG_ENDIAN);
        setPadding(getResources().getConfiguration().orientation);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{A0A, A0A, A0A, A0A, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(-1);
        super.A07.setBackground(gradientDrawable);
        super.A07.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.facebook.ads.redexgen.X.Yj
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return com.facebook.ads.redexgen.core.ViewOnClickListenerC04976x.A0B(view, motionEvent);
            }
        });
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        addView(super.A07, layoutParams);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, super.A07.getId());
        layoutParams2.addRule(12);
        this.A0E.setBackgroundColor(-1);
        addView(this.A0E, layoutParams2);
        this.A0E.setOnTouchListener(this);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-1, (int) (com.facebook.ads.redexgen.core.PZ.A0I * com.facebook.ads.redexgen.core.XX.A02));
        layoutParams3.addRule(3, super.A07.getId());
        this.A0C.setProgress(0);
        addView(this.A0C, layoutParams3);
        A06();
        this.A0B.A45(this, new android.widget.RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.core.PZ
    public final void A0H() {
        A08();
        super.A08.A05().overridePendingTransition(0, 0);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, android.content.res.Resources.getSystem().getDisplayMetrics().heightPixels);
        translateAnimation.setDuration(A09);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new com.facebook.ads.redexgen.core.AnimationAnimationListenerC1182Ym(this));
        startAnimation(translateAnimation);
    }

    @Override // com.facebook.ads.redexgen.core.PZ
    public final void A0I(java.lang.String str) {
        if (this.A04 > 0 && !this.A03) {
            this.A03 = true;
            this.A05.removeCallbacksAndMessages(null);
            java.util.Map<java.lang.String, java.lang.String> A05 = new com.facebook.ads.redexgen.core.C1293b9().A03(null).A02(null).A05();
            A05.put(A05(0, 12, 39), str);
            if (this.A02 != null) {
                this.A02.A04(com.facebook.ads.redexgen.core.VH.A0J, A05);
            }
            A07();
            this.A0A.ABM(super.A04, A05);
            if (com.facebook.ads.redexgen.core.C1086Up.A2U(this.A09)) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put(com.facebook.ads.redexgen.core.AbstractC1840kH.A04, java.lang.Boolean.TRUE.toString());
                hashMap.put(com.facebook.ads.redexgen.core.AbstractC1840kH.A05, java.lang.Boolean.TRUE.toString());
                hashMap.put(com.facebook.ads.redexgen.core.AbstractC1840kH.A06, java.lang.Boolean.TRUE.toString());
                this.A0A.ABn(super.A04, hashMap);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.PZ, com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void AAu(android.content.Intent intent, android.os.Bundle bundle, com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        super.AAu(intent, bundle, c0998Re);
        this.A02 = new com.facebook.ads.redexgen.core.VI(super.A04, this.A0A);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A08();
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, android.content.res.Resources.getSystem().getDisplayMetrics().heightPixels, 0.0f);
        translateAnimation.setDuration(A0B);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new com.facebook.ads.redexgen.core.AnimationAnimationListenerC1181Yl(this));
        startAnimation(translateAnimation);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            A0H();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setPadding(configuration.orientation);
    }

    @Override // com.facebook.ads.redexgen.core.PZ, com.facebook.ads.redexgen.core.InterfaceC1178Yi
    public final void onDestroy() {
        super.onDestroy();
        this.A05.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
                if (this.A06 == null) {
                    return false;
                }
                android.view.inputmethod.InputMethodManager inputMethodManager = this.A06;
                if (A0F[1].charAt(4) != 'z') {
                    throw new java.lang.RuntimeException();
                }
                A0F[6] = "wSSlTu5XSXtb";
                if (!inputMethodManager.isAcceptingText()) {
                    return false;
                }
                A0I(A05(154, 30, 62));
                return false;
            case 1:
                this.A01++;
                if (this.A01 < 5) {
                    return false;
                }
                A0I(A05(124, 30, 113));
                return false;
            default:
                return false;
        }
    }

    private void setPadding(int i) {
        if (i == 2) {
            setPadding(0, A0C, 0, 0);
        } else {
            setPadding(0, A0D, 0, 0);
        }
    }
}
