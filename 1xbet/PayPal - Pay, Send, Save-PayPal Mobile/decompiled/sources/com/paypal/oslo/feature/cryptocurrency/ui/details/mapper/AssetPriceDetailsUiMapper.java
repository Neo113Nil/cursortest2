package com.paypal.oslo.feature.cryptocurrency.ui.details.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/mapper/AssetPriceDetailsUiMapper;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "priceFormatter", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;)V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/AssetPriceDetails;", "input", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/components/AssetPriceDetailsData;", "map", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/AssetPriceDetails;)Lcom/paypal/oslo/feature/cryptocurrency/ui/details/components/AssetPriceDetailsData;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AssetPriceDetailsUiMapper {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public AssetPriceDetailsUiMapper(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoPriceFormatter, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cryptoPriceFormatter;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData map(com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails input) {
        java.lang.String concat;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter = this.getHighResolutionOutputSizeshNQ4ISI;
        boolean z = true;
        java.lang.String format = java.lang.String.format(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(input.getCurrentPrice())}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        java.lang.String formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(cryptoPriceFormatter, format, input.getCurrencyCode(), null, false, false, 28, null);
        java.lang.String format2 = java.lang.String.format("%.2f%%", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(java.lang.Math.abs(input.getPriceChangePercent24h()))}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "");
        com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter2 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String format3 = java.lang.String.format(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(java.lang.Math.abs(input.getPriceChange24h()))}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format3, "");
        java.lang.String formatPrice$default2 = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(cryptoPriceFormatter2, format3, input.getCurrencyCode(), null, false, false, 28, null);
        if (input.getPriceMovementIndicator() != com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator.UP && input.getPriceMovementIndicator() != com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator.CONSTANT) {
            z = false;
        }
        boolean z2 = z;
        if (z2) {
            concat = "↑ +".concat(java.lang.String.valueOf(formatPrice$default2));
        } else {
            concat = "↓ ".concat(java.lang.String.valueOf(formatPrice$default2));
        }
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData(input.getAssetName(), input.getAssetSymbol(), formatPrice$default, format2, concat, z2, input.getLogoUrl(), null);
    }
}
