package B6;

import Y4.D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p050g6.p;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends f {
    public static List K0(b bVar) {
        h.e(bVar, "<this>");
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return p.f13308a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return D.D(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
