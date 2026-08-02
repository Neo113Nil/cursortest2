package androidx.media3.exoplayer;

import android.os.SystemClock;
import j3.C7275q;

/* renamed from: androidx.media3.exoplayer.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5445g {

    /* renamed from: a, reason: collision with root package name */
    private final long f43806a;

    /* renamed from: b, reason: collision with root package name */
    private final long f43807b;

    /* renamed from: c, reason: collision with root package name */
    private final float f43808c;

    /* renamed from: d, reason: collision with root package name */
    private long f43809d = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    private long f43810e = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f43812g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f43813h = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    private float f43816k = 0.97f;

    /* renamed from: j, reason: collision with root package name */
    private float f43815j = 1.03f;

    /* renamed from: l, reason: collision with root package name */
    private float f43817l = 1.0f;

    /* renamed from: m, reason: collision with root package name */
    private long f43818m = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    private long f43811f = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    private long f43814i = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private long f43819n = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    private long f43820o = -9223372036854775807L;

    /* renamed from: androidx.media3.exoplayer.g$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f43821a = m3.N.Q(20);

        /* renamed from: b, reason: collision with root package name */
        private long f43822b = m3.N.Q(500);

        /* renamed from: c, reason: collision with root package name */
        private float f43823c = 0.999f;

        public final C5445g a() {
            return new C5445g(this.f43821a, this.f43822b, this.f43823c);
        }
    }

    C5445g(long j11, long j12, float f7) {
        this.f43806a = j11;
        this.f43807b = j12;
        this.f43808c = f7;
    }

    private void c() {
        long j11;
        long j12 = this.f43809d;
        if (j12 != -9223372036854775807L) {
            j11 = this.f43810e;
            if (j11 == -9223372036854775807L) {
                long j13 = this.f43812g;
                if (j13 != -9223372036854775807L && j12 < j13) {
                    j12 = j13;
                }
                j11 = this.f43813h;
                if (j11 == -9223372036854775807L || j12 <= j11) {
                    j11 = j12;
                }
            }
        } else {
            j11 = -9223372036854775807L;
        }
        if (this.f43811f == j11) {
            return;
        }
        this.f43811f = j11;
        this.f43814i = j11;
        this.f43819n = -9223372036854775807L;
        this.f43820o = -9223372036854775807L;
        this.f43818m = -9223372036854775807L;
    }

    public final float a(long j11, long j12) {
        if (this.f43809d == -9223372036854775807L) {
            return 1.0f;
        }
        long j13 = j11 - j12;
        long j14 = this.f43819n;
        if (j14 == -9223372036854775807L) {
            this.f43819n = j13;
            this.f43820o = 0L;
        } else {
            float f7 = j14;
            float f11 = this.f43808c;
            float f12 = 1.0f - f11;
            this.f43819n = Math.max(j13, (long) ((j13 * f12) + (f7 * f11)));
            this.f43820o = (long) ((f12 * Math.abs(j13 - r9)) + (f11 * this.f43820o));
        }
        if (this.f43818m != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f43818m < 1000) {
            return this.f43817l;
        }
        this.f43818m = SystemClock.elapsedRealtime();
        long j15 = (this.f43820o * 3) + this.f43819n;
        if (this.f43814i > j15) {
            float Q11 = m3.N.Q(1000L);
            this.f43814i = com.google.common.primitives.d.c(j15, this.f43811f, this.f43814i - (((long) ((this.f43817l - 1.0f) * Q11)) + ((long) ((this.f43815j - 1.0f) * Q11))));
        } else {
            long j16 = m3.N.j(j11 - ((long) (Math.max(0.0f, this.f43817l - 1.0f) / 1.0E-7f)), this.f43814i, j15);
            this.f43814i = j16;
            long j17 = this.f43813h;
            if (j17 != -9223372036854775807L && j16 > j17) {
                this.f43814i = j17;
            }
        }
        long j18 = j11 - this.f43814i;
        if (Math.abs(j18) < this.f43806a) {
            this.f43817l = 1.0f;
        } else {
            this.f43817l = m3.N.h((1.0E-7f * j18) + 1.0f, this.f43816k, this.f43815j);
        }
        return this.f43817l;
    }

    public final long b() {
        return this.f43814i;
    }

    public final void d() {
        long j11 = this.f43814i;
        if (j11 == -9223372036854775807L) {
            return;
        }
        long j12 = j11 + this.f43807b;
        this.f43814i = j12;
        long j13 = this.f43813h;
        if (j13 != -9223372036854775807L && j12 > j13) {
            this.f43814i = j13;
        }
        this.f43818m = -9223372036854775807L;
    }

    public final void e(C7275q.e eVar) {
        this.f43809d = m3.N.Q(eVar.f69230a);
        this.f43812g = m3.N.Q(eVar.f69231b);
        this.f43813h = m3.N.Q(eVar.f69232c);
        float f7 = eVar.f69233d;
        if (f7 == -3.4028235E38f) {
            f7 = 0.97f;
        }
        this.f43816k = f7;
        float f11 = eVar.f69234e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        this.f43815j = f11;
        if (f7 == 1.0f && f11 == 1.0f) {
            this.f43809d = -9223372036854775807L;
        }
        c();
    }

    public final void f(long j11) {
        this.f43810e = j11;
        c();
    }
}
