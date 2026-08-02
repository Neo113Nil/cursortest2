package p;

import android.os.LocaleList;

/* renamed from: p.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1522i {
    public static String a() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }
}
