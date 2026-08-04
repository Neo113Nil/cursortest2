package E3;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: E3.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0158p {
    public static void a(int i7, String str) {
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i7);
    }

    public static boolean b(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean c(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static W d(Set set, D3.l lVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof W)) {
                set.getClass();
                return new W(set, lVar);
            }
            W w7 = (W) set;
            D3.l lVar2 = w7.f2031b;
            lVar2.getClass();
            return new W(w7.f2030a, new D3.m(Arrays.asList(lVar2, lVar)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof W)) {
            set2.getClass();
            return new X(set2, lVar);
        }
        W w8 = (W) set2;
        D3.l lVar3 = w8.f2031b;
        lVar3.getClass();
        return new X((SortedSet) w8.f2030a, new D3.m(Arrays.asList(lVar3, lVar)));
    }

    public static Object e(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object f(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int g(Set set) {
        Iterator it = set.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i7 = ~(~(i7 + (next != null ? next.hashCode() : 0)));
        }
        return i7;
    }

    public static V h(B b7, B b8) {
        p113p3.f.k(b7, "set1");
        p113p3.f.k(b8, "set2");
        return new V(b7, b8);
    }

    public static ArrayList i(Object... objArr) {
        int i7;
        int length = objArr.length;
        a(length, "arraySize");
        long j = ((long) length) + 5 + ((long) (length / 10));
        if (j > 2147483647L) {
            i7 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        } else {
            i7 = j < -2147483648L ? Integer.MIN_VALUE : (int) j;
        }
        ArrayList arrayList = new ArrayList(i7);
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static void j(List list, D3.l lVar, int i7, int i8) {
        for (int size = list.size() - 1; size > i8; size--) {
            if (lVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            list.remove(i9);
        }
    }

    public static int k(int i7) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i7) * (-862048943)), 15)) * 461845907);
    }
}
