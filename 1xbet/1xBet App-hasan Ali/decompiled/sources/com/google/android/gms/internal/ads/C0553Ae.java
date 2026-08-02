package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.Ae, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0553Ae extends AbstractC1744we implements InterfaceC0718Xd {

    /* renamed from: n, reason: collision with root package name */
    public C0614Ie f7602n;

    /* renamed from: o, reason: collision with root package name */
    public String f7603o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7604p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7605q;

    /* renamed from: r, reason: collision with root package name */
    public C1340ne f7606r;

    /* renamed from: s, reason: collision with root package name */
    public long f7607s;

    /* renamed from: t, reason: collision with root package name */
    public long f7608t;

    public static final String t(String str) {
        return "cache:".concat(String.valueOf(U2.e.n(str, "MD5")));
    }

    public static String u(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0718Xd
    public final void a(int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0718Xd
    public final void b(int i, int i5) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0718Xd
    public final void d(long j5, boolean z3) {
        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f16125m.get();
        if (interfaceC0677Re != null) {
            AbstractC0613Id.f.execute(new RunnableC1027ge(interfaceC0677Re, z3, j5, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0718Xd
    public final void e(IOException iOException) {
        U2.j.j("Precache exception", iOException);
        P2.o.f4767B.f4774g.h("VideoStreamExoPlayerCache.onException", iOException);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0718Xd
    public final void h(String str, Exception exc) {
        U2.j.j("Precache error", exc);
        P2.o.f4767B.f4774g.h("VideoStreamExoPlayerCache.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1744we
    public final void i() {
        C0614Ie c0614Ie = this.f7602n;
        if (c0614Ie != null) {
            c0614Ie.f9560t = null;
            ME me = c0614Ie.f9557q;
            if (me != null) {
                me.f10609n.d();
                me.f10608m.p1(c0614Ie);
                ME me2 = c0614Ie.f9557q;
                me2.f10609n.d();
                me2.f10608m.J1();
                c0614Ie.f9557q = null;
                C0614Ie.f9546F.decrementAndGet();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1744we
    public final void k() {
        synchronized (this) {
            this.f7604p = true;
            notify();
            i();
        }
        String str = this.f7603o;
        if (str != null) {
            l(this.f7603o, t(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1744we
    public final void m(int i) {
        C0577De c0577De = this.f7602n.f9552l;
        synchronized (c0577De) {
            c0577De.f8211d = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1744we
    public final void n(int i) {
        C0577De c0577De = this.f7602n.f9552l;
        synchronized (c0577De) {
            c0577De.f8212e = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1744we
    public final void o(int i) {
        C0577De c0577De = this.f7602n.f9552l;
        synchronized (c0577De) {
            c0577De.f8210c = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1744we
    public final void p(int i) {
        C0577De c0577De = this.f7602n.f9552l;
        synchronized (c0577De) {
            c0577De.f8209b = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1744we
    public final boolean q(String str) {
        return r(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.os.Handler] */
    @Override // com.google.android.gms.internal.ads.AbstractC1744we
    public final boolean r(String str, String[] strArr) {
        boolean z3;
        long j5;
        long j6;
        long j7;
        C0553Ae c0553Ae;
        long j8;
        long j9;
        long j10;
        long j11;
        boolean z5;
        long j12;
        C0553Ae c0553Ae2 = this;
        String str2 = str;
        c0553Ae2.f7603o = str2;
        String t5 = t(str2);
        boolean z6 = false;
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            C0614Ie c0614Ie = c0553Ae2.f7602n;
            c0614Ie.getClass();
            c0614Ie.p(uriArr, ByteBuffer.allocate(0), false);
            InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) c0553Ae2.f16125m.get();
            if (interfaceC0677Re != null) {
                interfaceC0677Re.u0(t5, c0553Ae2);
            }
            P2.o.f4767B.f4776j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            A7 a7 = F7.f8665C;
            Q2.r rVar = Q2.r.f5053d;
            long longValue = ((Long) rVar.f5056c.a(a7)).longValue();
            long longValue2 = ((Long) rVar.f5056c.a(F7.f8660B)).longValue() * 1000;
            long intValue = ((Integer) rVar.f5056c.a(F7.f8894s)).intValue();
            boolean booleanValue = ((Boolean) rVar.f5056c.a(F7.f8741P1)).booleanValue();
            long j13 = -1;
            c0553Ae2 = c0553Ae2;
            while (true) {
                synchronized (this) {
                    try {
                        if (System.currentTimeMillis() - currentTimeMillis > longValue2) {
                            throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                        }
                        if (c0553Ae2.f7604p) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (c0553Ae2.f7605q) {
                            return true;
                        }
                        ME me = c0553Ae2.f7602n.f9557q;
                        if (!(me != null ? true : z6)) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long u12 = me.u1();
                        if (u12 > 0) {
                            long r1 = c0553Ae2.f7602n.f9557q.r1();
                            if (r1 != j13) {
                                if (r1 > 0) {
                                    j11 = longValue;
                                    j10 = u12;
                                    z5 = true;
                                } else {
                                    j11 = longValue;
                                    j10 = u12;
                                    z5 = z6;
                                }
                                if (booleanValue) {
                                    try {
                                        C0614Ie c0614Ie2 = c0553Ae2.f7602n;
                                        j12 = (c0614Ie2.f9549C == null || !c0614Ie2.f9549C.f8534y) ? c0614Ie2.f9561u : 0L;
                                    } catch (Throwable th) {
                                        th = th;
                                        z3 = false;
                                        c0553Ae2 = c0553Ae2;
                                    }
                                } else {
                                    j12 = -1;
                                }
                                long s2 = booleanValue ? c0553Ae2.f7602n.s() : -1L;
                                long o5 = booleanValue ? c0553Ae2.f7602n.o() : -1L;
                                try {
                                    int i5 = C0614Ie.f9545E.get();
                                    int i6 = C0614Ie.f9546F.get();
                                    Jt jt = U2.e.f5861b;
                                    j5 = longValue2;
                                    j9 = j11;
                                    long j14 = j12;
                                    j8 = r1;
                                    z3 = false;
                                    j6 = intValue;
                                    try {
                                        RunnableC1475qe runnableC1475qe = new RunnableC1475qe(c0553Ae2, str2, t5, j8, j10, j14, s2, o5, z5, i5, i6);
                                        ?? r12 = jt;
                                        r12.post(runnableC1475qe);
                                        j13 = j8;
                                        c0553Ae = r12;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        c0553Ae2 = this;
                                        str2 = str;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    z3 = false;
                                    c0553Ae2 = this;
                                    str2 = str;
                                    throw th;
                                }
                            } else {
                                z3 = z6;
                                j8 = r1;
                                j9 = longValue;
                                j5 = longValue2;
                                j6 = intValue;
                                j10 = u12;
                                c0553Ae = c0553Ae2;
                            }
                            if (j8 >= j10) {
                                U2.e.f5861b.post(new RunnableC1654ue(this, str, t5, j10));
                                return true;
                            }
                            try {
                                C0553Ae c0553Ae3 = this;
                                str2 = str;
                                if (c0553Ae3.f7602n.f9561u >= j6 && j8 > 0) {
                                    return true;
                                }
                                j7 = j9;
                                c0553Ae = c0553Ae3;
                            } catch (Throwable th4) {
                                th = th4;
                                c0553Ae2 = c0553Ae;
                            }
                        } else {
                            z3 = z6;
                            j5 = longValue2;
                            j6 = intValue;
                            j7 = longValue;
                            c0553Ae = c0553Ae2;
                        }
                        try {
                            c0553Ae.wait(j7);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z3 = z6;
                        c0553Ae2 = c0553Ae2;
                    }
                }
                try {
                    throw th;
                } catch (Exception e3) {
                    e = e3;
                    U2.j.i("Failed to preload url " + str2 + " Exception: " + e.getMessage());
                    P2.o.f4767B.f4774g.h("VideoStreamExoPlayerCache.preload", e);
                    c0553Ae2.i();
                    c0553Ae2.l(str2, t5, "error", u("error", e));
                    return z3;
                }
                longValue = j7;
                z6 = z3;
                intValue = j6;
                longValue2 = j5;
                c0553Ae2 = c0553Ae;
            }
        } catch (Exception e5) {
            e = e5;
            z3 = z6;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1744we
    public final boolean s(String str, String[] strArr, C1340ne c1340ne) {
        this.f7603o = str;
        this.f7606r = c1340ne;
        String t5 = t(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            C0614Ie c0614Ie = this.f7602n;
            c0614Ie.getClass();
            c0614Ie.p(uriArr, ByteBuffer.allocate(0), false);
            InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f16125m.get();
            if (interfaceC0677Re != null) {
                interfaceC0677Re.u0(t5, this);
            }
            P2.o.f4767B.f4776j.getClass();
            this.f7607s = System.currentTimeMillis();
            this.f7608t = -1L;
            T2.L.f5672l.postDelayed(new K4(14, this), 0L);
            return true;
        } catch (Exception e3) {
            U2.j.i("Failed to preload url " + str + " Exception: " + e3.getMessage());
            P2.o.f4767B.f4774g.h("VideoStreamExoPlayerCache.preload", e3);
            i();
            l(str, t5, "error", u("error", e3));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0718Xd
    public final void y() {
        U2.j.i("Precache onRenderedFirstFrame");
    }
}
