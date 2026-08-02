package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u000f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010!R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010!R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010!R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010!"}, d2 = {"Lcom/miteksystems/misnap/core/DateUtil;", "", "<init>", "()V", "", "dateString", "format", "", "shouldReturnCurrentDateIfNull", "shouldParseAsPastDate", "", "parseDate", "(Ljava/lang/String;Ljava/lang/String;ZZ)J", "outputFormat", "asPastDate", "getFormattedDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/String;", "timeInMillis", "(JLjava/lang/String;)Ljava/lang/String;", "Ljava/util/Calendar;", "getUtcCalendar", "()Ljava/util/Calendar;", "Ljava/text/SimpleDateFormat;", "getUtcDateFormat", "(Ljava/lang/String;)Ljava/text/SimpleDateFormat;", "Ljava/util/TimeZone;", "getUtcTimezone", "()Ljava/util/TimeZone;", "getCalendarWithTime", "(J)Ljava/util/Calendar;", "formatDate$core_release", "(JLjava/lang/String;Z)Ljava/lang/String;", "ICAO_DATE_FORMAT", "Ljava/lang/String;", "ICAO_FULL_DATE_FORMAT", "EU_DL_DATE_FORMAT", "DISPLAY_DATE_FORMAT", "RETURN_DATE_FORMAT", "ISO_DATE_FORMAT"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class DateUtil {
    public static final java.lang.String DISPLAY_DATE_FORMAT = "dd MMM yy";
    public static final java.lang.String EU_DL_DATE_FORMAT = "ddMMyyyy";
    public static final java.lang.String ICAO_DATE_FORMAT = "yyMMdd";
    public static final java.lang.String ICAO_FULL_DATE_FORMAT = "yyyyMMdd";
    public static final com.miteksystems.misnap.core.DateUtil INSTANCE = new com.miteksystems.misnap.core.DateUtil();
    public static final java.lang.String ISO_DATE_FORMAT = "yyyy:MM:dd HH:mm:ss";
    public static final java.lang.String RETURN_DATE_FORMAT = "yyyy-MM-dd";

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getFormattedDate(long timeInMillis, java.lang.String outputFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputFormat, "");
        return INSTANCE.formatDate$core_release(timeInMillis, outputFormat, false);
    }

    @kotlin.jvm.JvmStatic
    public static final long parseDate(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return parseDate$default(str, str2, false, false, 12, null);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getFormattedDate(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        return getFormattedDate$default(str, str2, str3, false, false, 24, null);
    }

    @kotlin.jvm.JvmStatic
    public static final long parseDate(java.lang.String str, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return parseDate$default(str, str2, z, false, 8, null);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getFormattedDate(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        return getFormattedDate$default(str, str2, str3, z, false, 16, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r3 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return getUtcCalendar().getTimeInMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r3 != false) goto L21;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long parseDate(java.lang.String dateString, java.lang.String format, boolean shouldReturnCurrentDateIfNull, boolean shouldParseAsPastDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        if (dateString != null && !kotlin.text.StringsKt.isBlank(dateString)) {
            try {
                java.util.Date parse = getUtcDateFormat(format).parse(dateString);
                if (parse != null) {
                    if (shouldParseAsPastDate && parse.after(getUtcCalendar().getTime())) {
                        java.util.Calendar calendarWithTime = getCalendarWithTime(parse.getTime());
                        calendarWithTime.add(1, -100);
                        parse = calendarWithTime.getTime();
                    }
                    if (parse != null) {
                        return parse.getTime();
                    }
                }
                if (shouldReturnCurrentDateIfNull) {
                    return getUtcCalendar().getTimeInMillis();
                }
            } catch (java.lang.Exception unused) {
            }
            return Long.MIN_VALUE;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getFormattedDate(java.lang.String dateString, java.lang.String format, java.lang.String outputFormat, boolean shouldReturnCurrentDateIfNull, boolean asPastDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputFormat, "");
        return INSTANCE.formatDate$core_release(parseDate(dateString, format, shouldReturnCurrentDateIfNull, asPastDate), outputFormat, false);
    }

    public final /* synthetic */ java.lang.String formatDate$core_release(long timeInMillis, java.lang.String format, boolean shouldReturnCurrentDateIfNull) {
        java.text.SimpleDateFormat utcDateFormat;
        java.util.Date date;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        try {
            if (timeInMillis != Long.MIN_VALUE) {
                utcDateFormat = getUtcDateFormat(format);
                date = new java.util.Date(timeInMillis);
            } else {
                if (!shouldReturnCurrentDateIfNull) {
                    str = "";
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }
                utcDateFormat = getUtcDateFormat(format);
                date = new java.util.Date(getUtcCalendar().getTimeInMillis());
            }
            str = utcDateFormat.format(date);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            return str;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static /* synthetic */ long parseDate$default(java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return parseDate(str, str2, z, z2);
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.TimeZone getUtcTimezone() {
        java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timeZone, "");
        return timeZone;
    }

    @kotlin.jvm.JvmStatic
    public static final java.text.SimpleDateFormat getUtcDateFormat(java.lang.String format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(format, java.util.Locale.getDefault());
        simpleDateFormat.setTimeZone(getUtcTimezone());
        return simpleDateFormat;
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Calendar getUtcCalendar() {
        java.util.Calendar calendar = java.util.Calendar.getInstance(getUtcTimezone());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(calendar, "");
        return calendar;
    }

    public static /* synthetic */ java.lang.String getFormattedDate$default(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        return getFormattedDate(str, str2, str3, z, z2);
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Calendar getCalendarWithTime(long timeInMillis) {
        java.util.Calendar utcCalendar = getUtcCalendar();
        utcCalendar.setTimeInMillis(timeInMillis);
        return utcCalendar;
    }

    public static /* synthetic */ java.lang.String formatDate$core_release$default(com.miteksystems.misnap.core.DateUtil dateUtil, long j, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return dateUtil.formatDate$core_release(j, str, z);
    }

    private DateUtil() {
    }
}
