package com.paypal.oslo.feature.wallet.cards.data.extensions;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Card;", "Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetail;", "toDomain", "(Lcom/paypal/oslo/feature/wallet/graphql/UpdateWalletCardMutation$Card;)Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetail;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/wallet/cards/domain/update/model/UpdateCardError;", "toUpdateCardError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/wallet/cards/domain/update/model/UpdateCardError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpdateCardToDomainKtKt {
    public static final com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail toDomain(com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Card card) {
        java.util.List emptyList;
        com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardStatusInfoFragment walletCardStatusInfoFragment;
        com.paypal.oslo.feature.wallet.graphql.fragment.WalletBillingAddressFragment walletBillingAddressFragment;
        com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardArtFragment walletCardArtFragment;
        com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment walletCardIssuerFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
        com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardBasicInfoFragment walletCardBasicInfoFragment = card.getWalletCardBasicInfoFragment();
        java.lang.String id = walletCardBasicInfoFragment.getId();
        java.lang.String lastNChars = walletCardBasicInfoFragment.getLastNChars();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand domain = com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDomainKtKt.toDomain(walletCardBasicInfoFragment.getBrand());
        com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Issuer issuer = card.getIssuer();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer domain2 = (issuer == null || (walletCardIssuerFragment = issuer.getWalletCardIssuerFragment()) == null) ? null : com.paypal.oslo.feature.wallet.cards.data.extensions.WalletFragmentsToDomainKtKt.toDomain(walletCardIssuerFragment);
        com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass = walletCardBasicInfoFragment.getProductClass();
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass domain3 = productClass != null ? com.paypal.oslo.feature.wallet.cards.data.extensions.CardDetailToDomainKtKt.toDomain(productClass) : null;
        java.lang.Object expirationDate = walletCardBasicInfoFragment.getExpirationDate();
        java.lang.String obj = expirationDate != null ? expirationDate.toString() : null;
        com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.CardArt cardArt = card.getCardArt();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt domain4 = (cardArt == null || (walletCardArtFragment = cardArt.getWalletCardArtFragment()) == null) ? null : com.paypal.oslo.feature.wallet.cards.data.extensions.WalletFragmentsToDomainKtKt.toDomain(walletCardArtFragment);
        java.lang.String nickName = walletCardBasicInfoFragment.getNickName();
        com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.BillingAddress billingAddress = card.getBillingAddress();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress domain5 = (billingAddress == null || (walletBillingAddressFragment = billingAddress.getWalletBillingAddressFragment()) == null) ? null : com.paypal.oslo.feature.wallet.cards.data.extensions.WalletFragmentsToDomainKtKt.toDomain(walletBillingAddressFragment, card.getAddressId());
        java.lang.Object currencyCode = walletCardBasicInfoFragment.getCurrencyCode();
        java.lang.String obj2 = currencyCode != null ? currencyCode.toString() : null;
        com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.Status status = card.getStatus();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus domain6 = (status == null || (walletCardStatusInfoFragment = status.getWalletCardStatusInfoFragment()) == null) ? null : com.paypal.oslo.feature.wallet.cards.data.extensions.WalletFragmentsToDomainKtKt.toDomain(walletCardStatusInfoFragment);
        java.util.List<com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.InstitutionImage> institutionImages = card.getInstitutionImages();
        if (institutionImages == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.InstitutionImage> list = institutionImages;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.paypal.oslo.feature.wallet.cards.data.extensions.WalletFragmentsToDomainKtKt.toDomain(((com.paypal.oslo.feature.wallet.graphql.UpdateWalletCardMutation.InstitutionImage) it.next()).getWalletInstitutionImageFragment()));
            }
            emptyList = arrayList;
        }
        return new com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail(id, lastNChars, domain, domain2, domain3, obj, domain4, nickName, domain5, obj2, domain6, emptyList);
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardError toUpdateCardError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardError.Network.INSTANCE;
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return new com.paypal.oslo.feature.wallet.cards.domain.update.model.UpdateCardError.ServerError(com.paypal.oslo.feature.wallet.cards.data.extensions.CardErrorToDomainKtKt.toCardServerErrors((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError), null);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
