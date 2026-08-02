package com.paypal.oslo.feature.identity.api.deviceauth;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/deviceauth/DeviceAuthenticationOption;", "", "<init>", "(Ljava/lang/String;I)V", "BIOMETRIC", "LONG_LIVED_SESSION", "PASSKEY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeviceAuthenticationOption {
    public static final com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOption BIOMETRIC;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOption LONG_LIVED_SESSION;
    public static final com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOption PASSKEY;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOption[] getHighSpeedVideoFpsRanges;

    private DeviceAuthenticationOption(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOption deviceAuthenticationOption = new com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOption("BIOMETRIC", 0);
        BIOMETRIC = deviceAuthenticationOption;
        com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOption deviceAuthenticationOption2 = new com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOption("LONG_LIVED_SESSION", 1);
        LONG_LIVED_SESSION = deviceAuthenticationOption2;
        com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOption deviceAuthenticationOption3 = new com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOption("PASSKEY", 2);
        PASSKEY = deviceAuthenticationOption3;
        com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOption[] deviceAuthenticationOptionArr = {deviceAuthenticationOption, deviceAuthenticationOption2, deviceAuthenticationOption3};
        getHighSpeedVideoFpsRanges = deviceAuthenticationOptionArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(deviceAuthenticationOptionArr);
    }

    public static com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOption[] values() {
        return (com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOption[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOption valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOption) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOption.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.api.deviceauth.DeviceAuthenticationOption> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
