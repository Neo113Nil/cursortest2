package com.paypal.oslo.feature.p2p.ui.review.state;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;", "", "toIndex", "(Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;)I", "toConversionOption", "(I)Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurrencyConversionUiStateKt {
    public static final int toIndex(com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionOption, "");
        int i = com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiStateKt.WhenMappings.$EnumSwitchMapping$0[conversionOption.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.paypal.oslo.feature.p2p.domain.model.ConversionOption toConversionOption(int i) {
        if (i == 0) {
            return com.paypal.oslo.feature.p2p.domain.model.ConversionOption.PAYPAL;
        }
        if (i == 1) {
            return com.paypal.oslo.feature.p2p.domain.model.ConversionOption.CARD;
        }
        return com.paypal.oslo.feature.p2p.domain.model.ConversionOption.CARD;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.p2p.domain.model.ConversionOption.values().length];
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.ConversionOption.PAYPAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.ConversionOption.CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
