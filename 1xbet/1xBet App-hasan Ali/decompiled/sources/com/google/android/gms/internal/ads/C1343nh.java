package com.google.android.gms.internal.ads;

import Q2.InterfaceC0347a;
import android.os.SystemClock;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.nh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1343nh implements InterfaceC0808bi, InterfaceC0347a, InterfaceC1434pi, Vh, Mh, Bi {

    /* renamed from: k, reason: collision with root package name */
    public final C2308a f14680k;

    /* renamed from: l, reason: collision with root package name */
    public final C1878zd f14681l;

    public C1343nh(C2308a c2308a, C1878zd c1878zd) {
        this.f14680k = c2308a;
        this.f14681l = c1878zd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final void B0(Sq sq) {
        C2308a c2308a = this.f14680k;
        C1878zd c1878zd = this.f14681l;
        c2308a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (c1878zd.f16613d) {
            try {
                c1878zd.f16618k = elapsedRealtime;
                if (elapsedRealtime != -1) {
                    c1878zd.f16611b.a(c1878zd);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1434pi
    public final void D(C1428pc c1428pc) {
    }

    @Override // com.google.android.gms.internal.ads.Bi
    public final void L0(C0789b7 c0789b7) {
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.Bi
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void i() {
        C1878zd c1878zd = this.f14681l;
        synchronized (c1878zd.f16613d) {
            try {
                if (c1878zd.f16618k != -1 && !c1878zd.f16612c.isEmpty()) {
                    C1833yd c1833yd = (C1833yd) c1878zd.f16612c.getLast();
                    if (c1833yd.f16439b == -1) {
                        c1833yd.f16440c.f16610a.getClass();
                        c1833yd.f16439b = SystemClock.elapsedRealtime();
                        c1878zd.f16611b.a(c1878zd);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0808bi
    public final void j0() {
        C1878zd c1878zd = this.f14681l;
        synchronized (c1878zd.f16613d) {
            try {
                if (c1878zd.f16618k != -1) {
                    c1878zd.f16610a.getClass();
                    c1878zd.f16616h = SystemClock.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Bi
    public final void k(boolean z3) {
    }

    @Override // com.google.android.gms.internal.ads.Bi
    public final void o(C0789b7 c0789b7) {
        C1878zd c1878zd = this.f14681l;
        synchronized (c1878zd.f16613d) {
            c1878zd.f16611b.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.Bi
    public final void o0(boolean z3) {
    }

    @Override // com.google.android.gms.internal.ads.Vh
    public final void t() {
        C1878zd c1878zd = this.f14681l;
        synchronized (c1878zd.f16613d) {
            try {
                if (c1878zd.f16618k != -1 && c1878zd.f16615g == -1) {
                    c1878zd.f16610a.getClass();
                    c1878zd.f16615g = SystemClock.elapsedRealtime();
                    c1878zd.f16611b.a(c1878zd);
                }
                c1878zd.f16611b.c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Bi
    public final void y(C0789b7 c0789b7) {
        C1878zd c1878zd = this.f14681l;
        synchronized (c1878zd.f16613d) {
            c1878zd.f16611b.e();
        }
    }

    @Override // Q2.InterfaceC0347a
    public final void z() {
        C1878zd c1878zd = this.f14681l;
        synchronized (c1878zd.f16613d) {
            try {
                if (c1878zd.f16618k != -1) {
                    C1833yd c1833yd = new C1833yd(c1878zd);
                    c1878zd.f16610a.getClass();
                    c1833yd.f16438a = SystemClock.elapsedRealtime();
                    c1878zd.f16612c.add(c1833yd);
                    c1878zd.i++;
                    c1878zd.f16611b.b();
                    c1878zd.f16611b.a(c1878zd);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void p() {
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void C(BinderC1652uc binderC1652uc, String str, String str2) {
    }
}
