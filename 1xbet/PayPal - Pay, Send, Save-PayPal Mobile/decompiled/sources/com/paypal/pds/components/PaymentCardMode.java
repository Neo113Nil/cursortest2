package com.paypal.pds.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/pds/components/PaymentCardMode;", "", "<init>", "(Ljava/lang/String;I)V", "Thumbnail", "Display"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PaymentCardMode {
    private static final /* synthetic */ com.paypal.pds.components.PaymentCardMode[] Camera2StreamConfigurationMap;
    public static final com.paypal.pds.components.PaymentCardMode Display;
    public static final com.paypal.pds.components.PaymentCardMode Thumbnail;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private PaymentCardMode(java.lang.String str, int i) {
    }

    static {
        com.paypal.pds.components.PaymentCardMode paymentCardMode = new com.paypal.pds.components.PaymentCardMode("Thumbnail", 0);
        Thumbnail = paymentCardMode;
        com.paypal.pds.components.PaymentCardMode paymentCardMode2 = new com.paypal.pds.components.PaymentCardMode("Display", 1);
        Display = paymentCardMode2;
        com.paypal.pds.components.PaymentCardMode[] paymentCardModeArr = {paymentCardMode, paymentCardMode2};
        Camera2StreamConfigurationMap = paymentCardModeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(paymentCardModeArr);
    }

    public static com.paypal.pds.components.PaymentCardMode[] values() {
        return (com.paypal.pds.components.PaymentCardMode[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.pds.components.PaymentCardMode valueOf(java.lang.String str) {
        return (com.paypal.pds.components.PaymentCardMode) java.lang.Enum.valueOf(com.paypal.pds.components.PaymentCardMode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.pds.components.PaymentCardMode> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
