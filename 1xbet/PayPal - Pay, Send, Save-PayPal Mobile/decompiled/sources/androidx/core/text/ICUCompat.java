package androidx.core.text;

/* loaded from: classes7.dex */
public final class ICUCompat {
    public static java.lang.String maximizeAndGetScript(java.util.Locale locale) {
        return androidx.core.text.ICUCompat.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(androidx.core.text.ICUCompat.Api24Impl.getHighSpeedVideoFpsRanges(androidx.core.text.ICUCompat.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(locale)));
    }

    private ICUCompat() {
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static android.icu.util.ULocale getHighResolutionOutputSizeshNQ4ISI(java.util.Locale locale) {
            return android.icu.util.ULocale.forLocale(locale);
        }

        static android.icu.util.ULocale getHighSpeedVideoFpsRanges(java.lang.Object obj) {
            return android.icu.util.ULocale.addLikelySubtags((android.icu.util.ULocale) obj);
        }

        static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
            return ((android.icu.util.ULocale) obj).getScript();
        }
    }
}
