package K0;

import android.util.SparseArray;
import java.util.HashMap;
import x0.c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f916a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f917b;

    static {
        HashMap hashMap = new HashMap();
        f917b = hashMap;
        hashMap.put(c.f10540a, 0);
        hashMap.put(c.f10541b, 1);
        hashMap.put(c.f10542c, 2);
        for (c cVar : hashMap.keySet()) {
            f916a.append(((Integer) f917b.get(cVar)).intValue(), cVar);
        }
    }

    public static int a(c cVar) {
        Integer num = (Integer) f917b.get(cVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + cVar);
    }

    public static c b(int i3) {
        c cVar = (c) f916a.get(i3);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(B0.c.h(i3, "Unknown Priority for value "));
    }
}
