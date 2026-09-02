package g0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f530b;

    /* renamed from: c, reason: collision with root package name */
    public int f531c;

    public a(Object[] objArr) {
        this.f530b = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f531c < this.f530b.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f530b;
            int i2 = this.f531c;
            this.f531c = i2 + 1;
            return objArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f531c--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
