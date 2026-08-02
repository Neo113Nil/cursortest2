package com.google.android.material.datepicker;

/* loaded from: classes8.dex */
class UtcDates {
    static final java.lang.String UTC = "UTC";
    static java.util.concurrent.atomic.AtomicReference<com.google.android.material.datepicker.TimeSource> timeSourceRef = new java.util.concurrent.atomic.AtomicReference<>();

    static void setTimeSource(com.google.android.material.datepicker.TimeSource timeSource) {
        timeSourceRef.set(timeSource);
    }

    static com.google.android.material.datepicker.TimeSource getTimeSource() {
        com.google.android.material.datepicker.TimeSource timeSource = timeSourceRef.get();
        return timeSource == null ? com.google.android.material.datepicker.TimeSource.system() : timeSource;
    }

    private UtcDates() {
    }

    private static java.util.TimeZone getTimeZone() {
        return java.util.TimeZone.getTimeZone("UTC");
    }

    private static android.icu.util.TimeZone getUtcAndroidTimeZone() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    static java.util.Calendar getTodayCalendar() {
        java.util.Calendar now = getTimeSource().now();
        now.set(11, 0);
        now.set(12, 0);
        now.set(13, 0);
        now.set(14, 0);
        now.setTimeZone(getTimeZone());
        return now;
    }

    static java.util.Calendar getUtcCalendar() {
        return getUtcCalendarOf(null);
    }

    static java.util.Calendar getUtcCalendarOf(java.util.Calendar calendar) {
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(getTimeZone());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    static java.util.Calendar getDayCopy(java.util.Calendar calendar) {
        java.util.Calendar utcCalendarOf = getUtcCalendarOf(calendar);
        java.util.Calendar utcCalendar = getUtcCalendar();
        utcCalendar.set(utcCalendarOf.get(1), utcCalendarOf.get(2), utcCalendarOf.get(5));
        return utcCalendar;
    }

    static long canonicalYearMonthDay(long j) {
        java.util.Calendar utcCalendar = getUtcCalendar();
        utcCalendar.setTimeInMillis(j);
        return getDayCopy(utcCalendar).getTimeInMillis();
    }

    private static android.icu.text.DateFormat getAndroidFormat(java.lang.String str, java.util.Locale locale) {
        android.icu.text.DateFormat instanceForSkeleton = android.icu.text.DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(getUtcAndroidTimeZone());
        instanceForSkeleton.setContext(android.icu.text.DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    private static java.text.DateFormat getFormat(int i, java.util.Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(getTimeZone());
        return dateInstance;
    }

    static java.text.DateFormat getNormalizedFormat(java.text.DateFormat dateFormat) {
        java.text.DateFormat dateFormat2 = (java.text.DateFormat) dateFormat.clone();
        dateFormat2.setTimeZone(getTimeZone());
        return dateFormat2;
    }

    static java.text.SimpleDateFormat getDefaultTextInputFormat() {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(getDatePatternAsInputFormat(((java.text.SimpleDateFormat) java.text.DateFormat.getDateInstance(3, java.util.Locale.getDefault())).toPattern()), java.util.Locale.getDefault());
        simpleDateFormat.setTimeZone(getTimeZone());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    static java.lang.String getDefaultTextInputHint(android.content.res.Resources resources, java.text.SimpleDateFormat simpleDateFormat) {
        java.lang.String pattern = simpleDateFormat.toPattern();
        java.lang.String string = resources.getString(com.google.android.material.R.string.mtrl_picker_text_input_year_abbr);
        java.lang.String string2 = resources.getString(com.google.android.material.R.string.mtrl_picker_text_input_month_abbr);
        java.lang.String string3 = resources.getString(com.google.android.material.R.string.mtrl_picker_text_input_day_abbr);
        if (java.util.Locale.getDefault().getLanguage().equals(java.util.Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", "d").replaceAll("M+", "M").replaceAll("y+", "y");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    static java.lang.String getDatePatternAsInputFormat(java.lang.String str) {
        return str.replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_YEAR_FORMAT).replaceAll("\\.$", "").replaceAll("My", "M/y");
    }

    static java.text.SimpleDateFormat getSimpleFormat(java.lang.String str) {
        return getSimpleFormat(str, java.util.Locale.getDefault());
    }

    private static java.text.SimpleDateFormat getSimpleFormat(java.lang.String str, java.util.Locale locale) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(getTimeZone());
        return simpleDateFormat;
    }

    static android.icu.text.DateFormat getYearMonthFormat(java.util.Locale locale) {
        return getAndroidFormat(androidx.compose.material3.DatePickerDefaults.YearMonthSkeleton, locale);
    }

    static android.icu.text.DateFormat getYearAbbrMonthDayFormat(java.util.Locale locale) {
        return getAndroidFormat(androidx.compose.material3.DatePickerDefaults.YearAbbrMonthDaySkeleton, locale);
    }

    static android.icu.text.DateFormat getAbbrMonthDayFormat(java.util.Locale locale) {
        return getAndroidFormat("MMMd", locale);
    }

    static android.icu.text.DateFormat getMonthWeekdayDayFormat(java.util.Locale locale) {
        return getAndroidFormat("MMMMEEEEd", locale);
    }

    static android.icu.text.DateFormat getYearMonthWeekdayDayFormat(java.util.Locale locale) {
        return getAndroidFormat(androidx.compose.material3.DatePickerDefaults.YearMonthWeekdayDaySkeleton, locale);
    }

    static java.text.DateFormat getMediumFormat() {
        return getMediumFormat(java.util.Locale.getDefault());
    }

    static java.text.DateFormat getMediumFormat(java.util.Locale locale) {
        return getFormat(2, locale);
    }

    static java.text.DateFormat getMediumNoYear() {
        return getMediumNoYear(java.util.Locale.getDefault());
    }

    static java.text.DateFormat getMediumNoYear(java.util.Locale locale) {
        java.text.SimpleDateFormat simpleDateFormat = (java.text.SimpleDateFormat) getMediumFormat(locale);
        simpleDateFormat.applyPattern(removeYearFromDateFormatPattern(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    static java.text.DateFormat getFullFormat() {
        return getFullFormat(java.util.Locale.getDefault());
    }

    static java.text.DateFormat getFullFormat(java.util.Locale locale) {
        return getFormat(0, locale);
    }

    private static java.lang.String removeYearFromDateFormatPattern(java.lang.String str) {
        int findCharactersInDateFormatPattern = findCharactersInDateFormatPattern(str, "yY", 1, 0);
        if (findCharactersInDateFormatPattern >= str.length()) {
            return str;
        }
        java.lang.String str2 = "EMd";
        int findCharactersInDateFormatPattern2 = findCharactersInDateFormatPattern(str, "EMd", 1, findCharactersInDateFormatPattern);
        if (findCharactersInDateFormatPattern2 < str.length()) {
            str2 = "EMd,";
        }
        return str.replace(str.substring(findCharactersInDateFormatPattern(str, str2, -1, findCharactersInDateFormatPattern) + 1, findCharactersInDateFormatPattern2), " ").trim();
    }

    private static int findCharactersInDateFormatPattern(java.lang.String str, java.lang.String str2, int i, int i2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 >= 0 && i2 < str.length()) {
                    }
                } while (str.charAt(i2) != '\'');
            }
            i2 += i;
        }
        return i2;
    }
}
