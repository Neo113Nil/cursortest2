package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Fs implements Is {

    /* renamed from: e, reason: collision with root package name */
    public static final Fs f9134e = new Fs(new Js());

    /* renamed from: a, reason: collision with root package name */
    public boolean f9135a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9136b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9137c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9138d;

    public Fs(Js js) {
        this.f9138d = js;
    }

    public synchronized C0777aw a(C1172jq c1172jq) {
        InterfaceC1443pr interfaceC1443pr;
        InterfaceC1443pr interfaceC1443pr2;
        if (!this.f9136b && !this.f9135a && (interfaceC1443pr = ((C1172jq) this.f9137c).f14170g) != null && (interfaceC1443pr2 = c1172jq.f14170g) != null && interfaceC1443pr.equals(interfaceC1443pr2)) {
            this.f9135a = true;
            return (C0777aw) this.f9138d;
        }
        return null;
    }

    public synchronized void b(C1667ur c1667ur) {
        C1537rw j02 = AbstractC1400ot.j0((C0777aw) this.f9138d, new C0727Yf(14), ((C1172jq) this.f9137c).f14169e);
        j02.a(new Kw(0, j02, c1667ur), ((C1172jq) this.f9137c).f14169e);
    }

    @Override // com.google.android.gms.internal.ads.Is
    public void d(boolean z3) {
        if (!this.f9136b && z3) {
            Date date = new Date();
            Date date2 = (Date) this.f9137c;
            if (date2 == null || date.after(date2)) {
                this.f9137c = date;
                if (this.f9135a) {
                    Iterator it = Collections.unmodifiableCollection(Hs.f9492c.f9494b).iterator();
                    while (it.hasNext()) {
                        Rs rs = ((C1893zs) it.next()).f16778d;
                        Date date3 = (Date) this.f9137c;
                        rs.c(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.f9136b = z3;
    }

    public Fs(C0905dr c0905dr, Dp dp, C1172jq c1172jq) {
        this.f9135a = false;
        this.f9136b = false;
        this.f9137c = c1172jq;
        E3.a g5 = ((C1529ro) dp.f8377l).g(c1172jq.f14166b, c1172jq.f14165a, null);
        P2.c cVar = new P2.c(this, dp, c0905dr, c1172jq, 5);
        Qw qw = c1172jq.f14169e;
        this.f9138d = AbstractC1400ot.X(AbstractC1400ot.j0(g5, cVar, qw), Exception.class, new N9(this, dp), qw);
    }
}
