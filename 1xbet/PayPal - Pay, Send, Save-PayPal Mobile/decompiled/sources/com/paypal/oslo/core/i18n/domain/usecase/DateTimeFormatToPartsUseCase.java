package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatToPartsUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/util/DateTimeFormatterHelper;", "dateTimeFormatterHelper", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/util/DateTimeFormatterHelper;)V", "Lcom/paypal/oslo/core/i18n/domain/model/DateTime;", "dateTime", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimeConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimeError;", "", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimePart;", "invoke", "(Lcom/paypal/oslo/core/i18n/domain/model/DateTime;Lcom/paypal/oslo/core/i18n/domain/model/DateTimeConfiguration;)Larrow/core/Either;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/i18n/domain/util/DateTimeFormatterHelper;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DateTimeFormatToPartsUseCase {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.util.DateTimeFormatterHelper getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public DateTimeFormatToPartsUseCase(com.paypal.oslo.core.i18n.domain.util.DateTimeFormatterHelper dateTimeFormatterHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormatterHelper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = dateTimeFormatterHelper;
    }

    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.util.List<com.paypal.oslo.core.i18n.domain.model.DateTimePart>> invoke(com.paypal.oslo.core.i18n.domain.model.DateTime dateTime, com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration configuration) {
        arrow.core.Either left;
        arrow.core.Either.Right right;
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.util.List<com.paypal.oslo.core.i18n.domain.model.DateTimePart>> right2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.i18n.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to("timezone", dateTime.getTimeZone());
        pairArr[1] = kotlin.TuplesKt.to(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, configuration.getDateFormat());
        java.util.Locale locale = configuration.getLocale();
        pairArr[2] = kotlin.TuplesKt.to("locale", locale != null ? locale.toString() : null);
        com.paypal.android.logger.Logger.i$default(logger, "DateTimeFormatToParts UseCase invoked", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        arrow.core.Either createFormatter = this.getHighResolutionOutputSizeshNQ4ISI.createFormatter(configuration, dateTime.getTimeZone());
        if (createFormatter instanceof arrow.core.Either.Right) {
            java.text.AttributedCharacterIterator formatToCharacterIterator = ((android.icu.text.SimpleDateFormat) ((arrow.core.Either.Right) createFormatter).getValue()).formatToCharacterIterator(dateTime.getDate());
            arrow.core.Either.Companion companion = arrow.core.Either.INSTANCE;
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNull(formatToCharacterIterator);
                left = new arrow.core.Either.Right(com.paypal.oslo.core.i18n.domain.util.DateTimeUtilKt.extractDateTimeParts(formatToCharacterIterator));
            } catch (java.lang.Throwable th) {
                left = new arrow.core.Either.Left(arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th));
            }
            arrow.core.Either either = left;
            if (either instanceof arrow.core.Either.Left) {
                com.paypal.oslo.core.i18n.LoggerKt.log.e("DateTime format to parts failed", (java.lang.Throwable) ((arrow.core.Either.Left) either).getValue());
                right = new arrow.core.Either.Left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.INVALID_PATTERN);
            } else {
                if (!(either instanceof arrow.core.Either.Right)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
            }
            if (right instanceof arrow.core.Either.Right) {
                java.util.List list = (java.util.List) ((arrow.core.Either.Right) right).getValue();
                java.util.List list2 = list.isEmpty() ? null : list;
                if (list2 != null && (right2 = arrow.core.EitherKt.right(list2)) != null) {
                    return right2;
                }
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.i18n.LoggerKt.log, "DateTime parts list is empty", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("timezone", dateTime.getTimeZone()), kotlin.TuplesKt.to(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, configuration.getDateFormat())), null, 4, null);
                return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.INVALID_PATTERN);
            }
            if (right instanceof arrow.core.Either.Left) {
                return right;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (createFormatter instanceof arrow.core.Either.Left) {
            return createFormatter;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
