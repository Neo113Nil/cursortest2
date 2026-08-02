package com.gemalto.mfs.mwsdk.mobilegateway.enrollment;

/* loaded from: classes3.dex */
public enum PendingCardActivationState {
    IDV_METHOD_NOT_SELECTED(util.h.xy.bh.b.f953),
    OTP_NEEDED(util.h.xy.bh.b.f946),
    WEB_3DS_NEEDED(util.h.xy.bh.b.f948),
    APP2APP_NEEDED(util.h.xy.bh.b.f947);

    private java.lang.String Camera2StreamConfigurationMap;

    PendingCardActivationState(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.Camera2StreamConfigurationMap;
    }
}
