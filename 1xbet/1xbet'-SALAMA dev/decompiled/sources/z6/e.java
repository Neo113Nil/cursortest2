package z6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Iterator, u6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18546d;

    public e(int i7, int i8, int i9) {
        this.f18543a = i9;
        this.f18544b = i8;
        boolean z4 = false;
        if (i9 <= 0 ? i7 >= i8 : i7 <= i8) {
            z4 = true;
        }
        this.f18545c = z4;
        this.f18546d = z4 ? i7 : i8;
    }

    public final int a() {
        int i7 = this.f18546d;
        if (i7 != this.f18544b) {
            this.f18546d = this.f18543a + i7;
        } else {
            if (!this.f18545c) {
                throw new NoSuchElementException();
            }
            this.f18545c = false;
        }
        return i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18545c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
