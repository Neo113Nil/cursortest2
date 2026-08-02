package com.paypal.oslo.feature.bnplacquisition.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class LoanConstraintsRepositoryImpl$getLoanConstraints$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplApplicationConstraintsQuery.Data, com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanConstraints> {
    public static final com.paypal.oslo.feature.bnplacquisition.data.repository.LoanConstraintsRepositoryImpl$getLoanConstraints$2 getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.bnplacquisition.data.repository.LoanConstraintsRepositoryImpl$getLoanConstraints$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanConstraints invoke(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplApplicationConstraintsQuery.Data data) {
        return com.paypal.oslo.feature.bnplacquisition.data.mapper.LoanConstraintsMapperKt.toLoanConstraints(data);
    }

    LoanConstraintsRepositoryImpl$getLoanConstraints$2() {
        super(1, com.paypal.oslo.feature.bnplacquisition.data.mapper.LoanConstraintsMapperKt.class, "toLoanConstraints", "toLoanConstraints(Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplApplicationConstraintsQuery$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/loanconstraints/LoanConstraints;", 1);
    }
}
