package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1313bT extends android.widget.RelativeLayout {
    public static byte[] A0E;
    public static java.lang.String[] A0F = {"ZXfERob4xoBH3IcU8XCjlL1hD69lrIyA", "mQeX6yhTUvQ4pK8ACBM6nUVZWHaQDR", "t18Mgh0fo46erZhvjKlVSbwf5heaPhmM", "S6rERx5ctFRQ2KVL", "3Fwf", "FlQfbFZAJ1ylax3KsERNgz88EmHf", "VMbmryNa1vDSool6GPHICtScLmJABdX", "KdX0dASRYEcEQR8bSkkNlsR1046Pig"};
    public static final int A0G;
    public android.animation.AnimatorSet A00;
    public android.animation.AnimatorSet A01;
    public android.animation.AnimatorSet A02;
    public android.widget.LinearLayout A03;
    public com.facebook.ads.redexgen.core.C1270am A04;
    public com.facebook.ads.redexgen.core.M3 A05;
    public final int A06;
    public final int A07;
    public final android.view.View A08;
    public final com.facebook.ads.redexgen.core.AbstractC0888Mt A09;
    public final com.facebook.ads.redexgen.core.C0938Os A0A;
    public final com.facebook.ads.redexgen.core.C1636gi A0B;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A0C;
    public final com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A0D;

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A08() {
        A0E = new byte[]{77};
    }

    static {
        A08();
        A0G = com.facebook.ads.redexgen.core.XV.A02;
    }

    public C1313bT(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, int i, com.facebook.ads.redexgen.core.AbstractC0888Mt abstractC0888Mt, com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr, android.view.View view) {
        super(c1636gi);
        this.A0B = c1636gi;
        this.A0C = interfaceC1177Yh;
        this.A09 = abstractC0888Mt;
        this.A0D = viewOnClickListenerC0834Kr;
        this.A08 = view;
        if (getResources().getConfiguration().orientation == 1) {
            this.A02 = new android.animation.AnimatorSet();
            this.A01 = new android.animation.AnimatorSet();
            this.A00 = new android.animation.AnimatorSet();
        }
        int i2 = (int) (i * com.facebook.ads.redexgen.core.XX.A02);
        this.A07 = i2;
        this.A06 = i2 - A0G;
        this.A0A = A02();
    }

    private android.widget.LinearLayout A00() {
        com.facebook.ads.redexgen.core.M3 m3;
        this.A03 = new android.widget.LinearLayout(this.A0B);
        this.A03.setOrientation(1);
        this.A03.addView(A01());
        com.facebook.ads.redexgen.core.C0836Kt c0836Kt = new com.facebook.ads.redexgen.core.C0836Kt(this);
        if (com.facebook.ads.redexgen.core.AbstractC1087Uq.A02(this.A0B) || this.A0B.A0E() == null) {
            m3 = new com.facebook.ads.redexgen.core.M3(this.A0B, c0836Kt);
        } else {
            m3 = new com.facebook.ads.redexgen.core.M3(this.A0B, this.A0B.A0E(), c0836Kt);
        }
        this.A05 = m3;
        this.A03.addView(this.A05, new android.widget.LinearLayout.LayoutParams(-1, -1));
        this.A05.loadUrl(((com.facebook.ads.redexgen.core.AnonymousClass85) this.A09).A0M().toString());
        return this.A03;
    }

    private android.widget.LinearLayout A01() {
        this.A04 = new com.facebook.ads.redexgen.core.C1270am(this.A0B);
        this.A04.setGravity(17);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(com.facebook.ads.redexgen.core.XV.A0G, 0, com.facebook.ads.redexgen.core.XV.A0G, 0);
        this.A04.setLayoutParams(layoutParams);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.A0B);
        linearLayout.addView(this.A04);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(com.facebook.ads.redexgen.core.XV.A0U, com.facebook.ads.redexgen.core.XV.A0U, com.facebook.ads.redexgen.core.XV.A0U, com.facebook.ads.redexgen.core.XV.A0U);
        linearLayout.setLayoutParams(layoutParams2);
        return linearLayout;
    }

    private com.facebook.ads.redexgen.core.C0938Os A02() {
        com.facebook.ads.redexgen.core.C0938Os c0938Os = new com.facebook.ads.redexgen.core.C0938Os(this.A0B);
        c0938Os.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        c0938Os.setRadius(40.0f);
        c0938Os.addView(A00());
        c0938Os.setTranslationY(getResources().getDisplayMetrics().heightPixels);
        android.view.View view = new android.view.View(this.A0B);
        view.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        view.setBackgroundColor(0);
        view.setOnClickListener(new com.facebook.ads.redexgen.core.ViewOnClickListenerC1312bS(this));
        c0938Os.addView(view);
        return c0938Os;
    }

    private void A07() {
        if (this.A02 != null) {
            this.A02.cancel();
            this.A02 = null;
        }
        if (this.A01 != null) {
            this.A01.cancel();
            this.A01 = null;
        }
        if (this.A00 != null) {
            this.A00.cancel();
            this.A00 = null;
        }
    }

    private final void A09() {
        this.A08.setTranslationY(0.0f);
    }

    public final void A0A() {
        int i = getResources().getDisplayMetrics().heightPixels;
        com.facebook.ads.redexgen.core.C0938Os c0938Os = this.A0A;
        int screenHeight = this.A07;
        java.lang.String A06 = A06(0, 1, 105);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(c0938Os, A06, i - screenHeight);
        ofFloat.setDuration(300L);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.A08, A06, -this.A07);
        ofFloat2.setDuration(300L);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(this.A0A, A06, i - this.A06);
        ofFloat3.setDuration(300L);
        android.animation.ObjectAnimator adDetailsViewDown = android.animation.ObjectAnimator.ofFloat(this.A08, A06, -this.A06);
        adDetailsViewDown.setDuration(300L);
        if (this.A02 != null && this.A01 != null && this.A00 != null) {
            this.A02.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            this.A02.playTogether(ofFloat, ofFloat2);
            this.A01.playTogether(ofFloat3, adDetailsViewDown);
            this.A00.playSequentially(this.A02, this.A01);
            this.A00.start();
        }
    }

    public final void A0B() {
        A07();
        this.A05.destroy();
        this.A0A.setVisibility(8);
        A09();
    }

    public final void A0C() {
        if (this.A02 != null) {
            this.A02.pause();
        }
        if (this.A01 != null) {
            this.A01.pause();
        }
        if (this.A00 != null) {
            this.A00.pause();
        }
    }

    public final void A0D(int i) {
        if (i == 2) {
            this.A0A.setVisibility(8);
            this.A08.setTranslationY(0.0f);
            if (A0F[2].charAt(16) != 'j') {
                throw new java.lang.RuntimeException();
            }
            A0F[3] = "0Dd01EimJB8SQQk0dQvdznLslJ";
            A07();
            A09();
            return;
        }
        if (i == 1) {
            int i2 = getResources().getDisplayMetrics().heightPixels;
            this.A0A.setVisibility(0);
            com.facebook.ads.redexgen.core.C0938Os c0938Os = this.A0A;
            int screenHeight = this.A06;
            c0938Os.setTranslationY(i2 - screenHeight);
            android.view.View view = this.A08;
            int screenHeight2 = this.A06;
            view.setTranslationY(-screenHeight2);
        }
    }

    public com.facebook.ads.redexgen.core.C0938Os getBrowserPeekView() {
        return this.A0A;
    }
}
