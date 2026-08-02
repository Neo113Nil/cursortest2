package com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/actions/handler/pay/model/PaymentTransferIntent;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend, com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionRequest, "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PaymentTransferIntent {
    public static final com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.model.PaymentTransferIntent REQUEST;
    public static final com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.model.PaymentTransferIntent SEND;
    public static final com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.model.PaymentTransferIntent UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.model.PaymentTransferIntent[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private PaymentTransferIntent(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.model.PaymentTransferIntent paymentTransferIntent = new com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.model.PaymentTransferIntent(com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend, 0);
        SEND = paymentTransferIntent;
        com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.model.PaymentTransferIntent paymentTransferIntent2 = new com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.model.PaymentTransferIntent(com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionRequest, 1);
        REQUEST = paymentTransferIntent2;
        com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.model.PaymentTransferIntent paymentTransferIntent3 = new com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.model.PaymentTransferIntent("UNKNOWN", 2);
        UNKNOWN = paymentTransferIntent3;
        com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.model.PaymentTransferIntent[] paymentTransferIntentArr = {paymentTransferIntent, paymentTransferIntent2, paymentTransferIntent3};
        getHighSpeedVideoFpsRanges = paymentTransferIntentArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(paymentTransferIntentArr);
    }

    public static com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.model.PaymentTransferIntent[] values() {
        return (com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.model.PaymentTransferIntent[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.model.PaymentTransferIntent valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.model.PaymentTransferIntent) java.lang.Enum.valueOf(com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.model.PaymentTransferIntent.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.activity.domain.common.actions.handler.pay.model.PaymentTransferIntent> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
