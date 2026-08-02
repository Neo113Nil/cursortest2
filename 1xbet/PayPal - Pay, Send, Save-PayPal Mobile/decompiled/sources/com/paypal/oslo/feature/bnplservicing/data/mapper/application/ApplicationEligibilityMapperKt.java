package com.paypal.oslo.feature.bnplservicing.data.mapper.application;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplApplicationEligibilityQuery$Data;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/application/ApplicationEligibility;", "toApplicationEligibility", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplApplicationEligibilityQuery$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/application/ApplicationEligibility;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ApplicationEligibilityMapperKt {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.application.ApplicationEligibility toApplicationEligibility(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplApplicationEligibilityQuery.Data data) {
        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplApplicationEligibilityQuery.BnplApplicationEligibility bnplApplicationEligibility;
        if (data == null || (bnplApplicationEligibility = data.getBnplApplicationEligibility()) == null) {
            return null;
        }
        return new com.paypal.oslo.feature.bnplservicing.domain.model.application.ApplicationEligibility(bnplApplicationEligibility.getEligibleToApplyForAnyRequestedProducts());
    }
}
