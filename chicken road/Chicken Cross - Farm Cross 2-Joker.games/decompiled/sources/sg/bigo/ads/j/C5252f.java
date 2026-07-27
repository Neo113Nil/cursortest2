package sg.bigo.ads.j;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.iab.omid.library.bigosg.ScriptInjector;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import sg.bigo.ads.K0.AbstractC4956m;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.Y0.D;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.f.AbstractC5098c;
import sg.bigo.ads.f.InterfaceC5097b;
import sg.bigo.ads.f.z;
import sg.bigo.ads.h.C5185l1;
import sg.bigo.ads.k.InterfaceC5258c;
import sg.bigo.ads.k1.A;
import sg.bigo.ads.k1.C5270k;
import sg.bigo.ads.k1.C5271l;
import sg.bigo.ads.n1.o;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.z1.n;
import sg.bigo.ads.z1.p;

/* renamed from: sg.bigo.ads.j.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5252f implements sg.bigo.ads.k.d, InterfaceC5097b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12999a;
    public final String b;
    public final sg.bigo.ads.z1.a c;
    public final o d;
    public final p e;
    public final Ad f;
    public final sg.bigo.ads.P.c g;
    public long i;
    public sg.bigo.ads.m1.c k;
    public z l;
    public A m;
    public C5270k n;
    public View o;
    public boolean p;
    public boolean q;
    public final InterfaceC5258c t;
    public volatile boolean u;
    public boolean h = false;
    public int j = 0;
    public boolean r = false;
    public final C5251e s = new C5251e();

    public C5252f(Ad ad, sg.bigo.ads.P.c cVar, o oVar, p pVar, sg.bigo.ads.z1.a aVar, InterfaceC5258c interfaceC5258c) {
        this.c = aVar;
        this.b = aVar == null ? null : aVar.b;
        this.d = oVar;
        this.e = pVar;
        this.f = ad;
        this.g = cVar;
        this.t = interfaceC5258c;
        this.f12999a = !TextUtils.isEmpty(r6);
    }

    public final void a(Context context, String str, sg.bigo.ads.U.j jVar) {
        sg.bigo.ads.P.f a2;
        Ad ad = this.f;
        if (ad instanceof sg.bigo.ads.Q.d) {
            ((sg.bigo.ads.Q.d) ad).a();
        }
        InterfaceC5258c interfaceC5258c = this.t;
        String str2 = (interfaceC5258c == null || !interfaceC5258c.d()) ? null : str;
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) this.g;
        boolean z = false;
        if (bVar.u0.f12486a == 0 || !(this.f instanceof sg.bigo.ads.e.h)) {
            boolean a3 = bVar.a(16);
            Activity a4 = AbstractC4956m.a(this.o);
            Ad ad2 = this.f;
            sg.bigo.ads.P.c cVar = this.g;
            a2 = AbstractC5247a.a(context, a4, ad2, cVar, str2, this.e, this.c, a3, ((sg.bigo.ads.U0.b) cVar).a(64));
            a2.m = 0;
        } else {
            Context context2 = this.o.getContext();
            Ad ad3 = this.f;
            D.a(context2, ad3 instanceof sg.bigo.ads.E.e ? (sg.bigo.ads.E.e) ad3 : ad3 instanceof sg.bigo.ads.E.f ? (sg.bigo.ads.E.f) ad3 : ad3 instanceof C5185l1 ? ((C5185l1) ad3).D() : (sg.bigo.ads.e.h) ad3);
            a2 = new sg.bigo.ads.P.f();
            a2.m = 1;
        }
        o oVar = this.d;
        if (oVar != null) {
            sg.bigo.ads.P.c cVar2 = this.g;
            Iterator it = oVar.f13215a.x.iterator();
            while (it.hasNext()) {
                oVar.e = true;
                oVar.a((n) it.next(), "va_cpn_cli", cVar2, 6, 13);
                it.remove();
                z = true;
            }
            if (!z) {
                o oVar2 = this.d;
                sg.bigo.ads.P.c cVar3 = this.g;
                if (!oVar2.e) {
                    Iterator it2 = oVar2.f13215a.j.iterator();
                    while (it2.hasNext()) {
                        oVar2.a((n) it2.next(), "va_cli", cVar3, 6, 13);
                        it2.remove();
                    }
                }
            }
        }
        z zVar = this.l;
        if (zVar != null) {
            zVar.a(jVar, a2);
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void b() {
        InterfaceC5258c interfaceC5258c;
        if (this.p || this.q || this.r || (interfaceC5258c = this.t) == null || this.i <= 0) {
            return;
        }
        interfaceC5258c.d(this.g, SystemClock.elapsedRealtime() - this.i);
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final boolean c() {
        if (this.f12999a) {
            return this.h;
        }
        return false;
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void d() {
        A a2 = this.m;
        if (a2 != null) {
            a2.d();
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final View e() {
        return this.o;
    }

    public final void f() {
        int i;
        int i2;
        if (this.m == null || this.u) {
            return;
        }
        this.u = true;
        A a2 = this.m;
        C5270k c5270k = a2.l.d != null ? a2.j : a2.i;
        this.n = c5270k;
        if (c5270k != null) {
            c5270k.setOverScrollMode(2);
            int i3 = 0;
            this.n.setHorizontalScrollBarEnabled(false);
            this.n.setHorizontalScrollbarOverlay(false);
            this.n.setVerticalScrollBarEnabled(false);
            this.n.setVerticalScrollbarOverlay(false);
            this.n.getSettings().setSupportZoom(false);
            this.n.setBackgroundColor(-1);
            sg.bigo.ads.z1.a aVar = this.c;
            if (aVar != null) {
                i2 = aVar.c;
                i = aVar.d;
            } else {
                i = 0;
                i2 = 0;
            }
            C5270k c5270k2 = this.n;
            if (c5270k2 != null) {
                Object parent = c5270k2.getParent();
                if (parent instanceof FrameLayout) {
                    this.o = (View) parent;
                    AbstractC5098c.a(this, 0);
                    Context context = c5270k2.getContext();
                    int c = AbstractC4963u.c(context);
                    int i4 = context.getResources().getDisplayMetrics().heightPixels;
                    if (AbstractC4963u.a(context, i2) > c || AbstractC4963u.a(context, i) > i4) {
                        i = 0;
                    } else {
                        i3 = i2;
                    }
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c5270k2.getLayoutParams();
                    if (i3 <= 0 || i <= 0) {
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                    } else {
                        layoutParams.gravity = 17;
                        layoutParams.width = AbstractC4963u.a(context, i3);
                        layoutParams.height = AbstractC4963u.a(context, i);
                    }
                }
            }
            this.n.addJavascriptInterface(new C5250d(this), "BGN_PLAYABLE");
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void pause() {
        A a2 = this.m;
        if (a2 != null) {
            a2.b(false);
        }
    }

    public final boolean b(Context context) {
        try {
            this.m = new A(context, 2);
        } catch (NoClassDefFoundError unused) {
            AbstractC5496a.a("HtmlVastCompanion", "Banner webview is not support");
        }
        A a2 = this.m;
        if (a2 == null) {
            return false;
        }
        a2.h = new C5249c(this, context);
        return true;
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void a(int i) {
        if (i == 1) {
            C5251e c5251e = this.s;
            c5251e.f12998a = true;
            int i2 = c5251e.b;
            c5251e.b = -1;
            if (i2 == 0 || i2 == 1) {
                WeakReference weakReference = c5251e.c;
                Activity activity = weakReference == null ? null : (Activity) weakReference.get();
                if (activity != null) {
                    activity.setRequestedOrientation(i2);
                }
            }
            o oVar = this.d;
            if (oVar != null) {
                oVar.a(oVar.f13215a.w, "va_cpn_imp");
            }
            A a2 = this.m;
            if (a2 == null || ((sg.bigo.ads.U0.b) this.g).t0 <= 0) {
                return;
            }
            a2.k.h = true;
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final boolean a(Context context) {
        if (!this.f12999a) {
            return false;
        }
        if (this.m == null) {
            if (!b(context)) {
                return false;
            }
            String str = this.b;
            sg.bigo.ads.m1.g gVar = sg.bigo.ads.m1.f.f13126a;
            if (gVar.b) {
                try {
                    str = ScriptInjector.injectScriptContentIntoHtml(gVar.f12790a, str);
                } catch (Exception unused) {
                }
            }
            String str2 = (str + "\n<script>document.addEventListener('DOMContentLoaded',function(){BGN_PLAYABLE.onBGNDomContentLoaded()});\nwindow.addEventListener('load',function(){BGN_PLAYABLE.onBGNLoaded()});</script>") + "\n<script type=\"text/javascript\">\n    document.body.style.margin = '0px';\n</script>";
            this.i = SystemClock.elapsedRealtime();
            InterfaceC5258c interfaceC5258c = this.t;
            if (interfaceC5258c != null) {
                interfaceC5258c.b(this.g);
            }
            A a2 = this.m;
            C5270k a3 = C5271l.a(a2.b);
            a2.i = a3;
            if (a3 != null) {
                a2.k.a(a2.i);
                a2.c.addView(a2.i, new FrameLayout.LayoutParams(-1, -1));
            }
            C5271l c5271l = a2.k;
            C5270k c5270k = c5271l.d;
            if (c5270k == null) {
                AbstractC5496a.a("MraidBridge", "MRAID bridge called setContentHtml before WebView was attached");
            } else {
                c5271l.f = false;
                c5270k.loadDataWithBaseURL("https://mraid.bigo.sg", str2, "text/html", null, null);
            }
        }
        f();
        return true;
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void a() {
        sg.bigo.ads.m1.c cVar = this.k;
        if (cVar != null) {
            if (AbstractC5446j.e()) {
                try {
                    cVar.f13123a.finish();
                } catch (Throwable unused) {
                }
            } else {
                AbstractC5446j.a(2, null, new sg.bigo.ads.m1.b(cVar), 0L);
            }
            cVar.c = null;
        }
        A a2 = this.m;
        if (a2 != null) {
            a2.a();
            this.m = null;
        }
        C5270k c5270k = this.n;
        if (c5270k != null) {
            X.c(c5270k);
            this.n = null;
        }
        this.l = null;
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void a(int i, int i2) {
        int i3;
        int i4;
        C5270k c5270k = this.n;
        if (c5270k == null) {
            return;
        }
        Context context = c5270k.getContext();
        sg.bigo.ads.z1.a aVar = this.c;
        int i5 = 0;
        if (aVar != null) {
            i4 = aVar.c;
            i3 = aVar.d;
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (AbstractC4963u.a(context, i4) > i || AbstractC4963u.a(context, i3) > i2) {
            i3 = 0;
        } else {
            i5 = i4;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.n.getLayoutParams();
        if (i5 <= 0 || i3 <= 0) {
            layoutParams.width = i;
            layoutParams.height = i2;
        } else {
            layoutParams.gravity = 17;
            layoutParams.width = AbstractC4963u.a(context, i5);
            layoutParams.height = AbstractC4963u.a(context, i3);
        }
    }
}
