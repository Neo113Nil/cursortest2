package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import p023d1.f;
import p023d1.g;
import p023d1.i;

/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends i {
    @Override // p023d1.i
    public final g a(ArrayList arrayList) throws Throwable {
        f fVar = new f();
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(((g) it.next()).f12363a));
        }
        fVar.b(map);
        g gVar = new g(fVar.f12360a);
        g.c(gVar);
        return gVar;
    }
}
