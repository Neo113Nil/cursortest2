package g4;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import t4.InterfaceC1441l;

/* renamed from: g4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0465j extends AbstractC0469n {
    public static void E0(Collection collection, Object[] elements) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        kotlin.jvm.internal.i.e(elements, "elements");
        collection.addAll(AbstractC0464i.M(elements));
    }

    public static Object F0(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object G0(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object H0(int i2, List list) {
        if (i2 < 0 || i2 >= list.size()) {
            return null;
        }
        return list.get(i2);
    }

    public static final void I0(Iterable iterable, StringBuilder sb, CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence truncated, InterfaceC1441l interfaceC1441l) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        kotlin.jvm.internal.i.e(separator, "separator");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        kotlin.jvm.internal.i.e(postfix, "postfix");
        kotlin.jvm.internal.i.e(truncated, "truncated");
        sb.append(prefix);
        int i3 = 0;
        for (Object obj : iterable) {
            i3++;
            if (i3 > 1) {
                sb.append(separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            } else {
                e5.g.d(sb, obj, interfaceC1441l);
            }
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append(truncated);
        }
        sb.append(postfix);
    }

    public static String K0(Iterable iterable, String str, String str2, String str3, InterfaceC1441l interfaceC1441l, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        String prefix = (i2 & 2) != 0 ? "" : str2;
        String postfix = (i2 & 4) != 0 ? "" : str3;
        if ((i2 & 32) != 0) {
            interfaceC1441l = null;
        }
        kotlin.jvm.internal.i.e(iterable, "<this>");
        kotlin.jvm.internal.i.e(separator, "separator");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        kotlin.jvm.internal.i.e(postfix, "postfix");
        StringBuilder sb = new StringBuilder();
        I0(iterable, sb, separator, prefix, postfix, -1, "...", interfaceC1441l);
        return sb.toString();
    }

    public static Object L0(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC0466k.z0(list));
    }

    public static ArrayList M0(List list, Object obj) {
        kotlin.jvm.internal.i.e(list, "<this>");
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList N0(List list, List elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        ArrayList arrayList = new ArrayList(elements.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(elements);
        return arrayList;
    }

    public static List O0(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        if (collection.size() <= 1) {
            return S0(collection);
        }
        List V02 = V0(collection);
        Collections.reverse(V02);
        return V02;
    }

    public static List P0(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        if (list.size() <= 1) {
            return S0(list);
        }
        Object[] array = list.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        kotlin.jvm.internal.i.e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return AbstractC0464i.M(array);
    }

    public static final void Q0(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] R0(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Number) it.next()).intValue();
            i2++;
        }
        return iArr;
    }

    public static List S0(Iterable iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        C0471p c0471p = C0471p.f5750a;
        if (!z) {
            List V02 = V0(iterable);
            ArrayList arrayList = (ArrayList) V02;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? V02 : K1.b.W(arrayList.get(0)) : c0471p;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c0471p;
        }
        if (size2 != 1) {
            return U0(collection);
        }
        return K1.b.W(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] T0(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = ((Number) it.next()).longValue();
            i2++;
        }
        return jArr;
    }

    public static ArrayList U0(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List V0(Iterable iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return U0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        Q0(iterable, arrayList);
        return arrayList;
    }

    public static Set W0(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        return new LinkedHashSet(collection);
    }

    public static Set X0(Iterable iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        C0473r c0473r = C0473r.f5752a;
        if (!z) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Q0(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size == 0) {
                return c0473r;
            }
            if (size != 1) {
                return linkedHashSet;
            }
            Set singleton = Collections.singleton(linkedHashSet.iterator().next());
            kotlin.jvm.internal.i.d(singleton, "singleton(...)");
            return singleton;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c0473r;
        }
        if (size2 != 1) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(AbstractC0476u.W(collection.size()));
            Q0(iterable, linkedHashSet2);
            return linkedHashSet2;
        }
        Set singleton2 = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        kotlin.jvm.internal.i.d(singleton2, "singleton(...)");
        return singleton2;
    }
}
