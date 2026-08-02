package g6;

import W5.AbstractC0486a1;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: g6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1153b extends C1152a implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1155d f13291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1153b(AbstractC1155d abstractC1155d, int i7) {
        super(abstractC1155d);
        this.f13291d = abstractC1155d;
        int l7 = abstractC1155d.l();
        if (i7 < 0 || i7 > l7) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, l7, "index: ", ", size: "));
        }
        this.f13289b = i7;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13289b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13289b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f13289b - 1;
        this.f13289b = i7;
        return this.f13291d.get(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13289b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
