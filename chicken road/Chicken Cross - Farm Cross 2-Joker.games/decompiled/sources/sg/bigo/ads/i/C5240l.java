package sg.bigo.ads.i;

import android.os.SystemClock;
import android.webkit.WebView;
import java.util.HashMap;
import sg.bigo.ads.h.A2;
import sg.bigo.ads.h.B2;
import sg.bigo.ads.k.C5256a;
import sg.bigo.ads.k.InterfaceC5258c;
import sg.bigo.ads.q0.AbstractC5446j;

/* renamed from: sg.bigo.ads.i.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5240l implements InterfaceC5258c {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC5258c f12987a;
    public final /* synthetic */ C5241m b;

    public C5240l(C5241m c5241m) {
        this.b = c5241m;
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void a(sg.bigo.ads.P.c cVar, long j) {
        this.b.h.a(cVar, 0, j);
        InterfaceC5258c interfaceC5258c = this.f12987a;
        if (interfaceC5258c != null) {
            interfaceC5258c.a(cVar, j);
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void b(sg.bigo.ads.P.c cVar, long j) {
        this.b.h.a(cVar, 2, j);
        InterfaceC5258c interfaceC5258c = this.f12987a;
        if (interfaceC5258c != null) {
            interfaceC5258c.b(cVar, j);
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void c(sg.bigo.ads.P.c cVar) {
        if (this.b.f12988a) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C5241m c5241m = this.b;
            c5241m.n = elapsedRealtime;
            HashMap g = c5241m.g();
            long j = this.b.m;
            if (j > 0) {
                g.put("imp_2_game_start", String.valueOf(elapsedRealtime - j));
            }
            C5241m c5241m2 = this.b;
            long j2 = c5241m2.j;
            long j3 = j2 > 0 ? elapsedRealtime - j2 : 0L;
            C5256a c5256a = c5241m2.h;
            if (g.isEmpty()) {
                g = null;
            }
            c5256a.a(cVar, 9, j3, g);
        }
        InterfaceC5258c interfaceC5258c = this.f12987a;
        if (interfaceC5258c != null) {
            interfaceC5258c.c(cVar);
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final boolean d() {
        return false;
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void e() {
        if (this.b.f12988a) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            HashMap g = this.b.g();
            long j = this.b.n;
            if (j > 0) {
                g.put("game_start_2_end", String.valueOf(elapsedRealtime - j));
            }
            C5241m c5241m = this.b;
            long j2 = c5241m.j;
            long j3 = j2 > 0 ? elapsedRealtime - j2 : 0L;
            C5256a c5256a = c5241m.h;
            sg.bigo.ads.P.c cVar = c5241m.i;
            if (g.isEmpty()) {
                g = null;
            }
            c5256a.a(cVar, 13, j3, g);
        }
        B2 b2 = this.b.f;
        if (b2 != null) {
            AbstractC5446j.b(new A2(b2));
        }
        InterfaceC5258c interfaceC5258c = this.f12987a;
        if (interfaceC5258c != null) {
            interfaceC5258c.e();
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void d(sg.bigo.ads.P.c cVar) {
        C5241m c5241m = this.b;
        if (c5241m.f12988a) {
            HashMap g = c5241m.g();
            C5256a c5256a = this.b.h;
            if (g.isEmpty()) {
                g = null;
            }
            c5256a.a(cVar, 12, 0L, g);
        }
        InterfaceC5258c interfaceC5258c = this.f12987a;
        if (interfaceC5258c != null) {
            interfaceC5258c.d(cVar);
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void a(sg.bigo.ads.P.c cVar) {
        if (this.b.f12988a) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C5241m c5241m = this.b;
            c5241m.k = elapsedRealtime;
            HashMap g = c5241m.g();
            C5241m c5241m2 = this.b;
            long j = c5241m2.j;
            long j2 = j > 0 ? elapsedRealtime - j : 0L;
            C5256a c5256a = c5241m2.h;
            if (g.isEmpty()) {
                g = null;
            }
            c5256a.a(cVar, 7, j2, g);
        }
        InterfaceC5258c interfaceC5258c = this.f12987a;
        if (interfaceC5258c != null) {
            interfaceC5258c.a(cVar);
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void b(sg.bigo.ads.P.c cVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C5241m c5241m = this.b;
        if (c5241m.f12988a) {
            c5241m.j = SystemClock.elapsedRealtime();
        }
        C5241m c5241m2 = this.b;
        long j = c5241m2.j;
        c5241m2.h.a(cVar, 6, j > 0 ? elapsedRealtime - j : 0L);
        InterfaceC5258c interfaceC5258c = this.f12987a;
        if (interfaceC5258c != null) {
            interfaceC5258c.b(cVar);
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void d(sg.bigo.ads.P.c cVar, long j) {
        this.b.h.a(cVar, 5, j);
        InterfaceC5258c interfaceC5258c = this.f12987a;
        if (interfaceC5258c != null) {
            interfaceC5258c.d(cVar, j);
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void a(WebView webView, int i) {
        C5234f c5234f = this.b.g;
        if (c5234f != null) {
            AbstractC5446j.b(new RunnableC5233e(c5234f, i));
        }
        InterfaceC5258c interfaceC5258c = this.f12987a;
        if (interfaceC5258c != null) {
            interfaceC5258c.a(webView, i);
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void c(sg.bigo.ads.P.c cVar, long j) {
        this.b.h.a(cVar, 1, j);
        InterfaceC5258c interfaceC5258c = this.f12987a;
        if (interfaceC5258c != null) {
            interfaceC5258c.c(cVar, j);
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void c() {
        Runnable runnable = this.b.e;
        if (runnable != null) {
            runnable.run();
        }
        C5241m c5241m = this.b;
        if (c5241m.f12988a) {
            c5241m.l = SystemClock.elapsedRealtime();
            HashMap g = this.b.g();
            C5241m c5241m2 = this.b;
            long j = c5241m2.k;
            if (j > 0) {
                g.put("start_2_loaded", String.valueOf(c5241m2.l - j));
            }
            C5241m c5241m3 = this.b;
            long j2 = c5241m3.j;
            long j3 = j2 > 0 ? c5241m3.l - j2 : 0L;
            C5256a c5256a = c5241m3.h;
            sg.bigo.ads.P.c cVar = c5241m3.i;
            if (g.isEmpty()) {
                g = null;
            }
            c5256a.a(cVar, 8, j3, g);
        }
        InterfaceC5258c interfaceC5258c = this.f12987a;
        if (interfaceC5258c != null) {
            interfaceC5258c.c();
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5258c
    public final void e(sg.bigo.ads.P.c cVar) {
        if (this.b.f12988a) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C5241m c5241m = this.b;
            c5241m.m = elapsedRealtime;
            HashMap g = c5241m.g();
            long j = this.b.l;
            if (j > 0) {
                g.put("loaded_2_imp", String.valueOf(elapsedRealtime - j));
            }
            long j2 = this.b.n;
            if (j2 > 0) {
                g.put("imp_2_game_start", String.valueOf(j2 - elapsedRealtime));
            }
            C5241m c5241m2 = this.b;
            long j3 = c5241m2.j;
            long j4 = j3 > 0 ? elapsedRealtime - j3 : 0L;
            C5256a c5256a = c5241m2.h;
            if (g.isEmpty()) {
                g = null;
            }
            c5256a.a(cVar, 11, j4, g);
        }
        InterfaceC5258c interfaceC5258c = this.f12987a;
        if (interfaceC5258c != null) {
            interfaceC5258c.e(cVar);
        }
    }
}
