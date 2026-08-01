package com.ironsource.adqualitysdk.sdk;

@Deprecated
/* loaded from: classes6.dex */
public enum ISAdQualityDeviceIdType {
    NONE(0),
    GAID(1),
    IDFA(2);


    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int f72;

    ISAdQualityDeviceIdType(int i) {
        this.f72 = i;
    }

    @Deprecated
    public static ISAdQualityDeviceIdType fromInt(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return GAID;
        }
        if (i != 2) {
            return null;
        }
        return IDFA;
    }

    @Deprecated
    public int getValue() {
        return this.f72;
    }
}
