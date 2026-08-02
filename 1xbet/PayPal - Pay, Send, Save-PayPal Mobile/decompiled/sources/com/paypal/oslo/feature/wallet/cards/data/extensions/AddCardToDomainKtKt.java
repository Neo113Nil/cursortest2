package com.paypal.oslo.feature.wallet.cards.data.extensions;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\" \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;", "toDomain", "(Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/AddCardError;", "toAddCardError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/AddCardError;", "Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Data;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/AddCardResult;", "toAddCardResult", "(Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletCardMutation$Data;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/AddCardResult;", "", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddCardToDomainKtKt {
    private static final java.util.Map<com.paypal.oslo.api.graphql.schema.type.CardBrand, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand> Camera2StreamConfigurationMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.AMEX, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.AMEX), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.CB_NATIONALE, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.CB_NATIONALE), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.CETELEM, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.CETELEM), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.CHINA_UNION_PAY, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.CHINA_UNION_PAY), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.COFIDIS, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.COFIDIS), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.COFINOGA, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.COFINOGA), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.DELTA, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.DELTA), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.DINERS, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.DINERS), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.DISCOVER, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.DISCOVER), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.ELECTRON, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.ELECTRON), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.ELO, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.ELO), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.HIPER, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.HIPER), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.HIPERCARD, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.HIPERCARD), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.JCB, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.JCB), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.MAESTRO, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.MAESTRO), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.MASTER_CARD, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.MASTERCARD), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.RUPAY, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.RUPAY), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.SOLO, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.SOLO), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.STAR, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.STAR), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.SWITCH, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.SWITCH), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.VISA, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.VISA), kotlin.TuplesKt.to(com.paypal.oslo.api.graphql.schema.type.CardBrand.UNKNOWN, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.UNKNOWN));

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand toDomain(com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand) {
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand2 = Camera2StreamConfigurationMap.get(cardBrand);
        return cardBrand2 == null ? com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.UNKNOWN : cardBrand2;
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardError toAddCardError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardError.Network.INSTANCE;
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return new com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardError.ServerError(com.paypal.oslo.feature.wallet.cards.data.extensions.CardErrorToDomainKtKt.toCardServerErrors((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError), null);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardResult toAddCardResult(com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Data data) {
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.CardArt cardArt;
        com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardArtFragment walletCardArtFragment;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.InstitutionImage> institutionImages;
        com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Status status;
        com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass;
        java.lang.Object currencyCode;
        com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.BillingAddress billingAddress;
        com.paypal.oslo.feature.wallet.graphql.fragment.WalletBillingAddressFragment walletBillingAddressFragment;
        java.lang.Object expirationDate;
        com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Issuer issuer;
        com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment walletCardIssuerFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.Card card = data.getAddCard().getCard();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt2 = null;
        com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardBasicInfoFragment walletCardBasicInfoFragment = card != null ? card.getWalletCardBasicInfoFragment() : null;
        java.lang.String id = walletCardBasicInfoFragment != null ? walletCardBasicInfoFragment.getId() : null;
        java.lang.String str = id == null ? "" : id;
        java.lang.String lastNChars = walletCardBasicInfoFragment != null ? walletCardBasicInfoFragment.getLastNChars() : null;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand domain = toDomain(walletCardBasicInfoFragment != null ? walletCardBasicInfoFragment.getBrand() : null);
        com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer domain2 = (card == null || (issuer = card.getIssuer()) == null || (walletCardIssuerFragment = issuer.getWalletCardIssuerFragment()) == null) ? null : com.paypal.oslo.feature.wallet.cards.data.extensions.WalletFragmentsToDomainKtKt.toDomain(walletCardIssuerFragment);
        java.lang.String nickName = walletCardBasicInfoFragment != null ? walletCardBasicInfoFragment.getNickName() : null;
        java.lang.String obj = (walletCardBasicInfoFragment == null || (expirationDate = walletCardBasicInfoFragment.getExpirationDate()) == null) ? null : expirationDate.toString();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress domain$default = (card == null || (billingAddress = card.getBillingAddress()) == null || (walletBillingAddressFragment = billingAddress.getWalletBillingAddressFragment()) == null) ? null : com.paypal.oslo.feature.wallet.cards.data.extensions.WalletFragmentsToDomainKtKt.toDomain$default(walletBillingAddressFragment, null, 1, null);
        java.lang.String addressId = card != null ? card.getAddressId() : null;
        java.lang.String obj2 = (walletCardBasicInfoFragment == null || (currencyCode = walletCardBasicInfoFragment.getCurrencyCode()) == null) ? null : currencyCode.toString();
        java.lang.String name2 = (walletCardBasicInfoFragment == null || (productClass = walletCardBasicInfoFragment.getProductClass()) == null) ? null : productClass.name();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus domain3 = (card == null || (status = card.getStatus()) == null) ? null : com.paypal.oslo.feature.wallet.cards.data.extensions.CardDetailToDomainKtKt.toDomain(status.getValue(), status.getReason());
        if (card == null || (institutionImages = card.getInstitutionImages()) == null) {
            arrayList = null;
        } else {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.InstitutionImage> list = institutionImages;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.paypal.oslo.feature.wallet.cards.data.extensions.WalletFragmentsToDomainKtKt.toDomain(((com.paypal.oslo.feature.wallet.graphql.CreateWalletCardMutation.InstitutionImage) it.next()).getWalletInstitutionImageFragment()));
            }
            arrayList = arrayList2;
        }
        java.util.List emptyList = arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
        if (card != null && (cardArt = card.getCardArt()) != null && (walletCardArtFragment = cardArt.getWalletCardArtFragment()) != null) {
            cardArt2 = com.paypal.oslo.feature.wallet.cards.data.extensions.WalletFragmentsToDomainKtKt.toDomain(walletCardArtFragment);
        }
        return new com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardResult(str, lastNChars, domain, domain2, nickName, obj, domain$default, addressId, obj2, name2, domain3, emptyList, cardArt2);
    }
}
