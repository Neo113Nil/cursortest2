package com.paypal.oslo.feature.bnplacquisition.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class ProductOffersRepositoryImpl$evaluateProductOffers$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.Data, com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.ProductOffers> {
    public static final com.paypal.oslo.feature.bnplacquisition.data.repository.ProductOffersRepositoryImpl$evaluateProductOffers$2 Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplacquisition.data.repository.ProductOffersRepositoryImpl$evaluateProductOffers$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.ProductOffers invoke(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.Data data) {
        return com.paypal.oslo.feature.bnplacquisition.data.mapper.ProductOffersMapperKt.toProductOffers(data);
    }

    ProductOffersRepositoryImpl$evaluateProductOffers$2() {
        super(1, com.paypal.oslo.feature.bnplacquisition.data.mapper.ProductOffersMapperKt.class, "toProductOffers", "toProductOffers(Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/ProductOffers;", 1);
    }
}
