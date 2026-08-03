package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Rc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0996Rc implements com.facebook.ads.internal.api.AdSettingsApi {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"5g08JbOH8rkW6qlmlOL6A29nsZk", "3r4qaOnTaYokldocBIi2hcDPsInD4tfb", "t1tpXM0pz4jVDPHhq8DkXYPWitYDcWj1", "M2cS8KouRYddMtKm0nW0nVVXMs", "pym3fLCD1Tj466B1DlzVQDM4sLBUPDKC", "ku7CSS8RQpD6IDBrWEnqwcDf2zEQuZtv", "vquYYtSubxB68XLpTdo3CiQszZtPPcit", "yyxMEkIlFEzZN5mv2HKHli04TbghSWGE"};
    public static final java.lang.String A02;
    public static final java.util.Collection<java.lang.String> A03;
    public static volatile boolean A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
            java.lang.String[] strArr = A01;
            if (strArr[7].charAt(16) == strArr[1].charAt(16)) {
                throw new java.lang.RuntimeException();
            }
            A01[0] = "ed4gaD";
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{com.google.common.base.Ascii.SO, 5, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SI, 8, com.google.common.base.Ascii.SO, 3, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM, 10, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.US, com.google.common.base.Ascii.EM, 3, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.CAN, 3, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC4, 3, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.EM, 5, 90, 107, 125, 122, 46, 99, 97, 106, 107, 46, 106, 107, 120, 103, 109, 107, 46, 102, 111, 125, 102, 52, 46, 71, 120, 117, 126, 48, 100, 117, 99, 100, 121, 126, 119, 48, 105, Byte.MAX_VALUE, 101, 98, 48, 113, 96, 96, 48, 103, 121, 100, 120, 48, 86, 113, 115, 117, 114, Byte.MAX_VALUE, Byte.MAX_VALUE, 123, 55, 99, 48, 113, 116, 48, 101, 126, 121, 100, 99, 48, 105, Byte.MAX_VALUE, 101, 48, 125, 101, 99, 100, 48, 99, 96, 117, 115, 121, 118, 105, 48, 100, 120, 117, 48, 116, 117, 102, 121, 115, 117, 48, 120, 113, 99, 120, 117, 116, 48, 89, 84, 48, 100, Byte.MAX_VALUE, 48, 117, 126, 99, 101, 98, 117, 48, 100, 120, 117, 48, 116, 117, 124, 121, 102, 117, 98, 105, 48, Byte.MAX_VALUE, 118, 48, 100, 117, 99, 100, 48, 113, 116, 99, 60, 48, 113, 116, 116, 48, 100, 120, 117, 48, 118, Byte.MAX_VALUE, 124, 124, Byte.MAX_VALUE, 103, 121, 126, 119, 48, 115, Byte.MAX_VALUE, 116, 117, 48, 114, 117, 118, Byte.MAX_VALUE, 98, 117, 48, 124, Byte.MAX_VALUE, 113, 116, 121, 126, 119, 48, 113, 126, 48, 113, 116, 42, 48, 81, 116, 67, 117, 100, 100, 121, 126, 119, 99, 62, 113, 116, 116, 68, 117, 99, 100, 84, 117, 102, 121, 115, 117, 56, 50, 7, 6, com.google.common.base.Ascii.NAK, 10, 0, 6, 42, 7, 43, 2, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.VT, 103, 111, 111, 103, 108, 101, 95, 115, 100, 107, 126, 105, 102, com.google.common.base.Ascii.DLE, 4, 9, com.google.common.base.Ascii.RS, 94, 80, com.google.common.base.Ascii.SYN, 124, 104, 101, 114, 50, 60, 126, 122};
    }

    static {
        A01();
        A02 = com.facebook.ads.internal.settings.AdInternalSettings.class.getSimpleName();
        A03 = new java.util.HashSet();
        A03.add(A00(262, 3, 66));
        A03.add(A00(252, 10, 79));
        A03.add(A00(265, 7, 41));
        A03.add(A00(272, 8, 69));
        A04 = false;
    }

    public static void A02(java.lang.String str) {
        if (A04) {
            return;
        }
        A04 = true;
        android.util.Log.i(A02, A00(25, 23, 65) + str);
        android.util.Log.i(A02, A00(48, 192, 95) + str + A00(0, 3, 99));
    }

    @Override // com.facebook.ads.internal.api.AdSettingsApi
    public final boolean isTestMode(android.content.Context context) {
        if (!com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild() && !com.facebook.ads.internal.settings.AdInternalSettings.isExplicitTestMode()) {
            java.util.Collection<java.lang.String> collection = A03;
            java.lang.String str = android.os.Build.PRODUCT;
            java.lang.String[] strArr = A01;
            if (strArr[7].charAt(16) == strArr[1].charAt(16)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[7] = "T4gBNxEGe37wgzXKS7GC3py1fkLao5wI";
            strArr2[1] = "pVb2nflAxo98tm2kzzD3dq5aQ79B8LIX";
            if (!collection.contains(str)) {
                com.facebook.ads.internal.settings.MultithreadedBundleWrapper multithreadedBundleWrapper = com.facebook.ads.internal.settings.AdInternalSettings.sSettingsBundle;
                java.lang.String A002 = A00(3, 22, 19);
                java.lang.String string = multithreadedBundleWrapper.getString(A002, null);
                if (string == null) {
                    android.content.SharedPreferences A003 = com.facebook.ads.redexgen.core.WN.A00(context);
                    java.lang.String A004 = A00(240, 12, 44);
                    string = A003.getString(A004, null);
                    if (android.text.TextUtils.isEmpty(string)) {
                        string = java.util.UUID.randomUUID().toString();
                        android.content.SharedPreferences.Editor edit = A003.edit();
                        java.lang.String[] strArr3 = A01;
                        if (strArr3[7].charAt(16) != strArr3[1].charAt(16)) {
                            A01[3] = "RjRRqTdr5YFfB1Oiza3DhfcwhE";
                            edit.putString(A004, string).apply();
                        } else {
                            edit.putString(A004, string).apply();
                        }
                    }
                    com.facebook.ads.internal.settings.AdInternalSettings.sSettingsBundle.putString(A002, string);
                }
                if (com.facebook.ads.internal.settings.AdInternalSettings.getTestDevicesList().contains(string)) {
                    return true;
                }
                A02(string);
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.ads.internal.api.AdSettingsApi
    public final void turnOnDebugger() {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A02();
    }
}
