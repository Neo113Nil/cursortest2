package z6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Iterator, u6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18539d;

    public b(char c3, char c4, int i7) {
        this.f18536a = i7;
        this.f18537b = c4;
        boolean z4 = false;
        if (i7 <= 0 ? t6.h.f(c3, c4) >= 0 : t6.h.f(c3, c4) <= 0) {
            z4 = true;
        }
        this.f18538c = z4;
        this.f18539d = z4 ? c3 : c4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18538c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f18539d;
        if (i7 != this.f18537b) {
            this.f18539d = this.f18536a + i7;
        } else {
            if (!this.f18538c) {
                throw new NoSuchElementException();
            }
            this.f18538c = false;
        }
        return Character.valueOf((char) i7);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
