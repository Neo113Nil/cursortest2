package com.ironsource.adqualitysdk.sdk;

/* loaded from: classes5.dex */
public enum ISAdQualityLogLevel {
    NONE(0),
    ERROR(1),
    WARNING(2),
    INFO(3),
    DEBUG(4),
    VERBOSE(5);


    /* renamed from: ﾒ, reason: contains not printable characters */
    private final int f73;

    ISAdQualityLogLevel(int i) {
        this.f73 = i;
    }

    public final int getValue() {
        return this.f73;
    }

    public final boolean shouldPrintLog(com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i = this.f73;
        return i != NONE.f73 && i >= iSAdQualityLogLevel.f73;
    }

    public static com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel fromInt(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return ERROR;
        }
        if (i == 2) {
            return WARNING;
        }
        if (i == 3) {
            return INFO;
        }
        if (i == 4) {
            return DEBUG;
        }
        if (i != 5) {
            return null;
        }
        return VERBOSE;
    }
}
