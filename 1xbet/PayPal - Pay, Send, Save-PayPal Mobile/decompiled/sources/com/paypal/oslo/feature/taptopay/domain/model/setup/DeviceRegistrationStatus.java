package com.paypal.oslo.feature.taptopay.domain.model.setup;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/setup/DeviceRegistrationStatus;", "", "<init>", "(Ljava/lang/String;I)V", "REGISTERED", com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_SESSION_EXPIRED, "LOGOUT", "UNSUPPORTED_VERSION_DETECTED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DeviceRegistrationStatus {
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus LOGOUT;
    public static final com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus REGISTERED;
    public static final com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus SESSION_EXPIRED;
    public static final com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus UNSUPPORTED_VERSION_DETECTED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private DeviceRegistrationStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus deviceRegistrationStatus = new com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus("REGISTERED", 0);
        REGISTERED = deviceRegistrationStatus;
        com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus deviceRegistrationStatus2 = new com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus(com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_SESSION_EXPIRED, 1);
        SESSION_EXPIRED = deviceRegistrationStatus2;
        com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus deviceRegistrationStatus3 = new com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus("LOGOUT", 2);
        LOGOUT = deviceRegistrationStatus3;
        com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus deviceRegistrationStatus4 = new com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus("UNSUPPORTED_VERSION_DETECTED", 3);
        UNSUPPORTED_VERSION_DETECTED = deviceRegistrationStatus4;
        com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus[] deviceRegistrationStatusArr = {deviceRegistrationStatus, deviceRegistrationStatus2, deviceRegistrationStatus3, deviceRegistrationStatus4};
        Camera2StreamConfigurationMap = deviceRegistrationStatusArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(deviceRegistrationStatusArr);
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus[] values() {
        return (com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
