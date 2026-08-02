package com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.extension;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanDetails;", "", "isDelinquent", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanDetails;)Z", "isActive", "isCompletedOrMaturedPlan"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanDetailsStatusExtensionsKt {
    public static final boolean isDelinquent(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planDetails, "");
        return planDetails.getPlanCore().getPlanStatus() == com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.DELINQUENT;
    }

    public static final boolean isActive(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planDetails, "");
        return planDetails.getPlanCore().getPlanStatus() == com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.ON_TRACK;
    }

    public static final boolean isCompletedOrMaturedPlan(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planDetails, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus[]{com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.COMPLETED, com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.MATURED}).contains(planDetails.getPlanCore().getPlanStatus());
    }
}
