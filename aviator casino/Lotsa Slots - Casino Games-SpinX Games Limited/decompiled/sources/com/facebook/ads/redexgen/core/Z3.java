package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class Z3 extends android.widget.RelativeLayout {
    public android.widget.TextView A00;
    public final android.widget.Button A01;
    public final android.widget.Button A02;
    public final android.widget.ImageView A03;
    public final android.widget.LinearLayout A04;
    public final android.widget.TextView A05;
    public static final int A08 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 60.0f);
    public static final int A07 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 8.0f);
    public static final int A09 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 16.0f);
    public static final int A0A = (int) (com.facebook.ads.redexgen.core.XX.A02 * 24.0f);
    public static final int A06 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 12.0f);

    public Z3(com.facebook.ads.redexgen.core.C1636gi c1636gi, int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.graphics.Bitmap bitmap) {
        super(c1636gi);
        this.A05 = new android.widget.TextView(c1636gi);
        this.A02 = new android.widget.Button(c1636gi);
        this.A01 = new android.widget.Button(c1636gi);
        this.A03 = new android.widget.ImageView(c1636gi);
        this.A04 = new android.widget.LinearLayout(c1636gi);
        if (!android.text.TextUtils.isEmpty(str2)) {
            this.A00 = new android.widget.TextView(c1636gi);
        }
        this.A05.setText(str);
        this.A05.setTextColor(i);
        com.facebook.ads.redexgen.core.YB.A0a(this.A05, true, 20);
        if (this.A00 != null) {
            this.A00.setText(str2);
            this.A00.setTextColor(i);
            com.facebook.ads.redexgen.core.YB.A0a(this.A00, false, 18);
        }
        this.A03.setImageBitmap(bitmap);
        this.A03.setColorFilter(i);
        this.A02.setText(str3);
        com.facebook.ads.redexgen.core.YB.A0a(this.A02, true, 18);
        this.A02.setAllCaps(true);
        this.A02.setTextColor(i2);
        this.A02.setPadding(A06, A06, A06, A06);
        this.A01.setText(str4);
        com.facebook.ads.redexgen.core.YB.A0a(this.A01, true, 18);
        this.A01.setAllCaps(true);
        this.A01.setTextColor(i);
        this.A01.setPadding(A06, A06, A06, A06);
        int A02 = com.facebook.ads.redexgen.core.P3.A02(i2, 20);
        com.facebook.ads.redexgen.core.YB.A0Q(this.A02, i, A07);
        com.facebook.ads.redexgen.core.YB.A0Q(this.A01, A02, A07);
        A00();
        setGravity(17);
    }

    private void A00() {
        setPadding(A0A, A0A, A0A, A0A);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        this.A04.setOrientation(1);
        this.A04.setGravity(14);
        addView(this.A04, layoutParams);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(A08, A08);
        layoutParams2.setMargins(0, 0, 0, A09);
        layoutParams2.gravity = 1;
        this.A04.addView(this.A03, layoutParams2);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, 0, 0, A09 / 2);
        this.A05.setGravity(17);
        this.A04.addView(this.A05, layoutParams3);
        if (this.A00 != null) {
            android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-1, -2);
            layoutParams4.setMargins(0, 0, 0, A09);
            this.A00.setGravity(17);
            this.A04.addView(this.A00, layoutParams4);
        }
        android.widget.LinearLayout.LayoutParams layoutParams5 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(0, 0, 0, A09);
        this.A04.addView(this.A02, layoutParams5);
        this.A04.addView(this.A01, layoutParams5);
    }
}
