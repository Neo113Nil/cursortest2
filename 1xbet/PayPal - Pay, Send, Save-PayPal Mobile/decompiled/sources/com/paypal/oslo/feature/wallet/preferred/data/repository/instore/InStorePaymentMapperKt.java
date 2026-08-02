package com.paypal.oslo.feature.wallet.preferred.data.repository.instore;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Data;", "Lcom/paypal/oslo/feature/wallet/preferred/domain/model/instore/InStorePaymentPreference;", "toInStorePaymentPreference", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Lcom/paypal/oslo/feature/wallet/preferred/domain/model/instore/InStorePaymentPreference;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class InStorePaymentMapperKt {
    public static final com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentPreference toInStorePaymentPreference(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Data> graphQLData) {
        com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference paymentPreference;
        java.util.List<java.lang.String> preferenceValues;
        com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage1 primaryImage;
        java.lang.Object baseCdnLinkPath;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Wallet wallet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Data data = graphQLData.getData();
        java.lang.String str = null;
        com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstoreEligibleFinancialInstruments instoreEligibleFinancialInstruments = (data == null || (wallet = data.getWallet()) == null) ? null : wallet.getInstoreEligibleFinancialInstruments();
        boolean useBalanceFirst = instoreEligibleFinancialInstruments != null ? instoreEligibleFinancialInstruments.getUseBalanceFirst() : false;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item1> items = instoreEligibleFinancialInstruments != null ? instoreEligibleFinancialInstruments.getItems() : null;
        if (items == null) {
            items = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.paypal.oslo.feature.wallet.common.model.Balance balance = null;
        for (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item1 item1 : items) {
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance1 onBalance = item1.getOnBalance();
            if (onBalance != null && balance == null) {
                balance = com.paypal.oslo.feature.wallet.preferred.data.repository.common.PaymentMethodItemMapperKt.createBalance(onBalance.getId(), onBalance.getAvailable().getAmount().getCurrencyCode().toString(), onBalance.getAvailable().getAmount().getValue());
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount1 onBankAccount = item1.getOnBankAccount();
            if (onBankAccount != null) {
                java.lang.String id = onBankAccount.getId();
                java.lang.String lastNChars = onBankAccount.getLastNChars();
                java.lang.String nickname = onBankAccount.getNickname();
                java.lang.String rawValue = onBankAccount.getType().getRawValue();
                java.lang.String name2 = onBankAccount.getBankIssuer().getName();
                java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage1> institutionImages = onBankAccount.getInstitutionImages();
                if (institutionImages != null) {
                    java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage1> list = institutionImages;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage1 institutionImage1 : list) {
                        arrayList3.add(kotlin.TuplesKt.to(institutionImage1.getCategory().getRawValue(), java.lang.String.valueOf(institutionImage1.getUrl())));
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                arrayList2.add(com.paypal.oslo.feature.wallet.preferred.data.repository.common.PaymentMethodItemMapperKt.createBankPaymentMethod(id, lastNChars, nickname, rawValue, name2, arrayList));
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard1 onCard = item1.getOnCard();
            if (onCard != null) {
                java.lang.String id2 = onCard.getId();
                java.lang.String lastNChars2 = onCard.getLastNChars();
                java.lang.String rawValue2 = onCard.getBrand().getRawValue();
                java.lang.String nickName = onCard.getNickName();
                com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass = onCard.getProductClass();
                java.lang.String rawValue3 = productClass != null ? productClass.getRawValue() : null;
                com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer1 issuer = onCard.getIssuer();
                java.lang.String name3 = issuer != null ? issuer.getName() : null;
                com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer1 issuer2 = onCard.getIssuer();
                java.lang.String issuerProductDescription = issuer2 != null ? issuer2.getIssuerProductDescription() : null;
                com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt1 cardArt = onCard.getCardArt();
                arrayList2.add(com.paypal.oslo.feature.wallet.preferred.data.repository.common.PaymentMethodItemMapperKt.createCardPaymentMethod(id2, lastNChars2, rawValue2, nickName, rawValue3, null, name3, issuerProductDescription, (cardArt == null || (primaryImage = cardArt.getPrimaryImage()) == null || (baseCdnLinkPath = primaryImage.getBaseCdnLinkPath()) == null) ? null : baseCdnLinkPath.toString()));
            }
        }
        com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Data data2 = graphQLData.getData();
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference> paymentPreferences = data2 != null ? data2.getPaymentPreferences() : null;
        if (paymentPreferences == null) {
            paymentPreferences = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ListIterator<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference> listIterator = paymentPreferences.listIterator(paymentPreferences.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                paymentPreference = null;
                break;
            }
            paymentPreference = listIterator.previous();
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference paymentPreference2 = paymentPreference;
            if (kotlin.jvm.internal.Intrinsics.areEqual(paymentPreference2.getSubjectName(), "QR_CODE") && kotlin.jvm.internal.Intrinsics.areEqual(paymentPreference2.getPreferenceName(), "DIRECT_FUNDING_SOURCE")) {
                break;
            }
        }
        com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference paymentPreference3 = paymentPreference;
        if (paymentPreference3 != null && (preferenceValues = paymentPreference3.getPreferenceValues()) != null) {
            str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) preferenceValues);
        }
        return new com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentPreference(balance, arrayList2, useBalanceFirst, str);
    }
}
