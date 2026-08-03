package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class Jb {
    public static final java.util.ArrayList a(android.content.res.Configuration configuration) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.LocaleList locales = configuration.getLocales();
        if (locales == null) {
            return arrayList;
        }
        int size = locales.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.util.Locale locale = locales.get(i2);
            if (locale != null) {
                arrayList.add(io.appmetrica.analytics.impl.Ge.a(locale));
            }
        }
        return arrayList;
    }
}
