package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1367cL implements android.view.View.OnTouchListener {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"p7naAKHB4xLvoRE2lSSuhG1PZJd5v7nu", "WvtGE9IzO9nFNtvFFTJqUhWwvt66h6nL", "VCCKY7KSUUOD77sUX9kuHB9VbhmabzsO", "cnwdl7GMxNwVad4p0Oh4XJmd2VWgvA9c", "WrV0BeHEM3l4rmxeVHIasZWQtGmyI4N8", "o1aT8vujxCaaiLUwRZbljoToDOgVH3wd", "xRriwdEy6j865I4a7V8cGrqA6QrsYUim", "9xiHe0uHFaNvIWsoa90uuUt6pGUbqrnm"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.KE A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A02;
            if (strArr[1].charAt(22) != strArr[4].charAt(22)) {
                break;
            }
            java.lang.String[] strArr2 = A02;
            strArr2[2] = "QNYUYdnqHgiLJjFZUPg17w9dElY9CMJL";
            strArr2[0] = "MmMVh7wO8RKpCmRa2XK3GpXBkp039CBt";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            int i5 = (copyOfRange[i4] - i3) - 121;
            java.lang.String[] strArr3 = A02;
            if (strArr3[6].charAt(7) == strArr3[5].charAt(7)) {
                break;
            }
            java.lang.String[] strArr4 = A02;
            strArr4[7] = "upZvC29S1gYfpKTic3DC7WgaDELdGVOI";
            strArr4[3] = "622S9DNbpY0TGJih4dXFXUlLvodGjwfO";
            copyOfRange[i4] = (byte) i5;
            i4++;
        }
        throw new java.lang.RuntimeException();
    }

    public static void A01() {
        A01 = new byte[]{com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.NAK, 7, com.google.common.base.Ascii.DC4, 1, 5, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.VT, 5, com.google.common.base.Ascii.CR, 1, com.google.common.base.Ascii.VT, 3, 4, 68, 66, 52, 65, 46, 58, 52, 72, 63, 48, 51, 46, 50, 59, 56, 50, 58, 46, 56, 48, 49};
    }

    static {
        A01();
    }

    public ViewOnTouchListenerC1367cL(com.facebook.ads.redexgen.core.KE ke) {
        this.A00 = ke;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z;
        android.view.inputmethod.InputMethodManager inputMethodManager;
        android.view.inputmethod.InputMethodManager inputMethodManager2;
        boolean z2;
        int i;
        switch (motionEvent.getActionMasked()) {
            case 0:
                z = this.A00.A0Q;
                if (!z) {
                    inputMethodManager = this.A00.A0A;
                    if (inputMethodManager != null) {
                        inputMethodManager2 = this.A00.A0A;
                        if (inputMethodManager2.isAcceptingText()) {
                            this.A00.A0Q = true;
                            com.facebook.ads.redexgen.core.KE ke = this.A00;
                            java.lang.String[] strArr = A02;
                            if (strArr[1].charAt(22) == strArr[4].charAt(22)) {
                                java.lang.String[] strArr2 = A02;
                                strArr2[7] = "y8iXjV8I9QfHTyCtOipg4lT6AE7AaFQc";
                                strArr2[3] = "XU6FCJR6sW2kminM5RICnJzgT3NrL5su";
                                ke.A0h(A00(14, 21, 86));
                                break;
                            } else {
                                throw new java.lang.RuntimeException();
                            }
                        }
                    }
                }
                break;
            case 1:
                com.facebook.ads.redexgen.core.KE.A05(this.A00);
                z2 = this.A00.A0P;
                if (!z2) {
                    i = this.A00.A07;
                    if (i >= 5) {
                        this.A00.A0P = true;
                        this.A00.A0h(A00(0, 14, 41));
                        break;
                    }
                }
                break;
        }
        java.lang.String[] strArr3 = A02;
        if (strArr3[6].charAt(7) != strArr3[5].charAt(7)) {
            java.lang.String[] strArr4 = A02;
            strArr4[6] = "ebvcteC2Y0dTtDk82YoZqGoSTVtPrEa5";
            strArr4[5] = "fbe5xbn5zq5FbTQSbq0ElFkb30D7M3tE";
            return false;
        }
        throw new java.lang.RuntimeException();
    }
}
