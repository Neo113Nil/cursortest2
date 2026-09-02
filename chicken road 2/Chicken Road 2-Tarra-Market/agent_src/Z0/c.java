package Z0;

import L0.l;
import L0.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public abstract class c extends d {
    public static b L(Iterator it) {
        j.e(it, "<this>");
        return new a(new e(it));
    }

    public static List M(b bVar) {
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return l.f214a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return V.a.p(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set N(b bVar) {
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return n.f216a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            Set singleton = Collections.singleton(next);
            j.d(singleton, "singleton(...)");
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}
