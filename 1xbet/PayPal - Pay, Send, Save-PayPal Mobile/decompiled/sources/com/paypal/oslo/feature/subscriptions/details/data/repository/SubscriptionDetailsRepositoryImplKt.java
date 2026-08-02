package com.paypal.oslo.feature.subscriptions.details.data.repository;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ConsumerAgreement;", "Lcom/paypal/oslo/feature/subscriptions/details/domain/model/SubscriptionDetails;", "toSubscriptionDetails", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementQuery$ConsumerAgreement;)Lcom/paypal/oslo/feature/subscriptions/details/domain/model/SubscriptionDetails;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SubscriptionDetailsRepositoryImplKt {
    /* JADX WARN: Removed duplicated region for block: B:55:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails toSubscriptionDetails(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.ConsumerAgreement consumerAgreement) {
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference;
        com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementType;
        com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument preferredFundingInstrument;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument;
        com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument balanceFundingInstrument;
        java.lang.Object websiteUrl;
        java.lang.Object contactEmail;
        java.lang.Object logoUrl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreement, "");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2 = null;
        if (consumerAgreement.getBalancePreference() == com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference.ENABLED) {
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.BalanceFundingInstrument balanceFundingInstrument2 = consumerAgreement.getBalanceFundingInstrument();
            if (balanceFundingInstrument2 != null) {
                java.lang.String id = balanceFundingInstrument2.getId();
                com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType sharedDomainType = com.paypal.oslo.feature.subscriptions.shared.data.FundingInstrumentMapperKt.toSharedDomainType(balanceFundingInstrument2.getType());
                java.lang.String name2 = balanceFundingInstrument2.getName();
                java.lang.Object thumbnailImageUrl = balanceFundingInstrument2.getThumbnailImageUrl();
                createListBuilder.add(new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument(id, sharedDomainType, name2, null, null, thumbnailImageUrl != null ? thumbnailImageUrl.toString() : null, null, 88, null));
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument preferredFundingInstrument2 = consumerAgreement.getPreferredFundingInstrument();
            if (preferredFundingInstrument2 != null) {
                java.lang.String id2 = preferredFundingInstrument2.getId();
                com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType sharedDomainType2 = com.paypal.oslo.feature.subscriptions.shared.data.FundingInstrumentMapperKt.toSharedDomainType(preferredFundingInstrument2.getType());
                java.lang.String name3 = preferredFundingInstrument2.getName();
                java.lang.Object thumbnailImageUrl2 = preferredFundingInstrument2.getThumbnailImageUrl();
                createListBuilder.add(new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument(id2, sharedDomainType2, name3, null, null, thumbnailImageUrl2 != null ? thumbnailImageUrl2.toString() : null, null, 88, null));
            }
        } else {
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.PreferredFundingInstrument preferredFundingInstrument3 = consumerAgreement.getPreferredFundingInstrument();
            if (preferredFundingInstrument3 != null) {
                java.lang.String id3 = preferredFundingInstrument3.getId();
                com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType sharedDomainType3 = com.paypal.oslo.feature.subscriptions.shared.data.FundingInstrumentMapperKt.toSharedDomainType(preferredFundingInstrument3.getType());
                java.lang.String name4 = preferredFundingInstrument3.getName();
                java.lang.Object thumbnailImageUrl3 = preferredFundingInstrument3.getThumbnailImageUrl();
                createListBuilder.add(new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument(id3, sharedDomainType3, name4, null, null, thumbnailImageUrl3 != null ? thumbnailImageUrl3.toString() : null, null, 88, null));
            }
        }
        java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
        java.lang.String id4 = consumerAgreement.getId();
        com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 merchant = consumerAgreement.getMerchant().getMerchant();
        java.lang.String id5 = merchant != null ? merchant.getId() : null;
        java.lang.String str = id5 == null ? "" : id5;
        com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 merchant2 = consumerAgreement.getMerchant().getMerchant();
        java.lang.String name5 = merchant2 != null ? merchant2.getName() : null;
        java.lang.String str2 = name5 == null ? "" : name5;
        com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.toAgreementType(consumerAgreement.getType());
        com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 merchant3 = consumerAgreement.getMerchant().getMerchant();
        java.lang.String obj = (merchant3 == null || (logoUrl = merchant3.getLogoUrl()) == null) ? null : logoUrl.toString();
        com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference balancePreference2 = consumerAgreement.getBalancePreference();
        int i = balancePreference2 == null ? -1 : com.paypal.oslo.feature.subscriptions.details.data.repository.SubscriptionDetailsRepositoryImplKt.WhenMappings.$EnumSwitchMapping$0[balancePreference2.ordinal()];
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
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 merchant4 = consumerAgreement.getMerchant().getMerchant();
            java.lang.String obj2 = (merchant4 != null || (contactEmail = merchant4.getContactEmail()) == null) ? null : contactEmail.toString();
            if (consumerAgreement.getManagementType() != com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementManagementType.MERCHANT_MANAGED) {
                merchantManagementType = com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.MERCHANT_MANAGED;
            } else {
                merchantManagementType = com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.PAYPAL_MANAGED;
            }
            com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementType2 = merchantManagementType;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 merchant5 = consumerAgreement.getMerchant().getMerchant();
            java.lang.String obj3 = (merchant5 != null || (websiteUrl = merchant5.getWebsiteUrl()) == null) ? null : websiteUrl.toString();
            preferredFundingInstrument = consumerAgreement.getPreferredFundingInstrument();
            if (preferredFundingInstrument == null) {
                java.lang.String id6 = preferredFundingInstrument.getId();
                com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType sharedDomainType4 = com.paypal.oslo.feature.subscriptions.shared.data.FundingInstrumentMapperKt.toSharedDomainType(preferredFundingInstrument.getType());
                java.lang.String name6 = preferredFundingInstrument.getName();
                java.lang.String lastDigits = preferredFundingInstrument.getLastDigits();
                java.lang.Object primaryImageUrl = preferredFundingInstrument.getPrimaryImageUrl();
                java.lang.String obj4 = primaryImageUrl != null ? primaryImageUrl.toString() : null;
                java.lang.Object thumbnailImageUrl4 = preferredFundingInstrument.getThumbnailImageUrl();
                java.lang.String obj5 = thumbnailImageUrl4 != null ? thumbnailImageUrl4.toString() : null;
                com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance balance = preferredFundingInstrument.getBalance();
                fundingInstrument = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument(id6, sharedDomainType4, name6, lastDigits, obj4, obj5, balance != null ? new com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance(balance.getCurrencyCode().toString(), balance.getValue()) : null);
            } else {
                fundingInstrument = null;
            }
            balanceFundingInstrument = consumerAgreement.getBalanceFundingInstrument();
            if (balanceFundingInstrument != null) {
                java.lang.String id7 = balanceFundingInstrument.getId();
                com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType sharedDomainType5 = com.paypal.oslo.feature.subscriptions.shared.data.FundingInstrumentMapperKt.toSharedDomainType(balanceFundingInstrument.getType());
                java.lang.String name7 = balanceFundingInstrument.getName();
                java.lang.String lastDigits2 = balanceFundingInstrument.getLastDigits();
                java.lang.Object primaryImageUrl2 = balanceFundingInstrument.getPrimaryImageUrl();
                java.lang.String obj6 = primaryImageUrl2 != null ? primaryImageUrl2.toString() : null;
                java.lang.Object thumbnailImageUrl5 = balanceFundingInstrument.getThumbnailImageUrl();
                java.lang.String obj7 = thumbnailImageUrl5 != null ? thumbnailImageUrl5.toString() : null;
                com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Balance1 balance2 = balanceFundingInstrument.getBalance();
                fundingInstrument2 = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument(id7, sharedDomainType5, name7, lastDigits2, obj6, obj7, balance2 != null ? new com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance(balance2.getCurrencyCode().toString(), balance2.getValue()) : null);
            }
            return new com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails(id4, str2, agreementType, obj, build, fundingInstrument, fundingInstrument2, obj2, merchantManagementType2, str, balancePreference3, obj3);
        }
        balancePreference = com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.UNKNOWN;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference32 = balancePreference;
        com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 merchant42 = consumerAgreement.getMerchant().getMerchant();
        if (merchant42 != null) {
        }
        if (consumerAgreement.getManagementType() != com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementManagementType.MERCHANT_MANAGED) {
        }
        com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantManagementType22 = merchantManagementType;
        com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Merchant1 merchant52 = consumerAgreement.getMerchant().getMerchant();
        if (merchant52 != null) {
        }
        preferredFundingInstrument = consumerAgreement.getPreferredFundingInstrument();
        if (preferredFundingInstrument == null) {
        }
        balanceFundingInstrument = consumerAgreement.getBalanceFundingInstrument();
        if (balanceFundingInstrument != null) {
        }
        return new com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails(id4, str2, agreementType, obj, build, fundingInstrument, fundingInstrument2, obj2, merchantManagementType22, str, balancePreference32, obj3);
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
