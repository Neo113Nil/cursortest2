package com.gemalto.mfs.mwsdk.payment.experience;

/* loaded from: classes8.dex */
public enum PaymentExperience {
    ONE_TAP_REQUIRES_SDK_INITIALIZED(util.h.xy.al.ma.f249),
    ONE_TAP_ENABLED(util.h.xy.al.ma.f258),
    TWO_TAP_ALWAYS(util.h.xy.al.ma.f266);

    private java.lang.String getHighSpeedVideoSizes;

    PaymentExperience(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.getHighSpeedVideoSizes;
    }
}
