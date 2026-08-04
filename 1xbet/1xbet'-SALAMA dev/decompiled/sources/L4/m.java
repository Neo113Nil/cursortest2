package L4;

import java.util.Date;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f4379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f4380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4383e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C1017n0 f4386h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4385g = new Date().getTime();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4384f = 0;

    public m(f fVar, e eVar, long j, long j3) {
        this.f4379a = fVar;
        this.f4380b = eVar;
        this.f4381c = j;
        this.f4382d = j3;
        this.f4383e = j3;
    }

    public final void a(Runnable runnable) {
        C1017n0 c1017n0 = this.f4386h;
        if (c1017n0 != null) {
            c1017n0.f();
            this.f4386h = null;
        }
        long jRandom = this.f4384f + ((long) ((Math.random() - 0.5d) * this.f4384f));
        long jMax = Math.max(0L, new Date().getTime() - this.f4385g);
        long jMax2 = Math.max(0L, jRandom - jMax);
        if (this.f4384f > 0) {
            Q0.a.v(1, m.class.getSimpleName(), "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)", Long.valueOf(jMax2), Long.valueOf(this.f4384f), Long.valueOf(jRandom), Long.valueOf(jMax));
        }
        this.f4386h = this.f4379a.b(this.f4380b, jMax2, new K5.a(3, this, runnable));
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
