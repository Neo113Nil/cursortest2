package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/FormatNumberUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "localeResolverCache", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;)V", "Ljava/math/BigDecimal;", "number", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/NumberFormatError;", "", "invoke", "(Ljava/math/BigDecimal;)Larrow/core/Either;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FormatNumberUseCase {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache getHighSpeedVideoSizes;

    @javax.inject.Inject
    public FormatNumberUseCase(com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverCache, "");
        this.getHighSpeedVideoSizes = localeResolverCache;
    }

    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.NumberFormatError, java.lang.String> invoke(java.math.BigDecimal number) {
        arrow.core.Either right;
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.I18nError, java.util.Locale> formatLocale = this.getHighSpeedVideoSizes.getFormatLocale();
            if (formatLocale instanceof arrow.core.Either.Left) {
                right = new arrow.core.Either.Left(new com.paypal.oslo.core.i18n.domain.error.NumberFormatError.LocaleResolutionError("Failed to get format locale"));
            } else {
                if (!(formatLocale instanceof arrow.core.Either.Right)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                right = new arrow.core.Either.Right(((arrow.core.Either.Right) formatLocale).getValue());
            }
            java.util.Locale locale = (java.util.Locale) defaultRaise2.bind(right);
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.text.NumberFormat numberInstance = java.text.NumberFormat.getNumberInstance(locale);
                int scale = number.scale();
                if (scale > 0) {
                    int min = java.lang.Math.min(scale, numberInstance.getMaximumFractionDigits());
                    numberInstance.setMinimumFractionDigits(min);
                    numberInstance.setMaximumFractionDigits(min);
                }
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(numberInstance.format(number));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
            if (m23439exceptionOrNullimpl != null) {
                java.lang.String message = m23439exceptionOrNullimpl.getMessage();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to format number: ");
                sb.append(message);
                defaultRaise2.raise(new com.paypal.oslo.core.i18n.domain.error.NumberFormatError.FormatError(sb.toString()));
                throw new kotlin.KotlinNothingValueException();
            }
            defaultRaise.complete();
            return new arrow.core.Either.Right((java.lang.String) m23436constructorimpl);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th2) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
        }
    }
}
