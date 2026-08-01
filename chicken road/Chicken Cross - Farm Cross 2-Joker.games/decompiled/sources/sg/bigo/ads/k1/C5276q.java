package sg.bigo.ads.k1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebView;
import sg.bigo.ads.core.mraid.MraidVideoActivity;

/* renamed from: sg.bigo.ads.k1.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5276q implements InterfaceC5267h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f13041a;

    public C5276q(A a2) {
        this.f13041a = a2;
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void a(WebView webView, int i) {
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void a(String str, boolean z) {
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void a(C5261b c5261b) {
        this.f13041a.k.a(c5261b);
        this.f13041a.l.a(c5261b);
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void b(String str) {
        Context context = this.f13041a.b;
        int i = MraidVideoActivity.c;
        Intent intent = new Intent();
        intent.setClass(context, MraidVideoActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("INTENT_VIDEO_URL", str);
        context.startActivity(intent);
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void c() {
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void d() {
        A a2 = this.f13041a;
        a2.getClass();
        a2.a(new r(a2));
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void b() {
        InterfaceC5279u interfaceC5279u;
        A a2 = this.f13041a;
        if (a2.x != 2 || (interfaceC5279u = a2.h) == null) {
            return;
        }
        interfaceC5279u.b();
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void a() {
        this.f13041a.b();
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final boolean a(ConsoleMessage consoleMessage) {
        this.f13041a.getClass();
        return true;
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void b(boolean z) {
        this.f13041a.a(z);
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final boolean a(String str, JsResult jsResult) {
        this.f13041a.getClass();
        jsResult.confirm();
        return true;
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void a(String str, sg.bigo.ads.U.j jVar) {
        this.f13041a.a(str, jVar);
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void a(String str) {
        InterfaceC5279u interfaceC5279u = this.f13041a.h;
        if (interfaceC5279u != null) {
            interfaceC5279u.e();
        }
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void a(int i, int i2, int i3, int i4, sg.bigo.ads.l1.a aVar, boolean z) {
        throw new C5272m("Not allowed to resize from an expanded state");
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void a(int i, boolean z) {
        A a2 = this.f13041a;
        if (!a2.c(i)) {
            throw new C5272m("Unable to force orientation to ".concat(P.c(i)));
        }
        a2.q = z;
        a2.z = i;
        if (a2.y == 4 || (a2.x == 2 && !a2.s)) {
            if (i != 3) {
                a2.a(P.a(i));
                return;
            }
            if (z) {
                a2.f();
                return;
            }
            Activity activity = (Activity) a2.f13013a.get();
            if (activity == null) {
                throw new C5272m("Unable to set MRAID expand orientation to 'none'; expected passed in Activity Context.");
            }
            a2.a(sg.bigo.ads.I0.f.a(activity));
        }
    }

    @Override // sg.bigo.ads.k1.InterfaceC5267h
    public final void a(boolean z) {
        C5271l c5271l = this.f13041a.k;
        c5271l.getClass();
        c5271l.a("mraidbridge.setIsViewable(" + z + ")");
        C5271l c5271l2 = this.f13041a.l;
        c5271l2.getClass();
        c5271l2.a("mraidbridge.setIsViewable(" + z + ")");
    }
}
