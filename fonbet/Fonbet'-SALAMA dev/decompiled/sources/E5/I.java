package E5;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public String f2284a;

    /* renamed from: b, reason: collision with root package name */
    public Long f2285b;

    /* renamed from: c, reason: collision with root package name */
    public Long f2286c;

    /* renamed from: d, reason: collision with root package name */
    public Long f2287d;

    /* renamed from: e, reason: collision with root package name */
    public String f2288e;

    /* renamed from: f, reason: collision with root package name */
    public Map f2289f;

    /* renamed from: g, reason: collision with root package name */
    public String f2290g;

    public static I a(ArrayList arrayList) {
        Long valueOf;
        Long valueOf2;
        I i7 = new I();
        i7.f2284a = (String) arrayList.get(0);
        Object obj = arrayList.get(1);
        Long l7 = null;
        if (obj == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
        }
        i7.f2285b = valueOf;
        Object obj2 = arrayList.get(2);
        if (obj2 == null) {
            valueOf2 = null;
        } else {
            valueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
        }
        i7.f2286c = valueOf2;
        Object obj3 = arrayList.get(3);
        if (obj3 != null) {
            l7 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
        }
        i7.f2287d = l7;
        i7.f2288e = (String) arrayList.get(4);
        i7.f2289f = (Map) arrayList.get(5);
        i7.f2290g = (String) arrayList.get(6);
        return i7;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(this.f2284a);
        arrayList.add(this.f2285b);
        arrayList.add(this.f2286c);
        arrayList.add(this.f2287d);
        arrayList.add(this.f2288e);
        arrayList.add(this.f2289f);
        arrayList.add(this.f2290g);
        return arrayList;
    }
}
