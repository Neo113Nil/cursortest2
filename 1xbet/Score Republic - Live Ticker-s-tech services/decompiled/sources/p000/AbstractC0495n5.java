package p000;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: renamed from: n5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0495n5 {
    /* JADX INFO: renamed from: a */
    public static void m3478a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* JADX INFO: renamed from: b */
    public static tj0 m3479b(Configuration configuration) {
        return tj0.m4790a(configuration.getLocales().toLanguageTags());
    }

    /* JADX INFO: renamed from: c */
    public static void m3480c(tj0 tj0Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(tj0Var.f7456a.f7828a.toLanguageTags()));
    }

    /* JADX INFO: renamed from: d */
    public static void m3481d(Configuration configuration, tj0 tj0Var) {
        configuration.setLocales(LocaleList.forLanguageTags(tj0Var.f7456a.f7828a.toLanguageTags()));
    }
}
