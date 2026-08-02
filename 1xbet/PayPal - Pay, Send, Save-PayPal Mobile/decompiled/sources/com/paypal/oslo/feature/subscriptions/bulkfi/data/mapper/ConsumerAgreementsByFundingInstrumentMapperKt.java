package com.paypal.oslo.feature.subscriptions.bulkfi.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$ConsumerAgreementsByFundingInstrument;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/domain/model/BulkUpdateFiData;", "toBulkUpdateFiData", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementsByFundingInstrumentQuery$ConsumerAgreementsByFundingInstrument;)Lcom/paypal/oslo/feature/subscriptions/bulkfi/domain/model/BulkUpdateFiData;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConsumerAgreementsByFundingInstrumentMapperKt {
    /* JADX WARN: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.subscriptions.bulkfi.domain.model.BulkUpdateFiData toBulkUpdateFiData(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreementsByFundingInstrument consumerAgreementsByFundingInstrument) {
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference;
        java.lang.Object logoUrl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementsByFundingInstrument, "");
        com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.FundingInstrument fundingInstrument2 = consumerAgreementsByFundingInstrument.getFundingInstrument();
        if (fundingInstrument2 != null) {
            java.lang.String id = fundingInstrument2.getId();
            java.lang.String name2 = fundingInstrument2.getName();
            java.lang.String lastDigits = fundingInstrument2.getLastDigits();
            com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType sharedDomainType = com.paypal.oslo.feature.subscriptions.shared.data.FundingInstrumentMapperKt.toSharedDomainType(fundingInstrument2.getType());
            java.lang.String valueOf = java.lang.String.valueOf(fundingInstrument2.getThumbnailImageUrl());
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Balance balance = fundingInstrument2.getBalance();
            fundingInstrument = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument(id, sharedDomainType, name2, lastDigits, null, valueOf, balance != null ? new com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance(balance.getCurrencyCode().toString(), balance.getValue()) : null, 16, null);
        } else {
            fundingInstrument = null;
        }
        java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreement> consumerAgreements = consumerAgreementsByFundingInstrument.getConsumerAgreements();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(consumerAgreements, 10));
        for (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreement consumerAgreement : consumerAgreements) {
            java.lang.String id2 = consumerAgreement.getId();
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.toAgreementType(consumerAgreement.getType());
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1 merchant = consumerAgreement.getMerchant().getMerchant();
            java.lang.String id3 = merchant != null ? merchant.getId() : null;
            if (id3 == null) {
                id3 = "";
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1 merchant2 = consumerAgreement.getMerchant().getMerchant();
            java.lang.String name3 = merchant2 != null ? merchant2.getName() : null;
            if (name3 == null) {
                name3 = "";
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Merchant1 merchant3 = consumerAgreement.getMerchant().getMerchant();
            java.lang.String obj = (merchant3 == null || (logoUrl = merchant3.getLogoUrl()) == null) ? null : logoUrl.toString();
            if (obj == null) {
                obj = "";
            }
            com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant4 = new com.paypal.oslo.feature.subscriptions.hub.domain.Merchant(id3, name3, obj);
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.PreferredFundingInstrument preferredFundingInstrument = consumerAgreement.getPreferredFundingInstrument();
            com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument3 = preferredFundingInstrument != null ? new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument(preferredFundingInstrument.getId(), com.paypal.oslo.feature.subscriptions.shared.data.FundingInstrumentMapperKt.toSharedDomainType(preferredFundingInstrument.getType()), preferredFundingInstrument.getName(), preferredFundingInstrument.getLastDigits(), null, null, null, 112, null) : null;
            com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference balancePreference2 = consumerAgreement.getBalancePreference();
            int i = balancePreference2 == null ? -1 : com.paypal.oslo.feature.subscriptions.bulkfi.data.mapper.ConsumerAgreementsByFundingInstrumentMapperKt.WhenMappings.$EnumSwitchMapping$0[balancePreference2.ordinal()];
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
                com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument balanceFundingInstrument = consumerAgreement.getBalanceFundingInstrument();
                arrayList.add(new com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem(id2, agreementType, balancePreference3, fundingInstrument3, balanceFundingInstrument == null ? new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument(balanceFundingInstrument.getId(), com.paypal.oslo.feature.subscriptions.shared.data.FundingInstrumentMapperKt.toSharedDomainType(balanceFundingInstrument.getType()), null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null) : null, merchant4, null));
            }
            balancePreference = com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.UNKNOWN;
            com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference32 = balancePreference;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.BalanceFundingInstrument balanceFundingInstrument2 = consumerAgreement.getBalanceFundingInstrument();
            arrayList.add(new com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem(id2, agreementType, balancePreference32, fundingInstrument3, balanceFundingInstrument2 == null ? new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument(balanceFundingInstrument2.getId(), com.paypal.oslo.feature.subscriptions.shared.data.FundingInstrumentMapperKt.toSharedDomainType(balanceFundingInstrument2.getType()), null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null) : null, merchant4, null));
        }
        return new com.paypal.oslo.feature.subscriptions.bulkfi.domain.model.BulkUpdateFiData(fundingInstrument, arrayList);
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
