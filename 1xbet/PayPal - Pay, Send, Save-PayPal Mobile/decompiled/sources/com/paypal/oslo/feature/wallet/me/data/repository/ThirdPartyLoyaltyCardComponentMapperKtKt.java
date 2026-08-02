package com.paypal.oslo.feature.wallet.me.data.repository;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnThirdPartyLoyaltyCardComponent;", "Lcom/paypal/oslo/feature/wallet/me/domain/wallet/LinkedThirdPartyLoyaltyProduct;", "asProduct", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnThirdPartyLoyaltyCardComponent;)Lcom/paypal/oslo/feature/wallet/me/domain/wallet/LinkedThirdPartyLoyaltyProduct;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Item5;", "Lcom/paypal/oslo/feature/wallet/me/domain/wallet/ThirdPartyLoyaltyCard;", "asThirdPartyLoyaltyCard", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Item5;)Lcom/paypal/oslo/feature/wallet/me/domain/wallet/ThirdPartyLoyaltyCard;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$LogoSmall;", "Lcom/paypal/oslo/feature/wallet/me/domain/wallet/ThirdPartyLoyaltyCard$Logo;", "asLogo", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$LogoSmall;)Lcom/paypal/oslo/feature/wallet/me/domain/wallet/ThirdPartyLoyaltyCard$Logo;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ThirdPartyLoyaltyCardComponentMapperKtKt {
    public static final com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedThirdPartyLoyaltyProduct asProduct(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnThirdPartyLoyaltyCardComponent onThirdPartyLoyaltyCardComponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onThirdPartyLoyaltyCardComponent, "");
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Wallet7 wallet = onThirdPartyLoyaltyCardComponent.getWallet();
        if (wallet == null) {
            return null;
        }
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Item5> items = wallet.getThirdPartyLoyaltyCards().getPage().getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(asThirdPartyLoyaltyCard((com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Item5) it.next()));
        }
        return new com.paypal.oslo.feature.wallet.me.domain.wallet.LinkedThirdPartyLoyaltyProduct(true, arrayList);
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard asThirdPartyLoyaltyCard(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Item5 item5) {
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.ImageUrls imageUrls;
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.LogoSmall logoSmall;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item5, "");
        java.lang.String id = item5.getId();
        java.lang.String displayName = item5.getDisplayName();
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Program program = item5.getProgram();
        return new com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard(id, displayName, (program == null || (imageUrls = program.getImageUrls()) == null || (logoSmall = imageUrls.getLogoSmall()) == null) ? null : asLogo(logoSmall));
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard.Logo asLogo(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.LogoSmall logoSmall) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoSmall, "");
        if (logoSmall.getUrl() == null) {
            return null;
        }
        java.lang.Object backgroundColor = logoSmall.getBackgroundColor();
        return new com.paypal.oslo.feature.wallet.me.domain.wallet.ThirdPartyLoyaltyCard.Logo(logoSmall.getUrl().toString(), backgroundColor != null ? backgroundColor.toString() : null);
    }
}
