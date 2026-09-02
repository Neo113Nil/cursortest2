package k0;

import X.m;
import g0.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c extends d {
    public static List H(b bVar) {
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return m.f402b;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            List singletonList = Collections.singletonList(next);
            h.d(singletonList, "singletonList(...)");
            return singletonList;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
