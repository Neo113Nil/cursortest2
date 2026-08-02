package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0006H\u0000¢\u0006\u0004\b\u0004\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAccountFragment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/PersistentDebt;", "persistentDebt", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountOverview;", "toAccountOverview", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAccountFragment;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/PersistentDebt;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountOverview;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAccountFragment;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/PaymentSummaryAccountFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountOverview;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AccountOverviewMapperKt {
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview toAccountOverview$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PersistentDebt persistentDebt, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            persistentDebt = null;
        }
        return toAccountOverview(revolvingCreditAccountFragment, persistentDebt);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview toAccountOverview(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PersistentDebt persistentDebt) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon revolvingCardIcon;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment revolvingCreditServicingProductFragment;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductTier tier;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment revolvingCreditServicingProductFragment2;
        com.paypal.oslo.api.graphql.schema.type.IssuanceCardNetwork cardNetwork;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment revolvingCreditServicingProductFragment3;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment revolvingCreditServicingProductFragment4;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.CardDisplayLogo cardDisplayLogo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditAccountFragment, "");
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment.Tag> tags = revolvingCreditAccountFragment.getTags();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductTier productTier = null;
        if (tags != null) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment.Tag> list = tags;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.CreditAccountTagMapperKt.toDomain(((com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment.Tag) it.next()).getName()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAllowedFeature> allowedFeatures = revolvingCreditAccountFragment.getAllowedFeatures();
        if (allowedFeatures != null) {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAllowedFeature> list2 = allowedFeatures;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.AllowedFeaturesMapperKt.toDomain((com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAllowedFeature) it2.next()));
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditBillingFragment.Billing billing = revolvingCreditAccountFragment.getRevolvingCreditBillingFragment().getBilling();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing domain = billing != null ? com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.BillingMapperKt.toDomain(billing) : null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountAPRs accountAPRs = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.AccountAprMapperKt.toAccountAPRs(revolvingCreditAccountFragment);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment.Product product = revolvingCreditAccountFragment.getProduct();
        if (product == null || (revolvingCreditServicingProductFragment4 = product.getRevolvingCreditServicingProductFragment()) == null || (cardDisplayLogo = revolvingCreditServicingProductFragment4.getCardDisplayLogo()) == null) {
            revolvingCardIcon = null;
        } else {
            java.lang.String assetName = cardDisplayLogo.getRevolvingCreditImageFragment().getAssetName();
            java.lang.Object url = cardDisplayLogo.getRevolvingCreditImageFragment().getUrl();
            revolvingCardIcon = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.engagement.RevolvingCardIcon(assetName, url instanceof java.lang.String ? (java.lang.String) url : null);
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment.Product product2 = revolvingCreditAccountFragment.getProduct();
        java.lang.String cardDisplayName = (product2 == null || (revolvingCreditServicingProductFragment3 = product2.getRevolvingCreditServicingProductFragment()) == null) ? null : revolvingCreditServicingProductFragment3.getCardDisplayName();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment.Product product3 = revolvingCreditAccountFragment.getProduct();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CardNetwork domain2 = (product3 == null || (revolvingCreditServicingProductFragment2 = product3.getRevolvingCreditServicingProductFragment()) == null || (cardNetwork = revolvingCreditServicingProductFragment2.getCardNetwork()) == null) ? null : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.CardNetworkMapperKt.toDomain(cardNetwork);
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment.Product product4 = revolvingCreditAccountFragment.getProduct();
        if (product4 != null && (revolvingCreditServicingProductFragment = product4.getRevolvingCreditServicingProductFragment()) != null && (tier = revolvingCreditServicingProductFragment.getTier()) != null) {
            productTier = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.ProductTierMapperKt.toDomain(tier);
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview(arrayList, arrayList2, domain, accountAPRs, revolvingCardIcon, cardDisplayName, domain2, null, productTier, persistentDebt, null);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview toAccountOverview(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment paymentSummaryAccountFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentSummaryAccountFragment, "");
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.PaymentSummaryAccountFragment.Billing billing = paymentSummaryAccountFragment.getBilling();
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview(null, null, billing != null ? com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.BillingMapperKt.toPaymentSummaryDomain(billing) : null, null, null, null, null, null, null, null, null);
    }
}
