package E3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import n3.AbstractC1464a;

/* renamed from: E3.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0167z extends AbstractC0162u implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public static final C0165x f2083b = new C0165x(L.f2000e, 0);

    public static L B(int i7, Object[] objArr) {
        return i7 == 0 ? L.f2000e : new L(objArr, i7);
    }

    public static C0164w C() {
        return new C0164w();
    }

    public static L D(Object... objArr) {
        int length = objArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (objArr[i7] == null) {
                throw new NullPointerException(e1.k.d(i7, "at index "));
            }
        }
        return B(objArr.length, objArr);
    }

    public static AbstractC0167z E(Collection collection) {
        if (!(collection instanceof AbstractC0162u)) {
            return D(collection.toArray());
        }
        AbstractC0167z l7 = ((AbstractC0162u) collection).l();
        if (!l7.A()) {
            return l7;
        }
        Object[] array = l7.toArray(AbstractC0162u.f2071a);
        return B(array.length, array);
    }

    public static L F(Object[] objArr) {
        return objArr.length == 0 ? L.f2000e : D((Object[]) objArr.clone());
    }

    public static L H(Long l7, Long l8, Long l9, Long l10, Long l11) {
        return D(l7, l8, l9, l10, l11);
    }

    public static L I(Object obj) {
        return D(obj);
    }

    @Override // java.util.List
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final C0165x listIterator(int i7) {
        p3.f.n(i7, size());
        return isEmpty() ? f2083b : new C0165x(this, i7);
    }

    @Override // java.util.List
    /* renamed from: J */
    public AbstractC0167z subList(int i7, int i8) {
        p3.f.o(i7, i8, size());
        int i9 = i8 - i7;
        return i9 == size() ? this : i9 == 0 ? L.f2000e : new C0166y(this, i7, i9);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // E3.AbstractC0162u, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
                    for (int i7 = 0; i7 < size; i7++) {
                        if (AbstractC1464a.t(get(i7), list.get(i7))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && AbstractC1464a.t(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i7 = ~(~(get(i8).hashCode() + (i7 * 31)));
        }
        return i7;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (obj.equals(get(i7))) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
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

    @Override // E3.AbstractC0162u
    public int m(int i7, Object[] objArr) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i7 + i8] = get(i8);
        }
        return i7 + size;
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // E3.AbstractC0162u
    public final AbstractC0167z l() {
        return this;
    }
}
