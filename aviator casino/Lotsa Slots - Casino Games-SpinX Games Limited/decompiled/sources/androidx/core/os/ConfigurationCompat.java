package androidx.core.os;

/* loaded from: classes.dex */
public final class ConfigurationCompat {
    private ConfigurationCompat() {
    }

    public static androidx.core.os.LocaleListCompat getLocales(android.content.res.Configuration configuration) {
        return android.os.Build.VERSION.SDK_INT >= 24 ? androidx.core.os.LocaleListCompat.wrap(androidx.core.os.ConfigurationCompat.Api24Impl.getLocales(configuration)) : androidx.core.os.LocaleListCompat.create(configuration.locale);
    }

    public static void setLocales(android.content.res.Configuration configuration, androidx.core.os.LocaleListCompat localeListCompat) {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            androidx.core.os.ConfigurationCompat.Api24Impl.setLocales(configuration, localeListCompat);
        } else {
            if (localeListCompat.isEmpty()) {
                return;
            }
            configuration.setLocale(localeListCompat.get(0));
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static android.os.LocaleList getLocales(android.content.res.Configuration configuration) {
            return configuration.getLocales();
        }

        static void setLocales(android.content.res.Configuration configuration, androidx.core.os.LocaleListCompat localeListCompat) {
            configuration.setLocales((android.os.LocaleList) localeListCompat.unwrap());
        }
    }
}
