package E5;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public Long f2302a;

    /* renamed from: b, reason: collision with root package name */
    public Long f2303b;

    /* renamed from: c, reason: collision with root package name */
    public Long f2304c;

    /* renamed from: d, reason: collision with root package name */
    public String f2305d;

    /* renamed from: e, reason: collision with root package name */
    public String f2306e;

    public static N a(ArrayList arrayList) {
        Long valueOf;
        Long valueOf2;
        N n2 = new N();
        Object obj = arrayList.get(0);
        Long l7 = null;
        if (obj == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
        }
        n2.f2302a = valueOf;
        Object obj2 = arrayList.get(1);
        if (obj2 == null) {
            valueOf2 = null;
        } else {
            valueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
        }
        n2.f2303b = valueOf2;
        Object obj3 = arrayList.get(2);
        if (obj3 != null) {
            l7 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
        }
        n2.f2304c = l7;
        n2.f2305d = (String) arrayList.get(3);
        String str = (String) arrayList.get(4);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"secretKey\" is null.");
        }
        n2.f2306e = str;
        return n2;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.f2302a);
        arrayList.add(this.f2303b);
        arrayList.add(this.f2304c);
        arrayList.add(this.f2305d);
        arrayList.add(this.f2306e);
        return arrayList;
    }
}
