package com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/ValidateBuyAmountUseCase;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CryptoAmountValidationProvider;", "amountValidationProvider", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "currencyProvider", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CryptoAmountValidationProvider;Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;)V", "", "amountString", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/BuyAmountValidationResult;", "invoke", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/BuyAmountValidationResult;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CryptoAmountValidationProvider;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ValidateBuyAmountUseCase {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.cryptocurrency.domain.provider.CryptoAmountValidationProvider Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ValidateBuyAmountUseCase(com.paypal.oslo.feature.cryptocurrency.domain.provider.CryptoAmountValidationProvider cryptoAmountValidationProvider, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoAmountValidationProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyProvider, "");
        this.Camera2StreamConfigurationMap = cryptoAmountValidationProvider;
        this.getHighSpeedVideoSizes = currencyProvider;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.BuyAmountValidationResult invoke(java.lang.String amountString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountString, "");
        java.math.BigDecimal minimumBuyAmount = this.Camera2StreamConfigurationMap.getMinimumBuyAmount(this.getHighSpeedVideoSizes.getCurrencyCode());
        char decimalSeparator = java.text.DecimalFormatSymbols.getInstance(java.util.Locale.getDefault()).getDecimalSeparator();
        if (kotlin.text.StringsKt.isBlank(amountString) || kotlin.jvm.internal.Intrinsics.areEqual(amountString, java.lang.String.valueOf(decimalSeparator))) {
            return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.BuyAmountValidationResult.BelowMinimum(minimumBuyAmount);
        }
        java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(kotlin.text.StringsKt.replace$default(amountString, decimalSeparator, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, false, 4, (java.lang.Object) null));
        if (bigDecimalOrNull == null) {
            return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.BuyAmountValidationResult.BelowMinimum(minimumBuyAmount);
        }
        if (bigDecimalOrNull.compareTo(minimumBuyAmount) < 0) {
            return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.BuyAmountValidationResult.BelowMinimum(minimumBuyAmount);
        }
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.BuyAmountValidationResult.Valid(bigDecimalOrNull);
    }
}
