package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ef, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1509ef extends android.widget.LinearLayout {
    public static final int A00 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 32.0f);
    public static final int A01 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 8.0f);

    public C1509ef(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.redexgen.core.C1100Vd c1100Vd, com.facebook.ads.redexgen.core.C1330bk c1330bk, com.facebook.ads.AdOptionsView adOptionsView) {
        super(c1636gi);
        setOrientation(0);
        c1330bk.setFullCircleCorners(true);
        android.widget.LinearLayout.LayoutParams iconViewParams = new android.widget.LinearLayout.LayoutParams(A00, A00);
        iconViewParams.gravity = 16;
        iconViewParams.setMargins(0, 0, A01, 0);
        addView(c1330bk, iconViewParams);
        android.widget.TextView textView = new android.widget.TextView(c1636gi);
        c1100Vd.A08(textView);
        textView.setMaxLines(1);
        textView.setText(nativeAd.getAdvertiserName());
        android.widget.TextView sponsoredTextView = new android.widget.TextView(c1636gi);
        c1100Vd.A06(sponsoredTextView);
        sponsoredTextView.setMaxLines(1);
        sponsoredTextView.setText(nativeAd.getSponsoredTranslation());
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(c1636gi);
        linearLayout.setOrientation(1);
        android.widget.LinearLayout.LayoutParams iconViewParams2 = new android.widget.LinearLayout.LayoutParams(0, -2);
        iconViewParams2.weight = 1.0f;
        iconViewParams2.gravity = 16;
        android.widget.LinearLayout.LayoutParams textContainerParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        linearLayout.addView(textView, textContainerParams);
        android.widget.LinearLayout.LayoutParams textContainerParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        linearLayout.addView(sponsoredTextView, textContainerParams2);
        addView(linearLayout, iconViewParams2);
        android.view.ViewGroup.LayoutParams textContainerParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        addView(adOptionsView, textContainerParams3);
    }
}
