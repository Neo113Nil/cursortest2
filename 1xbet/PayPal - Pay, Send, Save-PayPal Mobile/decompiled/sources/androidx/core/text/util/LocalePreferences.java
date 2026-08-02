package androidx.core.text.util;

/* loaded from: classes7.dex */
public final class LocalePreferences {
    private static final java.lang.String[] Camera2StreamConfigurationMap = {"BS", "BZ", "KY", "PR", "PW", "US"};

    public static class HourCycle {
        public static final java.lang.String DEFAULT = "";
        public static final java.lang.String H11 = "h11";
        public static final java.lang.String H12 = "h12";
        public static final java.lang.String H23 = "h23";
        public static final java.lang.String H24 = "h24";

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface HourCycleTypes {
        }

        private HourCycle() {
        }
    }

    public static java.lang.String getHourCycle() {
        return getHourCycle(true);
    }

    public static java.lang.String getHourCycle(java.util.Locale locale) {
        return getHourCycle(locale, true);
    }

    public static java.lang.String getHourCycle(boolean z) {
        return getHourCycle(androidx.core.text.util.LocalePreferences.Api24Impl.getHighSpeedVideoFpsRanges(), z);
    }

    public static class CalendarType {
        public static final java.lang.String CHINESE = "chinese";
        public static final java.lang.String DANGI = "dangi";
        public static final java.lang.String DEFAULT = "";
        public static final java.lang.String GREGORIAN = "gregorian";
        public static final java.lang.String HEBREW = "hebrew";
        public static final java.lang.String INDIAN = "indian";
        public static final java.lang.String ISLAMIC = "islamic";
        public static final java.lang.String ISLAMIC_CIVIL = "islamic-civil";
        public static final java.lang.String ISLAMIC_RGSA = "islamic-rgsa";
        public static final java.lang.String ISLAMIC_TBLA = "islamic-tbla";
        public static final java.lang.String ISLAMIC_UMALQURA = "islamic-umalqura";
        public static final java.lang.String PERSIAN = "persian";

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface CalendarTypes {
        }

        private CalendarType() {
        }
    }

    public static java.lang.String getCalendarType() {
        return getCalendarType(true);
    }

    public static java.lang.String getCalendarType(java.util.Locale locale) {
        return getCalendarType(locale, true);
    }

    public static java.lang.String getCalendarType(boolean z) {
        return getCalendarType(androidx.core.text.util.LocalePreferences.Api24Impl.getHighSpeedVideoFpsRanges(), z);
    }

    public static class TemperatureUnit {
        public static final java.lang.String CELSIUS = "celsius";
        public static final java.lang.String DEFAULT = "";
        public static final java.lang.String FAHRENHEIT = "fahrenhe";
        public static final java.lang.String KELVIN = "kelvin";

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface TemperatureUnits {
        }

        private TemperatureUnit() {
        }
    }

    public static java.lang.String getTemperatureUnit() {
        return getTemperatureUnit(true);
    }

    public static java.lang.String getTemperatureUnit(java.util.Locale locale) {
        return getTemperatureUnit(locale, true);
    }

    public static java.lang.String getTemperatureUnit(boolean z) {
        return getTemperatureUnit(androidx.core.text.util.LocalePreferences.Api24Impl.getHighSpeedVideoFpsRanges(), z);
    }

    public static class FirstDayOfWeek {
        public static final java.lang.String DEFAULT = "";
        public static final java.lang.String FRIDAY = "fri";
        public static final java.lang.String MONDAY = "mon";
        public static final java.lang.String SATURDAY = "sat";
        public static final java.lang.String SUNDAY = "sun";
        public static final java.lang.String THURSDAY = "thu";
        public static final java.lang.String TUESDAY = "tue";
        public static final java.lang.String WEDNESDAY = "wed";

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface Days {
        }

        private FirstDayOfWeek() {
        }
    }

    public static java.lang.String getFirstDayOfWeek() {
        return getFirstDayOfWeek(true);
    }

    public static java.lang.String getFirstDayOfWeek(java.util.Locale locale) {
        return getFirstDayOfWeek(locale, true);
    }

    public static java.lang.String getFirstDayOfWeek(boolean z) {
        return getFirstDayOfWeek(androidx.core.text.util.LocalePreferences.Api24Impl.getHighSpeedVideoFpsRanges(), z);
    }

    static class Api24Impl {
        static java.lang.String getHighSpeedVideoFpsRanges(java.util.Locale locale) {
            return android.icu.util.Calendar.getInstance(locale).getType();
        }

        static java.util.Locale getHighSpeedVideoFpsRanges() {
            return java.util.Locale.getDefault(java.util.Locale.Category.FORMAT);
        }

        private Api24Impl() {
        }
    }

    static class Api33Impl {
        static java.lang.String Camera2StreamConfigurationMap(java.util.Locale locale) {
            java.lang.String identifier = ((android.icu.number.UnlocalizedNumberFormatter) ((android.icu.number.UnlocalizedNumberFormatter) android.icu.number.NumberFormatter.with().usage("weather")).unit(android.icu.util.MeasureUnit.CELSIUS)).locale(locale).format(1L).getOutputUnit().getIdentifier();
            return identifier.startsWith(androidx.core.text.util.LocalePreferences.TemperatureUnit.FAHRENHEIT) ? androidx.core.text.util.LocalePreferences.TemperatureUnit.FAHRENHEIT : identifier;
        }

        static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.util.Locale locale) {
            return bZ_(android.icu.text.DateTimePatternGenerator.getInstance(locale).getDefaultHourCycle());
        }

        private static java.lang.String bZ_(android.icu.text.DateFormat.HourCycle hourCycle) {
            int i = androidx.core.text.util.LocalePreferences.AnonymousClass1.getHighSpeedVideoFpsRangesFor[hourCycle.ordinal()];
            if (i == 1) {
                return androidx.core.text.util.LocalePreferences.HourCycle.H11;
            }
            if (i == 2) {
                return androidx.core.text.util.LocalePreferences.HourCycle.H12;
            }
            if (i == 3) {
                return androidx.core.text.util.LocalePreferences.HourCycle.H23;
            }
            if (i == 4) {
                return androidx.core.text.util.LocalePreferences.HourCycle.H24;
            }
            return "";
        }

        private Api33Impl() {
        }
    }

    /* renamed from: androidx.core.text.util.LocalePreferences$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[android.icu.text.DateFormat.HourCycle.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[android.icu.text.DateFormat.HourCycle.HOUR_CYCLE_11.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[android.icu.text.DateFormat.HourCycle.HOUR_CYCLE_12.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[android.icu.text.DateFormat.HourCycle.HOUR_CYCLE_23.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[android.icu.text.DateFormat.HourCycle.HOUR_CYCLE_24.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private LocalePreferences() {
    }

    public static java.lang.String getCalendarType(java.util.Locale locale, boolean z) {
        java.lang.String unicodeLocaleType = locale.getUnicodeLocaleType("ca");
        if (unicodeLocaleType == null) {
            unicodeLocaleType = !z ? "" : null;
        }
        return unicodeLocaleType != null ? unicodeLocaleType : androidx.core.text.util.LocalePreferences.Api24Impl.getHighSpeedVideoFpsRanges(locale);
    }

    public static java.lang.String getFirstDayOfWeek(java.util.Locale locale, boolean z) {
        java.lang.String unicodeLocaleType = locale.getUnicodeLocaleType("fw");
        if (unicodeLocaleType == null) {
            unicodeLocaleType = !z ? "" : null;
        }
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        int firstDayOfWeek = java.util.Calendar.getInstance(locale).getFirstDayOfWeek();
        return (firstDayOfWeek <= 0 || firstDayOfWeek > 7) ? "" : new java.lang.String[]{androidx.core.text.util.LocalePreferences.FirstDayOfWeek.SUNDAY, androidx.core.text.util.LocalePreferences.FirstDayOfWeek.MONDAY, androidx.core.text.util.LocalePreferences.FirstDayOfWeek.TUESDAY, androidx.core.text.util.LocalePreferences.FirstDayOfWeek.WEDNESDAY, androidx.core.text.util.LocalePreferences.FirstDayOfWeek.THURSDAY, androidx.core.text.util.LocalePreferences.FirstDayOfWeek.FRIDAY, androidx.core.text.util.LocalePreferences.FirstDayOfWeek.SATURDAY}[firstDayOfWeek - 1];
    }

    public static java.lang.String getHourCycle(java.util.Locale locale, boolean z) {
        java.lang.String unicodeLocaleType = locale.getUnicodeLocaleType("hc");
        if (unicodeLocaleType == null) {
            unicodeLocaleType = !z ? "" : null;
        }
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.core.text.util.LocalePreferences.Api33Impl.getHighResolutionOutputSizeshNQ4ISI(locale);
        }
        return android.text.format.DateFormat.getBestDateTimePattern(locale, "jm").contains("H") ? androidx.core.text.util.LocalePreferences.HourCycle.H23 : androidx.core.text.util.LocalePreferences.HourCycle.H12;
    }

    public static java.lang.String getTemperatureUnit(java.util.Locale locale, boolean z) {
        java.lang.String unicodeLocaleType = locale.getUnicodeLocaleType(com.paypal.oslo.feature.inappcheckout.Constants.MERCHANT_PATH_MU);
        if (unicodeLocaleType == null) {
            unicodeLocaleType = !z ? "" : null;
        }
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.core.text.util.LocalePreferences.Api33Impl.Camera2StreamConfigurationMap(locale);
        }
        if (java.util.Arrays.binarySearch(Camera2StreamConfigurationMap, locale.getCountry()) >= 0) {
            return androidx.core.text.util.LocalePreferences.TemperatureUnit.FAHRENHEIT;
        }
        return androidx.core.text.util.LocalePreferences.TemperatureUnit.CELSIUS;
    }
}
