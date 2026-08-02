package com.paypal.oslo.feature.wallet.cards.data.extensions;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u001f\u0010\u0002\u001a\u00020\n*\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\u0002\u0010\u000b\u001a\u0013\u0010\u0002\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u0002\u0010\u000e\u001a\u0013\u0010\u0002\u001a\u00020\u0010*\u00020\u000fH\u0000¢\u0006\u0004\b\u0002\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardArtFragment;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardArt;", "toDomain", "(Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardArtFragment;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardArt;", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardIssuerFragment;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/Issuer;", "(Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardIssuerFragment;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/Issuer;", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletBillingAddressFragment;", "", "id", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;", "(Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletBillingAddressFragment;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardStatusInfoFragment;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;", "(Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardStatusInfoFragment;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardStatus;", "Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletInstitutionImageFragment;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/InstitutionImage;", "(Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletInstitutionImageFragment;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/InstitutionImage;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WalletFragmentsToDomainKtKt {
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt toDomain(com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardArtFragment walletCardArtFragment) {
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage cardImage;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage cardImage2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletCardArtFragment, "");
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
        java.lang.String obj = backgroundColor != null ? backgroundColor.toString() : null;
        java.lang.Object foregroundColor = walletCardArtFragment.getForegroundColor();
        java.lang.String obj2 = foregroundColor != null ? foregroundColor.toString() : null;
        java.lang.Object labelColor = walletCardArtFragment.getLabelColor();
        return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt(cardImage, cardImage2, obj, obj2, labelColor != null ? labelColor.toString() : null);
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer toDomain(com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment walletCardIssuerFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletCardIssuerFragment, "");
        java.lang.String name2 = walletCardIssuerFragment.getName();
        java.lang.String id = walletCardIssuerFragment.getId();
        java.lang.Object countryCode = walletCardIssuerFragment.getCountryCode();
        return new com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer(name2, id, countryCode != null ? countryCode.toString() : null, walletCardIssuerFragment.getIssuerProductDescription(), walletCardIssuerFragment.getIssuerAlternateName());
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress toDomain$default(com.paypal.oslo.feature.wallet.graphql.fragment.WalletBillingAddressFragment walletBillingAddressFragment, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return toDomain(walletBillingAddressFragment, str);
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress toDomain(com.paypal.oslo.feature.wallet.graphql.fragment.WalletBillingAddressFragment walletBillingAddressFragment, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletBillingAddressFragment, "");
        java.lang.String addressLine1 = walletBillingAddressFragment.getAddressLine1();
        java.lang.String str2 = addressLine1 == null ? "" : addressLine1;
        java.lang.String addressLine2 = walletBillingAddressFragment.getAddressLine2();
        java.lang.String adminArea2 = walletBillingAddressFragment.getAdminArea2();
        java.lang.String str3 = adminArea2 == null ? "" : adminArea2;
        java.lang.String adminArea1 = walletBillingAddressFragment.getAdminArea1();
        java.lang.String str4 = adminArea1 == null ? "" : adminArea1;
        java.lang.String postalCode = walletBillingAddressFragment.getPostalCode();
        return new com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress(str, str2, addressLine2, str3, str4, postalCode == null ? "" : postalCode, walletBillingAddressFragment.getCountryCode().toString());
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus toDomain(com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardStatusInfoFragment walletCardStatusInfoFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletCardStatusInfoFragment, "");
        return com.paypal.oslo.feature.wallet.cards.data.extensions.CardDetailToDomainKtKt.toDomain(walletCardStatusInfoFragment.getValue(), walletCardStatusInfoFragment.getReason());
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage toDomain(com.paypal.oslo.feature.wallet.graphql.fragment.WalletInstitutionImageFragment walletInstitutionImageFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletInstitutionImageFragment, "");
        java.lang.Object url = walletInstitutionImageFragment.getUrl();
        return new com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage(url != null ? url.toString() : null, walletInstitutionImageFragment.getMimeType(), walletInstitutionImageFragment.getWidth(), walletInstitutionImageFragment.getHeight(), walletInstitutionImageFragment.getCategory().name());
    }
}
