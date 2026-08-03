package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1453dj extends android.widget.RelativeLayout {
    public com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A00;
    public final android.view.View.OnClickListener A01;
    public final com.facebook.ads.redexgen.core.NY A02;
    public final com.facebook.ads.redexgen.core.C0906Nm A03;
    public final com.facebook.ads.redexgen.core.C1636gi A04;
    public final com.facebook.ads.redexgen.core.C1330bk A05;
    public final com.facebook.ads.redexgen.core.C1336bq A06;
    public final java.lang.String A07;
    public static final int A0B = (int) (com.facebook.ads.redexgen.core.XX.A02 * 2.0f);
    public static final int A0F = (int) (com.facebook.ads.redexgen.core.XX.A02 * 16.0f);
    public static final int A0D = (int) (com.facebook.ads.redexgen.core.XX.A02 * 20.0f);
    public static final int A0E = (int) (com.facebook.ads.redexgen.core.XX.A02 * 13.0f);
    public static final int A08 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 72.0f);
    public static final int A0C = (int) (com.facebook.ads.redexgen.core.XX.A02 * 8.0f);
    public static final int A0A = (int) (com.facebook.ads.redexgen.core.XX.A02 * 24.0f);
    public static final int A09 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 16.0f);

    public C1453dj(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C0906Nm c0906Nm, com.facebook.ads.redexgen.core.NY ny, com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr viewOnClickListenerC0834Kr, java.lang.String str, android.view.View.OnClickListener onClickListener) {
        super(c1636gi);
        this.A04 = c1636gi;
        this.A03 = c0906Nm;
        this.A02 = ny;
        this.A00 = viewOnClickListenerC0834Kr;
        this.A07 = str;
        this.A01 = onClickListener;
        this.A05 = new com.facebook.ads.redexgen.core.C1330bk(this.A04);
        this.A06 = new com.facebook.ads.redexgen.core.C1336bq(this.A04, com.facebook.ads.redexgen.core.C0894Na.A01(null), true, false, true);
        A00();
    }

    private void A00() {
        com.facebook.ads.redexgen.core.AbstractC1337br.A00(this.A04, this, this.A03.A01());
        android.widget.ImageView imageView = new android.widget.ImageView(this.A04);
        imageView.setImageBitmap(com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.REDESIGN_CLOSE_ICON));
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(A0A, A0A);
        imageView.setColorFilter(-1);
        layoutParams.addRule(11);
        layoutParams.setMargins(A09, A09, A09, A09);
        imageView.setLayoutParams(layoutParams);
        addView(imageView);
        imageView.setOnClickListener(this.A01);
        android.widget.LinearLayout layout = new android.widget.LinearLayout(this.A04);
        layout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        layout.setGravity(17);
        layout.setOrientation(1);
        android.widget.ImageView closeImageView = this.A05;
        com.facebook.ads.redexgen.core.YB.A0N(closeImageView, 0);
        this.A05.setRadius(A0B);
        new com.facebook.ads.redexgen.core.LM(this.A05, this.A04).A04().A07(this.A03.A01());
        this.A06.A04(this.A02.A0G(), this.A03.A03(), null, false, true);
        this.A06.setAlignment(17);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, A0F, 0, A0F);
        this.A06.getDescriptionTextView().setText(this.A07);
        layout.addView(this.A05, new android.widget.LinearLayout.LayoutParams(A08, A08));
        layout.addView(this.A06, layoutParams2);
        if (this.A00 != null) {
            android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            this.A00.setPadding(A0D, A0E, A0D, A0E);
            this.A00.setLayoutParams(layoutParams3);
            com.facebook.ads.redexgen.core.YB.A0V(this.A00, com.facebook.ads.redexgen.core.YB.A06(-16738826, A0C));
            this.A00.setStateListAnimator(null);
            com.facebook.ads.redexgen.core.YB.A0Z(this.A00);
            layout.addView(this.A00);
        }
        addView(layout);
    }
}
