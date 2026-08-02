package com.google.android.material.datepicker;

/* loaded from: classes8.dex */
class DateStrings {
    private DateStrings() {
    }

    static java.lang.String getYearMonth(long j) {
        return com.google.android.material.datepicker.UtcDates.getYearMonthFormat(java.util.Locale.getDefault()).format(new java.util.Date(j));
    }

    static java.lang.String getYearMonthDay(long j) {
        return getYearMonthDay(j, java.util.Locale.getDefault());
    }

    static java.lang.String getYearMonthDay(long j, java.util.Locale locale) {
        return com.google.android.material.datepicker.UtcDates.getYearAbbrMonthDayFormat(locale).format(new java.util.Date(j));
    }

    static java.lang.String getMonthDay(long j) {
        return getMonthDay(j, java.util.Locale.getDefault());
    }

    static java.lang.String getMonthDay(long j, java.util.Locale locale) {
        return com.google.android.material.datepicker.UtcDates.getAbbrMonthDayFormat(locale).format(new java.util.Date(j));
    }

    static java.lang.String getMonthDayOfWeekDay(long j) {
        return getMonthDayOfWeekDay(j, java.util.Locale.getDefault());
    }

    static java.lang.String getMonthDayOfWeekDay(long j, java.util.Locale locale) {
        return com.google.android.material.datepicker.UtcDates.getMonthWeekdayDayFormat(locale).format(new java.util.Date(j));
    }

    static java.lang.String getYearMonthDayOfWeekDay(long j) {
        return getYearMonthDayOfWeekDay(j, java.util.Locale.getDefault());
    }

    static java.lang.String getYearMonthDayOfWeekDay(long j, java.util.Locale locale) {
        return com.google.android.material.datepicker.UtcDates.getYearMonthWeekdayDayFormat(locale).format(new java.util.Date(j));
    }

    static java.lang.String getOptionalYearMonthDayOfWeekDay(long j) {
        if (isDateWithinCurrentYear(j)) {
            return getMonthDayOfWeekDay(j);
        }
        return getYearMonthDayOfWeekDay(j);
    }

    static java.lang.String getDateString(long j) {
        return getDateString(j, null);
    }

    static java.lang.String getDateString(long j, java.text.SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new java.util.Date(j));
        }
        if (isDateWithinCurrentYear(j)) {
            return getMonthDay(j);
        }
        return getYearMonthDay(j);
    }

    private static boolean isDateWithinCurrentYear(long j) {
        java.util.Calendar todayCalendar = com.google.android.material.datepicker.UtcDates.getTodayCalendar();
        java.util.Calendar utcCalendar = com.google.android.material.datepicker.UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j);
        return todayCalendar.get(1) == utcCalendar.get(1);
    }

    static androidx.core.util.Pair<java.lang.String, java.lang.String> getDateRangeString(java.lang.Long l, java.lang.Long l2) {
        return getDateRangeString(l, l2, null);
    }

    static androidx.core.util.Pair<java.lang.String, java.lang.String> getDateRangeString(java.lang.Long l, java.lang.Long l2, java.text.SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return androidx.core.util.Pair.create(null, null);
        }
        if (l == null) {
            return androidx.core.util.Pair.create(null, getDateString(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return androidx.core.util.Pair.create(getDateString(l.longValue(), simpleDateFormat), null);
        }
        java.util.Calendar todayCalendar = com.google.android.material.datepicker.UtcDates.getTodayCalendar();
        java.util.Calendar utcCalendar = com.google.android.material.datepicker.UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(l.longValue());
        java.util.Calendar utcCalendar2 = com.google.android.material.datepicker.UtcDates.getUtcCalendar();
        utcCalendar2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return androidx.core.util.Pair.create(simpleDateFormat.format(new java.util.Date(l.longValue())), simpleDateFormat.format(new java.util.Date(l2.longValue())));
        }
        if (utcCalendar.get(1) == utcCalendar2.get(1)) {
            if (utcCalendar.get(1) == todayCalendar.get(1)) {
                return androidx.core.util.Pair.create(getMonthDay(l.longValue(), java.util.Locale.getDefault()), getMonthDay(l2.longValue(), java.util.Locale.getDefault()));
            }
            return androidx.core.util.Pair.create(getMonthDay(l.longValue(), java.util.Locale.getDefault()), getYearMonthDay(l2.longValue(), java.util.Locale.getDefault()));
        }
        return androidx.core.util.Pair.create(getYearMonthDay(l.longValue(), java.util.Locale.getDefault()), getYearMonthDay(l2.longValue(), java.util.Locale.getDefault()));
    }

    static java.lang.String getDayContentDescription(android.content.Context context, long j, boolean z, boolean z2, boolean z3) {
        java.lang.String optionalYearMonthDayOfWeekDay = getOptionalYearMonthDayOfWeekDay(j);
        if (z) {
            optionalYearMonthDayOfWeekDay = java.lang.String.format(context.getString(com.google.android.material.R.string.mtrl_picker_today_description), optionalYearMonthDayOfWeekDay);
        }
        if (z2) {
            return java.lang.String.format(context.getString(com.google.android.material.R.string.mtrl_picker_start_date_description), optionalYearMonthDayOfWeekDay);
        }
        return z3 ? java.lang.String.format(context.getString(com.google.android.material.R.string.mtrl_picker_end_date_description), optionalYearMonthDayOfWeekDay) : optionalYearMonthDayOfWeekDay;
    }

    static java.lang.String getYearContentDescription(android.content.Context context, int i) {
        if (com.google.android.material.datepicker.UtcDates.getTodayCalendar().get(1) == i) {
            return java.lang.String.format(context.getString(com.google.android.material.R.string.mtrl_picker_navigate_to_current_year_description), java.lang.Integer.valueOf(i));
        }
        return java.lang.String.format(context.getString(com.google.android.material.R.string.mtrl_picker_navigate_to_year_description), java.lang.Integer.valueOf(i));
    }
}
