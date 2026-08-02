package com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/PaymentOptionType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "UNKNOWN", "AMOUNT_OVERDUE", "DUE_TODAY", "NEXT_PAYMENT", "TOTAL_REMAINING"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentOptionType {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType AMOUNT_OVERDUE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType DUE_TODAY;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType NEXT_PAYMENT;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType TOTAL_REMAINING;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private PaymentOptionType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType paymentOptionType = new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType("UNKNOWN", 0);
        UNKNOWN = paymentOptionType;
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType paymentOptionType2 = new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType("AMOUNT_OVERDUE", 1);
        AMOUNT_OVERDUE = paymentOptionType2;
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType paymentOptionType3 = new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType("DUE_TODAY", 2);
        DUE_TODAY = paymentOptionType3;
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType paymentOptionType4 = new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType("NEXT_PAYMENT", 3);
        NEXT_PAYMENT = paymentOptionType4;
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType paymentOptionType5 = new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType("TOTAL_REMAINING", 4);
        TOTAL_REMAINING = paymentOptionType5;
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType[] paymentOptionTypeArr = {paymentOptionType, paymentOptionType2, paymentOptionType3, paymentOptionType4, paymentOptionType5};
        getHighSpeedVideoFpsRanges = paymentOptionTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(paymentOptionTypeArr);
        INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/PaymentOptionType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/PaymentOptionType;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/PaymentOptionType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType paymentOptionType = (com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType) obj;
            return paymentOptionType == null ? com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType.UNKNOWN : paymentOptionType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
