package B6;

import Y4.D;
import g6.C1167p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t6.h;

/* loaded from: classes2.dex */
public abstract class d extends f {
    public static List K0(b bVar) {
        h.e(bVar, "<this>");
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return C1167p.f13302a;
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
