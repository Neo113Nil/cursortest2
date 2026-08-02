package B5;

import A5.s;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import w1.C1761y0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final w f1200a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1201b;

    public a(Context context, w wVar) {
        C1761y0 c1761y0 = new C1761y0(this, 1);
        this.f1201b = context;
        this.f1200a = wVar;
        wVar.f11336c = c1761y0;
    }

    public static Locale a(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        String str4 = "";
        int i7 = 1;
        if (split.length <= 1 || split[1].length() != 4) {
            str2 = "";
        } else {
            str2 = split[1];
            i7 = 2;
        }
        if (split.length > i7 && split[i7].length() >= 2 && split[i7].length() <= 3) {
            str4 = split[i7];
        }
        return new Locale(str3, str4, str2);
    }

    public final void b(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(locales.get(i7));
        }
        w wVar = this.f1200a;
        wVar.getClass();
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
        ((s) wVar.f11335b).a("setLocale", arrayList2, null);
    }
}
