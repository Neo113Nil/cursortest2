package F4;

import L4.C0226i;
import L4.I;
import L4.K;
import a3.AbstractC0467k;
import java.io.IOException;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class u implements I, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final long f1656k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1657l;

    /* renamed from: m, reason: collision with root package name */
    public final C0226i f1658m = new C0226i();

    /* renamed from: n, reason: collision with root package name */
    public final C0226i f1659n = new C0226i();

    /* renamed from: o, reason: collision with root package name */
    public boolean f1660o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ w f1661p;

    public u(w wVar, long j5, boolean z3) {
        this.f1661p = wVar;
        this.f1656k = j5;
        this.f1657l = z3;
    }

    @Override // L4.I
    public final K c() {
        return this.f1661p.f1671k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j5;
        w wVar = this.f1661p;
        synchronized (wVar) {
            this.f1660o = true;
            C0226i c0226i = this.f1659n;
            j5 = c0226i.f3091l;
            c0226i.b();
            wVar.notifyAll();
        }
        if (j5 > 0) {
            byte[] bArr = z4.b.f21979a;
            this.f1661p.f1664b.k(j5);
        }
        this.f1661p.a();
    }

    @Override // L4.I
    public final long e(C0226i c0226i, long j5) {
        Throwable th;
        boolean z3;
        long j6;
        kotlin.jvm.internal.l.f("sink", c0226i);
        long j7 = 0;
        if (j5 < 0) {
            throw new IllegalArgumentException(AbstractC2107A.r("byteCount < 0: ", j5).toString());
        }
        while (true) {
            w wVar = this.f1661p;
            synchronized (wVar) {
                wVar.f1671k.h();
                try {
                    if (wVar.f() == 0 || this.f1657l) {
                        th = null;
                    } else {
                        th = wVar.f1674n;
                        if (th == null) {
                            int f = wVar.f();
                            AbstractC0467k.x(f);
                            th = new C(f);
                        }
                    }
                    if (this.f1660o) {
                        throw new IOException("stream closed");
                    }
                    C0226i c0226i2 = this.f1659n;
                    long j8 = c0226i2.f3091l;
                    z3 = false;
                    if (j8 > j7) {
                        j6 = c0226i2.e(c0226i, Math.min(j5, j8));
                        long j9 = wVar.f1665c + j6;
                        wVar.f1665c = j9;
                        long j10 = j9 - wVar.f1666d;
                        if (th == null && j10 >= wVar.f1664b.f1634z.a() / 2) {
                            wVar.f1664b.n(wVar.f1663a, j10);
                            wVar.f1666d = wVar.f1665c;
                        }
                    } else {
                        if (!this.f1657l && th == null) {
                            wVar.l();
                            z3 = true;
                        }
                        j6 = -1;
                    }
                    wVar.f1671k.k();
                } finally {
                }
            }
            if (!z3) {
                if (j6 != -1) {
                    return j6;
                }
                if (th == null) {
                    return -1L;
                }
                throw th;
            }
            j7 = 0;
        }
    }
}
