package L4;

import java.util.Date;
import w1.C1726n0;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final f f4379a;

    /* renamed from: b, reason: collision with root package name */
    public final e f4380b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4381c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4382d;

    /* renamed from: e, reason: collision with root package name */
    public long f4383e;

    /* renamed from: h, reason: collision with root package name */
    public C1726n0 f4386h;

    /* renamed from: g, reason: collision with root package name */
    public long f4385g = new Date().getTime();

    /* renamed from: f, reason: collision with root package name */
    public long f4384f = 0;

    public m(f fVar, e eVar, long j, long j3) {
        this.f4379a = fVar;
        this.f4380b = eVar;
        this.f4381c = j;
        this.f4382d = j3;
        this.f4383e = j3;
    }

    public final void a(Runnable runnable) {
        C1726n0 c1726n0 = this.f4386h;
        if (c1726n0 != null) {
            c1726n0.f();
            this.f4386h = null;
        }
        long random = this.f4384f + ((long) ((Math.random() - 0.5d) * this.f4384f));
        long max = Math.max(0L, new Date().getTime() - this.f4385g);
        long max2 = Math.max(0L, random - max);
        if (this.f4384f > 0) {
            Q0.a.v(1, m.class.getSimpleName(), "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)", Long.valueOf(max2), Long.valueOf(this.f4384f), Long.valueOf(random), Long.valueOf(max));
        }
        this.f4386h = this.f4379a.b(this.f4380b, max2, new K5.a(3, this, runnable));
        long j = (long) (this.f4384f * 1.5d);
        this.f4384f = j;
        long j3 = this.f4381c;
        if (j < j3) {
            this.f4384f = j3;
        } else {
            long j7 = this.f4383e;
            if (j > j7) {
                this.f4384f = j7;
            }
        }
        this.f4383e = this.f4382d;
    }
}
