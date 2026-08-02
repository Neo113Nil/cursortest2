package com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/ValidateSellAmountUseCase;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CryptoAmountValidationProvider;", "amountValidationProvider", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "currencyProvider", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CryptoAmountValidationProvider;Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;)V", "", "amountString", "Ljava/math/BigDecimal;", "holdingsValue", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAmountValidationResult;", "invoke", "(Ljava/lang/String;Ljava/math/BigDecimal;)Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAmountValidationResult;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CryptoAmountValidationProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ValidateSellAmountUseCase {
    public static final int $stable = 0;
    private static final java.math.BigDecimal getHighSpeedVideoSizes = new java.math.BigDecimal("0.10");

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.provider.CryptoAmountValidationProvider getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ValidateSellAmountUseCase(com.paypal.oslo.feature.cryptocurrency.domain.provider.CryptoAmountValidationProvider cryptoAmountValidationProvider, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoAmountValidationProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyProvider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cryptoAmountValidationProvider;
        this.getHighSpeedVideoFpsRanges = currencyProvider;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult invoke(java.lang.String amountString, java.math.BigDecimal holdingsValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holdingsValue, "");
        java.math.BigDecimal minimumSellAmount = this.getHighResolutionOutputSizeshNQ4ISI.getMinimumSellAmount(this.getHighSpeedVideoFpsRanges.getCurrencyCode());
        char decimalSeparator = java.text.DecimalFormatSymbols.getInstance(java.util.Locale.getDefault()).getDecimalSeparator();
        if (kotlin.text.StringsKt.isBlank(amountString) || kotlin.jvm.internal.Intrinsics.areEqual(amountString, java.lang.String.valueOf(decimalSeparator))) {
            return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.BelowMinimum(minimumSellAmount);
        }
        java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(kotlin.text.StringsKt.replace$default(amountString, decimalSeparator, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, false, 4, (java.lang.Object) null));
        if (bigDecimalOrNull == null) {
            return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.BelowMinimum(minimumSellAmount);
        }
        if (bigDecimalOrNull.compareTo(minimumSellAmount) < 0) {
            return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.BelowMinimum(minimumSellAmount);
        }
        java.math.BigDecimal multiply = holdingsValue.multiply(getHighSpeedVideoSizes);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(multiply, "");
        java.math.BigDecimal subtract = holdingsValue.subtract(multiply);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(subtract, "");
        java.math.BigDecimal add = holdingsValue.add(multiply);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(add, "");
        if (bigDecimalOrNull.compareTo(subtract) > 0 && bigDecimalOrNull.compareTo(add) < 0) {
            return com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.NearHoldings.INSTANCE;
        }
        if (bigDecimalOrNull.compareTo(holdingsValue) > 0) {
            return com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.ExceedsHoldings.INSTANCE;
        }
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAmountValidationResult.Valid(bigDecimalOrNull);
    }
}
