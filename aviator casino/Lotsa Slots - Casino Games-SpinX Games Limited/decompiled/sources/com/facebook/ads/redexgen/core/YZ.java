package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class YZ extends android.widget.LinearLayout {
    public static byte[] A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final android.widget.ImageView A00;
    public final android.widget.ImageView A01;
    public final com.facebook.ads.redexgen.core.C0926Og A02;
    public final com.facebook.ads.redexgen.core.C1636gi A03;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 118);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{103, 66};
    }

    static {
        A03();
        A08 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 50.0f);
        A05 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 10.0f);
        A06 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 20.0f);
        A09 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
        A07 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 12.0f);
    }

    public YZ(com.facebook.ads.redexgen.core.C1636gi c1636gi, int i) {
        super(c1636gi);
        this.A03 = c1636gi;
        this.A02 = com.facebook.ads.redexgen.core.AbstractC0927Oh.A00(c1636gi.A02());
        setOrientation(0);
        this.A00 = new android.widget.ImageView(c1636gi);
        this.A01 = new android.widget.ImageView(c1636gi);
        A04(i);
    }

    private void A04(int i) {
        com.facebook.ads.redexgen.core.YM ym;
        A05(this.A00, com.facebook.ads.redexgen.core.YM.AD_CHOICES_ICON);
        if (i == 2) {
            setPadding(A05, A05 / 3, A05, A05 / 3);
            android.widget.TextView textView = new android.widget.TextView(this.A03);
            textView.setText(A02(0, 2, 80));
            textView.setTextColor(-1);
            textView.setPadding(0, A05 / 2, A05 / 2, A05 / 2);
            com.facebook.ads.redexgen.core.YB.A0a(textView, true, 13);
            android.widget.LinearLayout.LayoutParams textViewParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            textViewParams.gravity = 16;
            addView(textView, textViewParams);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(A07, A07);
            layoutParams.gravity = 16;
            addView(this.A00, layoutParams);
            return;
        }
        setPadding(A05, A05, A05, A05);
        if (i == 1) {
            ym = com.facebook.ads.redexgen.core.YM.AN_INFO_ICON;
        } else {
            ym = com.facebook.ads.redexgen.core.YM.DEFAULT_INFO_ICON;
        }
        A05(this.A01, ym);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(A06, A06);
        layoutParams2.gravity = 17;
        addView(this.A01, layoutParams2);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(A06, A06);
        layoutParams3.setMargins(A09, 0, 0, 0);
        layoutParams3.gravity = 17;
        addView(this.A00, layoutParams3);
    }

    public static void A05(android.widget.ImageView imageView, com.facebook.ads.redexgen.core.YM ym) {
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(ym));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(com.facebook.ads.redexgen.core.C0906Nm c0906Nm, java.lang.String str, com.facebook.ads.redexgen.core.VI vi, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh) {
        setOnClickListener(new com.facebook.ads.redexgen.core.YY(this, vi, interfaceC1177Yh, str, c0906Nm));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A08);
        gradientDrawable.setColor(i);
        com.facebook.ads.redexgen.core.YB.A0V(this, gradientDrawable);
    }

    public void setIconColors(int i) {
        this.A00.setColorFilter(i);
        this.A01.setColorFilter(i);
    }
}
