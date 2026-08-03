package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.pg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2159pg implements com.facebook.ads.redexgen.core.AnonymousClass24 {
    public static byte[] A05;
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.C2159pg> A06;
    public static final java.lang.String A07;
    public static final java.lang.String A08;
    public int A00;
    public final int A01;
    public final int A02;
    public final java.lang.String A03;
    public final com.facebook.ads.redexgen.core.C2196qI[] A04;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 15);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{95, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SYN, 17, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, 95, com.google.common.base.Ascii.SYN, 17, 95, com.google.common.base.Ascii.DLE, 17, com.google.common.base.Ascii.SUB, 95, 43, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DC4, 56, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, 10, com.google.common.base.Ascii.SI, 69, 95, 88, 100, 99, 107, 55, 49, 34, 32, 40, 99, 112, 119, Byte.MAX_VALUE, 35, 37, 54, 52, 60, 119, 103, 126, 119, 54, 57, 51, 119, 112, 62, 106, 71, 72, 72, 75, 92, 75, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 90, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SYN, 48, 35, 33, 41, 5, 48, 45, 55, 50, 50, 63, 48, 57, 43, 63, 57, 59, 45, 40, 53, 54, 63, 122, 60, 54, 59, kotlin.io.encoding.Base64.padSymbol, 41, kotlin.io.encoding.Base64.padSymbol, 38, 44};
    }

    static {
        A05();
        A07 = com.facebook.ads.redexgen.core.C5C.A0h(0);
        A08 = com.facebook.ads.redexgen.core.C5C.A0h(1);
        A06 = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.ph
            @Override // com.facebook.ads.redexgen.core.AnonymousClass23
            public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
                return com.facebook.ads.redexgen.core.C2159pg.A01(bundle);
            }
        };
    }

    public C2159pg(java.lang.String str, com.facebook.ads.redexgen.core.C2196qI... c2196qIArr) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(c2196qIArr.length > 0);
        this.A03 = str;
        this.A04 = c2196qIArr;
        this.A01 = c2196qIArr.length;
        int A01 = com.facebook.ads.redexgen.core.C3J.A01(c2196qIArr[0].A0W);
        this.A02 = A01 == -1 ? com.facebook.ads.redexgen.core.C3J.A01(c2196qIArr[0].A0S) : A01;
        A04();
    }

    public C2159pg(com.facebook.ads.redexgen.core.C2196qI... c2196qIArr) {
        this(A02(0, 0, 114), c2196qIArr);
    }

    public static int A00(int i) {
        return i | 16384;
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.C2159pg A01(android.os.Bundle bundle) {
        java.util.List A01;
        java.util.List<com.facebook.ads.androidx.media3.common.Format> formats = bundle.getParcelableArrayList(A07);
        if (formats == null) {
            A01 = com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A01();
        } else {
            A01 = com.facebook.ads.redexgen.core.AnonymousClass44.A01(com.facebook.ads.redexgen.core.C2196qI.A0b, formats);
        }
        java.lang.String id = bundle.getString(A08, A02(0, 0, 114));
        return new com.facebook.ads.redexgen.core.C2159pg(id, (com.facebook.ads.redexgen.core.C2196qI[]) A01.toArray(new com.facebook.ads.redexgen.core.C2196qI[0]));
    }

    public static java.lang.String A03(java.lang.String str) {
        return (str == null || str.equals(A02(96, 3, 71))) ? A02(0, 0, 114) : str;
    }

    private void A04() {
        java.lang.String A03 = A03(this.A04[0].A0V);
        int A00 = A00(this.A04[0].A0E);
        for (int i = 1; i < this.A04.length; i++) {
            java.lang.String language = this.A04[i].A0V;
            if (!A03.equals(A03(language))) {
                java.lang.String str = this.A04[0].A0V;
                java.lang.String str2 = this.A04[i].A0V;
                java.lang.String language2 = A02(77, 9, 81);
                A06(language2, str, str2, i);
                return;
            }
            if (A00 != A00(this.A04[i].A0E)) {
                java.lang.String binaryString = java.lang.Integer.toBinaryString(this.A04[0].A0E);
                java.lang.String binaryString2 = java.lang.Integer.toBinaryString(this.A04[i].A0E);
                java.lang.String language3 = A02(86, 10, 85);
                A06(language3, binaryString, binaryString2, i);
                return;
            }
        }
    }

    public static void A06(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        com.facebook.ads.redexgen.core.AbstractC04284g.A08(A02(67, 10, 77), A02(0, 0, 114), new java.lang.IllegalStateException(A02(57, 10, 33) + str + A02(0, 30, 112) + str2 + A02(39, 17, 88) + str3 + A02(30, 9, 76) + i + A02(56, 1, 24)));
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A07(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        for (int i = 0; i < i; i++) {
            if (c2196qI == this.A04[i]) {
                return i;
            }
        }
        return -1;
    }

    public final com.facebook.ads.redexgen.core.C2196qI A08(int i) {
        return this.A04[i];
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.facebook.ads.redexgen.core.C2159pg c2159pg = (com.facebook.ads.redexgen.core.C2159pg) obj;
        return this.A03.equals(c2159pg.A03) && java.util.Arrays.equals(this.A04, c2159pg.A04);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = this.A03.hashCode();
            this.A00 = (((17 * 31) + result) * 31) + java.util.Arrays.hashCode(this.A04);
        }
        int result2 = this.A00;
        return result2;
    }
}
