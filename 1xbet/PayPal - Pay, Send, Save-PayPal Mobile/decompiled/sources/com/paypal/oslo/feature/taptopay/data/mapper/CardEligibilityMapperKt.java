package com.paypal.oslo.feature.taptopay.data.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\b*\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\b*\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$DeviceWalletEligibility;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/CardEligibilityResult;", "toDomain", "(Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$DeviceWalletEligibility;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/CardEligibilityResult;", "Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$ArtDetails;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtCollection;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/taptopay/graphql/GetCardEligibilityQuery$ArtDetails;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtCollection;", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", "toGraphQLProductType", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;)Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "toFinancialProduct"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardEligibilityMapperKt {
    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibilityResult toDomain(com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletEligibility deviceWalletEligibility) {
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType highSpeedVideoSizes;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType highSpeedVideoSizes2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceWalletEligibility, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List<com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletItem> deviceWalletItems = deviceWalletEligibility.getDeviceWalletItems();
        if (deviceWalletItems != null) {
            for (com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.DeviceWalletItem deviceWalletItem : deviceWalletItems) {
                com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Instrument instrument = deviceWalletItem.getInstrument();
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.DefaultCardEligibility defaultCardEligibility = null;
                if (instrument != null) {
                    com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.EvaluationState evaluationState = deviceWalletItem.getEvaluationState();
                    boolean z = (evaluationState != null ? evaluationState.getStatus() : null) == com.paypal.oslo.api.graphql.schema.type.DeviceWalletEligibilityStatus.ELIGIBLE;
                    com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType financialProduct = deviceWalletItem.getFinancialProduct();
                    if (financialProduct == null || (highSpeedVideoSizes2 = getHighSpeedVideoSizes(financialProduct)) == null) {
                        highSpeedVideoSizes2 = getHighSpeedVideoSizes(instrument.getType());
                    }
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType = highSpeedVideoSizes2;
                    if (com.paypal.oslo.feature.taptopay.data.mapper.CardEligibilityMapperKt.WhenMappings.$EnumSwitchMapping$0[cardType.ordinal()] == 1) {
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId(instrument.getId());
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType2 = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayLaterToGo;
                        java.lang.String brand = instrument.getBrand();
                        java.lang.String productDescription = instrument.getProductDescription();
                        java.lang.String lastFourChars = instrument.getLastFourChars();
                        com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ArtDetails artDetails = instrument.getArtDetails();
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection highSpeedVideoFpsRanges = artDetails != null ? getHighSpeedVideoFpsRanges(artDetails) : null;
                        java.lang.Object createTime = instrument.getCreateTime();
                        java.lang.String obj = createTime != null ? createTime.toString() : null;
                        com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.SpendingLimit spendingLimit = instrument.getSpendingLimit();
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit cardSpendingLimit = spendingLimit != null ? new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit(spendingLimit.getCurrencyCode().toString(), spendingLimit.getValue()) : null;
                        java.lang.Object validityDuration = instrument.getValidityDuration();
                        defaultCardEligibility = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterCardEligibility(z, payPalCardId, cardType2, brand, productDescription, lastFourChars, highSpeedVideoFpsRanges, new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterData(obj, cardSpendingLimit, validityDuration != null ? validityDuration.toString() : null));
                    } else {
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId(instrument.getId());
                        java.lang.String brand2 = instrument.getBrand();
                        java.lang.String productDescription2 = instrument.getProductDescription();
                        java.lang.String lastFourChars2 = instrument.getLastFourChars();
                        com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ArtDetails artDetails2 = instrument.getArtDetails();
                        defaultCardEligibility = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.DefaultCardEligibility(z, payPalCardId2, cardType, brand2, productDescription2, lastFourChars2, artDetails2 != null ? getHighSpeedVideoFpsRanges(artDetails2) : null);
                    }
                }
                if (defaultCardEligibility != null) {
                    arrayList.add(defaultCardEligibility);
                }
                if (deviceWalletItem.getInstrument() == null && deviceWalletItem.getFinancialProduct() != null && (highSpeedVideoSizes = getHighSpeedVideoSizes(deviceWalletItem.getFinancialProduct())) != com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.Unknown) {
                    arrayList2.add(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.FinancialProductEligibility(highSpeedVideoSizes));
                }
            }
        }
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibilityResult(arrayList, arrayList2, kotlin.collections.CollectionsKt.emptyList());
    }

    private static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ArtDetails artDetails) {
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt2;
        com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.StackViewContent stackViewContent;
        com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.ThumbnailContent thumbnailContent;
        com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.PrimaryContent primaryContent;
        com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Art art = artDetails.getArt();
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt3 = null;
        cardArt3 = null;
        if (art == null || (primaryContent = art.getPrimaryContent()) == null) {
            cardArt = null;
        } else {
            java.lang.Object baseCdnLinkPath = primaryContent.getBaseCdnLinkPath();
            cardArt = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(baseCdnLinkPath != null ? baseCdnLinkPath.toString() : null, primaryContent.getMimeType(), primaryContent.getWidth(), primaryContent.getHeight(), (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata) null, 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Art art2 = artDetails.getArt();
        if (art2 == null || (thumbnailContent = art2.getThumbnailContent()) == null) {
            cardArt2 = null;
        } else {
            java.lang.Object baseCdnLinkPath2 = thumbnailContent.getBaseCdnLinkPath();
            cardArt2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(baseCdnLinkPath2 != null ? baseCdnLinkPath2.toString() : null, thumbnailContent.getMimeType(), thumbnailContent.getWidth(), thumbnailContent.getHeight(), (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata) null, 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        com.paypal.oslo.feature.taptopay.graphql.GetCardEligibilityQuery.Art art3 = artDetails.getArt();
        if (art3 != null && (stackViewContent = art3.getStackViewContent()) != null) {
            java.lang.Object baseCdnLinkPath3 = stackViewContent.getBaseCdnLinkPath();
            cardArt3 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(baseCdnLinkPath3 != null ? baseCdnLinkPath3.toString() : null, stackViewContent.getMimeType(), stackViewContent.getWidth(), stackViewContent.getHeight(), (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata) null, 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection(cardArt, cardArt2, cardArt3);
    }

    private static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType getHighSpeedVideoSizes(com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType) {
        switch (com.paypal.oslo.feature.taptopay.data.mapper.CardEligibilityMapperKt.WhenMappings.$EnumSwitchMapping$1[fundingInstrumentType.ordinal()]) {
            case 1:
            case 2:
                return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayPalConsumerDebit;
            case 3:
                return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayPalBusinessDebit;
            case 4:
                return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.ThirdPartyDebit;
            case 5:
                return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.ThirdPartyCredit;
            case 6:
            case 7:
                return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayLaterToGo;
            default:
                return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.Unknown;
        }
    }

    public static final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType toGraphQLProductType(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardType, "");
        switch (com.paypal.oslo.feature.taptopay.data.mapper.CardEligibilityMapperKt.WhenMappings.$EnumSwitchMapping$0[cardType.ordinal()]) {
            case 1:
                return com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.PAY_LATER_TO_GO;
            case 2:
                return com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.PAYPAL_DEBIT_CARD;
            case 3:
                return com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.PAYPAL_DEBIT_CARD;
            case 4:
                return com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.CREDIT_CARD;
            case 5:
                return com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.DEBIT_CARD;
            case 6:
                return com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.UNKNOWN__;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType toFinancialProduct(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardType, "");
        switch (com.paypal.oslo.feature.taptopay.data.mapper.CardEligibilityMapperKt.WhenMappings.$EnumSwitchMapping$0[cardType.ordinal()]) {
            case 1:
                return com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.PAY_LATER_TO_GO;
            case 2:
                return com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.CONSUMER_DEBIT_CARD;
            case 3:
                return com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.BUSINESS_DEBIT_CARD;
            case 4:
                return com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.CREDIT_CARD;
            case 5:
                return com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.DEBIT_CARD;
            case 6:
                return com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.UNKNOWN__;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.values().length];
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayLaterToGo.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayPalConsumerDebit.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayPalBusinessDebit.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.ThirdPartyCredit.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.ThirdPartyDebit.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.Unknown.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.PAYPAL_DEBIT_CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.CONSUMER_DEBIT_CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.BUSINESS_DEBIT_CARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.DEBIT_CARD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.CREDIT_CARD.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.PAYPAL_CREDIT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.PAY_LATER_TO_GO.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
