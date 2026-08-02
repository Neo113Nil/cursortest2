package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class s61 extends t61 {
    /* JADX INFO: renamed from: s */
    public static List m4485s(r61 r61Var) {
        Iterator it = r61Var.iterator();
        if (!it.hasNext()) {
            return C0411kw.f4584j;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return vt1.m5193e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
