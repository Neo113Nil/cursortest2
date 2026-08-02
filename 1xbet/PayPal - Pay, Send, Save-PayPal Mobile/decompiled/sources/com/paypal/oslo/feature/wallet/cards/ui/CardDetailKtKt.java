package com.paypal.oslo.feature.wallet.cards.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetail;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;", "toCard", "(Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetail;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardDetailKtKt {
    public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card toCard(com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail cardDetail) {
        java.lang.String str;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage thumbnailImage;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage primaryImage;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetail, "");
        java.lang.String expirationDate = cardDetail.getExpirationDate();
        if (expirationDate != null) {
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) expirationDate, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
            if (split$default.size() == 2) {
                java.lang.Object obj = split$default.get(1);
                java.lang.String takeLast = kotlin.text.StringsKt.takeLast((java.lang.String) split$default.get(0), 2);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(obj);
                sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                sb.append(takeLast);
                expirationDate = sb.toString();
            }
            str = expirationDate;
        } else {
            str = null;
        }
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress = cardDetail.getBillingAddress();
        java.lang.String formattedAddress = billingAddress != null ? billingAddress.formattedAddress() : null;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer = cardDetail.getIssuer();
        java.lang.String name2 = issuer != null ? issuer.getName() : null;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer2 = cardDetail.getIssuer();
        java.lang.String id = issuer2 != null ? issuer2.getId() : null;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer3 = cardDetail.getIssuer();
        java.lang.String countryCode = issuer3 != null ? issuer3.getCountryCode() : null;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer4 = cardDetail.getIssuer();
        java.lang.String issuerProductDescription = issuer4 != null ? issuer4.getIssuerProductDescription() : null;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt = cardDetail.getCardArt();
        java.lang.String standardCardImage3 = (cardArt == null || (primaryImage = cardArt.getPrimaryImage()) == null) ? null : primaryImage.getStandardCardImage3();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt2 = cardDetail.getCardArt();
        java.lang.String standardCardImage2 = (cardArt2 == null || (thumbnailImage = cardArt2.getThumbnailImage()) == null) ? null : thumbnailImage.getStandardCardImage2();
        java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage> institutionImages = cardDetail.getInstitutionImages();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = institutionImages.iterator();
        while (it.hasNext()) {
            java.lang.String url = ((com.paypal.oslo.feature.wallet.cards.domain.add.model.InstitutionImage) it.next()).getUrl();
            if (url != null) {
                arrayList.add(url);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass productClass = cardDetail.getProductClass();
        java.lang.String name3 = productClass != null ? productClass.name() : null;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus status = cardDetail.getStatus();
        java.lang.String statusName = status != null ? com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatusKt.statusName(status) : null;
        java.lang.String id2 = cardDetail.getId();
        java.lang.String lastNChars = cardDetail.getLastNChars();
        java.lang.String name4 = cardDetail.getBrand().name();
        java.lang.String nickName = cardDetail.getNickName();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress2 = cardDetail.getBillingAddress();
        return new com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card(id2, lastNChars, name4, name2, id, countryCode, issuerProductDescription, nickName, str, formattedAddress, billingAddress2 != null ? new com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address(billingAddress2.getId(), billingAddress2.getAddressLine1(), billingAddress2.getAddressLine2(), billingAddress2.getCity(), billingAddress2.getState(), billingAddress2.getPostalCode(), billingAddress2.getCountryCode()) : null, cardDetail.getCurrencyCode(), name3, statusName, arrayList2, standardCardImage3, standardCardImage2);
    }
}
