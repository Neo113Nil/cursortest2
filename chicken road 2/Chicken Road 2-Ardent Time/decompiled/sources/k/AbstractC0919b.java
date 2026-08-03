package k;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0919b {
    public static java.lang.String a() {
        android.os.LocaleList adjustedDefault = android.os.LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }
}
