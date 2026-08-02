package com.paypal.oslo.feature.bnplacquisition.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class UpdateApplicationRepositoryImpl$updateApplicationAndFetchOffers$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Data, com.paypal.oslo.feature.bnplacquisition.domain.model.AvailableOfferDetails> {
    public static final com.paypal.oslo.feature.bnplacquisition.data.repository.UpdateApplicationRepositoryImpl$updateApplicationAndFetchOffers$2 getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.bnplacquisition.data.repository.UpdateApplicationRepositoryImpl$updateApplicationAndFetchOffers$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.AvailableOfferDetails invoke(com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchOffersMutation.Data data) {
        return com.paypal.oslo.feature.bnplacquisition.data.mapper.AvailableOffersMapperKt.toAvailableOffers(data);
    }

    UpdateApplicationRepositoryImpl$updateApplicationAndFetchOffers$2() {
        super(1, com.paypal.oslo.feature.bnplacquisition.data.mapper.AvailableOffersMapperKt.class, "toAvailableOffers", "toAvailableOffers(Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchOffersMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/AvailableOfferDetails;", 1);
    }
}
