package com.paypal.oslo.feature.verificationcapture.api.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/widget/CaptureMode;", "", "<init>", "(Ljava/lang/String;I)V", "SDK", "SYSTEM"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CaptureMode {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode SDK;
    public static final com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode SYSTEM;
    private static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode[] getHighSpeedVideoSizes;

    private CaptureMode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode captureMode = new com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode("SDK", 0);
        SDK = captureMode;
        com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode captureMode2 = new com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode("SYSTEM", 1);
        SYSTEM = captureMode2;
        com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode[] captureModeArr = {captureMode, captureMode2};
        getHighSpeedVideoSizes = captureModeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(captureModeArr);
    }

    public static com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode[] values() {
        return (com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode) java.lang.Enum.valueOf(com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
