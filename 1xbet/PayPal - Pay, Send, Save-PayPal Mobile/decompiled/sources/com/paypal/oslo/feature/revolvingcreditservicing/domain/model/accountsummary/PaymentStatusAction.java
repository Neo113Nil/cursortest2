package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/PaymentStatusAction;", "", "<init>", "(Ljava/lang/String;I)V", "SHOW_MIRANDA", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentStatusAction {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentStatusAction SHOW_MIRANDA;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentStatusAction UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentStatusAction[] getHighSpeedVideoSizes;

    private PaymentStatusAction(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentStatusAction paymentStatusAction = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentStatusAction("SHOW_MIRANDA", 0);
        SHOW_MIRANDA = paymentStatusAction;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentStatusAction paymentStatusAction2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentStatusAction("UNKNOWN", 1);
        UNKNOWN = paymentStatusAction2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentStatusAction[] paymentStatusActionArr = {paymentStatusAction, paymentStatusAction2};
        getHighSpeedVideoSizes = paymentStatusActionArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(paymentStatusActionArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentStatusAction[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentStatusAction[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentStatusAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentStatusAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentStatusAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentStatusAction> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
