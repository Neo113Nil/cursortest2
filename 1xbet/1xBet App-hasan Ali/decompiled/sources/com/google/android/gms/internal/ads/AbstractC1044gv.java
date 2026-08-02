package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.gv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1044gv extends AbstractC0821bv implements List, RandomAccess {

    /* renamed from: l, reason: collision with root package name */
    public static final C0954ev f13676l = new C0954ev(C1761wv.f16184o, 0);

    public static C1761wv k(int i, Object[] objArr) {
        return i == 0 ? C1761wv.f16184o : new C1761wv(i, objArr);
    }

    public static AbstractC1044gv l(Collection collection) {
        if (!(collection instanceof AbstractC0821bv)) {
            Object[] array = collection.toArray();
            int length = array.length;
            AbstractC1400ot.C(length, array);
            return k(length, array);
        }
        AbstractC1044gv f = ((AbstractC0821bv) collection).f();
        if (!f.h()) {
            return f;
        }
        Object[] array2 = f.toArray(AbstractC0821bv.f12926k);
        return k(array2.length, array2);
    }

    public static C1761wv m(Object[] objArr) {
        if (objArr.length == 0) {
            return C1761wv.f16184o;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        AbstractC1400ot.C(length, objArr2);
        return k(length, objArr2);
    }

    public static C1761wv n(Object obj) {
        Object[] objArr = {obj};
        AbstractC1400ot.C(1, objArr);
        return k(1, objArr);
    }

    public static C1761wv o(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC1400ot.C(2, objArr);
        return k(2, objArr);
    }

    public static C1761wv p(Long l5, Long l6, Long l7, Long l8, Long l9) {
        Object[] objArr = {l5, l6, l7, l8, l9};
        AbstractC1400ot.C(5, objArr);
        return k(5, objArr);
    }

    public static C1761wv q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        AbstractC1400ot.C(i, objArr2);
        return k(i, objArr2);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public int c(int i, Object[] objArr) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i + i5] = get(i5);
        }
        return i + size;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (AbstractC1400ot.q(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                C0954ev listIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (listIterator.hasNext()) {
                        if (!it.hasNext() || !AbstractC1400ot.q(listIterator.next(), it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final AbstractC1044gv f() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final Lv g() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i = (i * 31) + get(i5).hashCode();
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC1044gv subList(int i, int i5) {
        AbstractC1400ot.g0(i, i5, size());
        int i6 = i5 - i;
        return i6 == size() ? this : i6 == 0 ? C1761wv.f16184o : new C0999fv(this, i, i6);
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
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final C0954ev listIterator(int i) {
        AbstractC1400ot.B(i, size());
        return isEmpty() ? f13676l : new C0954ev(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
