package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qc0 extends lc0 implements List, RandomAccess {

    /* JADX INFO: renamed from: k */
    public static final nc0 f6464k = new nc0(q01.f6303n, 0);

    /* JADX INFO: renamed from: j */
    public static q01 m4055j(int i, Object[] objArr) {
        return i == 0 ? q01.f6303n : new q01(i, objArr);
    }

    /* JADX INFO: renamed from: l */
    public static mc0 m4056l() {
        return new mc0(4);
    }

    /* JADX INFO: renamed from: p */
    public static qc0 m4057p(Iterable iterable) {
        if (iterable instanceof Collection) {
            return m4058q((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return q01.f6303n;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            Object[] objArr = {next};
            oa2.m3655b(1, objArr);
            return m4055j(1, objArr);
        }
        mc0 mc0Var = new mc0(4);
        mc0Var.m3004a(next);
        while (it.hasNext()) {
            mc0Var.m3004a(it.next());
        }
        return mc0Var.m3374d();
    }

    /* JADX INFO: renamed from: q */
    public static qc0 m4058q(Collection collection) {
        if (!(collection instanceof lc0)) {
            Object[] array = collection.toArray();
            oa2.m3655b(array.length, array);
            return m4055j(array.length, array);
        }
        qc0 qc0VarMo3202b = ((lc0) collection).mo3202b();
        if (!qc0VarMo3202b.mo3207g()) {
            return qc0VarMo3202b;
        }
        Object[] array2 = qc0VarMo3202b.toArray(lc0.f4760j);
        return m4055j(array2.length, array2);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: c */
    public int mo3203c(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // p000.lc0, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
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
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && AbstractC0875xf.m5649f(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (AbstractC0875xf.m5649f(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: h */
    public final sf1 iterator() {
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

    public int indexOf(Object obj) {
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

    @Override // p000.lc0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
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

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final nc0 listIterator(int i) {
        a90.m129m(i, size());
        return isEmpty() ? f6464k : new nc0(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: s */
    public qc0 mo3680s() {
        return size() <= 1 ? this : new oc0(this);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public qc0 subList(int i, int i2) {
        a90.m130n(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? q01.f6303n : new pc0(this, i, i3);
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: b */
    public final qc0 mo3202b() {
        return this;
    }
}
