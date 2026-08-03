package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.8R, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C8R {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"n0jQ8SeFa80EBLo4BXhwXwPS4Wjubjck", "v64BeMF4Y1fRwWGkqW0btQJWsOcnPY4V", "TgQc", "Ri1mjPnDGJYW0mGh81XgbTSSpeaxgcJq", "RtYQoh190WxakJNXNOvGF0rP0AmdpNRb", "fbDVM5YfIDSRqB6n56hfMufsgfpcQx7k", "HNWTUdzo11zzvmCb4ifQA88FoSPuiiKn", "CiEa"};
    public static final com.facebook.ads.redexgen.core.C8R A04;
    public static final com.facebook.ads.redexgen.core.C8R A05;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Prevent throwing when building the map")
    public static final com.facebook.ads.redexgen.core.AbstractC2088oX<java.lang.Integer, java.lang.Integer> A06;
    public final int A00;
    public final int[] A01;

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 36);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A06() {
        byte[] bArr = {5, 9, 90, 92, 89, 89, 70, 91, 93, 76, 77, 108, 71, 74, 70, 77, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 71, 78, 90, com.google.common.base.Ascii.DC4, 81, 125, 113, 106, Byte.MAX_VALUE, 126, 6, 50, 35, 46, 40, 4, 38, 55, 38, 37, 46, 43, 46, 51, 46, 34, 52, com.google.common.base.Ascii.FS, 42, 38, 63, 4, 47, 38, 41, 41, 34, 43, 4, 40, 50, 41, 51, 122, 123, 74, 66, 76, 78, 74, 68, 52, 59, 49, 39, 58, 60, 49, 123, 56, 48, 49, 60, 52, 123, 52, 54, 33, 60, 58, 59, 123, com.google.common.base.Ascii.GS, 17, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.FS, 10, com.google.common.base.Ascii.DC4, 0, 17, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SUB, 10, 5, com.google.common.base.Ascii.EM, 0, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.RS, 17, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ESC, 81, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.RS, 81, com.google.common.base.Ascii.SUB, 7, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.RS, 81, 62, 42, 59, 54, 48, 32, 47, 51, 42, 56, 32, 44, 43, 62, 43, 58, 114, 125, 119, 97, 124, 122, 119, kotlin.io.encoding.Base64.padSymbol, 126, 118, 119, 122, 114, kotlin.io.encoding.Base64.padSymbol, 118, 107, 103, 97, 114, kotlin.io.encoding.Base64.padSymbol, 86, 93, 80, 92, 87, 90, 93, 84, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 17, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.DC4, 2, com.google.common.base.Ascii.US, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, 94, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.EM, 17, 94, com.google.common.base.Ascii.NAK, 8, 4, 2, 17, 94, kotlin.io.encoding.Base64.padSymbol, 49, 40, 47, 51, 56, 49, 62, 62, 53, 60, 47, 51, 63, 37, 62, 36, 123, 102, 106, 123, 108, 112, Byte.MAX_VALUE, 114, 65, 109, 107, 108, 108, 113, 107, 112, 122, 65, 109, 113, 107, 112, 122, 65, 123, 112, Byte.MAX_VALUE, 124, 114, 123, 122, 117, 102, 116, 102};
        java.lang.String[] strArr = A03;
        if (strArr[7].length() != strArr[2].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A03;
        strArr2[6] = "fFCHGQkYTOkakvUkxnOWQDFO0G2COwX4";
        strArr2[3] = "aKWONvT57JCa0OWG4uWHvxhg88ypYICi";
        A02 = bArr;
    }

    static {
        A06();
        A04 = new com.facebook.ads.redexgen.core.C8R(new int[]{2}, 8);
        A05 = new com.facebook.ads.redexgen.core.C8R(new int[]{2, 5, 6}, 8);
        A06 = new com.facebook.ads.redexgen.core.C2086oV().A05(5, 6).A05(17, 6).A05(7, 6).A05(18, 6).A05(6, 8).A05(8, 8).A05(14, 8).A07();
    }

    public C8R(int[] iArr, int i) {
        if (iArr != null) {
            this.A01 = java.util.Arrays.copyOf(iArr, iArr.length);
            java.util.Arrays.sort(this.A01);
        } else {
            this.A01 = new int[0];
        }
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        if (r4 == 5) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A00(int i) {
        if (com.facebook.ads.redexgen.core.C5C.A02 <= 28) {
            if (i == 7) {
                i = 8;
            } else {
                if (i != 3) {
                    if (A03[1].charAt(21) == '1') {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A03;
                    strArr[6] = "n1qXVCZQxk2N8nhnGA5Su8h2HHCkXbDi";
                    strArr[3] = "3IkXI2X5X2wTbaqU0wEl3DE4dRdq07f0";
                    if (i != 4) {
                        if (A03[0].charAt(17) == 'h') {
                            throw new java.lang.RuntimeException();
                        }
                        A03[1] = "tECYq4G9CXONPArggxwQRVOEprBCIxCW";
                    }
                }
                i = 6;
            }
        }
        if (com.facebook.ads.redexgen.core.C5C.A02 <= 26 && A05(237, 4, 55).equals(com.facebook.ads.redexgen.core.C5C.A03) && i == 1) {
            i = 2;
        }
        return com.facebook.ads.redexgen.core.C5C.A01(i);
    }

    public static int A01(int i, int i2) {
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 29) {
            return com.facebook.ads.redexgen.core.C8Q.A00(i, i2);
        }
        java.lang.Integer orDefault = A06.getOrDefault(java.lang.Integer.valueOf(i), 0);
        if (A03[1].charAt(21) == '1') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A03;
        strArr[5] = "4LwyKZxV9xzADs3TG4HwkSSUmTpMdFHu";
        strArr[4] = "TU5gCkHzG3bOz42CgVjxZ9enmRnhlx9h";
        return ((java.lang.Integer) com.facebook.ads.redexgen.core.AbstractC04203y.A01(orDefault)).intValue();
    }

    public static com.facebook.ads.redexgen.core.C8R A02(android.content.Context context) {
        android.content.Intent intent = context.registerReceiver(null, new android.content.IntentFilter(A05(68, 36, 113)));
        return A03(context, intent);
    }

    public static com.facebook.ads.redexgen.core.C8R A03(android.content.Context context, android.content.Intent intent) {
        if (A07() && android.provider.Settings.Global.getInt(context.getContentResolver(), A05(206, 31, 58), 0) == 1) {
            return A05;
        }
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 29 && (com.facebook.ads.redexgen.core.C5C.A18(context) || com.facebook.ads.redexgen.core.C5C.A17(context))) {
            return new com.facebook.ads.redexgen.core.C8R(com.facebook.ads.redexgen.core.C8Q.A01(), 8);
        }
        if (intent == null || intent.getIntExtra(A05(104, 36, 91), 0) == 0) {
            return A04;
        }
        return new com.facebook.ads.redexgen.core.C8R(intent.getIntArrayExtra(A05(140, 29, 55)), intent.getIntExtra(A05(169, 37, 84), 8));
    }

    public static boolean A07() {
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 17) {
            if (A05(21, 6, 52).equals(com.facebook.ads.redexgen.core.C5C.A05) || A05(61, 6, 7).equals(com.facebook.ads.redexgen.core.C5C.A05)) {
                return true;
            }
        }
        return false;
    }

    public final int A08() {
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r5 != (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        r0 = r9.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009b, code lost:
    
        r0 = 48000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        if (r5 != (-1)) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.util.Pair<java.lang.Integer, java.lang.Integer> A09(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        int encoding;
        int channelCount;
        int A032 = com.facebook.ads.redexgen.core.C3J.A03((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c2196qI.A0W), c2196qI.A0R);
        if (!A06.containsKey(java.lang.Integer.valueOf(A032))) {
            return null;
        }
        if (A032 == 18 && !A0A(18)) {
            A032 = 6;
        } else if (A032 == 8 && !A0A(8)) {
            A032 = 7;
        }
        if (!A0A(A032)) {
            return null;
        }
        int i = c2196qI.A06;
        java.lang.String[] strArr = A03;
        java.lang.String str = strArr[7];
        java.lang.String str2 = strArr[2];
        int length = str.length();
        int encoding2 = str2.length();
        if (length != encoding2) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A03;
        strArr2[6] = "4KpokJkqLEvhjIg40C82zBlUQNBiJ4Nh";
        strArr2[3] = "qYsciqDft0GPV223mm2sV4x00h8r6ql4";
        if (i == -1 || A032 == 18) {
            int i2 = c2196qI.A0G;
            if (A03[1].charAt(21) != '1') {
                A03[0] = "PeibxLIDNQepcsKrVJzxdcnxdYsUjYYR";
            } else {
                java.lang.String[] strArr3 = A03;
                strArr3[6] = "BgZH8BuYmZ4E43z5yTU6VaJsu5Ivkzql";
                strArr3[3] = "qg4irZvxQMOGKPEC5vFhWWygbOBgLyYA";
            }
            channelCount = A01(A032, encoding);
        } else {
            channelCount = c2196qI.A06;
            int encoding3 = this.A00;
            if (channelCount > encoding3) {
                return null;
            }
        }
        int encoding4 = A00(channelCount);
        if (encoding4 == 0) {
            return null;
        }
        return android.util.Pair.create(java.lang.Integer.valueOf(A032), java.lang.Integer.valueOf(encoding4));
    }

    public final boolean A0A(int i) {
        return java.util.Arrays.binarySearch(this.A01, i) >= 0;
    }

    public final boolean A0B(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        return A09(c2196qI) != null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.facebook.ads.redexgen.core.C8R)) {
            return false;
        }
        com.facebook.ads.redexgen.core.C8R c8r = (com.facebook.ads.redexgen.core.C8R) obj;
        return java.util.Arrays.equals(this.A01, c8r.A01) && this.A00 == c8r.A00;
    }

    public final int hashCode() {
        return this.A00 + (java.util.Arrays.hashCode(this.A01) * 31);
    }

    public final java.lang.String toString() {
        return A05(27, 34, 99) + this.A00 + A05(0, 21, 13) + java.util.Arrays.toString(this.A01) + A05(67, 1, 61);
    }
}
