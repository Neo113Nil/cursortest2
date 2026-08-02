package com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiCard;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;", "toSetupCardInfo", "(Lcom/paypal/oslo/feature/taptopay/ui/setup/fiselector/model/FiCard;)Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FiCardKt {
    public static final com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo toSetupCardInfo(com.paypal.oslo.feature.taptopay.ui.setup.fiselector.model.FiCard fiCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiCard, "");
        java.lang.String id = fiCard.getId();
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType = fiCard.getCardType();
        if (cardType == null) {
            cardType = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.Unknown;
        }
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType apiCardType = com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toApiCardType(cardType);
        java.lang.String last4 = fiCard.getLast4();
        java.lang.String str = last4 == null ? "" : last4;
        java.lang.String brand = fiCard.getBrand();
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.PayLaterData payLaterData = fiCard.getPayLaterData();
        return new com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo(id, apiCardType, str, brand, payLaterData != null ? com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toApiPayLaterData(payLaterData) : null, fiCard.getCardArtCollection());
    }
}
