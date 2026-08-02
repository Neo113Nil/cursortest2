package com.paypal.oslo.feature.p2p.ui.review.state;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/state/PaymentMethodMessageType;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentMethodMessageType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType ERROR;
    public static final com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType WARNING;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType[] getHighSpeedVideoSizes;

    private PaymentMethodMessageType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType paymentMethodMessageType = new com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType("WARNING", 0);
        WARNING = paymentMethodMessageType;
        com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType paymentMethodMessageType2 = new com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType("ERROR", 1);
        ERROR = paymentMethodMessageType2;
        com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType[] paymentMethodMessageTypeArr = {paymentMethodMessageType, paymentMethodMessageType2};
        getHighSpeedVideoSizes = paymentMethodMessageTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(paymentMethodMessageTypeArr);
    }

    public static com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType[] values() {
        return (com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodMessageType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
