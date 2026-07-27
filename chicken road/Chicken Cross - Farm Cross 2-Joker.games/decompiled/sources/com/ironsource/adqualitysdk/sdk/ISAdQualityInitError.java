package com.ironsource.adqualitysdk.sdk;

@Deprecated
/* loaded from: classes6.dex */
public enum ISAdQualityInitError {
    AD_QUALITY_SDK_WAS_SHUTDOWN(0),
    ILLEGAL_USER_ID(1),
    ILLEGAL_APP_KEY(2),
    EXCEPTION_ON_INIT(3),
    NO_NETWORK_CONNECTION(4),
    CONFIG_LOAD_TIMEOUT(5),
    CONNECTOR_LOAD_TIMEOUT(6),
    AD_NETWORK_VERSION_NOT_SUPPORTED_YET(7),
    AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK(8),
    AD_QUALITY_ALREADY_INITIALIZED(9),
    NO_AD_NETWORKS(10),
    ILLEGAL_GAME_ID(11);


    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int f74;

    ISAdQualityInitError(int i) {
        this.f74 = i;
    }

    @Deprecated
    public static ISAdQualityInitError fromInt(int i) {
        switch (i) {
            case 0:
                return AD_QUALITY_SDK_WAS_SHUTDOWN;
            case 1:
                return ILLEGAL_USER_ID;
            case 2:
                return ILLEGAL_APP_KEY;
            case 3:
                return EXCEPTION_ON_INIT;
            case 4:
                return NO_NETWORK_CONNECTION;
            case 5:
                return CONFIG_LOAD_TIMEOUT;
            case 6:
                return CONNECTOR_LOAD_TIMEOUT;
            case 7:
                return AD_NETWORK_VERSION_NOT_SUPPORTED_YET;
            case 8:
                return AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK;
            case 9:
                return AD_QUALITY_ALREADY_INITIALIZED;
            case 10:
            default:
                return null;
            case 11:
                return ILLEGAL_GAME_ID;
        }
    }

    @Deprecated
    public int getValue() {
        return this.f74;
    }
}
