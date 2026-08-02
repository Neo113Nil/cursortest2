package com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.extension;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanDetails;", "", "shouldShowPayNowUI", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanDetails;)Z", "isAutopayOff", "", "message", "getUpcomingPaymentsMessage", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanDetails;Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanDetailsPaymentExtensionsKt {
    public static final boolean shouldShowPayNowUI(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planDetails, "");
        if (com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.extension.PlanDetailsStatusExtensionsKt.isDelinquent(planDetails)) {
            return true;
        }
        return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.extension.PlanDetailsStatusExtensionsKt.isActive(planDetails) && planDetails.getPlanCore().getLateFee() != null;
    }

    public static final boolean isAutopayOff(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planDetails, "");
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay planAutoPay = planDetails.getPlanAutoPay();
        if ((planAutoPay != null ? planAutoPay.getAlertContext() : null) == com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.AlertContext.AUTOPAY_OFF) {
            return true;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay planAutoPay2 = planDetails.getPlanAutoPay();
        return (planAutoPay2 != null ? planAutoPay2.getAlertContext() : null) == com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.AlertContext.UNKNOWN;
    }

    public static final java.lang.String getUpcomingPaymentsMessage(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails, java.lang.String str) {
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.RemainingInstallment> remainingInstallments;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentSummary installmentSummary = planDetails.getInstallmentSummary();
        if (installmentSummary == null || (remainingInstallments = installmentSummary.getRemainingInstallments()) == null || remainingInstallments.size() <= 1) {
            return null;
        }
        return str;
    }
}
