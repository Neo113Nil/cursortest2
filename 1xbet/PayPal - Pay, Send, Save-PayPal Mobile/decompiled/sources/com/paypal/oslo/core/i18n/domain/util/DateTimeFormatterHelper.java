package com.paypal.oslo.core.i18n.domain.util;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/util/DateTimeFormatterHelper;", "", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "localeResolverCache", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;)V", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimeConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "", "timeZone", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimeError;", "Landroid/icu/text/SimpleDateFormat;", "createFormatter", "(Lcom/paypal/oslo/core/i18n/domain/model/DateTimeConfiguration;Ljava/lang/String;)Larrow/core/Either;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DateTimeFormatterHelper {
    private final com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public DateTimeFormatterHelper(com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverCache, "");
        this.getHighSpeedVideoFpsRanges = localeResolverCache;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
    
        if (r4 != null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, android.icu.text.SimpleDateFormat> createFormatter(com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration configuration, java.lang.String timeZone) {
        arrow.core.Either either;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        java.util.Locale locale = configuration.getLocale();
        if (locale == null) {
            arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.I18nError, java.util.Locale> userLocale = this.getHighSpeedVideoFpsRanges.getUserLocale();
            if (userLocale instanceof arrow.core.Either.Left) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Locale resolution from cache failed for formatter creation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cacheError", (com.paypal.oslo.core.i18n.domain.error.I18nError) ((arrow.core.Either.Left) userLocale).getValue())), null, null, 12, null);
                return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.UNKNOWN_ERROR);
            }
            if (!(userLocale instanceof arrow.core.Either.Right)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            locale = (java.util.Locale) ((arrow.core.Either.Right) userLocale).getValue();
        }
        arrow.core.Either validateTimezone = com.paypal.oslo.core.i18n.domain.util.DateTimeUtilKt.validateTimezone(timeZone);
        if (!(validateTimezone instanceof arrow.core.Either.Right)) {
            if (validateTimezone instanceof arrow.core.Either.Left) {
                return validateTimezone;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        android.icu.util.TimeZone timeZone2 = (android.icu.util.TimeZone) ((arrow.core.Either.Right) validateTimezone).getValue();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Resolving pattern", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("formatType", configuration.getDateFormat()), kotlin.TuplesKt.to("locale", locale)), null, 4, null);
        com.paypal.oslo.core.i18n.domain.model.DateFormat dateFormat = configuration.getDateFormat();
        if (dateFormat instanceof com.paypal.oslo.core.i18n.domain.model.CustomStyle) {
            java.lang.String bestPattern = android.icu.text.DateTimePatternGenerator.getInstance(locale).getBestPattern(((com.paypal.oslo.core.i18n.domain.model.CustomStyle) dateFormat).getPattern());
            if (bestPattern != null) {
                if (bestPattern.length() <= 0) {
                    bestPattern = null;
                }
                if (bestPattern != null) {
                    arrow.core.Either right = arrow.core.EitherKt.right(bestPattern);
                    either = right;
                }
            }
            either = arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.INVALID_PATTERN);
        } else if (dateFormat instanceof com.paypal.oslo.core.i18n.domain.model.DateTimeStyle) {
            either = com.paypal.oslo.core.i18n.domain.util.DateTimeUtilKt.resolveDefaultStylePattern(((com.paypal.oslo.core.i18n.domain.model.DateTimeStyle) dateFormat).getPattern(), locale);
        } else {
            if (!(dateFormat instanceof com.paypal.oslo.core.i18n.domain.model.DateMaskStyle)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            either = com.paypal.oslo.core.i18n.domain.util.DateTimeUtilKt.resolveDefaultStylePattern(((com.paypal.oslo.core.i18n.domain.model.DateMaskStyle) dateFormat).getPattern(), locale);
        }
        if (either.isLeft()) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Pattern resolution failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", (com.paypal.oslo.core.i18n.domain.model.DateTimeError) ((arrow.core.Either.Left) either).getValue()), kotlin.TuplesKt.to(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, configuration.getDateFormat()), kotlin.TuplesKt.to("locale", locale), kotlin.TuplesKt.to("timezone", timeZone2)), null, null, 12, null);
        }
        if (either instanceof arrow.core.Either.Right) {
            android.icu.text.SimpleDateFormat simpleDateFormat = new android.icu.text.SimpleDateFormat((java.lang.String) ((arrow.core.Either.Right) either).getValue(), locale);
            simpleDateFormat.setTimeZone(timeZone2);
            return new arrow.core.Either.Right(simpleDateFormat);
        }
        if (either instanceof arrow.core.Either.Left) {
            return either;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
