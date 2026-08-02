package q;

import android.os.LocaleList;

/* renamed from: q.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2292g {
    public static String a() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }
}
