package com.paypal.oslo.feature.wallet.cards.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/AddCardResult;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;", "toCard", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/AddCardResult;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddCardResultKtKt {
    public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card toCard(com.paypal.oslo.feature.wallet.cards.domain.add.model.AddCardResult addCardResult) {
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage thumbnailImage;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage primaryImage;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardResult, "");
        java.lang.String cardId = addCardResult.getCardId();
        java.lang.String lastNChars = addCardResult.getLastNChars();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand brand = addCardResult.getBrand();
        java.lang.String name2 = brand != null ? brand.name() : null;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer = addCardResult.getIssuer();
        java.lang.String name3 = issuer != null ? issuer.getName() : null;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer2 = addCardResult.getIssuer();
        java.lang.String id = issuer2 != null ? issuer2.getId() : null;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer3 = addCardResult.getIssuer();
        java.lang.String countryCode = issuer3 != null ? issuer3.getCountryCode() : null;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer4 = addCardResult.getIssuer();
        java.lang.String issuerProductDescription = issuer4 != null ? issuer4.getIssuerProductDescription() : null;
        java.lang.String nickName = addCardResult.getNickName();
        java.lang.String expirationDate = addCardResult.getExpirationDate();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress = addCardResult.getBillingAddress();
        java.lang.String formattedAddress = billingAddress != null ? billingAddress.formattedAddress() : null;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress2 = addCardResult.getBillingAddress();
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address address = billingAddress2 != null ? new com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address(addCardResult.getAddressId(), billingAddress2.getAddressLine1(), billingAddress2.getAddressLine2(), billingAddress2.getCity(), billingAddress2.getState(), billingAddress2.getPostalCode(), billingAddress2.getCountryCode()) : null;
        java.lang.String currencyCode = addCardResult.getCurrencyCode();
        java.lang.String productClass = addCardResult.getProductClass();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus status = addCardResult.getStatus();
        java.lang.String simpleName = status != null ? kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(status.getClass()).getSimpleName() : null;
        java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage> institutionImages = addCardResult.getInstitutionImages();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = institutionImages.iterator();
        while (it.hasNext()) {
            java.lang.String url = ((com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage) it.next()).getUrl();
            if (url != null) {
                arrayList.add(url);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt = addCardResult.getCardArt();
        java.lang.String standardCardImage2 = (cardArt == null || (primaryImage = cardArt.getPrimaryImage()) == null) ? null : primaryImage.getStandardCardImage2();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt2 = addCardResult.getCardArt();
        return new com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card(cardId, lastNChars, name2, name3, id, countryCode, issuerProductDescription, nickName, expirationDate, formattedAddress, address, currencyCode, productClass, simpleName, arrayList2, standardCardImage2, (cardArt2 == null || (thumbnailImage = cardArt2.getThumbnailImage()) == null) ? null : thumbnailImage.getStandardCardImage2());
    }
}
