package b1;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094a {

    /* renamed from: a, reason: collision with root package name */
    public final x0.e f2530a;

    /* renamed from: b, reason: collision with root package name */
    public final P0.AbstractActivityC0047e f2531b;

    public C0094a(P0.AbstractActivityC0047e abstractActivityC0047e, x0.e eVar) {
        Z0.h hVar = new Z0.h(14, this);
        this.f2531b = abstractActivityC0047e;
        this.f2530a = eVar;
        eVar.f8410c = hVar;
    }

    public static java.util.Locale a(java.lang.String str) {
        java.util.Locale.Builder builder = new java.util.Locale.Builder();
        java.lang.String[] split = str.replace('_', '-').split("-");
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

    public final void b(android.content.res.Configuration configuration) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(locales.get(i2));
        }
        x0.e eVar = this.f2530a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.util.Locale locale = (java.util.Locale) it.next();
            locale.getLanguage();
            locale.getCountry();
            locale.getVariant();
            arrayList2.add(locale.getLanguage());
            arrayList2.add(locale.getCountry());
            arrayList2.add(locale.getScript());
            arrayList2.add(locale.getVariant());
        }
        ((I0.b) eVar.f8409b).G("setLocale", arrayList2, null);
    }
}
