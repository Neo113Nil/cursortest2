package com.paypal.oslo.feature.bnplservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "toFundingInstrument", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPaymentFundingInstrumentFragment;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLPaymentFundingInstrumentInput;", "toPaymentFundingInstrumentInput", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLPaymentFundingInstrumentInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FundingInstrumentMapperKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument toFundingInstrument(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPaymentFundingInstrumentFragment bnplServicingPaymentFundingInstrumentFragment) {
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBankAccountFragment.InstitutionImage institutionImage;
        java.lang.String str;
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCardFragment.CardArt cardArt;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardArt cardArt2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingPaymentFundingInstrumentFragment, "");
        if (bnplServicingPaymentFundingInstrumentFragment.getOnCard() == null) {
            if (bnplServicingPaymentFundingInstrumentFragment.getOnBankAccount() == null) {
                if (bnplServicingPaymentFundingInstrumentFragment.getOnBalance() == null) {
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.bnplservicing.LoggerKt.log;
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(bnplServicingPaymentFundingInstrumentFragment.getClass()).getSimpleName();
                    com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logUnknownMapping(logger, simpleName != null ? simpleName : "");
                    return null;
                }
                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBalanceFragment bnplServicingBalanceFragment = bnplServicingPaymentFundingInstrumentFragment.getOnBalance().getBnplServicingBalanceFragment();
                java.lang.String id = bnplServicingBalanceFragment.getId();
                com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType fundingInstrumentType = com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.BALANCE;
                com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = com.paypal.oslo.feature.bnplservicing.data.mapper.common.MoneyMapperKt.toMoney(bnplServicingBalanceFragment.getAvailableAmount().getBnplServicingMoneyFragment());
                if (money == null) {
                    money = new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("", "");
                }
                return new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount(id, null, fundingInstrumentType, money);
            }
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBankAccountFragment bnplServicingBankAccountFragment = bnplServicingPaymentFundingInstrumentFragment.getOnBankAccount().getBnplServicingBankAccountFragment();
            java.util.List<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBankAccountFragment.InstitutionImage> institutionImages = bnplServicingBankAccountFragment.getInstitutionImages();
            java.lang.Object url = (institutionImages == null || (institutionImage = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingBankAccountFragment.InstitutionImage) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) institutionImages)) == null) ? null : institutionImage.getUrl();
            return new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccount(bnplServicingBankAccountFragment.getId(), url instanceof java.lang.String ? (java.lang.String) url : null, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.BANK, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType.INSTANCE.from(bnplServicingBankAccountFragment.getType().name()), bnplServicingBankAccountFragment.getLastNChars(), bnplServicingBankAccountFragment.getBankIssuer().getName());
        }
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCardFragment bnplServicingCardFragment = bnplServicingPaymentFundingInstrumentFragment.getOnCard().getBnplServicingCardFragment();
        java.lang.String id2 = bnplServicingCardFragment.getId();
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType fundingInstrumentType2 = com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.CARD;
        java.lang.String nickName = bnplServicingCardFragment.getNickName();
        if (nickName == null) {
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCardFragment.Issuer issuer = bnplServicingCardFragment.getIssuer();
            nickName = issuer != null ? issuer.getName() : null;
            if (nickName == null) {
                str = "";
                com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand from = com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand.INSTANCE.from(bnplServicingCardFragment.getBrand().name());
                com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardProductType.Companion companion = com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardProductType.INSTANCE;
                com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass = bnplServicingCardFragment.getProductClass();
                java.lang.String name2 = productClass == null ? productClass.name() : null;
                com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardProductType from2 = companion.from(name2 != null ? name2 : "");
                java.lang.Object expirationDate = bnplServicingCardFragment.getExpirationDate();
                java.lang.String str2 = !(expirationDate instanceof java.lang.String) ? (java.lang.String) expirationDate : null;
                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCardFragment.Issuer issuer2 = bnplServicingCardFragment.getIssuer();
                java.lang.String name3 = issuer2 == null ? issuer2.getName() : null;
                java.lang.String lastNChars = bnplServicingCardFragment.getLastNChars();
                cardArt = bnplServicingCardFragment.getCardArt();
                if (cardArt == null) {
                    com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCardFragment.PrimaryImage primaryImage = cardArt.getPrimaryImage();
                    java.lang.Object baseCdnLinkPath = primaryImage != null ? primaryImage.getBaseCdnLinkPath() : null;
                    java.lang.String str3 = baseCdnLinkPath instanceof java.lang.String ? (java.lang.String) baseCdnLinkPath : null;
                    com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCardFragment.ThumbnailImage thumbnailImage = cardArt.getThumbnailImage();
                    java.lang.Object baseCdnLinkPath2 = thumbnailImage != null ? thumbnailImage.getBaseCdnLinkPath() : null;
                    java.lang.String str4 = baseCdnLinkPath2 instanceof java.lang.String ? (java.lang.String) baseCdnLinkPath2 : null;
                    java.lang.Object backgroundColor = cardArt.getBackgroundColor();
                    java.lang.String str5 = backgroundColor instanceof java.lang.String ? (java.lang.String) backgroundColor : null;
                    java.lang.Object foregroundColor = cardArt.getForegroundColor();
                    java.lang.String str6 = foregroundColor instanceof java.lang.String ? (java.lang.String) foregroundColor : null;
                    java.lang.Object labelColor = cardArt.getLabelColor();
                    cardArt2 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardArt(str3, str4, str5, str6, labelColor instanceof java.lang.String ? (java.lang.String) labelColor : null);
                } else {
                    cardArt2 = null;
                }
                return new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardAccount(id2, null, fundingInstrumentType2, str, from, from2, str2, name3, lastNChars, cardArt2);
            }
        }
        str = nickName;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand from3 = com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand.INSTANCE.from(bnplServicingCardFragment.getBrand().name());
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardProductType.Companion companion2 = com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardProductType.INSTANCE;
        com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass2 = bnplServicingCardFragment.getProductClass();
        if (productClass2 == null) {
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardProductType from22 = companion2.from(name2 != null ? name2 : "");
        java.lang.Object expirationDate2 = bnplServicingCardFragment.getExpirationDate();
        if (!(expirationDate2 instanceof java.lang.String)) {
        }
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCardFragment.Issuer issuer22 = bnplServicingCardFragment.getIssuer();
        if (issuer22 == null) {
        }
        java.lang.String lastNChars2 = bnplServicingCardFragment.getLastNChars();
        cardArt = bnplServicingCardFragment.getCardArt();
        if (cardArt == null) {
        }
        return new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardAccount(id2, null, fundingInstrumentType2, str, from3, from22, str2, name3, lastNChars2, cardArt2);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentInput toPaymentFundingInstrumentInput(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument) {
        com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBankAccountInput bNPLPaymentFundingInstrumentBankAccountInput;
        com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentCardInput bNPLPaymentFundingInstrumentCardInput;
        com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType;
        java.lang.String name2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccount bankAccount = fundingInstrument instanceof com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccount ? (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccount) fundingInstrument : null;
        if (bankAccount != null) {
            java.lang.String id = bankAccount.getId();
            com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType type = bankAccount.getType();
            if (type == null || (name2 = type.name()) == null || (bankAccountType = com.paypal.oslo.api.graphql.schema.type.BankAccountType.INSTANCE.safeValueOf(name2)) == null) {
                bankAccountType = com.paypal.oslo.api.graphql.schema.type.BankAccountType.UNKNOWN__;
            }
            java.lang.String name3 = bankAccount.getName();
            java.lang.String lastNChars = bankAccount.getLastNChars();
            if (lastNChars == null) {
                lastNChars = "";
            }
            bNPLPaymentFundingInstrumentBankAccountInput = new com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBankAccountInput(id, bankAccountType, name3, lastNChars);
        } else {
            bNPLPaymentFundingInstrumentBankAccountInput = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull(bNPLPaymentFundingInstrumentBankAccountInput);
        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardAccount cardAccount = fundingInstrument instanceof com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardAccount ? (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardAccount) fundingInstrument : null;
        if (cardAccount != null) {
            java.lang.String id2 = cardAccount.getId();
            java.lang.String name4 = cardAccount.getName();
            com.apollographql.apollo.api.Optional.Companion companion3 = com.apollographql.apollo.api.Optional.INSTANCE;
            com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand brand = cardAccount.getBrand();
            if (brand == com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand.UNKNOWN) {
                brand = null;
            }
            com.apollographql.apollo.api.Optional presentIfNotNull2 = companion3.presentIfNotNull(brand != null ? brand.name() : null);
            java.lang.String lastNChars2 = cardAccount.getLastNChars();
            bNPLPaymentFundingInstrumentCardInput = new com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentCardInput(id2, name4, presentIfNotNull2, lastNChars2 == null ? "" : lastNChars2, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(cardAccount.getExpirationDate()), com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentCardProductClass.INSTANCE.safeValueOf(cardAccount.getProductType().name()));
        } else {
            bNPLPaymentFundingInstrumentCardInput = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull3 = companion2.presentIfNotNull(bNPLPaymentFundingInstrumentCardInput);
        com.apollographql.apollo.api.Optional.Companion companion4 = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount paypalBalanceAccount = fundingInstrument instanceof com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount ? (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount) fundingInstrument : null;
        return new com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentInput(presentIfNotNull, presentIfNotNull3, companion4.presentIfNotNull(paypalBalanceAccount != null ? new com.paypal.oslo.api.graphql.schema.type.BNPLPaymentFundingInstrumentBalanceInput(paypalBalanceAccount.getId()) : null));
    }
}
