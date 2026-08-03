package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class U2 {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static java.lang.String[] A03 = {"i0FOsf0o9fpBvAlaEaGgnCYFRbNnwBKJ", "ZsBa2nEfyhltTo", "ZG6g5nWnUhxh", "6zjosiDwJWE47kuMvKAUCDrCWUeR8P3q", "Gh89HIHHDqfPtiuASbXLVil627eRz", "Lsbp3nhJR34oAmuvtJAouWbaxC4Ny9OM", "s0Y", "C"};
    public static final java.util.concurrent.atomic.AtomicBoolean A04;
    public static final java.util.concurrent.atomic.AtomicBoolean A05;
    public static final java.util.concurrent.atomic.AtomicBoolean A06;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 33);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-89, -39, -39, -89, -39, -88, -40, -84, -54, -58, -59, -7, -24, -19, -23, -14, -25, -23, -46, -23, -8, -5, -13, -10, -17, -88, -103, -96, 117, -66, -61, -66, -55, -66, -74, -63, -66, -49, -74, -55, -66, -60, -61, 117, -56, -55, -74, -57, -55, -70, -71, -84, -67, -60, 121, -48, -70, -52, 121, -70, -59, -53, -66, -70, -67, -46, 121, -62, -57, -62, -51, -62, -70, -59, -62, -45, -66, -67, 122, 121, -84, -60, -62, -55, -55, -62, -57, -64, -121, -90, -68, -62, 109, -79, -68, -69, 116, -63, 109, -80, -82, -71, -71, 109, -114, -62, -79, -74, -78, -69, -80, -78, -101, -78, -63, -60, -68, -65, -72, -114, -79, -64, 123, -74, -69, -74, -63, -74, -82, -71, -74, -57, -78, 117, 118, 123, 109, -96, -68, -70, -78, 109, -77, -62, -69, -80, -63, -74, -68, -69, -82, -71, -74, -63, -58, 109, -70, -82, -58, 109, -69, -68, -63, 109, -60, -68, -65, -72, 109, -67, -65, -68, -67, -78, -65, -71, -58, 123, -120, -105, -112, -58, -52, -63, -45, -56, 0, 6, -5, com.google.common.base.Ascii.CR, 2, -7, -3, 9, 8, 0, 3, 1, -42, -44, -35, -44, -31, -40, -46, -3, 2, -3, 8, -3, -11, 0, -3, com.google.common.base.Ascii.SO, -7, -51, -46, -51, -40, -51, -59, -48, -51, -34, -55, -116, -115, -124, -46, -45, -40, -124, -57, -59, -48, -48, -55, -56, -110, 1, -10, 8, 9, -12, 7, -6, 8, 10, 1, 9};
    }

    static {
        A03();
        A06 = new java.util.concurrent.atomic.AtomicBoolean();
        A04 = new java.util.concurrent.atomic.AtomicBoolean();
        A05 = new java.util.concurrent.atomic.AtomicBoolean();
    }

    public static com.facebook.ads.redexgen.core.C1480eB A00() {
        return new com.facebook.ads.redexgen.core.C1480eB();
    }

    public static com.facebook.ads.redexgen.core.C1479eA A01(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        return new com.facebook.ads.redexgen.core.C1479eA(c1632ge);
    }

    public static void A04(com.facebook.ads.AudienceNetworkAds.InitListener initListener, com.facebook.ads.AudienceNetworkAds.InitResult initResult) {
        com.facebook.ads.redexgen.core.Y4.A01.execute(new com.facebook.ads.redexgen.core.C1481eC(initListener, initResult));
    }

    public static void A06(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        if (com.facebook.ads.redexgen.core.AbstractC1088Ur.A0P(c1632ge) && !A05.getAndSet(true)) {
            try {
                java.lang.Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = new com.facebook.ads.redexgen.core.TT(java.lang.Thread.getDefaultUncaughtExceptionHandler(), c1632ge, new com.facebook.ads.redexgen.core.C1414d6());
                java.lang.Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
            } catch (java.lang.Exception e) {
                c1632ge.A08().ABC(A02(198, 7, 78), com.facebook.ads.redexgen.core.AbstractC1048Td.A1X, new com.facebook.ads.redexgen.core.C1049Te(e));
            }
        }
    }

    public static void A07(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        A0H(c1632ge, null, null, 3);
    }

    public static void A08(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        A0H(c1632ge, null, null, 3);
    }

    public static void A09(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        if (com.facebook.ads.redexgen.core.C1086Up.A2O(c1632ge)) {
            A0F(c1632ge, 0);
        }
        if (com.facebook.ads.redexgen.core.C1086Up.A2X(c1632ge)) {
            A0B(c1632ge);
        }
    }

    public static void A0A(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        if (com.facebook.ads.redexgen.core.C1086Up.A2P(c1632ge)) {
            java.lang.String[] strArr = A03;
            if (strArr[1].length() == strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A03;
            strArr2[1] = "XjvPwbQrSqkAxC";
            strArr2[6] = "skO";
            A0G(c1632ge, null, 3);
        }
    }

    public static void A0B(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        com.facebook.ads.redexgen.core.YG.A06.execute(new com.facebook.ads.redexgen.core.C1482eD(c1632ge));
    }

    public static void A0C(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        com.facebook.ads.redexgen.core.OP.A02(c1632ge);
        com.facebook.ads.redexgen.core.TX.A0C(c1632ge, new com.facebook.ads.redexgen.core.C1384cc(c1632ge), new com.facebook.ads.redexgen.core.C1532f2(), com.facebook.ads.internal.api.BuildConfigApi.isDebug());
        c1632ge.A0A();
        A0D(c1632ge);
    }

    public static void A0D(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        if (com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
            return;
        }
        android.content.SharedPreferences sharedPreferences = com.facebook.ads.internal.dynamicloading.FlashPreferences.getSharedPreferences(c1632ge);
        java.lang.String string = sharedPreferences.getString(A02(186, 12, 121), null);
        java.lang.String string2 = sharedPreferences.getString(A02(239, 11, 116), null);
        if (string != null && string2 != null) {
            com.facebook.ads.redexgen.core.InterfaceC1047Tc A08 = c1632ge.A08();
            com.facebook.ads.redexgen.core.C1049Te c1049Te = new com.facebook.ads.redexgen.core.C1049Te(string2);
            java.lang.String flashConfig = A02(181, 5, 63);
            A08.ABz(flashConfig, 3701, c1049Te);
        }
    }

    public static void A0F(com.facebook.ads.redexgen.core.C1632ge c1632ge, int i) {
        com.facebook.ads.redexgen.core.T7.A01(c1632ge);
        if (A04.getAndSet(true)) {
            return;
        }
        if (com.facebook.ads.internal.settings.AdInternalSettings.isDebugBuild() || com.facebook.ads.internal.settings.AdInternalSettings.isDebuggerOn()) {
            com.facebook.ads.redexgen.core.AbstractC1119Vy.A02();
        }
        A06(c1632ge);
        com.facebook.ads.redexgen.core.AbstractC1126Wf.A00(com.facebook.ads.redexgen.core.C1086Up.A0q(c1632ge), com.facebook.ads.internal.api.BuildConfigApi.isDebug(), A00(), A01(c1632ge));
        com.facebook.ads.redexgen.core.C1027Si.A03(com.facebook.ads.redexgen.core.C1086Up.A04(c1632ge));
        if (!com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
            com.facebook.ads.redexgen.core.C1605gD.A09(new com.facebook.ads.redexgen.core.C1470e1(c1632ge));
        }
        if (i == 3) {
            android.util.Log.e(A02(8, 17, 99), A02(89, 89, 44));
            c1632ge.A08().ABz(A02(178, 3, 6), com.facebook.ads.redexgen.core.AbstractC1048Td.A0R, new com.facebook.ads.redexgen.core.C1049Te(A02(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 24, 67)));
        }
        com.facebook.ads.internal.util.activity.ActivityUtils.A04(c1632ge, com.facebook.ads.AudienceNetworkActivity.class);
        com.facebook.ads.redexgen.core.YG.A05(c1632ge);
        com.facebook.ads.redexgen.core.VL.A05(c1632ge);
        com.facebook.ads.redexgen.core.N8.A01(c1632ge);
        if (com.facebook.ads.redexgen.core.C1086Up.A16(c1632ge)) {
            com.facebook.ads.redexgen.core.RX.A00(c1632ge);
        }
        if (com.facebook.ads.redexgen.core.C1086Up.A1z(c1632ge)) {
            com.facebook.ads.redexgen.core.ZR.A02().A90(c1632ge);
        }
    }

    public static void A0G(com.facebook.ads.redexgen.core.C1632ge c1632ge, com.facebook.ads.AudienceNetworkAds.InitListener initListener, int i) {
        com.facebook.ads.redexgen.core.T7.A01(c1632ge);
        boolean z = false;
        synchronized (com.facebook.ads.redexgen.core.U2.class) {
            boolean execute = A00;
            if (!execute) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        boolean execute2 = A01;
                        if (!execute2) {
                            A01 = true;
                            z = true;
                        }
                    }
                }
                A00 = true;
                z = true;
            }
        }
        if (z) {
            A0F(c1632ge, i);
            com.facebook.ads.redexgen.core.YG.A08.execute(new com.facebook.ads.redexgen.core.C1507ed(c1632ge, initListener));
        } else {
            if (i != 1) {
                return;
            }
            java.lang.String A022 = A02(51, 38, 56);
            if (initListener != null) {
                A04(initListener, new com.facebook.ads.redexgen.core.U1(true, A022));
            } else {
                android.util.Log.w(A02(8, 17, 99), A022);
            }
        }
    }

    public static void A0H(com.facebook.ads.redexgen.core.C1632ge c1632ge, com.facebook.ads.internal.settings.MultithreadedBundleWrapper multithreadedBundleWrapper, com.facebook.ads.AudienceNetworkAds.InitListener initListener, int i) {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A02(205, 10, 115), A02(25, 26, 52), A02(0, 8, 82));
        com.facebook.ads.redexgen.core.C1605gD.A06();
        A0G(c1632ge, initListener, i);
    }

    public static synchronized boolean A0I() {
        boolean z;
        synchronized (com.facebook.ads.redexgen.core.U2.class) {
            z = A00;
        }
        return z;
    }
}
