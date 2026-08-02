package androidx.core.os;

/* loaded from: classes3.dex */
public final class ConfigurationCompat {
    private ConfigurationCompat() {
    }

    public static androidx.core.os.LocaleListCompat getLocales(android.content.res.Configuration configuration) {
        return androidx.core.os.LocaleListCompat.wrap(androidx.core.os.ConfigurationCompat.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(configuration));
    }

    public static void setLocales(android.content.res.Configuration configuration, androidx.core.os.LocaleListCompat localeListCompat) {
        androidx.core.os.ConfigurationCompat.Api24Impl.Camera2StreamConfigurationMap(configuration, localeListCompat);
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static android.os.LocaleList getHighResolutionOutputSizeshNQ4ISI(android.content.res.Configuration configuration) {
            return configuration.getLocales();
        }

        static void Camera2StreamConfigurationMap(android.content.res.Configuration configuration, androidx.core.os.LocaleListCompat localeListCompat) {
            configuration.setLocales((android.os.LocaleList) localeListCompat.unwrap());
        }
    }
}
