package com.paypal.oslo.feature.wallet.cards.ui.details;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\tH\u0000¢\u0006\u0004\b\u0002\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetail;", "Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailInfo;", "toCardDetailInfo", "(Lcom/paypal/oslo/feature/wallet/cards/domain/detail/model/CardDetail;)Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailInfo;", "", "cardId", "Lcom/paypal/oslo/feature/wallet/api/navigation/UpdateCardDestination;", "toUpdateCardDestination", "(Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailInfo;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/navigation/UpdateCardDestination;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;)Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailInfo;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardDetailInfoKtKt {
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo toCardDetailInfo(com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardDetail cardDetail) {
        java.lang.String expirationDate;
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass productClass;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage thumbnailImage;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage primaryImage;
        java.lang.String str3;
        java.lang.Integer intOrNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetail, "");
        java.lang.String expirationDate2 = cardDetail.getExpirationDate();
        java.util.List split$default = expirationDate2 != null ? kotlin.text.StringsKt.split$default((java.lang.CharSequence) expirationDate2, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null) : null;
        if (split$default != null && split$default.size() == 2) {
            java.lang.String str4 = (java.lang.String) split$default.get(1);
            java.lang.String takeLast = kotlin.text.StringsKt.takeLast((java.lang.String) split$default.get(0), 2);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str4);
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(takeLast);
            expirationDate = sb.toString();
        } else {
            expirationDate = cardDetail.getExpirationDate();
            if (expirationDate == null) {
                str = "";
                if (split$default != null || (str3 = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(split$default, 1)) == null || (intOrNull = kotlin.text.StringsKt.toIntOrNull(str3)) == null) {
                    str2 = null;
                } else {
                    int intValue = intOrNull.intValue();
                    java.lang.String[] months = new java.text.DateFormatSymbols().getMonths();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(months, "");
                    str2 = (java.lang.String) kotlin.collections.ArraysKt.getOrNull(months, intValue - 1);
                    if (str2 == null) {
                        str2 = "";
                    }
                }
                java.lang.String str5 = str2 != null ? "" : str2;
                java.lang.String str6 = split$default == null ? (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(split$default, 0) : null;
                java.lang.String str7 = str6 != null ? "" : str6;
                com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress = cardDetail.getBillingAddress();
                java.lang.String formattedAddress = billingAddress == null ? billingAddress.formattedAddress() : null;
                java.lang.String str8 = formattedAddress != null ? "" : formattedAddress;
                com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt = cardDetail.getCardArt();
                java.lang.String standardCardImage3 = (cardArt != null || (primaryImage = cardArt.getPrimaryImage()) == null) ? null : primaryImage.getStandardCardImage3();
                com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt2 = cardDetail.getCardArt();
                java.lang.String standardCardImage2 = (cardArt2 != null || (thumbnailImage = cardArt2.getThumbnailImage()) == null) ? null : thumbnailImage.getStandardCardImage2();
                com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass productClass2 = cardDetail.getProductClass();
                java.lang.String name2 = productClass2 == null ? productClass2.name() : null;
                java.lang.String str9 = name2 != null ? "" : name2;
                productClass = cardDetail.getProductClass();
                if (productClass != null || (r2 = com.paypal.oslo.feature.wallet.common.util.FundingInstrumentRefTextMapperKt.maskedCardNumberRef(productClass.name(), cardDetail.getLastNChars())) == null) {
                    com.paypal.oslo.core.commonui.utils.RefText stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_card_masked, cardDetail.getLastNChars());
                }
                com.paypal.oslo.core.commonui.utils.RefText refText = stringResourceRef;
                com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus status = cardDetail.getStatus();
                java.lang.String nickName = cardDetail.getNickName();
                java.lang.String str10 = nickName != null ? "" : nickName;
                java.lang.String currencyCode = cardDetail.getCurrencyCode();
                java.lang.String str11 = currencyCode != null ? "" : currencyCode;
                com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer = cardDetail.getIssuer();
                java.lang.String name3 = issuer != null ? issuer.getName() : null;
                return new com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo(refText, status, standardCardImage3, cardDetail.getBrand().name(), name3 != null ? "" : name3, str10, str, str8, cardDetail.getBillingAddress(), str11, str9, cardDetail.getLastNChars(), str5, str7, standardCardImage2, cardDetail.getBrand());
            }
        }
        str = expirationDate;
        if (split$default != null) {
        }
        str2 = null;
        if (str2 != null) {
        }
        if (split$default == null) {
        }
        if (str6 != null) {
        }
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress2 = cardDetail.getBillingAddress();
        if (billingAddress2 == null) {
        }
        if (formattedAddress != null) {
        }
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt3 = cardDetail.getCardArt();
        if (cardArt3 != null) {
        }
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardArt cardArt22 = cardDetail.getCardArt();
        if (cardArt22 != null) {
        }
        com.paypal.oslo.feature.wallet.cards.domain.detail.model.CardProductClass productClass22 = cardDetail.getProductClass();
        if (productClass22 == null) {
        }
        if (name2 != null) {
        }
        productClass = cardDetail.getProductClass();
        if (productClass != null) {
        }
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_card_masked, cardDetail.getLastNChars());
        com.paypal.oslo.core.commonui.utils.RefText refText2 = stringResourceRef2;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus status2 = cardDetail.getStatus();
        java.lang.String nickName2 = cardDetail.getNickName();
        if (nickName2 != null) {
        }
        java.lang.String currencyCode2 = cardDetail.getCurrencyCode();
        if (currencyCode2 != null) {
        }
        com.paypal.oslo.feature.wallet.cards.domain.add.model.Issuer issuer2 = cardDetail.getIssuer();
        if (issuer2 != null) {
        }
        return new com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo(refText2, status2, standardCardImage3, cardDetail.getBrand().name(), name3 != null ? "" : name3, str10, str, str8, cardDetail.getBillingAddress(), str11, str9, cardDetail.getLastNChars(), str5, str7, standardCardImage2, cardDetail.getBrand());
    }

    public static final com.paypal.oslo.feature.wallet.api.navigation.UpdateCardDestination toUpdateCardDestination(com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo cardDetailInfo, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetailInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) cardDetailInfo.getExpiration(), new java.lang.String[]{androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR}, false, 0, 6, (java.lang.Object) null);
        java.lang.String str2 = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(split$default, 0);
        java.lang.String str3 = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(split$default, 1);
        java.lang.String thumbnailImageUrl = cardDetailInfo.getThumbnailImageUrl();
        if (thumbnailImageUrl == null) {
            thumbnailImageUrl = "";
        }
        java.lang.String issuer = cardDetailInfo.getIssuer();
        java.lang.String productClassName = cardDetailInfo.getProductClassName();
        java.lang.String lastNChars = cardDetailInfo.getLastNChars();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress address = cardDetailInfo.getAddress();
        java.lang.String id = address != null ? address.getId() : null;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress address2 = cardDetailInfo.getAddress();
        java.lang.String addressLine1 = address2 != null ? address2.getAddressLine1() : null;
        if (addressLine1 == null) {
            addressLine1 = "";
        }
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress address3 = cardDetailInfo.getAddress();
        java.lang.String addressLine2 = address3 != null ? address3.getAddressLine2() : null;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress address4 = cardDetailInfo.getAddress();
        java.lang.String city = address4 != null ? address4.getCity() : null;
        if (city == null) {
            city = "";
        }
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress address5 = cardDetailInfo.getAddress();
        java.lang.String state = address5 != null ? address5.getState() : null;
        if (state == null) {
            state = "";
        }
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress address6 = cardDetailInfo.getAddress();
        java.lang.String postalCode = address6 != null ? address6.getPostalCode() : null;
        if (postalCode == null) {
            postalCode = "";
        }
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress address7 = cardDetailInfo.getAddress();
        java.lang.String countryCode = address7 != null ? address7.getCountryCode() : null;
        return new com.paypal.oslo.feature.wallet.api.navigation.UpdateCardDestination(new com.paypal.oslo.feature.wallet.api.ui.cards.edit.config.UpdateCardConfig(str, thumbnailImageUrl, str2, str3, issuer, productClassName, lastNChars, id, addressLine1, addressLine2, city, state, postalCode, countryCode != null ? countryCode : "", cardDetailInfo.getBrand().name()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0113, code lost:
    
        if (r2 == null) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo toCardDetailInfo(com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card card) {
        java.util.List emptyList;
        java.lang.String str;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress;
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef;
        java.lang.Integer intOrNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
        java.lang.String expirationDate = card.getExpirationDate();
        if (expirationDate == null || (emptyList = kotlin.text.StringsKt.split$default((java.lang.CharSequence) expirationDate, new java.lang.String[]{androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR}, false, 0, 6, (java.lang.Object) null)) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        java.lang.String str2 = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(emptyList, 0);
        if (str2 == null || (intOrNull = kotlin.text.StringsKt.toIntOrNull(str2)) == null) {
            str = null;
        } else {
            int intValue = intOrNull.intValue();
            java.lang.String[] months = new java.text.DateFormatSymbols().getMonths();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(months, "");
            str = (java.lang.String) kotlin.collections.ArraysKt.getOrNull(months, intValue - 1);
            if (str == null) {
                str = "";
            }
        }
        java.lang.String str3 = str == null ? "" : str;
        java.lang.String str4 = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(emptyList, 1);
        java.lang.String str5 = str4 == null ? "" : str4;
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address address = card.getAddress();
        java.lang.String addressLine1 = address != null ? address.getAddressLine1() : null;
        if (addressLine1 == null || addressLine1.length() == 0) {
            billingAddress = null;
        } else {
            com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address address2 = card.getAddress();
            java.lang.String addressId = address2 != null ? address2.getAddressId() : null;
            com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address address3 = card.getAddress();
            java.lang.String addressLine12 = address3 != null ? address3.getAddressLine1() : null;
            java.lang.String str6 = addressLine12 == null ? "" : addressLine12;
            com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address address4 = card.getAddress();
            java.lang.String addressLine2 = address4 != null ? address4.getAddressLine2() : null;
            com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address address5 = card.getAddress();
            java.lang.String city = address5 != null ? address5.getCity() : null;
            java.lang.String str7 = city == null ? "" : city;
            com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address address6 = card.getAddress();
            java.lang.String state = address6 != null ? address6.getState() : null;
            java.lang.String str8 = state == null ? "" : state;
            com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address address7 = card.getAddress();
            java.lang.String postalCode = address7 != null ? address7.getPostalCode() : null;
            java.lang.String str9 = postalCode == null ? "" : postalCode;
            com.paypal.oslo.feature.wallet.api.navigation.result.cards.Address address8 = card.getAddress();
            java.lang.String countryCode = address8 != null ? address8.getCountryCode() : null;
            billingAddress = new com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress(addressId, str6, addressLine2, str7, str8, str9, countryCode == null ? "" : countryCode);
        }
        java.lang.String productClass = card.getProductClass();
        java.lang.String str10 = productClass == null ? "" : productClass;
        java.lang.String productClass2 = card.getProductClass();
        if (productClass2 != null) {
            java.lang.String lastNChars = card.getLastNChars();
            if (lastNChars == null) {
                lastNChars = "";
            }
            stringResourceRef = com.paypal.oslo.feature.wallet.common.util.FundingInstrumentRefTextMapperKt.maskedCardNumberRef(productClass2, lastNChars);
        }
        int i = com.paypal.oslo.feature.wallet.R.string.feature_wallet_fi_selection_card_masked;
        java.lang.String lastNChars2 = card.getLastNChars();
        if (lastNChars2 == null) {
            lastNChars2 = "";
        }
        stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(i, lastNChars2);
        com.paypal.oslo.core.commonui.utils.RefText refText = stringResourceRef;
        java.lang.String status = card.getStatus();
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatus cardStatus = status != null ? com.paypal.oslo.feature.wallet.cards.domain.add.model.CardStatusKt.toCardStatus(status) : null;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand fromName = com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.INSTANCE.fromName(card.getBrand());
        java.lang.String cardArtPrimaryImageUrl = card.getCardArtPrimaryImageUrl();
        java.lang.String brand = card.getBrand();
        java.lang.String str11 = brand == null ? "" : brand;
        java.lang.String issuerName = card.getIssuerName();
        java.lang.String str12 = issuerName == null ? "" : issuerName;
        java.lang.String nickName = card.getNickName();
        java.lang.String str13 = nickName == null ? "" : nickName;
        java.lang.String expirationDate2 = card.getExpirationDate();
        java.lang.String str14 = expirationDate2 == null ? "" : expirationDate2;
        java.lang.String formattedAddress = billingAddress != null ? billingAddress.formattedAddress() : null;
        java.lang.String str15 = formattedAddress == null ? "" : formattedAddress;
        java.lang.String currencyCode = card.getCurrencyCode();
        java.lang.String str16 = currencyCode == null ? "" : currencyCode;
        java.lang.String lastNChars3 = card.getLastNChars();
        return new com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo(refText, cardStatus, cardArtPrimaryImageUrl, str11, str12, str13, str14, str15, billingAddress, str16, str10, lastNChars3 == null ? "" : lastNChars3, str3, str5, card.getThumbnailImageUrl(), fromName);
    }
}
