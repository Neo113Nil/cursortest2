package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class OX {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"alBbxktHBjENZciLxR6rw2zD", "0bEVAsoxw6W3iWGX6BxBwig2lvfARzA8", "5kBw8VexBy79GKA0j07dIkKJ", "062DxPuwmCK6gWRcItF5YTW3Hm4KDyy6", "ouexH0ba", "qAJVUQLE", "GBKgEyO20ouPxSasMb", "BGZyEH20hLZ9tDha5NwFDNnmUBWPcH0M"};

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A01;
            if (strArr[3].charAt(0) != strArr[1].charAt(0)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[5] = "tBRy7z9w";
            strArr2[4] = "5uJXeywj";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 69);
            i4++;
        }
    }

    public static void A07() {
        A00 = new byte[]{-32, -40, -36, -37, -40, -38, -2, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.VT, 8, com.google.common.base.Ascii.ESC, 1, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.FF, 8, 5, -1, 5, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.DLE, 1, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ESC, 9, com.google.common.base.Ascii.VT, 0, 1, com.google.common.base.Ascii.ESC, 7, 1, com.google.common.base.Ascii.NAK, -66, -53, -53, -56, -37, -59, -49, -37, -62, -47, -54, -54, -63, -56, -37, -56, -53, -61, -61, -63, -64, -119, -106, -106, -109, -90, -112, -102, -90, -100, -107, -112, -101, -96, -56, -43, -43, -46, -27, -45, -49, -34, -53, -54, -27, -57, -37, -54, -49, -53, -44, -55, -53, -27, -47, -53, -33, -94, -81, -81, -84, -65, -78, -74, -65, -90, -95, -87, -84, -65, -81, -82, -65, -93, -95, -93, -88, -91, -65, -90, -95, -87, -84, -75, -78, -91, -65, -85, -91, -71, -40, -21, -28, -38, -30, -37, -11, -23, -37, -22, -22, -33, -28, -35, -23, -11, -31, -37, -17, -40, -43, -24, -43, -13, -28, -26, -29, -41, -39, -25, -25, -35, -30, -37, -13, -29, -28, -24, -35, -29, -30, -25, -13, -41, -29, -23, -30, -24, -26, -19, -13, -33, -39, -19, -64, -67, -48, -67, -37, -52, -50, -53, -65, -63, -49, -49, -59, -54, -61, -37, -53, -52, -48, -59, -53, -54, -49, -37, -57, -63, -43, -7, -10, 9, -10, com.google.common.base.Ascii.DC4, 5, 7, 4, -8, -6, 8, 8, -2, 3, -4, com.google.common.base.Ascii.DC4, 4, 5, 9, -2, 4, 3, 8, com.google.common.base.Ascii.DC4, 8, 9, -10, 9, -6, com.google.common.base.Ascii.DC4, 0, -6, com.google.common.base.Ascii.SO, -80, -79, -81, -68, -98, -95, -68, -94, -75, -83, -94, -81, -90, -94, -85, -96, -94, -68, -79, -74, -83, -94, -28, -27, -29, -16, -46, -43, -16, -38, -43, -16, -36, -42, -22, com.google.common.base.Ascii.DLE, 17, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FS, -2, 1, com.google.common.base.Ascii.FS, 17, 2, com.google.common.base.Ascii.DLE, 17, com.google.common.base.Ascii.FS, 17, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.CR, 2, com.google.common.base.Ascii.FS, 8, 2, com.google.common.base.Ascii.SYN, -86, -85, -87, -74, -103, -96, -101, -74, -89, -104, -80, -93, -90, -104, -101, -74, -94, -100, -80, -53, -52, -54, -41, -70, -52, -41, -52, -57, -61, -67, -58, -41, -67, -48, -52, -54, -71, -53, -74, -73, -75, -62, -91, -72, -79, -89, -81, -88, -62, -82, -88, -68, -8, -7, -9, 4, -24, -15, -18, -22, -13, -7, 4, -8, -23, -16, 4, -5, -22, -9, -8, -18, -12, -13, -104, -103, -105, -92, -118, -99, -103, -105, -122, -92, -115, -114, -109, -103, -104, -92, -112, -118, -98, -8, -7, -9, 4, -18, -13, -7, 4, -24, -26, -24, -19, -22, 4, -21, -15, -26, -20, -8, -6, -5, -7, 6, -12, -20, -21, -16, -24, -5, -16, -10, -11, 6, -21, -24, -5, -24, 6, -14, -20, 0, -39, -38, -40, -27, -45, -53, -54, -49, -57, -38, -49, -43, -44, -27, -39, -53, -40, -36, -49, -55, -53, -27, -47, -53, -33, -88, -87, -89, -76, -91, -95, -106, -104, -102, -94, -102, -93, -87, -76, -96, -102, -82};
    }

    static {
        A07();
    }

    public static android.os.Bundle A00(com.facebook.ads.redexgen.core.T8 t8) {
        android.os.Bundle bundle = new android.os.Bundle();
        A08(bundle, t8);
        java.lang.String A06 = A06(123, 19, 81);
        android.os.Bundle data = A01(t8);
        bundle.putBundle(A06, data);
        return bundle;
    }

    public static android.os.Bundle A01(com.facebook.ads.redexgen.core.T8 t8) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean(A06(67, 23, 65), com.facebook.ads.AdSettings.isMixedAudience());
        bundle.putBoolean(A06(6, 27, 119), com.facebook.ads.internal.settings.AdInternalSettings.isExplicitTestMode());
        java.lang.String adTypeString = com.facebook.ads.AdSettings.getTestAdType().getAdTypeString();
        if (adTypeString != null) {
            bundle.putString(A06(272, 20, 120), adTypeString);
        }
        com.facebook.ads.internal.settings.MultithreadedBundleWrapper multithreadedBundleWrapper = com.facebook.ads.internal.settings.AdInternalSettings.sSettingsBundle;
        java.lang.String adTypeString2 = A06(177, 27, 55);
        java.lang.String[] stringArray = multithreadedBundleWrapper.getStringArray(adTypeString2);
        if (stringArray != null) {
            bundle.putStringArray(adTypeString2, stringArray);
        }
        com.facebook.ads.internal.settings.MultithreadedBundleWrapper multithreadedBundleWrapper2 = com.facebook.ads.internal.settings.AdInternalSettings.sSettingsBundle;
        java.lang.String adTypeString3 = A06(142, 35, 79);
        java.lang.Integer integer = multithreadedBundleWrapper2.getInteger(adTypeString3);
        if (integer != null) {
            bundle.putInt(adTypeString3, integer.intValue());
        }
        com.facebook.ads.internal.settings.MultithreadedBundleWrapper multithreadedBundleWrapper3 = com.facebook.ads.internal.settings.AdInternalSettings.sSettingsBundle;
        java.lang.String adTypeString4 = A06(204, 33, 112);
        java.lang.Integer integer2 = multithreadedBundleWrapper3.getInteger(adTypeString4);
        if (integer2 != null) {
            bundle.putInt(adTypeString4, integer2.intValue());
        }
        com.facebook.ads.internal.settings.MultithreadedBundleWrapper multithreadedBundleWrapper4 = com.facebook.ads.internal.settings.AdInternalSettings.sSettingsBundle;
        java.lang.String adTypeString5 = A06(426, 25, 65);
        java.lang.String string = multithreadedBundleWrapper4.getString(adTypeString5, null);
        if (string != null) {
            bundle.putString(adTypeString5, string);
        }
        bundle.putBoolean(A06(54, 13, 2), com.facebook.ads.redexgen.core.XY.A05(t8));
        return bundle;
    }

    public static android.os.Bundle A02(java.lang.String str, com.facebook.ads.redexgen.core.C1746iY c1746iY) {
        android.os.Bundle bundle = new android.os.Bundle();
        A08(bundle, c1746iY.A05());
        bundle.putString(A06(451, 17, 16), c1746iY.A0A());
        bundle.putString(A06(259, 13, 76), str);
        bundle.putString(A06(292, 19, 18), c1746iY.A07());
        bundle.putString(A06(366, 19, 0), c1746iY.A08());
        bundle.putString(A06(com.ironsource.InterfaceC3141l1.a.b.d, 22, 98), c1746iY.A09());
        bundle.putString(A06(385, 19, 96), com.facebook.ads.redexgen.core.OT.A01(c1746iY.A0B()));
        com.facebook.ads.RewardData A03 = c1746iY.A03();
        if (A03 != null) {
            com.facebook.ads.redexgen.core.OY.A00(bundle, A03);
        }
        com.facebook.ads.redexgen.core.C1636gi A05 = c1746iY.A05();
        if (A01[7].charAt(1) != 'G') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A01;
        strArr[3] = "0oVBtG1RnxV7P3aL2rsTsgmpFLriyJEV";
        strArr[1] = "0Gc5rqVWsYOknMrZ8UJ0maJdrGSSYWXy";
        bundle.putBundle(A06(123, 19, 81), A01(A05));
        return bundle;
    }

    public static android.os.Bundle A03(java.lang.String str, com.facebook.ads.redexgen.core.C1731iI c1731iI) {
        android.os.Bundle bundle = new android.os.Bundle();
        A08(bundle, c1731iI.A0B);
        bundle.putString(A06(451, 17, 16), c1731iI.A0D);
        bundle.putString(A06(259, 13, 76), str);
        bundle.putString(A06(292, 19, 18), c1731iI.A05);
        bundle.putString(A06(366, 19, 0), c1731iI.A06);
        bundle.putString(A06(com.ironsource.InterfaceC3141l1.a.b.d, 22, 98), c1731iI.A07);
        com.facebook.ads.AdExperienceType adExperienceType = c1731iI.A02;
        if (adExperienceType != null) {
            bundle.putString(A06(237, 22, 24), com.facebook.ads.redexgen.core.OS.A02(adExperienceType));
        }
        bundle.putBoolean(A06(90, 33, 27), c1731iI.A08);
        com.facebook.ads.RewardData rewardData = c1731iI.A03;
        if (rewardData != null) {
            com.facebook.ads.redexgen.core.OY.A00(bundle, rewardData);
        }
        bundle.putBundle(A06(123, 19, 81), A01(c1731iI.A0B));
        return bundle;
    }

    public static com.facebook.ads.redexgen.core.C1746iY A04(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.os.Bundle bundle, java.lang.String str) {
        java.lang.String string = bundle.getString(A06(451, 17, 16));
        java.lang.String placement = A06(292, 19, 18);
        java.lang.String string2 = bundle.getString(placement);
        java.lang.String placement2 = A06(366, 19, 0);
        java.lang.String string3 = bundle.getString(placement2);
        java.lang.String placement3 = A06(com.ironsource.InterfaceC3141l1.a.b.d, 22, 98);
        java.lang.String sdkVersion = bundle.getString(placement3);
        java.lang.String placement4 = A06(344, 22, 96);
        java.lang.String string4 = bundle.getString(placement4);
        java.lang.String placement5 = A06(123, 19, 81);
        android.os.Bundle bundle2 = bundle.getBundle(placement5);
        if (bundle2 == null) {
            bundle2 = new android.os.Bundle();
        }
        if (string == null) {
            string = A06(0, 0, 60);
        }
        com.facebook.ads.redexgen.core.C1746iY c1746iY = new com.facebook.ads.redexgen.core.C1746iY(c1636gi, null, string, new com.facebook.ads.redexgen.core.C1737iP(str, string4, bundle2));
        c1746iY.A0I(string3);
        c1746iY.A0H(string2);
        c1746iY.A0J(sdkVersion);
        java.lang.String placement6 = A06(385, 19, 96);
        c1746iY.A0K(com.facebook.ads.redexgen.core.OT.A02(bundle.getString(placement6)));
        com.facebook.ads.RewardData A012 = com.facebook.ads.redexgen.core.OY.A01(bundle);
        if (A012 != null) {
            c1746iY.A0F(A012);
        }
        return c1746iY;
    }

    public static com.facebook.ads.redexgen.core.C1731iI A05(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.os.Bundle bundle, java.lang.String str) {
        java.lang.String string = bundle.getString(A06(451, 17, 16));
        java.lang.String rvPlacement = A06(292, 19, 18);
        java.lang.String string2 = bundle.getString(rvPlacement);
        java.lang.String rvPlacement2 = A06(90, 33, 27);
        boolean z = bundle.getBoolean(rvPlacement2);
        java.lang.String rvPlacement3 = A06(366, 19, 0);
        java.lang.String adExperienceType = bundle.getString(rvPlacement3);
        java.lang.String rvPlacement4 = A06(com.ironsource.InterfaceC3141l1.a.b.d, 22, 98);
        java.lang.String mediationData = bundle.getString(rvPlacement4);
        java.lang.String rvPlacement5 = A06(237, 22, 24);
        java.lang.String string3 = bundle.getString(rvPlacement5);
        java.lang.String rvPlacement6 = A06(344, 22, 96);
        java.lang.String string4 = bundle.getString(rvPlacement6);
        java.lang.String rvPlacement7 = A06(123, 19, 81);
        android.os.Bundle bundle2 = bundle.getBundle(rvPlacement7);
        if (bundle2 == null) {
            bundle2 = new android.os.Bundle();
        }
        if (string == null) {
            string = A06(0, 0, 60);
        }
        com.facebook.ads.redexgen.core.C1731iI c1731iI = new com.facebook.ads.redexgen.core.C1731iI(c1636gi, string, null, new com.facebook.ads.redexgen.core.C1737iP(str, string4, bundle2));
        c1731iI.A06 = adExperienceType;
        c1731iI.A05 = string2;
        c1731iI.A08 = z;
        c1731iI.A02 = com.facebook.ads.redexgen.core.OS.A00(string3);
        c1731iI.A07 = mediationData;
        com.facebook.ads.RewardData A012 = com.facebook.ads.redexgen.core.OY.A01(bundle);
        if (A012 != null) {
            c1731iI.A03 = A012;
        }
        return c1731iI;
    }

    public static void A08(android.os.Bundle bundle, com.facebook.ads.redexgen.core.T8 t8) {
        bundle.putString(A06(344, 22, 96), A06(0, 6, 101));
        boolean z = false;
        boolean isForcedFunnelLogging = t8 instanceof com.facebook.ads.redexgen.core.C1636gi;
        if (isForcedFunnelLogging) {
            z = ((com.facebook.ads.redexgen.core.C1636gi) t8).A0F().AAT();
        }
        boolean isForcedFunnelLogging2 = com.facebook.ads.redexgen.core.TX.A0I(t8);
        bundle.putBoolean(A06(33, 21, 55), isForcedFunnelLogging2 || z);
        bundle.putString(A06(330, 14, 30), t8.getPackageName());
        boolean isForcedFunnelLogging3 = com.facebook.ads.redexgen.core.AbstractC1089Us.A0G(t8);
        if (isForcedFunnelLogging3) {
            bundle.putString(A06(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE, 19, 51), new com.facebook.ads.redexgen.core.C1032Sn().A03(t8));
        }
    }
}
