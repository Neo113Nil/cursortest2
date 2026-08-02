package com.paypal.oslo.feature.activity.domain.base.utils.datetime;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\bJ\u0015\u0010\u0012\u001a\u00020\r*\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u0011*\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeUtils;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange;", "Lkotlin/Pair;", "Ljava/util/Date;", "transformInUTCFormat", "(Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange;)Lkotlin/Pair;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_END_TIME, "Larrow/core/Either;", "", "", "isDateRangeValid", "(Ljava/util/Date;Ljava/util/Date;)Larrow/core/Either;", "getDateRangePairInUTCFormat$activity_prodRelease", "", "checkIsCurrentYear$activity_prodRelease", "(Ljava/lang/String;)Z", "format", "toDisplayDateTimeFormat$activity_prodRelease", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getUTCStringValue$activity_prodRelease", "(Ljava/util/Date;)Ljava/lang/String;", "parseDateForFilterLabel$activity_prodRelease", "parseToUTCDate$activity_prodRelease", "(Ljava/lang/String;)Ljava/util/Date;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DateTimeUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils INSTANCE = new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils();

    private DateTimeUtils() {
    }

    public final kotlin.Pair<java.util.Date, java.util.Date> transformInUTCFormat(com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange dateTimeRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeRange, "");
        if (dateTimeRange instanceof com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.NDays) {
            return getDateRangePairInUTCFormat$activity_prodRelease(new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.NDays(((com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.NDays) dateTimeRange).getRange(), 0, 2, null));
        }
        if (dateTimeRange instanceof com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Month) {
            return getDateRangePairInUTCFormat$activity_prodRelease(new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Month(((com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Month) dateTimeRange).getRange(), 0, 2, null));
        }
        if (dateTimeRange instanceof com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Year) {
            return getDateRangePairInUTCFormat$activity_prodRelease(new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Year(((com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Year) dateTimeRange).getRange(), 0, 2, null));
        }
        if (dateTimeRange instanceof com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.ThisMonth) {
            return com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeFiltersUtils.INSTANCE.getThisMonthDateRangePairUTCFormat$activity_prodRelease(new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.ThisMonth(0, 0, 3, null));
        }
        if (dateTimeRange instanceof com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.PastMonth) {
            return com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeFiltersUtils.INSTANCE.getPastMonthDateRangePairUTCFormat$activity_prodRelease(new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.PastMonth(0, 0, 3, null));
        }
        if (dateTimeRange instanceof com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Past3Month) {
            return com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeFiltersUtils.INSTANCE.getPast3MonthDateRangePairUTCFormat$activity_prodRelease(new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Past3Month(0, 0, 3, null));
        }
        if (!(dateTimeRange instanceof com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.CustomDateRange)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.CustomDateRange customDateRange = (com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.CustomDateRange) dateTimeRange;
        return com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeFiltersUtils.INSTANCE.getCustomDateRangePairUTCFormat$activity_prodRelease(new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.CustomDateRange(customDateRange.getStartDate(), customDateRange.getEndDate(), 0, 0, 12, null));
    }

    public final arrow.core.Either<java.lang.Throwable, java.lang.Boolean> isDateRangeValid(java.util.Date startTime, java.util.Date endTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endTime, "");
        java.util.Date date = new java.util.Date();
        if (!startTime.before(endTime)) {
            return arrow.core.EitherKt.left(new java.lang.IllegalArgumentException(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.START_TIME_BEFORE_END_TIME));
        }
        if (startTime.after(date)) {
            return arrow.core.EitherKt.left(new java.lang.IllegalArgumentException(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.START_TIME_FUTURE_DATE));
        }
        if (endTime.after(date)) {
            return arrow.core.EitherKt.left(new java.lang.IllegalArgumentException(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.END_TIME_FUTURE_DATE));
        }
        return arrow.core.EitherKt.right(java.lang.Boolean.TRUE);
    }

    public final kotlin.Pair<java.util.Date, java.util.Date> getDateRangePairInUTCFormat$activity_prodRelease(com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange dateTimeRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeRange, "");
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
        java.util.Date time = calendar.getTime();
        calendar.add(dateTimeRange.getCalendarIdentifier(), dateTimeRange.getRange());
        return new kotlin.Pair<>(calendar.getTime(), time);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean checkIsCurrentYear$activity_prodRelease(java.lang.String str) {
        int i;
        java.lang.String displayDateTimeFormat$activity_prodRelease;
        if (str != null && (displayDateTimeFormat$activity_prodRelease = toDisplayDateTimeFormat$activity_prodRelease(str, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_YEAR_FORMAT)) != null) {
            if (kotlin.text.StringsKt.isBlank(displayDateTimeFormat$activity_prodRelease)) {
                displayDateTimeFormat$activity_prodRelease = null;
            }
            if (displayDateTimeFormat$activity_prodRelease != null) {
                i = java.lang.Integer.parseInt(displayDateTimeFormat$activity_prodRelease);
                return i != java.time.Year.now().getValue();
            }
        }
        i = -1;
        if (i != java.time.Year.now().getValue()) {
        }
    }

    public final java.lang.String toDisplayDateTimeFormat$activity_prodRelease(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.time.format.DateTimeFormatter ofPattern = java.time.format.DateTimeFormatter.ofPattern(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_UTC_FORMAT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofPattern, "");
        try {
            java.time.OffsetDateTime parse = java.time.OffsetDateTime.parse(str, ofPattern);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "");
            java.time.ZonedDateTime atZoneSameInstant = parse.atZoneSameInstant(java.time.ZoneId.systemDefault());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(atZoneSameInstant, "");
            java.time.format.DateTimeFormatter ofPattern2 = java.time.format.DateTimeFormatter.ofPattern(str2, java.util.Locale.getDefault());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofPattern2, "");
            java.lang.String format = atZoneSameInstant.format(ofPattern2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(format);
            return format;
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.activity.LoggerKt.log, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_MESSAGE_ERROR_DATE_TIME, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_SOURCE, str), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_TARGET_FORMAT, str2), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_UTC_FORMAT, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_UTC_FORMAT)), null, e, 4, null);
            return "";
        }
    }

    public final java.lang.String getUTCStringValue$activity_prodRelease(java.util.Date date) {
        if (date == null) {
            return "";
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_UTC_FORMAT_UTC_Z, java.util.Locale.ENGLISH);
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
        java.lang.String format = simpleDateFormat.format(date);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public static /* synthetic */ java.lang.String parseDateForFilterLabel$activity_prodRelease$default(com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils dateTimeUtils, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_FILTER_LABEL_DATE_FORMAT;
        }
        return dateTimeUtils.parseDateForFilterLabel$activity_prodRelease(str, str2);
    }

    public final java.lang.String parseDateForFilterLabel$activity_prodRelease(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String str3 = str;
        if (str3 == null || kotlin.text.StringsKt.isBlank(str3)) {
            return null;
        }
        try {
            java.time.format.DateTimeFormatter ofPattern = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofPattern, "");
            java.time.format.DateTimeFormatter ofPattern2 = java.time.format.DateTimeFormatter.ofPattern(str2, java.util.Locale.ENGLISH);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofPattern2, "");
            java.time.LocalDate parse = java.time.LocalDate.parse(str, ofPattern);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "");
            return parse.format(ofPattern2);
        } catch (java.time.DateTimeException e) {
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityLogUtils.INSTANCE.logDateParsingException$activity_prodRelease("parseDateForFilterLabel", e);
            return null;
        }
    }

    public final java.util.Date parseToUTCDate$activity_prodRelease(java.lang.String str) {
        try {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.ENGLISH);
            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
            simpleDateFormat.setLenient(false);
            java.lang.String str2 = str;
            if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
                return simpleDateFormat.parse(str);
            }
            return null;
        } catch (java.text.ParseException e) {
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityLogUtils.INSTANCE.logDateParsingException$activity_prodRelease("convertCustomDate", e);
            return null;
        }
    }
}
