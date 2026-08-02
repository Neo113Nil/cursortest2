package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.net.NetworkCapabilities;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.a5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0742a5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0863ct f12632a;

    /* renamed from: b, reason: collision with root package name */
    public final C0375o f12633b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC1143j5 f12634c;

    /* renamed from: d, reason: collision with root package name */
    public final Z4 f12635d;

    /* renamed from: e, reason: collision with root package name */
    public final U4 f12636e;
    public final C1233l5 f;

    /* renamed from: g, reason: collision with root package name */
    public final C1721w f12637g;

    /* renamed from: h, reason: collision with root package name */
    public final C1529ro f12638h;

    public C0742a5(C0863ct c0863ct, C0375o c0375o, ViewOnAttachStateChangeListenerC1143j5 viewOnAttachStateChangeListenerC1143j5, Z4 z42, U4 u42, C1233l5 c1233l5, C1721w c1721w, C1529ro c1529ro) {
        this.f12632a = c0863ct;
        this.f12633b = c0375o;
        this.f12634c = viewOnAttachStateChangeListenerC1143j5;
        this.f12635d = z42;
        this.f12636e = u42;
        this.f = c1233l5;
        this.f12637g = c1721w;
        this.f12638h = c1529ro;
    }

    public final HashMap a() {
        HashMap b3 = b();
        D3.o oVar = (D3.o) this.f12633b.f5045o;
        C1367o4 c1367o4 = C1087ht.f13812a;
        if (oVar.d()) {
            c1367o4 = (C1367o4) oVar.b();
        }
        b3.put("gai", Boolean.valueOf(this.f12632a.f13055b));
        b3.put("did", c1367o4.t0());
        b3.put("dst", Integer.valueOf(c1367o4.i0() - 1));
        b3.put("doo", Boolean.valueOf(c1367o4.f0()));
        return b3;
    }

    public final HashMap b() {
        long j5;
        HashMap hashMap = new HashMap();
        C0863ct c0863ct = this.f12632a;
        D3.o oVar = (D3.o) this.f12633b.f5046p;
        C1367o4 c1367o4 = C1175jt.f14187a;
        if (oVar.d()) {
            c1367o4 = (C1367o4) oVar.b();
        }
        hashMap.put("v", c0863ct.f13054a);
        hashMap.put("gms", Boolean.valueOf(this.f12632a.f13056c));
        hashMap.put("int", c1367o4.u0());
        hashMap.put("attts", Long.valueOf(c1367o4.s0().w()));
        hashMap.put("att", c1367o4.s0().y());
        hashMap.put("attkid", c1367o4.s0().z());
        hashMap.put("up", Boolean.valueOf(this.f12635d.f12450a));
        hashMap.put("t", new Throwable());
        C1721w c1721w = this.f12637g;
        if (c1721w != null) {
            hashMap.put("tcq", Long.valueOf(c1721w.f16073a));
            hashMap.put("tpq", Long.valueOf(this.f12637g.f16074b));
            hashMap.put("tcv", Long.valueOf(this.f12637g.f16075c));
            hashMap.put("tpv", Long.valueOf(this.f12637g.f16076d));
            hashMap.put("tchv", Long.valueOf(this.f12637g.f16077e));
            hashMap.put("tphv", Long.valueOf(this.f12637g.f));
            hashMap.put("tcc", Long.valueOf(this.f12637g.f16078g));
            hashMap.put("tpc", Long.valueOf(this.f12637g.f16079h));
            U4 u42 = this.f12636e;
            if (u42 != null) {
                synchronized (U4.class) {
                    try {
                        NetworkCapabilities networkCapabilities = (NetworkCapabilities) u42.f11722l;
                        if (networkCapabilities != null) {
                            if (networkCapabilities.hasTransport(4)) {
                                j5 = 2;
                            } else if (((NetworkCapabilities) u42.f11722l).hasTransport(1)) {
                                j5 = 1;
                            } else if (((NetworkCapabilities) u42.f11722l).hasTransport(0)) {
                                j5 = 0;
                            }
                        }
                        j5 = -1;
                    } finally {
                    }
                }
                hashMap.put("nt", Long.valueOf(j5));
            }
            C1233l5 c1233l5 = this.f;
            if (c1233l5 != null) {
                hashMap.put("vs", Long.valueOf(c1233l5.f14321d ? c1233l5.f14319b - c1233l5.f14318a : -1L));
                C1233l5 c1233l52 = this.f;
                long j6 = c1233l52.f14320c;
                c1233l52.f14320c = -1L;
                hashMap.put("vf", Long.valueOf(j6));
            }
        }
        return hashMap;
    }
}
