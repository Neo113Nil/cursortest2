package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import Q2.InterfaceC0347a;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.jl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1167jl implements InterfaceC1703vi, InterfaceC0347a, Vh, Qh {

    /* renamed from: k, reason: collision with root package name */
    public final Context f14131k;

    /* renamed from: l, reason: collision with root package name */
    public final C0817br f14132l;

    /* renamed from: m, reason: collision with root package name */
    public final C1482ql f14133m;

    /* renamed from: n, reason: collision with root package name */
    public final Sq f14134n;

    /* renamed from: o, reason: collision with root package name */
    public final Lq f14135o;

    /* renamed from: p, reason: collision with root package name */
    public final Xm f14136p;

    /* renamed from: q, reason: collision with root package name */
    public final String f14137q;

    /* renamed from: r, reason: collision with root package name */
    public Boolean f14138r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f14139s = ((Boolean) Q2.r.f5053d.f5056c.a(F7.t6)).booleanValue();

    public C1167jl(Context context, C0817br c0817br, C1482ql c1482ql, Sq sq, Lq lq, Xm xm, String str) {
        this.f14131k = context;
        this.f14132l = c0817br;
        this.f14133m = c1482ql;
        this.f14134n = sq;
        this.f14135o = lq;
        this.f14136p = xm;
        this.f14137q = str;
    }

    @Override // com.google.android.gms.internal.ads.Qh
    public final void a() {
        if (this.f14139s) {
            C1390oj b3 = b("ifts");
            b3.k("reason", "blocked");
            b3.q();
        }
    }

    public final C1390oj b(String str) {
        Sq sq = this.f14134n;
        C1071hd c1071hd = sq.f11596b;
        C1390oj a5 = this.f14133m.a();
        a5.k("gqi", ((Nq) c1071hd.f13762m).f10823b);
        Lq lq = this.f14135o;
        a5.l(lq);
        a5.k("action", str);
        a5.k("ad_format", this.f14137q.toUpperCase(Locale.ROOT));
        List list = lq.f10525t;
        if (!list.isEmpty()) {
            a5.k("ancn", (String) list.get(0));
        }
        if (lq.b()) {
            P2.o oVar = P2.o.f4767B;
            a5.k("device_connectivity", true != oVar.f4774g.a(this.f14131k) ? "offline" : "online");
            oVar.f4776j.getClass();
            a5.k("event_timestamp", String.valueOf(System.currentTimeMillis()));
            a5.k("offline_ad", "1");
        }
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.A6)).booleanValue()) {
            U4 u42 = sq.f11595a;
            boolean z3 = G4.d.S((Wq) u42.f11722l) != 1;
            a5.k("scar", String.valueOf(z3));
            if (z3) {
                Q2.X0 x02 = ((Wq) u42.f11722l).f12098d;
                a5.k("ragent", x02.f4972z);
                a5.k("rtype", G4.d.P(G4.d.Q(x02)));
            }
        }
        return a5;
    }

    public final void d(C1390oj c1390oj) {
        if (!this.f14135o.b()) {
            c1390oj.q();
            return;
        }
        C1616tl c1616tl = ((C1482ql) c1390oj.f14828m).f15165a;
        String a5 = c1616tl.f.a((ConcurrentHashMap) c1390oj.f14827l);
        P2.o.f4767B.f4776j.getClass();
        K3 k32 = new K3(System.currentTimeMillis(), ((Nq) this.f14134n.f11596b.f13762m).f10823b, a5, 2);
        Xm xm = this.f14136p;
        xm.getClass();
        xm.d(new C0709Wb(25, xm, k32));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1703vi
    public final void e() {
        if (i()) {
            b("adapter_shown").q();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1703vi
    public final void h() {
        if (i()) {
            b("adapter_impression").q();
        }
    }

    public final boolean i() {
        String str;
        if (this.f14138r == null) {
            synchronized (this) {
                if (this.f14138r == null) {
                    String str2 = (String) Q2.r.f5053d.f5056c.a(F7.f8896s1);
                    T2.L l5 = P2.o.f4767B.f4771c;
                    try {
                        str = T2.L.F(this.f14131k);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z3 = false;
                    if (str2 != null && str != null) {
                        try {
                            z3 = Pattern.matches(str2, str);
                        } catch (RuntimeException e3) {
                            P2.o.f4767B.f4774g.i("CsiActionsListener.isPatternMatched", e3);
                        }
                    }
                    this.f14138r = Boolean.valueOf(z3);
                }
            }
        }
        return this.f14138r.booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.Qh
    public final void n0(C1121ij c1121ij) {
        if (this.f14139s) {
            C1390oj b3 = b("ifts");
            b3.k("reason", "exception");
            if (!TextUtils.isEmpty(c1121ij.getMessage())) {
                b3.k("msg", c1121ij.getMessage());
            }
            b3.q();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    @Override // com.google.android.gms.internal.ads.Qh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(C0387u0 c0387u0) {
        String str;
        C0387u0 c0387u02;
        if (this.f14139s) {
            C1390oj b3 = b("ifts");
            b3.k("reason", "adapter");
            int i = c0387u0.f5058k;
            if (c0387u0.f5060m.equals("com.google.android.gms.ads") && (c0387u02 = c0387u0.f5061n) != null && !c0387u02.f5060m.equals("com.google.android.gms.ads")) {
                c0387u0 = c0387u0.f5061n;
                i = c0387u0.f5058k;
            }
            String str2 = c0387u0.f5059l;
            if (i >= 0) {
                b3.k("arec", String.valueOf(i));
            }
            Pattern pattern = this.f14132l.f12915a;
            if (pattern != null && str2 != null) {
                Matcher matcher = pattern.matcher(str2);
                if (matcher.find()) {
                    str = matcher.group();
                    if (str != null) {
                        b3.k("areec", str);
                    }
                    b3.q();
                }
            }
            str = null;
            if (str != null) {
            }
            b3.q();
        }
    }

    @Override // com.google.android.gms.internal.ads.Vh
    public final void t() {
        if (i() || this.f14135o.b()) {
            d(b("impression"));
        }
    }

    @Override // Q2.InterfaceC0347a
    public final void z() {
        if (this.f14135o.b()) {
            d(b("click"));
        }
    }
}
