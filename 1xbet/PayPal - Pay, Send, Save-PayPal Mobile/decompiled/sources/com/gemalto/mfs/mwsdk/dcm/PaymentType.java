package com.gemalto.mfs.mwsdk.dcm;

/* loaded from: classes3.dex */
public enum PaymentType {
    CONTACTLESS(util.h.xy.al.ma.f217),
    QR(util.h.xy.al.ma.f213),
    DSRP(util.h.xy.al.ma.f230);

    private java.lang.String getHighSpeedVideoFpsRangesFor;

    PaymentType(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
