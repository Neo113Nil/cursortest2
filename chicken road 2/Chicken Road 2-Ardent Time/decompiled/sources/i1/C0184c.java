package i1;

/* renamed from: i1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184c extends i1.C0183b implements java.util.ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i1.AbstractC0186e f3312d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0184c(i1.AbstractC0186e abstractC0186e, int i2) {
        super(abstractC0186e);
        this.f3312d = abstractC0186e;
        int a2 = abstractC0186e.a();
        if (i2 < 0 || i2 > a2) {
            throw new java.lang.IndexOutOfBoundsException(B1.a.h("index: ", i2, a2, ", size: "));
        }
        this.f3310b = i2;
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3310b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3310b;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i2 = this.f3310b - 1;
        this.f3310b = i2;
        return this.f3312d.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3310b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
