package com.paypal.oslo.core.i18n.domain.util;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0018j\u0002`\u00192\u0006\u0010\u0017\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a/\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u001dH\u0000¢\u0006\u0004\b%\u0010&*$\b\u0000\u0010'\"\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u00182\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0018"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeStyle;", "Landroid/icu/text/RelativeDateTimeFormatter$Style;", "toICU", "(Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeStyle;)Landroid/icu/text/RelativeDateTimeFormatter$Style;", "Lcom/paypal/oslo/core/i18n/domain/model/DurationUnit;", "Landroid/icu/text/RelativeDateTimeFormatter$RelativeUnit;", "(Lcom/paypal/oslo/core/i18n/domain/model/DurationUnit;)Landroid/icu/text/RelativeDateTimeFormatter$RelativeUnit;", "Landroid/icu/text/MeasureFormat$FormatWidth;", "toMeasureFormatWidth", "(Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeStyle;)Landroid/icu/text/MeasureFormat$FormatWidth;", "Landroid/icu/util/MeasureUnit;", "toMeasureUnit", "(Landroid/icu/text/RelativeDateTimeFormatter$RelativeUnit;)Landroid/icu/util/MeasureUnit;", "unit", "Ljava/time/ZonedDateTime;", "nowDateTime", "targetDateTime", "", "calculateDifference", "(Lcom/paypal/oslo/core/i18n/domain/model/DurationUnit;Ljava/time/ZonedDateTime;Ljava/time/ZonedDateTime;)J", "Lcom/paypal/oslo/core/i18n/domain/model/DurationDifferences;", "calculateAllDifferences", "(Ljava/time/ZonedDateTime;Ljava/time/ZonedDateTime;)Lcom/paypal/oslo/core/i18n/domain/model/DurationDifferences;", "diffs", "Lkotlin/Pair;", "Lcom/paypal/oslo/core/i18n/domain/util/BestFitResult;", "selectBestFitUnit", "(Lcom/paypal/oslo/core/i18n/domain/model/DurationDifferences;)Lkotlin/Pair;", "Ljava/util/Locale;", "Landroid/icu/util/ULocale;", "toICULocale", "(Ljava/util/Locale;)Landroid/icu/util/ULocale;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "icuLocale", "", "formatAsDuration", "(DLandroid/icu/text/RelativeDateTimeFormatter$RelativeUnit;Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeStyle;Landroid/icu/util/ULocale;)Ljava/lang/String;", "BestFitResult"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RelativeTimeUtilKt {
    public static final android.icu.text.RelativeDateTimeFormatter.Style toICU(com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle relativeTimeStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relativeTimeStyle, "");
        int i = com.paypal.oslo.core.i18n.domain.util.RelativeTimeUtilKt.WhenMappings.$EnumSwitchMapping$0[relativeTimeStyle.ordinal()];
        if (i == 1 || i == 2) {
            return android.icu.text.RelativeDateTimeFormatter.Style.SHORT;
        }
        if (i == 3 || i == 4) {
            return android.icu.text.RelativeDateTimeFormatter.Style.NARROW;
        }
        return android.icu.text.RelativeDateTimeFormatter.Style.LONG;
    }

    public static final android.icu.text.RelativeDateTimeFormatter.RelativeUnit toICU(com.paypal.oslo.core.i18n.domain.model.DurationUnit durationUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        switch (com.paypal.oslo.core.i18n.domain.util.RelativeTimeUtilKt.WhenMappings.$EnumSwitchMapping$1[durationUnit.ordinal()]) {
            case 1:
                return android.icu.text.RelativeDateTimeFormatter.RelativeUnit.SECONDS;
            case 2:
                return android.icu.text.RelativeDateTimeFormatter.RelativeUnit.MINUTES;
            case 3:
                return android.icu.text.RelativeDateTimeFormatter.RelativeUnit.HOURS;
            case 4:
                return android.icu.text.RelativeDateTimeFormatter.RelativeUnit.DAYS;
            case 5:
                return android.icu.text.RelativeDateTimeFormatter.RelativeUnit.MONTHS;
            case 6:
                return android.icu.text.RelativeDateTimeFormatter.RelativeUnit.YEARS;
            case 7:
                return android.icu.text.RelativeDateTimeFormatter.RelativeUnit.SECONDS;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final android.icu.text.MeasureFormat.FormatWidth toMeasureFormatWidth(com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle relativeTimeStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relativeTimeStyle, "");
        int i = com.paypal.oslo.core.i18n.domain.util.RelativeTimeUtilKt.WhenMappings.$EnumSwitchMapping$0[relativeTimeStyle.ordinal()];
        if (i == 2) {
            return android.icu.text.MeasureFormat.FormatWidth.SHORT;
        }
        if (i == 4) {
            return android.icu.text.MeasureFormat.FormatWidth.NARROW;
        }
        return android.icu.text.MeasureFormat.FormatWidth.WIDE;
    }

    public static final android.icu.util.MeasureUnit toMeasureUnit(android.icu.text.RelativeDateTimeFormatter.RelativeUnit relativeUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relativeUnit, "");
        switch (com.paypal.oslo.core.i18n.domain.util.RelativeTimeUtilKt.WhenMappings.$EnumSwitchMapping$2[relativeUnit.ordinal()]) {
            case 1:
                android.icu.util.TimeUnit timeUnit = android.icu.util.MeasureUnit.SECOND;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timeUnit, "");
                return timeUnit;
            case 2:
                android.icu.util.TimeUnit timeUnit2 = android.icu.util.MeasureUnit.MINUTE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timeUnit2, "");
                return timeUnit2;
            case 3:
                android.icu.util.TimeUnit timeUnit3 = android.icu.util.MeasureUnit.HOUR;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timeUnit3, "");
                return timeUnit3;
            case 4:
                android.icu.util.TimeUnit timeUnit4 = android.icu.util.MeasureUnit.DAY;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timeUnit4, "");
                return timeUnit4;
            case 5:
                android.icu.util.TimeUnit timeUnit5 = android.icu.util.MeasureUnit.MONTH;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timeUnit5, "");
                return timeUnit5;
            case 6:
                android.icu.util.TimeUnit timeUnit6 = android.icu.util.MeasureUnit.YEAR;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timeUnit6, "");
                return timeUnit6;
            default:
                android.icu.util.TimeUnit timeUnit7 = android.icu.util.MeasureUnit.SECOND;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timeUnit7, "");
                return timeUnit7;
        }
    }

    public static final long calculateDifference(com.paypal.oslo.core.i18n.domain.model.DurationUnit durationUnit, java.time.ZonedDateTime zonedDateTime, java.time.ZonedDateTime zonedDateTime2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zonedDateTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zonedDateTime2, "");
        switch (com.paypal.oslo.core.i18n.domain.util.RelativeTimeUtilKt.WhenMappings.$EnumSwitchMapping$1[durationUnit.ordinal()]) {
            case 1:
                return java.time.temporal.ChronoUnit.SECONDS.between(zonedDateTime.truncatedTo(java.time.temporal.ChronoUnit.SECONDS), zonedDateTime2.truncatedTo(java.time.temporal.ChronoUnit.SECONDS));
            case 2:
                return java.time.temporal.ChronoUnit.MINUTES.between(zonedDateTime.truncatedTo(java.time.temporal.ChronoUnit.MINUTES), zonedDateTime2.truncatedTo(java.time.temporal.ChronoUnit.MINUTES));
            case 3:
                return java.time.temporal.ChronoUnit.HOURS.between(zonedDateTime.truncatedTo(java.time.temporal.ChronoUnit.HOURS), zonedDateTime2.truncatedTo(java.time.temporal.ChronoUnit.HOURS));
            case 4:
                return java.time.temporal.ChronoUnit.DAYS.between(zonedDateTime.truncatedTo(java.time.temporal.ChronoUnit.DAYS), zonedDateTime2.truncatedTo(java.time.temporal.ChronoUnit.DAYS));
            case 5:
                return ((zonedDateTime2.getYear() - zonedDateTime.getYear()) * 12) + (zonedDateTime2.getMonthValue() - zonedDateTime.getMonthValue());
            case 6:
                return zonedDateTime2.getYear() - zonedDateTime.getYear();
            case 7:
                return 0L;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.paypal.oslo.core.i18n.domain.model.DurationDifferences calculateAllDifferences(java.time.ZonedDateTime zonedDateTime, java.time.ZonedDateTime zonedDateTime2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zonedDateTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zonedDateTime2, "");
        return new com.paypal.oslo.core.i18n.domain.model.DurationDifferences(calculateDifference(com.paypal.oslo.core.i18n.domain.model.DurationUnit.SECOND, zonedDateTime, zonedDateTime2), calculateDifference(com.paypal.oslo.core.i18n.domain.model.DurationUnit.MINUTE, zonedDateTime, zonedDateTime2), calculateDifference(com.paypal.oslo.core.i18n.domain.model.DurationUnit.HOUR, zonedDateTime, zonedDateTime2), calculateDifference(com.paypal.oslo.core.i18n.domain.model.DurationUnit.DAY, zonedDateTime, zonedDateTime2), calculateDifference(com.paypal.oslo.core.i18n.domain.model.DurationUnit.MONTH, zonedDateTime, zonedDateTime2), calculateDifference(com.paypal.oslo.core.i18n.domain.model.DurationUnit.YEAR, zonedDateTime, zonedDateTime2));
    }

    public static final kotlin.Pair<android.icu.text.RelativeDateTimeFormatter.RelativeUnit, java.lang.Long> selectBestFitUnit(com.paypal.oslo.core.i18n.domain.model.DurationDifferences durationDifferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationDifferences, "");
        long abs = java.lang.Math.abs(durationDifferences.getSecondsDiff());
        long abs2 = java.lang.Math.abs(durationDifferences.getMinutesDiff());
        long abs3 = java.lang.Math.abs(durationDifferences.getHoursDiff());
        long abs4 = java.lang.Math.abs(durationDifferences.getDaysDiff());
        if (java.lang.Math.abs(durationDifferences.getMonthsDiff()) > 11) {
            return kotlin.TuplesKt.to(android.icu.text.RelativeDateTimeFormatter.RelativeUnit.YEARS, java.lang.Long.valueOf(durationDifferences.getYearsDiff()));
        }
        if (abs4 > 26) {
            return kotlin.TuplesKt.to(android.icu.text.RelativeDateTimeFormatter.RelativeUnit.MONTHS, java.lang.Long.valueOf(durationDifferences.getMonthsDiff()));
        }
        if (abs3 > 22) {
            return kotlin.TuplesKt.to(android.icu.text.RelativeDateTimeFormatter.RelativeUnit.DAYS, java.lang.Long.valueOf(durationDifferences.getDaysDiff()));
        }
        if (abs2 > 45) {
            return kotlin.TuplesKt.to(android.icu.text.RelativeDateTimeFormatter.RelativeUnit.HOURS, java.lang.Long.valueOf(durationDifferences.getHoursDiff()));
        }
        if (abs > 45) {
            return kotlin.TuplesKt.to(android.icu.text.RelativeDateTimeFormatter.RelativeUnit.MINUTES, java.lang.Long.valueOf(durationDifferences.getMinutesDiff()));
        }
        return kotlin.TuplesKt.to(android.icu.text.RelativeDateTimeFormatter.RelativeUnit.SECONDS, java.lang.Long.valueOf(durationDifferences.getSecondsDiff()));
    }

    public static final android.icu.util.ULocale toICULocale(java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        android.icu.util.ULocale forLocale = android.icu.util.ULocale.forLocale(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forLocale, "");
        return forLocale;
    }

    public static final java.lang.String formatAsDuration(double d, android.icu.text.RelativeDateTimeFormatter.RelativeUnit relativeUnit, com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle relativeTimeStyle, android.icu.util.ULocale uLocale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relativeUnit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relativeTimeStyle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLocale, "");
        double abs = java.lang.Math.abs(d);
        java.lang.String format = android.icu.text.MeasureFormat.getInstance(uLocale, toMeasureFormatWidth(relativeTimeStyle)).format(new android.icu.util.Measure(java.lang.Double.valueOf(abs), toMeasureUnit(relativeUnit)));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle.values().length];
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle.SHORT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle.DURATION_SHORT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle.NARROW.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle.DURATION_NARROW.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.core.i18n.domain.model.DurationUnit.values().length];
            try {
                iArr2[com.paypal.oslo.core.i18n.domain.model.DurationUnit.SECOND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.core.i18n.domain.model.DurationUnit.MINUTE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.core.i18n.domain.model.DurationUnit.HOUR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.core.i18n.domain.model.DurationUnit.DAY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.core.i18n.domain.model.DurationUnit.MONTH.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.core.i18n.domain.model.DurationUnit.YEAR.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.paypal.oslo.core.i18n.domain.model.DurationUnit.BEST_FIT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[android.icu.text.RelativeDateTimeFormatter.RelativeUnit.values().length];
            try {
                iArr3[android.icu.text.RelativeDateTimeFormatter.RelativeUnit.SECONDS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[android.icu.text.RelativeDateTimeFormatter.RelativeUnit.MINUTES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr3[android.icu.text.RelativeDateTimeFormatter.RelativeUnit.HOURS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr3[android.icu.text.RelativeDateTimeFormatter.RelativeUnit.DAYS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr3[android.icu.text.RelativeDateTimeFormatter.RelativeUnit.MONTHS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr3[android.icu.text.RelativeDateTimeFormatter.RelativeUnit.YEARS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
