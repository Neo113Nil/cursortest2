package g4;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: g4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0457b extends N4.g implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0459d f5739d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0457b(AbstractC0459d abstractC0459d, int i2) {
        super(5, abstractC0459d);
        this.f5739d = abstractC0459d;
        int c2 = abstractC0459d.c();
        if (i2 < 0 || i2 > c2) {
            throw new IndexOutOfBoundsException(B0.o.h("index: ", i2, c2, ", size: "));
        }
        this.f2185b = i2;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2185b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2185b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f2185b - 1;
        this.f2185b = i2;
        return this.f5739d.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2185b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
