package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.eV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1500eV extends android.widget.LinearLayout {
    public int A00;
    public int A01;
    public int A02;
    public android.widget.TextView A03;
    public android.widget.TextView A04;
    public final int A05;

    public C1500eV(android.content.Context context) {
        super(context);
        this.A01 = 30;
        this.A02 = 45;
        this.A00 = 8;
        A00();
        this.A05 = (int) com.facebook.ads.redexgen.core.XX.A02;
        A01();
    }

    private void A00() {
        setOrientation(1);
        setGravity(17);
        this.A04 = new android.widget.TextView(getContext());
        this.A04.setTextSize(17.0f);
        this.A04.setTextColor(-1);
        this.A04.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, this.A00, 0, 0);
        this.A04.setLayoutParams(layoutParams);
        addView(this.A04);
        this.A03 = new android.widget.TextView(getContext());
        this.A03.setTextSize(11.0f);
        android.widget.LinearLayout.LayoutParams subtitleParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        subtitleParams.setMargins(0, 0, 0, 0);
        this.A03.setLayoutParams(subtitleParams);
        addView(this.A03);
    }

    private void A01() {
        this.A01 *= this.A05;
        this.A02 *= this.A05;
        this.A00 *= this.A05;
    }

    public final com.facebook.ads.redexgen.core.C1500eV A02(com.facebook.ads.redexgen.core.C1319bZ c1319bZ) {
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(this.A01, this.A01);
        layoutParams.setMargins(this.A02, 0, this.A02, 0);
        c1319bZ.setLayoutParams(layoutParams);
        addView(c1319bZ, 0);
        return this;
    }

    public final com.facebook.ads.redexgen.core.C1500eV A03(java.lang.String str) {
        this.A03.setText(str);
        return this;
    }

    public final com.facebook.ads.redexgen.core.C1500eV A04(java.lang.String str) {
        this.A04.setText(str);
        return this;
    }
}
