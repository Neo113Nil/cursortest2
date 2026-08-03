package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class YW {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"cuUzkH3QdbH3cJp2RF", "kphHRdIOrc0r15jsPfyG2Jy", "YnKzEWoXtdzuP95TROGjIP", "O6qhnuon9ci7avdCdn", "JszjlqJauoZ2AkEe", "2iwMqZkAQKEhQz1BEXGjAw", "tv2fwm9vcfvUl0RC5d9GYW3eB7CSJdU", "VWHYkG5jfvcYH9oXKfgyVS7MLxk2p9iO"};
    public static final java.lang.String A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A01;
            if (strArr[3].length() != strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[3] = "jOZxNa7dXP1jVDPJoO";
            strArr2[0] = "z9aGKGtKVlVAFuhw7X";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 48);
            i4++;
        }
    }

    public static void A02() {
        A00 = new byte[]{79, 119, 122, 71, 92, 90, 79, 75, 86, 80, 81, com.google.common.base.Ascii.US, 86, 81, com.google.common.base.Ascii.US, 72, 86, 81, 91, 80, 72, com.google.common.base.Ascii.US, 86, 81, 89, 80, com.google.common.base.Ascii.US, 92, 87, 90, 92, 84, 98, 108, 112, 110, 124, 104, 123, 109, 91, 87, 66, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SYN, 4, 96, 113, 115, 124, 112, 117, 100, 113, 117, 110, 96, 99};
    }

    static {
        A02();
        A02 = com.facebook.ads.redexgen.core.YW.class.getSimpleName();
    }

    public static java.util.Map<java.lang.String, java.lang.String> A01(@javax.annotation.Nullable com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        android.view.Window window;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (c1636gi == null) {
            return hashMap;
        }
        try {
            hashMap.put(A00(40, 3, 0), java.lang.String.valueOf(A04(c1636gi)));
            android.app.Activity A0E = c1636gi.A0E();
            if (A0E != null && (window = A0E.getWindow()) != null) {
                int i = window.getAttributes().flags;
                int flags = window.getAttributes().type;
                hashMap.put(A00(58, 2, 39), java.lang.Integer.toString(flags));
                int type = 4194304 & i;
                java.lang.String A002 = A00(1, 1, 118);
                java.lang.String flagDismissKeyguardEnabled = A00(0, 1, 79);
                hashMap.put(A00(48, 5, 39), type > 0 ? A002 : flagDismissKeyguardEnabled);
                int type2 = 524288 & i;
                if (A01[6].length() == 6) {
                    throw new java.lang.RuntimeException();
                }
                A01[7] = "5jjmsuOSeLdxH4ITovSaNkR7tPO8fpvx";
                if (type2 <= 0) {
                    A002 = flagDismissKeyguardEnabled;
                }
                hashMap.put(A00(53, 5, 50), A002);
            }
        } catch (java.lang.Exception e) {
            android.util.Log.e(A02, A00(2, 30, 15), e);
            com.facebook.ads.redexgen.core.InterfaceC1047Tc A08 = c1636gi.A08();
            int type3 = com.facebook.ads.redexgen.core.AbstractC1048Td.A2T;
            A08.ABC(A00(43, 5, 77), type3, new com.facebook.ads.redexgen.core.C1049Te(e));
        }
        return hashMap;
    }

    public static boolean A03(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        return !com.facebook.ads.redexgen.core.YC.A04(A01(c1636gi));
    }

    public static boolean A04(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) c1636gi.getSystemService(A00(32, 8, 57));
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }
}
