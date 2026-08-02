package com.paypal.oslo.feature.taptopay.domain.model.card.paypal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", "orUnknown", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", "", "toLogString", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardTypeKt {
    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType orUnknown(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType) {
        return cardType == null ? com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.Unknown : cardType;
    }

    public static final java.lang.String toLogString(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType) {
        switch (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardTypeKt.WhenMappings.$EnumSwitchMapping$0[orUnknown(cardType).ordinal()]) {
            case 1:
                return "PayPalConsumerDebit";
            case 2:
                return "PayPalBusinessDebit";
            case 3:
                return "ThirdPartyCredit";
            case 4:
                return "ThirdPartyDebit";
            case 5:
                return "PayLaterToGo";
            case 6:
                return "Unknown";
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }
}
