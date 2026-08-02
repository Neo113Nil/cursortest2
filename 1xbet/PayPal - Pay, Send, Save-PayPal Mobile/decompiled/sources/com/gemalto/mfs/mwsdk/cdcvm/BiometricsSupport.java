package com.gemalto.mfs.mwsdk.cdcvm;

/* loaded from: classes3.dex */
public enum BiometricsSupport {
    ANDROID_VERSION_NOT_SUPPORTED(util.h.xy.al.ma.f234),
    NO_FINGERPRINT_SENSOR(util.h.xy.al.ma.f216),
    NO_FINGERPRINT_ENROLLED(util.h.xy.al.ma.f219),
    PERMISSION_NOT_GRANTED(util.h.xy.al.ma.f215),
    SUPPORTED(util.h.xy.al.ma.f226),
    SECURE_LOCK_NOT_PRESENTED(util.h.xy.al.ma.f220),
    SECURITY_UPDATE_REQUIRED(util.h.xy.al.ma.f206);

    private java.lang.String getHighSpeedVideoSizes;

    BiometricsSupport(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.getHighSpeedVideoSizes;
    }
}
