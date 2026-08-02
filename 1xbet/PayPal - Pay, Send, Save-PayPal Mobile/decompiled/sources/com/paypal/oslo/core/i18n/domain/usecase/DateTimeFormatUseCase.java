package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/util/DateTimeFormatterHelper;", "dateTimeFormatterHelper", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/util/DateTimeFormatterHelper;)V", "Lcom/paypal/oslo/core/i18n/domain/model/DateTime;", "dateTime", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimeConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimeError;", "", "invoke", "(Lcom/paypal/oslo/core/i18n/domain/model/DateTime;Lcom/paypal/oslo/core/i18n/domain/model/DateTimeConfiguration;)Larrow/core/Either;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/util/DateTimeFormatterHelper;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DateTimeFormatUseCase {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.util.DateTimeFormatterHelper Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public DateTimeFormatUseCase(com.paypal.oslo.core.i18n.domain.util.DateTimeFormatterHelper dateTimeFormatterHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormatterHelper, "");
        this.Camera2StreamConfigurationMap = dateTimeFormatterHelper;
    }

    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.lang.String> invoke(com.paypal.oslo.core.i18n.domain.model.DateTime dateTime, com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration configuration) {
        arrow.core.Either left;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.i18n.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to("timezone", dateTime.getTimeZone());
        pairArr[1] = kotlin.TuplesKt.to(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, configuration.getDateFormat());
        java.util.Locale locale = configuration.getLocale();
        pairArr[2] = kotlin.TuplesKt.to("locale", locale != null ? locale.getLanguage() : null);
        com.paypal.android.logger.Logger.i$default(logger, "DateTimeFormat UseCase invoked", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        arrow.core.Either createFormatter = this.Camera2StreamConfigurationMap.createFormatter(configuration, dateTime.getTimeZone());
        if (createFormatter instanceof arrow.core.Either.Right) {
            android.icu.text.SimpleDateFormat simpleDateFormat = (android.icu.text.SimpleDateFormat) ((arrow.core.Either.Right) createFormatter).getValue();
            arrow.core.Either.Companion companion = arrow.core.Either.INSTANCE;
            try {
                left = new arrow.core.Either.Right(simpleDateFormat.format(dateTime.getDate()));
            } catch (java.lang.Throwable th) {
                left = new arrow.core.Either.Left(arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th));
            }
            arrow.core.Either either = left;
            if (either instanceof arrow.core.Either.Left) {
                com.paypal.oslo.core.i18n.LoggerKt.log.e("DateTime formatting failed", (java.lang.Throwable) ((arrow.core.Either.Left) either).getValue());
                return new arrow.core.Either.Left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.INVALID_PATTERN);
            }
            if (either instanceof arrow.core.Either.Right) {
                return new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (createFormatter instanceof arrow.core.Either.Left) {
            return createFormatter;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
