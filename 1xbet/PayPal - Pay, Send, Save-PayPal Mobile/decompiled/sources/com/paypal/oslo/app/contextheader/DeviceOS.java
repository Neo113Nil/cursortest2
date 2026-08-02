package com.paypal.oslo.app.contextheader;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/app/contextheader/DeviceOS;", "", "<init>", "(Ljava/lang/String;I)V", "IOS", "ANDROID", "WEB"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceOS {
    public static final com.paypal.oslo.app.contextheader.DeviceOS ANDROID;
    public static final com.paypal.oslo.app.contextheader.DeviceOS IOS;
    public static final com.paypal.oslo.app.contextheader.DeviceOS WEB;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.app.contextheader.DeviceOS[] getHighSpeedVideoFpsRangesFor;

    private DeviceOS(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.app.contextheader.DeviceOS deviceOS = new com.paypal.oslo.app.contextheader.DeviceOS("IOS", 0);
        IOS = deviceOS;
        com.paypal.oslo.app.contextheader.DeviceOS deviceOS2 = new com.paypal.oslo.app.contextheader.DeviceOS("ANDROID", 1);
        ANDROID = deviceOS2;
        com.paypal.oslo.app.contextheader.DeviceOS deviceOS3 = new com.paypal.oslo.app.contextheader.DeviceOS("WEB", 2);
        WEB = deviceOS3;
        com.paypal.oslo.app.contextheader.DeviceOS[] deviceOSArr = {deviceOS, deviceOS2, deviceOS3};
        getHighSpeedVideoFpsRangesFor = deviceOSArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(deviceOSArr);
    }

    public static com.paypal.oslo.app.contextheader.DeviceOS[] values() {
        return (com.paypal.oslo.app.contextheader.DeviceOS[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.app.contextheader.DeviceOS valueOf(java.lang.String str) {
        return (com.paypal.oslo.app.contextheader.DeviceOS) java.lang.Enum.valueOf(com.paypal.oslo.app.contextheader.DeviceOS.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.app.contextheader.DeviceOS> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
