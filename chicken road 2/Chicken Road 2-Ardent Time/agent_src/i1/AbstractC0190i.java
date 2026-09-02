package i1;

/* renamed from: i1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0190i extends i1.AbstractC0196o {
    public static java.util.List M(java.util.List list) {
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return U(size, list);
    }

    public static java.lang.Object N(java.util.List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void O(java.lang.Iterable iterable, java.lang.StringBuilder sb, java.lang.CharSequence separator, java.lang.CharSequence prefix, java.lang.CharSequence postfix, int i2, java.lang.CharSequence truncated, s1.l lVar) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        kotlin.jvm.internal.i.e(separator, "separator");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        kotlin.jvm.internal.i.e(postfix, "postfix");
        kotlin.jvm.internal.i.e(truncated, "truncated");
        sb.append(prefix);
        int i3 = 0;
        for (java.lang.Object obj : iterable) {
            i3++;
            if (i3 > 1) {
                sb.append(separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            } else {
                Q1.d.c(sb, obj, lVar);
            }
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append(truncated);
        }
        sb.append(postfix);
    }

    public static java.lang.String Q(java.lang.Iterable iterable, java.lang.String str, java.lang.String str2, java.lang.String str3, s1.l lVar, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        java.lang.String separator = str;
        java.lang.String prefix = (i2 & 2) != 0 ? "" : str2;
        java.lang.String postfix = (i2 & 4) != 0 ? "" : str3;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.i.e(iterable, "<this>");
        kotlin.jvm.internal.i.e(separator, "separator");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        kotlin.jvm.internal.i.e(postfix, "postfix");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        O(iterable, sb, separator, prefix, postfix, -1, "...", lVar);
        return sb.toString();
    }

    public static java.lang.Object R(java.util.List list) {
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.get(list.size() - 1);
    }

    public static java.util.ArrayList S(java.util.List list, java.lang.Object obj) {
        kotlin.jvm.internal.i.e(list, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(obj);
        return arrayList;
    }

    public static java.util.ArrayList T(java.util.List list, java.util.List elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        java.util.ArrayList arrayList = new java.util.ArrayList(elements.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(elements);
        return arrayList;
    }

    public static java.util.List U(int i2, java.util.List list) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException(B1.a.g(i2, "Requested element count ", " is less than zero.").toString());
        }
        i1.C0199r c0199r = i1.C0199r.f3325a;
        if (i2 == 0) {
            return c0199r;
        }
        if (i2 >= list.size()) {
            return X(list);
        }
        if (i2 == 1) {
            if (list.isEmpty()) {
                throw new java.util.NoSuchElementException("List is empty.");
            }
            return u0.AbstractC0995a.q(list.get(0));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i2);
        java.util.Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : u0.AbstractC0995a.q(arrayList.get(0)) : c0199r;
    }

    public static final void V(java.lang.Iterable iterable, java.util.AbstractCollection abstractCollection) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] W(java.util.List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        int[] iArr = new int[list.size()];
        java.util.Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((java.lang.Number) it.next()).intValue();
            i2++;
        }
        return iArr;
    }

    public static java.util.List X(java.lang.Iterable iterable) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.i.e(iterable, "<this>");
        boolean z2 = iterable instanceof java.util.Collection;
        i1.C0199r c0199r = i1.C0199r.f3325a;
        if (z2) {
            java.util.Collection collection = (java.util.Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return c0199r;
            }
            if (size != 1) {
                return Z(collection);
            }
            return u0.AbstractC0995a.q(iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : collection.iterator().next());
        }
        if (z2) {
            arrayList = Z((java.util.Collection) iterable);
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            V(iterable, arrayList2);
            arrayList = arrayList2;
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : u0.AbstractC0995a.q(arrayList.get(0)) : c0199r;
    }

    public static long[] Y(java.util.Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        long[] jArr = new long[collection.size()];
        java.util.Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = ((java.lang.Number) it.next()).longValue();
            i2++;
        }
        return jArr;
    }

    public static java.util.ArrayList Z(java.util.Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        return new java.util.ArrayList(collection);
    }

    public static java.util.Set a0(java.util.Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        return new java.util.LinkedHashSet(collection);
    }

    public static java.util.Set b0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        boolean z2 = iterable instanceof java.util.Collection;
        i1.C0201t c0201t = i1.C0201t.f3327a;
        if (!z2) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            V(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size == 0) {
                return c0201t;
            }
            if (size != 1) {
                return linkedHashSet;
            }
            java.util.Set singleton = java.util.Collections.singleton(linkedHashSet.iterator().next());
            kotlin.jvm.internal.i.d(singleton, "singleton(...)");
            return singleton;
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c0201t;
        }
        if (size2 != 1) {
            java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet(i1.AbstractC0203v.E(collection.size()));
            V(iterable, linkedHashSet2);
            return linkedHashSet2;
        }
        java.util.Set singleton2 = java.util.Collections.singleton(iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : collection.iterator().next());
        kotlin.jvm.internal.i.d(singleton2, "singleton(...)");
        return singleton2;
    }
}
