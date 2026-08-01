package sg.bigo.ads.f;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.json.JSONArray;
import sg.bigo.ads.K0.AbstractC4956m;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.k1.C5270k;
import sg.bigo.ads.k1.InterfaceC5279u;
import sg.bigo.ads.q0.AbstractC5446j;

/* renamed from: sg.bigo.ads.f.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5105j implements InterfaceC5279u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.Q.a f12768a;
    public final /* synthetic */ C5111p b;

    public C5105j(C5111p c5111p, sg.bigo.ads.Q.a aVar) {
        this.b = c5111p;
        this.f12768a = aVar;
    }

    @Override // sg.bigo.ads.k1.InterfaceC5279u
    public final void a() {
    }

    @Override // sg.bigo.ads.k1.InterfaceC5279u
    public final void a(WebView webView, int i) {
    }

    @Override // sg.bigo.ads.k1.InterfaceC5279u
    public final boolean a(Activity activity, int i) {
        return false;
    }

    @Override // sg.bigo.ads.k1.InterfaceC5279u
    public final boolean b(Activity activity, int i) {
        return false;
    }

    @Override // sg.bigo.ads.k1.InterfaceC5279u
    public final void c() {
        C5111p c5111p = this.b;
        c5111p.g = true;
        c5111p.getClass();
        sg.bigo.ads.Q.a aVar = this.f12768a;
        if (aVar != null) {
            aVar.a();
        }
        C5111p c5111p2 = this.b;
        C5270k c5270k = c5111p2.b;
        if (c5270k != null && c5111p2.n) {
            c5270k.loadUrl("javascript:" + sg.bigo.ads.K0.y.f12366a);
        }
        C5111p c5111p3 = this.b;
        c5111p3.h = sg.bigo.ads.m1.f.f13126a.a(c5111p3.b, c5111p3.u, c5111p3.v, c5111p3.x);
        C5111p c5111p4 = this.b;
        if (c5111p4.f) {
            C5270k c5270k2 = c5111p4.b;
            if (!c5111p4.j && (c5270k2 instanceof sg.bigo.ads.E1.f)) {
                c5111p4.j = true;
                AbstractC5446j.a(1, null, new RunnableC5100e(c5111p4, c5270k2), 0L);
            }
            C5270k c5270k3 = this.b.b;
            if (c5270k3 != null) {
                c5270k3.loadUrl("javascript:onViewImpression()");
            }
            sg.bigo.ads.m1.c cVar = this.b.h;
            if (cVar != null) {
                cVar.a();
            }
        }
        AbstractC5098c.a(this.b, 1);
    }

    @Override // sg.bigo.ads.k1.InterfaceC5279u
    public final void d() {
        this.b.getClass();
        sg.bigo.ads.Q.a aVar = this.f12768a;
        if (aVar != null) {
            aVar.a(new sg.bigo.ads.P.d(3001, 10102, "Adx media load error"));
        }
        AbstractC5098c.a(this.b, 2);
    }

    @Override // sg.bigo.ads.k1.InterfaceC5279u
    public final void e() {
    }

    @Override // sg.bigo.ads.k1.InterfaceC5279u
    public final void a(String str, sg.bigo.ads.U.j jVar) {
        String str2;
        sg.bigo.ads.P.f fVar = new sg.bigo.ads.P.f();
        C5111p c5111p = this.b;
        if (c5111p.m.u0.f12486a != 0) {
            Context d = c5111p.d();
            Ad ad = this.b.l;
            sg.bigo.ads.Y0.D.a(d, ad instanceof sg.bigo.ads.e.h ? (sg.bigo.ads.e.h) ad : null);
            fVar.m = 1;
        } else {
            String str3 = str;
            if (str3.startsWith(ProxyConfig.MATCH_HTTP)) {
                str2 = str3;
                str3 = "";
            } else {
                str2 = "";
            }
            sg.bigo.ads.U0.j jVar2 = c5111p.m.z;
            Ad ad2 = c5111p.l;
            sg.bigo.ads.e.h hVar = ad2 instanceof sg.bigo.ads.e.h ? (sg.bigo.ads.e.h) ad2 : null;
            Context d2 = c5111p.d();
            boolean a2 = hVar != null ? ((sg.bigo.ads.U0.b) hVar.e()).a(16) : false;
            Activity a3 = AbstractC4956m.a(c5111p.c);
            String str4 = jVar2.g;
            boolean a4 = c5111p.m.a(2);
            int i = jVar2.c;
            JSONArray jSONArray = jVar2.d;
            boolean b = c5111p.m.b();
            boolean a5 = c5111p.m.a(64);
            WeakHashMap weakHashMap = sg.bigo.ads.Y0.D.f12627a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(str3);
            sg.bigo.ads.e.h hVar2 = hVar;
            sg.bigo.ads.P.f a6 = sg.bigo.ads.Y0.D.a(d2, a3, arrayList, str2, str4, a4, i, jSONArray, hVar, b, 1, a2, false, a5);
            if (hVar2 != null && a6.a() > -1 && c5111p.m.l == 2) {
                hVar2.a(a6.d);
                sg.bigo.ads.Y0.D.a(a3, hVar2);
            }
            if (hVar2 != null && a6.f12478a == 6) {
                a6.l = jVar2.g;
                Activity a7 = AbstractC4956m.a(c5111p.c);
                sg.bigo.ads.P.c e = hVar2.e();
                if (a7 != null) {
                    WeakReference weakReference = new WeakReference(a7);
                    if (sg.bigo.ads.Y0.D.c == null) {
                        sg.bigo.ads.Y0.D.c = new sg.bigo.ads.Y0.C(weakReference, a6, e, hVar2);
                    }
                    AbstractC5446j.a(sg.bigo.ads.Y0.D.c);
                    AbstractC5446j.a(1, null, sg.bigo.ads.Y0.D.c, 5000L);
                }
            }
            a6.m = 0;
            fVar = a6;
        }
        z zVar = this.b.i;
        if (zVar != null) {
            zVar.a(jVar, fVar);
        }
    }

    @Override // sg.bigo.ads.k1.InterfaceC5279u
    public final void b() {
        z zVar = this.b.i;
        if (zVar != null) {
            zVar.a();
        }
    }
}
