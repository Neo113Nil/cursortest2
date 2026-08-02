package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class Kn {

    /* renamed from: a, reason: collision with root package name */
    public long f10247a;

    /* renamed from: b, reason: collision with root package name */
    public long f10248b;

    /* renamed from: c, reason: collision with root package name */
    public long f10249c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f10250d = new ThreadLocal();

    public Kn() {
        f(0L);
    }

    public final synchronized long a(long j5) {
        if (j5 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!g()) {
                long j6 = this.f10247a;
                if (j6 == 9223372036854775806L) {
                    Long l5 = (Long) this.f10250d.get();
                    if (l5 == null) {
                        throw null;
                    }
                    j6 = l5.longValue();
                }
                this.f10248b = j6 - j5;
                notifyAll();
            }
            this.f10249c = j5;
            return j5 + this.f10248b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j5) {
        if (j5 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j6 = this.f10249c;
            if (j6 != -9223372036854775807L) {
                long u5 = AbstractC1260lo.u(j6, 90000L, 1000000L, RoundingMode.DOWN);
                long j7 = (4294967296L + u5) / 8589934592L;
                long j8 = (((-1) + j7) * 8589934592L) + j5;
                long j9 = (j7 * 8589934592L) + j5;
                j5 = Math.abs(j8 - u5) < Math.abs(j9 - u5) ? j8 : j9;
            }
            return a(AbstractC1260lo.u(j5, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j5) {
        if (j5 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j6 = this.f10249c;
        if (j6 != -9223372036854775807L) {
            long u5 = AbstractC1260lo.u(j6, 90000L, 1000000L, RoundingMode.DOWN);
            long j7 = u5 / 8589934592L;
            Long.signum(j7);
            long j8 = (j7 * 8589934592L) + j5;
            j5 = j8 >= u5 ? j8 : ((j7 + 1) * 8589934592L) + j5;
        }
        return a(AbstractC1260lo.u(j5, 1000000L, 90000L, RoundingMode.DOWN));
    }

    public final synchronized long d() {
        long j5 = this.f10247a;
        if (j5 == Long.MAX_VALUE || j5 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j5;
    }

    public final synchronized long e() {
        return this.f10248b;
    }

    public final synchronized void f(long j5) {
        this.f10247a = j5;
        this.f10248b = j5 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f10249c = -9223372036854775807L;
    }

    public final synchronized boolean g() {
        return this.f10248b != -9223372036854775807L;
    }
}
