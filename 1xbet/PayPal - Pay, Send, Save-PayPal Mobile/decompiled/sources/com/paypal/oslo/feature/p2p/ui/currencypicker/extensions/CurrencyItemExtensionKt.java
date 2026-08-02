package com.paypal.oslo.feature.p2p.ui.currencypicker.extensions;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;", "", "requireId", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/CurrencyItem;)Ljava/lang/String;", "requireCurrencyCode"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurrencyItemExtensionKt {
    public static final java.lang.String requireId(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem currencyItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyItem, "");
        int i = com.paypal.oslo.feature.p2p.ui.currencypicker.extensions.CurrencyItemExtensionKt.WhenMappings.$EnumSwitchMapping$0[currencyItem.getType().ordinal()];
        if (i == 1) {
            return currencyItem.requireFiat().getId();
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return currencyItem.requireCrypto().getId();
    }

    public static final java.lang.String requireCurrencyCode(com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyItem currencyItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyItem, "");
        int i = com.paypal.oslo.feature.p2p.ui.currencypicker.extensions.CurrencyItemExtensionKt.WhenMappings.$EnumSwitchMapping$0[currencyItem.getType().ordinal()];
        if (i == 1) {
            return currencyItem.requireFiat().getCurrencyCode();
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return currencyItem.requireCrypto().getCode();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.values().length];
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CASH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CRYPTO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
