package sg.bigo.ads.w;

import android.app.Activity;
import android.view.View;
import android.webkit.ValueCallback;
import sg.bigo.ads.K0.E;
import sg.bigo.ads.R;
import sg.bigo.ads.h.C5149b2;

/* loaded from: classes3.dex */
public final class l extends C5149b2 implements b {
    public final InterfaceC5495a e0;
    public k f0;

    public l(Activity activity, InterfaceC5495a interfaceC5495a) {
        super(activity);
        this.e0 = interfaceC5495a;
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final boolean D0() {
        return false;
    }

    @Override // sg.bigo.ads.h.C5149b2, sg.bigo.ads.h.AbstractC5151c0
    public final int G() {
        int T = T();
        return (T == 1 || T == 2 || T == 3) ? R.layout.bigo_ad_activity_sub_interstitial_rich_video_1_3 : super.G();
    }

    @Override // sg.bigo.ads.h.C5149b2
    public final boolean K0() {
        return this.z.k == -2;
    }

    @Override // sg.bigo.ads.h.C5149b2, sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void R() {
        super.R();
        k kVar = this.f0;
        if (kVar == null || kVar.b()) {
            return;
        }
        this.f0.d();
    }

    @Override // sg.bigo.ads.h.C5149b2, sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0
    public final void S() {
        super.S();
        k kVar = this.f0;
        if (kVar == null || !kVar.b()) {
            return;
        }
        this.f0.e();
    }

    @Override // sg.bigo.ads.h.AbstractC5144a1
    public final ValueCallback U() {
        return this.e0.j();
    }

    @Override // sg.bigo.ads.w.b
    public final View b() {
        return null;
    }

    @Override // sg.bigo.ads.w.b
    public final void d(int i) {
        InterfaceC5495a interfaceC5495a = this.e0;
        if (interfaceC5495a != null) {
            interfaceC5495a.c(i);
        }
    }

    @Override // sg.bigo.ads.w.b
    public final boolean e() {
        return f(true);
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5151c0
    public final void f(int i) {
        super.f(i);
        if (this.z != null && this.m != null) {
            k kVar = new k(this, r6.c * 1000);
            this.f0 = kVar;
            kVar.e();
        }
        d(0);
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void i0() {
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final void j0() {
    }

    @Override // sg.bigo.ads.h.AbstractC5204s
    public final boolean o0() {
        return false;
    }

    @Override // sg.bigo.ads.h.C5149b2, sg.bigo.ads.h.AbstractC5204s
    public final void u0() {
        long j = this.z.k * 1000;
        if (j >= 0) {
            if (j == 0) {
                j = 500;
            }
            j jVar = new j(this, j);
            this.T = jVar;
            jVar.e();
        }
    }

    @Override // sg.bigo.ads.h.AbstractC5204s, sg.bigo.ads.h.AbstractC5144a1, sg.bigo.ads.h.AbstractC5151c0, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void w() {
        super.w();
        k kVar = this.f0;
        if (kVar != null) {
            kVar.a();
            this.f0 = null;
        }
        E e = this.T;
        if (e != null) {
            e.a();
            this.T = null;
        }
    }

    @Override // sg.bigo.ads.w.b
    public final void b(int i) {
        InterfaceC5495a interfaceC5495a = this.e0;
        if (interfaceC5495a != null) {
            interfaceC5495a.a(i, 2);
        }
    }
}
