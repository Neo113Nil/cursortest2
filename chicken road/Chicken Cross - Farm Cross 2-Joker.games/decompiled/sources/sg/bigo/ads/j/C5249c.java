package sg.bigo.ads.j;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import sg.bigo.ads.f.AbstractC5098c;
import sg.bigo.ads.f.z;
import sg.bigo.ads.k.InterfaceC5258c;
import sg.bigo.ads.k1.InterfaceC5279u;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.j.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5249c implements InterfaceC5279u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12996a;
    public final /* synthetic */ C5252f b;

    public C5249c(C5252f c5252f, Context context) {
        this.b = c5252f;
        this.f12996a = context;
    }

    @Override // sg.bigo.ads.k1.InterfaceC5279u
    public final void a() {
        z zVar = this.b.l;
        if (zVar != null) {
            zVar.a();
        }
    }

    @Override // sg.bigo.ads.k1.InterfaceC5279u
    public final boolean b(Activity activity, int i) {
        Activity activity2;
        C5251e c5251e = this.b.s;
        c5251e.b = i;
        WeakReference weakReference = new WeakReference(activity);
        c5251e.c = weakReference;
        if (c5251e.f12998a) {
            int i2 = c5251e.b;
            c5251e.b = -1;
            if ((i2 == 0 || i2 == 1) && (activity2 = (Activity) weakReference.get()) != null) {
                activity2.setRequestedOrientation(i2);
            }
        }
        return true;
    }

    @Override // sg.bigo.ads.k1.InterfaceC5279u
    public final void c() {
        C5252f c5252f = this.b;
        c5252f.h = true;
        c5252f.k = sg.bigo.ads.m1.f.f13126a.a(c5252f.n, new View[0]);
        this.b.getClass();
        AbstractC5098c.a(this.b, 1);
        InterfaceC5258c interfaceC5258c = this.b.t;
        if (interfaceC5258c != null) {
            interfaceC5258c.c();
        }
    }

    @Override // sg.bigo.ads.k1.InterfaceC5279u
    public final void d() {
        this.b.getClass();
        C5252f c5252f = this.b;
        c5252f.r = true;
        AbstractC5098c.a(c5252f, 2);
        C5252f c5252f2 = this.b;
        InterfaceC5258c interfaceC5258c = c5252f2.t;
        if (interfaceC5258c != null) {
            interfaceC5258c.a(c5252f2.g, SystemClock.elapsedRealtime() - this.b.i);
        }
    }

    @Override // sg.bigo.ads.k1.InterfaceC5279u
    public final void e() {
        AbstractC5496a.a("HtmlVastCompanion", "onRenderProcessGone");
    }

    @Override // sg.bigo.ads.k1.InterfaceC5279u
    public final void a(String str, sg.bigo.ads.U.j jVar) {
        this.b.a(this.f12996a, str, jVar);
    }

    @Override // sg.bigo.ads.k1.InterfaceC5279u
    public final void a(WebView webView, int i) {
        C5252f c5252f = this.b;
        c5252f.j = i;
        InterfaceC5258c interfaceC5258c = c5252f.t;
        if (interfaceC5258c != null) {
            interfaceC5258c.a(webView, i);
        }
    }

    @Override // sg.bigo.ads.k1.InterfaceC5279u
    public final void b() {
        z zVar = this.b.l;
        if (zVar != null) {
            zVar.a();
        }
    }

    @Override // sg.bigo.ads.k1.InterfaceC5279u
    public final boolean a(Activity activity, int i) {
        Activity activity2;
        C5251e c5251e = this.b.s;
        c5251e.b = i;
        WeakReference weakReference = new WeakReference(activity);
        c5251e.c = weakReference;
        if (c5251e.f12998a) {
            int i2 = c5251e.b;
            c5251e.b = -1;
            if ((i2 == 0 || i2 == 1) && (activity2 = (Activity) weakReference.get()) != null) {
                activity2.setRequestedOrientation(i2);
            }
        }
        return true;
    }
}
