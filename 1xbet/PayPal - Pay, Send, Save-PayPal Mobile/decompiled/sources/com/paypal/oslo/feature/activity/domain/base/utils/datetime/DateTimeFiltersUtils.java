package com.paypal.oslo.feature.activity.domain.base.utils.datetime;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeFiltersUtils;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange;", "Ljava/util/Calendar;", "getStartDateOfPastMonthUTC$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange;)Ljava/util/Calendar;", "getLastDayOfMonth$activity_prodRelease", "(Ljava/util/Calendar;)Ljava/util/Calendar;", "Lkotlin/Pair;", "Ljava/util/Date;", "getThisMonthDateRangePairUTCFormat$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange;)Lkotlin/Pair;", "getPastMonthDateRangePairUTCFormat$activity_prodRelease", "getPast3MonthDateRangePairUTCFormat$activity_prodRelease", "Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$CustomDateRange;", "getCustomDateRangePairUTCFormat$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$CustomDateRange;)Lkotlin/Pair;", "getCurrentDateInUTCFormat$activity_prodRelease", "()Ljava/util/Date;", "", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/Calendar;I)Ljava/util/Calendar;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DateTimeFiltersUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeFiltersUtils INSTANCE = new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeFiltersUtils();

    private DateTimeFiltersUtils() {
    }

    public final java.util.Calendar getStartDateOfPastMonthUTC$activity_prodRelease(com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange dateTimeRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeRange, "");
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar, "");
        calendar.add(dateTimeRange.getCalendarIdentifier(), dateTimeRange.getRange());
        return getHighResolutionOutputSizeshNQ4ISI(calendar, 1);
    }

    public final java.util.Calendar getLastDayOfMonth$activity_prodRelease(java.util.Calendar calendar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "");
        calendar.set(5, 1);
        return getHighResolutionOutputSizeshNQ4ISI(calendar, calendar.getActualMaximum(5));
    }

    public final kotlin.Pair<java.util.Date, java.util.Date> getThisMonthDateRangePairUTCFormat$activity_prodRelease(com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange dateTimeRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeRange, "");
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar, "");
        java.util.Date time = calendar.getTime();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(time, "");
        java.util.Date time2 = getHighResolutionOutputSizeshNQ4ISI(calendar, dateTimeRange.getRange()).getTime();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(time2, "");
        return new kotlin.Pair<>(time2, time);
    }

    public final kotlin.Pair<java.util.Date, java.util.Date> getPastMonthDateRangePairUTCFormat$activity_prodRelease(com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange dateTimeRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeRange, "");
        java.util.Calendar startDateOfPastMonthUTC$activity_prodRelease = getStartDateOfPastMonthUTC$activity_prodRelease(dateTimeRange);
        java.util.Date time = getHighResolutionOutputSizeshNQ4ISI(startDateOfPastMonthUTC$activity_prodRelease, 1).getTime();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(time, "");
        java.util.Date time2 = getLastDayOfMonth$activity_prodRelease(startDateOfPastMonthUTC$activity_prodRelease).getTime();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(time2, "");
        return new kotlin.Pair<>(time, time2);
    }

    public final kotlin.Pair<java.util.Date, java.util.Date> getPast3MonthDateRangePairUTCFormat$activity_prodRelease(com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange dateTimeRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeRange, "");
        java.util.Date time = getStartDateOfPastMonthUTC$activity_prodRelease(dateTimeRange).getTime();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(time, "");
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar, "");
        calendar.add(dateTimeRange.getCalendarIdentifier(), -1);
        java.util.Date time2 = getLastDayOfMonth$activity_prodRelease(calendar).getTime();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(time2, "");
        return new kotlin.Pair<>(time, time2);
    }

    public final kotlin.Pair<java.util.Date, java.util.Date> getCustomDateRangePairUTCFormat$activity_prodRelease(com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.CustomDateRange customDateRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customDateRange, "");
        java.util.Date parseToUTCDate$activity_prodRelease = com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils.INSTANCE.parseToUTCDate$activity_prodRelease(customDateRange.getStartDate());
        if (parseToUTCDate$activity_prodRelease == null) {
            parseToUTCDate$activity_prodRelease = com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils.INSTANCE.transformInUTCFormat(new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Year(-3, 0, 2, null)).getFirst();
        }
        java.util.Date parseToUTCDate$activity_prodRelease2 = com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils.INSTANCE.parseToUTCDate$activity_prodRelease(customDateRange.getEndDate());
        if (parseToUTCDate$activity_prodRelease2 == null) {
            parseToUTCDate$activity_prodRelease2 = getCurrentDateInUTCFormat$activity_prodRelease();
        }
        return new kotlin.Pair<>(parseToUTCDate$activity_prodRelease, parseToUTCDate$activity_prodRelease2);
    }

    public final java.util.Date getCurrentDateInUTCFormat$activity_prodRelease() {
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar, "");
        java.util.Date time = calendar.getTime();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(time, "");
        return time;
    }

    private static java.util.Calendar getHighResolutionOutputSizeshNQ4ISI(java.util.Calendar calendar, int i) {
        calendar.set(5, i);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }
}
