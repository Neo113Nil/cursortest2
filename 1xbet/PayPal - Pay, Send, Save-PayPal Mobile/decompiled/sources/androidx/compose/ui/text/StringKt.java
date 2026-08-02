package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0003\u0010\n\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\n\u001a\u0019\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n\u001a\u0019\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0007\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"", "Landroidx/compose/ui/text/intl/Locale;", "locale", "toUpperCase", "(Ljava/lang/String;Landroidx/compose/ui/text/intl/Locale;)Ljava/lang/String;", "toLowerCase", "capitalize", "decapitalize", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "(Ljava/lang/String;Landroidx/compose/ui/text/intl/LocaleList;)Ljava/lang/String;", "Landroidx/compose/ui/text/PlatformStringDelegate;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/text/PlatformStringDelegate;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StringKt {
    private static final androidx.compose.ui.text.PlatformStringDelegate Camera2StreamConfigurationMap = androidx.compose.ui.text.platform.AndroidStringDelegate_androidKt.ActualStringDelegate();

    public static final java.lang.String toUpperCase(java.lang.String str, androidx.compose.ui.text.intl.Locale locale) {
        return Camera2StreamConfigurationMap.toUpperCase(str, locale.getPlatformLocale());
    }

    public static final java.lang.String toLowerCase(java.lang.String str, androidx.compose.ui.text.intl.Locale locale) {
        return Camera2StreamConfigurationMap.toLowerCase(str, locale.getPlatformLocale());
    }

    public static final java.lang.String capitalize(java.lang.String str, androidx.compose.ui.text.intl.Locale locale) {
        return Camera2StreamConfigurationMap.capitalize(str, locale.getPlatformLocale());
    }

    public static final java.lang.String decapitalize(java.lang.String str, androidx.compose.ui.text.intl.Locale locale) {
        return Camera2StreamConfigurationMap.decapitalize(str, locale.getPlatformLocale());
    }

    public static final java.lang.String toUpperCase(java.lang.String str, androidx.compose.ui.text.intl.LocaleList localeList) {
        return toUpperCase(str, localeList.isEmpty() ? androidx.compose.ui.text.intl.Locale.INSTANCE.getCurrent() : localeList.get(0));
    }

    public static final java.lang.String toLowerCase(java.lang.String str, androidx.compose.ui.text.intl.LocaleList localeList) {
        return toLowerCase(str, localeList.isEmpty() ? androidx.compose.ui.text.intl.Locale.INSTANCE.getCurrent() : localeList.get(0));
    }

    public static final java.lang.String capitalize(java.lang.String str, androidx.compose.ui.text.intl.LocaleList localeList) {
        return capitalize(str, localeList.isEmpty() ? androidx.compose.ui.text.intl.Locale.INSTANCE.getCurrent() : localeList.get(0));
    }

    public static final java.lang.String decapitalize(java.lang.String str, androidx.compose.ui.text.intl.LocaleList localeList) {
        return decapitalize(str, localeList.isEmpty() ? androidx.compose.ui.text.intl.Locale.INSTANCE.getCurrent() : localeList.get(0));
    }
}
