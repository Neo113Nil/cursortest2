package com.paypal.oslo.feature.bnplacquisition.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class BnplPlansRepositoryImpl$getBnplPlans$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Data, com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansResponse> {
    public static final com.paypal.oslo.feature.bnplacquisition.data.repository.BnplPlansRepositoryImpl$getBnplPlans$2 getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.bnplacquisition.data.repository.BnplPlansRepositoryImpl$getBnplPlans$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansResponse invoke(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplPlansQuery.Data data) {
        return com.paypal.oslo.feature.bnplacquisition.data.mapper.BnplPlansMapperKt.toBnplPlansResponse(data);
    }

    BnplPlansRepositoryImpl$getBnplPlans$2() {
        super(1, com.paypal.oslo.feature.bnplacquisition.data.mapper.BnplPlansMapperKt.class, "toBnplPlansResponse", "toBnplPlansResponse(Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplPlansQuery$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/plans/BnplPlansResponse;", 1);
    }
}
