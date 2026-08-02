package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.pG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1424pG extends AbstractC0976fG {

    /* renamed from: k, reason: collision with root package name */
    public final ZF f14979k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f14980l;

    /* renamed from: m, reason: collision with root package name */
    public final C0603Ha f14981m;

    /* renamed from: n, reason: collision with root package name */
    public final C1785xa f14982n;

    /* renamed from: o, reason: collision with root package name */
    public C1289mG f14983o;

    /* renamed from: p, reason: collision with root package name */
    public C1244lG f14984p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14985q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f14986r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f14987s;

    public C1424pG(ZF zf, boolean z3) {
        boolean z5;
        this.f14979k = zf;
        if (z3) {
            zf.q();
            z5 = true;
        } else {
            z5 = false;
        }
        this.f14980l = z5;
        this.f14981m = new C0603Ha();
        this.f14982n = new C1785xa();
        zf.d();
        this.f14983o = new C1289mG(new C1379oG(zf.c()), C0603Ha.f9395m, C1289mG.f14491e);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void a(InterfaceC1558sG interfaceC1558sG) {
        C1244lG c1244lG = (C1244lG) interfaceC1558sG;
        InterfaceC1558sG interfaceC1558sG2 = c1244lG.f14372n;
        if (interfaceC1558sG2 != null) {
            ZF zf = c1244lG.f14371m;
            zf.getClass();
            zf.a(interfaceC1558sG2);
        }
        if (interfaceC1558sG == this.f14984p) {
            this.f14984p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final Q3 c() {
        return this.f14979k.c();
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void d() {
        this.f14979k.d();
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void j(C1514rH c1514rH) {
        this.f13467j = c1514rH;
        int i = AbstractC1260lo.f14419a;
        Looper myLooper = Looper.myLooper();
        AbstractC1668us.F(myLooper);
        this.i = new Handler(myLooper, null);
        if (this.f14980l) {
            return;
        }
        this.f14985q = true;
        t(null, this.f14979k);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0976fG, com.google.android.gms.internal.ads.ZF
    public final void m() {
        this.f14986r = false;
        this.f14985q = false;
        super.m();
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void p(Q3 q32) {
        if (this.f14987s) {
            C1289mG c1289mG = this.f14983o;
            this.f14983o = new C1289mG(new IE(this.f14983o.f13928b, q32), c1289mG.f14492c, c1289mG.f14493d);
        } else {
            this.f14983o = new C1289mG(new C1379oG(q32), C0603Ha.f9395m, C1289mG.f14491e);
        }
        this.f14979k.p(q32);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void q() {
        this.f14979k.q();
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void r() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    @Override // com.google.android.gms.internal.ads.AbstractC0976fG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(Integer num, ZF zf, AbstractC0715Xa abstractC0715Xa) {
        long j5;
        C1289mG c1289mG;
        C1244lG c1244lG;
        Object obj;
        Object obj2;
        C1289mG c1289mG2;
        C1603tG c1603tG = null;
        if (this.f14986r) {
            C1289mG c1289mG3 = this.f14983o;
            this.f14983o = new C1289mG(abstractC0715Xa, c1289mG3.f14492c, c1289mG3.f14493d);
            C1244lG c1244lG2 = this.f14984p;
            if (c1244lG2 != null) {
                y(c1244lG2.f14374p);
            }
        } else if (abstractC0715Xa.o()) {
            if (this.f14987s) {
                C1289mG c1289mG4 = this.f14983o;
                c1289mG2 = new C1289mG(abstractC0715Xa, c1289mG4.f14492c, c1289mG4.f14493d);
            } else {
                c1289mG2 = new C1289mG(abstractC0715Xa, C0603Ha.f9395m, C1289mG.f14491e);
            }
            this.f14983o = c1289mG2;
        } else {
            C0603Ha c0603Ha = this.f14981m;
            abstractC0715Xa.e(0, c0603Ha, 0L);
            Object obj3 = c0603Ha.f9397a;
            C1244lG c1244lG3 = this.f14984p;
            if (c1244lG3 != null) {
                this.f14983o.n(c1244lG3.f14369k.f15679a, this.f14982n);
                this.f14983o.e(0, c0603Ha, 0L);
                long j6 = c1244lG3.f14370l;
                if (j6 != 0) {
                    j5 = j6;
                    Pair l5 = abstractC0715Xa.l(this.f14981m, this.f14982n, 0, j5);
                    Object obj4 = l5.first;
                    long longValue = ((Long) l5.second).longValue();
                    if (this.f14987s) {
                        c1289mG = new C1289mG(abstractC0715Xa, obj3, obj4);
                    } else {
                        C1289mG c1289mG5 = this.f14983o;
                        c1289mG = new C1289mG(abstractC0715Xa, c1289mG5.f14492c, c1289mG5.f14493d);
                    }
                    this.f14983o = c1289mG;
                    c1244lG = this.f14984p;
                    if (c1244lG != null && y(longValue)) {
                        C1603tG c1603tG2 = c1244lG.f14369k;
                        obj = this.f14983o.f14493d;
                        obj2 = c1603tG2.f15679a;
                        if (obj != null && obj2.equals(C1289mG.f14491e)) {
                            obj2 = this.f14983o.f14493d;
                        }
                        c1603tG = c1603tG2.a(obj2);
                    }
                }
            }
            j5 = 0;
            Pair l52 = abstractC0715Xa.l(this.f14981m, this.f14982n, 0, j5);
            Object obj42 = l52.first;
            long longValue2 = ((Long) l52.second).longValue();
            if (this.f14987s) {
            }
            this.f14983o = c1289mG;
            c1244lG = this.f14984p;
            if (c1244lG != null) {
                C1603tG c1603tG22 = c1244lG.f14369k;
                obj = this.f14983o.f14493d;
                obj2 = c1603tG22.f15679a;
                if (obj != null) {
                    obj2 = this.f14983o.f14493d;
                }
                c1603tG = c1603tG22.a(obj2);
            }
        }
        this.f14987s = true;
        this.f14986r = true;
        k(this.f14983o);
        if (c1603tG != null) {
            C1244lG c1244lG4 = this.f14984p;
            c1244lG4.getClass();
            long j7 = c1244lG4.f14374p;
            if (j7 == -9223372036854775807L) {
                j7 = c1244lG4.f14370l;
            }
            ZF zf2 = c1244lG4.f14371m;
            zf2.getClass();
            InterfaceC1558sG b3 = zf2.b(c1603tG, c1244lG4.f14375q, j7);
            c1244lG4.f14372n = b3;
            if (c1244lG4.f14373o != null) {
                b3.f(c1244lG4, j7);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC0976fG
    public final /* bridge */ /* synthetic */ void u(Integer num) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC0976fG
    public final /* synthetic */ void v(Integer num, long j5) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractC0976fG
    public final C1603tG w(Integer num, C1603tG c1603tG) {
        Object obj = this.f14983o.f14493d;
        Object obj2 = c1603tG.f15679a;
        if (obj != null && obj.equals(obj2)) {
            obj2 = C1289mG.f14491e;
        }
        return c1603tG.a(obj2);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final C1244lG b(C1603tG c1603tG, C1425pH c1425pH, long j5) {
        C1244lG c1244lG = new C1244lG(c1603tG, c1425pH, j5);
        AbstractC1668us.a0(c1244lG.f14371m == null);
        ZF zf = this.f14979k;
        c1244lG.f14371m = zf;
        if (this.f14986r) {
            Object obj = this.f14983o.f14493d;
            Object obj2 = c1603tG.f15679a;
            if (obj != null && obj2.equals(C1289mG.f14491e)) {
                obj2 = this.f14983o.f14493d;
            }
            C1603tG a5 = c1603tG.a(obj2);
            long j6 = c1244lG.f14374p;
            if (j6 != -9223372036854775807L) {
                j5 = j6;
            }
            ZF zf2 = c1244lG.f14371m;
            zf2.getClass();
            InterfaceC1558sG b3 = zf2.b(a5, c1425pH, j5);
            c1244lG.f14372n = b3;
            if (c1244lG.f14373o != null) {
                b3.f(c1244lG, j5);
                return c1244lG;
            }
        } else {
            this.f14984p = c1244lG;
            if (!this.f14985q) {
                this.f14985q = true;
                t(null, zf);
            }
        }
        return c1244lG;
    }

    public final boolean y(long j5) {
        C1244lG c1244lG = this.f14984p;
        int a5 = this.f14983o.a(c1244lG.f14369k.f15679a);
        if (a5 == -1) {
            return false;
        }
        C1289mG c1289mG = this.f14983o;
        C1785xa c1785xa = this.f14982n;
        c1289mG.d(a5, c1785xa, false);
        long j6 = c1785xa.f16291d;
        if (j6 != -9223372036854775807L && j5 >= j6) {
            j5 = Math.max(0L, j6 - 1);
        }
        c1244lG.f14374p = j5;
        return true;
    }
}
