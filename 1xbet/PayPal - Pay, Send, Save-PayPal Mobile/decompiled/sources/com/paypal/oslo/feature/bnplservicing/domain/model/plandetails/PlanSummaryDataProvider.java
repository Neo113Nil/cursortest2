package com.paypal.oslo.feature.bnplservicing.domain.model.plandetails;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanSummaryDataProvider;", "", "", "isLastPayment", "()Ljava/lang/Boolean;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface PlanSummaryDataProvider {
    default java.lang.Boolean isLastPayment() {
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static java.lang.Boolean isLastPayment(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanSummaryDataProvider planSummaryDataProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanSummaryDataProvider.super.isLastPayment();
        }
    }
}
