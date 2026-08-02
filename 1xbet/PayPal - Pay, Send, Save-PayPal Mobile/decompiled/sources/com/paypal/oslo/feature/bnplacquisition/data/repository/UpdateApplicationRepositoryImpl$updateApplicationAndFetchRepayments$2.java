package com.paypal.oslo.feature.bnplacquisition.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class UpdateApplicationRepositoryImpl$updateApplicationAndFetchRepayments$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Data, com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.Repayments> {
    public static final com.paypal.oslo.feature.bnplacquisition.data.repository.UpdateApplicationRepositoryImpl$updateApplicationAndFetchRepayments$2 getHighSpeedVideoSizes = new com.paypal.oslo.feature.bnplacquisition.data.repository.UpdateApplicationRepositoryImpl$updateApplicationAndFetchRepayments$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.Repayments invoke(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchRepaymentsMutation.Data data) {
        return com.paypal.oslo.feature.bnplacquisition.data.mapper.RepaymentSelectionMapperKt.toRepayments(data);
    }

    UpdateApplicationRepositoryImpl$updateApplicationAndFetchRepayments$2() {
        super(1, com.paypal.oslo.feature.bnplacquisition.data.mapper.RepaymentSelectionMapperKt.class, "toRepayments", "toRepayments(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchRepaymentsMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/Repayments;", 1);
    }
}
