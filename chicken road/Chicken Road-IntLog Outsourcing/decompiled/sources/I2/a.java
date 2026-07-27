package I2;

import B0.c;
import B1.g;
import H2.o;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import w2.AbstractActivityC1515c;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c f1269a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractActivityC1515c f1270b;

    public a(AbstractActivityC1515c abstractActivityC1515c, c cVar) {
        g gVar = new g(20, this);
        this.f1270b = abstractActivityC1515c;
        this.f1269a = cVar;
        cVar.f141c = gVar;
    }

    public static Locale a(String str) {
        Locale.Builder builder = new Locale.Builder();
        String[] split = str.replace('_', '-').split("-");
        builder.setLanguage(split[0]);
        int i2 = 1;
        if (split.length > 1 && split[1].length() == 4) {
            builder.setScript(split[1]);
            i2 = 2;
        }
        if (split.length > i2 && split[i2].length() >= 2 && split[i2].length() <= 3) {
            builder.setRegion(split[i2]);
        }
        return builder.build();
    }

    public final void b(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(locales.get(i2));
        }
        c cVar = this.f1269a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Locale locale = (Locale) it.next();
            locale.getLanguage();
            locale.getCountry();
            locale.getVariant();
            arrayList2.add(locale.getLanguage());
            arrayList2.add(locale.getCountry());
            arrayList2.add(locale.getScript());
            arrayList2.add(locale.getVariant());
        }
        ((o) cVar.f140b).a("setLocale", arrayList2, null);
    }
}
