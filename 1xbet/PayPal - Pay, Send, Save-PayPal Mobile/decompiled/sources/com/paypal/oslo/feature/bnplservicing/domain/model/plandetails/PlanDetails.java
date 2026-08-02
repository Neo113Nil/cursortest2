package com.paypal.oslo.feature.bnplservicing.domain.model.plandetails;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\b\u0006\u0007\b\t\n\u000b\f\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanDetails;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanOptionalDomainModelProvider;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanCore;", "getPlanCore", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanCore;", "planCore", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/AlmostCompletePlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/CompletedPlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/DelinquentPlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/MaturedPlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/OnTrackPlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PastDuePlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PendingPlan;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/ReadyToUsePlan;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface PlanDetails extends com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider {
    com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore getPlanCore();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument getFundingInstrument(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails.super.getFundingInstrument();
        }

        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDetails getInstallmentDetails(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails.super.getInstallmentDetails();
        }

        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentSummary getInstallmentSummary(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails.super.getInstallmentSummary();
        }

        @java.lang.Deprecated
        public static java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanActivity> getPlanActivities(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails.super.getPlanActivities();
        }

        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay getPlanAutoPay(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails.super.getPlanAutoPay();
        }

        @java.lang.Deprecated
        public static java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.Document> getPlanDocuments(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails.super.getPlanDocuments();
        }

        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaymentSchedule getPlanSchedule(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails.super.getPlanSchedule();
        }

        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze getPlanSnooze(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails.super.getPlanSnooze();
        }

        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy getPlanVariantPolicy(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails.super.getPlanVariantPolicy();
        }

        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard getPlanVirtualCard(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails.super.getPlanVirtualCard();
        }

        @java.lang.Deprecated
        public static java.lang.Boolean isLastPayment(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails.super.isLastPayment();
        }

        @java.lang.Deprecated
        public static boolean isMiniMirandaRequired(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails.super.isMiniMirandaRequired();
        }

        @java.lang.Deprecated
        public static boolean isPendingFraud(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails planDetails) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails.super.isPendingFraud();
        }
    }
}
