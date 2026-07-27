package f1;

import S0.d;
import android.util.SparseArray;
import b2.AbstractC0279e;
import java.util.HashMap;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0416a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f5544a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f5545b;

    static {
        HashMap hashMap = new HashMap();
        f5545b = hashMap;
        hashMap.put(d.f2741a, 0);
        hashMap.put(d.f2742b, 1);
        hashMap.put(d.f2743c, 2);
        for (d dVar : hashMap.keySet()) {
            f5544a.append(((Integer) f5545b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f5545b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i2) {
        d dVar = (d) f5544a.get(i2);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(AbstractC0279e.d(i2, "Unknown Priority for value "));
    }
}
