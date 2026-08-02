package com.paypal.oslo.feature.wallet.cards.ui.components;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/components/CardDetailsSize;", "Lcom/paypal/oslo/feature/wallet/cards/ui/components/CardDetailsSizeConfig;", "asConfig", "(Lcom/paypal/oslo/feature/wallet/cards/ui/components/CardDetailsSize;)Lcom/paypal/oslo/feature/wallet/cards/ui/components/CardDetailsSizeConfig;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardDetailsSizeKt {
    public static final com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSizeConfig asConfig(com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSize cardDetailsSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetailsSize, "");
        int i = com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSizeKt.WhenMappings.$EnumSwitchMapping$0[cardDetailsSize.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSizeConfig.SMALL;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSizeConfig.STANDARD;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSize.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSize.SMALL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.cards.ui.components.CardDetailsSize.STANDARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
