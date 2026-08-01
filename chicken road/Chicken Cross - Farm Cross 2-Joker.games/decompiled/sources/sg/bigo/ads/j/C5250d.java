package sg.bigo.ads.j;

import android.os.SystemClock;
import android.webkit.JavascriptInterface;
import sg.bigo.ads.k.InterfaceC5258c;

/* renamed from: sg.bigo.ads.j.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5250d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5252f f12997a;

    public C5250d(C5252f c5252f) {
        this.f12997a = c5252f;
    }

    @JavascriptInterface
    public void gameEnd(String str) {
        InterfaceC5258c interfaceC5258c = this.f12997a.t;
        if (interfaceC5258c != null) {
            interfaceC5258c.e();
        }
    }

    @JavascriptInterface
    public String getPlayableJsonStr() {
        return ((sg.bigo.ads.U0.b) this.f12997a.g).s0;
    }

    @JavascriptInterface
    public void onBGNDomContentLoaded() {
        C5252f c5252f = this.f12997a;
        c5252f.q = true;
        InterfaceC5258c interfaceC5258c = c5252f.t;
        if (interfaceC5258c != null) {
            interfaceC5258c.c(c5252f.g, SystemClock.elapsedRealtime() - this.f12997a.i);
        }
    }

    @JavascriptInterface
    public void onBGNLoaded() {
        C5252f c5252f = this.f12997a;
        c5252f.p = true;
        InterfaceC5258c interfaceC5258c = c5252f.t;
        if (interfaceC5258c != null) {
            interfaceC5258c.b(c5252f.g, SystemClock.elapsedRealtime() - this.f12997a.i);
        }
    }

    @JavascriptInterface
    public void onGameStart() {
        C5252f c5252f = this.f12997a;
        InterfaceC5258c interfaceC5258c = c5252f.t;
        if (interfaceC5258c != null) {
            interfaceC5258c.c(c5252f.g);
        }
    }

    @JavascriptInterface
    public void onJsClick() {
        C5252f c5252f = this.f12997a;
        InterfaceC5258c interfaceC5258c = c5252f.t;
        if (interfaceC5258c != null) {
            interfaceC5258c.d(c5252f.g);
        }
    }

    @JavascriptInterface
    public void onJsImpression() {
        C5252f c5252f = this.f12997a;
        InterfaceC5258c interfaceC5258c = c5252f.t;
        if (interfaceC5258c != null) {
            interfaceC5258c.e(c5252f.g);
        }
    }

    @JavascriptInterface
    public void onJsStartLoad() {
        C5252f c5252f = this.f12997a;
        InterfaceC5258c interfaceC5258c = c5252f.t;
        if (interfaceC5258c != null) {
            interfaceC5258c.a(c5252f.g);
        }
    }
}
