package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.op, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1396op implements Mp {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f14856a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f14857b = new AtomicReference(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    public final C2308a f14858c;

    /* renamed from: d, reason: collision with root package name */
    public final Qw f14859d;

    /* renamed from: e, reason: collision with root package name */
    public final Mp f14860e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final C1482ql f14861g;

    public C1396op(Mp mp, long j5, C2308a c2308a, Qw qw, C1482ql c1482ql) {
        this.f14858c = c2308a;
        this.f14860e = mp;
        this.f = j5;
        this.f14859d = qw;
        this.f14861g = c1482ql;
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final int a() {
        return this.f14860e.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (r0.f14712b < android.os.SystemClock.elapsedRealtime()) goto L8;
     */
    @Override // com.google.android.gms.internal.ads.Mp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final E3.a d() {
        C1351np c1351np;
        A7 a7 = F7.qb;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            if (((Boolean) rVar.f5056c.a(F7.pb)).booleanValue() && !((Boolean) this.f14857b.getAndSet(Boolean.TRUE)).booleanValue()) {
                C0592Fd c0592Fd = AbstractC0613Id.f9542d;
                RunnableC1306mp runnableC1306mp = new RunnableC1306mp(this, 0);
                long j5 = this.f;
                c0592Fd.scheduleWithFixedDelay(runnableC1306mp, j5, j5, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    c1351np = (C1351np) this.f14856a.get();
                    if (c1351np == null) {
                        E3.a d5 = this.f14860e.d();
                        this.f14856a.set(new C1351np(d5, this.f, this.f14858c));
                        return d5;
                    }
                    if (!((Boolean) this.f14857b.get()).booleanValue()) {
                        c1351np.f14713c.getClass();
                        if (c1351np.f14712b < SystemClock.elapsedRealtime()) {
                            E3.a aVar = c1351np.f14711a;
                            Mp mp = this.f14860e;
                            C1351np c1351np2 = new C1351np(mp.d(), this.f, this.f14858c);
                            this.f14856a.set(c1351np2);
                            if (((Boolean) rVar.f5056c.a(F7.rb)).booleanValue()) {
                                if (((Boolean) rVar.f5056c.a(F7.sb)).booleanValue()) {
                                    C1390oj a5 = this.f14861g.a();
                                    a5.k("action", "scs");
                                    a5.k("sid", String.valueOf(this.f14860e.a()));
                                    a5.q();
                                }
                                return aVar;
                            }
                            c1351np = c1351np2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            c1351np = (C1351np) this.f14856a.get();
            if (c1351np != null) {
                c1351np.f14713c.getClass();
            }
            Mp mp2 = this.f14860e;
            C1351np c1351np3 = new C1351np(mp2.d(), this.f, this.f14858c);
            this.f14856a.set(c1351np3);
            c1351np = c1351np3;
        }
        return c1351np.f14711a;
    }
}
