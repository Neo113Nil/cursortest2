package e2;

import a.AbstractC0086a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: e2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0292g extends m {
    public static Object X(List list) {
        kotlin.jvm.internal.j.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void Y(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, o2.l lVar) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        sb.append(charSequence2);
        int i3 = 0;
        for (Object obj : iterable) {
            i3++;
            if (i3 > 1) {
                sb.append(charSequence);
            }
            AbstractC0086a.c(sb, obj, lVar);
        }
        sb.append(charSequence3);
    }

    public static String Z(Iterable iterable, String str, String str2, String str3, o2.l lVar, int i3) {
        if ((i3 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String prefix = (i3 & 2) != 0 ? "" : str2;
        String str5 = (i3 & 4) != 0 ? "" : str3;
        if ((i3 & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.j.e(iterable, "<this>");
        kotlin.jvm.internal.j.e(prefix, "prefix");
        StringBuilder sb = new StringBuilder();
        Y(iterable, sb, str4, prefix, str5, "...", lVar);
        return sb.toString();
    }

    public static Object a0(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList b0(List list, Object obj) {
        kotlin.jvm.internal.j.e(list, "<this>");
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList c0(List list, List elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        ArrayList arrayList = new ArrayList(elements.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(elements);
        return arrayList;
    }

    public static final void d0(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] e0(List list) {
        kotlin.jvm.internal.j.e(list, "<this>");
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            iArr[i3] = ((Number) it.next()).intValue();
            i3++;
        }
        return iArr;
    }

    public static List f0(Iterable iterable) {
        ArrayList arrayList;
        kotlin.jvm.internal.j.e(iterable, "<this>");
        boolean z3 = iterable instanceof Collection;
        o oVar = o.f4877a;
        if (z3) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return g0(collection);
                }
                return X0.a.z(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
            }
        } else {
            if (z3) {
                arrayList = g0((Collection) iterable);
            } else {
                ArrayList arrayList2 = new ArrayList();
                d0(iterable, arrayList2);
                arrayList = arrayList2;
            }
            int size2 = arrayList.size();
            if (size2 != 0) {
                return size2 != 1 ? arrayList : X0.a.z(arrayList.get(0));
            }
        }
        return oVar;
    }

    public static ArrayList g0(Collection collection) {
        kotlin.jvm.internal.j.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set h0(Iterable iterable) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        boolean z3 = iterable instanceof Collection;
        q qVar = q.f4879a;
        if (z3) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(s.j0(collection.size()));
                    d0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                kotlin.jvm.internal.j.d(singleton, "singleton(...)");
                return singleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            d0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                kotlin.jvm.internal.j.d(singleton2, "singleton(...)");
                return singleton2;
            }
        }
        return qVar;
    }
}
