package com.digitalturbine.ignite.authenticator.events;

import com.adjust.sdk.network.ErrorCodes;

/* loaded from: classes4.dex */
public enum d {
    ENCRYPTION_EXCEPTION(ErrorCodes.THROWABLE),
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
