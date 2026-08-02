package com.paypal.oslo.feature.wallet.amexandp3.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentResult;", "Lcom/paypal/oslo/core/network/graphql/error/CallError$GraphQL;", "error", "addErrorMessages", "(Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentResult;Lcom/paypal/oslo/core/network/graphql/error/CallError$GraphQL;)Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentResult;", "Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ProvisionInstruments;", "toProvisionInstrumentsResult", "(Lcom/paypal/oslo/feature/wallet/graphql/ProvisionInstrumentsMutation$ProvisionInstruments;)Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentResult;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProvisionInstrumentsRepositoryImplKt {
    public static final com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult addErrorMessages(com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult provisionInstrumentResult, com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL) {
        com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionInstrumentResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQL, "");
        java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo> remainingPaymentTokens = provisionInstrumentResult.getRemainingPaymentTokens();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(remainingPaymentTokens, 10));
        java.util.Iterator<T> it = remainingPaymentTokens.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo) it.next()).getId());
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo> remainingCards = provisionInstrumentResult.getRemainingCards();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(remainingCards, 10));
        java.util.Iterator<T> it2 = remainingCards.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo) it2.next()).getId());
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo> remainingBankAccounts = provisionInstrumentResult.getRemainingBankAccounts();
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(remainingBankAccounts, 10));
        java.util.Iterator<T> it3 = remainingBankAccounts.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo) it3.next()).getId());
        }
        java.util.ArrayList arrayList6 = arrayList5;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = graphQL.m11659getErrors1X0FAY();
        java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
        java.util.Iterator<T> it4 = m11659getErrors1X0FAY.iterator();
        while (it4.hasNext()) {
            java.util.Map<java.lang.String, java.lang.Object> extensions = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) it4.next()).getExtensions();
            java.lang.Object obj = extensions != null ? extensions.get("details") : null;
            java.util.List list = obj instanceof java.util.List ? (java.util.List) obj : null;
            java.lang.Object first = list != null ? kotlin.collections.CollectionsKt.first(list) : null;
            java.util.Map map = first instanceof java.util.Map ? (java.util.Map) first : null;
            if (map != null) {
                java.lang.Object obj2 = map.get("id");
                java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                java.lang.Object obj3 = map.get(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE);
                java.lang.String str2 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
                if (str != null && str2 != null) {
                    if (arrayList2.contains(str)) {
                        linkedHashMap.put(str, str2);
                    } else if (arrayList4.contains(str)) {
                        linkedHashMap2.put(str, str2);
                    } else if (arrayList6.contains(str)) {
                        linkedHashMap3.put(str, str2);
                    }
                }
            }
            arrayList7.add(kotlin.Unit.INSTANCE);
        }
        arrow.core.NonEmptyList.m9570constructorimpl(arrayList7);
        copy = provisionInstrumentResult.copy((r20 & 1) != 0 ? provisionInstrumentResult.paymentTokens : null, (r20 & 2) != 0 ? provisionInstrumentResult.remainingPaymentTokens : null, (r20 & 4) != 0 ? provisionInstrumentResult.cards : null, (r20 & 8) != 0 ? provisionInstrumentResult.remainingCards : null, (r20 & 16) != 0 ? provisionInstrumentResult.bankAccounts : null, (r20 & 32) != 0 ? provisionInstrumentResult.remainingBankAccounts : null, (r20 & 64) != 0 ? provisionInstrumentResult.paymentTokenErrorMessage : linkedHashMap, (r20 & 128) != 0 ? provisionInstrumentResult.cardsErrorMessage : linkedHashMap2, (r20 & 256) != 0 ? provisionInstrumentResult.bankAccountsErrorMessage : linkedHashMap3);
        return copy;
    }

    public static final com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult toProvisionInstrumentsResult(com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ProvisionInstruments provisionInstruments) {
        java.util.ArrayList emptyList;
        java.util.List emptyList2;
        java.util.List emptyList3;
        java.util.List emptyList4;
        java.util.List emptyList5;
        java.util.List emptyList6;
        com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1 institutionImage1;
        com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1 institutionImage12;
        com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1 institutionImage13;
        com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1 institutionImage14;
        com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage institutionImage;
        com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage institutionImage2;
        com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage institutionImage3;
        com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage institutionImage4;
        com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage3 thumbnailImage;
        com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage3 thumbnailImage2;
        com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage3 thumbnailImage3;
        com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage3 thumbnailImage4;
        com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage2 thumbnailImage5;
        com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage2 thumbnailImage6;
        com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage2 thumbnailImage7;
        com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage2 thumbnailImage8;
        com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage1 thumbnailImage9;
        com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage1 thumbnailImage10;
        com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage thumbnailImage11;
        com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.ThumbnailImage thumbnailImage12;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionInstruments, "");
        java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentToken> paymentTokens = provisionInstruments.getPaymentTokens();
        if (paymentTokens == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentToken> list = paymentTokens;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentToken paymentToken : list) {
                java.lang.String id = paymentToken.getId();
                java.lang.String issuerDisplayName = paymentToken.getIssuerDisplayName();
                java.lang.String productDisplayName = paymentToken.getProductDisplayName();
                com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt paymentTokenArt = paymentToken.getPaymentTokenArt();
                java.lang.String str = (java.lang.String) ((paymentTokenArt == null || (thumbnailImage12 = paymentTokenArt.getThumbnailImage()) == null) ? null : thumbnailImage12.getBaseCdnLinkPath());
                com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt paymentTokenArt2 = paymentToken.getPaymentTokenArt();
                arrayList.add(com.paypal.oslo.feature.wallet.amexandp3.data.mapper.ProvisionInstrumentsRepositoryMapperKt.mapPaymentTokenToDomain(id, issuerDisplayName, productDisplayName, str, (paymentTokenArt2 == null || (thumbnailImage11 = paymentTokenArt2.getThumbnailImage()) == null) ? null : thumbnailImage11.getMimeType()));
            }
            emptyList = arrayList;
        }
        java.util.List list2 = emptyList;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingPaymentToken> remainingPaymentTokens = provisionInstruments.getRemainingPaymentTokens();
        if (remainingPaymentTokens == null) {
            emptyList2 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingPaymentToken> list3 = remainingPaymentTokens;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
            for (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingPaymentToken remainingPaymentToken : list3) {
                java.lang.String id2 = remainingPaymentToken.getId();
                java.lang.String issuerDisplayName2 = remainingPaymentToken.getIssuerDisplayName();
                java.lang.String productDisplayName2 = remainingPaymentToken.getProductDisplayName();
                com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt1 paymentTokenArt3 = remainingPaymentToken.getPaymentTokenArt();
                java.lang.String str2 = (java.lang.String) ((paymentTokenArt3 == null || (thumbnailImage10 = paymentTokenArt3.getThumbnailImage()) == null) ? null : thumbnailImage10.getBaseCdnLinkPath());
                com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.PaymentTokenArt1 paymentTokenArt4 = remainingPaymentToken.getPaymentTokenArt();
                arrayList2.add(com.paypal.oslo.feature.wallet.amexandp3.data.mapper.ProvisionInstrumentsRepositoryMapperKt.mapPaymentTokenToDomain(id2, issuerDisplayName2, productDisplayName2, str2, (paymentTokenArt4 == null || (thumbnailImage9 = paymentTokenArt4.getThumbnailImage()) == null) ? null : thumbnailImage9.getMimeType()));
            }
            emptyList2 = arrayList2;
        }
        java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Card> cards = provisionInstruments.getCards();
        if (cards == null) {
            emptyList3 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Card> list4 = cards;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
            for (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Card card : list4) {
                java.lang.String id3 = card.getId();
                java.lang.String lastNChars = card.getLastNChars();
                com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass = card.getProductClass();
                com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer issuer = card.getIssuer();
                java.lang.String name2 = issuer != null ? issuer.getName() : null;
                com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt cardArt = card.getCardArt();
                java.lang.String str3 = (java.lang.String) ((cardArt == null || (thumbnailImage8 = cardArt.getThumbnailImage()) == null) ? null : thumbnailImage8.getBaseCdnLinkPath());
                com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt cardArt2 = card.getCardArt();
                java.lang.String mimeType = (cardArt2 == null || (thumbnailImage7 = cardArt2.getThumbnailImage()) == null) ? null : thumbnailImage7.getMimeType();
                com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt cardArt3 = card.getCardArt();
                java.lang.Integer width = (cardArt3 == null || (thumbnailImage6 = cardArt3.getThumbnailImage()) == null) ? null : thumbnailImage6.getWidth();
                com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt cardArt4 = card.getCardArt();
                arrayList3.add(com.paypal.oslo.feature.wallet.amexandp3.data.mapper.ProvisionInstrumentsRepositoryMapperKt.mapCardsToDomain(id3, lastNChars, productClass, name2, str3, mimeType, width, (cardArt4 == null || (thumbnailImage5 = cardArt4.getThumbnailImage()) == null) ? null : thumbnailImage5.getHeight()));
            }
            emptyList3 = arrayList3;
        }
        java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingCard> remainingCards = provisionInstruments.getRemainingCards();
        if (remainingCards == null) {
            emptyList4 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingCard> list5 = remainingCards;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list5, 10));
            for (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingCard remainingCard : list5) {
                java.lang.String id4 = remainingCard.getId();
                java.lang.String lastNChars2 = remainingCard.getLastNChars();
                com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass2 = remainingCard.getProductClass();
                com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.Issuer1 issuer2 = remainingCard.getIssuer();
                java.lang.String name3 = issuer2 != null ? issuer2.getName() : null;
                com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt1 cardArt5 = remainingCard.getCardArt();
                java.lang.String str4 = (java.lang.String) ((cardArt5 == null || (thumbnailImage4 = cardArt5.getThumbnailImage()) == null) ? null : thumbnailImage4.getBaseCdnLinkPath());
                com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt1 cardArt6 = remainingCard.getCardArt();
                java.lang.String mimeType2 = (cardArt6 == null || (thumbnailImage3 = cardArt6.getThumbnailImage()) == null) ? null : thumbnailImage3.getMimeType();
                com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt1 cardArt7 = remainingCard.getCardArt();
                java.lang.Integer width2 = (cardArt7 == null || (thumbnailImage2 = cardArt7.getThumbnailImage()) == null) ? null : thumbnailImage2.getWidth();
                com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.CardArt1 cardArt8 = remainingCard.getCardArt();
                arrayList4.add(com.paypal.oslo.feature.wallet.amexandp3.data.mapper.ProvisionInstrumentsRepositoryMapperKt.mapCardsToDomain(id4, lastNChars2, productClass2, name3, str4, mimeType2, width2, (cardArt8 == null || (thumbnailImage = cardArt8.getThumbnailImage()) == null) ? null : thumbnailImage.getHeight()));
            }
            emptyList4 = arrayList4;
        }
        java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.BankAccount> bankAccounts = provisionInstruments.getBankAccounts();
        if (bankAccounts == null) {
            emptyList5 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.BankAccount> list6 = bankAccounts;
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list6, 10));
            for (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.BankAccount bankAccount : list6) {
                java.lang.String id5 = bankAccount.getId();
                java.lang.String lastNChars3 = bankAccount.getLastNChars();
                com.paypal.oslo.api.graphql.schema.type.BankAccountType type = bankAccount.getType();
                java.lang.String name4 = bankAccount.getIssuer().getName();
                java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage> institutionImages = bankAccount.getInstitutionImages();
                java.lang.String str5 = (java.lang.String) ((institutionImages == null || (institutionImage4 = (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) institutionImages)) == null) ? null : institutionImage4.getUrl());
                java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage> institutionImages2 = bankAccount.getInstitutionImages();
                java.lang.String mimeType3 = (institutionImages2 == null || (institutionImage3 = (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) institutionImages2)) == null) ? null : institutionImage3.getMimeType();
                java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage> institutionImages3 = bankAccount.getInstitutionImages();
                java.lang.Integer width3 = (institutionImages3 == null || (institutionImage2 = (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) institutionImages3)) == null) ? null : institutionImage2.getWidth();
                java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage> institutionImages4 = bankAccount.getInstitutionImages();
                arrayList5.add(com.paypal.oslo.feature.wallet.amexandp3.data.mapper.ProvisionInstrumentsRepositoryMapperKt.mapBanksToDomain(id5, lastNChars3, type, name4, str5, mimeType3, width3, (institutionImages4 == null || (institutionImage = (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) institutionImages4)) == null) ? null : institutionImage.getHeight()));
            }
            emptyList5 = arrayList5;
        }
        java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingBankAccount> remainingBankAccounts = provisionInstruments.getRemainingBankAccounts();
        if (remainingBankAccounts == null) {
            emptyList6 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingBankAccount> list7 = remainingBankAccounts;
            java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list7, 10));
            for (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.RemainingBankAccount remainingBankAccount : list7) {
                java.lang.String id6 = remainingBankAccount.getId();
                java.lang.String lastNChars4 = remainingBankAccount.getLastNChars();
                com.paypal.oslo.api.graphql.schema.type.BankAccountType type2 = remainingBankAccount.getType();
                java.lang.String name5 = remainingBankAccount.getIssuer().getName();
                java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1> institutionImages5 = remainingBankAccount.getInstitutionImages();
                java.lang.String str6 = (java.lang.String) ((institutionImages5 == null || (institutionImage14 = (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) institutionImages5)) == null) ? null : institutionImage14.getUrl());
                java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1> institutionImages6 = remainingBankAccount.getInstitutionImages();
                java.lang.String mimeType4 = (institutionImages6 == null || (institutionImage13 = (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) institutionImages6)) == null) ? null : institutionImage13.getMimeType();
                java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1> institutionImages7 = remainingBankAccount.getInstitutionImages();
                java.lang.Integer width4 = (institutionImages7 == null || (institutionImage12 = (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) institutionImages7)) == null) ? null : institutionImage12.getWidth();
                java.util.List<com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1> institutionImages8 = remainingBankAccount.getInstitutionImages();
                arrayList6.add(com.paypal.oslo.feature.wallet.amexandp3.data.mapper.ProvisionInstrumentsRepositoryMapperKt.mapBanksToDomain(id6, lastNChars4, type2, name5, str6, mimeType4, width4, (institutionImages8 == null || (institutionImage1 = (com.paypal.oslo.feature.wallet.graphql.ProvisionInstrumentsMutation.InstitutionImage1) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) institutionImages8)) == null) ? null : institutionImage1.getHeight()));
            }
            emptyList6 = arrayList6;
        }
        return new com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult(list2, emptyList2, emptyList3, emptyList4, emptyList5, emptyList6, null, null, null, 448, null);
    }
}
