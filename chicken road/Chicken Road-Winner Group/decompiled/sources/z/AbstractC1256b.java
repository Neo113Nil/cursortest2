package z;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1256b {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, d dVar) {
        dVar.getClass();
        configuration.setLocales(null);
    }
}
