package com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityRequirement;", "", "<init>", "(Ljava/lang/String;I)V", "HARDWARE_CAPABILITY", "GOOGLE_PLAY_SERVICES", "REMOTE_PROCESS", "OS_VERSION", "UNSUPPORTED_DEVICE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeviceCompatibilityRequirement {
    private static final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement GOOGLE_PLAY_SERVICES;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement HARDWARE_CAPABILITY;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement OS_VERSION;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement REMOTE_PROCESS;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement UNSUPPORTED_DEVICE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private DeviceCompatibilityRequirement(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement deviceCompatibilityRequirement = new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement("HARDWARE_CAPABILITY", 0);
        HARDWARE_CAPABILITY = deviceCompatibilityRequirement;
        com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement deviceCompatibilityRequirement2 = new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement("GOOGLE_PLAY_SERVICES", 1);
        GOOGLE_PLAY_SERVICES = deviceCompatibilityRequirement2;
        com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement deviceCompatibilityRequirement3 = new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement("REMOTE_PROCESS", 2);
        REMOTE_PROCESS = deviceCompatibilityRequirement3;
        com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement deviceCompatibilityRequirement4 = new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement("OS_VERSION", 3);
        OS_VERSION = deviceCompatibilityRequirement4;
        com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement deviceCompatibilityRequirement5 = new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement("UNSUPPORTED_DEVICE", 4);
        UNSUPPORTED_DEVICE = deviceCompatibilityRequirement5;
        com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement[] deviceCompatibilityRequirementArr = {deviceCompatibilityRequirement, deviceCompatibilityRequirement2, deviceCompatibilityRequirement3, deviceCompatibilityRequirement4, deviceCompatibilityRequirement5};
        Camera2StreamConfigurationMap = deviceCompatibilityRequirementArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(deviceCompatibilityRequirementArr);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement[] values() {
        return (com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
