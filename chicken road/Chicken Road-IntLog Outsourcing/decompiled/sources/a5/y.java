package a5;

import java.util.TimeZone;

/* loaded from: classes.dex */
public final class y implements j5.u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4031a;

    /* renamed from: b, reason: collision with root package name */
    public final j5.f f4032b = new j5.f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f4033c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B f4034d;

    public y(B b6, boolean z) {
        this.f4034d = b6;
        this.f4031a = z;
    }

    @Override // j5.u
    public final void B(j5.f fVar, long j2) {
        TimeZone timeZone = U4.e.f3179a;
        j5.f fVar2 = this.f4032b;
        fVar2.B(fVar, j2);
        while (fVar2.f10495b >= 16384) {
            a(false);
        }
    }

    public final void a(boolean z) {
        long min;
        boolean z5;
        B b6 = this.f4034d;
        synchronized (b6) {
            b6.f3900k.h();
            while (b6.f3893d >= b6.f3894e && !this.f4031a && !this.f4033c && b6.f() == null) {
                try {
                    b6.j();
                } finally {
                    b6.f3900k.l();
                }
            }
            b6.f3900k.l();
            b6.b();
            min = Math.min(b6.f3894e - b6.f3893d, this.f4032b.f10495b);
            b6.f3893d += min;
            z5 = z && min == this.f4032b.f10495b;
        }
        this.f4034d.f3900k.h();
        try {
            B b7 = this.f4034d;
            b7.f3891b.p(b7.f3890a, z5, this.f4032b, min);
        } finally {
            b6 = this.f4034d;
        }
    }

    @Override // j5.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        B b6 = this.f4034d;
        TimeZone timeZone = U4.e.f3179a;
        synchronized (b6) {
            if (this.f4033c) {
                return;
            }
            boolean z = b6.f() == null;
            B b7 = this.f4034d;
            if (!b7.f3898i.f4031a) {
                if (this.f4032b.f10495b > 0) {
                    while (this.f4032b.f10495b > 0) {
                        a(true);
                    }
                } else if (z) {
                    b7.f3891b.p(b7.f3890a, true, null, 0L);
                }
            }
            B b8 = this.f4034d;
            synchronized (b8) {
                this.f4033c = true;
                b8.notifyAll();
            }
            this.f4034d.f3891b.flush();
            this.f4034d.a();
        }
    }

    @Override // j5.u
    public final j5.y d() {
        return this.f4034d.f3900k;
    }

    @Override // j5.u, java.io.Flushable
    public final void flush() {
        B b6 = this.f4034d;
        TimeZone timeZone = U4.e.f3179a;
        synchronized (b6) {
            b6.b();
        }
        while (this.f4032b.f10495b > 0) {
            a(false);
            this.f4034d.f3891b.flush();
        }
    }
}
