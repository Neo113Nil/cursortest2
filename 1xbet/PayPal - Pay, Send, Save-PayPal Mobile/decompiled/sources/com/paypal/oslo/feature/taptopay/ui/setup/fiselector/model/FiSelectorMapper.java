package com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSelectorMapper;", "", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "localeInformation", "Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterExpiryChecker;", "payLaterExpiryChecker", "<init>", "(Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterExpiryChecker;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/CardEligibilityResult;", "eligibilityResult", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;", "digitizedCards", "", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSectionType;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiSection;", "mapToSections", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/CardEligibilityResult;Ljava/util/List;)Ljava/util/Map;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterExpiryChecker;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FiSelectorMapper {
    private final com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.LocaleInformation getHighSpeedVideoFpsRanges;
    public static final int $stable = 8;

    @javax.inject.Inject
    public FiSelectorMapper(com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker payLaterExpiryChecker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterExpiryChecker, "");
        this.getHighSpeedVideoFpsRanges = localeInformation;
        this.getHighSpeedVideoFpsRangesFor = payLaterExpiryChecker;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.Map<com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType, com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection> mapToSections(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibilityResult eligibilityResult, java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> digitizedCards) {
        boolean z;
        boolean z2;
        boolean z3;
        com.paypal.oslo.core.commonui.utils.RefText stringRef;
        com.paypal.oslo.core.commonui.utils.RefText title;
        com.paypal.oslo.core.commonui.utils.RefText refText;
        com.paypal.oslo.core.commonui.utils.RefText stringResourceRef;
        com.paypal.oslo.core.commonui.utils.RefText stringRef2;
        java.lang.String description;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibilityResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCards, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility> cardEligibility = eligibilityResult.getCardEligibility();
        if (!(cardEligibility instanceof java.util.Collection) || !cardEligibility.isEmpty()) {
            for (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility cardEligibility2 : cardEligibility) {
                if (cardEligibility2.isEligible() && cardEligibility2.getType() == com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayPalConsumerDebit) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> list = digitizedCards;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            for (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard : list) {
                if (payPalDigitizedCard.getDigitizedCard().getStatus() == com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.PendingActivation) {
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo = payPalDigitizedCard.getCardInfo();
                    if ((cardInfo != null ? cardInfo.getType() : null) == com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayPalConsumerDebit) {
                        z2 = true;
                        break;
                    }
                }
            }
        }
        z2 = false;
        boolean z4 = z || z2;
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.FinancialProductEligibility> promoEligibility = eligibilityResult.getPromoEligibility();
        if (!(promoEligibility instanceof java.util.Collection) || !promoEligibility.isEmpty()) {
            java.util.Iterator<T> it = promoEligibility.iterator();
            while (it.hasNext()) {
                if (((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.FinancialProductEligibility) it.next()).getType() == com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayPalConsumerDebit) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        if (!z4 && z3) {
            linkedHashMap.put(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType.USE_YOUR_BANK, new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.UseYourBank(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_fi_selector_subtitle_use_bank, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_fi_selector_label_linked_bank, new java.lang.Object[0])));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) obj).getDigitizedCard().getStatus() == com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.PendingActivation) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard2 : arrayList2) {
            java.lang.String id = payPalDigitizedCard2.getPayPalCardId().getId();
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo2 = payPalDigitizedCard2.getCardInfo();
            if (cardInfo2 == null || (description = cardInfo2.getDescription()) == null || (stringRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(description)) == null) {
                stringRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("");
            }
            com.paypal.oslo.core.commonui.utils.RefText refText2 = stringRef2;
            com.paypal.oslo.core.commonui.utils.RefText subtitle = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.CardExtensionsKt.getSubtitle(payPalDigitizedCard2.getCardInfo(), payPalDigitizedCard2.getDigitizedCard().getLast4());
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo3 = payPalDigitizedCard2.getCardInfo();
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType type = cardInfo3 != null ? cardInfo3.getType() : null;
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo4 = payPalDigitizedCard2.getCardInfo();
            java.lang.String brand = cardInfo4 != null ? cardInfo4.getBrand() : null;
            java.lang.String last4 = payPalDigitizedCard2.getDigitizedCard().getLast4();
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection = payPalDigitizedCard2.getCardArtCollection();
            com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection apiCardArtCollection = cardArtCollection != null ? com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toApiCardArtCollection(cardArtCollection) : null;
            com.paypal.oslo.core.commonui.utils.RefText stringResourceRef2 = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_pending_verification_alert, new java.lang.Object[0]);
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo5 = payPalDigitizedCard2.getCardInfo();
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayLaterCardInfo payLaterCardInfo = cardInfo5 instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayLaterCardInfo ? (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayLaterCardInfo) cardInfo5 : null;
            arrayList3.add(new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard(id, refText2, subtitle, null, null, false, type, true, brand, last4, apiCardArtCollection, true, stringResourceRef2, payLaterCardInfo != null ? payLaterCardInfo.getExtras() : null));
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility> cardEligibility3 = eligibilityResult.getCardEligibility();
        java.util.ArrayList<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility> arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj2 : cardEligibility3) {
            if (((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility) obj2).isEligible()) {
                arrayList5.add(obj2);
            }
        }
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        for (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility cardEligibility4 : arrayList5) {
            java.lang.String id2 = cardEligibility4.getId().getId();
            java.lang.String description2 = cardEligibility4.getDescription();
            if (description2 == null || (title = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(description2)) == null) {
                title = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.CardExtensionsKt.getTitle(cardEligibility4);
            }
            com.paypal.oslo.core.commonui.utils.RefText refText3 = title;
            com.paypal.oslo.core.commonui.utils.RefText subtitle2 = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.CardExtensionsKt.getSubtitle(cardEligibility4);
            boolean z5 = cardEligibility4 instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterCardEligibility;
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterCardEligibility payLaterCardEligibility = z5 ? (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterCardEligibility) cardEligibility4 : null;
            if (payLaterCardEligibility != null) {
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterData payLaterData = payLaterCardEligibility.getPayLaterData();
                java.lang.String createTime = payLaterData != null ? payLaterData.getCreateTime() : null;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterData payLaterData2 = payLaterCardEligibility.getPayLaterData();
                java.lang.Long timeLeftMs = this.getHighSpeedVideoFpsRangesFor.timeLeftMs(createTime, payLaterData2 != null ? payLaterData2.getValidityDuration() : null);
                if (timeLeftMs != null) {
                    long longValue = timeLeftMs.longValue();
                    int i = (int) (longValue / 60000);
                    if (longValue > 0) {
                        if (i < 60) {
                            int i2 = com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_pay_later_card_expiry_time_minutes;
                            java.lang.String format = java.text.NumberFormat.getIntegerInstance(this.getHighSpeedVideoFpsRanges.getUserLocale()).format(java.lang.Integer.valueOf(i));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                            stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(i2, format);
                        } else {
                            int i3 = com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_pay_later_card_expiry_time_hours;
                            java.lang.String format2 = java.text.NumberFormat.getIntegerInstance(this.getHighSpeedVideoFpsRanges.getUserLocale()).format(java.lang.Integer.valueOf(i / 60));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "");
                            stringResourceRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(i3, format2);
                        }
                        refText = stringResourceRef;
                        boolean z6 = cardEligibility4.getType() != com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayLaterToGo;
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType type2 = cardEligibility4.getType();
                        java.lang.String brand2 = cardEligibility4.getBrand();
                        java.lang.String last42 = cardEligibility4.getLast4();
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection2 = cardEligibility4.getCardArtCollection();
                        com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection apiCardArtCollection2 = cardArtCollection2 == null ? com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toApiCardArtCollection(cardArtCollection2) : null;
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterCardEligibility payLaterCardEligibility2 = !z5 ? (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterCardEligibility) cardEligibility4 : null;
                        createListBuilder.add(new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard(id2, refText3, subtitle2, null, refText, z6, type2, true, brand2, last42, apiCardArtCollection2, false, null, payLaterCardEligibility2 == null ? payLaterCardEligibility2.getPayLaterData() : null));
                    }
                }
            }
            refText = null;
            if (cardEligibility4.getType() != com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayLaterToGo) {
            }
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType type22 = cardEligibility4.getType();
            java.lang.String brand22 = cardEligibility4.getBrand();
            java.lang.String last422 = cardEligibility4.getLast4();
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection22 = cardEligibility4.getCardArtCollection();
            if (cardArtCollection22 == null) {
            }
            if (!z5) {
            }
            createListBuilder.add(new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard(id2, refText3, subtitle2, null, refText, z6, type22, true, brand22, last422, apiCardArtCollection2, false, null, payLaterCardEligibility2 == null ? payLaterCardEligibility2.getPayLaterData() : null));
        }
        java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.build(createListBuilder), (java.lang.Iterable) arrayList4);
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility> cardEligibility5 = eligibilityResult.getCardEligibility();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        for (java.lang.Object obj3 : cardEligibility5) {
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility cardEligibility6 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility) obj3;
            if (!cardEligibility6.isEligible() && com.paypal.oslo.feature.taptopay.ui.setup.flow.model.CardExtensionsKt.isThirdParty(cardEligibility6.getType())) {
                arrayList6.add(obj3);
            }
        }
        java.util.ArrayList<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility> arrayList7 = arrayList6;
        java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
        for (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility cardEligibility7 : arrayList7) {
            java.lang.String id3 = cardEligibility7.getId().getId();
            java.lang.String description3 = cardEligibility7.getDescription();
            if (description3 == null || (stringRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(description3)) == null) {
                stringRef = com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("");
            }
            com.paypal.oslo.core.commonui.utils.RefText refText4 = stringRef;
            com.paypal.oslo.core.commonui.utils.RefText subtitle3 = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.CardExtensionsKt.getSubtitle(cardEligibility7);
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType type3 = cardEligibility7.getType();
            java.lang.String brand3 = cardEligibility7.getBrand();
            java.lang.String last43 = cardEligibility7.getLast4();
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection3 = cardEligibility7.getCardArtCollection();
            arrayList8.add(new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard(id3, refText4, subtitle3, null, null, false, type3, false, brand3, last43, cardArtCollection3 != null ? com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toApiCardArtCollection(cardArtCollection3) : null, false, null, null, 8192, null));
        }
        java.util.ArrayList arrayList9 = arrayList8;
        if (!plus.isEmpty()) {
            linkedHashMap.put(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType.ELIGIBLE_CARDS, new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.EligibleCards(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_fi_selector_subtitle_use_existing_card, new java.lang.Object[0]), plus));
            if (!arrayList9.isEmpty()) {
                linkedHashMap.put(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType.INELIGIBLE_CARDS_FOOTER, new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.IneligibleCardsFooter(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_fi_selector_alert_unavailable, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_fi_selector_alert_unavailable_hyperlink, new java.lang.Object[0]), arrayList9));
            }
            return linkedHashMap;
        }
        linkedHashMap.put(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSectionType.COMING_SOON, new com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiSection.ComingSoon(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_fi_selector_subtitle_use_existing_card, new java.lang.Object[0]), arrayList9));
        return linkedHashMap;
    }
}
