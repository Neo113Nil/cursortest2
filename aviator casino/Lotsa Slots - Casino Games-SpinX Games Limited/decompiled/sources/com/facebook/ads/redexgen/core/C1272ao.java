package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1272ao implements com.facebook.ads.redexgen.core.TD {
    public static byte[] A01;
    public final com.facebook.ads.redexgen.core.T8 A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 57);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-20, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SI};
    }

    public C1272ao(com.facebook.ads.redexgen.core.T8 t8) {
        this.A00 = t8;
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final java.lang.String A79() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final java.lang.String A86() {
        return com.facebook.ads.redexgen.core.WI.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final java.lang.String A87() {
        return com.facebook.ads.internal.bridge.fbsdk.FBLoginASID.getFBLoginASID();
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final java.lang.String A8V() {
        return com.facebook.ads.internal.settings.AdInternalSettings.getMediationService();
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final java.lang.String A8c() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final com.facebook.ads.redexgen.core.TC A8x() {
        com.facebook.ads.internal.bridge.gms.AdvertisingId advertisingIdInfoDirectly = com.facebook.ads.internal.bridge.gms.AdvertisingId.getAdvertisingIdInfoDirectly(this.A00);
        if (advertisingIdInfoDirectly == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.C1281ax(this, advertisingIdInfoDirectly);
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final java.lang.String A9Q() {
        return com.facebook.ads.internal.settings.AdInternalSettings.getUrlPrefix();
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final java.lang.String A9S() {
        return A00(0, 7, 114);
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final java.lang.String A9T() {
        return com.facebook.ads.internal.api.BuildConfigApi.getVersionName(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.TD
    public final boolean AAO() {
        return com.facebook.ads.internal.api.BuildConfigApi.isDebug();
    }
}
