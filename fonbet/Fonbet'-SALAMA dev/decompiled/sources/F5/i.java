package F5;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public String f2768a;

    /* renamed from: b, reason: collision with root package name */
    public String f2769b;

    /* renamed from: c, reason: collision with root package name */
    public String f2770c;

    /* renamed from: d, reason: collision with root package name */
    public String f2771d;

    /* renamed from: e, reason: collision with root package name */
    public String f2772e;

    /* renamed from: f, reason: collision with root package name */
    public String f2773f;

    /* renamed from: g, reason: collision with root package name */
    public String f2774g;

    /* renamed from: h, reason: collision with root package name */
    public String f2775h;

    /* renamed from: i, reason: collision with root package name */
    public String f2776i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public String f2777k;

    /* renamed from: l, reason: collision with root package name */
    public String f2778l;

    /* renamed from: m, reason: collision with root package name */
    public String f2779m;

    /* renamed from: n, reason: collision with root package name */
    public String f2780n;

    public static i a(ArrayList arrayList) {
        i iVar = new i();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        }
        iVar.f2768a = str;
        String str2 = (String) arrayList.get(1);
        if (str2 == null) {
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }
        iVar.f2769b = str2;
        String str3 = (String) arrayList.get(2);
        if (str3 == null) {
            throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
        }
        iVar.f2770c = str3;
        String str4 = (String) arrayList.get(3);
        if (str4 == null) {
            throw new IllegalStateException("Nonnull field \"projectId\" is null.");
        }
        iVar.f2771d = str4;
        iVar.f2772e = (String) arrayList.get(4);
        iVar.f2773f = (String) arrayList.get(5);
        iVar.f2774g = (String) arrayList.get(6);
        iVar.f2775h = (String) arrayList.get(7);
        iVar.f2776i = (String) arrayList.get(8);
        iVar.j = (String) arrayList.get(9);
        iVar.f2777k = (String) arrayList.get(10);
        iVar.f2778l = (String) arrayList.get(11);
        iVar.f2779m = (String) arrayList.get(12);
        iVar.f2780n = (String) arrayList.get(13);
        return iVar;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(14);
        arrayList.add(this.f2768a);
        arrayList.add(this.f2769b);
        arrayList.add(this.f2770c);
        arrayList.add(this.f2771d);
        arrayList.add(this.f2772e);
        arrayList.add(this.f2773f);
        arrayList.add(this.f2774g);
        arrayList.add(this.f2775h);
        arrayList.add(this.f2776i);
        arrayList.add(this.j);
        arrayList.add(this.f2777k);
        arrayList.add(this.f2778l);
        arrayList.add(this.f2779m);
        arrayList.add(this.f2780n);
        return arrayList;
    }
}
