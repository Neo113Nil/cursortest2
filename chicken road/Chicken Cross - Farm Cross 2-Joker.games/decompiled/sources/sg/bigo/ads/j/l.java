package sg.bigo.ads.j;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.media3.common.MimeTypes;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import sg.bigo.ads.K0.AbstractC4956m;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.Y0.D;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.h.C5185l1;
import sg.bigo.ads.i.C5230b;
import sg.bigo.ads.k.C5256a;
import sg.bigo.ads.n1.o;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.s0.y;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.z1.n;
import sg.bigo.ads.z1.p;

/* loaded from: classes3.dex */
public final class l implements sg.bigo.ads.k.f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13005a;
    public final o c;
    public final p d;
    public final Ad e;
    public final sg.bigo.ads.P.c f;
    public final C5230b g;
    public j h;
    public WebView i;
    public View j;
    public sg.bigo.ads.k.e k;
    public long m;
    public boolean n;
    public sg.bigo.ads.z1.a p;
    public boolean l = false;
    public boolean o = false;
    public final ArrayList b = new ArrayList();

    public l(sg.bigo.ads.k.d dVar, Ad ad, sg.bigo.ads.P.c cVar, o oVar, p pVar, C5230b c5230b) {
        boolean z = false;
        this.c = oVar;
        this.d = pVar;
        this.e = ad;
        this.f = cVar;
        this.g = c5230b;
        if (pVar != null) {
            Iterator it = pVar.y.iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((sg.bigo.ads.z1.b) it.next()).b;
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        sg.bigo.ads.z1.a aVar = (sg.bigo.ads.z1.a) it2.next();
                        if (aVar.a() && ("image/jpeg".equalsIgnoreCase(aVar.e) || MimeTypes.IMAGE_PNG.equalsIgnoreCase(aVar.e))) {
                            this.b.add(aVar);
                        }
                    }
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        sg.bigo.ads.z1.a aVar2 = (sg.bigo.ads.z1.a) it3.next();
                        if (aVar2.a() && "image/gif".equalsIgnoreCase(aVar2.e)) {
                            this.b.add(aVar2);
                        }
                    }
                }
            }
        }
        boolean z2 = !this.b.isEmpty();
        if (dVar instanceof sg.bigo.ads.k.f) {
            z = z2;
        } else {
            AbstractC5496a.a("StaticVastCompanion", "Failed to init html companion for invalid invoker.");
        }
        this.f13005a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(l lVar, Context context, sg.bigo.ads.z1.a aVar, int i, Bitmap bitmap, y yVar) {
        String str;
        String obj;
        File file;
        lVar.getClass();
        AdImageView adImageView = null;
        if ("image/jpeg".equalsIgnoreCase(aVar.e) || MimeTypes.IMAGE_PNG.equalsIgnoreCase(aVar.e)) {
            AdImageView adImageView2 = new AdImageView(context);
            adImageView2.setImageBitmap(bitmap);
            adImageView2.setOnTouchListener(new k(lVar, context));
            str = null;
            adImageView = adImageView2;
        } else if ("image/gif".equalsIgnoreCase(aVar.e)) {
            try {
                file = new File(yVar.d);
            } catch (Exception e) {
                obj = e.toString();
            }
            if (file.exists()) {
                URI uri = file.toURI();
                WebView webView = new WebView(context);
                webView.getSettings().setAllowFileAccess(true);
                webView.getSettings().setAllowFileAccessFromFileURLs(false);
                webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
                if (uri.toString().startsWith("file://")) {
                    webView.getSettings().setJavaScriptEnabled(false);
                } else {
                    webView.getSettings().setJavaScriptEnabled(true);
                }
                webView.loadUrl(uri.toString());
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.setOnTouchListener(new k(lVar, context));
                lVar.i = webView;
                str = null;
                adImageView = webView;
            } else {
                obj = "git file not exists";
                str = obj;
            }
        } else {
            str = null;
        }
        if (adImageView == null) {
            C5230b c5230b = lVar.g;
            if (c5230b != null) {
                lVar.o = true;
                sg.bigo.ads.P.c cVar = lVar.f;
                long elapsedRealtime = SystemClock.elapsedRealtime() - lVar.m;
                String str2 = aVar.b;
                String str3 = aVar.e;
                C5256a c5256a = c5230b.f12977a.c;
                if (c5256a.f13012a.contains(4)) {
                    return;
                }
                c5256a.f13012a.add(4);
                sg.bigo.ads.s1.b.a(cVar, 4, elapsedRealtime, str2, i, str3, str, (HashMap) null);
                return;
            }
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0) {
            width = AbstractC4963u.a(context, aVar.c);
            height = AbstractC4963u.a(context, aVar.d);
        }
        float c = AbstractC4963u.c(context);
        float f = context.getResources().getDisplayMetrics().heightPixels;
        if (c > 0.0f && f > 0.0f) {
            float f2 = height;
            float f3 = width;
            float f4 = (f2 * c) / f3;
            if (f4 > f) {
                c = (f3 * f) / f2;
            } else {
                f = f4;
            }
            width = (int) c;
            height = (int) f;
        }
        FrameLayout.LayoutParams layoutParams = (width <= 0 || height <= 0) ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(width, height, 17);
        j jVar = new j(context);
        jVar.setOnClickListener(new i(lVar, context, jVar));
        lVar.j = adImageView;
        jVar.addView(adImageView, layoutParams);
        lVar.h = jVar;
        C5230b c5230b2 = lVar.g;
        if (c5230b2 != null) {
            lVar.n = true;
            sg.bigo.ads.P.c cVar2 = lVar.f;
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - lVar.m;
            String str4 = aVar.b;
            String str5 = aVar.e;
            C5256a c5256a2 = c5230b2.f12977a.c;
            if (c5256a2.f13012a.contains(3)) {
                return;
            }
            c5256a2.f13012a.add(3);
            sg.bigo.ads.s1.b.a(cVar2, 3, elapsedRealtime2, str4, i, str5, (String) null, (HashMap) null);
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void b() {
        C5230b c5230b;
        if (this.o || this.n || (c5230b = this.g) == null || this.m <= 0) {
            return;
        }
        c5230b.f12977a.c.a(this.f, 5, SystemClock.elapsedRealtime() - this.m);
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final boolean c() {
        return (this.l || this.h == null) ? false : true;
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void d() {
        ViewParent viewParent = this.h;
        if (viewParent instanceof WebView) {
            ((WebView) viewParent).onResume();
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final View e() {
        return this.h;
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void pause() {
        ViewParent viewParent = this.h;
        if (viewParent instanceof WebView) {
            ((WebView) viewParent).onPause();
        }
    }

    public final void a(Context context, sg.bigo.ads.U.j jVar) {
        sg.bigo.ads.P.f a2;
        Ad ad = this.e;
        if (ad instanceof sg.bigo.ads.Q.d) {
            ((sg.bigo.ads.Q.d) ad).a();
        }
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) this.f;
        boolean z = false;
        if (bVar.u0.f12486a == 0 || !(this.e instanceof sg.bigo.ads.e.h)) {
            boolean a3 = bVar.a(16);
            Activity a4 = AbstractC4956m.a(this.h);
            Ad ad2 = this.e;
            sg.bigo.ads.P.c cVar = this.f;
            a2 = AbstractC5247a.a(context, a4, ad2, cVar, null, this.d, this.p, a3, ((sg.bigo.ads.U0.b) cVar).a(64));
            a2.m = 0;
        } else {
            Context context2 = this.h.getContext();
            Ad ad3 = this.e;
            D.a(context2, ad3 instanceof sg.bigo.ads.E.e ? (sg.bigo.ads.E.e) ad3 : ad3 instanceof sg.bigo.ads.E.f ? (sg.bigo.ads.E.f) ad3 : ad3 instanceof C5185l1 ? ((C5185l1) ad3).D() : (sg.bigo.ads.e.h) ad3);
            a2 = new sg.bigo.ads.P.f();
            a2.m = 1;
        }
        o oVar = this.c;
        if (oVar != null) {
            sg.bigo.ads.P.c cVar2 = this.f;
            Iterator it = oVar.f13215a.x.iterator();
            while (it.hasNext()) {
                oVar.e = true;
                oVar.a((n) it.next(), "va_cpn_cli", cVar2, 6, 13);
                it.remove();
                z = true;
            }
            if (!z) {
                o oVar2 = this.c;
                sg.bigo.ads.P.c cVar3 = this.f;
                if (!oVar2.e) {
                    Iterator it2 = oVar2.f13215a.j.iterator();
                    while (it2.hasNext()) {
                        oVar2.a((n) it2.next(), "va_cli", cVar3, 6, 13);
                        it2.remove();
                    }
                }
            }
        }
        sg.bigo.ads.k.e eVar = this.k;
        if (eVar != null) {
            eVar.a(jVar, a2);
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void a(int i) {
        o oVar = this.c;
        if (oVar != null) {
            oVar.a(oVar.f13215a.w, "va_cpn_imp");
        }
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final boolean a(Context context) {
        if (!this.f13005a || this.l || this.b.isEmpty()) {
            return false;
        }
        this.m = SystemClock.elapsedRealtime();
        C5230b c5230b = this.g;
        if (c5230b != null) {
            c5230b.f12977a.c.a(this.f, 6, 0L);
        }
        AbstractC5446j.b(new RunnableC5254h(this, this.b, null, 0, context));
        return true;
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void a() {
        WebView webView = this.i;
        if (webView != null) {
            webView.setOnTouchListener(null);
            this.i.destroy();
            this.i = null;
        }
        j jVar = this.h;
        if (jVar != null) {
            X.c(jVar);
            this.h = null;
        }
        this.l = true;
    }

    @Override // sg.bigo.ads.k.InterfaceC5257b
    public final void a(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        int i3;
        int i4;
        View view = this.j;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || (i3 = layoutParams.width) == -1 || (i4 = layoutParams.height) == 0 || i3 == 0) {
            return;
        }
        if (i > 0 && i2 > 0) {
            float f = i;
            float f2 = i4;
            float f3 = i3;
            float f4 = (f2 * f) / f3;
            float f5 = i2;
            if (f4 > f5) {
                f = (f3 * f5) / f2;
                f4 = f5;
            }
            i3 = (int) f;
            i4 = (int) f4;
        }
        layoutParams.width = i3;
        layoutParams.height = i4;
        this.j = null;
    }
}
