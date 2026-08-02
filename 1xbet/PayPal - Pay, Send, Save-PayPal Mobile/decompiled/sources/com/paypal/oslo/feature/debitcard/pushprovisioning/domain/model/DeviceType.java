package com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DeviceType;", "", "<init>", "(Ljava/lang/String;I)V", "PHONE", "WATCH"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeviceType {
    public static final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType PHONE;
    public static final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType WATCH;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private DeviceType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType deviceType = new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType("PHONE", 0);
        PHONE = deviceType;
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType deviceType2 = new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType("WATCH", 1);
        WATCH = deviceType2;
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType[] deviceTypeArr = {deviceType, deviceType2};
        getHighSpeedVideoFpsRanges = deviceTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(deviceTypeArr);
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType[] values() {
        return (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
