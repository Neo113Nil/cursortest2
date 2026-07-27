package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator, p2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9659a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f9660b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9661c;

    public a(Object[] array) {
        j.e(array, "array");
        this.f9661c = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9659a) {
            case 0:
                if (this.f9660b < ((Object[]) this.f9661c).length) {
                }
                break;
            default:
                if (this.f9660b <= 0 || !((Iterator) this.f9661c).hasNext()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9659a) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f9661c;
                    int i3 = this.f9660b;
                    this.f9660b = i3 + 1;
                    return objArr[i3];
                } catch (ArrayIndexOutOfBoundsException e3) {
                    this.f9660b--;
                    throw new NoSuchElementException(e3.getMessage());
                }
            default:
                int i4 = this.f9660b;
                if (i4 == 0) {
                    throw new NoSuchElementException();
                }
                this.f9660b = i4 - 1;
                return ((Iterator) this.f9661c).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9659a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(u2.i iVar) {
        iVar.getClass();
        this.f9660b = 10;
        this.f9661c = new u2.b(iVar.f10390a);
    }
}
