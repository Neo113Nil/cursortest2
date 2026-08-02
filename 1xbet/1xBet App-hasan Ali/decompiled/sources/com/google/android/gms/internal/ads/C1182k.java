package com.google.android.gms.internal.ads;

import I.C0160m;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1182k {

    /* renamed from: a, reason: collision with root package name */
    public final C1004g f14198a;

    /* renamed from: b, reason: collision with root package name */
    public final M4.d f14199b = new M4.d();

    /* renamed from: c, reason: collision with root package name */
    public final M0.e f14200c = new M0.e(4, (byte) 0);

    /* renamed from: d, reason: collision with root package name */
    public final M0.e f14201d = new M0.e(4, (byte) 0);

    /* renamed from: e, reason: collision with root package name */
    public final C0160m f14202e;
    public C1519re f;

    /* renamed from: g, reason: collision with root package name */
    public C1519re f14203g;

    /* renamed from: h, reason: collision with root package name */
    public long f14204h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public final Er f14205j;

    public C1182k(Er er, C1004g c1004g) {
        this.f14205j = er;
        this.f14198a = c1004g;
        C0160m c0160m = new C0160m(3);
        int i = 16;
        if (Integer.bitCount(16) != 1) {
            int highestOneBit = Integer.highestOneBit(15);
            i = highestOneBit + highestOneBit;
        }
        c0160m.f2498b = 0;
        c0160m.f2499c = 0;
        c0160m.f2501e = new long[i];
        c0160m.f2500d = i - 1;
        this.f14202e = c0160m;
        this.f14203g = C1519re.f15321d;
        this.i = -9223372036854775807L;
    }

    public final void a(long j5, long j6) {
        C0160m c0160m = this.f14202e;
        int i = c0160m.f2499c;
        if (i == 0) {
            return;
        }
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long j7 = ((long[]) c0160m.f2501e)[c0160m.f2498b];
        Long l5 = (Long) this.f14201d.p(j7);
        C1004g c1004g = this.f14198a;
        if (l5 != null && l5.longValue() != this.f14204h) {
            this.f14204h = l5.longValue();
            c1004g.f(2);
        }
        int a5 = this.f14198a.a(j7, j5, j6, this.f14204h, false, this.f14199b);
        Er er = this.f14205j;
        C0959f c0959f = (C0959f) er.f8618m;
        if (a5 != 0 && a5 != 1) {
            if (a5 == 2 || a5 == 3 || a5 == 4) {
                this.i = j7;
                c0160m.y();
                Iterator it = c0959f.f13399h.iterator();
                while (it.hasNext()) {
                    C0825c c0825c = (C0825c) it.next();
                    c0825c.f12940l.execute(new RunnableC0781b(c0825c, c0825c.f12939k, 0));
                }
                AbstractC1668us.F(null);
                throw null;
            }
            return;
        }
        this.i = j7;
        C1519re c1519re = (C1519re) this.f14200c.p(c0160m.y());
        if (c1519re != null && !c1519re.equals(C1519re.f15321d) && !c1519re.equals(this.f14203g)) {
            this.f14203g = c1519re;
            C1649uH c1649uH = new C1649uH();
            c1649uH.f15855s = c1519re.f15322a;
            c1649uH.f15856t = c1519re.f15323b;
            c1649uH.c("video/raw");
            er.f8617l = new C1407p(c1649uH);
            Iterator it2 = c0959f.f13399h.iterator();
            while (it2.hasNext()) {
                C0825c c0825c2 = (C0825c) it2.next();
                c0825c2.f12940l.execute(new RunnableC0781b(c0825c2, c0825c2.f12939k, c1519re));
            }
        }
        int i5 = c1004g.f13539d;
        c1004g.f13539d = 3;
        c1004g.f13544k.getClass();
        c1004g.f = AbstractC1260lo.s(SystemClock.elapsedRealtime());
        if ((i5 != 3) && c0959f.f13401k != null) {
            Iterator it3 = c0959f.f13399h.iterator();
            while (it3.hasNext()) {
                C0825c c0825c3 = (C0825c) it3.next();
                c0825c3.f12940l.execute(new RunnableC0781b(c0825c3, c0825c3.f12939k, 2));
            }
        }
        if (c0959f.i != null) {
            if (((C1407p) er.f8617l) == null) {
                new C1407p(new C1649uH());
            }
            C1019gE c1019gE = c0959f.i;
            c0959f.f13398g.getClass();
            System.nanoTime();
            c1019gE.getClass();
        }
        AbstractC1668us.F(null);
        throw null;
    }
}
