package X3;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import k4.AbstractC2036a;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public abstract class m extends s {
    public static boolean V(Iterable iterable, Object obj) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : a0(iterable, obj) >= 0;
    }

    public static List W(List list) {
        kotlin.jvm.internal.l.f("<this>", list);
        int size = list.size() - 1;
        if (size <= 0) {
            return v.f6090k;
        }
        if (size == 1) {
            return AbstractC2346c.A(e0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i = 1; i < size2; i++) {
                arrayList.add(list.get(i));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static Object X(Iterable iterable) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        if (iterable instanceof List) {
            return Y((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object Y(List list) {
        kotlin.jvm.internal.l.f("<this>", list);
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object Z(List list) {
        kotlin.jvm.internal.l.f("<this>", list);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static int a0(Iterable iterable, Object obj) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                n.R();
                throw null;
            }
            if (kotlin.jvm.internal.l.a(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void b0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, i4.c cVar) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            AbstractC2036a.j(sb, obj, cVar);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void c0(List list, StringBuilder sb, O3.f fVar, int i) {
        if ((i & 64) != 0) {
            fVar = null;
        }
        b0(list, sb, "\n", "", "", "...", fVar);
    }

    public static String d0(Iterable iterable, String str, String str2, String str3, i4.c cVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            cVar = null;
        }
        kotlin.jvm.internal.l.f("<this>", iterable);
        kotlin.jvm.internal.l.f("prefix", str5);
        StringBuilder sb = new StringBuilder();
        b0(iterable, sb, str4, str5, str6, "...", cVar);
        return sb.toString();
    }

    public static Object e0(List list) {
        kotlin.jvm.internal.l.f("<this>", list);
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(n.N(list));
    }

    public static Object f0(List list) {
        kotlin.jvm.internal.l.f("<this>", list);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable g0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList h0(Collection collection, Object obj) {
        kotlin.jvm.internal.l.f("<this>", collection);
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList i0(Collection collection, List list) {
        kotlin.jvm.internal.l.f("<this>", collection);
        kotlin.jvm.internal.l.f("elements", list);
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static List j0(Iterable iterable) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m0(iterable);
        }
        List o02 = o0(iterable);
        Collections.reverse(o02);
        return o02;
    }

    public static List k0(List list, Comparator comparator) {
        kotlin.jvm.internal.l.f("<this>", list);
        if (list.size() <= 1) {
            return m0(list);
        }
        Object[] array = list.toArray(new Object[0]);
        kotlin.jvm.internal.l.f("<this>", array);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return l.o0(array);
    }

    public static final void l0(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List m0(Iterable iterable) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        if (!(iterable instanceof Collection)) {
            return n.Q(o0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return v.f6090k;
        }
        if (size != 1) {
            return n0(collection);
        }
        return AbstractC2346c.A(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList n0(Collection collection) {
        kotlin.jvm.internal.l.f("<this>", collection);
        return new ArrayList(collection);
    }

    public static final List o0(Iterable iterable) {
        kotlin.jvm.internal.l.f("<this>", iterable);
        if (iterable instanceof Collection) {
            return n0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        l0(iterable, arrayList);
        return arrayList;
    }
}
