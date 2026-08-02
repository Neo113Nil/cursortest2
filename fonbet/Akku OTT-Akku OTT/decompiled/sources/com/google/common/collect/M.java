package com.google.common.collect;

import com.google.common.collect.E;
import com.google.common.collect.G;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes4.dex */
public abstract class M<E> extends E<E> implements Set<E> {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 912559;
    public transient G<E> b;

    public static class a<E> extends E.a<E> {
        @Override // com.google.common.collect.E.b
        public final E.b a(Object obj) {
            obj.getClass();
            c(obj);
            return this;
        }

        public final void g(List list) {
            list.getClass();
            e(list);
        }

        public final M<E> h() {
            int i = this.b;
            if (i == 0) {
                int i2 = M.c;
                return k0.l;
            }
            if (i != 1) {
                M<E> i3 = M.i(i, this.a);
                this.b = i3.size();
                this.c = true;
                return i3;
            }
            Object obj = this.a[0];
            Objects.requireNonNull(obj);
            int i4 = M.c;
            return new u0(obj);
        }
    }

    public static class b implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] a;

        public b(Object[] objArr) {
            this.a = objArr;
        }

        public Object readResolve() {
            return M.k(this.a);
        }
    }

    public static int h(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            com.google.common.base.k.d(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static <E> M<E> i(int i, Object... objArr) {
        if (i == 0) {
            return k0.l;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new u0(obj);
        }
        int h = h(i);
        Object[] objArr2 = new Object[h];
        int i2 = h - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(android.support.v4.media.a.a(i5, "at index "));
            }
            int hashCode = obj2.hashCode();
            int a2 = C.a(hashCode);
            while (true) {
                int i6 = a2 & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                a2++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new u0(obj4);
        }
        if (h(i4) < h / 2) {
            return i(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new k0(objArr, i3, objArr2, i2, i4);
    }

    public static <E> M<E> j(Collection<? extends E> collection) {
        if ((collection instanceof M) && !(collection instanceof SortedSet)) {
            M<E> m = (M) collection;
            if (!m.f()) {
                return m;
            }
        }
        Object[] array = collection.toArray();
        return i(array.length, array);
    }

    public static <E> M<E> k(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? i(eArr.length, (Object[]) eArr.clone()) : new u0(eArr[0]) : k0.l;
    }

    @SafeVarargs
    public static M m(String str, String str2, String str3, String str4, String str5, String str6, Object... objArr) {
        com.google.common.base.k.d(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return i(length, objArr2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.E
    public G<E> a() {
        G<E> g = this.b;
        if (g != null) {
            return g;
        }
        G<E> l = l();
        this.b = l;
        return l;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof M) && (this instanceof k0)) {
            M m = (M) obj;
            m.getClass();
            if ((m instanceof k0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return t0.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return t0.c(this);
    }

    @Override // com.google.common.collect.E, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public G<E> l() {
        Object[] array = toArray(E.a);
        G.b bVar = G.b;
        return G.h(array.length, array);
    }

    @Override // com.google.common.collect.E
    public Object writeReplace() {
        return new b(toArray(E.a));
    }
}
