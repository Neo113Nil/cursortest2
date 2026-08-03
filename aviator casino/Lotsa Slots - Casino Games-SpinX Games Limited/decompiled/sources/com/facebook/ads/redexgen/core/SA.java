package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class SA implements com.facebook.ads.internal.api.NativeBannerAdApi {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"068yMtBHtCdtzUYBTQD9IwnMWW1doBJF", "2l8Hok5ewW", "SqMVYGMc7AyphtDxx4DkXGESiOtqp3Wk", "n7xht10RjuH04nLwyOxbbpbZUJ6bFNP5", "hemUdCIRyaFDmP64bLQtQG29khNbMpFH", "0krrnlsRXu", "j9YMm5Kfv7iMZif7VGfsQGY8YQ9Z0I42", "SiUubuHC3Y"};
    public final com.facebook.ads.redexgen.core.UK A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A02[0].charAt(2) != '8') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[2] = "SDJ7CqIuYGJEmotuvG7btG7Q2tCK4c6p";
            strArr[6] = "3TZdd6KNeaSFSkmrHNZK7GULPPfkGOEa";
            copyOfRange[i4] = (byte) ((b - i3) - 50);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-50, -54, -55, -3, -20, -15, -19, -10, -21, -19, -42, -19, -4, -1, -9, -6, -13};
    }

    static {
        A01();
    }

    public SA(com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi) {
        this.A00 = com.facebook.ads.redexgen.core.UK.A0L(nativeAdBaseApi);
        this.A00.A1i(com.facebook.ads.redexgen.core.EnumC1111Vq.A05);
    }

    private void A02(android.widget.ImageView imageView, com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi) {
        com.facebook.ads.redexgen.core.UK A0L = com.facebook.ads.redexgen.core.UK.A0L(nativeAdBaseApi);
        com.facebook.ads.redexgen.core.C1658h4 c1658h4 = new com.facebook.ads.redexgen.core.C1658h4(this, imageView, A0L);
        com.facebook.ads.redexgen.core.C1098Vb adIcon = A0L.getAdIcon();
        if (adIcon != null) {
            android.graphics.Bitmap A0N = A0L.A14().A0N(adIcon.getUrl());
            android.content.Context context = imageView.getContext();
            java.lang.String[] strArr = A02;
            if (strArr[2].charAt(21) == strArr[6].charAt(21)) {
                A02[4] = "oesEo3u5gOmbsNZfXjsimFyw8pPXYbZZ";
                com.facebook.ads.redexgen.core.C1636gi A03 = com.facebook.ads.redexgen.core.C1009Rp.A03(context);
                if (A0N != null) {
                    android.graphics.drawable.Drawable A05 = com.facebook.ads.redexgen.core.UK.A05(A03, A0N, A0L.A1t(), A0L.A1I());
                    com.facebook.ads.redexgen.core.UK.A0f(A05, imageView);
                    imageView.post(new com.facebook.ads.redexgen.core.C1657h3(this, A0L, A05));
                    return;
                } else {
                    com.facebook.ads.redexgen.core.C1658h4 c1658h42 = null;
                    com.facebook.ads.redexgen.core.S7 loadImageTask = new com.facebook.ads.redexgen.core.S7(A03, c1658h4, A0L.A1t(), c1658h42);
                    loadImageTask.execute(new com.facebook.ads.redexgen.core.S9(adIcon.getUrl(), A0L.A1I(), c1658h42));
                    return;
                }
            }
        } else {
            com.facebook.ads.redexgen.core.InterfaceC1066Tv A1A = A0L.A1A();
            com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.NATIVE_AD_IS_NOT_LOADED;
            if (A02[4].charAt(17) != 't') {
                A02[4] = "aFZFEDb6phUkMJAuumeHd9ws0nVx9tBY";
                A0L.A16().A0F().A3N(-1L, adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
                if (A1A != null) {
                    A1A.ADp(com.facebook.ads.redexgen.core.C1108Vm.A00(adErrorType));
                }
                android.util.Log.e(A00(0, 17, 86), adErrorType.getDefaultErrorMessage());
                return;
            }
        }
        throw new java.lang.RuntimeException();
    }

    @Override // com.facebook.ads.internal.api.NativeBannerAdApi
    public final void registerViewForInteraction(android.view.View view, android.widget.ImageView imageView) {
        registerViewForInteraction(view, imageView, (java.util.List<android.view.View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeBannerAdApi
    public final void registerViewForInteraction(android.view.View view, android.widget.ImageView imageView, java.util.List<android.view.View> list) {
        if (imageView != null) {
            A02(imageView, this.A00);
        }
        if (list != null) {
            com.facebook.ads.redexgen.core.UK uk = this.A00;
            if (A02[1].length() != 10) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[5] = "ll9cTRtW3a";
            strArr[7] = "WGLVGgKdvO";
            uk.A1T(view, imageView, list);
            return;
        }
        this.A00.A1S(view, imageView);
    }

    @Override // com.facebook.ads.internal.api.NativeBannerAdApi
    public final void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView) {
        registerViewForInteraction(view, mediaView, (java.util.List<android.view.View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeBannerAdApi
    public final void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, java.util.List<android.view.View> clickableViews) {
        if (mediaView != null) {
            ((com.facebook.ads.redexgen.core.C1666hC) mediaView.getMediaViewApi()).A0X(this.A00, true);
        }
        if (clickableViews != null) {
            this.A00.A1W(view, mediaView, clickableViews, true);
        } else {
            this.A00.A1X(view, mediaView, true);
        }
    }
}
