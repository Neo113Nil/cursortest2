package com.paypal.oslo.feature.cryptocurrency.ui.details.mapper;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/mapper/ChartInteractionDataMapper;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "priceFormatter", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "currencyProvider", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;)V", "", "selectedPrice", "firstPrice", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/ChartInteractionData;", "map", "(DD)Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/ChartInteractionData;", "p0", "", "Camera2StreamConfigurationMap", "(D)Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChartInteractionDataMapper {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider getHighSpeedVideoSizes;
    public static final int $stable = 8;

    @javax.inject.Inject
    public ChartInteractionDataMapper(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoPriceFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyProvider, "");
        this.Camera2StreamConfigurationMap = cryptoPriceFormatter;
        this.getHighSpeedVideoSizes = currencyProvider;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData map(double selectedPrice, double firstPrice) {
        java.lang.String concat;
        java.lang.String currencyCode = this.getHighSpeedVideoSizes.getCurrencyCode();
        double d = selectedPrice - firstPrice;
        boolean z = d >= 0.0d;
        double d2 = firstPrice != 0.0d ? (d / firstPrice) * 100.0d : 0.0d;
        java.lang.String formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(this.Camera2StreamConfigurationMap, Camera2StreamConfigurationMap(selectedPrice), currencyCode, null, false, false, 28, null);
        java.lang.String format = java.lang.String.format(java.util.Locale.getDefault(), "%.2f%%", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(java.lang.Math.abs(d2))}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        java.lang.String formatPrice$default2 = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(this.Camera2StreamConfigurationMap, Camera2StreamConfigurationMap(java.lang.Math.abs(d)), currencyCode, null, false, false, 28, null);
        if (z) {
            concat = "↑ +".concat(java.lang.String.valueOf(formatPrice$default2));
        } else {
            concat = "↓ ".concat(java.lang.String.valueOf(formatPrice$default2));
        }
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData(formatPrice$default, concat, format, z);
    }

    private static java.lang.String Camera2StreamConfigurationMap(double p0) {
        java.lang.String format = java.lang.String.format(java.util.Locale.US, com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(p0)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
