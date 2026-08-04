package z6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Iterator, u6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18554d;

    public h(long j, long j3, long j7) {
        this.f18551a = j7;
        this.f18552b = j3;
        boolean z4 = false;
        if (j7 <= 0 ? j >= j3 : j <= j3) {
            z4 = true;
        }
        this.f18553c = z4;
        this.f18554d = z4 ? j : j3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18553c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.f18554d;
        if (j != this.f18552b) {
            this.f18554d = this.f18551a + j;
        } else {
            if (!this.f18553c) {
                throw new NoSuchElementException();
            }
            this.f18553c = false;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
