package com.paypal.oslo.feature.cryptocurrency.ui.common.formatter;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/ExchangeRateFormatter;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "cryptoPriceFormatter", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;)V", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;", "assetPrice", "formatExchangeRate", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/Money;)Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExchangeRateFormatter {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ExchangeRateFormatter(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoPriceFormatter, "");
        this.getHighSpeedVideoFpsRanges = cryptoPriceFormatter;
    }

    public final java.lang.String formatExchangeRate(java.lang.String assetSymbol, com.paypal.oslo.feature.cryptocurrency.domain.model.common.Money assetPrice) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetPrice, "");
        java.lang.String formatPrice$default = com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter.formatPrice$default(this.getHighSpeedVideoFpsRanges, assetPrice.getValue(), assetPrice.getCurrencyCode(), null, false, false, 28, null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("1 ");
        sb.append(assetSymbol);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
        sb.append(formatPrice$default);
        return sb.toString();
    }
}
