package com.paypal.oslo.feature.bnplservicing.domain.model.plandetails;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanOptionalDomainModelProvider;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanPaymentDataProvider;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanInstallmentsDataProvider;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanContentDataProvider;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanMetadataProvider;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanSummaryDataProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface PlanOptionalDomainModelProvider extends com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanPaymentDataProvider, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanInstallmentsDataProvider, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanContentDataProvider, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanMetadataProvider, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanSummaryDataProvider {

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument getFundingInstrument(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider planOptionalDomainModelProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider.super.getFundingInstrument();
        }

        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDetails getInstallmentDetails(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider planOptionalDomainModelProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider.super.getInstallmentDetails();
        }

        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentSummary getInstallmentSummary(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider planOptionalDomainModelProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider.super.getInstallmentSummary();
        }

        @java.lang.Deprecated
        public static java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanActivity> getPlanActivities(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider planOptionalDomainModelProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider.super.getPlanActivities();
        }

        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay getPlanAutoPay(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider planOptionalDomainModelProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider.super.getPlanAutoPay();
        }

        @java.lang.Deprecated
        public static java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.Document> getPlanDocuments(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider planOptionalDomainModelProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider.super.getPlanDocuments();
        }

        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaymentSchedule getPlanSchedule(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider planOptionalDomainModelProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider.super.getPlanSchedule();
        }

        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze getPlanSnooze(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider planOptionalDomainModelProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider.super.getPlanSnooze();
        }

        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy getPlanVariantPolicy(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider planOptionalDomainModelProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider.super.getPlanVariantPolicy();
        }

        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard getPlanVirtualCard(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider planOptionalDomainModelProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider.super.getPlanVirtualCard();
        }

        @java.lang.Deprecated
        public static java.lang.Boolean isLastPayment(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider planOptionalDomainModelProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider.super.isLastPayment();
        }

        @java.lang.Deprecated
        public static boolean isMiniMirandaRequired(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider planOptionalDomainModelProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider.super.isMiniMirandaRequired();
        }

        @java.lang.Deprecated
        public static boolean isPendingFraud(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider planOptionalDomainModelProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanOptionalDomainModelProvider.super.isPendingFraud();
        }
    }
}
