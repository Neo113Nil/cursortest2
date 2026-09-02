package i1;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0183b implements java.util.Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3309a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f3310b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f3311c;

    public C0183b(java.lang.Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        this.f3311c = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        java.util.Iterator it;
        switch (this.f3309a) {
            case 0:
                return this.f3310b < ((i1.AbstractC0186e) this.f3311c).a();
            case 1:
                return this.f3310b < ((java.lang.Object[]) this.f3311c).length;
        }
        while (true) {
            int i2 = this.f3310b;
            it = (java.util.Iterator) this.f3311c;
            if (i2 > 0 && it.hasNext()) {
                it.next();
                this.f3310b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.util.Iterator it;
        switch (this.f3309a) {
            case 0:
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                int i2 = this.f3310b;
                this.f3310b = i2 + 1;
                return ((i1.AbstractC0186e) this.f3311c).get(i2);
            case 1:
                try {
                    java.lang.Object[] objArr = (java.lang.Object[]) this.f3311c;
                    int i3 = this.f3310b;
                    this.f3310b = i3 + 1;
                    return objArr[i3];
                } catch (java.lang.ArrayIndexOutOfBoundsException e2) {
                    this.f3310b--;
                    throw new java.util.NoSuchElementException(e2.getMessage());
                }
        }
        while (true) {
            int i4 = this.f3310b;
            it = (java.util.Iterator) this.f3311c;
            if (i4 > 0 && it.hasNext()) {
                it.next();
                this.f3310b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3309a) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0183b(i1.AbstractC0186e abstractC0186e) {
        this.f3311c = abstractC0186e;
    }

    public C0183b(x1.b bVar) {
        this.f3311c = bVar.f8416a.iterator();
        this.f3310b = bVar.f8417b;
    }
}
