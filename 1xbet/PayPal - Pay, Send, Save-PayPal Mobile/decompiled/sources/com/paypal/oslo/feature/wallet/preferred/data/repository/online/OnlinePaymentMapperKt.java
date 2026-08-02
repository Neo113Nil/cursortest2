package com.paypal.oslo.feature.wallet.preferred.data.repository.online;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/wallet/graphql/GetEligiblePaymentMethodsQuery$Data;", "Lcom/paypal/oslo/feature/wallet/preferred/domain/model/online/OnlinePaymentPreference;", "toOnlinePaymentPreference", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Lcom/paypal/oslo/feature/wallet/preferred/domain/model/online/OnlinePaymentPreference;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class OnlinePaymentMapperKt {
    public static final com.paypal.oslo.feature.wallet.preferred.domain.model.online.OnlinePaymentPreference toOnlinePaymentPreference(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Data> graphQLData) {
        java.lang.Object obj;
        java.util.List<java.lang.String> preferenceValues;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.UsageContextDimension> usageContextDimensions;
        com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PrimaryImage primaryImage;
        java.lang.Object baseCdnLinkPath;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Wallet wallet;
        com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnlineEligibleFinancialInstruments onlineEligibleFinancialInstruments;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Data data = graphQLData.getData();
        java.lang.String str = null;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item> items = (data == null || (wallet = data.getWallet()) == null || (onlineEligibleFinancialInstruments = wallet.getOnlineEligibleFinancialInstruments()) == null) ? null : onlineEligibleFinancialInstruments.getItems();
        if (items == null) {
            items = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Item item : items) {
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBalance onBalance = item.getOnBalance();
            if (onBalance != null) {
                arrayList2.add(new com.paypal.oslo.feature.wallet.common.model.PaymentMethod.BalanceMethod(com.paypal.oslo.feature.wallet.preferred.data.repository.common.PaymentMethodItemMapperKt.createBalance(onBalance.getId(), onBalance.getAvailable().getAmount().getCurrencyCode().toString(), onBalance.getAvailable().getAmount().getValue())));
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnBankAccount onBankAccount = item.getOnBankAccount();
            if (onBankAccount != null) {
                java.lang.String id = onBankAccount.getId();
                java.lang.String lastNChars = onBankAccount.getLastNChars();
                java.lang.String nickname = onBankAccount.getNickname();
                java.lang.String rawValue = onBankAccount.getType().getRawValue();
                java.lang.String name2 = onBankAccount.getBankIssuer().getName();
                java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage> institutionImages = onBankAccount.getInstitutionImages();
                if (institutionImages != null) {
                    java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage> list = institutionImages;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.InstitutionImage institutionImage : list) {
                        arrayList3.add(kotlin.TuplesKt.to(institutionImage.getCategory().getRawValue(), java.lang.String.valueOf(institutionImage.getUrl())));
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                arrayList2.add(com.paypal.oslo.feature.wallet.preferred.data.repository.common.PaymentMethodItemMapperKt.createBankPaymentMethod(id, lastNChars, nickname, rawValue, name2, arrayList));
            }
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.OnCard onCard = item.getOnCard();
            if (onCard != null) {
                java.lang.String id2 = onCard.getId();
                java.lang.String lastNChars2 = onCard.getLastNChars();
                java.lang.String rawValue2 = onCard.getBrand().getRawValue();
                java.lang.String nickName = onCard.getNickName();
                com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass = onCard.getProductClass();
                java.lang.String rawValue3 = productClass != null ? productClass.getRawValue() : null;
                java.lang.Object expirationDate = onCard.getExpirationDate();
                java.lang.String obj2 = expirationDate != null ? expirationDate.toString() : null;
                com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer issuer = onCard.getIssuer();
                java.lang.String name3 = issuer != null ? issuer.getName() : null;
                com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Issuer issuer2 = onCard.getIssuer();
                java.lang.String issuerProductDescription = issuer2 != null ? issuer2.getIssuerProductDescription() : null;
                com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.CardArt cardArt = onCard.getCardArt();
                arrayList2.add(com.paypal.oslo.feature.wallet.preferred.data.repository.common.PaymentMethodItemMapperKt.createCardPaymentMethod(id2, lastNChars2, rawValue2, nickName, rawValue3, obj2, name3, issuerProductDescription, (cardArt == null || (primaryImage = cardArt.getPrimaryImage()) == null || (baseCdnLinkPath = primaryImage.getBaseCdnLinkPath()) == null) ? null : baseCdnLinkPath.toString()));
            }
        }
        com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.Data data2 = graphQLData.getData();
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference> paymentPreferences = data2 != null ? data2.getPaymentPreferences() : null;
        if (paymentPreferences == null) {
            paymentPreferences = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.Iterator<T> it = paymentPreferences.iterator();
        loop2: while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference paymentPreference = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference) obj;
            if (kotlin.jvm.internal.Intrinsics.areEqual(paymentPreference.getSubjectName(), "WALLET") && kotlin.jvm.internal.Intrinsics.areEqual(paymentPreference.getPreferenceName(), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT) && (usageContextDimensions = paymentPreference.getUsageContextDimensions()) != null) {
                java.util.List<com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.UsageContextDimension> list2 = usageContextDimensions;
                if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                    for (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.UsageContextDimension usageContextDimension : list2) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(usageContextDimension.getName(), "CHANNEL") && kotlin.jvm.internal.Intrinsics.areEqual(usageContextDimension.getValue(), "ONLINE")) {
                            break loop2;
                        }
                    }
                }
            }
        }
        com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference paymentPreference2 = (com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery.PaymentPreference) obj;
        if (paymentPreference2 != null && (preferenceValues = paymentPreference2.getPreferenceValues()) != null) {
            str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) preferenceValues);
        }
        return new com.paypal.oslo.feature.wallet.preferred.domain.model.online.OnlinePaymentPreference(arrayList2, str);
    }
}
