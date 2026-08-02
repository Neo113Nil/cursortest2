package com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/mapper/HoldingsToAssetSelectionUiItemMapper;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "cryptoPriceFormatter", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoGainLossFormatter;", "cryptoGainLossFormatter", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoGainLossFormatter;)V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHolding;", "input", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionUiItem;", "map", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHolding;)Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionUiItem;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoGainLossFormatter;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HoldingsToAssetSelectionUiItemMapper {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoGainLossFormatter getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public HoldingsToAssetSelectionUiItemMapper(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoGainLossFormatter cryptoGainLossFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoPriceFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoGainLossFormatter, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cryptoPriceFormatter;
        this.getHighSpeedVideoFpsRangesFor = cryptoGainLossFormatter;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiItem map(com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding input) {
        java.lang.String assetSymbol;
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.String assetSymbol2 = input.getAssetSymbol();
        java.lang.String assetName = input.getAssetName();
        if (kotlin.jvm.internal.Intrinsics.areEqual(input.getAssetSymbol(), "PYUSD")) {
            assetSymbol = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(this.getHighResolutionOutputSizeshNQ4ISI, input.getFiatPriceValue(), input.getFiatAmountCurrencyCode(), null, false, false, 28, null);
        } else {
            assetSymbol = input.getAssetSymbol();
        }
        java.lang.String str = assetSymbol;
        java.lang.String logoUrl = input.getLogoUrl();
        java.lang.String formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(this.getHighResolutionOutputSizeshNQ4ISI, input.getFiatAmountValue(), input.getFiatAmountCurrencyCode(), null, false, false, 28, null);
        if (kotlin.jvm.internal.Intrinsics.areEqual(input.getAssetSymbol(), "PYUSD")) {
            java.lang.String format = this.getHighSpeedVideoFpsRangesFor.format(input);
            obj = format != null ? format : "";
        } else {
            java.lang.String assetQuantity = input.getAssetQuantity();
            java.lang.String assetSymbol3 = input.getAssetSymbol();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(assetQuantity);
            sb.append(" ");
            sb.append(assetSymbol3);
            obj = sb.toString();
        }
        return new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionUiItem(assetSymbol2, logoUrl, assetName, str, formatPrice$default, obj, null, null, 128, null);
    }
}
