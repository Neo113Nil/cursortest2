package X3;

import G1.C0140k;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public abstract class C extends AbstractC2425d {
    public static LinkedHashSet P(Set set, C0140k c0140k) {
        kotlin.jvm.internal.l.f("<this>", set);
        LinkedHashSet linkedHashSet = new LinkedHashSet(z.R(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(c0140k);
        return linkedHashSet;
    }

    public static Set Q(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return x.f6092k;
        }
        if (length == 1) {
            Set singleton = Collections.singleton(objArr[0]);
            kotlin.jvm.internal.l.e("singleton(...)", singleton);
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(z.R(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }
}
