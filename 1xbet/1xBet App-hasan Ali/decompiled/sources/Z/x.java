package Z;

import P.AbstractC0316s0;
import X3.A;
import a.AbstractC0444a;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class x implements List, j4.c {

    /* renamed from: k, reason: collision with root package name */
    public final p f6244k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6245l;

    /* renamed from: m, reason: collision with root package name */
    public int f6246m;

    /* renamed from: n, reason: collision with root package name */
    public int f6247n;

    public x(p pVar, int i, int i5) {
        this.f6244k = pVar;
        this.f6245l = i;
        this.f6246m = q.f(pVar);
        this.f6247n = i5 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        c();
        int i = this.f6245l + this.f6247n;
        p pVar = this.f6244k;
        pVar.add(i, obj);
        this.f6247n++;
        this.f6246m = q.f(pVar);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f6247n, collection);
    }

    public final void c() {
        if (q.f(this.f6244k) != this.f6246m) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f6247n > 0) {
            c();
            int i = this.f6247n;
            int i5 = this.f6245l;
            p pVar = this.f6244k;
            pVar.g(i5, i + i5);
            this.f6247n = 0;
            this.f6246m = q.f(pVar);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        c();
        q.a(i, this.f6247n);
        return this.f6244k.get(this.f6245l + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        int i = this.f6247n;
        int i5 = this.f6245l;
        Iterator it = AbstractC0444a.f0(i5, i + i5).iterator();
        while (it.hasNext()) {
            int a5 = ((X3.y) it).a();
            if (kotlin.jvm.internal.l.a(obj, this.f6244k.get(a5))) {
                return a5 - i5;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f6247n == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        int i = this.f6247n;
        int i5 = this.f6245l;
        for (int i6 = (i + i5) - 1; i6 >= i5; i6--) {
            if (kotlin.jvm.internal.l.a(obj, this.f6244k.get(i6))) {
                return i6 - i5;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z3 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z3) {
                    z3 = true;
                }
            }
            return z3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        T.c cVar;
        f k5;
        boolean b3;
        c();
        p pVar = this.f6244k;
        int i5 = this.f6245l;
        int i6 = this.f6247n + i5;
        int size = pVar.size();
        do {
            synchronized (q.f6219a) {
                t tVar = pVar.f6218k;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>", tVar);
                t tVar2 = (t) l.i(tVar);
                i = tVar2.f6239d;
                cVar = tVar2.f6238c;
            }
            kotlin.jvm.internal.l.c(cVar);
            T.f g5 = cVar.g();
            g5.subList(i5, i6).retainAll(collection);
            T.c e3 = g5.e();
            if (kotlin.jvm.internal.l.a(e3, cVar)) {
                break;
            }
            t tVar3 = pVar.f6218k;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>", tVar3);
            synchronized (l.f6208c) {
                k5 = l.k();
                b3 = q.b((t) l.x(tVar3, pVar, k5), i, e3, true);
            }
            l.o(k5, pVar);
        } while (!b3);
        int size2 = size - pVar.size();
        if (size2 > 0) {
            this.f6246m = q.f(this.f6244k);
            this.f6247n -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        q.a(i, this.f6247n);
        c();
        int i5 = i + this.f6245l;
        p pVar = this.f6244k;
        Object obj2 = pVar.set(i5, obj);
        this.f6246m = q.f(pVar);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f6247n;
    }

    @Override // java.util.List
    public final List subList(int i, int i5) {
        if (!(i >= 0 && i <= i5 && i5 <= this.f6247n)) {
            AbstractC0316s0.a("fromIndex or toIndex are out of bounds");
        }
        c();
        int i6 = this.f6245l;
        return new x(this.f6244k, i + i6, i5 + i6);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        c();
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        uVar.f17622k = i - 1;
        return new A(uVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.k.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        c();
        int i5 = i + this.f6245l;
        p pVar = this.f6244k;
        boolean addAll = pVar.addAll(i5, collection);
        if (addAll) {
            this.f6247n = collection.size() + this.f6247n;
            this.f6246m = q.f(pVar);
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        c();
        int i5 = this.f6245l + i;
        p pVar = this.f6244k;
        Object remove = pVar.remove(i5);
        this.f6247n--;
        this.f6246m = q.f(pVar);
        return remove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        c();
        int i5 = this.f6245l + i;
        p pVar = this.f6244k;
        pVar.add(i5, obj);
        this.f6247n++;
        this.f6246m = q.f(pVar);
    }
}
