package p050g6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public class a implements Iterator, u6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13294a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13296c;

    public a(Object[] objArr) {
        h.e(objArr, "array");
        this.f13296c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f13294a) {
            case 0:
                return this.f13295b < ((d) this.f13296c).l();
            default:
                return this.f13295b < ((Object[]) this.f13296c).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f13294a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i7 = this.f13295b;
                this.f13295b = i7 + 1;
                return ((d) this.f13296c).get(i7);
            default:
                try {
                    Object[] objArr = (Object[]) this.f13296c;
                    int i8 = this.f13295b;
                    this.f13295b = i8 + 1;
                    return objArr[i8];
                } catch (ArrayIndexOutOfBoundsException e7) {
                    this.f13295b--;
                    throw new NoSuchElementException(e7.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f13294a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(d dVar) {
        this.f13296c = dVar;
    }
}
