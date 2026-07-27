package L3;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final double f1499a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1500b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f1501c;

    public h(double d6, double d7) {
        double d8 = d6 / 1.0E9d;
        this.f1499a = d8;
        long j2 = (long) (d7 / d8);
        this.f1500b = j2;
        this.f1501c = new AtomicLong(System.nanoTime() - j2);
    }

    public final boolean a(double d6) {
        AtomicLong atomicLong;
        long j2;
        long nanoTime;
        long j6;
        long j7 = (long) (d6 / this.f1499a);
        do {
            atomicLong = this.f1501c;
            j2 = atomicLong.get();
            nanoTime = System.nanoTime();
            long j8 = nanoTime - j2;
            long j9 = this.f1500b;
            if (j8 > j9) {
                j8 = j9;
            }
            j6 = j8 - j7;
            if (j6 < 0) {
                return false;
            }
        } while (!atomicLong.compareAndSet(j2, nanoTime - j6));
        return true;
    }
}
