package com.paypal.oslo.feature.bnplacquisition.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class CloseCreditLoanRepositoryImpl$closeLoan$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.graphql.CloseBnplLoanMutation.Data, com.paypal.oslo.feature.bnplacquisition.domain.model.closeloan.CloseCreditLoan> {
    public static final com.paypal.oslo.feature.bnplacquisition.data.repository.CloseCreditLoanRepositoryImpl$closeLoan$2 getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.bnplacquisition.data.repository.CloseCreditLoanRepositoryImpl$closeLoan$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.closeloan.CloseCreditLoan invoke(com.paypal.oslo.feature.bnplacquisition.graphql.CloseBnplLoanMutation.Data data) {
        return com.paypal.oslo.feature.bnplacquisition.data.mapper.CloseCreditLoanMapperKt.toCloseCreditLoan(data);
    }

    CloseCreditLoanRepositoryImpl$closeLoan$2() {
        super(1, com.paypal.oslo.feature.bnplacquisition.data.mapper.CloseCreditLoanMapperKt.class, "toCloseCreditLoan", "toCloseCreditLoan(Lcom/paypal/oslo/feature/bnplacquisition/graphql/CloseBnplLoanMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/closeloan/CloseCreditLoan;", 1);
    }
}
