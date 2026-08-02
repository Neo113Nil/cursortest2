package H5;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f3417a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f3418b;

    public static v a(ArrayList arrayList) {
        v vVar = new v();
        Boolean bool = (Boolean) arrayList.get(0);
        if (bool == null) {
            throw new IllegalStateException("Nonnull field \"hasPendingWrites\" is null.");
        }
        vVar.f3417a = bool;
        Boolean bool2 = (Boolean) arrayList.get(1);
        if (bool2 == null) {
            throw new IllegalStateException("Nonnull field \"isFromCache\" is null.");
        }
        vVar.f3418b = bool2;
        return vVar;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f3417a);
        arrayList.add(this.f3418b);
        return arrayList;
    }
}
