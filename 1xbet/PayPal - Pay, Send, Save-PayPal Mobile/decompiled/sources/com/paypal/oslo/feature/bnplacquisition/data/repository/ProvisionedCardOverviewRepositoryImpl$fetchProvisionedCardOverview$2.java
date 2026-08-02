package com.paypal.oslo.feature.bnplacquisition.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class ProvisionedCardOverviewRepositoryImpl$fetchProvisionedCardOverview$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.Data, com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetails> {
    public static final com.paypal.oslo.feature.bnplacquisition.data.repository.ProvisionedCardOverviewRepositoryImpl$fetchProvisionedCardOverview$2 Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplacquisition.data.repository.ProvisionedCardOverviewRepositoryImpl$fetchProvisionedCardOverview$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetails invoke(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.Data data) {
        return com.paypal.oslo.feature.bnplacquisition.data.mapper.InStoreVccDetailsMapperKt.toInStoreVccDetails(data);
    }

    ProvisionedCardOverviewRepositoryImpl$fetchProvisionedCardOverview$2() {
        super(1, com.paypal.oslo.feature.bnplacquisition.data.mapper.InStoreVccDetailsMapperKt.class, "toInStoreVccDetails", "toInStoreVccDetails(Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/InStoreVccDetails;", 1);
    }
}
