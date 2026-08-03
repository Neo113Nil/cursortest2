package com.ironsource.adqualitysdk.sdk;

/* loaded from: classes5.dex */
public enum ISAdQualityDeviceIdType {
    NONE(0),
    GAID(1),
    IDFA(2);


    /* renamed from: ﾇ, reason: contains not printable characters */
    private final int f69;

    ISAdQualityDeviceIdType(int i) {
        this.f69 = i;
    }

    public final int getValue() {
        return this.f69;
    }

    public static com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType fromInt(int i) {
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
}
