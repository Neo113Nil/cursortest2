package com.paypal.oslo.feature.savings.util;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0011\u0010\u000eJ+\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/savings/util/DateTimeHandlerImpl;", "Lcom/paypal/oslo/core/i18n/domain/interfaces/DateTimeHandler;", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "localeProvider", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;)V", "Lcom/paypal/oslo/core/i18n/domain/model/DateTime;", "dateTime", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimeConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimeError;", "", "format", "(Lcom/paypal/oslo/core/i18n/domain/model/DateTime;Lcom/paypal/oslo/core/i18n/domain/model/DateTimeConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimePart;", "formatToParts", "Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeConfiguration;", "formatRelative", "(Lcom/paypal/oslo/core/i18n/domain/model/DateTime;Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeConfiguration;)Larrow/core/Either;", "isoDuration", "formatISODuration", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeConfiguration;)Larrow/core/Either;", "", "isTeenValidation", "isValidAge", "(Lcom/paypal/oslo/core/i18n/domain/model/DateTime;Z)Larrow/core/Either;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DateTimeHandlerImpl implements com.paypal.oslo.core.i18n.domain.interfaces.DateTimeHandler {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.Companion INSTANCE = new com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.Companion(null);
    public static final int $stable = 8;
    private static final java.util.Map<com.paypal.oslo.core.i18n.domain.model.DateTimeStyle, java.lang.String> getHighSpeedVideoSizes = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.core.i18n.domain.model.DateTimeStyle.DATE_SHORT, "M/d/yy"), kotlin.TuplesKt.to(com.paypal.oslo.core.i18n.domain.model.DateTimeStyle.DATE_MEDIUM, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TRANSACTION_DATE_WITH_YEAR_FORMAT), kotlin.TuplesKt.to(com.paypal.oslo.core.i18n.domain.model.DateTimeStyle.DATE_LONG, com.paypal.oslo.feature.savings.constants.SavingsConstants.DateFormatting.DATE_DISPLAY_FORMAT), kotlin.TuplesKt.to(com.paypal.oslo.core.i18n.domain.model.DateTimeStyle.DATE_FULL, "EEEE, MMMM d, yyyy"), kotlin.TuplesKt.to(com.paypal.oslo.core.i18n.domain.model.DateTimeStyle.TIME_SHORT, "h:mm a"), kotlin.TuplesKt.to(com.paypal.oslo.core.i18n.domain.model.DateTimeStyle.TIME_MEDIUM, "h:mm:ss a"), kotlin.TuplesKt.to(com.paypal.oslo.core.i18n.domain.model.DateTimeStyle.TIME_LONG, "h:mm:ss a z"), kotlin.TuplesKt.to(com.paypal.oslo.core.i18n.domain.model.DateTimeStyle.TIME_FULL, "h:mm:ss a zzzz"), kotlin.TuplesKt.to(com.paypal.oslo.core.i18n.domain.model.DateTimeStyle.DATETIME_SHORT, "M/d/yy, h:mm a"), kotlin.TuplesKt.to(com.paypal.oslo.core.i18n.domain.model.DateTimeStyle.DATETIME_MEDIUM, "MMM d, yyyy, h:mm:ss a"), kotlin.TuplesKt.to(com.paypal.oslo.core.i18n.domain.model.DateTimeStyle.DATETIME_LONG, "MMMM d, yyyy, h:mm:ss a z"), kotlin.TuplesKt.to(com.paypal.oslo.core.i18n.domain.model.DateTimeStyle.DATETIME_FULL, "EEEE, MMMM d, yyyy, h:mm:ss a zzzz"), kotlin.TuplesKt.to(com.paypal.oslo.core.i18n.domain.model.DateTimeStyle.TIMEZONE_SHORT, "z"), kotlin.TuplesKt.to(com.paypal.oslo.core.i18n.domain.model.DateTimeStyle.TIMEZONE_MEDIUM, "zz"), kotlin.TuplesKt.to(com.paypal.oslo.core.i18n.domain.model.DateTimeStyle.TIMEZONE_LONG, "zzzz"), kotlin.TuplesKt.to(com.paypal.oslo.core.i18n.domain.model.DateTimeStyle.BANK_CARD_EXPIRY, "MM/yy"));

    @javax.inject.Inject
    public DateTimeHandlerImpl(com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeProvider, "");
        this.getHighSpeedVideoFpsRanges = localeProvider;
    }

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010\u001e\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010 J\u0015\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\u001aJ\u0017\u0010#\u001a\u0004\u0018\u00010\u00162\u0006\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0016¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0016¢\u0006\u0004\b*\u0010\u001aJ\u0011\u0010,\u001a\u00020\u0006*\u00020+¢\u0006\u0004\b,\u0010-R \u00102\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00060.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101"}, d2 = {"Lcom/paypal/oslo/feature/savings/util/DateTimeHandlerImpl$Companion;", "", "<init>", "()V", "Ljava/util/Date;", "date", "", "pattern", "Ljava/util/Locale;", "locale", "formatDate", "(Ljava/util/Date;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "isoDate", "formatIsoDateToDisplay", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "getWeekdayName", "(Ljava/util/Date;Ljava/util/Locale;)Ljava/lang/String;", "parseIsoDate", "(Ljava/lang/String;)Ljava/util/Date;", "Ljava/time/DayOfWeek;", "dayOfWeek", "(Ljava/time/DayOfWeek;Ljava/util/Locale;)Ljava/lang/String;", "Ljava/time/LocalDate;", "formatLocalDate", "(Ljava/time/LocalDate;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "formatLocalDateToIso", "(Ljava/time/LocalDate;)Ljava/lang/String;", "dateString", "Ljava/time/format/DateTimeFormatter;", "formatter", "parseLocalDate", "(Ljava/lang/String;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;)Ljava/time/LocalDate;", "localDateToRawDigits", "rawDigits", "parseRawDigitsToLocalDate", "(Ljava/lang/String;)Ljava/time/LocalDate;", "getCurrentDate", "()Ljava/time/LocalDate;", "fromDate", "getNextDateForDayOfWeek", "(Ljava/time/DayOfWeek;Ljava/time/LocalDate;)Ljava/time/LocalDate;", "formatStartDate", "", "toOrdinal", "(I)Ljava/lang/String;", "", "Lcom/paypal/oslo/core/i18n/domain/model/DateTimeStyle;", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ java.lang.String formatDate$default(com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.Companion companion, java.util.Date date, java.lang.String str, java.util.Locale locale, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                locale = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            }
            return companion.formatDate(date, str, locale);
        }

        public final java.lang.String formatDate(java.util.Date date, java.lang.String pattern, java.util.Locale locale) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
            try {
                java.lang.String format = new java.text.SimpleDateFormat(pattern, locale).format(date);
                kotlin.jvm.internal.Intrinsics.checkNotNull(format);
                return format;
            } catch (java.lang.Exception unused) {
                return "";
            }
        }

        public static /* synthetic */ java.lang.String formatIsoDateToDisplay$default(com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.Companion companion, java.lang.String str, java.lang.String str2, java.util.Locale locale, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str2 = com.paypal.oslo.feature.savings.constants.SavingsConstants.DateFormatting.DATE_DISPLAY_FORMAT;
            }
            if ((i & 4) != 0) {
                locale = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            }
            return companion.formatIsoDateToDisplay(str, str2, locale);
        }

        public final java.lang.String formatIsoDateToDisplay(java.lang.String isoDate, java.lang.String pattern, java.util.Locale locale) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isoDate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
            try {
                java.util.Date from = java.util.Date.from(java.time.LocalDate.parse(isoDate).atStartOfDay(java.time.ZoneId.systemDefault()).toInstant());
                kotlin.jvm.internal.Intrinsics.checkNotNull(from);
                return formatDate(from, pattern, locale);
            } catch (java.lang.Exception unused) {
                return isoDate;
            }
        }

        public static /* synthetic */ java.lang.String getWeekdayName$default(com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.Companion companion, java.util.Date date, java.util.Locale locale, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                locale = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            }
            return companion.getWeekdayName(date, locale);
        }

        public final java.lang.String getWeekdayName(java.util.Date date, java.util.Locale locale) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
            return formatDate(date, com.paypal.oslo.feature.savings.constants.SavingsConstants.DateFormatting.WEEKDAY_FORMAT, locale);
        }

        public final java.util.Date parseIsoDate(java.lang.String isoDate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isoDate, "");
            try {
                java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US);
                simpleDateFormat.setLenient(false);
                return simpleDateFormat.parse(isoDate);
            } catch (java.lang.Exception unused) {
                return null;
            }
        }

        public static /* synthetic */ java.lang.String getWeekdayName$default(com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.Companion companion, java.time.DayOfWeek dayOfWeek, java.util.Locale locale, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                locale = java.util.Locale.getDefault();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            }
            return companion.getWeekdayName(dayOfWeek, locale);
        }

        public final java.lang.String getWeekdayName(java.time.DayOfWeek dayOfWeek, java.util.Locale locale) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
            java.lang.String displayName = dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayName, "");
            return displayName;
        }

        public static /* synthetic */ java.lang.String formatLocalDate$default(com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.Companion companion, java.time.LocalDate localDate, java.lang.String str, java.util.Locale locale, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                locale = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            }
            return companion.formatLocalDate(localDate, str, locale);
        }

        public final java.lang.String formatLocalDate(java.time.LocalDate date, java.lang.String pattern, java.util.Locale locale) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
            try {
                java.lang.String format = date.format(java.time.format.DateTimeFormatter.ofPattern(pattern, locale));
                kotlin.jvm.internal.Intrinsics.checkNotNull(format);
                return format;
            } catch (java.lang.Exception unused) {
                return "";
            }
        }

        public final java.lang.String formatLocalDateToIso(java.time.LocalDate date) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
            try {
                java.lang.String format = date.format(java.time.format.DateTimeFormatter.ISO_LOCAL_DATE);
                kotlin.jvm.internal.Intrinsics.checkNotNull(format);
                return format;
            } catch (java.lang.Exception unused) {
                return "";
            }
        }

        public final java.time.LocalDate parseLocalDate(java.lang.String dateString, java.time.format.DateTimeFormatter formatter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateString, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatter, "");
            try {
                return java.time.LocalDate.parse(dateString, formatter);
            } catch (java.lang.Exception unused) {
                return null;
            }
        }

        public static /* synthetic */ java.time.LocalDate parseLocalDate$default(com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.Companion companion, java.lang.String str, java.lang.String str2, java.util.Locale locale, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                locale = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            }
            return companion.parseLocalDate(str, str2, locale);
        }

        public final java.time.LocalDate parseLocalDate(java.lang.String dateString, java.lang.String pattern, java.util.Locale locale) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateString, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
            try {
                return java.time.LocalDate.parse(dateString, java.time.format.DateTimeFormatter.ofPattern(pattern, locale));
            } catch (java.lang.Exception unused) {
                return null;
            }
        }

        public final java.lang.String localDateToRawDigits(java.time.LocalDate date) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
            try {
                java.lang.String format = date.format(java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                java.lang.String str = format;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (java.lang.Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                return sb.toString();
            } catch (java.lang.Exception unused) {
                return "";
            }
        }

        public final java.time.LocalDate parseRawDigitsToLocalDate(java.lang.String rawDigits) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawDigits, "");
            if (rawDigits.length() != 8) {
                return null;
            }
            java.lang.String substring = rawDigits.substring(0, 2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            java.lang.String substring2 = rawDigits.substring(2, 4);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            java.lang.String substring3 = rawDigits.substring(4, 8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(substring);
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(substring2);
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(substring3);
            return parseLocalDate$default(this, sb.toString(), "MM/dd/yyyy", null, 4, null);
        }

        public final java.time.LocalDate getCurrentDate() {
            java.time.LocalDate now = java.time.LocalDate.now();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(now, "");
            return now;
        }

        public final java.time.LocalDate getNextDateForDayOfWeek(java.time.DayOfWeek dayOfWeek, java.time.LocalDate fromDate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fromDate, "");
            int value = ((dayOfWeek.getValue() - fromDate.getDayOfWeek().getValue()) + 7) % 7;
            if (value == 0) {
                java.time.LocalDate plusDays = fromDate.plusDays(7L);
                kotlin.jvm.internal.Intrinsics.checkNotNull(plusDays);
                return plusDays;
            }
            java.time.LocalDate plusDays2 = fromDate.plusDays(value);
            kotlin.jvm.internal.Intrinsics.checkNotNull(plusDays2);
            return plusDays2;
        }

        public final java.lang.String formatStartDate(java.time.LocalDate date) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
            java.lang.String formatLocalDate$default = formatLocalDate$default(this, date, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_SUB_HEADER_MONTH_DATE_FORMAT, null, 4, null);
            java.lang.String ordinal = toOrdinal(date.getDayOfMonth());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(formatLocalDate$default);
            sb.append(" ");
            sb.append(ordinal);
            return sb.toString();
        }

        public final java.lang.String toOrdinal(int i) {
            java.lang.String str;
            int i2 = i % 100;
            if (11 > i2 || i2 >= 14) {
                int i3 = i % 10;
                if (i3 == 1) {
                    str = "st";
                } else if (i3 == 2) {
                    str = "nd";
                } else if (i3 == 3) {
                    str = "rd";
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(i);
                sb.append(str);
                return sb.toString();
            }
            str = "th";
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(i);
            sb2.append(str);
            return sb2.toString();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.DateTimeHandler
    public final java.lang.Object format(com.paypal.oslo.core.i18n.domain.model.DateTime dateTime, com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration dateTimeConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.lang.String>> continuation) {
        java.lang.String str;
        try {
            java.util.Locale userLocale = this.getHighSpeedVideoFpsRanges.getUserLocale();
            com.paypal.oslo.core.i18n.domain.model.DateFormat dateFormat = dateTimeConfiguration.getDateFormat();
            if (dateFormat instanceof com.paypal.oslo.core.i18n.domain.model.CustomStyle) {
                str = ((com.paypal.oslo.core.i18n.domain.model.CustomStyle) dateFormat).getPattern();
            } else {
                if (!(dateFormat instanceof com.paypal.oslo.core.i18n.domain.model.DateTimeStyle)) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.INVALID_PATTERN);
                }
                com.paypal.oslo.core.i18n.domain.model.DateTimeStyle dateTimeStyle = (com.paypal.oslo.core.i18n.domain.model.DateTimeStyle) dateFormat;
                java.lang.String str2 = getHighSpeedVideoSizes.get(dateTimeStyle);
                if (str2 == null) {
                    throw new java.lang.IllegalStateException("Unknown DateTimeStyle: ".concat(java.lang.String.valueOf(dateTimeStyle)).toString());
                }
                str = str2;
            }
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str, userLocale);
            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone(dateTime.getTimeZone()));
            return arrow.core.EitherKt.right(simpleDateFormat.format(dateTime.getDate()));
        } catch (java.lang.IllegalArgumentException e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.savings.LoggerKt.log;
            java.lang.String message = e.getMessage();
            logger.w("Invalid date pattern", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message != null ? message : "")), kotlin.collections.MapsKt.emptyMap());
            return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.INVALID_PATTERN);
        } catch (java.text.ParseException e2) {
            com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.savings.LoggerKt.log;
            java.lang.String message2 = e2.getMessage();
            logger2.w("Date formatting error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message2 != null ? message2 : "")), kotlin.collections.MapsKt.emptyMap());
            return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.INVALID_PATTERN);
        }
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.DateTimeHandler
    public final java.lang.Object formatToParts(com.paypal.oslo.core.i18n.domain.model.DateTime dateTime, com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration dateTimeConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.DateTimeError, ? extends java.util.List<com.paypal.oslo.core.i18n.domain.model.DateTimePart>>> continuation) {
        return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.METADATA_FETCH_FAILED);
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.DateTimeHandler
    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.lang.String> formatRelative(com.paypal.oslo.core.i18n.domain.model.DateTime dateTime, com.paypal.oslo.core.i18n.domain.model.RelativeTimeConfiguration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.MISSING_TIMEZONE);
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.DateTimeHandler
    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.lang.String> formatISODuration(java.lang.String isoDuration, com.paypal.oslo.core.i18n.domain.model.RelativeTimeConfiguration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isoDuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.INVALID_ISO_DURATION);
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.DateTimeHandler
    public final arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.lang.Boolean> isValidAge(com.paypal.oslo.core.i18n.domain.model.DateTime dateTime, boolean isTeenValidation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "");
        return arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.DateTimeError.PARSE_ERROR);
    }
}
