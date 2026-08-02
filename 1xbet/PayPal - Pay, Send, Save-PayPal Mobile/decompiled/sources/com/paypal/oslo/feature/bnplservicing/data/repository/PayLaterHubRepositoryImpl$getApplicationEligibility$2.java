package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class PayLaterHubRepositoryImpl$getApplicationEligibility$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.graphql.GetBnplApplicationEligibilityQuery.Data, com.paypal.oslo.feature.bnplservicing.domain.model.application.ApplicationEligibility> {
    public static final com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getApplicationEligibility$2 getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getApplicationEligibility$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.application.ApplicationEligibility invoke(com.paypal.oslo.feature.bnplservicing.graphql.GetBnplApplicationEligibilityQuery.Data data) {
        return com.paypal.oslo.feature.bnplservicing.data.mapper.application.ApplicationEligibilityMapperKt.toApplicationEligibility(data);
    }

    PayLaterHubRepositoryImpl$getApplicationEligibility$2() {
        super(1, com.paypal.oslo.feature.bnplservicing.data.mapper.application.ApplicationEligibilityMapperKt.class, "toApplicationEligibility", "toApplicationEligibility(Lcom/paypal/oslo/feature/bnplservicing/graphql/GetBnplApplicationEligibilityQuery$Data;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/application/ApplicationEligibility;", 1);
    }
}
