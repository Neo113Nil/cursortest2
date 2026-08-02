package com.paypal.oslo.feature.bnplservicing.domain.model.plandetails;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanInstallmentsDataProvider;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentDetails;", "getInstallmentDetails", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentDetails;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentSummary;", "getInstallmentSummary", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/InstallmentSummary;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface PlanInstallmentsDataProvider {
    default com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDetails getInstallmentDetails() {
        return null;
    }

    default com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentSummary getInstallmentSummary() {
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentDetails getInstallmentDetails(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanInstallmentsDataProvider planInstallmentsDataProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanInstallmentsDataProvider.super.getInstallmentDetails();
        }

        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.InstallmentSummary getInstallmentSummary(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanInstallmentsDataProvider planInstallmentsDataProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanInstallmentsDataProvider.super.getInstallmentSummary();
        }
    }
}
