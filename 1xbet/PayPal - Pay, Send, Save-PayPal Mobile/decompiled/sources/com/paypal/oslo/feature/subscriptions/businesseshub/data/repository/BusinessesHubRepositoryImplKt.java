package com.paypal.oslo.feature.subscriptions.businesseshub.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsBusinessesQuery$Page;", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/data/model/BusinessesPage;", "toBusinessesPage", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsBusinessesQuery$Page;)Lcom/paypal/oslo/feature/subscriptions/businesseshub/data/model/BusinessesPage;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsBusinessesQuery$Item;", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/LinkedBusinessAgreementItem;", "toLinkedBusinessAgreementItem", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsBusinessesQuery$Item;)Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/LinkedBusinessAgreementItem;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BusinessesHubRepositoryImplKt {
    public static final com.paypal.oslo.feature.subscriptions.businesseshub.data.model.BusinessesPage toBusinessesPage(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsBusinessesQuery.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsBusinessesQuery.Item> items = page.getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toLinkedBusinessAgreementItem((com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsBusinessesQuery.Item) it.next()));
        }
        return new com.paypal.oslo.feature.subscriptions.businesseshub.data.model.BusinessesPage(arrayList, page.getCursor(), page.getHasNextPage());
    }

    public static final com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem toLinkedBusinessAgreementItem(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsBusinessesQuery.Item item) {
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference;
        java.lang.Object logoUrl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        java.lang.String id = item.getId();
        com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsBusinessesQuery.Merchant1 merchant = item.getMerchant().getMerchant();
        java.lang.String str = null;
        java.lang.String id2 = merchant != null ? merchant.getId() : null;
        java.lang.String str2 = id2 == null ? "" : id2;
        com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsBusinessesQuery.Merchant1 merchant2 = item.getMerchant().getMerchant();
        java.lang.String name2 = merchant2 != null ? merchant2.getName() : null;
        if (name2 == null) {
            name2 = "";
        }
        com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsBusinessesQuery.PreferredFundingInstrument preferredFundingInstrument = item.getPreferredFundingInstrument();
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2 = (preferredFundingInstrument == null || preferredFundingInstrument == null) ? null : new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument(preferredFundingInstrument.getId(), com.paypal.oslo.feature.subscriptions.shared.data.FundingInstrumentMapperKt.toSharedDomainType(preferredFundingInstrument.getType()), preferredFundingInstrument.getName(), preferredFundingInstrument.getLastDigits(), null, null, null, 112, null);
        com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsBusinessesQuery.BalanceFundingInstrument balanceFundingInstrument = item.getBalanceFundingInstrument();
        if (balanceFundingInstrument == null || balanceFundingInstrument == null) {
            fundingInstrument = null;
        } else {
            java.lang.String id3 = balanceFundingInstrument.getId();
            com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType sharedDomainType = com.paypal.oslo.feature.subscriptions.shared.data.FundingInstrumentMapperKt.toSharedDomainType(balanceFundingInstrument.getType());
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsBusinessesQuery.Balance balance = balanceFundingInstrument.getBalance();
            fundingInstrument = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument(id3, sharedDomainType, null, null, null, null, balance != null ? new com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance(balance.getCurrencyCode().toString(), balance.getValue()) : null, 60, null);
        }
        com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsBusinessesQuery.Merchant1 merchant3 = item.getMerchant().getMerchant();
        if (merchant3 != null && (logoUrl = merchant3.getLogoUrl()) != null) {
            str = logoUrl.toString();
        }
        java.lang.String str3 = str == null ? "" : str;
        com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference balancePreference2 = item.getBalancePreference();
        int i = balancePreference2 == null ? -1 : com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImplKt.WhenMappings.$EnumSwitchMapping$0[balancePreference2.ordinal()];
        if (i != -1) {
            if (i == 1) {
                balancePreference = com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.ENABLED;
            } else if (i == 2) {
                balancePreference = com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.DISABLED;
            } else if (i == 3) {
                balancePreference = com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.UNAVAILABLE;
            } else if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return new com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem(id, name2, fundingInstrument2, fundingInstrument, balancePreference, str2, str3);
        }
        balancePreference = com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.UNKNOWN;
        return new com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem(id, name2, fundingInstrument2, fundingInstrument, balancePreference, str2, str3);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference.ENABLED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference.DISABLED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference.UNAVAILABLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference.UNKNOWN__.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
