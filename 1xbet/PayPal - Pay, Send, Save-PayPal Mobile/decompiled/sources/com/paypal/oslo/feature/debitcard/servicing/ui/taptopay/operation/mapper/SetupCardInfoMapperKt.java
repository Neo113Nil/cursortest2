package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;", "toSetupCardInfo", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;)Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SetupCardInfoMapperKt {
    public static final com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo toSetupCardInfo(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument) {
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        java.lang.String id = debitInstrument.getId();
        int i = com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mapper.SetupCardInfoMapperKt.WhenMappings.$EnumSwitchMapping$0[com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.INSTANCE.fromValue(debitInstrument.getProductName()).ordinal()];
        if (i == 1) {
            cardType = com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.PayPalConsumerDebit;
        } else if (i == 2) {
            cardType = com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.PayPalBusinessDebit;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            cardType = com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.Unknown;
        }
        return new com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo(id, cardType, debitInstrument.getLastNChars(), debitInstrument.getProductDetails().getBrand().name(), (com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData) null, new com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection(new com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArt(debitInstrument.getProductDetails().getLargeImage().getFront().getUrl(), debitInstrument.getProductDetails().getLargeImage().getFront().getContentType(), (java.lang.Integer) null, (java.lang.Integer) null, (com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtMetadata) null, 28, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArt(debitInstrument.getProductDetails().getSmallImage().getFront().getUrl(), debitInstrument.getProductDetails().getSmallImage().getFront().getContentType(), (java.lang.Integer) null, (java.lang.Integer) null, (com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtMetadata) null, 28, (kotlin.jvm.internal.DefaultConstructorMarker) null), (com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArt) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.CONSUMER_DEBIT_CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.BUSINESS_DEBIT_CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
