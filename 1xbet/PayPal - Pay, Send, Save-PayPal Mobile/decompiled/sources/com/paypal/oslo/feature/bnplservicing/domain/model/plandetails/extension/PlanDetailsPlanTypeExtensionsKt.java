package com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.extension;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanDetails;", "", "isPayLater2GoPlan", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanDetails;)Z", "isInStorePlan", "isOnlinePlan", "isTransactionFlipPlan"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanDetailsPlanTypeExtensionsKt {
    public static final boolean isPayLater2GoPlan(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planDetails, "");
        return isInStorePlan(planDetails) || isOnlinePlan(planDetails) || isTransactionFlipPlan(planDetails);
    }

    public static final boolean isInStorePlan(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planDetails, "");
        com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy planVariantPolicy = planDetails.getPlanVariantPolicy();
        return planVariantPolicy != null && planVariantPolicy.getInstrumentFormat() == com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat.VIRTUAL_CREDIT_CARD && planVariantPolicy.getUsageChannel() == com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.CONTACTLESS_MOBILE_WALLET;
    }

    public static final boolean isOnlinePlan(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planDetails, "");
        com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy planVariantPolicy = planDetails.getPlanVariantPolicy();
        return planVariantPolicy != null && planVariantPolicy.getInstrumentFormat() == com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat.VIRTUAL_CREDIT_CARD && planVariantPolicy.getUsageChannel() == com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.EXTERNAL_ECOMMERCE;
    }

    public static final boolean isTransactionFlipPlan(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planDetails, "");
        com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy planVariantPolicy = planDetails.getPlanVariantPolicy();
        return planVariantPolicy != null && planVariantPolicy.getInstrumentFormat() == com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat.CREDIT_FINANCIAL_INSTRUMENT && planVariantPolicy.getUsageChannel() == com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.TRANSACTION_FUNDING_FLIP;
    }
}
