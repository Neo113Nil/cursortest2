package com.google.android.gms.internal.ads;

import B.C0072a;
import a3.AbstractC0467k;
import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.ze, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1879ze extends AbstractC1744we implements RB {

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicInteger f16619y = new AtomicInteger(0);

    /* renamed from: n, reason: collision with root package name */
    public String f16620n;

    /* renamed from: o, reason: collision with root package name */
    public final C0804be f16621o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16622p;

    /* renamed from: q, reason: collision with root package name */
    public final E4.a f16623q;

    /* renamed from: r, reason: collision with root package name */
    public final C0072a f16624r;

    /* renamed from: s, reason: collision with root package name */
    public ByteBuffer f16625s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f16626t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f16627u;

    /* renamed from: v, reason: collision with root package name */
    public final String f16628v;

    /* renamed from: w, reason: collision with root package name */
    public final int f16629w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f16630x;

    public C1879ze(InterfaceC0677Re interfaceC0677Re, C0804be c0804be) {
        super(interfaceC0677Re);
        this.f16621o = c0804be;
        this.f16623q = new E4.a(5);
        this.f16624r = new C0072a();
        this.f16627u = new Object();
        String t5 = interfaceC0677Re.t();
        this.f16628v = (String) (t5 == null ? C1176ju.f14188k : new C1535ru(t5)).b();
        this.f16629w = interfaceC0677Re.c();
        f16619y.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.RB
    public final void f(Lt lt, Ww ww, boolean z3) {
        if (lt instanceof Dy) {
            ((ArrayList) this.f16623q.f1486l).add((Dy) lt);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1744we
    public final void i() {
        f16619y.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1744we
    public final void k() {
        this.f16622p = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v48, types: [com.google.android.gms.internal.ads.je] */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.google.android.gms.internal.ads.RB, com.google.android.gms.internal.ads.we, com.google.android.gms.internal.ads.ze] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC1744we
    public final boolean q(String str) {
        String str2;
        String str3;
        ?? r6;
        ?? r22;
        Dy dy;
        long currentTimeMillis;
        long longValue;
        long longValue2;
        int i;
        byte[] bArr;
        long j5;
        long j6;
        String str4 = str;
        this.f16620n = str4;
        String str5 = "error";
        String concat = "cache:".concat(String.valueOf(U2.e.n(str4, "MD5")));
        try {
            Er er = new Er(4);
            String str6 = this.f16124l;
            C0804be c0804be = this.f16621o;
            dy = new Dy(str6, c0804be.f12839d, c0804be.f12840e, true, er);
            dy.d(this);
            if (this.f16621o.i) {
                dy = new C1160je(this.f16123k, dy, this.f16628v, this.f16629w);
            }
            dy.a(new Ww(Uri.parse(str4), 0L, -1L));
            InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f16125m.get();
            if (interfaceC0677Re != null) {
                interfaceC0677Re.u0(concat, this);
            }
            P2.o.f4767B.f4776j.getClass();
            currentTimeMillis = System.currentTimeMillis();
            A7 a7 = F7.f8665C;
            Q2.r rVar = Q2.r.f5053d;
            longValue = ((Long) rVar.f5056c.a(a7)).longValue();
            longValue2 = ((Long) rVar.f5056c.a(F7.f8660B)).longValue();
            this.f16625s = ByteBuffer.allocate(this.f16621o.f12838c);
            i = 8192;
            bArr = new byte[8192];
            j5 = currentTimeMillis;
            str4 = str4;
        } catch (Exception e3) {
            e = e3;
            str2 = str4;
        }
        while (true) {
            try {
                int e5 = dy.e(bArr, 0, Math.min(this.f16625s.remaining(), i));
                r22 = -1;
                str3 = str5;
                if (e5 == -1) {
                    try {
                        this.f16630x = true;
                        U2.e.f5861b.post(new RunnableC1654ue((AbstractC1744we) this, str, concat, (int) this.f16624r.b(this.f16625s)));
                        return true;
                    } catch (Exception e6) {
                        e = e6;
                        r22 = str;
                    }
                } else {
                    try {
                        r22 = str;
                        r6 = this.f16627u;
                        synchronized (r6) {
                            try {
                                if (this.f16622p) {
                                    j6 = currentTimeMillis;
                                } else {
                                    j6 = currentTimeMillis;
                                    this.f16625s.put(bArr, 0, e5);
                                }
                            } finally {
                            }
                        }
                        if (this.f16625s.remaining() <= 0) {
                            u();
                            return true;
                        }
                        try {
                            if (this.f16622p) {
                                throw new IOException("Precache abort at " + this.f16625s.limit() + " bytes");
                            }
                            long currentTimeMillis2 = System.currentTimeMillis();
                            if (currentTimeMillis2 - j5 >= longValue) {
                                u();
                                j5 = currentTimeMillis2;
                            }
                            if (currentTimeMillis2 - j6 > 1000 * longValue2) {
                                throw new IOException("Timeout exceeded. Limit: " + longValue2 + " sec");
                            }
                            str5 = str3;
                            currentTimeMillis = j6;
                            i = 8192;
                            str4 = r22;
                        } catch (Exception e7) {
                            e = e7;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        r22 = r22;
                    }
                }
            } catch (Exception e9) {
                e = e9;
                str2 = str;
                str3 = str5;
                r22 = str2;
                r6 = str3;
                String v4 = AbstractC0467k.v(e.getClass().getCanonicalName(), ":", e.getMessage());
                U2.j.i("Failed to preload url " + r22 + " Exception: " + v4);
                l(r22, concat, r6, v4);
                return false;
            }
            r6 = str3;
            String v42 = AbstractC0467k.v(e.getClass().getCanonicalName(), ":", e.getMessage());
            U2.j.i("Failed to preload url " + r22 + " Exception: " + v42);
            l(r22, concat, r6, v42);
            return false;
        }
    }

    public final ByteBuffer t() {
        synchronized (this.f16627u) {
            try {
                ByteBuffer byteBuffer = this.f16625s;
                if (byteBuffer != null && !this.f16626t) {
                    byteBuffer.flip();
                    this.f16626t = true;
                }
                this.f16622p = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f16625s;
    }

    public final void u() {
        E4.a aVar = this.f16623q;
        Iterator it = ((ArrayList) aVar.f1486l).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((Dy) it.next()).b().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        aVar.f1485k = Math.max(aVar.f1485k, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        int i = (int) aVar.f1485k;
        int b3 = (int) this.f16624r.b(this.f16625s);
        int position = this.f16625s.position();
        int round = Math.round((position / i) * b3);
        int i5 = C0614Ie.f9545E.get();
        int i6 = C0614Ie.f9546F.get();
        String str = this.f16620n;
        U2.e.f5861b.post(new RunnableC1564se(this, str, "cache:".concat(String.valueOf(U2.e.n(str, "MD5"))), position, i, round, b3, round > 0, i5, i6));
    }

    @Override // com.google.android.gms.internal.ads.RB
    public final void c(Ww ww, boolean z3) {
    }

    @Override // com.google.android.gms.internal.ads.RB
    public final void g(Ww ww, boolean z3, int i) {
    }
}
