package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public /* synthetic */ class OC {
    public static final /* synthetic */ int[] A00 = new int[com.facebook.ads.AdSettings.IntegrationErrorMode.values().length];

    static {
        try {
            A00[com.facebook.ads.AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            A00[com.facebook.ads.AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CALLBACK_MODE.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
    }
}
