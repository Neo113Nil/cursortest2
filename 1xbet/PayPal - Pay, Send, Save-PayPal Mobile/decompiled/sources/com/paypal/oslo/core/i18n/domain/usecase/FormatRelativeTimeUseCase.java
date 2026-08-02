package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B$\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0011\u0010\u0007\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0017\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/FormatRelativeTimeUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "localeResolverCache", "", "Lcom/paypal/oslo/core/i18n/domain/strategy/RelativeTimeFormattingStrategy;", "Lkotlin/jvm/JvmSuppressWildcards;", "strategies", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;Ljava/util/Set;)V", "Lcom/paypal/oslo/core/i18n/domain/model/DateTime;", "dateTime", "Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimeError;", "", "invoke", "(Lcom/paypal/oslo/core/i18n/domain/model/DateTime;Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeConfiguration;)Larrow/core/Either;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "getHighSpeedVideoSizes", "Ljava/util/Set;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FormatRelativeTimeUseCase {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Set<com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormattingStrategy> getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public FormatRelativeTimeUseCase(com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, java.util.Set<com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormattingStrategy> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.getHighSpeedVideoSizes = localeResolverCache;
        this.getHighResolutionOutputSizeshNQ4ISI = set;
    }

    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.lang.String> invoke(com.paypal.oslo.core.i18n.domain.model.DateTime dateTime, com.paypal.oslo.core.i18n.domain.model.RelativeTimeConfiguration configuration) {
        arrow.core.Either left;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "FormatRelativeTime UseCase invoked", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("configurationUnit", configuration.getUnit()), kotlin.TuplesKt.to("configurationStyle", configuration.getStyle())), null, 4, null);
        java.util.Locale locale = configuration.getLocale();
        if (locale == null) {
            locale = this.getHighSpeedVideoSizes.getUserLocale().getOrNull();
        }
        java.lang.String timeZone = dateTime.getTimeZone();
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, android.icu.util.TimeZone> validateTimezone = com.paypal.oslo.core.i18n.domain.util.DateTimeUtilKt.validateTimezone(timeZone);
        if (validateTimezone instanceof arrow.core.Either.Right) {
            if (locale == null) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Failed to resolve locale for relative time formatting", null, null, null, 14, null);
                left = arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.UNKNOWN_ERROR);
            } else {
                left = arrow.core.EitherKt.right(com.paypal.oslo.core.i18n.domain.util.RelativeTimeUtilKt.toICULocale(locale));
            }
        } else if (validateTimezone instanceof arrow.core.Either.Left) {
            com.paypal.oslo.core.i18n.domain.model.DateTimeError dateTimeError = (com.paypal.oslo.core.i18n.domain.model.DateTimeError) ((arrow.core.Either.Left) validateTimezone).getValue();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Invalid timezone", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("timezone", timeZone)), null, 4, null);
            left = arrow.core.EitherKt.left(dateTimeError);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (left instanceof arrow.core.Either.Left) {
            return arrow.core.EitherKt.left((com.paypal.oslo.core.i18n.domain.model.DateTimeError) ((arrow.core.Either.Left) left).getValue());
        }
        if (left instanceof arrow.core.Either.Right) {
            android.icu.util.ULocale uLocale = (android.icu.util.ULocale) ((arrow.core.Either.Right) left).getValue();
            for (com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormattingStrategy relativeTimeFormattingStrategy : this.getHighResolutionOutputSizeshNQ4ISI) {
                if (relativeTimeFormattingStrategy.canHandle(configuration.getUnit())) {
                    java.time.ZoneId of = java.time.ZoneId.of(dateTime.getTimeZone());
                    java.time.ZonedDateTime ofInstant = java.time.ZonedDateTime.ofInstant(dateTime.getDate().toInstant(), of);
                    java.time.ZonedDateTime ofInstant2 = java.time.ZonedDateTime.ofInstant(java.time.Instant.now(), of);
                    android.icu.text.RelativeDateTimeFormatter relativeDateTimeFormatter = android.icu.text.RelativeDateTimeFormatter.getInstance(uLocale, null, com.paypal.oslo.core.i18n.domain.util.RelativeTimeUtilKt.toICU(configuration.getStyle()), android.icu.text.DisplayContext.CAPITALIZATION_NONE);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(ofInstant);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(ofInstant2);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(relativeDateTimeFormatter);
                    java.lang.String format = relativeTimeFormattingStrategy.format(new com.paypal.oslo.core.i18n.domain.model.RelativeTimeFormattingRequest(ofInstant, ofInstant2, relativeDateTimeFormatter, configuration.getStyle(), uLocale, configuration.getUnit()));
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Successfully formatted relative time", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("unit", configuration.getUnit().name()), kotlin.TuplesKt.to(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, configuration.getStyle().name())), null, 4, null);
                    return arrow.core.EitherKt.right(format);
                }
            }
            throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
