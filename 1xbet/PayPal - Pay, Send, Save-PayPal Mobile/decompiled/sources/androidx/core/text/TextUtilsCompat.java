package androidx.core.text;

/* loaded from: classes7.dex */
public final class TextUtilsCompat {
    public static java.lang.String htmlEncode(java.lang.String str) {
        return android.text.TextUtils.htmlEncode(str);
    }

    public static int getLayoutDirectionFromLocale(java.util.Locale locale) {
        return android.text.TextUtils.getLayoutDirectionFromLocale(locale);
    }

    private TextUtilsCompat() {
    }
}
