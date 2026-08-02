package com.paypal.oslo.feature.balance.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Data;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositOptionsResponse;", "toDepositOptionsResponse", "(Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Data;)Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositOptionsResponse;", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Instrument;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositInstrument;", "toDepositInstrument", "(Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Instrument;)Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositInstrument;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DepositOptionsMapperKt {
    public static final com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsResponse toDepositOptionsResponse(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Data data) {
        java.util.ArrayList arrayList;
        java.lang.Object currencyCode;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Option> options = data.getDepositOptions().getOptions();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(options, 10));
        for (com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Option option : options) {
            java.lang.String id = option.getId();
            boolean isDefault = option.getPlan().isDefault();
            java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.FundingSource> fundingSources = option.getPlan().getFundingSources();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(fundingSources, 10));
            for (com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.FundingSource fundingSource : fundingSources) {
                arrayList3.add(new com.paypal.oslo.feature.balance.domain.model.autoreload.DepositFundingSource(fundingSource.getType().getRawValue(), toDepositInstrument(fundingSource.getInstrument())));
            }
            java.util.ArrayList arrayList4 = arrayList3;
            java.lang.String rawValue = option.getPlan().getPaymentDelivery().getSpeed().getRawValue();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferTag> tags = option.getTags();
            java.util.ArrayList arrayList5 = null;
            if (tags != null) {
                java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferTag> list = tags;
                java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList6.add(((com.paypal.oslo.api.graphql.schema.type.TransferTag) it.next()).getRawValue());
                }
                arrayList = arrayList6;
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                arrayList = kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Limit> limits = option.getLimits();
            if (limits != null) {
                java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Limit> list2 = limits;
                java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Limit limit : list2) {
                    com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnMoney onMoney = limit.getAmount().getOnMoney();
                    java.lang.String rawValue2 = limit.getLimitType().getRawValue();
                    java.lang.String value = onMoney != null ? onMoney.getValue() : null;
                    if (value == null) {
                        value = "";
                    }
                    java.lang.String obj = (onMoney == null || (currencyCode = onMoney.getCurrencyCode()) == null) ? null : currencyCode.toString();
                    if (obj == null) {
                        obj = "";
                    }
                    arrayList7.add(new com.paypal.oslo.feature.balance.domain.model.autoreload.DepositLimit(rawValue2, value, obj));
                }
                arrayList5 = arrayList7;
            }
            arrayList2.add(new com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOption(id, isDefault, arrayList4, rawValue, arrayList, arrayList5 == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList5));
        }
        return new com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsResponse(arrayList2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ee, code lost:
    
        if (r3 == null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument toDepositInstrument(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Instrument instrument) {
        java.lang.String str;
        java.lang.String obj;
        java.lang.String substringAfterLast$default;
        com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardInstitutionImage cardInstitutionImage;
        java.lang.Object url;
        com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PrimaryImage primaryImage;
        com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PrimaryImage primaryImage2;
        java.lang.Object baseCdnLinkPath;
        com.paypal.oslo.api.graphql.schema.type.CardStatus value;
        com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage bankAccountInstitutionImage;
        java.lang.Object url2;
        com.paypal.oslo.api.graphql.schema.type.BankAccountStatus value2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrument, "");
        java.lang.String str2 = null;
        if (instrument.getOnBankAccount() == null) {
            if (instrument.getOnCard() == null) {
                return com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.Unknown.INSTANCE;
            }
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnCard onCard = instrument.getOnCard();
            java.lang.String id = onCard.getId();
            java.lang.String rawValue = onCard.getBrand().getRawValue();
            java.lang.String lastNChars = onCard.getLastNChars();
            java.lang.String nickName = onCard.getNickName();
            com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass = onCard.getProductClass();
            java.lang.String rawValue2 = productClass != null ? productClass.getRawValue() : null;
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardStatus cardStatus = onCard.getCardStatus();
            java.lang.String rawValue3 = (cardStatus == null || (value = cardStatus.getValue()) == null) ? null : value.getRawValue();
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardIssuer cardIssuer = onCard.getCardIssuer();
            java.lang.String name2 = cardIssuer != null ? cardIssuer.getName() : null;
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardArt cardArt = onCard.getCardArt();
            java.lang.String obj2 = (cardArt == null || (primaryImage2 = cardArt.getPrimaryImage()) == null || (baseCdnLinkPath = primaryImage2.getBaseCdnLinkPath()) == null) ? null : baseCdnLinkPath.toString();
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardArt cardArt2 = onCard.getCardArt();
            java.lang.String mimeType = (cardArt2 == null || (primaryImage = cardArt2.getPrimaryImage()) == null) ? null : primaryImage.getMimeType();
            if (obj2 == null) {
                obj = null;
            } else {
                if (mimeType != null && (substringAfterLast$default = kotlin.text.StringsKt.substringAfterLast$default(mimeType, kotlinx.io.files.FileSystemKt.UnixPathSeparator, (java.lang.String) null, 2, (java.lang.Object) null)) != null) {
                    str = substringAfterLast$default.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                }
                str = "png";
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(obj2);
                sb.append("2.");
                sb.append(str);
                obj = sb.toString();
            }
            java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardInstitutionImage> cardInstitutionImages = onCard.getCardInstitutionImages();
            if (cardInstitutionImages != null && (cardInstitutionImage = (com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardInstitutionImage) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) cardInstitutionImages)) != null && (url = cardInstitutionImage.getUrl()) != null) {
                str2 = url.toString();
            }
            return new com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.Card(id, rawValue, lastNChars, nickName, rawValue2, rawValue3, name2, obj, str2);
        }
        com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnBankAccount onBankAccount = instrument.getOnBankAccount();
        java.lang.String id2 = onBankAccount.getId();
        java.lang.String rawValue4 = onBankAccount.getType().getRawValue();
        java.lang.String lastNChars2 = onBankAccount.getLastNChars();
        java.lang.String nickname = onBankAccount.getNickname();
        com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountStatus bankAccountStatus = onBankAccount.getBankAccountStatus();
        java.lang.String rawValue5 = (bankAccountStatus == null || (value2 = bankAccountStatus.getValue()) == null) ? null : value2.getRawValue();
        java.lang.String name3 = onBankAccount.getBankAccountIssuer().getName();
        java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage> bankAccountInstitutionImages = onBankAccount.getBankAccountInstitutionImages();
        if (bankAccountInstitutionImages != null && (bankAccountInstitutionImage = (com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) bankAccountInstitutionImages)) != null && (url2 = bankAccountInstitutionImage.getUrl()) != null) {
            str2 = url2.toString();
        }
        return new com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.BankAccount(id2, rawValue4, lastNChars2, nickname, rawValue5, name3, str2);
    }
}
