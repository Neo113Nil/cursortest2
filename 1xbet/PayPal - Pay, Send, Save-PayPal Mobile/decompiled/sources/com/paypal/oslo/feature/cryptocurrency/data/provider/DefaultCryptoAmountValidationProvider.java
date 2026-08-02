package com.paypal.oslo.feature.cryptocurrency.data.provider;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/data/provider/DefaultCryptoAmountValidationProvider;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CryptoAmountValidationProvider;", "<init>", "()V", "", "currencyCode", "Ljava/math/BigDecimal;", "getMinimumBuyAmount", "(Ljava/lang/String;)Ljava/math/BigDecimal;", "getMinimumSellAmount", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DefaultCryptoAmountValidationProvider implements com.paypal.oslo.feature.cryptocurrency.domain.provider.CryptoAmountValidationProvider {
    public static final int $stable = 0;
    private static final java.math.BigDecimal getHighResolutionOutputSizeshNQ4ISI = new java.math.BigDecimal("1.00");
    private static final java.util.Map<java.lang.String, java.math.BigDecimal> getHighSpeedVideoSizes = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("SGD", new java.math.BigDecimal("1.00")), kotlin.TuplesKt.to("DKK", new java.math.BigDecimal("10.00")), kotlin.TuplesKt.to("TWD", new java.math.BigDecimal("50.00")));

    @javax.inject.Inject
    public DefaultCryptoAmountValidationProvider() {
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.provider.CryptoAmountValidationProvider
    public final java.math.BigDecimal getMinimumBuyAmount(java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        java.math.BigDecimal bigDecimal = getHighSpeedVideoSizes.get(currencyCode);
        return bigDecimal == null ? getHighResolutionOutputSizeshNQ4ISI : bigDecimal;
    }

    @Override // com.paypal.oslo.feature.cryptocurrency.domain.provider.CryptoAmountValidationProvider
    public final java.math.BigDecimal getMinimumSellAmount(java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        java.math.BigDecimal bigDecimal = getHighSpeedVideoSizes.get(currencyCode);
        return bigDecimal == null ? getHighResolutionOutputSizeshNQ4ISI : bigDecimal;
    }
}
