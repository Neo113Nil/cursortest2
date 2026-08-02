package com.paypal.oslo.feature.bnplservicing.domain.model.plandetails;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanPaymentDataProvider;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "getFundingInstrument", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Autopay;", "getPlanAutoPay", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Autopay;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PaymentSchedule;", "getPlanSchedule", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PaymentSchedule;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze;", "getPlanSnooze", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/Snooze;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface PlanPaymentDataProvider {
    default com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument getFundingInstrument() {
        return null;
    }

    default com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay getPlanAutoPay() {
        return null;
    }

    default com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaymentSchedule getPlanSchedule() {
        return null;
    }

    default com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze getPlanSnooze() {
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument getFundingInstrument(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanPaymentDataProvider planPaymentDataProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanPaymentDataProvider.super.getFundingInstrument();
        }

        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay getPlanAutoPay(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanPaymentDataProvider planPaymentDataProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanPaymentDataProvider.super.getPlanAutoPay();
        }

        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaymentSchedule getPlanSchedule(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanPaymentDataProvider planPaymentDataProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanPaymentDataProvider.super.getPlanSchedule();
        }

        @java.lang.Deprecated
        public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Snooze getPlanSnooze(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanPaymentDataProvider planPaymentDataProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanPaymentDataProvider.super.getPlanSnooze();
        }
    }
}
