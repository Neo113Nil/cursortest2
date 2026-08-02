package g6;

import W5.AbstractC0486a1;
import Y4.D;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* renamed from: g6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1159h extends AbstractC1165n {
    public static Object Q0(List list) {
        t6.h.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object R0(AbstractList abstractList) {
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.get(0);
    }

    public static final void S0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, Function1 function1) {
        t6.h.e(iterable, "<this>");
        t6.h.e(charSequence, "separator");
        t6.h.e(charSequence2, "prefix");
        t6.h.e(charSequence3, "postfix");
        t6.h.e(charSequence4, "truncated");
        sb.append(charSequence2);
        int i8 = 0;
        for (Object obj : iterable) {
            i8++;
            if (i8 > 1) {
                sb.append(charSequence);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            } else {
                Q0.a.d(sb, obj, function1);
            }
        }
        if (i7 >= 0 && i8 > i7) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String T0(Iterable iterable, String str, String str2, String str3, Function1 function1, int i7) {
        if ((i7 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i7 & 2) != 0 ? "" : str2;
        String str6 = (i7 & 4) != 0 ? "" : str3;
        if ((i7 & 32) != 0) {
            function1 = null;
        }
        t6.h.e(iterable, "<this>");
        t6.h.e(str4, "separator");
        t6.h.e(str5, "prefix");
        t6.h.e(str6, "postfix");
        StringBuilder sb = new StringBuilder();
        S0(iterable, sb, str4, str5, str6, -1, "...", function1);
        return sb.toString();
    }

    public static Object U0(List list) {
        t6.h.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static List V0(Comparator comparator, Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            List d12 = d1(iterable);
            if (((ArrayList) d12).size() > 1) {
                Collections.sort(d12, comparator);
            }
            return d12;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return a1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        t6.h.e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return AbstractC1158g.p0(array);
    }

    public static List W0(int i7, List list) {
        t6.h.e(list, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(AbstractC0486a1.f(i7, "Requested element count ", " is less than zero.").toString());
        }
        C1167p c1167p = C1167p.f13302a;
        if (i7 == 0) {
            return c1167p;
        }
        if (i7 >= list.size()) {
            return a1(list);
        }
        if (i7 == 1) {
            return D.D(Q0(list));
        }
        ArrayList arrayList = new ArrayList(i7);
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i8++;
            if (i8 == i7) {
                break;
            }
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : D.D(arrayList.get(0)) : c1167p;
    }

    public static byte[] X0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            bArr[i7] = ((Number) it.next()).byteValue();
            i7++;
        }
        return bArr;
    }

    public static final void Y0(Iterable iterable, AbstractCollection abstractCollection) {
        t6.h.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] Z0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr[i7] = ((Number) it.next()).intValue();
            i7++;
        }
        return iArr;
    }

    public static List a1(Iterable iterable) {
        t6.h.e(iterable, "<this>");
        boolean z4 = iterable instanceof Collection;
        C1167p c1167p = C1167p.f13302a;
        if (!z4) {
            List d12 = d1(iterable);
            ArrayList arrayList = (ArrayList) d12;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? d12 : D.D(arrayList.get(0)) : c1167p;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c1167p;
        }
        if (size2 != 1) {
            return c1(collection);
        }
        return D.D(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] b1(List list) {
        t6.h.e(list, "<this>");
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            jArr[i7] = ((Number) it.next()).longValue();
            i7++;
        }
        return jArr;
    }

    public static ArrayList c1(Collection collection) {
        t6.h.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List d1(Iterable iterable) {
        t6.h.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return c1((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        Y0(iterable, arrayList);
        return arrayList;
    }

    public static Set e1(Collection collection) {
        t6.h.e(collection, "<this>");
        boolean z4 = collection instanceof Collection;
        C1169r c1169r = C1169r.f13304a;
        if (!z4) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Y0(collection, linkedHashSet);
            int size = linkedHashSet.size();
            if (size == 0) {
                return c1169r;
            }
            if (size != 1) {
                return linkedHashSet;
            }
            Set singleton = Collections.singleton(linkedHashSet.iterator().next());
            t6.h.d(singleton, "singleton(...)");
            return singleton;
        }
        Collection collection2 = collection;
        int size2 = collection2.size();
        if (size2 == 0) {
            return c1169r;
        }
        if (size2 != 1) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(AbstractC1170s.K0(collection2.size()));
            Y0(collection, linkedHashSet2);
            return linkedHashSet2;
        }
        Set singleton2 = Collections.singleton(collection instanceof List ? ((List) collection).get(0) : collection2.iterator().next());
        t6.h.d(singleton2, "singleton(...)");
        return singleton2;
    }
}
