package W0;

import gd.InterfaceC6712a;
import java.util.ListIterator;

/* loaded from: classes8.dex */
public abstract class a<E> implements ListIterator<E>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    private int f33160a;

    /* renamed from: b, reason: collision with root package name */
    private int f33161b;

    public a(int i11, int i12) {
        this.f33160a = i11;
        this.f33161b = i12;
    }

    @Override // java.util.ListIterator
    public void add(E e11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int b() {
        return this.f33160a;
    }

    public final int c() {
        return this.f33161b;
    }

    public final void e(int i11) {
        this.f33160a = i11;
    }

    public final void h(int i11) {
        this.f33161b = i11;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f33160a < this.f33161b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f33160a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f33160a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f33160a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
