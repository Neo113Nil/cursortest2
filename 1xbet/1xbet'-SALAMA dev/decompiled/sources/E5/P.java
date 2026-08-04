package E5;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Q f2310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f2311b;

    public static P a(ArrayList arrayList) {
        P p5 = new P();
        Q q7 = (Q) arrayList.get(0);
        if (q7 == null) {
            throw new IllegalStateException("Nonnull field \"userInfo\" is null.");
        }
        p5.f2310a = q7;
        List list = (List) arrayList.get(1);
        if (list == null) {
            throw new IllegalStateException("Nonnull field \"providerData\" is null.");
        }
        p5.f2311b = list;
        return p5;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f2310a);
        arrayList.add(this.f2311b);
        return arrayList;
    }
}
