package z6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class e implements Iterator, u6.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f18537a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18538b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18539c;

    /* renamed from: d, reason: collision with root package name */
    public int f18540d;

    public e(int i7, int i8, int i9) {
        this.f18537a = i9;
        this.f18538b = i8;
        boolean z4 = false;
        if (i9 <= 0 ? i7 >= i8 : i7 <= i8) {
            z4 = true;
        }
        this.f18539c = z4;
        this.f18540d = z4 ? i7 : i8;
    }

    public final int a() {
        int i7 = this.f18540d;
        if (i7 != this.f18538b) {
            this.f18540d = this.f18537a + i7;
        } else {
            if (!this.f18539c) {
                throw new NoSuchElementException();
            }
            this.f18539c = false;
        }
        return i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18539c;
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
