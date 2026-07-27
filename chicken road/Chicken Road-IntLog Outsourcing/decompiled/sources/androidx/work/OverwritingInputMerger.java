package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import s0.g;
import s0.j;
import x2.C1545h;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends j {
    @Override // s0.j
    public final g a(ArrayList arrayList) {
        C1545h c1545h = new C1545h(2);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((g) it.next()).f11778a));
        }
        c1545h.a(hashMap);
        g gVar = new g(c1545h.f12299a);
        g.c(gVar);
        return gVar;
    }
}
