package androidx.core.text;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\"\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/Locale;", "", "getLayoutDirection", "(Ljava/util/Locale;)I", "layoutDirection"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LocaleKt {
    public static final int getLayoutDirection(java.util.Locale locale) {
        return android.text.TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
