package com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Page;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/data/model/MerchantsPage;", "toMerchantsPage", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Page;)Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/data/model/MerchantsPage;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$OnConsumerAgreementMerchant;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/model/ConsumerAgreementMerchant;", "toConsumerAgreementMerchant", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$OnConsumerAgreementMerchant;)Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/model/ConsumerAgreementMerchant;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LinkAgreementsRepositoryImplKt {
    public static final com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.model.MerchantsPage toMerchantsPage(com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Item> items = page.getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.OnConsumerAgreementMerchant onConsumerAgreementMerchant = ((com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Item) it.next()).getOnConsumerAgreementMerchant();
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant consumerAgreementMerchant = onConsumerAgreementMerchant != null ? toConsumerAgreementMerchant(onConsumerAgreementMerchant) : null;
            if (consumerAgreementMerchant != null) {
                arrayList.add(consumerAgreementMerchant);
            }
        }
        return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.model.MerchantsPage(arrayList, page.getCursor(), page.getHasNextPage());
    }

    public static final com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant toConsumerAgreementMerchant(com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.OnConsumerAgreementMerchant onConsumerAgreementMerchant) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onConsumerAgreementMerchant, "");
        com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Merchant merchant = onConsumerAgreementMerchant.getMerchant();
        if (merchant == null) {
            return null;
        }
        java.lang.String id = merchant.getId();
        java.lang.String name2 = merchant.getName();
        java.lang.Object logoUrl = merchant.getLogoUrl();
        if (logoUrl == null || (str = logoUrl.toString()) == null || kotlin.text.StringsKt.isBlank(str)) {
            str = null;
        }
        java.lang.Object websiteUrl = merchant.getWebsiteUrl();
        return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant(id, name2, str, websiteUrl != null ? websiteUrl.toString() : null);
    }
}
