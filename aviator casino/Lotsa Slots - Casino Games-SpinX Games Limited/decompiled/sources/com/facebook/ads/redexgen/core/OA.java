package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class OA {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 43);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-121, -122, Byte.MIN_VALUE, -109, 125, -126, -120, 121, 123, -122, 117, -120, 125, -125, -126, -109, 121, -122, -122, -125, -122, -109, -127, -125, 120, 121, -109, Byte.MAX_VALUE, 121, -115};
    }

    public static com.facebook.ads.AdSettings.IntegrationErrorMode A00(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        com.facebook.ads.AdSettings.IntegrationErrorMode integrationErrorMode = (com.facebook.ads.AdSettings.IntegrationErrorMode) com.facebook.ads.internal.settings.AdInternalSettings.sSettingsBundle.getSerializable(A01(0, 30, 9));
        if (integrationErrorMode == null) {
            integrationErrorMode = com.facebook.ads.AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
        }
        com.facebook.ads.AdSettings.IntegrationErrorMode integrationErrorMode2 = com.facebook.ads.AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
        if (integrationErrorMode == integrationErrorMode2 && !A03(c1636gi)) {
            return com.facebook.ads.AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CALLBACK_MODE;
        }
        return integrationErrorMode;
    }

    public static boolean A03(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        return (c1636gi.getApplicationInfo().flags & 2) != 0;
    }
}
