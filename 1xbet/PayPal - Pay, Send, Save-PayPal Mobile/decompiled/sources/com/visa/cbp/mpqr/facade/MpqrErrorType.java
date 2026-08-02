package com.visa.cbp.mpqr.facade;

/* loaded from: classes16.dex */
public enum MpqrErrorType {
    INVALID_MPQR_FORMAT("Invalid MPQR Code Format", com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP),
    INVALID_MPQR_CODE("Invalid MPQR Code", 801),
    INVALID_CRC("Invalid MPQR Code CRC", 802),
    OUT_OF_BOUNDS("Index out of Bounds", 803);

    private final int code;
    private final java.lang.String message;

    MpqrErrorType(java.lang.String str, int i) {
        this.message = str;
        this.code = i;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final int getCode() {
        return this.code;
    }
}
