package com.adobe.marketing.mobile.util;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/adobe/marketing/mobile/util/TimeUtils;", "", "<init>", "()V", "Ljava/util/Date;", "p0", "", "p1", "Ljava/util/TimeZone;", "p2", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;)Ljava/lang/String;", "date", "getISO8601Date", "(Ljava/util/Date;)Ljava/lang/String;", "getISO8601DateNoColon", "getISO8601FullDate", "getISO8601UTCDateWithMilliseconds", "", "epoch", "timeZone", "Ljava/util/Locale;", "locale", "getRFC2822Date", "(JLjava/util/TimeZone;Ljava/util/Locale;)Ljava/lang/String;", "getUnixTimeInSeconds", "()J", "rfc2822Date", "parseRFC2822Date", "(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Date;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class TimeUtils {
    public static final int $stable = 0;
    public static final com.adobe.marketing.mobile.util.TimeUtils INSTANCE = new com.adobe.marketing.mobile.util.TimeUtils();

    private TimeUtils() {
    }

    @kotlin.jvm.JvmStatic
    public static final long getUnixTimeInSeconds() {
        return java.lang.System.currentTimeMillis() / 1000;
    }

    public static /* synthetic */ java.lang.String getISO8601Date$default(java.util.Date date, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            date = new java.util.Date();
        }
        return getISO8601Date(date);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getISO8601Date(java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(date, "yyyy-MM-dd'T'HH:mm:ssXXX", null);
        return highResolutionOutputSizeshNQ4ISI == null ? "" : highResolutionOutputSizeshNQ4ISI;
    }

    public static /* synthetic */ java.lang.String getISO8601DateNoColon$default(java.util.Date date, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            date = new java.util.Date();
        }
        return getISO8601DateNoColon(date);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getISO8601DateNoColon(java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(date, "yyyy-MM-dd'T'HH:mm:ssXX", null);
        return highResolutionOutputSizeshNQ4ISI == null ? "" : highResolutionOutputSizeshNQ4ISI;
    }

    public static /* synthetic */ java.lang.String getISO8601UTCDateWithMilliseconds$default(java.util.Date date, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            date = new java.util.Date();
        }
        return getISO8601UTCDateWithMilliseconds(date);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getISO8601UTCDateWithMilliseconds(java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(date, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_UTC_FORMAT_UTC_Z, java.util.TimeZone.getTimeZone("GMT"));
        return highResolutionOutputSizeshNQ4ISI == null ? "" : highResolutionOutputSizeshNQ4ISI;
    }

    public static /* synthetic */ java.lang.String getISO8601FullDate$default(java.util.Date date, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            date = new java.util.Date();
        }
        return getISO8601FullDate(date);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getISO8601FullDate(java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(date, "yyyy-MM-dd", null);
        return highResolutionOutputSizeshNQ4ISI == null ? "" : highResolutionOutputSizeshNQ4ISI;
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Date parseRFC2822Date(java.lang.String rfc2822Date, java.util.TimeZone timeZone, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        if (rfc2822Date == null) {
            return null;
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", locale);
        simpleDateFormat.setTimeZone(timeZone);
        try {
            java.util.Date parse = simpleDateFormat.parse(rfc2822Date);
            return parse == null ? new java.util.Date() : parse;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getRFC2822Date(long epoch, java.util.TimeZone timeZone, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", locale);
        simpleDateFormat.setTimeZone(timeZone);
        java.lang.String format = simpleDateFormat.format(java.lang.Long.valueOf(epoch));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.util.Date p0, java.lang.String p1, java.util.TimeZone p2) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(p1, new java.util.Locale(java.util.Locale.US.getLanguage(), java.util.Locale.US.getCountry(), "POSIX"));
        if (p2 != null) {
            simpleDateFormat.setTimeZone(p2);
        }
        return simpleDateFormat.format(p0);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getISO8601UTCDateWithMilliseconds() {
        return getISO8601UTCDateWithMilliseconds$default(null, 1, null);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getISO8601FullDate() {
        return getISO8601FullDate$default(null, 1, null);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getISO8601DateNoColon() {
        return getISO8601DateNoColon$default(null, 1, null);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getISO8601Date() {
        return getISO8601Date$default(null, 1, null);
    }
}
