package androidx.appcompat.app;

/* loaded from: classes3.dex */
final class LocaleOverlayHelper {
    private LocaleOverlayHelper() {
    }

    static androidx.core.os.LocaleListCompat getHighSpeedVideoSizes(androidx.core.os.LocaleListCompat localeListCompat, androidx.core.os.LocaleListCompat localeListCompat2) {
        java.util.Locale locale;
        if (localeListCompat == null || localeListCompat.isEmpty()) {
            return androidx.core.os.LocaleListCompat.getEmptyLocaleList();
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (int i = 0; i < localeListCompat.size() + localeListCompat2.size(); i++) {
            if (i < localeListCompat.size()) {
                locale = localeListCompat.get(i);
            } else {
                locale = localeListCompat2.get(i - localeListCompat.size());
            }
            if (locale != null) {
                linkedHashSet.add(locale);
            }
        }
        return androidx.core.os.LocaleListCompat.create((java.util.Locale[]) linkedHashSet.toArray(new java.util.Locale[linkedHashSet.size()]));
    }
}
