package androidx.core.text.util;

/* loaded from: classes.dex */
public final class LocalePreferences {
    private static final java.lang.String TAG = "LocalePreferences";
    private static final java.lang.String[] WEATHER_FAHRENHEIT_COUNTRIES = {"BS", "BZ", "KY", "PR", "PW", "US"};

    public static class HourCycle {
        public static final java.lang.String DEFAULT = "";
        public static final java.lang.String H11 = "h11";
        public static final java.lang.String H12 = "h12";
        public static final java.lang.String H23 = "h23";
        public static final java.lang.String H24 = "h24";
        private static final java.lang.String U_EXTENSION_TAG = "hc";

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
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
        java.util.Locale defaultLocale;
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            defaultLocale = androidx.core.text.util.LocalePreferences.Api24Impl.getDefaultLocale();
        } else {
            defaultLocale = getDefaultLocale();
        }
        return getHourCycle(defaultLocale, z);
    }

    public static java.lang.String getHourCycle(java.util.Locale locale, boolean z) {
        java.lang.String unicodeLocaleType = getUnicodeLocaleType("hc", "", locale, z);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.core.text.util.LocalePreferences.Api33Impl.getHourCycle(locale);
        }
        return getBaseHourCycle(locale);
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
        private static final java.lang.String U_EXTENSION_TAG = "ca";

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
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
        java.util.Locale defaultLocale;
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            defaultLocale = androidx.core.text.util.LocalePreferences.Api24Impl.getDefaultLocale();
        } else {
            defaultLocale = getDefaultLocale();
        }
        return getCalendarType(defaultLocale, z);
    }

    public static java.lang.String getCalendarType(java.util.Locale locale, boolean z) {
        java.lang.String unicodeLocaleType = getUnicodeLocaleType("ca", "", locale, z);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return androidx.core.text.util.LocalePreferences.Api24Impl.getCalendarType(locale);
        }
        return z ? androidx.core.text.util.LocalePreferences.CalendarType.GREGORIAN : "";
    }

    public static class TemperatureUnit {
        public static final java.lang.String CELSIUS = "celsius";
        public static final java.lang.String DEFAULT = "";
        public static final java.lang.String FAHRENHEIT = "fahrenhe";
        public static final java.lang.String KELVIN = "kelvin";
        private static final java.lang.String U_EXTENSION_TAG = "mu";

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
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
        java.util.Locale defaultLocale;
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            defaultLocale = androidx.core.text.util.LocalePreferences.Api24Impl.getDefaultLocale();
        } else {
            defaultLocale = getDefaultLocale();
        }
        return getTemperatureUnit(defaultLocale, z);
    }

    public static java.lang.String getTemperatureUnit(java.util.Locale locale, boolean z) {
        java.lang.String unicodeLocaleType = getUnicodeLocaleType("mu", "", locale, z);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.core.text.util.LocalePreferences.Api33Impl.getResolvedTemperatureUnit(locale);
        }
        return getTemperatureHardCoded(locale);
    }

    public static class FirstDayOfWeek {
        public static final java.lang.String DEFAULT = "";
        public static final java.lang.String FRIDAY = "fri";
        public static final java.lang.String MONDAY = "mon";
        public static final java.lang.String SATURDAY = "sat";
        public static final java.lang.String SUNDAY = "sun";
        public static final java.lang.String THURSDAY = "thu";
        public static final java.lang.String TUESDAY = "tue";
        private static final java.lang.String U_EXTENSION_TAG = "fw";
        public static final java.lang.String WEDNESDAY = "wed";

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
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
        java.util.Locale defaultLocale;
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            defaultLocale = androidx.core.text.util.LocalePreferences.Api24Impl.getDefaultLocale();
        } else {
            defaultLocale = getDefaultLocale();
        }
        return getFirstDayOfWeek(defaultLocale, z);
    }

    public static java.lang.String getFirstDayOfWeek(java.util.Locale locale, boolean z) {
        java.lang.String unicodeLocaleType = getUnicodeLocaleType("fw", "", locale, z);
        return unicodeLocaleType != null ? unicodeLocaleType : getBaseFirstDayOfWeek(locale);
    }

    private static java.lang.String getUnicodeLocaleType(java.lang.String str, java.lang.String str2, java.util.Locale locale, boolean z) {
        java.lang.String unicodeLocaleType = locale.getUnicodeLocaleType(str);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (z) {
            return null;
        }
        return str2;
    }

    private static java.lang.String getTemperatureHardCoded(java.util.Locale locale) {
        if (java.util.Arrays.binarySearch(WEATHER_FAHRENHEIT_COUNTRIES, locale.getCountry()) >= 0) {
            return androidx.core.text.util.LocalePreferences.TemperatureUnit.FAHRENHEIT;
        }
        return androidx.core.text.util.LocalePreferences.TemperatureUnit.CELSIUS;
    }

    private static java.lang.String getBaseHourCycle(java.util.Locale locale) {
        return android.text.format.DateFormat.getBestDateTimePattern(locale, "jm").contains("H") ? androidx.core.text.util.LocalePreferences.HourCycle.H23 : androidx.core.text.util.LocalePreferences.HourCycle.H12;
    }

    private static java.lang.String getBaseFirstDayOfWeek(java.util.Locale locale) {
        return getStringOfFirstDayOfWeek(java.util.Calendar.getInstance(locale).getFirstDayOfWeek());
    }

    private static java.lang.String getStringOfFirstDayOfWeek(int i) {
        return (i < 1 || i > 7) ? "" : new java.lang.String[]{androidx.core.text.util.LocalePreferences.FirstDayOfWeek.SUNDAY, androidx.core.text.util.LocalePreferences.FirstDayOfWeek.MONDAY, androidx.core.text.util.LocalePreferences.FirstDayOfWeek.TUESDAY, androidx.core.text.util.LocalePreferences.FirstDayOfWeek.WEDNESDAY, androidx.core.text.util.LocalePreferences.FirstDayOfWeek.THURSDAY, androidx.core.text.util.LocalePreferences.FirstDayOfWeek.FRIDAY, androidx.core.text.util.LocalePreferences.FirstDayOfWeek.SATURDAY}[i - 1];
    }

    private static java.util.Locale getDefaultLocale() {
        return java.util.Locale.getDefault();
    }

    private static class Api24Impl {
        static java.lang.String getCalendarType(java.util.Locale locale) {
            return android.icu.util.Calendar.getInstance(locale).getType();
        }

        static java.util.Locale getDefaultLocale() {
            return java.util.Locale.getDefault(java.util.Locale.Category.FORMAT);
        }

        private Api24Impl() {
        }
    }

    private static class Api33Impl {
        static java.lang.String getResolvedTemperatureUnit(java.util.Locale locale) {
            java.lang.String identifier = ((android.icu.number.UnlocalizedNumberFormatter) ((android.icu.number.UnlocalizedNumberFormatter) android.icu.number.NumberFormatter.with().usage("weather")).unit(android.icu.util.MeasureUnit.CELSIUS)).locale(locale).format(1L).getOutputUnit().getIdentifier();
            return identifier.startsWith(androidx.core.text.util.LocalePreferences.TemperatureUnit.FAHRENHEIT) ? androidx.core.text.util.LocalePreferences.TemperatureUnit.FAHRENHEIT : identifier;
        }

        static java.lang.String getHourCycle(java.util.Locale locale) {
            return getHourCycleType(android.icu.text.DateTimePatternGenerator.getInstance(locale).getDefaultHourCycle());
        }

        private static java.lang.String getHourCycleType(android.icu.text.DateFormat.HourCycle hourCycle) {
            int i = androidx.core.text.util.LocalePreferences.AnonymousClass1.$SwitchMap$android$icu$text$DateFormat$HourCycle[hourCycle.ordinal()];
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
        static final /* synthetic */ int[] $SwitchMap$android$icu$text$DateFormat$HourCycle;

        static {
            int[] iArr = new int[android.icu.text.DateFormat.HourCycle.values().length];
            $SwitchMap$android$icu$text$DateFormat$HourCycle = iArr;
            try {
                iArr[android.icu.text.DateFormat.HourCycle.HOUR_CYCLE_11.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$icu$text$DateFormat$HourCycle[android.icu.text.DateFormat.HourCycle.HOUR_CYCLE_12.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$icu$text$DateFormat$HourCycle[android.icu.text.DateFormat.HourCycle.HOUR_CYCLE_23.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$icu$text$DateFormat$HourCycle[android.icu.text.DateFormat.HourCycle.HOUR_CYCLE_24.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private LocalePreferences() {
    }
}
