package androidx.core.app;

/* loaded from: classes7.dex */
public final class LocaleManagerCompat {
    private LocaleManagerCompat() {
    }

    public static androidx.core.os.LocaleListCompat getSystemLocales(android.content.Context context) {
        androidx.core.os.LocaleListCompat emptyLocaleList = androidx.core.os.LocaleListCompat.getEmptyLocaleList();
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(context);
            return highSpeedVideoFpsRangesFor != null ? androidx.core.os.LocaleListCompat.wrap(androidx.core.app.LocaleManagerCompat.Api33Impl.getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor)) : emptyLocaleList;
        }
        return getHighResolutionOutputSizeshNQ4ISI(android.content.res.Resources.getSystem().getConfiguration());
    }

    public static androidx.core.os.LocaleListCompat getApplicationLocales(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(context);
            if (highSpeedVideoFpsRangesFor != null) {
                return androidx.core.os.LocaleListCompat.wrap(androidx.core.app.LocaleManagerCompat.Api33Impl.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor));
            }
            return androidx.core.os.LocaleListCompat.getEmptyLocaleList();
        }
        return androidx.core.os.LocaleListCompat.forLanguageTags(androidx.core.app.AppLocalesStorageHelper.readLocales(context));
    }

    private static java.lang.Object getHighSpeedVideoFpsRangesFor(android.content.Context context) {
        return context.getSystemService("locale");
    }

    static androidx.core.os.LocaleListCompat getHighResolutionOutputSizeshNQ4ISI(android.content.res.Configuration configuration) {
        return androidx.core.app.LocaleManagerCompat.Api24Impl.Camera2StreamConfigurationMap(configuration);
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static androidx.core.os.LocaleListCompat Camera2StreamConfigurationMap(android.content.res.Configuration configuration) {
            return androidx.core.os.LocaleListCompat.forLanguageTags(configuration.getLocales().toLanguageTags());
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static android.os.LocaleList getHighSpeedVideoSizes(java.lang.Object obj) {
            return ((android.app.LocaleManager) obj).getSystemLocales();
        }

        static android.os.LocaleList getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
            return ((android.app.LocaleManager) obj).getApplicationLocales();
        }
    }
}
