package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class AD extends com.facebook.ads.redexgen.core.C2177pz {
    public static byte[] A07;
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.AD> A08;
    public static final java.lang.String A09;
    public static final java.lang.String A0A;
    public static final java.lang.String A0B;
    public static final java.lang.String A0C;
    public static final java.lang.String A0D;
    public static final java.lang.String A0E;
    public final boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final com.facebook.ads.redexgen.core.C2196qI A04;
    public final com.facebook.ads.redexgen.core.C3C A05;
    public final java.lang.String A06;

    public static /* synthetic */ com.facebook.ads.redexgen.core.AD A00(android.os.Bundle bundle) {
        return new com.facebook.ads.redexgen.core.AD(bundle);
    }

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 61);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{120, -67, -54, -54, -57, -54, -124, 120, -63, -58, -68, -67, -48, -107, -83, -95, -25, -16, -13, -18, -30, -11, -66, -37, -49, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.RS, 33, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DLE, 35, com.google.common.base.Ascii.SO, 34, 36, com.google.common.base.Ascii.US, com.google.common.base.Ascii.US, com.google.common.base.Ascii.RS, 33, 35, com.google.common.base.Ascii.DC4, 19, -20, -21, -47, -45, -26, -18, -16, -11, -26, -95, -26, -13, -13, -16, -13, -53, -25, -19, -22, -37, -35, -104, -35, -22, -22, -25, -22, -50, -25, -34, -15, -23, -34, -36, -19, -34, -35, -103, -21, -18, -25, -19, -30, -26, -34, -103, -34, -21, -21, -24, -21};
    }

    static {
        A07();
        A08 = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.ot
            @Override // com.facebook.ads.redexgen.core.AnonymousClass23
            public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
                return com.facebook.ads.redexgen.core.AD.A00(bundle);
            }
        };
        A0E = com.facebook.ads.redexgen.core.C5C.A0h(1001);
        A0D = com.facebook.ads.redexgen.core.C5C.A0h(1002);
        A0C = com.facebook.ads.redexgen.core.C5C.A0h(1003);
        A0A = com.facebook.ads.redexgen.core.C5C.A0h(1004);
        A0B = com.facebook.ads.redexgen.core.C5C.A0h(1005);
        A09 = com.facebook.ads.redexgen.core.C5C.A0h(1006);
    }

    public AD(int i, java.lang.Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public AD(int i, java.lang.Throwable th, java.lang.String str, int i2, java.lang.String str2, int i3, com.facebook.ads.redexgen.core.C2196qI c2196qI, int i4, boolean z) {
        this(A06(i, th, str, str2, i3, c2196qI, i4), th, i2, i, str2, i3, c2196qI, i4, null, android.os.SystemClock.elapsedRealtime(), z);
    }

    public AD(android.os.Bundle bundle) {
        super(bundle);
        com.facebook.ads.redexgen.core.C2196qI A6f;
        this.A03 = bundle.getInt(A0E, 2);
        this.A06 = bundle.getString(A0D);
        this.A02 = bundle.getInt(A0C, -1);
        android.os.Bundle bundle2 = bundle.getBundle(A0A);
        if (bundle2 == null) {
            A6f = null;
        } else {
            A6f = com.facebook.ads.redexgen.core.C2196qI.A0b.A6f(bundle2);
        }
        this.A04 = A6f;
        this.A01 = bundle.getInt(A0B, 4);
        this.A00 = bundle.getBoolean(A09, false);
        this.A05 = null;
    }

    public AD(java.lang.String str, java.lang.Throwable th, int i, int i2, java.lang.String str2, int i3, com.facebook.ads.redexgen.core.C2196qI c2196qI, int i4, com.facebook.ads.redexgen.core.C3C c3c, long j, boolean z) {
        super(str, th, i, j);
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(!z || i2 == 1);
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(th != null || i2 == 3);
        this.A03 = i2;
        this.A06 = str2;
        this.A02 = i3;
        this.A04 = c2196qI;
        this.A01 = i4;
        this.A05 = c3c;
        this.A00 = z;
    }

    public static com.facebook.ads.redexgen.core.AD A01(java.io.IOException iOException, int i) {
        return new com.facebook.ads.redexgen.core.AD(0, iOException, i);
    }

    @java.lang.Deprecated
    public static com.facebook.ads.redexgen.core.AD A02(java.lang.RuntimeException runtimeException) {
        return A03(runtimeException, 1000);
    }

    public static com.facebook.ads.redexgen.core.AD A03(java.lang.RuntimeException runtimeException, int i) {
        return new com.facebook.ads.redexgen.core.AD(2, runtimeException, i);
    }

    public static com.facebook.ads.redexgen.core.AD A04(java.lang.Throwable th, java.lang.String str, int i, com.facebook.ads.redexgen.core.C2196qI c2196qI, int i2, boolean z, int i3) {
        int i4 = i2;
        if (c2196qI == null) {
            i4 = 4;
        }
        return new com.facebook.ads.redexgen.core.AD(1, th, null, i3, str, i, c2196qI, i4, z);
    }

    public static java.lang.String A06(@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}, value = "Throwable cause - linked with Error reporting") int i, java.lang.Throwable th, java.lang.String str, java.lang.String str2, int i2, com.facebook.ads.redexgen.core.C2196qI c2196qI, int i3) {
        java.lang.String message;
        java.lang.String A05;
        if (str == null) {
            message = th == null ? null : th.getMessage();
        } else {
            message = str;
        }
        if (message != null) {
            return message;
        }
        switch (i) {
            case 0:
                A05 = A05(56, 12, 59);
                break;
            case 1:
                java.lang.StringBuilder append = new java.lang.StringBuilder().append(str2);
                java.lang.String message2 = A05(0, 14, 27);
                java.lang.StringBuilder append2 = append.append(message2).append(i2);
                java.lang.String message3 = A05(14, 9, 68);
                java.lang.StringBuilder append3 = append2.append(message3).append(c2196qI);
                java.lang.String message4 = A05(23, 19, 114);
                java.lang.StringBuilder append4 = append3.append(message4);
                java.lang.String message5 = com.facebook.ads.redexgen.core.C5C.A0g(i3);
                A05 = append4.append(message5).toString();
                break;
            case 2:
            default:
                A05 = A05(68, 24, 60);
                break;
            case 3:
                A05 = A05(44, 12, 68);
                break;
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            java.lang.StringBuilder append5 = new java.lang.StringBuilder().append(A05);
            java.lang.String message6 = A05(42, 2, 116);
            return append5.append(message6).append(str).toString();
        }
        return A05;
    }
}
