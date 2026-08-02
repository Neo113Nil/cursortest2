package i;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class p {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static L.j b(Configuration configuration) {
        return L.j.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(L.j jVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(jVar.f4186a.f4187a.toLanguageTags()));
    }

    public static void d(Configuration configuration, L.j jVar) {
        configuration.setLocales(LocaleList.forLanguageTags(jVar.f4186a.f4187a.toLanguageTags()));
    }
}
