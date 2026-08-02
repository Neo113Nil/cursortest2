package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import q3.AbstractC2309b;

/* renamed from: com.google.android.gms.internal.ads.Ee, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0585Ee extends Lt {

    /* renamed from: A, reason: collision with root package name */
    public boolean f8519A;

    /* renamed from: B, reason: collision with root package name */
    public long f8520B;

    /* renamed from: C, reason: collision with root package name */
    public E3.a f8521C;

    /* renamed from: D, reason: collision with root package name */
    public final AtomicLong f8522D;

    /* renamed from: E, reason: collision with root package name */
    public final Mt f8523E;

    /* renamed from: o, reason: collision with root package name */
    public final Context f8524o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC1402ov f8525p;

    /* renamed from: q, reason: collision with root package name */
    public final String f8526q;

    /* renamed from: r, reason: collision with root package name */
    public final int f8527r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f8528s;

    /* renamed from: t, reason: collision with root package name */
    public InputStream f8529t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8530u;

    /* renamed from: v, reason: collision with root package name */
    public Uri f8531v;

    /* renamed from: w, reason: collision with root package name */
    public volatile C1459q6 f8532w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8533x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8534y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8535z;

    public C0585Ee(Context context, InterfaceC1402ov interfaceC1402ov, String str, int i, RB rb, Mt mt) {
        super(false);
        this.f8524o = context;
        this.f8525p = interfaceC1402ov;
        this.f8523E = mt;
        this.f8526q = str;
        this.f8527r = i;
        this.f8533x = false;
        this.f8534y = false;
        this.f8535z = false;
        this.f8519A = false;
        this.f8520B = 0L;
        this.f8522D = new AtomicLong(-1L);
        this.f8521C = null;
        this.f8528s = ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8741P1)).booleanValue();
        d(rb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f9  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(Ww ww) {
        C1369o6 c1369o6;
        Throwable th;
        boolean z3;
        boolean z5;
        long elapsedRealtime;
        StringBuilder sb;
        C1683v6 c1683v6;
        if (this.f8530u) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        boolean z6 = true;
        this.f8530u = true;
        this.f8531v = ww.f12125a;
        if (!this.f8528s) {
            k(ww);
        }
        this.f8532w = C1459q6.a(ww.f12125a);
        A7 a7 = F7.h4;
        Q2.r rVar = Q2.r.f5053d;
        ?? r5 = -1;
        if (!((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            if (this.f8532w != null) {
                this.f8532w.f15102r = ww.f12127c;
                C1459q6 c1459q6 = this.f8532w;
                String str = this.f8526q;
                c1459q6.f15103s = str != null ? str : "";
                this.f8532w.f15104t = this.f8527r;
                c1369o6 = P2.o.f4767B.i.f(this.f8532w);
            } else {
                c1369o6 = null;
            }
            if (c1369o6 != null && c1369o6.e()) {
                this.f8533x = c1369o6.c();
                this.f8535z = c1369o6.g();
                this.f8519A = c1369o6.f();
                this.f8520B = c1369o6.a();
                this.f8534y = true;
                if (!m()) {
                    this.f8529t = c1369o6.b();
                    if (this.f8528s) {
                        k(ww);
                    }
                    return -1L;
                }
            }
        } else if (this.f8532w != null) {
            this.f8532w.f15102r = ww.f12127c;
            C1459q6 c1459q62 = this.f8532w;
            String str2 = this.f8526q;
            c1459q62.f15103s = str2 != null ? str2 : "";
            this.f8532w.f15104t = this.f8527r;
            long longValue = (this.f8532w.f15101q ? (Long) rVar.f5056c.a(F7.f8846j4) : (Long) rVar.f5056c.a(F7.f8840i4)).longValue();
            P2.o oVar = P2.o.f4767B;
            oVar.f4776j.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            C1548s6 p5 = C1543s1.p(this.f8524o, this.f8532w);
            try {
                try {
                    c1683v6 = (C1683v6) p5.f10334k.get(longValue, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    th = th2;
                    z6 = r5;
                }
                try {
                    this.f8533x = c1683v6.f15961b;
                    this.f8535z = c1683v6.f15962c;
                    this.f8519A = c1683v6.f15964e;
                    this.f8520B = c1683v6.f15963d;
                } catch (InterruptedException unused) {
                    z5 = true;
                    p5.cancel(true);
                    Thread.currentThread().interrupt();
                    P2.o.f4767B.f4776j.getClass();
                    elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
                    InterfaceC0718Xd interfaceC0718Xd = ((C0614Ie) this.f8523E.f10741l).f9560t;
                    if (interfaceC0718Xd != null) {
                        interfaceC0718Xd.d(elapsedRealtime, z5);
                    }
                    this.f8534y = z5;
                    sb = new StringBuilder("Cache connection took ");
                    r5 = z5;
                    sb.append(elapsedRealtime);
                    sb.append("ms");
                    T2.G.m(sb.toString());
                    this.f8534y = false;
                    if (this.f8532w != null) {
                    }
                    return this.f8525p.a(ww);
                } catch (ExecutionException | TimeoutException unused2) {
                    z3 = true;
                    p5.cancel(true);
                    P2.o.f4767B.f4776j.getClass();
                    elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
                    InterfaceC0718Xd interfaceC0718Xd2 = ((C0614Ie) this.f8523E.f10741l).f9560t;
                    if (interfaceC0718Xd2 != null) {
                        interfaceC0718Xd2.d(elapsedRealtime, z3);
                    }
                    this.f8534y = z3;
                    sb = new StringBuilder("Cache connection took ");
                    r5 = z3;
                    sb.append(elapsedRealtime);
                    sb.append("ms");
                    T2.G.m(sb.toString());
                    this.f8534y = false;
                    if (this.f8532w != null) {
                    }
                    return this.f8525p.a(ww);
                } catch (Throwable th3) {
                    th = th3;
                    P2.o.f4767B.f4776j.getClass();
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                    InterfaceC0718Xd interfaceC0718Xd3 = ((C0614Ie) this.f8523E.f10741l).f9560t;
                    if (interfaceC0718Xd3 != null) {
                        interfaceC0718Xd3.d(elapsedRealtime3, z6);
                    }
                    this.f8534y = z6;
                    T2.G.m("Cache connection took " + elapsedRealtime3 + "ms");
                    throw th;
                }
            } catch (InterruptedException unused3) {
                z5 = false;
            } catch (ExecutionException | TimeoutException unused4) {
                z3 = false;
            } catch (Throwable th4) {
                th = th4;
                z6 = false;
            }
            if (!m()) {
                this.f8529t = c1683v6.f15960a;
                if (this.f8528s) {
                    k(ww);
                }
                oVar.f4776j.getClass();
                long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                InterfaceC0718Xd interfaceC0718Xd4 = ((C0614Ie) this.f8523E.f10741l).f9560t;
                if (interfaceC0718Xd4 != null) {
                    interfaceC0718Xd4.d(elapsedRealtime4, true);
                }
                this.f8534y = true;
                T2.G.m("Cache connection took " + elapsedRealtime4 + "ms");
                return -1L;
            }
            oVar.f4776j.getClass();
            long elapsedRealtime5 = SystemClock.elapsedRealtime() - elapsedRealtime2;
            InterfaceC0718Xd interfaceC0718Xd5 = ((C0614Ie) this.f8523E.f10741l).f9560t;
            if (interfaceC0718Xd5 != null) {
                interfaceC0718Xd5.d(elapsedRealtime5, true);
            }
            this.f8534y = true;
            sb = new StringBuilder("Cache connection took ");
            sb.append(elapsedRealtime5);
            sb.append("ms");
            T2.G.m(sb.toString());
        }
        this.f8534y = false;
        if (this.f8532w != null) {
            Map map = ww.f12126b;
            long j5 = ww.f12127c;
            long j6 = ww.f12128d;
            int i = ww.f12129e;
            Uri parse = Uri.parse(this.f8532w.f15095k);
            if (parse == null) {
                throw new IllegalStateException("The uri must be set.");
            }
            ww = new Ww(parse, map, j5, j6, i);
        }
        return this.f8525p.a(ww);
    }

    @Override // com.google.android.gms.internal.ads.DE
    public final int e(byte[] bArr, int i, int i5) {
        if (!this.f8530u) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.f8529t;
        int read = inputStream != null ? inputStream.read(bArr, i, i5) : this.f8525p.e(bArr, i, i5);
        if (this.f8528s && this.f8529t == null) {
            return read;
        }
        B(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final Uri i() {
        return this.f8531v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1402ov
    public final void j() {
        if (!this.f8530u) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.f8530u = false;
        this.f8531v = null;
        boolean z3 = (this.f8528s && this.f8529t == null) ? false : true;
        InputStream inputStream = this.f8529t;
        if (inputStream != null) {
            AbstractC2309b.c(inputStream);
            this.f8529t = null;
        } else {
            this.f8525p.j();
        }
        if (z3) {
            f();
        }
    }

    public final long l() {
        if (this.f8532w != null) {
            if (this.f8522D.get() != -1) {
                return this.f8522D.get();
            }
            synchronized (this) {
                try {
                    if (this.f8521C == null) {
                        this.f8521C = AbstractC0613Id.f9539a.d(new S4(3, this));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f8521C.isDone()) {
                try {
                    this.f8522D.compareAndSet(-1L, ((Long) this.f8521C.get()).longValue());
                    return this.f8522D.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    public final boolean m() {
        if (!this.f8528s) {
            return false;
        }
        A7 a7 = F7.f8852k4;
        Q2.r rVar = Q2.r.f5053d;
        if (!((Boolean) rVar.f5056c.a(a7)).booleanValue() || this.f8535z) {
            return ((Boolean) rVar.f5056c.a(F7.f8858l4)).booleanValue() && !this.f8519A;
        }
        return true;
    }
}
