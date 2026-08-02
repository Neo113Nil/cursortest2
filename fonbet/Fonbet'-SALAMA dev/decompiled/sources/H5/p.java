package H5;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f3393a;

    /* renamed from: b, reason: collision with root package name */
    public List f3394b;

    public static p a(ArrayList arrayList) {
        p pVar = new p();
        pVar.f3393a = (Boolean) arrayList.get(0);
        pVar.f3394b = (List) arrayList.get(1);
        return pVar;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f3393a);
        arrayList.add(this.f3394b);
        return arrayList;
    }
}
