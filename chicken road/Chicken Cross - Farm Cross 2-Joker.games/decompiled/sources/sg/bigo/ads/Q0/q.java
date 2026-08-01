package sg.bigo.ads.Q0;

import android.text.TextUtils;
import com.tiktok.util.UrlConst;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.K0.AbstractC4955l;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.X0.u;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.x0.InterfaceC5501a;

/* loaded from: classes3.dex */
public final class q implements InterfaceC5501a {

    /* renamed from: a, reason: collision with root package name */
    public final b f12513a;
    public final sg.bigo.ads.R0.h b;
    public final sg.bigo.ads.U.h c;
    public final sg.bigo.ads.T0.g d;
    public final String e;
    public String f;
    public sg.bigo.ads.R0.g g;
    public sg.bigo.ads.R0.g h;
    public final boolean i;
    public boolean j;
    public String k;
    public c l;
    public final String m;
    public final AtomicBoolean n = new AtomicBoolean(false);
    public final AtomicBoolean o = new AtomicBoolean(false);
    public final p p = new p(this);

    public q(b bVar, sg.bigo.ads.U.h hVar, sg.bigo.ads.T0.g gVar, String str, String str2) {
        this.m = null;
        boolean z = false;
        this.f12513a = bVar;
        this.c = hVar;
        this.d = gVar;
        this.e = str;
        this.m = str2;
        if (str.equals("/Ad/GetSDKConfig")) {
            this.b = bVar.j;
            z = true;
        } else {
            this.b = !str.equals("/Ad/ReportUniBaina") ? bVar.l : bVar.k;
        }
        this.i = z;
    }

    @Override // sg.bigo.ads.x0.InterfaceC5501a
    public final String a() {
        boolean isEmpty;
        c cVar;
        c cVar2;
        n nVar;
        String str = this.m;
        if (str != null) {
            return UrlConst.HTTPS + str + this.e;
        }
        if (I.a((CharSequence) this.f)) {
            String e = ((u) this.c).e();
            b bVar = this.f12513a;
            synchronized (bVar) {
                isEmpty = TextUtils.isEmpty(bVar.f);
            }
            o a2 = this.b.a(!isEmpty ? this.f12513a.c() : null, this.d.M, e);
            this.f12513a.getClass();
            b bVar2 = this.f12513a;
            this.j = bVar2.h;
            this.k = bVar2.i;
            sg.bigo.ads.R0.g gVar = a2.f12511a;
            this.g = gVar;
            sg.bigo.ads.R0.g gVar2 = this.b.h;
            this.h = gVar2;
            sg.bigo.ads.S0.h hVar = sg.bigo.ads.S0.g.f12539a;
            String str2 = this.e;
            if (str2 != null && gVar != null && gVar2 != null) {
                sg.bigo.ads.T0.g gVar3 = sg.bigo.ads.O.g.f12472a;
                if (1 == gVar3.Q && gVar3.R > 0 && gVar3.S > 0 && gVar3.T > 0 && (nVar = hVar.f12540a) != null) {
                    if (str2.equals("/Ad/GetSDKConfig")) {
                        if (gVar.c != 1) {
                            if (hVar.f == null) {
                                hVar.f = new sg.bigo.ads.S0.j(nVar, hVar.b, hVar.c, hVar.d);
                            }
                            hVar.f.c();
                        }
                    } else if (str2.equals("/Ad/ReportUniBaina")) {
                        if (gVar.c != 1) {
                            if (hVar.g == null) {
                                hVar.g = new sg.bigo.ads.S0.d(nVar, hVar.b, hVar.c, hVar.d);
                            }
                            hVar.g.c();
                        }
                    } else if (gVar.c != 1) {
                        if (hVar.h == null) {
                            hVar.h = new sg.bigo.ads.S0.b(nVar, hVar.b, hVar.c, hVar.d);
                        }
                        sg.bigo.ads.S0.b bVar3 = hVar.h;
                        bVar3.j = hVar.e;
                        bVar3.c();
                    }
                }
            }
            this.f = AbstractC4955l.a(this.g.b) ? UrlConst.HTTPS + this.g.b + this.e : UrlConst.HTTPS + this.g.f12519a + this.e;
            if (a2.c && (cVar2 = this.l) != null) {
                cVar2.f12500a.f12510a.a(0L);
            }
            if (a2.b && (cVar = this.l) != null) {
                if (!this.i) {
                    n.a(cVar.f12500a, (d) null);
                }
                n.a(cVar.f12500a, e, true);
            }
        }
        return this.f;
    }

    @Override // sg.bigo.ads.x0.InterfaceC5501a
    public final String b() {
        sg.bigo.ads.R0.g gVar = this.g;
        return gVar != null ? gVar.f12519a : "";
    }

    @Override // sg.bigo.ads.x0.InterfaceC5501a
    public final boolean c() {
        sg.bigo.ads.R0.g gVar = this.g;
        return gVar != null && AbstractC4955l.a(gVar.b);
    }

    @Override // sg.bigo.ads.x0.InterfaceC5501a
    public final void d() {
        c cVar;
        boolean z = false;
        if (this.n.compareAndSet(false, true)) {
            AbstractC5446j.a(this.p);
            String b = b();
            sg.bigo.ads.R0.h hVar = this.b;
            sg.bigo.ads.R0.g gVar = hVar.i;
            if (gVar != null && (z = TextUtils.equals(b, gVar.f12519a))) {
                hVar.j++;
            }
            if (z && (cVar = this.l) != null) {
                cVar.f12500a.f12510a.a(0L);
            }
        }
    }

    @Override // sg.bigo.ads.x0.InterfaceC5501a
    public final String e() {
        sg.bigo.ads.R0.g gVar = this.h;
        return gVar != null ? gVar.f12519a : "";
    }

    @Override // sg.bigo.ads.x0.InterfaceC5501a
    public final void f() {
        c cVar;
        boolean z = false;
        if (this.n.compareAndSet(false, true)) {
            AbstractC5446j.a(this.p);
            String b = b();
            sg.bigo.ads.R0.h hVar = this.b;
            sg.bigo.ads.R0.g gVar = hVar.i;
            if (gVar != null) {
                boolean z2 = TextUtils.equals(b, gVar.f12519a) && hVar.j > 0;
                if (z2) {
                    hVar.j = 0;
                }
                z = z2;
            }
            if (z && (cVar = this.l) != null) {
                cVar.f12500a.f12510a.a(0L);
            }
        }
    }
}
