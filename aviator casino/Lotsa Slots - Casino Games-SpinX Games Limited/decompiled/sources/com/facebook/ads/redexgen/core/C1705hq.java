package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1705hq extends com.facebook.ads.redexgen.core.RF {
    public static byte[] A06;
    public static java.lang.String[] A07 = {"ZeVLivVBnS1aoVlC2PGSN001bhNNVWpd", "UVHNMhASFprendMTBixyPal4p5ABOqh9", "McvoL7vwBcNsRrFgWF8", "NjfWBR2llDufPeBAgLyuBDteRTJCHxSb", "wixo9thO", "Otknv8q9MbYFm1QayK0knTm3Lm4p4QUP", "Dtck5bq60bDmwFSuqNFF3ANsa4oCLChk", "09JoBoJUIjBPlvD9emsVrlLKVUsGd7rc"};
    public android.graphics.PointF A02;
    public final float A03;
    public final android.view.animation.LinearInterpolator A05 = new android.view.animation.LinearInterpolator();
    public final android.view.animation.DecelerateInterpolator A04 = new android.view.animation.DecelerateInterpolator();
    public int A00 = 0;
    public int A01 = 0;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final int A03(android.view.View view, int i) {
        com.facebook.ads.redexgen.core.R2 A08 = A08();
        if (A08 == null || !A08.A23()) {
            return 0;
        }
        com.facebook.ads.redexgen.core.R3 r3 = (com.facebook.ads.redexgen.core.R3) view.getLayoutParams();
        return A0N(A08.A0q(view) - r3.topMargin, A08.A0l(view) + r3.bottomMargin, A08.A0i(), A08.A0Z() - A08.A0f(), i);
    }

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 123);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A06() {
        A06 = new byte[]{45, 8, com.google.common.base.Ascii.SI, 4, 0, 19, 50, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.NAK, 9, 50, 2, 19, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.CR, 4, 19, 124, 74, 80, 5, 86, 77, 74, 80, 73, 65, 5, 74, 83, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 87, 87, 76, 65, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 5, 70, 74, 72, 85, 80, 81, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 118, 70, 87, 74, 73, 73, 115, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 70, 81, 74, 87, 99, 74, 87, 117, 74, 86, 76, 81, 76, 74, 75, 5, 82, 77, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 75, 5, 81, 77, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 5, 105, 68, 92, 74, 80, 81, 104, 68, 75, 68, 66, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 87, 5, 65, 74, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 86, 5, 75, 74, 81, 5, 76, 72, 85, 73, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 72, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 75, 81, 5, 117, 104, 103, 118, 38, 118, 116, 99, 96, 99, 116, 99, 104, 101, 99, 38, 117, 110, 105, 115, 106, 98, 38, 100, 99, 38, 105, 104, 99, 38, 105, 96, 38, 114, 110, 99, 38, 101, 105, 104, 117, 114, 103, 104, 114, 117, 38, 98, 99, 96, 111, 104, 99, 98, 38, 111, 104, 38, 85, 107, 105, 105, 114, 110, 85, 101, 116, 105, 106, 106, 99, 116, 42, 38, 117, 114, 103, 116, 114, 111, 104, 97, 38, 113, 111, 114, 110, 38, 85, 72, 71, 86, 89};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public int A0O(android.view.View view, int i) {
        com.facebook.ads.redexgen.core.R2 A08 = A08();
        if (A08 == null || !A08.A22()) {
            return 0;
        }
        com.facebook.ads.redexgen.core.R3 r3 = (com.facebook.ads.redexgen.core.R3) view.getLayoutParams();
        return A0N(A08.A0m(view) - r3.leftMargin, A08.A0p(view) + r3.rightMargin, A08.A0g(), A08.A0j() - A08.A0h(), i);
    }

    static {
        A06();
    }

    public C1705hq(android.content.Context context) {
        this.A03 = A0J(context.getResources().getDisplayMetrics());
    }

    private final int A00() {
        if (this.A02 == null || this.A02.y == 0.0f) {
            return 0;
        }
        return this.A02.y > 0.0f ? 1 : -1;
    }

    private int A01(int i, int i2) {
        int before = i - i2;
        if (i * before <= 0) {
            return 0;
        }
        return before;
    }

    private final void A07(com.facebook.ads.redexgen.core.RD rd) {
        android.graphics.PointF A0P = A0P(A07());
        if (A0P == null || (A0P.x == 0.0f && A0P.y == 0.0f)) {
            rd.A03(A07());
            A09();
            return;
        }
        A0B(A0P);
        this.A02 = A0P;
        this.A00 = (int) (A0P.x * 10000.0f);
        this.A01 = (int) (A0P.y * 10000.0f);
        int A0L = A0L(10000);
        int i = (int) (this.A00 * 1.2f);
        int i2 = (int) (this.A01 * 1.2f);
        int time = A07[2].length();
        if (time != 19) {
            throw new java.lang.RuntimeException();
        }
        A07[1] = "hx3pIt9eJlYI2ywoto5TCaec45lSGfjK";
        int time2 = (int) (A0L * 1.2f);
        rd.A04(i, i2, time2, this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.RF
    public final void A0G() {
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.core.RF
    public final void A0H(int i, int i2, com.facebook.ads.redexgen.core.RH rh, com.facebook.ads.redexgen.core.RD rd) {
        if (A06() == 0) {
            A09();
            if (A07[2].length() != 19) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A07;
            strArr[7] = "mtmNmOzcoe2a0U4cnzAn20gs4sdBvWQ8";
            strArr[3] = "eV2w3A07ZjFunHiJvnAZuuNmUx5etHx7";
            return;
        }
        this.A00 = A01(this.A00, i);
        this.A01 = A01(this.A01, i2);
        if (A07[4].length() != 8) {
            if (this.A00 != 0) {
                return;
            }
        } else {
            java.lang.String[] strArr2 = A07;
            strArr2[7] = "DcFC9yFlUF16xNqjYqSfoPj4l29Ulhpi";
            strArr2[3] = "h8WgdOPxw0F7hfvsQm1LsAkbSgkBaMel";
            if (this.A00 != 0) {
                return;
            }
        }
        if (this.A01 == 0) {
            A07(rd);
        }
    }

    @Override // com.facebook.ads.redexgen.core.RF
    public void A0I(android.view.View view, com.facebook.ads.redexgen.core.RH rh, com.facebook.ads.redexgen.core.RD rd) {
        int A0O = A0O(view, A0K());
        int dx = A00();
        int A03 = A03(view, dx);
        int dy = A0O * A0O;
        int dx2 = A03 * A03;
        int time = A0M((int) java.lang.Math.sqrt(dy + dx2));
        if (time > 0) {
            int distance = -A0O;
            int dy2 = -A03;
            rd.A04(distance, dy2, time, this.A04);
        }
    }

    public float A0J(android.util.DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int A0K() {
        if (this.A02 == null || this.A02.x == 0.0f) {
            return 0;
        }
        return this.A02.x > 0.0f ? 1 : -1;
    }

    public int A0L(int i) {
        return (int) java.lang.Math.ceil(java.lang.Math.abs(i) * this.A03);
    }

    public final int A0M(int i) {
        return (int) java.lang.Math.ceil(A0L(i) / 0.3356d);
    }

    public final int A0N(int i, int i2, int i3, int i4, int i5) {
        switch (i5) {
            case -1:
                return i3 - i;
            case 0:
                int i6 = i3 - i;
                if (i6 > 0) {
                    return i6;
                }
                int i7 = i4 - i2;
                if (i7 < 0) {
                    return i7;
                }
                return 0;
            case 1:
                return i4 - i2;
            default:
                throw new java.lang.IllegalArgumentException(A04(113, 93, 125));
        }
    }

    public android.graphics.PointF A0P(int i) {
        java.lang.Object A08 = A08();
        if (A08 instanceof com.facebook.ads.redexgen.core.RE) {
            return ((com.facebook.ads.redexgen.core.RE) A08).A56(i);
        }
        android.util.Log.w(A04(0, 20, 26), A04(20, 93, 94) + com.facebook.ads.redexgen.core.RE.class.getCanonicalName());
        return null;
    }
}
