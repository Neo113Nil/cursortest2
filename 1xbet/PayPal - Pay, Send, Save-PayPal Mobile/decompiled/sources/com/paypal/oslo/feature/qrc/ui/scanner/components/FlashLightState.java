package com.paypal.oslo.feature.qrc.ui.scanner.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/components/FlashLightState;", "", "<init>", "(Ljava/lang/String;I)V", "On", "Off"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FlashLightState {
    public static final com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState Off;
    public static final com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState On;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState[] getHighSpeedVideoSizes;

    private FlashLightState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState flashLightState = new com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState("On", 0);
        On = flashLightState;
        com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState flashLightState2 = new com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState("Off", 1);
        Off = flashLightState2;
        com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState[] flashLightStateArr = {flashLightState, flashLightState2};
        getHighSpeedVideoSizes = flashLightStateArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(flashLightStateArr);
    }

    public static com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState[] values() {
        return (com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.ui.scanner.components.FlashLightState> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
