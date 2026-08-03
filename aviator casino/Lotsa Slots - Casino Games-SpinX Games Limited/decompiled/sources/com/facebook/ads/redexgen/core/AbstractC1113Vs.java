package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Vs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1113Vs {
    public static java.lang.String[] A00 = {"TYvyTugW0LIK7CMS2wYs9G2uUGgA7Dke", "WsEiqL7ZS4BTI966aPHoJ2dPx2Ea0F4I", "bsmL1TSWcO8d5RdSDpnXrtDP3Rd3pXtR", "xkYelsmw9O3RFB2zMTQOqufEggZJfpsf", "Ou1dyJktpNGGcf9tDpPKvHuJxEoqg2O4", "MwtSqX2RTtZq4kMpP", "Xg7OrQNETkr2DWt43s", "zI20iJtpElrzvKbVLZsd1iWpdjTxU8BC"};

    public static com.facebook.ads.redexgen.core.EnumC1111Vq A00(android.util.DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = displayMetrics.heightPixels;
        int screenHeight = (int) (screenWidth / displayMetrics.density);
        if (com.facebook.ads.redexgen.core.XY.A04(i, screenHeight)) {
            return com.facebook.ads.redexgen.core.EnumC1111Vq.A0I;
        }
        if (screenHeight > i) {
            com.facebook.ads.redexgen.core.EnumC1111Vq enumC1111Vq = com.facebook.ads.redexgen.core.EnumC1111Vq.A0K;
            java.lang.String[] strArr = A00;
            java.lang.String str = strArr[5];
            java.lang.String str2 = strArr[6];
            int screenHeight2 = str.length();
            int screenWidth2 = str2.length();
            if (screenHeight2 == screenWidth2) {
                throw new java.lang.RuntimeException();
            }
            A00[7] = "zEjIxhk858iOsdYr9SgRsiKXnD8rO3VU";
            return enumC1111Vq;
        }
        return com.facebook.ads.redexgen.core.EnumC1111Vq.A0H;
    }

    public static void A01(android.util.DisplayMetrics displayMetrics, android.view.View view, com.facebook.ads.redexgen.core.EnumC1110Vp enumC1110Vp) {
        int ceil;
        int i = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = enumC1110Vp.A04();
        if (i >= screenWidth) {
            ceil = displayMetrics.widthPixels;
        } else {
            int screenWidth2 = enumC1110Vp.A04();
            ceil = (int) java.lang.Math.ceil(screenWidth2 * displayMetrics.density);
        }
        int screenWidth3 = enumC1110Vp.A03();
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(ceil, (int) java.lang.Math.ceil(screenWidth3 * displayMetrics.density));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}
