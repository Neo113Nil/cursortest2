package com.paypal.oslo.feature.bnplacquisition.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class CreateCreditApplicationRepositoryImpl$createCreditApplication$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Data, com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplication> {
    public static final com.paypal.oslo.feature.bnplacquisition.data.repository.CreateCreditApplicationRepositoryImpl$createCreditApplication$2 getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.bnplacquisition.data.repository.CreateCreditApplicationRepositoryImpl$createCreditApplication$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplication invoke(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Data data) {
        return com.paypal.oslo.feature.bnplacquisition.data.mapper.CreateCreditApplicationMapperKt.toCreateCreditApplication(data);
    }

    CreateCreditApplicationRepositoryImpl$createCreditApplication$2() {
        super(1, com.paypal.oslo.feature.bnplacquisition.data.mapper.CreateCreditApplicationMapperKt.class, "toCreateCreditApplication", "toCreateCreditApplication(Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplication;", 1);
    }
}
