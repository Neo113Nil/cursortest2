package com.digitalturbine.ignite.authenticator.events;

/* loaded from: classes2.dex */
public enum d {
    ENCRYPTION_EXCEPTION(com.adjust.sdk.network.ErrorCodes.THROWABLE),
    RAW_ONE_DT_ERROR(1101),
    ONE_DT_PARSE_ERROR(1102),
    ONE_DT_AUTHENTICATION_ERROR(1103),
    ONE_DT_BROADCAST_ERROR(1104),
    ONE_DT_REQUEST_ERROR(1105),
    ONE_DT_GENERAL_ERROR(1106);

    int mVal;

    d(int i) {
        this.mVal = i;
    }

    public final int a() {
        return this.mVal;
    }
}
