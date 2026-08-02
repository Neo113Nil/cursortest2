package com.gemalto.mfs.mwsdk.provisioning.model;

/* loaded from: classes3.dex */
public enum MessageClassification {
    WARNING(util.h.xy.al.ma.f223),
    INFO(util.h.xy.al.ma.f204),
    ERROR(util.h.xy.al.ma.f211);

    private java.lang.String getHighSpeedVideoFpsRanges;

    MessageClassification(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
