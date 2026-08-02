package X3;

import java.util.ListIterator;
import l4.C2062d;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class A implements ListIterator, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6070k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Object f6071l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6072m;

    public A(B b3, int i) {
        this.f6072m = b3;
        if (i >= 0 && i <= b3.c()) {
            this.f6071l = b3.f6073k.listIterator(b3.c() - i);
        } else {
            StringBuilder v4 = AbstractC2107A.v(i, "Position index ", " must be in range [");
            v4.append(new C2062d(0, b3.c(), 1));
            v4.append("].");
            throw new IndexOutOfBoundsException(v4.toString());
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f6070k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6070k) {
            case 0:
                return ((ListIterator) this.f6071l).hasPrevious();
            default:
                return ((kotlin.jvm.internal.u) this.f6071l).f17622k < ((Z.x) this.f6072m).f6247n - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f6070k) {
            case 0:
                return ((ListIterator) this.f6071l).hasNext();
            default:
                return ((kotlin.jvm.internal.u) this.f6071l).f17622k >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f6070k) {
            case 0:
                return ((ListIterator) this.f6071l).previous();
            default:
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) this.f6071l;
                int i = uVar.f17622k + 1;
                Z.x xVar = (Z.x) this.f6072m;
                Z.q.a(i, xVar.f6247n);
                uVar.f17622k = i;
                return xVar.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f6070k) {
            case 0:
                return n.N((B) this.f6072m) - ((ListIterator) this.f6071l).previousIndex();
            default:
                return ((kotlin.jvm.internal.u) this.f6071l).f17622k + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f6070k) {
            case 0:
                return ((ListIterator) this.f6071l).next();
            default:
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) this.f6071l;
                int i = uVar.f17622k;
                Z.x xVar = (Z.x) this.f6072m;
                Z.q.a(i, xVar.f6247n);
                uVar.f17622k = i - 1;
                return xVar.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f6070k) {
            case 0:
                return n.N((B) this.f6072m) - ((ListIterator) this.f6071l).nextIndex();
            default:
                return ((kotlin.jvm.internal.u) this.f6071l).f17622k;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f6070k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f6070k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public A(kotlin.jvm.internal.u uVar, Z.x xVar) {
        this.f6071l = uVar;
        this.f6072m = xVar;
    }
}
