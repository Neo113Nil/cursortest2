package com.visa.cbp;

@java.lang.Deprecated
/* loaded from: classes16.dex */
public enum setWalletAccountId {
    E500_INTERNAL_SERVER_ERROR(500),
    E503_SERVICE_UNAVAILABLE(503),
    E400_BAD_REQUEST_INVALID_PARAMETER(400),
    E401_UNAUTHORIZED(401),
    E404_TOKEN_NOT_FOUND(404),
    E403_FORBIDDEN(403),
    E409_CONFLICT_TOKEN_STATE(409);

    private final int Camera2StreamConfigurationMap;

    setWalletAccountId(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    public final int valueOf() {
        return this.Camera2StreamConfigurationMap;
    }
}
