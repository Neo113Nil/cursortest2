package z6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class h implements Iterator, u6.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f18545a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18546b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18547c;

    /* renamed from: d, reason: collision with root package name */
    public long f18548d;

    public h(long j, long j3, long j7) {
        this.f18545a = j7;
        this.f18546b = j3;
        boolean z4 = false;
        if (j7 <= 0 ? j >= j3 : j <= j3) {
            z4 = true;
        }
        this.f18547c = z4;
        this.f18548d = z4 ? j : j3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18547c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.f18548d;
        if (j != this.f18546b) {
            this.f18548d = this.f18545a + j;
        } else {
            if (!this.f18547c) {
                throw new NoSuchElementException();
            }
            this.f18547c = false;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
