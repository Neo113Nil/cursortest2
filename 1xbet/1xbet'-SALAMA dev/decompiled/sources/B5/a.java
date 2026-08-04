package B5;

import A5.s;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.Locale;
import p155w1.C1052y0;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f1200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f1201b;

    public a(Context context, w wVar) {
        C1052y0 c1052y0 = new C1052y0(this, 1);
        this.f1201b = context;
        this.f1200a = wVar;
        wVar.f11336c = c1052y0;
    }

    public static Locale a(String str) {
        String str2;
        String[] strArrSplit = str.replace('_', '-').split("-", -1);
        String str3 = strArrSplit[0];
        String str4 = "";
        int i7 = 1;
        if (strArrSplit.length <= 1 || strArrSplit[1].length() != 4) {
            str2 = "";
        } else {
            str2 = strArrSplit[1];
            i7 = 2;
        }
        if (strArrSplit.length > i7 && strArrSplit[i7].length() >= 2 && strArrSplit[i7].length() <= 3) {
            str4 = strArrSplit[i7];
        }
        return new Locale(str3, str4, str2);
    }

    public final void b(Configuration configuration) {
        ArrayList<Locale> arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(locales.get(i7));
        }
        w wVar = this.f1200a;
        wVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Locale locale : arrayList) {
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
