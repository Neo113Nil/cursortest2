package com.paypal.oslo.feature.cryptocurrency.ui.details.mapper;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/mapper/CryptoAssetHoldingDataMapper;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "priceFormatter", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "currencyProvider", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;)V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHolding;", "holding", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/components/CryptoAssetHoldingData;", "map", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHolding;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/details/components/CryptoAssetHoldingData;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoAssetHoldingDataMapper {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CryptoAssetHoldingDataMapper(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoPriceFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyProvider, "");
        this.Camera2StreamConfigurationMap = cryptoPriceFormatter;
        this.getHighResolutionOutputSizeshNQ4ISI = currencyProvider;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.details.components.CryptoAssetHoldingData map(com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding holding, java.lang.String assetSymbol) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        java.lang.String str = "0.00%";
        if (holding != null) {
            java.lang.String fiatAmountCurrencyCode = holding.getFiatAmountCurrencyCode();
            java.lang.String formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(this.Camera2StreamConfigurationMap, holding.getFiatAmountValue(), fiatAmountCurrencyCode, null, false, false, 28, null);
            java.lang.String assetQuantity = holding.getAssetQuantity();
            java.lang.String assetSymbol2 = holding.getAssetSymbol();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(assetQuantity);
            sb.append(" ");
            sb.append(assetSymbol2);
            java.lang.String obj = sb.toString();
            java.lang.String gainOrLossPercent = holding.getGainOrLossPercent();
            java.lang.String str2 = gainOrLossPercent;
            if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "%", false, 2, (java.lang.Object) null)) {
                    str = gainOrLossPercent;
                } else {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(gainOrLossPercent);
                    sb2.append("%");
                    str = sb2.toString();
                }
            }
            java.lang.String gainOrLossAmount = holding.getGainOrLossAmount();
            java.lang.String str3 = gainOrLossAmount;
            if (str3 == null || kotlin.text.StringsKt.isBlank(str3)) {
                gainOrLossAmount = "0.00";
            }
            return new com.paypal.oslo.feature.cryptocurrency.ui.details.components.CryptoAssetHoldingData(formatPrice$default, obj, str, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(this.Camera2StreamConfigurationMap, gainOrLossAmount, fiatAmountCurrencyCode, null, false, false, 28, null));
        }
        java.lang.String currencyCode = this.getHighResolutionOutputSizeshNQ4ISI.getCurrencyCode();
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.components.CryptoAssetHoldingData(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(this.Camera2StreamConfigurationMap, "0.00", currencyCode, null, false, false, 28, null), "0 ".concat(java.lang.String.valueOf(assetSymbol)), "0.00%", com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(this.Camera2StreamConfigurationMap, "0.00", currencyCode, null, false, false, 28, null));
    }
}
