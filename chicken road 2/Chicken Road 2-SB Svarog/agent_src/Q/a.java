package Q;

import E.b;
import F.t;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C.a f372a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f373b;

    public a(Context context, C.a aVar) {
        t tVar = new t(24, this);
        this.f373b = context;
        this.f372a = aVar;
        aVar.f5d = tVar;
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
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(locales.get(i3));
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            Locale locale = (Locale) obj;
            locale.getLanguage();
            locale.getCountry();
            locale.getVariant();
            arrayList2.add(locale.getLanguage());
            arrayList2.add(locale.getCountry());
            arrayList2.add(locale.getScript());
            arrayList2.add(locale.getVariant());
        }
        ((b) this.f372a.f4c).e("setLocale", arrayList2, null);
    }
}
