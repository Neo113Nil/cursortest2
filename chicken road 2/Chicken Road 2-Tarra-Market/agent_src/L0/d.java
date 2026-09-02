package L0;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class d extends j {
    public static Object S(List list) {
        kotlin.jvm.internal.j.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static String T(Iterable iterable, String separator, String prefix, String postfix, U0.l lVar, int i2) {
        if ((i2 & 1) != 0) {
            separator = ", ";
        }
        if ((i2 & 2) != 0) {
            prefix = "";
        }
        if ((i2 & 4) != 0) {
            postfix = "";
        }
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.j.e(iterable, "<this>");
        kotlin.jvm.internal.j.e(separator, "separator");
        kotlin.jvm.internal.j.e(prefix, "prefix");
        kotlin.jvm.internal.j.e(postfix, "postfix");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) prefix);
        int i3 = 0;
        for (Object obj : iterable) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) separator);
            }
            V.a.b(sb, obj, lVar);
        }
        sb.append((CharSequence) postfix);
        return sb.toString();
    }

    public static ArrayList U(List list, Object obj) {
        kotlin.jvm.internal.j.e(list, "<this>");
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList V(List list, List elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        ArrayList arrayList = new ArrayList(elements.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(elements);
        return arrayList;
    }

    public static final void W(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] X(List list) {
        kotlin.jvm.internal.j.e(list, "<this>");
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Number) it.next()).intValue();
            i2++;
        }
        return iArr;
    }

    public static List Y(Iterable iterable) {
        ArrayList arrayList;
        kotlin.jvm.internal.j.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        l lVar = l.f214a;
        if (z2) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return lVar;
            }
            if (size != 1) {
                return a0(collection);
            }
            return V.a.p(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        if (z2) {
            arrayList = a0((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            W(iterable, arrayList2);
            arrayList = arrayList2;
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : V.a.p(arrayList.get(0)) : lVar;
    }

    public static long[] Z(Collection collection) {
        kotlin.jvm.internal.j.e(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = ((Number) it.next()).longValue();
            i2++;
        }
        return jArr;
    }

    public static ArrayList a0(Collection collection) {
        kotlin.jvm.internal.j.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set b0(Collection collection) {
        kotlin.jvm.internal.j.e(collection, "<this>");
        return new LinkedHashSet(collection);
    }

    public static Set c0(Iterable iterable) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        n nVar = n.f216a;
        if (!z2) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            W(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size == 0) {
                return nVar;
            }
            if (size != 1) {
                return linkedHashSet;
            }
            Set singleton = Collections.singleton(linkedHashSet.iterator().next());
            kotlin.jvm.internal.j.d(singleton, "singleton(...)");
            return singleton;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return nVar;
        }
        if (size2 != 1) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(p.L(collection.size()));
            W(iterable, linkedHashSet2);
            return linkedHashSet2;
        }
        Set singleton2 = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        kotlin.jvm.internal.j.d(singleton2, "singleton(...)");
        return singleton2;
    }
}
