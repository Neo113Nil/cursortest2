package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTxType;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentType;", "toPaymentType", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTxType;)Lcom/paypal/oslo/feature/p2p/domain/model/PaymentType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentTypeKt {
    public static final com.paypal.oslo.feature.p2p.domain.model.PaymentType toPaymentType(com.paypal.oslo.feature.p2p.domain.model.PaymentTxType paymentTxType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTxType, "");
        int i = com.paypal.oslo.feature.p2p.domain.model.PaymentTypeKt.WhenMappings.$EnumSwitchMapping$0[paymentTxType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.p2p.domain.model.PaymentType.PERSONAL;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.p2p.domain.model.PaymentType.PURCHASE;
        }
        if (i == 3) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.p2p.domain.model.PaymentTxType.values().length];
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentTxType.PERSONAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentTxType.PURCHASE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.PaymentTxType.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
