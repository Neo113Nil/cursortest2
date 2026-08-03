package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Xt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1163Xt {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"LplfTEYRnODnDpz21EneRZRsMargZTNK", "2NrlLG7hqMfWnzI4aYc74QPIxJ4DJ1XR", "L7pmDhfbtl8pdMobHzydLQ1D6YOazgIb", "V9Kuj32Ww6lLhCXMI4XEd9rHt60G9lJq", "k0plFnx6zt0D5xnpu3Hlko5", "WGZsYEfxfTD4T7Cqe3yCHw86dz09xOKF", "rh2k8IOHNldhKVbVonTuZ6bN28ke0n", "kkjOWDxiYS6HSpJcTpvH6ub4oru0qlUQ"};
    public static final java.util.regex.Pattern A02;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 44);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{com.google.common.base.Ascii.CR, 121, 86, com.google.common.base.Ascii.SO, 68, 81, 121, 86, com.google.common.base.Ascii.SO, 126, 68, 8, 95, com.google.common.base.Ascii.VT, 120, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.FF, 126, 100, 8, Byte.MAX_VALUE, 120, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SI, 125, 75, 76, 76, 91, 80, 74, com.google.common.base.Ascii.RS, 77, 74, 95, 93, 85, com.google.common.base.Ascii.RS, 74, 76, 95, 93, 91, 77, 65, 67, 0, 72, 79, 77, 75, 76, 65, 65, 69, 0, 79, 74, 93};
    }

    static {
        A07();
        A02 = java.util.regex.Pattern.compile(A02(0, 24, 9));
    }

    public static java.lang.String A00() {
        return A06(new java.lang.Exception(A02(24, 19, 18)), -1, -1, false);
    }

    public static java.lang.String A01(int i) {
        if (i <= 0) {
            return null;
        }
        float rate = new java.util.Random().nextFloat();
        if (rate >= 1.0f / i) {
            return null;
        }
        return A00();
    }

    public static java.lang.String A03(android.content.Context context, java.lang.Throwable th) {
        int A0M = com.facebook.ads.redexgen.core.C1086Up.A0M(context);
        int maxStacktraceLines = com.facebook.ads.redexgen.core.C1086Up.A03(context);
        return A06(th, A0M, maxStacktraceLines, com.facebook.ads.redexgen.core.C1086Up.A1h(context));
    }

    public static java.lang.String A04(java.lang.String str) {
        java.util.regex.Matcher matcher = A02.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return str;
    }

    public static java.lang.String A06(java.lang.Throwable th, int i, int i2, boolean z) {
        java.lang.String A022 = A02(0, 0, 105);
        if (th == null) {
            return A022;
        }
        try {
            com.facebook.ads.redexgen.core.QK qk = new com.facebook.ads.redexgen.core.QK();
            com.facebook.ads.redexgen.core.InterfaceC1161Xr interfaceC1161Xr = qk;
            java.lang.String[] strArr = A01;
            if (strArr[4].length() == strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[4] = "oxxlcYcFfaMihpA7yH6yiqF";
            strArr2[6] = "gkLsRpbpRAovdKGTxU7IYJzRyz6pLt";
            if (i2 >= 0) {
                interfaceC1161Xr = new com.facebook.ads.redexgen.core.QI(interfaceC1161Xr, i2);
            }
            if (i >= 0) {
                interfaceC1161Xr = new com.facebook.ads.redexgen.core.QF(interfaceC1161Xr, i, i);
            }
            if (z) {
                interfaceC1161Xr = new com.facebook.ads.redexgen.core.QJ(interfaceC1161Xr);
            }
            com.facebook.ads.redexgen.core.QL ql = new com.facebook.ads.redexgen.core.QL(qk, 1, interfaceC1161Xr);
            th.printStackTrace(new java.io.PrintWriter(new com.facebook.ads.redexgen.core.C1162Xs(ql)));
            ql.flush();
            return qk.toString();
        } catch (java.lang.Exception unused) {
            return A022;
        }
    }

    public static boolean A08(com.facebook.ads.redexgen.core.C1160Xq c1160Xq) {
        java.lang.String middle = c1160Xq.A02();
        if (middle == null) {
            return false;
        }
        boolean A0A = A0A(middle);
        if (A01[7].charAt(20) == 'o') {
            throw new java.lang.RuntimeException();
        }
        A01[2] = "GqDFUg33w18rdOydcZHrPduzmWx6ZxUu";
        if (A0A) {
            return true;
        }
        for (java.lang.String str : c1160Xq.A01()) {
            if (A01[2].charAt(10) != '8') {
                if (A0A(str)) {
                    return true;
                }
            } else {
                java.lang.String[] strArr = A01;
                strArr[5] = "ZCUrIEQiGOY9U2nVCEFSNgqRdbKvDffQ";
                strArr[0] = "2Hs1eEyuwWDgIwWONAgBlK6IqUqjA257";
                if (A0A(str)) {
                    return true;
                }
            }
        }
        java.util.Iterator<java.lang.String> it = c1160Xq.A00().iterator();
        while (it.hasNext()) {
            if (A0A(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0A(java.lang.String str) {
        return str.contains(A02(43, 16, 2));
    }
}
