package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAmountUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "localeResolverCache", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatNumberUseCase;", "formatNumberUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatNumberUseCase;)V", "Ljava/math/BigDecimal;", "amount", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError;", "", "invoke", "(Ljava/math/BigDecimal;Lcom/paypal/oslo/core/i18n/domain/model/CurrencyConfiguration;)Larrow/core/Either;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatNumberUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FormatAmountUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatNumberUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public FormatAmountUseCase(com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, com.paypal.oslo.core.i18n.domain.usecase.FormatNumberUseCase formatNumberUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatNumberUseCase, "");
        this.getHighSpeedVideoFpsRanges = localeResolverCache;
        this.getHighResolutionOutputSizeshNQ4ISI = formatNumberUseCase;
    }

    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.CurrencyError, java.lang.String> invoke(java.math.BigDecimal amount, com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration configuration) {
        arrow.core.Either right;
        java.lang.Object m23436constructorimpl;
        int digits;
        arrow.core.Either right2;
        com.paypal.oslo.core.i18n.domain.model.CurrencyError.FormatError formatError;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.I18nError, java.util.Locale> formatLocale = this.getHighSpeedVideoFpsRanges.getFormatLocale();
            if (formatLocale instanceof arrow.core.Either.Left) {
                com.paypal.oslo.core.i18n.domain.error.I18nError i18nError = (com.paypal.oslo.core.i18n.domain.error.I18nError) ((arrow.core.Either.Left) formatLocale).getValue();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to get format locale: ");
                sb.append(i18nError);
                right = new arrow.core.Either.Left(new com.paypal.oslo.core.i18n.domain.model.CurrencyError.LocaleResolutionError(sb.toString()));
            } else {
                if (!(formatLocale instanceof arrow.core.Either.Right)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                right = new arrow.core.Either.Right(((arrow.core.Either.Right) formatLocale).getValue());
            }
            java.util.Locale locale = (java.util.Locale) defaultRaise2.bind(right);
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.util.Currency.getInstance(configuration.m11393getCurrencyCodehkTgrg()));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) != null) {
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Invalid currency code", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currencyCode", configuration.m11393getCurrencyCodehkTgrg())), null, 4, null);
                java.lang.String m11393getCurrencyCodehkTgrg = configuration.m11393getCurrencyCodehkTgrg();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid currency code: ");
                sb2.append(m11393getCurrencyCodehkTgrg);
                defaultRaise2.raise(new com.paypal.oslo.core.i18n.domain.model.CurrencyError.FormatError(sb2.toString()));
                throw new kotlin.KotlinNothingValueException();
            }
            java.text.NumberFormat currencyInstance = java.text.NumberFormat.getCurrencyInstance(locale);
            currencyInstance.setCurrency((java.util.Currency) m23436constructorimpl);
            if (configuration.getDigits() == -1) {
                digits = currencyInstance.getMaximumFractionDigits();
            } else {
                digits = configuration.getDigits();
            }
            int scale = configuration.getScale().getScale();
            java.math.BigDecimal pow = java.math.BigDecimal.TEN.pow(scale);
            if (scale > 0) {
                amount = amount.divide(pow, digits, java.math.RoundingMode.HALF_UP);
            }
            java.math.BigDecimal scale2 = amount.setScale(digits, java.math.RoundingMode.HALF_UP);
            com.paypal.oslo.core.i18n.domain.usecase.FormatNumberUseCase formatNumberUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(scale2);
            arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.NumberFormatError, java.lang.String> invoke = formatNumberUseCase.invoke(scale2);
            if (invoke instanceof arrow.core.Either.Left) {
                com.paypal.oslo.core.i18n.domain.error.NumberFormatError numberFormatError = (com.paypal.oslo.core.i18n.domain.error.NumberFormatError) ((arrow.core.Either.Left) invoke).getValue();
                if (numberFormatError instanceof com.paypal.oslo.core.i18n.domain.error.NumberFormatError.LocaleResolutionError) {
                    formatError = new com.paypal.oslo.core.i18n.domain.model.CurrencyError.LocaleResolutionError(((com.paypal.oslo.core.i18n.domain.error.NumberFormatError.LocaleResolutionError) numberFormatError).getDescription());
                } else {
                    if (!(numberFormatError instanceof com.paypal.oslo.core.i18n.domain.error.NumberFormatError.FormatError)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    formatError = new com.paypal.oslo.core.i18n.domain.model.CurrencyError.FormatError(((com.paypal.oslo.core.i18n.domain.error.NumberFormatError.FormatError) numberFormatError).getDescription());
                }
                right2 = new arrow.core.Either.Left(formatError);
            } else {
                if (!(invoke instanceof arrow.core.Either.Right)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                right2 = new arrow.core.Either.Right(((arrow.core.Either.Right) invoke).getValue());
            }
            java.lang.String str = (java.lang.String) defaultRaise2.bind(right2);
            defaultRaise.complete();
            return new arrow.core.Either.Right(str);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th2) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
        }
    }
}
