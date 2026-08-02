package androidx.core.os;

/* loaded from: classes3.dex */
public final class LocaleListCompat {
    private static final androidx.core.os.LocaleListCompat getHighResolutionOutputSizeshNQ4ISI = create(new java.util.Locale[0]);
    private final androidx.core.os.LocaleListInterface getHighSpeedVideoFpsRanges;

    private LocaleListCompat(androidx.core.os.LocaleListInterface localeListInterface) {
        this.getHighSpeedVideoFpsRanges = localeListInterface;
    }

    @java.lang.Deprecated
    public static androidx.core.os.LocaleListCompat wrap(java.lang.Object obj) {
        return wrap((android.os.LocaleList) obj);
    }

    public static androidx.core.os.LocaleListCompat wrap(android.os.LocaleList localeList) {
        return new androidx.core.os.LocaleListCompat(new androidx.core.os.LocaleListPlatformWrapper(localeList));
    }

    public final java.lang.Object unwrap() {
        return this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI();
    }

    public static androidx.core.os.LocaleListCompat create(java.util.Locale... localeArr) {
        return wrap(androidx.core.os.LocaleListCompat.Api24Impl.Camera2StreamConfigurationMap(localeArr));
    }

    public final java.util.Locale get(int i) {
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(i);
    }

    public final boolean isEmpty() {
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes();
    }

    public final int size() {
        return this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap();
    }

    public final int indexOf(java.util.Locale locale) {
        return this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(locale);
    }

    public final java.lang.String toLanguageTags() {
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges();
    }

    public final java.util.Locale getFirstMatch(java.lang.String[] strArr) {
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(strArr);
    }

    public static androidx.core.os.LocaleListCompat getEmptyLocaleList() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static androidx.core.os.LocaleListCompat forLanguageTags(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return getEmptyLocaleList();
        }
        java.lang.String[] split = str.split(",", -1);
        int length = split.length;
        java.util.Locale[] localeArr = new java.util.Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = java.util.Locale.forLanguageTag(split[i]);
        }
        return create(localeArr);
    }

    static java.util.Locale getHighSpeedVideoFpsRanges(java.lang.String str) {
        if (str.contains("-")) {
            java.lang.String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new java.util.Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new java.util.Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new java.util.Locale(split[0]);
            }
        } else if (str.contains("_")) {
            java.lang.String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new java.util.Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new java.util.Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new java.util.Locale(split2[0]);
            }
        } else {
            return new java.util.Locale(str);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Can not parse language tag: [");
        sb.append(str);
        sb.append("]");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static androidx.core.os.LocaleListCompat getAdjustedDefault() {
        return wrap(androidx.core.os.LocaleListCompat.Api24Impl.getHighSpeedVideoFpsRanges());
    }

    public static androidx.core.os.LocaleListCompat getDefault() {
        return wrap(androidx.core.os.LocaleListCompat.Api24Impl.getHighSpeedVideoFpsRangesFor());
    }

    public static boolean matchesLanguageAndScript(java.util.Locale locale, java.util.Locale locale2) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return android.os.LocaleList.matchesLanguageAndScript(locale, locale2);
        }
        return androidx.core.os.LocaleListCompat.Api21Impl.getHighSpeedVideoFpsRanges(locale, locale2);
    }

    /* loaded from: classes7.dex */
    static class Api21Impl {
        private static final java.util.Locale[] getHighSpeedVideoFpsRangesFor = {new java.util.Locale("en", "XA"), new java.util.Locale("ar", "XB")};

        private Api21Impl() {
        }

        static boolean getHighSpeedVideoFpsRanges(java.util.Locale locale, java.util.Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || Camera2StreamConfigurationMap(locale) || Camera2StreamConfigurationMap(locale2)) {
                return false;
            }
            java.lang.String maximizeAndGetScript = androidx.core.text.ICUCompat.maximizeAndGetScript(locale);
            if (maximizeAndGetScript.isEmpty()) {
                java.lang.String country = locale.getCountry();
                return country.isEmpty() || country.equals(locale2.getCountry());
            }
            return maximizeAndGetScript.equals(androidx.core.text.ICUCompat.maximizeAndGetScript(locale2));
        }

        private static boolean Camera2StreamConfigurationMap(java.util.Locale locale) {
            for (java.util.Locale locale2 : getHighSpeedVideoFpsRangesFor) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof androidx.core.os.LocaleListCompat) && this.getHighSpeedVideoFpsRanges.equals(((androidx.core.os.LocaleListCompat) obj).getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRanges.toString();
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static android.os.LocaleList Camera2StreamConfigurationMap(java.util.Locale... localeArr) {
            return new android.os.LocaleList(localeArr);
        }

        static android.os.LocaleList getHighSpeedVideoFpsRanges() {
            return android.os.LocaleList.getAdjustedDefault();
        }

        static android.os.LocaleList getHighSpeedVideoFpsRangesFor() {
            return android.os.LocaleList.getDefault();
        }
    }
}
