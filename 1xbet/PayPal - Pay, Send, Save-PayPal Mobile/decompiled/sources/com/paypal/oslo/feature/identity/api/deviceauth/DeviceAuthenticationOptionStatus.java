package com.paypal.oslo.feature.identity.api.deviceauth;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/deviceauth/DeviceAuthenticationOptionStatus;", "", "<init>", "(Ljava/lang/String;I)V", "UNSUPPORTED", "NOT_ENROLLED", "ENROLLED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeviceAuthenticationOptionStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionStatus ENROLLED;
    public static final com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionStatus NOT_ENROLLED;
    public static final com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionStatus UNSUPPORTED;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionStatus[] getHighSpeedVideoFpsRanges;

    private DeviceAuthenticationOptionStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionStatus deviceAuthenticationOptionStatus = new com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionStatus("UNSUPPORTED", 0);
        UNSUPPORTED = deviceAuthenticationOptionStatus;
        com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionStatus deviceAuthenticationOptionStatus2 = new com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionStatus("NOT_ENROLLED", 1);
        NOT_ENROLLED = deviceAuthenticationOptionStatus2;
        com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionStatus deviceAuthenticationOptionStatus3 = new com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionStatus("ENROLLED", 2);
        ENROLLED = deviceAuthenticationOptionStatus3;
        com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionStatus[] deviceAuthenticationOptionStatusArr = {deviceAuthenticationOptionStatus, deviceAuthenticationOptionStatus2, deviceAuthenticationOptionStatus3};
        getHighSpeedVideoFpsRanges = deviceAuthenticationOptionStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(deviceAuthenticationOptionStatusArr);
    }

    public static com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionStatus[] values() {
        return (com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionStatus[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOptionStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
