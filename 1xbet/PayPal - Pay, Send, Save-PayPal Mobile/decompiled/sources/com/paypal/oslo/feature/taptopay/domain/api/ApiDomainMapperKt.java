package com.paypal.oslo.feature.taptopay.domain.api;

@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010\"\u001a\u00020!*\u00020 H\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010&\u001a\u00020%*\u00020$H\u0000¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010(\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b(\u0010)\u001a\u0013\u0010*\u001a\u00020\u0004*\u00020\u0005H\u0000¢\u0006\u0004\b*\u0010+\u001a\u0013\u0010,\u001a\u00020\b*\u00020\tH\u0000¢\u0006\u0004\b,\u0010-\u001a\u0013\u0010.\u001a\u00020\f*\u00020\rH\u0000¢\u0006\u0004\b.\u0010/\u001a\u0013\u00100\u001a\u00020\u0010*\u00020\u0011H\u0000¢\u0006\u0004\b0\u00101\u001a\u0013\u00104\u001a\u000203*\u000202H\u0000¢\u0006\u0004\b4\u00105"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;", "toApiCardType", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;)Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/PayLaterData;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/eligibility/PayLaterData;", "toApiPayLaterData", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/PayLaterData;)Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/eligibility/PayLaterData;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtCollection;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/art/CardArtCollection;", "toApiCardArtCollection", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtCollection;)Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/art/CardArtCollection;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArt;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/art/CardArt;", "toApiCardArt", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArt;)Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/art/CardArt;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtMetadata;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/art/CardArtMetadata;", "toApiCardArtMetadata", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtMetadata;)Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/art/CardArtMetadata;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardInfo;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardInfo;", "toApiCardInfo", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardInfo;)Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardInfo;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardId;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId;", "toInternal", "(Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardId;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/PayPalDigitizedCard;", "toApiPayPalDigitizedCard", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;)Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/PayPalDigitizedCard;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/DigitizedCard;", "toApiDigitizedCard", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;)Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/DigitizedCard;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard$Status;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/DigitizedCard$Status;", "toApiStatus", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard$Status;)Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/DigitizedCard$Status;", "toCardType", "(Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", "toPayLaterData", "(Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/eligibility/PayLaterData;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/PayLaterData;", "toCardArtCollection", "(Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/art/CardArtCollection;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtCollection;", "toCardArt", "(Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/art/CardArt;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArt;", "toCardArtMetadata", "(Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/art/CardArtMetadata;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtMetadata;", "Lcom/paypal/oslo/feature/taptopay/domain/model/network/ServiceApiError;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/network/ServiceApiError;", "toApiServiceApiError", "(Lcom/paypal/oslo/feature/taptopay/domain/model/network/ServiceApiError;)Lcom/paypal/oslo/feature/taptopay/api/domain/model/network/ServiceApiError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ApiDomainMapperKt {
    public static final com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType toApiCardType(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardType, "");
        switch (com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.WhenMappings.$EnumSwitchMapping$0[cardType.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.PayPalConsumerDebit;
            case 2:
                return com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.PayPalBusinessDebit;
            case 3:
                return com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.ThirdPartyCredit;
            case 4:
                return com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.ThirdPartyDebit;
            case 5:
                return com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.PayLaterToGo;
            case 6:
                return com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.Unknown;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData toApiPayLaterData(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterData payLaterData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterData, "");
        java.lang.String createTime = payLaterData.getCreateTime();
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit spendingLimit = payLaterData.getSpendingLimit();
        return new com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData(createTime, spendingLimit != null ? new com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.CardSpendingLimit(spendingLimit.getCurrencyCode(), spendingLimit.getValue()) : null, payLaterData.getValidityDuration());
    }

    public static final com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection toApiCardArtCollection(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardArtCollection, "");
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt primary = cardArtCollection.getPrimary();
        com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArt apiCardArt = primary != null ? toApiCardArt(primary) : null;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt thumbnail = cardArtCollection.getThumbnail();
        com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArt apiCardArt2 = thumbnail != null ? toApiCardArt(thumbnail) : null;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt stackView = cardArtCollection.getStackView();
        return new com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection(apiCardArt, apiCardArt2, stackView != null ? toApiCardArt(stackView) : null);
    }

    public static final com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArt toApiCardArt(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardArt, "");
        java.lang.String sourceUrl = cardArt.getSourceUrl();
        java.lang.String mimeType = cardArt.getMimeType();
        java.lang.Integer width = cardArt.getWidth();
        java.lang.Integer height = cardArt.getHeight();
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata metadata = cardArt.getMetadata();
        return new com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArt(sourceUrl, mimeType, width, height, metadata != null ? toApiCardArtMetadata(metadata) : null);
    }

    public static final com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtMetadata toApiCardArtMetadata(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata cardArtMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardArtMetadata, "");
        return new com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtMetadata(cardArtMetadata.getBackgroundColor(), cardArtMetadata.getForegroundColor(), cardArtMetadata.getLabelColor());
    }

    public static final com.paypal.oslo.feature.taptopay.api.domain.model.card.CardInfo toApiCardInfo(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo) {
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterData extras;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardInfo, "");
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType type = cardInfo.getType();
        if (type == null || (cardType = toApiCardType(type)) == null) {
            cardType = com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.Unknown;
        }
        java.lang.String brand = cardInfo.getBrand();
        java.lang.String description = cardInfo.getDescription();
        com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData = null;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayLaterCardInfo payLaterCardInfo = cardInfo instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayLaterCardInfo ? (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayLaterCardInfo) cardInfo : null;
        if (payLaterCardInfo != null && (extras = payLaterCardInfo.getExtras()) != null) {
            payLaterData = toApiPayLaterData(extras);
        }
        return new com.paypal.oslo.feature.taptopay.api.domain.model.card.CardInfo(cardType, brand, description, payLaterData);
    }

    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId toInternal(com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId cardId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
        if (cardId instanceof com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.DigitizedCardId) {
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DigitizedCardId(((com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.DigitizedCardId) cardId).getId());
        }
        if (cardId instanceof com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId) {
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId(((com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId) cardId).getId());
        }
        if (cardId instanceof com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.DeviceWalletServiceCardId) {
            return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId(((com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.DeviceWalletServiceCardId) cardId).getId());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.paypal.oslo.feature.taptopay.api.domain.model.card.PayPalDigitizedCard toApiPayPalDigitizedCard(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalDigitizedCard, "");
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId payPalCardId = new com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId(payPalDigitizedCard.getPayPalCardId().getId());
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId = new com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.DeviceWalletServiceCardId(payPalDigitizedCard.getDeviceWalletServiceCardId().getId());
        com.paypal.oslo.feature.taptopay.api.domain.model.card.DigitizedCard apiDigitizedCard = toApiDigitizedCard(payPalDigitizedCard.getDigitizedCard());
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection cardArtCollection = payPalDigitizedCard.getCardArtCollection();
        com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection apiCardArtCollection = cardArtCollection != null ? toApiCardArtCollection(cardArtCollection) : null;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo = payPalDigitizedCard.getCardInfo();
        return new com.paypal.oslo.feature.taptopay.api.domain.model.card.PayPalDigitizedCard(payPalCardId, deviceWalletServiceCardId, apiDigitizedCard, apiCardArtCollection, cardInfo != null ? toApiCardInfo(cardInfo) : null);
    }

    public static final com.paypal.oslo.feature.taptopay.api.domain.model.card.DigitizedCard toApiDigitizedCard(com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCard, "");
        return new com.paypal.oslo.feature.taptopay.api.domain.model.card.DigitizedCard(digitizedCard.getCardId(), digitizedCard.getLast4(), digitizedCard.getLast4dpan(), digitizedCard.getExpiry(), digitizedCard.isDefault(), toApiStatus(digitizedCard.getStatus()), digitizedCard.getCardArt());
    }

    public static final com.paypal.oslo.feature.taptopay.api.domain.model.card.DigitizedCard.Status toApiStatus(com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        int i = com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.taptopay.api.domain.model.card.DigitizedCard.Status.PendingActivation;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.taptopay.api.domain.model.card.DigitizedCard.Status.Active;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.taptopay.api.domain.model.card.DigitizedCard.Status.Suspended;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.taptopay.api.domain.model.card.DigitizedCard.Status.Expired;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.taptopay.api.domain.model.card.DigitizedCard.Status.Unknown;
    }

    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType toCardType(com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardType, "");
        switch (com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.WhenMappings.$EnumSwitchMapping$2[cardType.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayPalConsumerDebit;
            case 2:
                return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayPalBusinessDebit;
            case 3:
                return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.ThirdPartyCredit;
            case 4:
                return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.ThirdPartyDebit;
            case 5:
                return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayLaterToGo;
            case 6:
                return com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.Unknown;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterData toPayLaterData(com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterData, "");
        java.lang.String createTime = payLaterData.getCreateTime();
        com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.CardSpendingLimit spendingLimit = payLaterData.getSpendingLimit();
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterData(createTime, spendingLimit != null ? new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardSpendingLimit(spendingLimit.getCurrencyCode(), spendingLimit.getValue()) : null, payLaterData.getValidityDuration());
    }

    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection toCardArtCollection(com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection cardArtCollection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardArtCollection, "");
        com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArt primary = cardArtCollection.getPrimary();
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt = primary != null ? toCardArt(primary) : null;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArt thumbnail = cardArtCollection.getThumbnail();
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt2 = thumbnail != null ? toCardArt(thumbnail) : null;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArt stackView = cardArtCollection.getStackView();
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection(cardArt, cardArt2, stackView != null ? toCardArt(stackView) : null);
    }

    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt toCardArt(com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArt cardArt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardArt, "");
        java.lang.String sourceUrl = cardArt.getSourceUrl();
        java.lang.String mimeType = cardArt.getMimeType();
        java.lang.Integer width = cardArt.getWidth();
        java.lang.Integer height = cardArt.getHeight();
        com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtMetadata metadata = cardArt.getMetadata();
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt(sourceUrl, mimeType, width, height, metadata != null ? toCardArtMetadata(metadata) : null);
    }

    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata toCardArtMetadata(com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtMetadata cardArtMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardArtMetadata, "");
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtMetadata(cardArtMetadata.getBackgroundColor(), cardArtMetadata.getForegroundColor(), cardArtMetadata.getLabelColor());
    }

    public static final com.paypal.oslo.feature.taptopay.api.domain.model.network.ServiceApiError toApiServiceApiError(com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError serviceApiError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceApiError, "");
        if (serviceApiError instanceof com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.Offline) {
            return com.paypal.oslo.feature.taptopay.api.domain.model.network.ServiceApiError.Offline.INSTANCE;
        }
        if (serviceApiError instanceof com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.ResponseError) {
            return com.paypal.oslo.feature.taptopay.api.domain.model.network.ServiceApiError.ResponseError.INSTANCE;
        }
        if (serviceApiError instanceof com.paypal.oslo.feature.taptopay.domain.model.network.ServiceApiError.DefaultError) {
            return com.paypal.oslo.feature.taptopay.api.domain.model.network.ServiceApiError.DefaultError.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.values().length];
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayPalConsumerDebit.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayPalBusinessDebit.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.ThirdPartyCredit.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.ThirdPartyDebit.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayLaterToGo.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.Unknown.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.values().length];
            try {
                iArr2[com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.PendingActivation.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Active.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Suspended.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Expired.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Unknown.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.values().length];
            try {
                iArr3[com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.PayPalConsumerDebit.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.PayPalBusinessDebit.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr3[com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.ThirdPartyCredit.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr3[com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.ThirdPartyDebit.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr3[com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.PayLaterToGo.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr3[com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.Unknown.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
