package Gc;

import I0.C3173b;
import Kc.C3493a;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class d {
    public static long a(AtomicLong atomicLong, long j11) {
        long j12;
        do {
            j12 = atomicLong.get();
            if (j12 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j12, b(j12, j11)));
        return j12;
    }

    public static long b(long j11, long j12) {
        long j13 = j11 + j12;
        if (j13 < 0) {
            return Long.MAX_VALUE;
        }
        return j13;
    }

    public static void c(AtomicLong atomicLong, long j11) {
        long j12;
        long j13;
        do {
            j12 = atomicLong.get();
            if (j12 == Long.MAX_VALUE) {
                return;
            }
            j13 = j12 - j11;
            if (j13 < 0) {
                C3493a.f(new IllegalStateException(C3173b.b(j13, "More produced than requested: ")));
                j13 = 0;
            }
        } while (!atomicLong.compareAndSet(j12, j13));
    }
}
