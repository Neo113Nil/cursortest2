package E5;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public String f2312a;

    /* renamed from: b, reason: collision with root package name */
    public String f2313b;

    /* renamed from: c, reason: collision with root package name */
    public String f2314c;

    /* renamed from: d, reason: collision with root package name */
    public String f2315d;

    /* renamed from: e, reason: collision with root package name */
    public String f2316e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f2317f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f2318g;

    /* renamed from: h, reason: collision with root package name */
    public String f2319h;

    /* renamed from: i, reason: collision with root package name */
    public String f2320i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public Long f2321k;

    /* renamed from: l, reason: collision with root package name */
    public Long f2322l;

    public static Q a(ArrayList arrayList) {
        Long valueOf;
        Q q7 = new Q();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"uid\" is null.");
        }
        q7.f2312a = str;
        q7.f2313b = (String) arrayList.get(1);
        q7.f2314c = (String) arrayList.get(2);
        q7.f2315d = (String) arrayList.get(3);
        q7.f2316e = (String) arrayList.get(4);
        Boolean bool = (Boolean) arrayList.get(5);
        if (bool == null) {
            throw new IllegalStateException("Nonnull field \"isAnonymous\" is null.");
        }
        q7.f2317f = bool;
        Boolean bool2 = (Boolean) arrayList.get(6);
        if (bool2 == null) {
            throw new IllegalStateException("Nonnull field \"isEmailVerified\" is null.");
        }
        q7.f2318g = bool2;
        q7.f2319h = (String) arrayList.get(7);
        q7.f2320i = (String) arrayList.get(8);
        q7.j = (String) arrayList.get(9);
        Object obj = arrayList.get(10);
        Long l7 = null;
        if (obj == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
        }
        q7.f2321k = valueOf;
        Object obj2 = arrayList.get(11);
        if (obj2 != null) {
            l7 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
        }
        q7.f2322l = l7;
        return q7;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(12);
        arrayList.add(this.f2312a);
        arrayList.add(this.f2313b);
        arrayList.add(this.f2314c);
        arrayList.add(this.f2315d);
        arrayList.add(this.f2316e);
        arrayList.add(this.f2317f);
        arrayList.add(this.f2318g);
        arrayList.add(this.f2319h);
        arrayList.add(this.f2320i);
        arrayList.add(this.j);
        arrayList.add(this.f2321k);
        arrayList.add(this.f2322l);
        return arrayList;
    }
}
