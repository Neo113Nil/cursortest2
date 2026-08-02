package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: r.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2326d implements Collection {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C2327e f18990k;

    public C2326d(C2327e c2327e) {
        this.f18990k = c2327e;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f18990k.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f18990k.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f18990k.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2323a(this.f18990k, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C2327e c2327e = this.f18990k;
        int a5 = c2327e.a(obj);
        if (a5 < 0) {
            return false;
        }
        c2327e.g(a5);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C2327e c2327e = this.f18990k;
        int i = c2327e.f18961m;
        int i5 = 0;
        boolean z3 = false;
        while (i5 < i) {
            if (collection.contains(c2327e.i(i5))) {
                c2327e.g(i5);
                i5--;
                i--;
                z3 = true;
            }
            i5++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C2327e c2327e = this.f18990k;
        int i = c2327e.f18961m;
        int i5 = 0;
        boolean z3 = false;
        while (i5 < i) {
            if (!collection.contains(c2327e.i(i5))) {
                c2327e.g(i5);
                i5--;
                i--;
                z3 = true;
            }
            i5++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f18990k.f18961m;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C2327e c2327e = this.f18990k;
        int i = c2327e.f18961m;
        Object[] objArr = new Object[i];
        for (int i5 = 0; i5 < i; i5++) {
            objArr[i5] = c2327e.i(i5);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C2327e c2327e = this.f18990k;
        int i = c2327e.f18961m;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i5 = 0; i5 < i; i5++) {
            objArr[i5] = c2327e.i(i5);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
