package com.paypal.oslo.feature.bnplacquisition.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class CheckApplicationEligibilityRepositoryImpl$checkApplicationEligibility$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.Data, com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CheckApplicationEligibility> {
    public static final com.paypal.oslo.feature.bnplacquisition.data.repository.CheckApplicationEligibilityRepositoryImpl$checkApplicationEligibility$2 Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplacquisition.data.repository.CheckApplicationEligibilityRepositoryImpl$checkApplicationEligibility$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CheckApplicationEligibility invoke(com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.Data data) {
        return com.paypal.oslo.feature.bnplacquisition.data.mapper.CheckApplicationEligibilityMapperKt.toCheckApplicationEligibility(data);
    }

    CheckApplicationEligibilityRepositoryImpl$checkApplicationEligibility$2() {
        super(1, com.paypal.oslo.feature.bnplacquisition.data.mapper.CheckApplicationEligibilityMapperKt.class, "toCheckApplicationEligibility", "toCheckApplicationEligibility(Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CheckApplicationEligibility;", 1);
    }
}
