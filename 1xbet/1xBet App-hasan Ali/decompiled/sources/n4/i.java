package n4;

import X3.t;
import X3.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public abstract class i extends j {
    public static g L(Iterator it) {
        kotlin.jvm.internal.l.f("<this>", it);
        return new C2189a(new t(1, it));
    }

    public static g M(Object obj, i4.c cVar) {
        return obj == null ? d.f18476a : new f(new O3.l(12, obj), cVar, 1);
    }

    public static List N(g gVar) {
        Iterator it = gVar.iterator();
        if (!it.hasNext()) {
            return v.f6090k;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC2346c.A(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
