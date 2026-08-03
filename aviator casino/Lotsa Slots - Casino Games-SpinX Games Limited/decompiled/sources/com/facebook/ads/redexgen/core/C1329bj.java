package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1329bj extends android.widget.LinearLayout {
    public int A00;
    public java.util.List<android.graphics.drawable.GradientDrawable> A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public C1329bj(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C0894Na c0894Na, int i) {
        super(c1636gi);
        this.A00 = -1;
        setOrientation(0);
        setGravity(17);
        float f = com.facebook.ads.redexgen.core.XX.A02;
        int i2 = (int) (8.0f * f);
        this.A02 = (int) (1.0f * f);
        this.A04 = c0894Na.A05(false);
        this.A03 = com.facebook.ads.redexgen.core.P3.A02(this.A04, 128);
        this.A01 = new java.util.ArrayList();
        for (int i3 = 0; i3 < i; i3++) {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setSize(i2, i2);
            gradientDrawable.setStroke(this.A02, 0);
            android.widget.ImageView imageView = new android.widget.ImageView(c1636gi);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, com.facebook.ads.redexgen.core.XV.A0t, 0);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageDrawable(gradientDrawable);
            this.A01.add(gradientDrawable);
            addView(imageView);
        }
        A00(0);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A00(int i) {
        int i2;
        int borderColor;
        if (this.A00 == i) {
            return;
        }
        this.A00 = i;
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 == i) {
                i2 = this.A04;
                borderColor = this.A04;
            } else {
                i2 = this.A03;
                borderColor = 0;
            }
            android.graphics.drawable.GradientDrawable gradientDrawable = this.A01.get(i3);
            int i4 = this.A02;
            gradientDrawable.setStroke(i4, borderColor);
            this.A01.get(i3).setColor(i2);
            this.A01.get(i3).invalidateSelf();
        }
    }
}
