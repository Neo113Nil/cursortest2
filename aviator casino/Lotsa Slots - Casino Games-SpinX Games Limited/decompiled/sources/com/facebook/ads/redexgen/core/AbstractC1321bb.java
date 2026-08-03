package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1321bb extends android.widget.Button {
    public static byte[] A0B;
    public static java.lang.String[] A0C = {"AuzWZ8osEfq4z249PYqxDxnd", "GmaNjpajnwuNMOpMTnafkSdm", "IXSwi1vel7aGkSvKIjHlp", "5xYCukR2VNv2y0", "9gt7y21mjsR", "XkvVk", "YCgMHGcNxR5BY", "3lMWF0VDfBsAiU48Gpk3b"};
    public static final int A0D;
    public static final int A0E;
    public int A00;
    public int A01;
    public int A02;
    public com.facebook.ads.redexgen.core.C0894Na A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final float A07;
    public final int A08;
    public final java.lang.Runnable A09;
    public final java.lang.Runnable A0A;

    public static java.lang.String A09(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 86);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0C() {
        A0B = new byte[]{125, -35, -12, -84};
    }

    static {
        A0C();
        A0D = (int) (com.facebook.ads.redexgen.core.XX.A02 * 16.0f);
        A0E = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
    }

    public AbstractC1321bb(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C0894Na c0894Na) {
        super(c1636gi);
        this.A04 = false;
        this.A02 = 0;
        this.A00 = 0;
        this.A01 = A0E;
        this.A05 = true;
        this.A06 = false;
        this.A09 = new com.facebook.ads.redexgen.core.C0833Kq(this);
        this.A0A = new com.facebook.ads.redexgen.core.C0828Kl(this);
        this.A03 = c0894Na;
        this.A08 = com.facebook.ads.redexgen.core.C1086Up.A05(c1636gi);
        this.A07 = com.facebook.ads.redexgen.core.C1086Up.A00(c1636gi);
        com.facebook.ads.redexgen.core.YB.A0a(this, false, 16);
        setGravity(17);
        A0A();
    }

    private void A0A() {
        if (this.A03 != null) {
            this.A00 = this.A03.A09(this.A06);
            this.A02 = this.A03.A0A(this.A06);
        }
        com.facebook.ads.redexgen.core.YB.A0Q(this, this.A00, this.A05 ? this.A01 : 0);
        setTextColor(this.A02);
    }

    private void A0B() {
        if (this.A08 < 0 || this.A04) {
            return;
        }
        this.A04 = true;
        java.lang.String[] strArr = A0C;
        if (strArr[1].length() != strArr[0].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0C;
        strArr2[1] = "QVGWsKZ9hUXhPHMuZeCIqAcU";
        strArr2[0] = "lfolaSZCl8ASaScD6QDCGzAz";
        if (com.facebook.ads.redexgen.core.C1086Up.A2j(getContext())) {
            postDelayed(this.A09, this.A08);
        }
    }

    public final void A0D() {
        java.lang.String charSequence = getText().toString();
        if (android.text.TextUtils.isEmpty(charSequence)) {
            return;
        }
        java.lang.String text = A09(1, 3, 43);
        java.lang.String[] split = charSequence.split(text);
        for (int i = 0; i < split.length; i++) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String text2 = split[i].substring(0, 1).toUpperCase(java.util.Locale.getDefault());
            java.lang.StringBuilder append = sb.append(text2);
            java.lang.String text3 = split[i];
            split[i] = append.append(text3.substring(1).toLowerCase(java.util.Locale.getDefault())).toString();
        }
        java.lang.String text4 = A09(0, 1, 7);
        super.setText((java.lang.CharSequence) com.facebook.ads.redexgen.core.AbstractC1320ba.A01(text4, split));
    }

    public com.facebook.ads.redexgen.core.C0894Na getColorInfo() {
        return this.A03;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A0B();
    }

    public void setCornerRadiusPx(int i) {
        this.A01 = i;
    }

    public void setRoundedCornersEnabled(boolean z) {
        this.A05 = z;
        A0A();
    }

    public void setText(java.lang.String str) {
        super.setText((java.lang.CharSequence) str.toUpperCase(java.util.Locale.US));
    }

    public void setUpButtonColors(com.facebook.ads.redexgen.core.C0894Na c0894Na) {
        this.A03 = c0894Na;
        A0A();
    }

    public void setViewShowsOverMedia(boolean z) {
        this.A06 = z;
        A0A();
    }
}
