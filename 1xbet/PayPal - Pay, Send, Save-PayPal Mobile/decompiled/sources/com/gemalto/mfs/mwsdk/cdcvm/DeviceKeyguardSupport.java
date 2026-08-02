package com.gemalto.mfs.mwsdk.cdcvm;

/* loaded from: classes3.dex */
public enum DeviceKeyguardSupport {
    ANDROID_VERSION_NOT_SUPPORTED(util.h.xy.al.ma.f234),
    SECURE_LOCK_NOT_PRESENTED(util.h.xy.al.ma.f220),
    SUPPORTED(util.h.xy.al.ma.f226);

    private java.lang.String getHighSpeedVideoFpsRanges;

    DeviceKeyguardSupport(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
