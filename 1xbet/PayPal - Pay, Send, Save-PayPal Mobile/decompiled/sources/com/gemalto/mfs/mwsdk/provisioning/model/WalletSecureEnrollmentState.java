package com.gemalto.mfs.mwsdk.provisioning.model;

/* loaded from: classes3.dex */
public enum WalletSecureEnrollmentState {
    WSE_COMPLETED(util.h.xy.al.ma.f203),
    WSE_NOT_REQUIRED(util.h.xy.al.ma.f265),
    WSE_REQUIRED(util.h.xy.al.ma.f267),
    WSE_STARTED(util.h.xy.al.ma.f261);

    private java.lang.String getHighSpeedVideoFpsRangesFor;

    WalletSecureEnrollmentState(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
