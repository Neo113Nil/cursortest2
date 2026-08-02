package z0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* renamed from: z0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2759p implements List, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final int f21840k;

    /* renamed from: l, reason: collision with root package name */
    public final int f21841l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2760q f21842m;

    public C2759p(C2760q c2760q, int i, int i5) {
        this.f21842m = c2760q;
        this.f21840k = i;
        this.f21841l = i5;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof b0.o) && indexOf((b0.o) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((b0.o) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object e3 = this.f21842m.f21850k.e(i + this.f21840k);
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node", e3);
        return (b0.o) e3;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof b0.o)) {
            return -1;
        }
        b0.o oVar = (b0.o) obj;
        int i = this.f21840k;
        int i5 = this.f21841l;
        if (i <= i5) {
            int i6 = i;
            while (!kotlin.jvm.internal.l.a(this.f21842m.f21850k.e(i6), oVar)) {
                if (i6 != i5) {
                    i6++;
                }
            }
            return i6 - i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f21840k;
        return new Y3.a(this.f21842m, i, i, this.f21841l);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof b0.o)) {
            return -1;
        }
        b0.o oVar = (b0.o) obj;
        int i = this.f21841l;
        int i5 = this.f21840k;
        if (i5 <= i) {
            while (!kotlin.jvm.internal.l.a(this.f21842m.f21850k.e(i), oVar)) {
                if (i != i5) {
                    i--;
                }
            }
            return i - i5;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i = this.f21840k;
        return new Y3.a(this.f21842m, i, i, this.f21841l);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f21841l - this.f21840k;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i5) {
        int i6 = this.f21840k;
        return new C2759p(this.f21842m, i + i6, i6 + i5);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        int i5 = this.f21840k;
        int i6 = this.f21841l;
        return new Y3.a(this.f21842m, i + i5, i5, i6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.k.b(this, objArr);
    }
}
