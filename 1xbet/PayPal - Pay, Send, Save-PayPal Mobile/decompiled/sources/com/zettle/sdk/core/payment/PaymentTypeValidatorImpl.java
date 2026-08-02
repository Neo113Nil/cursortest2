package com.zettle.sdk.core.payment;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/zettle/sdk/core/payment/PaymentTypeValidatorImpl;", "Lcom/zettle/sdk/core/payment/PaymentTypeValidator;", "Lcom/zettle/android/entities/PaymentType;", "p0", "Lcom/zettle/sdk/core/user/UserModule;", "p1", "<init>", "(Lcom/zettle/android/entities/PaymentType;Lcom/zettle/sdk/core/user/UserModule;)V", "", "Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result;", "validate", "(J)Lcom/zettle/sdk/core/payment/PaymentTypeValidator$Result;", "Camera2StreamConfigurationMap", "Lcom/zettle/android/entities/PaymentType;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/core/user/UserModule;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class PaymentTypeValidatorImpl implements com.zettle.sdk.core.payment.PaymentTypeValidator {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.android.entities.PaymentType getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.core.user.UserModule getHighSpeedVideoFpsRanges;

    public PaymentTypeValidatorImpl(com.zettle.android.entities.PaymentType paymentType, com.zettle.sdk.core.user.UserModule userModule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userModule, "");
        this.getHighSpeedVideoFpsRangesFor = paymentType;
        this.getHighSpeedVideoFpsRanges = userModule;
    }

    @Override // com.zettle.sdk.core.payment.PaymentTypeValidator
    public final com.zettle.sdk.core.payment.PaymentTypeValidator.Result validate(long p0) {
        java.util.Map<com.zettle.sdk.core.user.CurrencyCode, java.util.Map<java.lang.String, com.zettle.sdk.core.user.TransactionConfigEntry>> configByCurrency;
        java.util.Map<java.lang.String, com.zettle.sdk.core.user.TransactionConfigEntry> map;
        com.zettle.sdk.core.user.CurrencyCode currency = this.getHighSpeedVideoFpsRanges.getCurrency();
        if (currency == null) {
            return com.zettle.sdk.core.payment.PaymentTypeValidator.Result.NotAuthenticated.INSTANCE;
        }
        com.zettle.sdk.core.user.userconfig.UserConfig userConfig = this.getHighSpeedVideoFpsRanges.getUserConfig();
        if (userConfig == null || (configByCurrency = userConfig.getConfigByCurrency()) == null || (map = configByCurrency.get(currency)) == null) {
            return com.zettle.sdk.core.payment.PaymentTypeValidator.Result.EmptyConfigurationForCurrency.INSTANCE;
        }
        com.zettle.sdk.core.user.TransactionConfigEntry transactionConfigEntry = map.get(com.zettle.sdk.core.payment.PaymentTypeValidatorKt.access$toConfigKey(this.getHighSpeedVideoFpsRangesFor));
        if (transactionConfigEntry == null) {
            return com.zettle.sdk.core.payment.PaymentTypeValidator.Result.EmptyConfigurationForPaymentType.INSTANCE;
        }
        java.lang.Long minTransactionAmount = transactionConfigEntry.getMinTransactionAmount();
        if (minTransactionAmount != null) {
            if (minTransactionAmount.longValue() <= 0) {
                minTransactionAmount = null;
            }
            if (minTransactionAmount != null) {
                long longValue = minTransactionAmount.longValue();
                java.lang.Long maxTransactionAmount = transactionConfigEntry.getMaxTransactionAmount();
                if (maxTransactionAmount != null) {
                    java.lang.Long l = maxTransactionAmount.longValue() > 0 ? maxTransactionAmount : null;
                    if (l != null) {
                        long longValue2 = l.longValue();
                        if (p0 < longValue) {
                            return new com.zettle.sdk.core.payment.PaymentTypeValidator.Result.BelowMinimum(longValue);
                        }
                        if (p0 > longValue2) {
                            return new com.zettle.sdk.core.payment.PaymentTypeValidator.Result.AboveMaximum(longValue2);
                        }
                        return com.zettle.sdk.core.payment.PaymentTypeValidator.Result.Ok.INSTANCE;
                    }
                }
                return com.zettle.sdk.core.payment.PaymentTypeValidator.Result.EmptyMaximumAmount.INSTANCE;
            }
        }
        return com.zettle.sdk.core.payment.PaymentTypeValidator.Result.EmptyMinimumAmount.INSTANCE;
    }
}
