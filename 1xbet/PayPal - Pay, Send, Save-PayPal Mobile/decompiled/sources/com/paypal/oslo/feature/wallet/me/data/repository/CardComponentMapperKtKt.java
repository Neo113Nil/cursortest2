package com.paypal.oslo.feature.wallet.me.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnCardComponent;", "Lcom/paypal/oslo/feature/wallet/me/domain/wallet/LinkedCardsProduct;", "asProduct", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnCardComponent;)Lcom/paypal/oslo/feature/wallet/me/domain/wallet/LinkedCardsProduct;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Item4;", "Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetail;", "asCard", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Item4;)Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetail;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CardComponentMapperKtKt {
    public static final com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedCardsProduct asProduct(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnCardComponent onCardComponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCardComponent, "");
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Wallet3 wallet = onCardComponent.getWallet();
        if (wallet == null) {
            return null;
        }
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Item4> items = wallet.getCards().getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(asCard((com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Item4) it.next()));
        }
        return new com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedCardsProduct(true, arrayList);
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail asCard(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Item4 item4) {
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt;
        java.util.List emptyList;
        com.paypal.oslo.api.graphql.schema.type.CardStatus value;
        com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardArtFragment walletCardArtFragment;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage cardImage;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage cardImage2;
        com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment walletCardIssuerFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item4, "");
        java.lang.String id = item4.getWalletCardBasicInfoFragment().getId();
        java.lang.String lastNChars = item4.getWalletCardBasicInfoFragment().getLastNChars();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand domain = com.paypal.oslo.feature.wallet.cards.data.extensions.AddCardToDomainKtKt.toDomain(item4.getWalletCardBasicInfoFragment().getBrand());
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Issuer1 issuer = item4.getIssuer();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer domain2 = (issuer == null || (walletCardIssuerFragment = issuer.getWalletCardIssuerFragment()) == null) ? null : com.paypal.oslo.feature.wallet.cards.data.extensions.WalletFragmentsToDomainKtKt.toDomain(walletCardIssuerFragment);
        com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass = item4.getWalletCardBasicInfoFragment().getProductClass();
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass domain3 = productClass != null ? com.paypal.oslo.feature.wallet.cards.data.extensions.CardDetailToDomainKtKt.toDomain(productClass) : null;
        java.lang.Object expirationDate = item4.getWalletCardBasicInfoFragment().getExpirationDate();
        java.lang.String obj = expirationDate != null ? expirationDate.toString() : null;
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.CardArt cardArt2 = item4.getCardArt();
        if (cardArt2 == null || (walletCardArtFragment = cardArt2.getWalletCardArtFragment()) == null) {
            cardArt = null;
        } else {
            com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardArtFragment.PrimaryImage primaryImage = walletCardArtFragment.getPrimaryImage();
            if (primaryImage != null) {
                java.lang.Object baseCdnLinkPath = primaryImage.getBaseCdnLinkPath();
                cardImage = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage(baseCdnLinkPath != null ? baseCdnLinkPath.toString() : null, primaryImage.getMimeType(), primaryImage.getHeight(), primaryImage.getWidth());
            } else {
                cardImage = null;
            }
            com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardArtFragment.ThumbnailImage thumbnailImage = walletCardArtFragment.getThumbnailImage();
            if (thumbnailImage != null) {
                java.lang.Object baseCdnLinkPath2 = thumbnailImage.getBaseCdnLinkPath();
                cardImage2 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage(baseCdnLinkPath2 != null ? baseCdnLinkPath2.toString() : null, thumbnailImage.getMimeType(), thumbnailImage.getHeight(), thumbnailImage.getWidth());
            } else {
                cardImage2 = null;
            }
            java.lang.Object backgroundColor = walletCardArtFragment.getBackgroundColor();
            java.lang.String obj2 = backgroundColor != null ? backgroundColor.toString() : null;
            java.lang.Object foregroundColor = walletCardArtFragment.getForegroundColor();
            java.lang.String obj3 = foregroundColor != null ? foregroundColor.toString() : null;
            java.lang.Object labelColor = walletCardArtFragment.getLabelColor();
            cardArt = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt(cardImage, cardImage2, obj2, obj3, labelColor != null ? labelColor.toString() : null);
        }
        java.lang.String nickName = item4.getWalletCardBasicInfoFragment().getNickName();
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Status1 status = item4.getStatus();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus domain4 = (status == null || (value = status.getValue()) == null) ? null : com.paypal.oslo.feature.wallet.cards.data.extensions.CardDetailToDomainKtKt.toDomain(value, (java.lang.String) null);
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.InstitutionImage1> institutionImages = item4.getInstitutionImages();
        if (institutionImages == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.InstitutionImage1> list = institutionImages;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.InstitutionImage1 institutionImage1 : list) {
                java.lang.Object url = institutionImage1.getWalletInstitutionImageFragment().getUrl();
                arrayList.add(new com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage(url != null ? url.toString() : null, institutionImage1.getWalletInstitutionImageFragment().getMimeType(), institutionImage1.getWalletInstitutionImageFragment().getWidth(), institutionImage1.getWalletInstitutionImageFragment().getHeight(), institutionImage1.getWalletInstitutionImageFragment().getCategory().name()));
            }
            emptyList = arrayList;
        }
        return new com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail(id, lastNChars, domain, domain2, domain3, obj, cardArt, nickName, null, null, domain4, emptyList);
    }
}
