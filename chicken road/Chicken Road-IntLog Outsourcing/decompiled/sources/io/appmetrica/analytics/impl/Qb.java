package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class Qb {
    public static final ArrayList a(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        if (locales == null) {
            return arrayList;
        }
        int size = locales.size();
        for (int i2 = 0; i2 < size; i2++) {
            Locale locale = locales.get(i2);
            if (locale != null) {
                arrayList.add(Le.a(locale));
            }
        }
        return arrayList;
    }
}
