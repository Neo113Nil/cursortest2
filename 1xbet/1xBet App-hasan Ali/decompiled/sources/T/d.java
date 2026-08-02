package T;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5577m = 1;

    /* renamed from: n, reason: collision with root package name */
    public final Object f5578n;

    public d(Object[] objArr, int i, int i5) {
        super(i, i5);
        this.f5578n = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f5577m) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f5573k;
                this.f5573k = i + 1;
                return ((Object[]) this.f5578n)[i];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f5573k++;
                return this.f5578n;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f5577m) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i = this.f5573k - 1;
                this.f5573k = i;
                return ((Object[]) this.f5578n)[i];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f5573k--;
                return this.f5578n;
        }
    }

    public d(int i, Object obj) {
        super(i, 1);
        this.f5578n = obj;
    }
}
