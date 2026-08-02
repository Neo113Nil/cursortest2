package g6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: g6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1152a implements Iterator, u6.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13288a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f13289b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13290c;

    public C1152a(Object[] objArr) {
        t6.h.e(objArr, "array");
        this.f13290c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f13288a) {
            case 0:
                if (this.f13289b < ((AbstractC1155d) this.f13290c).l()) {
                }
                break;
            default:
                if (this.f13289b < ((Object[]) this.f13290c).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f13288a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i7 = this.f13289b;
                this.f13289b = i7 + 1;
                return ((AbstractC1155d) this.f13290c).get(i7);
            default:
                try {
                    Object[] objArr = (Object[]) this.f13290c;
                    int i8 = this.f13289b;
                    this.f13289b = i8 + 1;
                    return objArr[i8];
                } catch (ArrayIndexOutOfBoundsException e7) {
                    this.f13289b--;
                    throw new NoSuchElementException(e7.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f13288a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1152a(AbstractC1155d abstractC1155d) {
        this.f13290c = abstractC1155d;
    }
}
