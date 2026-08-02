package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/makepayment/PaymentConstraintsType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "AUTOPAY", "ONE_TIME", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentConstraintsType {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType AUTOPAY;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType ONE_TIME;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType[] getHighSpeedVideoFpsRangesFor;

    private PaymentConstraintsType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType paymentConstraintsType = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType("AUTOPAY", 0);
        AUTOPAY = paymentConstraintsType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType paymentConstraintsType2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType("ONE_TIME", 1);
        ONE_TIME = paymentConstraintsType2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType paymentConstraintsType3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType("UNKNOWN__", 2);
        UNKNOWN__ = paymentConstraintsType3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType[] paymentConstraintsTypeArr = {paymentConstraintsType, paymentConstraintsType2, paymentConstraintsType3};
        getHighSpeedVideoFpsRangesFor = paymentConstraintsTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(paymentConstraintsTypeArr);
        INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/makepayment/PaymentConstraintsType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/makepayment/PaymentConstraintsType;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/makepayment/PaymentConstraintsType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType paymentConstraintsType = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType) obj;
            return paymentConstraintsType == null ? com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType.UNKNOWN__ : paymentConstraintsType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
