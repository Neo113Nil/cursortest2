package sg.bigo.ads.l;

import sg.bigo.ads.C.l;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.h.H2;
import sg.bigo.ads.h.Q1;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.l.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5289e {

    /* renamed from: a, reason: collision with root package name */
    public l f13052a;
    public Q1 b;
    public C5287c f;
    public InterfaceC5288d g;
    public long h;
    public boolean d = false;
    public boolean e = false;
    public boolean i = true;
    public int c = 1;

    public static void a(C5289e c5289e) {
        InterfaceC5288d interfaceC5288d;
        if (c5289e.a()) {
            if (!c5289e.e) {
                l lVar = c5289e.f13052a;
                VideoController videoController = lVar != null ? lVar.getVideoController() : null;
                if (videoController == null || videoController.isPlaying()) {
                    return;
                }
                videoController.play();
                return;
            }
            interfaceC5288d = c5289e.g;
            if (interfaceC5288d == null) {
                return;
            }
        } else if (!c5289e.d) {
            AbstractC5496a.a("CountdownHelper", "invalid status, isCountdownIgnoreVideoProgress=" + c5289e.a() + ", mVideoEnd=" + c5289e.d);
            return;
        } else {
            interfaceC5288d = c5289e.g;
            if (interfaceC5288d == null) {
                return;
            }
        }
        interfaceC5288d.a(c5289e.a(), c5289e.d);
    }

    public final void b(boolean z) {
        AdCountDownButton adCountDownButton;
        if (z && !a()) {
            InterfaceC5288d interfaceC5288d = this.g;
            if (interfaceC5288d == null || (adCountDownButton = ((H2) interfaceC5288d).g) == null || adCountDownButton.c) {
                return;
            }
        } else {
            if (z || !a()) {
                return;
            }
            C5287c c5287c = this.f;
            if (c5287c != null && c5287c.b()) {
                this.f.e();
            }
            InterfaceC5288d interfaceC5288d2 = this.g;
            if (interfaceC5288d2 == null || (adCountDownButton = ((H2) interfaceC5288d2).g) == null || adCountDownButton.c) {
                return;
            }
        }
        adCountDownButton.b();
    }

    public final void a(boolean z) {
        AdCountDownButton adCountDownButton;
        if (z && !a()) {
            InterfaceC5288d interfaceC5288d = this.g;
            if (interfaceC5288d == null || (adCountDownButton = ((H2) interfaceC5288d).g) == null || adCountDownButton.c) {
                return;
            }
        } else {
            if (z || !a()) {
                return;
            }
            C5287c c5287c = this.f;
            if (c5287c != null) {
                c5287c.d();
            }
            InterfaceC5288d interfaceC5288d2 = this.g;
            if (interfaceC5288d2 == null || (adCountDownButton = ((H2) interfaceC5288d2).g) == null || adCountDownButton.c) {
                return;
            }
        }
        adCountDownButton.a();
    }

    public final boolean a() {
        return this.c == 2;
    }
}
