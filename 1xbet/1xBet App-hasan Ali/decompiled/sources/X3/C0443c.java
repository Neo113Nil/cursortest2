package X3;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: X3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0443c extends C0442b implements ListIterator {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e f6077n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0443c(e eVar, int i) {
        super(0, eVar);
        this.f6077n = eVar;
        int c5 = eVar.c();
        if (i < 0 || i > c5) {
            throw new IndexOutOfBoundsException(L1.a.k(i, c5, "index: ", ", size: "));
        }
        this.f6075l = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6075l > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6075l;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f6075l - 1;
        this.f6075l = i;
        return this.f6077n.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6075l - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
