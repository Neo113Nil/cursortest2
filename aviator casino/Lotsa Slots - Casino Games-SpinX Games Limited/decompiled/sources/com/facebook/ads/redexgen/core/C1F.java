package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.1F, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C1F extends com.facebook.ads.redexgen.core.C7M implements android.view.View.OnTouchListener {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"ySOBxSJ7y2GELC2cR9WRTK6hAhZYocJS", "8dRmuXbfMCidMDGiSpjEcbCkPgx3mm8G", "li61zS9WhZTBvI47lvKtLPcqAcNkij1S", "lH5BfkXLxOyhi", "q0Ccq4Fbg7VKO8sxkIKNcZgKtjQ1fZ14", "ep7ggC7RKpg7Ol5cXUmXF8JhcfOkgUip", "fpgtpMAGWAVh3a0xLZP1kWTjCGk3An57", "s5"};
    public int A00;

    @javax.annotation.Nullable
    public com.facebook.ads.redexgen.core.C1706hr A01;
    public com.facebook.ads.redexgen.core.InterfaceC1471e2 A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public final int A06;

    public static java.lang.String A09(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{-4, com.google.common.base.Ascii.ETB, 10, com.google.common.base.Ascii.EM, -5, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.FF, 34, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.ESC, -1, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SO, 32, -55, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.NAK, 34, -55, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FS, -55, -11, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SO, 10, com.google.common.base.Ascii.ESC, -11, 10, 34, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.GS, -10, 10, com.google.common.base.Ascii.ETB, 10, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.ESC};
    }

    static {
        A0A();
    }

    public C1F(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        super(c1636gi);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A05();
        setOnTouchListener(this);
    }

    public C1F(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.util.AttributeSet attributeSet) {
        super(c1636gi, attributeSet);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A05();
        setOnTouchListener(this);
    }

    public C1F(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.util.AttributeSet attributeSet, int i) {
        super(c1636gi, attributeSet, i);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A05();
        setOnTouchListener(this);
    }

    private int A05() {
        return ((int) getContext().getResources().getDisplayMetrics().density) * 10;
    }

    private int A06(int i) {
        int delta = this.A00 - i;
        int A8o = this.A02.A8o(delta);
        int scrollX = this.A06;
        if (delta > scrollX) {
            int scrollX2 = this.A05;
            return A08(scrollX2, A8o);
        }
        int scrollX3 = this.A06;
        if (delta < (-scrollX3)) {
            int i2 = this.A05;
            if (A08[6].charAt(24) != 67) {
                throw new java.lang.RuntimeException();
            }
            A08[7] = "Vh4";
            int scrollX4 = A07(i2, A8o);
            return scrollX4;
        }
        int scrollX5 = this.A05;
        return scrollX5;
    }

    private int A07(int i, int i2) {
        return java.lang.Math.max(i - i2, 0);
    }

    private int A08(int i, int i2) {
        return java.lang.Math.min(i + i2, getItemCount() - 1);
    }

    public void A20(int i, boolean z) {
        if (getAdapter() == null) {
            return;
        }
        this.A05 = i;
        if (z) {
            A1Y(i);
        } else {
            A1X(i);
        }
    }

    public int getCurrentPosition() {
        return this.A05;
    }

    private int getItemCount() {
        if (getAdapter() == null) {
            return 0;
        }
        return getAdapter().A0B();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 6 && actionMasked != 3) {
            int action = A08[7].length();
            if (action == 18) {
                throw new java.lang.RuntimeException();
            }
            A08[4] = "tIjSEqZVzrzr7cEE0p57iZetopRejSVd";
            if (actionMasked != 4) {
                if (actionMasked == 0 || actionMasked == 5 || (this.A03 && actionMasked == 2)) {
                    this.A00 = rawX;
                    if (this.A03) {
                        this.A03 = false;
                    }
                    this.A04 = true;
                }
                return false;
            }
        }
        if (this.A04) {
            int rawX2 = A06(rawX);
            A20(rawX2, true);
        }
        this.A03 = true;
        this.A04 = false;
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.C7M
    public void setLayoutManager(com.facebook.ads.redexgen.core.R2 r2) {
        if (r2 instanceof com.facebook.ads.redexgen.core.C1706hr) {
            super.setLayoutManager(r2);
            this.A01 = (com.facebook.ads.redexgen.core.C1706hr) r2;
            return;
        }
        throw new java.lang.IllegalArgumentException(A09(0, 50, 59));
    }

    public void setSnapDelegate(com.facebook.ads.redexgen.core.InterfaceC1471e2 interfaceC1471e2) {
        this.A02 = interfaceC1471e2;
    }
}
