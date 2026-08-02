package com.gemalto.mfs.mwsdk.payment;

/* loaded from: classes3.dex */
public enum CHVerificationMethod {
    WALLET_PIN(0, util.h.xy.al.ma.f268),
    DEVICE_KEYGUARD(1, util.h.xy.al.ma.f254),
    BIOMETRICS(2, util.h.xy.al.ma.f231),
    NONE(-1, util.h.xy.al.ma.f255);

    private java.lang.String Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;

    CHVerificationMethod(int i, java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = i;
        this.Camera2StreamConfigurationMap = str;
    }

    public final int getValue() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.Camera2StreamConfigurationMap;
    }
}
