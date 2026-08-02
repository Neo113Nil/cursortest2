package z6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class b implements Iterator, u6.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f18530a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18531b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18532c;

    /* renamed from: d, reason: collision with root package name */
    public int f18533d;

    public b(char c3, char c4, int i7) {
        this.f18530a = i7;
        this.f18531b = c4;
        boolean z4 = false;
        if (i7 <= 0 ? t6.h.f(c3, c4) >= 0 : t6.h.f(c3, c4) <= 0) {
            z4 = true;
        }
        this.f18532c = z4;
        this.f18533d = z4 ? c3 : c4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18532c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f18533d;
        if (i7 != this.f18531b) {
            this.f18533d = this.f18530a + i7;
        } else {
            if (!this.f18532c) {
                throw new NoSuchElementException();
            }
            this.f18532c = false;
        }
        return Character.valueOf((char) i7);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
