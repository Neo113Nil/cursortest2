package com.paypal.oslo.feature.moneymovement.ui.shared.domain;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "", "newQuantity", "withUpdatedQuantity", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "getQuantity", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;)Ljava/lang/String;", "quantity", "getSymbol", "symbol"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MoneyAmountExtensionsKt {
    public static final java.lang.String getQuantity(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmount, "");
        int i = com.paypal.oslo.feature.moneymovement.ui.shared.domain.MoneyAmountExtensionsKt.WhenMappings.$EnumSwitchMapping$0[moneyAmount.getType().ordinal()];
        if (i == 1) {
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiat = moneyAmount.getFiat();
            kotlin.jvm.internal.Intrinsics.checkNotNull(fiat);
            return fiat.getQuantity();
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails crypto = moneyAmount.getCrypto();
        kotlin.jvm.internal.Intrinsics.checkNotNull(crypto);
        return crypto.getQuantity();
    }

    public static final java.lang.String getSymbol(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmount, "");
        int i = com.paypal.oslo.feature.moneymovement.ui.shared.domain.MoneyAmountExtensionsKt.WhenMappings.$EnumSwitchMapping$0[moneyAmount.getType().ordinal()];
        if (i == 1) {
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiat = moneyAmount.getFiat();
            kotlin.jvm.internal.Intrinsics.checkNotNull(fiat);
            return fiat.getCurrencyCode();
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails crypto = moneyAmount.getCrypto();
        kotlin.jvm.internal.Intrinsics.checkNotNull(crypto);
        return crypto.getAssetSymbol();
    }

    public static final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount withUpdatedQuantity(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int i = com.paypal.oslo.feature.moneymovement.ui.shared.domain.MoneyAmountExtensionsKt.WhenMappings.$EnumSwitchMapping$0[moneyAmount.getType().ordinal()];
        if (i == 1) {
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiat = moneyAmount.getFiat();
            kotlin.jvm.internal.Intrinsics.checkNotNull(fiat);
            return com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.copy$default(moneyAmount, null, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails.copy$default(fiat, null, str, 1, null), null, 5, null);
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails crypto = moneyAmount.getCrypto();
        kotlin.jvm.internal.Intrinsics.checkNotNull(crypto);
        return com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.copy$default(moneyAmount, null, null, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails.copy$default(crypto, null, str, null, null, null, 29, null), 3, null);
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
