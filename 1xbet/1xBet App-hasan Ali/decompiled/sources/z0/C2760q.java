package z0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import r.C2316B;
import s.AbstractC2351a;

/* renamed from: z0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2760q implements List, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final C2316B f21850k = new C2316B(16);

    /* renamed from: l, reason: collision with root package name */
    public final r.x f21851l = new r.x(16);

    /* renamed from: m, reason: collision with root package name */
    public int f21852m = -1;

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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c() {
        long a5 = AbstractC2749f.a(Float.POSITIVE_INFINITY, false, false);
        int i = this.f21852m + 1;
        int N5 = X3.n.N(this);
        if (i > N5) {
            return a5;
        }
        while (true) {
            r.x xVar = this.f21851l;
            if (i < 0) {
                xVar.getClass();
                break;
            }
            if (i >= xVar.f19058b) {
                break;
            }
            long j5 = xVar.f19057a[i];
            if (AbstractC2749f.h(j5, a5) < 0) {
                a5 = j5;
            }
            if ((AbstractC2749f.l(a5) >= 0.0f || !AbstractC2749f.q(a5)) && i != N5) {
                i++;
            }
        }
        AbstractC2351a.d("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f21852m = -1;
        this.f21850k.c();
        this.f21851l.f19058b = 0;
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

    public final void d(int i, int i5) {
        if (i >= i5) {
            return;
        }
        this.f21850k.k(i, i5);
        r.x xVar = this.f21851l;
        if (i >= 0) {
            int i6 = xVar.f19058b;
            if (i <= i6 && i5 >= 0 && i5 <= i6) {
                if (i5 < i) {
                    AbstractC2351a.c("The end index must be < start index");
                    throw null;
                }
                if (i5 != i) {
                    if (i5 < i6) {
                        long[] jArr = xVar.f19057a;
                        X3.l.v0(jArr, jArr, i, i5, i6);
                    }
                    xVar.f19058b -= i5 - i;
                    return;
                }
                return;
            }
        } else {
            xVar.getClass();
        }
        AbstractC2351a.d("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object e3 = this.f21850k.e(i);
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node", e3);
        return (b0.o) e3;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof b0.o)) {
            return -1;
        }
        b0.o oVar = (b0.o) obj;
        int N5 = X3.n.N(this);
        if (N5 >= 0) {
            int i = 0;
            while (!kotlin.jvm.internal.l.a(this.f21850k.e(i), oVar)) {
                if (i != N5) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f21850k.g();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new Y3.a(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof b0.o)) {
            return -1;
        }
        b0.o oVar = (b0.o) obj;
        for (int N5 = X3.n.N(this); -1 < N5; N5--) {
            if (kotlin.jvm.internal.l.a(this.f21850k.e(N5), oVar)) {
                return N5;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new Y3.a(this, 0, 7);
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
        return this.f21850k.f18905b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i5) {
        return new C2759p(this, i, i5);
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
        return new Y3.a(this, i, 6);
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
