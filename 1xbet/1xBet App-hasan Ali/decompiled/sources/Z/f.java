package Z;

import S3.C0416t;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public j f6187a;

    /* renamed from: b, reason: collision with root package name */
    public long f6188b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6189c;

    /* renamed from: d, reason: collision with root package name */
    public int f6190d;

    public f(long j5, j jVar) {
        int i;
        int numberOfTrailingZeros;
        this.f6187a = jVar;
        this.f6188b = j5;
        C0416t c0416t = l.f6206a;
        if (j5 != 0) {
            j d5 = d();
            long[] jArr = d5.f6202n;
            if (jArr != null) {
                j5 = jArr[0];
            } else {
                long j6 = d5.f6200l;
                long j7 = d5.f6201m;
                if (j6 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j6);
                } else {
                    long j8 = d5.f6199k;
                    if (j8 != 0) {
                        j7 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j8);
                    }
                }
                j5 = numberOfTrailingZeros + j7;
            }
            synchronized (l.f6208c) {
                i = l.f.a(j5);
            }
        } else {
            i = -1;
        }
        this.f6190d = i;
    }

    public static void q(f fVar) {
        l.f6207b.L(fVar);
    }

    public final void a() {
        synchronized (l.f6208c) {
            b();
            p();
        }
    }

    public void b() {
        l.f6209d = l.f6209d.d(g());
    }

    public abstract void c();

    public j d() {
        return this.f6187a;
    }

    public abstract i4.c e();

    public abstract boolean f();

    public long g() {
        return this.f6188b;
    }

    public int h() {
        return 0;
    }

    public abstract i4.c i();

    public final f j() {
        v3.e eVar = l.f6207b;
        f fVar = (f) eVar.u();
        eVar.L(this);
        return fVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(u uVar);

    public final void o() {
        int i = this.f6190d;
        if (i >= 0) {
            l.v(i);
            this.f6190d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(j jVar) {
        this.f6187a = jVar;
    }

    public void s(long j5) {
        this.f6188b = j5;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract f u(i4.c cVar);
}
