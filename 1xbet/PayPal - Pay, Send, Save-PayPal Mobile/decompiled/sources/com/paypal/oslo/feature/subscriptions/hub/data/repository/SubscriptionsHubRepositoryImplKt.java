package com.paypal.oslo.feature.subscriptions.hub.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsQuery$Page;", "Lcom/paypal/oslo/feature/subscriptions/hub/data/model/SubscriptionsPage;", "toSubscriptionsPage", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsQuery$Page;)Lcom/paypal/oslo/feature/subscriptions/hub/data/model/SubscriptionsPage;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsQuery$Item;", "Lcom/paypal/oslo/feature/subscriptions/hub/domain/SubscriptionItem;", "toSubscriptionItem", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsQuery$Item;)Lcom/paypal/oslo/feature/subscriptions/hub/domain/SubscriptionItem;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SubscriptionsHubRepositoryImplKt {
    public static final com.paypal.oslo.feature.subscriptions.hub.data.model.SubscriptionsPage toSubscriptionsPage(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsQuery.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsQuery.Item> items = page.getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toSubscriptionItem((com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsQuery.Item) it.next()));
        }
        return new com.paypal.oslo.feature.subscriptions.hub.data.model.SubscriptionsPage(arrayList, page.getCursor(), page.getHasNextPage());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem toSubscriptionItem(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsQuery.Item item) {
        com.paypal.oslo.feature.subscriptions.hub.data.repository.FundingInstrumentPair fundingInstrumentPair;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference;
        java.lang.String id;
        java.lang.Object logoUrl;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        if (item.getBalancePreference() == com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference.ENABLED) {
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsQuery.BalanceFundingInstrument balanceFundingInstrument = item.getBalanceFundingInstrument();
            if (balanceFundingInstrument != null) {
                java.lang.String id2 = balanceFundingInstrument.getId();
                com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType sharedDomainType = com.paypal.oslo.feature.subscriptions.shared.data.FundingInstrumentMapperKt.toSharedDomainType(balanceFundingInstrument.getType());
                com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsQuery.Balance balance = balanceFundingInstrument.getBalance();
                fundingInstrument = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument(id2, sharedDomainType, null, null, null, null, balance != null ? new com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance(balance.getCurrencyCode().toString(), balance.getValue()) : null, 60, null);
            } else {
                fundingInstrument = null;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsQuery.PreferredFundingInstrument preferredFundingInstrument = item.getPreferredFundingInstrument();
            fundingInstrumentPair = new com.paypal.oslo.feature.subscriptions.hub.data.repository.FundingInstrumentPair(preferredFundingInstrument != null ? new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument(preferredFundingInstrument.getId(), com.paypal.oslo.feature.subscriptions.shared.data.FundingInstrumentMapperKt.toSharedDomainType(preferredFundingInstrument.getType()), preferredFundingInstrument.getName(), preferredFundingInstrument.getLastDigits(), null, null, null, 112, null) : null, fundingInstrument);
        } else {
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsQuery.PreferredFundingInstrument preferredFundingInstrument2 = item.getPreferredFundingInstrument();
            fundingInstrumentPair = new com.paypal.oslo.feature.subscriptions.hub.data.repository.FundingInstrumentPair(preferredFundingInstrument2 != null ? new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument(preferredFundingInstrument2.getId(), com.paypal.oslo.feature.subscriptions.shared.data.FundingInstrumentMapperKt.toSharedDomainType(preferredFundingInstrument2.getType()), preferredFundingInstrument2.getName(), preferredFundingInstrument2.getLastDigits(), null, null, null, 112, null) : null, new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument("no-balance", com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType.PAYPAL_BALANCE, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null));
        }
        java.lang.String id3 = item.getId();
        com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.toAgreementType(item.getType());
        com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference balancePreference2 = item.getBalancePreference();
        int i = balancePreference2 == null ? -1 : com.paypal.oslo.feature.subscriptions.hub.data.repository.SubscriptionsHubRepositoryImplKt.WhenMappings.$EnumSwitchMapping$0[balancePreference2.ordinal()];
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
            com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference3 = balancePreference;
            com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2 = fundingInstrumentPair.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument3 = fundingInstrumentPair.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsQuery.Merchant1 merchant = item.getMerchant().getMerchant();
            id = merchant == null ? merchant.getId() : null;
            if (id == null) {
                id = "";
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsQuery.Merchant1 merchant2 = item.getMerchant().getMerchant();
            java.lang.String name2 = merchant2 == null ? merchant2.getName() : null;
            java.lang.String str = name2 != null ? name2 : "";
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsQuery.Merchant1 merchant3 = item.getMerchant().getMerchant();
            return new com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem(id3, agreementType, balancePreference3, fundingInstrument2, fundingInstrument3, new com.paypal.oslo.feature.subscriptions.hub.domain.Merchant(id, str, (merchant3 != null || (logoUrl = merchant3.getLogoUrl()) == null) ? null : logoUrl.toString()), item.getLastPayment() != null ? new com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation(item.getLastPayment().getPaymentTime().toString(), new com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance(item.getLastPayment().getAmount().getCurrencyCode().toString(), item.getLastPayment().getAmount().getValue())) : null);
        }
        balancePreference = com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.UNKNOWN;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference32 = balancePreference;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument22 = fundingInstrumentPair.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument32 = fundingInstrumentPair.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsQuery.Merchant1 merchant4 = item.getMerchant().getMerchant();
        if (merchant4 == null) {
        }
        if (id == null) {
        }
        com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsQuery.Merchant1 merchant22 = item.getMerchant().getMerchant();
        if (merchant22 == null) {
        }
        if (name2 != null) {
        }
        com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsQuery.Merchant1 merchant32 = item.getMerchant().getMerchant();
        return new com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem(id3, agreementType, balancePreference32, fundingInstrument22, fundingInstrument32, new com.paypal.oslo.feature.subscriptions.hub.domain.Merchant(id, str, (merchant32 != null || (logoUrl = merchant32.getLogoUrl()) == null) ? null : logoUrl.toString()), item.getLastPayment() != null ? new com.paypal.oslo.feature.subscriptions.hub.domain.LastPaymentInformation(item.getLastPayment().getPaymentTime().toString(), new com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance(item.getLastPayment().getAmount().getCurrencyCode().toString(), item.getLastPayment().getAmount().getValue())) : null);
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
