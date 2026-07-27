package u2;

import com.startapp.sdk.internal.A;
import e2.C0291f;
import e2.o;
import e2.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o2.l;

/* loaded from: classes.dex */
public abstract class f extends g {
    public static e S(Iterator it) {
        kotlin.jvm.internal.j.e(it, "<this>");
        return new a(new C0291f(2, it));
    }

    public static final d T(e eVar, l lVar) {
        if (!(eVar instanceof k)) {
            return new d(eVar, new A(6), lVar);
        }
        k kVar = (k) eVar;
        return new d(kVar.f10393a, kVar.f10394b, lVar);
    }

    public static List U(e eVar) {
        Iterator it = eVar.iterator();
        if (!it.hasNext()) {
            return o.f4877a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return X0.a.z(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set V(e eVar) {
        kotlin.jvm.internal.j.e(eVar, "<this>");
        Iterator it = eVar.iterator();
        if (!it.hasNext()) {
            return q.f4879a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            Set singleton = Collections.singleton(next);
            kotlin.jvm.internal.j.d(singleton, "singleton(...)");
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
