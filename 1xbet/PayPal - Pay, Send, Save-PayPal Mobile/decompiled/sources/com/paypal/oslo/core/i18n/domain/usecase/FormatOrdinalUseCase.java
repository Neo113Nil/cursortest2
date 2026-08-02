package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/FormatOrdinalUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "localeResolverCache", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;)V", "", "number", "Ljava/util/Locale;", "locale", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/OrdinalFormatError;", "", "invoke", "(ILjava/util/Locale;)Larrow/core/Either;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FormatOrdinalUseCase {
    private static final com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase.Companion Companion = new com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public FormatOrdinalUseCase(com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverCache, "");
        this.getHighSpeedVideoFpsRanges = localeResolverCache;
    }

    public static /* synthetic */ arrow.core.Either invoke$default(com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase formatOrdinalUseCase, int i, java.util.Locale locale, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            locale = null;
        }
        return formatOrdinalUseCase.invoke(i, locale);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/FormatOrdinalUseCase$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.OrdinalFormatError, java.lang.String> invoke(int number, java.util.Locale locale) {
        java.lang.String str;
        arrow.core.Either right;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            com.paypal.android.logger.Logger logger = com.paypal.oslo.core.i18n.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("number", java.lang.Integer.valueOf(number));
            if (locale == null || (str = locale.toString()) == null) {
                str = "null";
            }
            pairArr[1] = kotlin.TuplesKt.to("customLocale", str);
            com.paypal.android.logger.Logger.d$default(logger, "Formatting ordinal number", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            if (locale == null) {
                arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.I18nError, java.util.Locale> formatLocale = this.getHighSpeedVideoFpsRanges.getFormatLocale();
                if (formatLocale instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.core.i18n.domain.error.I18nError i18nError = (com.paypal.oslo.core.i18n.domain.error.I18nError) ((arrow.core.Either.Left) formatLocale).getValue();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to get format locale: ");
                    sb.append(i18nError);
                    right = new arrow.core.Either.Left(new com.paypal.oslo.core.i18n.domain.error.OrdinalFormatError.LocaleResolutionError(sb.toString()));
                } else {
                    if (!(formatLocale instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) formatLocale).getValue());
                }
                locale = (java.util.Locale) defaultRaise2.bind(right);
            }
            java.lang.String format = new android.icu.text.MessageFormat("{0,ordinal}", locale).format(new java.lang.Integer[]{java.lang.Integer.valueOf(number)});
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Successfully formatted ordinal number", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("number", java.lang.Integer.valueOf(number)), kotlin.TuplesKt.to("locale", locale.toString()), kotlin.TuplesKt.to("result", format)), null, 4, null);
            defaultRaise.complete();
            return new arrow.core.Either.Right(format);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
