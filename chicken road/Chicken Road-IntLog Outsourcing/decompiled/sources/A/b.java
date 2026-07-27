package A;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class b {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, f fVar) {
        fVar.getClass();
        configuration.setLocales(null);
    }
}
