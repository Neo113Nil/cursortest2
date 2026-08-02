package com.paypal.oslo.feature.subscriptions.updatefi.data.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$ConsumerAgreementFundingInstruments;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/model/ConsumerAgreementFundingInstruments;", "toDomainFundingInstrument", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$ConsumerAgreementFundingInstruments;)Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/model/ConsumerAgreementFundingInstruments;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$FundingInstrument;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetConsumerAgreementFundingInstrumentsQuery$FundingInstrument;)Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementBalancePreference;", "toGraphQL", "(Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;)Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementBalancePreference;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConsumerAgreementFundingInstrumentsMapperKt {
    public static final com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments toDomainFundingInstrument(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.ConsumerAgreementFundingInstruments consumerAgreementFundingInstruments) {
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument;
        java.lang.Object obj;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementFundingInstruments, "");
        java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.FundingInstrument> fundingInstruments = consumerAgreementFundingInstruments.getFundingInstruments();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(fundingInstruments, 10));
        java.util.Iterator<T> it = fundingInstruments.iterator();
        while (it.hasNext()) {
            arrayList.add(getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.FundingInstrument) it.next()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.Iterator<T> it2 = consumerAgreementFundingInstruments.getFundingInstruments().iterator();
        while (true) {
            fundingInstrument = null;
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            java.lang.String id = ((com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.FundingInstrument) obj).getId();
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.PreferredFundingInstrument preferredFundingInstrument = consumerAgreementFundingInstruments.getPreferredFundingInstrument();
            if (kotlin.jvm.internal.Intrinsics.areEqual(id, preferredFundingInstrument != null ? preferredFundingInstrument.getId() : null)) {
                break;
            }
        }
        com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.FundingInstrument fundingInstrument2 = (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.FundingInstrument) obj;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument highResolutionOutputSizeshNQ4ISI = fundingInstrument2 != null ? getHighResolutionOutputSizeshNQ4ISI(fundingInstrument2) : null;
        com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.BalanceFundingInstrument balanceFundingInstrument = consumerAgreementFundingInstruments.getBalanceFundingInstrument();
        if (balanceFundingInstrument != null) {
            java.lang.String id2 = balanceFundingInstrument.getId();
            java.lang.String name2 = balanceFundingInstrument.getName();
            com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType sharedDomainType = com.paypal.oslo.feature.subscriptions.shared.data.FundingInstrumentMapperKt.toSharedDomainType(balanceFundingInstrument.getType());
            java.lang.Object primaryImageUrl = balanceFundingInstrument.getPrimaryImageUrl();
            java.lang.String obj2 = primaryImageUrl != null ? primaryImageUrl.toString() : null;
            java.lang.Object thumbnailImageUrl = balanceFundingInstrument.getThumbnailImageUrl();
            java.lang.String obj3 = thumbnailImageUrl != null ? thumbnailImageUrl.toString() : null;
            com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance balance = balanceFundingInstrument.getBalance();
            fundingInstrument = new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument(id2, sharedDomainType, name2, null, obj2, obj3, balance != null ? new com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance(balance.getCurrencyCode().toString(), balance.getValue()) : null);
        }
        com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference balancePreference2 = consumerAgreementFundingInstruments.getBalancePreference();
        int i = balancePreference2 == null ? -1 : com.paypal.oslo.feature.subscriptions.updatefi.data.mapper.ConsumerAgreementFundingInstrumentsMapperKt.WhenMappings.$EnumSwitchMapping$0[balancePreference2.ordinal()];
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
            return new com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments(arrayList2, highResolutionOutputSizeshNQ4ISI, fundingInstrument, balancePreference);
        }
        balancePreference = com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.UNKNOWN;
        return new com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments(arrayList2, highResolutionOutputSizeshNQ4ISI, fundingInstrument, balancePreference);
    }

    private static final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.FundingInstrument fundingInstrument) {
        java.lang.String id = fundingInstrument.getId();
        java.lang.String name2 = fundingInstrument.getName();
        java.lang.String lastDigits = fundingInstrument.getLastDigits();
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType sharedDomainType = com.paypal.oslo.feature.subscriptions.shared.data.FundingInstrumentMapperKt.toSharedDomainType(fundingInstrument.getType());
        java.lang.Object primaryImageUrl = fundingInstrument.getPrimaryImageUrl();
        java.lang.String obj = primaryImageUrl != null ? primaryImageUrl.toString() : null;
        java.lang.Object thumbnailImageUrl = fundingInstrument.getThumbnailImageUrl();
        java.lang.String obj2 = thumbnailImageUrl != null ? thumbnailImageUrl.toString() : null;
        com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Balance1 balance = fundingInstrument.getBalance();
        return new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument(id, sharedDomainType, name2, lastDigits, obj, obj2, balance != null ? new com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance(balance.getCurrencyCode().toString(), balance.getValue()) : null);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference toGraphQL(com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balancePreference, "");
        int i = com.paypal.oslo.feature.subscriptions.updatefi.data.mapper.ConsumerAgreementFundingInstrumentsMapperKt.WhenMappings.$EnumSwitchMapping$1[balancePreference.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference.ENABLED;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference.DISABLED;
        }
        if (i == 3) {
            return com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference.UNAVAILABLE;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference.UNKNOWN__;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.values().length];
            try {
                iArr2[com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.ENABLED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.DISABLED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.UNAVAILABLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
