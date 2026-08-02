package H5;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public String f3395a;

    /* renamed from: b, reason: collision with root package name */
    public Map f3396b;

    /* renamed from: c, reason: collision with root package name */
    public v f3397c;

    public static q a(ArrayList arrayList) {
        q qVar = new q();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"path\" is null.");
        }
        qVar.f3395a = str;
        qVar.f3396b = (Map) arrayList.get(1);
        Object obj = arrayList.get(2);
        v a2 = obj == null ? null : v.a((ArrayList) obj);
        if (a2 == null) {
            throw new IllegalStateException("Nonnull field \"metadata\" is null.");
        }
        qVar.f3397c = a2;
        return qVar;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(this.f3395a);
        arrayList.add(this.f3396b);
        v vVar = this.f3397c;
        arrayList.add(vVar == null ? null : vVar.b());
        return arrayList;
    }
}
