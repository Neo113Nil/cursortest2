package com.paypal.oslo.feature.debitcard.shared.util;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardDateFormatter;", "", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;", "dateTimeFormatUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;)V", "", "isoDate", "formatToMonthDay", "(Ljava/lang/String;)Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DebitCardDateFormatter {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public DebitCardDateFormatter(com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormatUseCase, "");
        this.getHighSpeedVideoFpsRanges = dateTimeFormatUseCase;
    }

    public final java.lang.String formatToMonthDay(java.lang.String isoDate) {
        java.lang.Object value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isoDate, "");
        if (kotlin.text.StringsKt.isBlank(isoDate)) {
            return null;
        }
        try {
            java.util.Date from = java.util.Date.from(java.time.LocalDate.parse(isoDate).atStartOfDay(java.time.ZoneOffset.UTC).toInstant());
            com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(from);
            arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.lang.String> invoke = dateTimeFormatUseCase.invoke(new com.paypal.oslo.core.i18n.domain.model.DateTime(from, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC), new com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration(new com.paypal.oslo.core.i18n.domain.model.CustomStyle("MMMMd"), java.util.Locale.getDefault()));
            if (invoke instanceof arrow.core.Either.Left) {
                value = null;
            } else {
                if (!(invoke instanceof arrow.core.Either.Right)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                value = ((arrow.core.Either.Right) invoke).getValue();
            }
            return (java.lang.String) value;
        } catch (java.time.format.DateTimeParseException e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.debitcard.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("isoDate", isoDate);
            java.lang.String message = e.getMessage();
            pairArr[1] = kotlin.TuplesKt.to("error", message != null ? message : "");
            com.paypal.android.logger.Logger.w$default(logger, "Failed to parse date string", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            return null;
        }
    }
}
