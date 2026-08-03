package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1335bp implements com.facebook.ads.redexgen.core.TO {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"N9cBQFuEXnMHuOhuUHmrN1NbOn9dUH6l", "t4327HI34dmOHxHgJ5Xqb1TMdgfhViRu", "W9WF83HwW2JJuxhyMa", "tDcIRbsxuTPzi4rfI85ylCxCUvgLsm3F", "qO4Uq7mg6XVWSCx2fb2lLTULAXcH9HmN", "DdhWBjv", "pI4BrYZb6jEfbOR6K30piOXwM4lgsdMH", "sO2hGyIlN5zgciGhFXZ1rYz4NH0oO9ru"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 113);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-70, -73, -54, -73, -43, -58, -56, -59, -71, -69, -55, -55, -65, -60, -67, -43, -59, -58, -54, -65, -59, -60, -55, -43, -71, -59, -53, -60, -54, -56, -49, -43, -63, -69, -49, 48, 45, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 45, 75, 60, 62, 59, 47, 49, 63, 63, 53, 58, 51, 75, 59, 60, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 53, 59, 58, 63, 75, 55, 49, 69, 5, 2, com.google.common.base.Ascii.NAK, 2, 32, 17, 19, com.google.common.base.Ascii.DLE, 4, 6, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DC4, 10, com.google.common.base.Ascii.SI, 8, 32, com.google.common.base.Ascii.DLE, 17, com.google.common.base.Ascii.NAK, 10, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC4, 32, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, 2, com.google.common.base.Ascii.NAK, 6, 32, com.google.common.base.Ascii.FF, 6, com.google.common.base.Ascii.SUB};
        java.lang.String[] strArr = A01;
        if (strArr[6].charAt(20) == strArr[0].charAt(20)) {
            throw new java.lang.RuntimeException();
        }
        A01[2] = "00h";
        A00 = bArr;
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.core.TO
    public final void ACV(com.facebook.ads.redexgen.core.TN tn) {
        java.lang.String[] stringArray;
        java.lang.Integer integer;
        java.lang.Integer integer2;
        if (!com.facebook.ads.internal.settings.AdInternalSettings.sDataProcessingOptionsUpdate.getAndSet(false)) {
            return;
        }
        synchronized (com.facebook.ads.internal.settings.AdInternalSettings.sSettingsBundle) {
            stringArray = com.facebook.ads.internal.settings.AdInternalSettings.sSettingsBundle.getStringArray(A00(35, 27, 123));
            integer = com.facebook.ads.internal.settings.AdInternalSettings.sSettingsBundle.getInteger(A00(0, 35, 5));
            integer2 = com.facebook.ads.internal.settings.AdInternalSettings.sSettingsBundle.getInteger(A00(62, 33, 80));
        }
        tn.AFu(stringArray, integer, integer2);
    }
}
