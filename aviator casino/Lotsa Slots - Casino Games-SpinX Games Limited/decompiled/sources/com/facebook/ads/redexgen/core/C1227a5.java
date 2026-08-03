package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.a5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1227a5 extends android.widget.LinearLayout {
    public final android.graphics.Bitmap A00;

    public C1227a5(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.EnumC1244aM enumC1244aM) {
        super(c1636gi);
        this.A00 = com.facebook.ads.redexgen.core.YN.A01(com.facebook.ads.redexgen.core.YM.AD_CHOICE_ICON);
        c1636gi.A0F().AAz(enumC1244aM.name().toLowerCase(java.util.Locale.US));
        A00();
        setAdChoiceIcon(c1636gi);
    }

    private void A00() {
        setOrientation(0);
        setPadding(com.facebook.ads.redexgen.core.XV.A0I, com.facebook.ads.redexgen.core.XV.A0I, com.facebook.ads.redexgen.core.XV.A0I, com.facebook.ads.redexgen.core.XV.A0I);
        setClipToPadding(false);
        setGravity(17);
        com.facebook.ads.redexgen.core.YB.A0N(this, -859190839);
        com.facebook.ads.redexgen.core.YB.A0E(com.facebook.ads.redexgen.core.XV.A0C, this);
    }

    private void setAdChoiceIcon(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        android.widget.ImageView imageView = new android.widget.ImageView(c1636gi);
        com.facebook.ads.redexgen.core.YB.A0K(imageView);
        imageView.setImageBitmap(this.A00);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        imageView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, com.facebook.ads.redexgen.core.XV.A0U));
        addView(imageView);
    }
}
