package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006*\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/ProductOffers;", "toProductOffers", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/ProductOffers;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/EvaluateProductOffersRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/EvaluateBNPLProductOffersInput;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/type/EvaluateBNPLProductOffersInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/EvaluateProductOffersRequest;)Lcom/paypal/oslo/api/graphql/schema/type/EvaluateBNPLProductOffersInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductOffersMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.ProductOffers toProductOffers(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.Data data) {
        com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers evaluateBnplProductOffers;
        com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.ProductOffersSuccess productOffersSuccess;
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionProductOffersEligibilityDeclineReason reason;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline applicationDecline = null;
        if (data == null || (evaluateBnplProductOffers = data.getEvaluateBnplProductOffers()) == null) {
            return null;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersSuccess onEvaluateBNPLProductOffersSuccess = evaluateBnplProductOffers.getOnEvaluateBNPLProductOffersSuccess();
        if (onEvaluateBNPLProductOffersSuccess != null) {
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EligibleProductOfferEvaluation> eligibleProductOfferEvaluations = onEvaluateBNPLProductOffersSuccess.getEligibleProductOfferEvaluations();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(eligibleProductOfferEvaluations, 10));
            for (com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EligibleProductOfferEvaluation eligibleProductOfferEvaluation : eligibleProductOfferEvaluations) {
                com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier from = com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.INSTANCE.from(eligibleProductOfferEvaluation.getCreditProductIdentifier().name());
                java.lang.Object id = eligibleProductOfferEvaluation.getId();
                arrayList.add(new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer(from, id instanceof java.lang.String ? (java.lang.String) id : null, null, 4, null));
            }
            productOffersSuccess = new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.ProductOffersSuccess(arrayList);
        } else {
            productOffersSuccess = null;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersDecline onEvaluateBNPLProductOffersDecline = evaluateBnplProductOffers.getOnEvaluateBNPLProductOffersDecline();
        if (onEvaluateBNPLProductOffersDecline != null && (reason = onEvaluateBNPLProductOffersDecline.getReason()) != null) {
            applicationDecline = com.paypal.oslo.feature.bnplacquisition.data.mapper.ApplicationDeclineMapperKt.toApplicationDecline(reason);
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.ProductOffers(productOffersSuccess, applicationDecline);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProductOffersInput toGraphQLInput(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.EvaluateProductOffersRequest evaluateProductOffersRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluateProductOffersRequest, "");
        java.lang.String applicationSessionId = evaluateProductOffersRequest.getApplicationSessionId();
        java.lang.String currencyCode = evaluateProductOffersRequest.getAmount().getCurrencyCode();
        return new com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProductOffersInput(new com.apollographql.apollo.api.Optional.Present(new com.paypal.oslo.api.graphql.schema.type.MoneyInput(currencyCode != null ? currencyCode : "", evaluateProductOffersRequest.getAmount().getValue())), applicationSessionId, null, 4, null);
    }
}
