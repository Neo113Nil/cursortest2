package T;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g extends a {

    /* renamed from: m, reason: collision with root package name */
    public final Object[] f5591m;

    /* renamed from: n, reason: collision with root package name */
    public final j f5592n;

    public g(int i, int i5, int i6, Object[] objArr, Object[] objArr2) {
        super(i, i5);
        this.f5591m = objArr2;
        int i7 = (i5 - 1) & (-32);
        this.f5592n = new j(objArr, i > i7 ? i7 : i, i7, i6);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        j jVar = this.f5592n;
        if (jVar.hasNext()) {
            this.f5573k++;
            return jVar.next();
        }
        int i = this.f5573k;
        this.f5573k = i + 1;
        return this.f5591m[i - jVar.f5574l];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f5573k;
        j jVar = this.f5592n;
        int i5 = jVar.f5574l;
        if (i <= i5) {
            this.f5573k = i - 1;
            return jVar.previous();
        }
        int i6 = i - 1;
        this.f5573k = i6;
        return this.f5591m[i6 - i5];
    }
}
