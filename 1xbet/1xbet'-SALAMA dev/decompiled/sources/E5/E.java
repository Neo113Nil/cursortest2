package E5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f2265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f2268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2269g;

    public static E a(ArrayList arrayList) {
        E e7 = new E();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"url\" is null.");
        }
        e7.f2263a = str;
        e7.f2264b = (String) arrayList.get(1);
        Boolean bool = (Boolean) arrayList.get(2);
        if (bool == null) {
            throw new IllegalStateException("Nonnull field \"handleCodeInApp\" is null.");
        }
        e7.f2265c = bool;
        e7.f2266d = (String) arrayList.get(3);
        e7.f2267e = (String) arrayList.get(4);
        Boolean bool2 = (Boolean) arrayList.get(5);
        if (bool2 == null) {
            throw new IllegalStateException("Nonnull field \"androidInstallApp\" is null.");
        }
        e7.f2268f = bool2;
        e7.f2269g = (String) arrayList.get(6);
        return e7;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(this.f2263a);
        arrayList.add(this.f2264b);
        arrayList.add(this.f2265c);
        arrayList.add(this.f2266d);
        arrayList.add(this.f2267e);
        arrayList.add(this.f2268f);
        arrayList.add(this.f2269g);
        return arrayList;
    }
}
