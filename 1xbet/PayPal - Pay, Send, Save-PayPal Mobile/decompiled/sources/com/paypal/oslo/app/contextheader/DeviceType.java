package com.paypal.oslo.app.contextheader;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/app/contextheader/DeviceType;", "", "<init>", "(Ljava/lang/String;I)V", "PHONE", "TABLET", "DESKTOP"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceType {
    private static final /* synthetic */ com.paypal.oslo.app.contextheader.DeviceType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.app.contextheader.DeviceType DESKTOP;
    public static final com.paypal.oslo.app.contextheader.DeviceType PHONE;
    public static final com.paypal.oslo.app.contextheader.DeviceType TABLET;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private DeviceType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.app.contextheader.DeviceType deviceType = new com.paypal.oslo.app.contextheader.DeviceType("PHONE", 0);
        PHONE = deviceType;
        com.paypal.oslo.app.contextheader.DeviceType deviceType2 = new com.paypal.oslo.app.contextheader.DeviceType("TABLET", 1);
        TABLET = deviceType2;
        com.paypal.oslo.app.contextheader.DeviceType deviceType3 = new com.paypal.oslo.app.contextheader.DeviceType("DESKTOP", 2);
        DESKTOP = deviceType3;
        com.paypal.oslo.app.contextheader.DeviceType[] deviceTypeArr = {deviceType, deviceType2, deviceType3};
        Camera2StreamConfigurationMap = deviceTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(deviceTypeArr);
    }

    public static com.paypal.oslo.app.contextheader.DeviceType[] values() {
        return (com.paypal.oslo.app.contextheader.DeviceType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.app.contextheader.DeviceType valueOf(java.lang.String str) {
        return (com.paypal.oslo.app.contextheader.DeviceType) java.lang.Enum.valueOf(com.paypal.oslo.app.contextheader.DeviceType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.app.contextheader.DeviceType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
