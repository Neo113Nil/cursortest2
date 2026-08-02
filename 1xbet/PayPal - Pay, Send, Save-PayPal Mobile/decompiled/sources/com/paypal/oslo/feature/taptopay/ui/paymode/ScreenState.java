package com.paypal.oslo.feature.taptopay.ui.paymode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/ScreenState;", "", "<init>", "(Ljava/lang/String;I)V", "SecondarySettings", "PaymentCard", "ScreenLockSettings", "EnableNfcSettings", "FullScreenError", "LimitReachedError", "ScreenLockError", "ContactlessUnavailableError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ScreenState {
    public static final com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState ContactlessUnavailableError;
    public static final com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState EnableNfcSettings;
    public static final com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState FullScreenError;
    public static final com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState LimitReachedError;
    public static final com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState PaymentCard;
    public static final com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState ScreenLockError;
    public static final com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState ScreenLockSettings;
    public static final com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState SecondarySettings;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState[] getHighSpeedVideoSizes;

    private ScreenState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState screenState = new com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState("SecondarySettings", 0);
        SecondarySettings = screenState;
        com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState screenState2 = new com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState("PaymentCard", 1);
        PaymentCard = screenState2;
        com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState screenState3 = new com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState("ScreenLockSettings", 2);
        ScreenLockSettings = screenState3;
        com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState screenState4 = new com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState("EnableNfcSettings", 3);
        EnableNfcSettings = screenState4;
        com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState screenState5 = new com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState("FullScreenError", 4);
        FullScreenError = screenState5;
        com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState screenState6 = new com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState("LimitReachedError", 5);
        LimitReachedError = screenState6;
        com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState screenState7 = new com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState("ScreenLockError", 6);
        ScreenLockError = screenState7;
        com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState screenState8 = new com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState("ContactlessUnavailableError", 7);
        ContactlessUnavailableError = screenState8;
        com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState[] screenStateArr = {screenState, screenState2, screenState3, screenState4, screenState5, screenState6, screenState7, screenState8};
        getHighSpeedVideoSizes = screenStateArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(screenStateArr);
    }

    public static com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState[] values() {
        return (com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.ui.paymode.ScreenState> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
