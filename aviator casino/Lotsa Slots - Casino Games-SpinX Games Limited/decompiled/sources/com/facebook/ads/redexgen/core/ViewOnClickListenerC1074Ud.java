package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ud, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1074Ud implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.view.View.OnTouchListener, com.facebook.ads.redexgen.core.T4 {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"2Mr7WzO4XT19fyb3DHhbNTMzGWXczG8b", "vf19oH1ZBxP9VPI3JVFDPhemIBzJ7OC4", "PwSJ9ELrmEQEpkj", "NKBqcIyQCWq", "qemkSyFbN3a9gQ2aUzusWvKKRIknTA5w", "Z", "UIuvCrnGUlyr13fhGKhlPOBYvJPgs1Zm", "jOlkEqTUPEoF6L4suBriQ9wTaVLjQjL5"};
    public final com.facebook.ads.redexgen.core.C1636gi A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.UK A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[7].charAt(17) == 't') {
                throw new java.lang.RuntimeException();
            }
            A03[6] = "LYjyLl4kg8CHjw2beKSdtMq0XfNpXvKm";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 40);
            java.lang.String[] strArr = A03;
            if (strArr[3].length() == strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            A03[6] = "YSbRSDMNs4CLdH15XbZL4GcvXcpOIsjI";
            copyOfRange[i4] = b;
            i4++;
        }
    }

    public static void A02() {
        A02 = new byte[]{101, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 4, 71, 69, 74, 74, 75, 80, 4, 70, 65, 4, 71, 72, 77, 71, 79, 65, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 4, 70, 65, 66, 75, 86, 65, 4, 77, 80, 4, 77, 87, 4, 82, 77, 65, 83, 65, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 10, 42, 5, 0, 10, 2, com.google.common.base.Ascii.SUB, 73, 1, 8, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FF, 7, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.CR, 73, com.google.common.base.Ascii.GS, 6, 6, 73, com.google.common.base.Ascii.SI, 8, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.GS, 71, com.google.common.base.Ascii.CR, 9, 10, 62, 47, 34, 46, 37, 40, 46, 5, 46, 63, 60, 36, 57, 32, com.google.common.base.Ascii.CAN, 57, 118, 34, 57, 35, 53, 62, 118, 50, 55, 34, 55, 118, 36, 51, 53, 57, 36, 50, 51, 50, 122, 118, 38, 58, 51, 55, 37, 51, 118, 51, 56, 37, 35, 36, 51, 118, 34, 57, 35, 53, 62, 118, 51, 32, 51, 56, 34, 37, 118, 36, 51, 55, 53, 62, 118, 34, 62, 51, 118, 55, 50, 118, 0, 63, 51, 33, 118, 52, 47, 118, 36, 51, 34, 35, 36, 56, 63, 56, 49, 118, 48, 55, 58, 37, 51, 118, 63, 48, 118, 47, 57, 35, 118, 63, 56, 34, 51, 36, 53, 51, 38, 34, 118, 34, 62, 51, 118, 51, 32, 51, 56, 34, 120, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.DLE, 120, 98, Byte.MAX_VALUE};
    }

    static {
        A02();
    }

    public ViewOnClickListenerC1074Ud(com.facebook.ads.redexgen.core.UK uk, com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this.A01 = uk;
        this.A00 = c1636gi;
    }

    public /* synthetic */ ViewOnClickListenerC1074Ud(com.facebook.ads.redexgen.core.UK uk, com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C1118Vx c1118Vx) {
        this(uk, c1636gi);
    }

    private java.util.Map<java.lang.String, java.lang.String> A01() {
        com.facebook.ads.redexgen.core.C1581fp c1581fp;
        com.facebook.ads.redexgen.core.Y2 y2;
        com.facebook.ads.redexgen.core.EnumC1101Ve enumC1101Ve;
        boolean z;
        boolean z2;
        com.facebook.ads.redexgen.core.EnumC1101Ve enumC1101Ve2;
        com.facebook.ads.redexgen.core.C1293b9 c1293b9 = new com.facebook.ads.redexgen.core.C1293b9();
        c1581fp = this.A01.A0U;
        com.facebook.ads.redexgen.core.C1293b9 A032 = c1293b9.A03(c1581fp);
        y2 = this.A01.A0j;
        java.util.Map<java.lang.String, java.lang.String> A05 = A032.A02(y2).A05();
        enumC1101Ve = this.A01.A0K;
        if (enumC1101Ve != null) {
            enumC1101Ve2 = this.A01.A0K;
            A05.put(A00(201, 3, 62), java.lang.String.valueOf(enumC1101Ve2.A05()));
        }
        z = this.A01.A0a;
        if (z) {
            z2 = this.A01.A0a;
            A05.put(A00(198, 3, 75), java.lang.String.valueOf(z2));
        }
        return A05;
    }

    private void A03(java.util.Map<java.lang.String, java.lang.String> extraData) {
        if (this.A01.A0e != null) {
            this.A01.A0e.A0M(extraData);
        }
    }

    public final void A04() {
        com.facebook.ads.NativeAdLayout nativeAdLayout;
        com.facebook.ads.NativeAdLayout nativeAdLayout2;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        nativeAdLayout = this.A01.A08;
        if (nativeAdLayout != null) {
            nativeAdLayout2 = this.A01.A08;
            com.facebook.ads.redexgen.core.C1665hB c1665hB = (com.facebook.ads.redexgen.core.C1665hB) nativeAdLayout2.getNativeAdLayoutApi();
            c1636gi = this.A01.A0g;
            c1665hB.A04(new com.facebook.ads.redexgen.core.ZX(c1636gi));
        }
    }

    @Override // com.facebook.ads.redexgen.core.T4
    public final com.facebook.ads.redexgen.core.C1636gi A6m() {
        return this.A00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.Y2 y2;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        com.facebook.ads.redexgen.core.Y2 y22;
        com.facebook.ads.redexgen.core.C1636gi c1636gi2;
        com.facebook.ads.redexgen.core.Y2 y23;
        com.facebook.ads.redexgen.core.Y2 y24;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            y2 = this.A01.A0j;
            boolean A08 = y2.A08();
            java.lang.String A00 = A00(66, 17, 99);
            if (!A08) {
                android.util.Log.e(A00, A00(83, 115, 126));
            }
            c1636gi = this.A01.A0g;
            int minimumElapsedTime = com.facebook.ads.redexgen.core.C1086Up.A0K(c1636gi);
            if (minimumElapsedTime >= 0) {
                y23 = this.A01.A0j;
                if (y23.A03() < minimumElapsedTime) {
                    y24 = this.A01.A0j;
                    if (!y24.A07()) {
                        android.util.Log.e(A00, A00(0, 41, 12));
                        return;
                    } else {
                        android.util.Log.e(A00, A00(41, 25, 65));
                        return;
                    }
                }
            }
            y22 = this.A01.A0j;
            c1636gi2 = this.A01.A0g;
            if (y22.A09(c1636gi2)) {
                if (this.A01.A0e != null) {
                    this.A01.A0e.A0N(A01());
                    return;
                }
                return;
            }
            A03(A01());
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            java.lang.String[] strArr = A03;
            if (strArr[1].charAt(15) != strArr[0].charAt(15)) {
                throw new java.lang.RuntimeException();
            }
            A03[7] = "EqeSsMwGTYaeKofhe8hU7ULkNSCE0y6O";
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        android.view.View view2;
        com.facebook.ads.redexgen.core.C1290b6 c1290b6;
        com.facebook.ads.redexgen.core.C1290b6 c1290b62;
        android.view.View view3;
        android.view.View view4;
        com.facebook.ads.redexgen.core.C1290b6 c1290b63;
        com.facebook.ads.redexgen.core.C1290b6 c1290b64;
        view2 = this.A01.A04;
        if (view2 != null) {
            c1290b6 = this.A01.A0O;
            if (c1290b6 != null) {
                c1290b62 = this.A01.A0O;
                view3 = this.A01.A04;
                int width = view3.getWidth();
                view4 = this.A01.A04;
                c1290b62.setBounds(0, 0, width, view4.getHeight());
                c1290b63 = this.A01.A0O;
                c1290b64 = this.A01.A0O;
                c1290b63.A0D(!c1290b64.A0E());
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.facebook.ads.redexgen.core.Y2 y2;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        android.view.View view2;
        android.view.View.OnTouchListener onTouchListener;
        android.view.View.OnTouchListener onTouchListener2;
        y2 = this.A01.A0j;
        c1636gi = this.A01.A0g;
        view2 = this.A01.A04;
        y2.A06(c1636gi, motionEvent, view2, view);
        onTouchListener = this.A01.A02;
        if (onTouchListener != null) {
            onTouchListener2 = this.A01.A02;
            if (A03[2].length() == 9) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A03;
            strArr[1] = "w4fxh8qGKfQUI633kdvfD6D1dPFrXVB8";
            strArr[0] = "m7FEgH87ot2vGtV3LgABw7ULf2zod61Q";
            if (onTouchListener2.onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
