package T;

import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class a implements ListIterator, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public int f5573k;

    /* renamed from: l, reason: collision with root package name */
    public int f5574l;

    public a(int i, int i5) {
        this.f5573k = i;
        this.f5574l = i5;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f5573k < this.f5574l;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5573k > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5573k;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5573k - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
