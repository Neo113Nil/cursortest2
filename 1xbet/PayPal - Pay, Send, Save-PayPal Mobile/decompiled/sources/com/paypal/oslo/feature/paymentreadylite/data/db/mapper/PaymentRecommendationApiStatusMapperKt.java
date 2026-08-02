package com.paypal.oslo.feature.paymentreadylite.data.db.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/paymentreadylite/data/db/model/PaymentRecommendationApiStatusEnum;", "Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendationApiStatus;", "toDomain", "(Lcom/paypal/oslo/feature/paymentreadylite/data/db/model/PaymentRecommendationApiStatusEnum;)Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendationApiStatus;", "toDto", "(Lcom/paypal/oslo/feature/paymentreadylite/domain/model/PaymentRecommendationApiStatus;)Lcom/paypal/oslo/feature/paymentreadylite/data/db/model/PaymentRecommendationApiStatusEnum;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentRecommendationApiStatusMapperKt {
    public static final com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus toDomain(com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum paymentRecommendationApiStatusEnum) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRecommendationApiStatusEnum, "");
        int i = com.paypal.oslo.feature.paymentreadylite.data.db.mapper.PaymentRecommendationApiStatusMapperKt.WhenMappings.$EnumSwitchMapping$0[paymentRecommendationApiStatusEnum.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus.SUCCESS;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus.FAILED;
    }

    public static final com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum toDto(com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus paymentRecommendationApiStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRecommendationApiStatus, "");
        int i = com.paypal.oslo.feature.paymentreadylite.data.db.mapper.PaymentRecommendationApiStatusMapperKt.WhenMappings.$EnumSwitchMapping$1[paymentRecommendationApiStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum.SUCCESS;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum.FAILED;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum.values().length];
            try {
                iArr[com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum.FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus.values().length];
            try {
                iArr2[com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.paymentreadylite.domain.model.PaymentRecommendationApiStatus.FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
