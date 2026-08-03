package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.eb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1505eb extends android.widget.LinearLayout {
    public C1505eb(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.NativeBannerAd nativeBannerAd, com.facebook.ads.redexgen.core.EnumC1101Ve enumC1101Ve, com.facebook.ads.redexgen.core.C1100Vd c1100Vd, com.facebook.ads.AdOptionsView adOptionsView) {
        super(c1636gi);
        android.widget.TextView textView = new android.widget.TextView(getContext());
        c1100Vd.A08(textView);
        textView.setText(nativeBannerAd.getAdvertiserName());
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        android.widget.TextView textView2 = new android.widget.TextView(getContext());
        c1100Vd.A06(textView2);
        textView2.setText(nativeBannerAd.getAdUntrimmedBodyText());
        textView2.setLines(enumC1101Ve == com.facebook.ads.redexgen.core.EnumC1101Ve.A07 ? 2 : 1);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        linearLayout.addView(textView, layoutParams);
        linearLayout.addView(adOptionsView, new android.widget.LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        addView(linearLayout, layoutParams2);
        addView(textView2, layoutParams2);
    }
}
