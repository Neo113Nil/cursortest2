package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: r.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2324b implements Set {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C2327e f18985k;

    public C2324b(C2327e c2327e) {
        this.f18985k = c2327e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f18985k.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f18985k.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f18985k.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        C2327e c2327e = this.f18985k;
        try {
            if (c2327e.f18961m == set.size()) {
                return c2327e.j(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C2327e c2327e = this.f18985k;
        int i = 0;
        for (int i5 = c2327e.f18961m - 1; i5 >= 0; i5--) {
            Object f = c2327e.f(i5);
            i += f == null ? 0 : f.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f18985k.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2323a(this.f18985k, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C2327e c2327e = this.f18985k;
        int d5 = c2327e.d(obj);
        if (d5 < 0) {
            return false;
        }
        c2327e.g(d5);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f18985k.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C2327e c2327e = this.f18985k;
        int i = c2327e.f18961m;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            if (!collection.contains(c2327e.f(i5))) {
                c2327e.g(i5);
            }
        }
        return i != c2327e.f18961m;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f18985k.f18961m;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C2327e c2327e = this.f18985k;
        int i = c2327e.f18961m;
        Object[] objArr = new Object[i];
        for (int i5 = 0; i5 < i; i5++) {
            objArr[i5] = c2327e.f(i5);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C2327e c2327e = this.f18985k;
        int i = c2327e.f18961m;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i5 = 0; i5 < i; i5++) {
            objArr[i5] = c2327e.f(i5);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
