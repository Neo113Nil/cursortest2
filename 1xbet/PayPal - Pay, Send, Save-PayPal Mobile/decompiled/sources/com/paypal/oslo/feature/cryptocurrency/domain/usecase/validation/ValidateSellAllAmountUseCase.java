package com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/ValidateSellAllAmountUseCase;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CryptoAmountValidationProvider;", "amountValidationProvider", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "currencyProvider", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CryptoAmountValidationProvider;Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;)V", "", "holdingsValue", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAllAmountValidationResult;", "invoke", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/validation/SellAllAmountValidationResult;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CryptoAmountValidationProvider;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cryptocurrency/domain/provider/CurrencyProvider;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ValidateSellAllAmountUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.provider.CryptoAmountValidationProvider getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ValidateSellAllAmountUseCase(com.paypal.oslo.feature.cryptocurrency.domain.provider.CryptoAmountValidationProvider cryptoAmountValidationProvider, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoAmountValidationProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyProvider, "");
        this.getHighSpeedVideoSizes = cryptoAmountValidationProvider;
        this.getHighSpeedVideoFpsRanges = currencyProvider;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAllAmountValidationResult invoke(java.lang.String holdingsValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holdingsValue, "");
        java.math.BigDecimal minimumSellAmount = this.getHighSpeedVideoSizes.getMinimumSellAmount(this.getHighSpeedVideoFpsRanges.getCurrencyCode());
        java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(holdingsValue);
        if (bigDecimalOrNull == null) {
            bigDecimalOrNull = java.math.BigDecimal.ZERO;
        }
        if (bigDecimalOrNull.compareTo(minimumSellAmount) < 0) {
            return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAllAmountValidationResult.BelowMinimum(minimumSellAmount);
        }
        return com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.SellAllAmountValidationResult.Valid.INSTANCE;
    }
}
