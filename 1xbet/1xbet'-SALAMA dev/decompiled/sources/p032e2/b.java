package p032e2;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12582c;

    public b(long j, long j3) {
        this.f12580a = j;
        this.f12581b = j3;
        this.f12582c = j - 1;
    }

    public final void a() {
        long j = this.f12582c;
        if (j < this.f12580a || j > this.f12581b) {
            throw new NoSuchElementException();
        }
    }

    @Override // p032e2.k
    public final boolean next() {
        long j = this.f12582c + 1;
        this.f12582c = j;
        return !(j > this.f12581b);
    }
}
