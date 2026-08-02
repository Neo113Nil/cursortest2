package com.google.common.collect;

import com.google.common.collect.E;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public abstract class G<E> extends E<E> implements List<E>, RandomAccess {
    public static final b b = new b(0, i0.e);
    private static final long serialVersionUID = -889275714;

    public static final class a<E> extends E.a<E> {
        public a() {
            super(4);
        }

        @Override // com.google.common.collect.E.b
        public final E.b a(Object obj) {
            c(obj);
            return this;
        }

        public final i0 g() {
            this.c = true;
            return G.h(this.b, this.a);
        }
    }

    public static class b<E> extends AbstractC0953a<E> {
        public final G<E> c;

        public b(int i, G g) {
            super(g.size(), i);
            this.c = g;
        }

        @Override // com.google.common.collect.AbstractC0953a
        public final E a(int i) {
            return this.c.get(i);
        }
    }

    public static class c implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] a;

        public c(Object[] objArr) {
            this.a = objArr;
        }

        public Object readResolve() {
            return G.k(this.a);
        }
    }

    public class d extends G<E> {
        public final transient int c;
        public final transient int d;

        public d(int i, int i2) {
            this.c = i;
            this.d = i2;
        }

        @Override // com.google.common.collect.E
        public final Object[] c() {
            return G.this.c();
        }

        @Override // com.google.common.collect.E
        public final int d() {
            return G.this.e() + this.c + this.d;
        }

        @Override // com.google.common.collect.E
        public final int e() {
            return G.this.e() + this.c;
        }

        @Override // com.google.common.collect.E
        public final boolean f() {
            return true;
        }

        @Override // java.util.List
        public final E get(int i) {
            com.google.common.base.k.e(i, this.d);
            return G.this.get(i + this.c);
        }

        @Override // com.google.common.collect.G, com.google.common.collect.E, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.G, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.G, java.util.List
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final G<E> subList(int i, int i2) {
            com.google.common.base.k.h(i, i2, this.d);
            int i3 = this.c;
            return G.this.subList(i + i3, i2 + i3);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.d;
        }

        @Override // com.google.common.collect.G, com.google.common.collect.E
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.G, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }

    public static i0 h(int i, Object[] objArr) {
        return i == 0 ? i0.e : new i0(objArr, i);
    }

    public static <E> a<E> i(int i) {
        C0965m.b(i, "expectedSize");
        return new a<>(i);
    }

    public static <E> G<E> j(Collection<? extends E> collection) {
        if (!(collection instanceof E)) {
            Object[] array = collection.toArray();
            c0.a(array.length, array);
            return h(array.length, array);
        }
        G<E> a2 = ((E) collection).a();
        if (!a2.f()) {
            return a2;
        }
        Object[] array2 = a2.toArray(E.a);
        return h(array2.length, array2);
    }

    public static i0 k(Object[] objArr) {
        if (objArr.length == 0) {
            return i0.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        c0.a(objArr2.length, objArr2);
        return h(objArr2.length, objArr2);
    }

    public static i0 m(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        c0.a(5, objArr);
        return h(5, objArr);
    }

    public static i0 n(Object obj) {
        Object[] objArr = {obj};
        c0.a(1, objArr);
        return h(1, objArr);
    }

    public static i0 o(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        c0.a(2, objArr);
        return h(2, objArr);
    }

    public static i0 p(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        c0.a(3, objArr);
        return h(3, objArr);
    }

    @SafeVarargs
    public static i0 q(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        com.google.common.base.k.d(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        c0.a(length, objArr2);
        return h(length, objArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static i0 r(List list, Comparator comparator) {
        comparator.getClass();
        if (list == null) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list = arrayList;
        }
        Object[] array = list.toArray();
        c0.a(array.length, array);
        Arrays.sort(array, comparator);
        return h(array.length, array);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.E
    @Deprecated
    public final G<E> a() {
        return this;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.E
    public int b(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.common.collect.E, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator<E> it = iterator();
                        Iterator<E> it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && com.google.common.base.i.a(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (com.google.common.base.i.a(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.common.collect.E
    /* renamed from: g */
    public final y0<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.common.collect.E, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final b listIterator(int i) {
        com.google.common.base.k.g(i, size());
        return isEmpty() ? b : new b(i, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s */
    public G<E> subList(int i, int i2) {
        com.google.common.base.k.h(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? i0.e : new d(i, i3);
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.E
    public Object writeReplace() {
        return new c(toArray(E.a));
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }
}
