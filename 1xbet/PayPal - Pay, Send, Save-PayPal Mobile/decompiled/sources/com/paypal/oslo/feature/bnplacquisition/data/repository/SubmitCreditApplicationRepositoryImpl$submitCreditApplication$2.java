package com.paypal.oslo.feature.bnplacquisition.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class SubmitCreditApplicationRepositoryImpl$submitCreditApplication$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.graphql.SubmitBnplApplicationMutation.Data, com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails> {
    public static final com.paypal.oslo.feature.bnplacquisition.data.repository.SubmitCreditApplicationRepositoryImpl$submitCreditApplication$2 getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.bnplacquisition.data.repository.SubmitCreditApplicationRepositoryImpl$submitCreditApplication$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails invoke(com.paypal.oslo.feature.bnplacquisition.graphql.SubmitBnplApplicationMutation.Data data) {
        return com.paypal.oslo.feature.bnplacquisition.data.mapper.SubmitVirtualCardApplicationDetailsMapperKt.toSubmitVirtualCardApplicationDetails(data);
    }

    SubmitCreditApplicationRepositoryImpl$submitCreditApplication$2() {
        super(1, com.paypal.oslo.feature.bnplacquisition.data.mapper.SubmitVirtualCardApplicationDetailsMapperKt.class, "toSubmitVirtualCardApplicationDetails", "toSubmitVirtualCardApplicationDetails(Lcom/paypal/oslo/feature/bnplacquisition/graphql/SubmitBnplApplicationMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetails;", 1);
    }
}
