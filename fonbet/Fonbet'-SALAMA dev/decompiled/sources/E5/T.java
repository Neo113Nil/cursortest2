package E5;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public String f2327a;

    /* renamed from: b, reason: collision with root package name */
    public Long f2328b;

    /* renamed from: c, reason: collision with root package name */
    public Long f2329c;

    /* renamed from: d, reason: collision with root package name */
    public String f2330d;

    /* renamed from: e, reason: collision with root package name */
    public String f2331e;

    /* renamed from: f, reason: collision with root package name */
    public String f2332f;

    public static T a(ArrayList arrayList) {
        Long valueOf;
        T t7 = new T();
        t7.f2327a = (String) arrayList.get(0);
        Object obj = arrayList.get(1);
        Long l7 = null;
        if (obj == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
        }
        if (valueOf == null) {
            throw new IllegalStateException("Nonnull field \"timeout\" is null.");
        }
        t7.f2328b = valueOf;
        Object obj2 = arrayList.get(2);
        if (obj2 != null) {
            l7 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
        }
        t7.f2329c = l7;
        t7.f2330d = (String) arrayList.get(3);
        t7.f2331e = (String) arrayList.get(4);
        t7.f2332f = (String) arrayList.get(5);
        return t7;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(this.f2327a);
        arrayList.add(this.f2328b);
        arrayList.add(this.f2329c);
        arrayList.add(this.f2330d);
        arrayList.add(this.f2331e);
        arrayList.add(this.f2332f);
        return arrayList;
    }
}
