package com.ironsource.adqualitysdk.sdk;

@Deprecated
/* loaded from: classes6.dex */
public enum ISAdQualityLogLevel {
    NONE(0),
    ERROR(1),
    WARNING(2),
    INFO(3),
    DEBUG(4),
    VERBOSE(5);


    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int f76;

    ISAdQualityLogLevel(int i) {
        this.f76 = i;
    }

    @Deprecated
    public static ISAdQualityLogLevel fromInt(int i) {
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

    @Deprecated
    public int getValue() {
        return this.f76;
    }

    @Deprecated
    public boolean shouldPrintLog(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i = this.f76;
        return i != NONE.f76 && i >= iSAdQualityLogLevel.f76;
    }
}
