package com.paypal.oslo.feature.identity.devicebinding.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingSource;", "", "<init>", "(Ljava/lang/String;I)V", "APP_SETTINGS", "NATIVE_LOGIN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeviceBindingSource {
    public static final com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource APP_SETTINGS;
    public static final com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource NATIVE_LOGIN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource[] getHighSpeedVideoSizes;

    private DeviceBindingSource(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource deviceBindingSource = new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource("APP_SETTINGS", 0);
        APP_SETTINGS = deviceBindingSource;
        com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource deviceBindingSource2 = new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource("NATIVE_LOGIN", 1);
        NATIVE_LOGIN = deviceBindingSource2;
        com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource[] deviceBindingSourceArr = {deviceBindingSource, deviceBindingSource2};
        getHighSpeedVideoSizes = deviceBindingSourceArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(deviceBindingSourceArr);
    }

    public static com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource[] values() {
        return (com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingSource> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
