package com.gemalto.mfs.mwsdk.dcm;

/* loaded from: classes3.dex */
public enum DigitalizedCardState {
    ACTIVE(util.h.xy.al.ma.f207),
    SUSPENDED(util.h.xy.al.ma.f210),
    RETIRED(util.h.xy.al.ma.f214),
    UNKNOWN(util.h.xy.al.ma.f209);

    private java.lang.String getHighSpeedVideoFpsRanges;

    DigitalizedCardState(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
