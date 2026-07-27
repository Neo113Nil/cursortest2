package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import com.chartboost.sdk.impl.c0;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w2 implements s9, aa, t9, ka {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s9 f5051a;
    public final /* synthetic */ aa b;
    public final /* synthetic */ t9 c;
    public final /* synthetic */ ka d;
    public final y9 e;
    public ga f;

    public w2(y9 impressionDependency, s9 impressionClick, aa impressionDismiss, t9 impressionComplete, ka impressionView) {
        Intrinsics.checkNotNullParameter(impressionDependency, "impressionDependency");
        Intrinsics.checkNotNullParameter(impressionClick, "impressionClick");
        Intrinsics.checkNotNullParameter(impressionDismiss, "impressionDismiss");
        Intrinsics.checkNotNullParameter(impressionComplete, "impressionComplete");
        Intrinsics.checkNotNullParameter(impressionView, "impressionView");
        this.f5051a = impressionClick;
        this.b = impressionDismiss;
        this.c = impressionComplete;
        this.d = impressionView;
        this.e = impressionDependency;
        this.f = ga.c;
    }

    public final void A() {
        if (g() && Intrinsics.areEqual(this.e.a(), c0.c.g)) {
            z();
        }
    }

    public final void B() {
        if (this.e.l().b() <= 1) {
            K();
            x9 l = this.e.l();
            l.b(l.b() + 1);
        }
    }

    public final boolean C() {
        if (this.e.r().u() == null) {
            return true;
        }
        qk u = this.e.r().u();
        return (u != null ? u.getRootView() : null) == null;
    }

    public final void D() {
        try {
            if (this.e.r() instanceof jk) {
                ((jk) this.e.r()).I();
            } else {
                this.e.r().v();
                this.e.r().a(uj.l);
            }
        } catch (Exception e) {
            mb.b("Invalid mute video command", e);
        }
    }

    public final void E() {
        a(this.e.n(), Float.valueOf(this.e.r().t()), Float.valueOf(this.e.r().s()));
        d();
    }

    public final void F() {
        if (this.e.l().c() <= 1) {
            B();
            x9 l = this.e.l();
            l.c(l.c() + 1);
        }
    }

    public final void G() {
        if (this.f != ga.e || g()) {
            return;
        }
        l();
        b(true);
    }

    public final void H() {
        try {
            m3 r = this.e.r();
            Intrinsics.checkNotNull(r, "null cannot be cast to non-null type com.chartboost.sdk.internal.video.VideoProtocol");
            ((jk) r).L();
        } catch (Exception e) {
            mb.b("Invalid pause video command", e);
        }
    }

    public final void I() {
        try {
            m3 r = this.e.r();
            Intrinsics.checkNotNull(r, "null cannot be cast to non-null type com.chartboost.sdk.internal.video.VideoProtocol");
            ((jk) r).M();
        } catch (Exception e) {
            mb.b("Invalid play video command", e);
        }
    }

    public final void J() {
        this.f = ga.c;
        CBError.Impression A = this.e.r().A();
        if (A == null) {
            e();
        } else {
            b(A);
        }
    }

    public final void K() {
        b(this.e.n(), Float.valueOf(this.e.r().t()), Float.valueOf(this.e.r().s()));
    }

    public final boolean L() {
        return this.e.a().c();
    }

    public final void M() {
        if (this.e.l().d() <= 1) {
            z();
            B();
            x9 l = this.e.l();
            l.d(l.d() + 1);
        }
    }

    public final void N() {
        try {
            if (this.e.r() instanceof jk) {
                ((jk) this.e.r()).O();
            } else {
                this.e.r().D();
                this.e.r().a(uj.l);
            }
        } catch (Exception e) {
            mb.b("Invalid unmute video command", e);
        }
    }

    public final void O() {
        this.e.r().w();
    }

    public final void P() {
        this.e.r().f();
    }

    @Override // com.chartboost.sdk.impl.s9
    public void a(String str, CBError.Click error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f5051a.a(str, error);
    }

    @Override // com.chartboost.sdk.impl.aa
    public void b() {
        this.b.b();
    }

    @Override // com.chartboost.sdk.impl.s9
    public void c(k3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        this.f5051a.c(cbUrl);
    }

    @Override // com.chartboost.sdk.impl.s9
    public void d() {
        this.f5051a.d();
    }

    @Override // com.chartboost.sdk.impl.ka
    public void e() {
        this.d.e();
    }

    @Override // com.chartboost.sdk.impl.ka
    public ViewGroup f() {
        return this.d.f();
    }

    @Override // com.chartboost.sdk.impl.ka
    public boolean g() {
        return this.d.g();
    }

    @Override // com.chartboost.sdk.impl.ka
    public void h() {
        this.d.h();
    }

    @Override // com.chartboost.sdk.impl.ka
    public boolean i() {
        return this.d.i();
    }

    @Override // com.chartboost.sdk.impl.ka
    public boolean j() {
        return this.d.j();
    }

    @Override // com.chartboost.sdk.impl.ka
    public boolean k() {
        return this.d.k();
    }

    @Override // com.chartboost.sdk.impl.ka
    public void l() {
        this.d.l();
    }

    public final void m() {
        a(this.f);
    }

    public final void n() {
        try {
            m3 r = this.e.r();
            Intrinsics.checkNotNull(r, "null cannot be cast to non-null type com.chartboost.sdk.internal.video.VideoProtocol");
            ((jk) r).E();
        } catch (Exception e) {
            mb.b("Invalid close video command", e);
        }
    }

    public final String o() {
        return this.e.b().m();
    }

    @Override // com.chartboost.sdk.impl.ka
    public void onResume() {
        this.d.onResume();
    }

    @Override // com.chartboost.sdk.impl.ka
    public void onStart() {
        this.d.onStart();
    }

    public final String p() {
        return this.e.b().t();
    }

    public ga q() {
        return this.f;
    }

    public final String r() {
        return this.e.n();
    }

    public final String s() {
        return this.e.r().i();
    }

    public final String t() {
        return this.e.r().k();
    }

    public final String u() {
        return this.e.r().m();
    }

    public final String v() {
        return this.e.r().o();
    }

    public final String w() {
        return this.e.r().p();
    }

    public final int x() {
        if (this.e.r() instanceof jk) {
            return ((jk) this.e.r()).G();
        }
        return -1;
    }

    public final qk y() {
        return this.e.r().u();
    }

    public final void z() {
        if (this.e.l().a() <= 1) {
            a();
            x9 l = this.e.l();
            l.a(l.a() + 1);
        }
    }

    @Override // com.chartboost.sdk.impl.ka
    public void a(ga state, CBImpressionActivity activity) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.d.a(state, activity);
    }

    @Override // com.chartboost.sdk.impl.s9
    public void b(k3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        this.f5051a.b(cbUrl);
    }

    @Override // com.chartboost.sdk.impl.ka
    public void c() {
        this.d.c();
    }

    @Override // com.chartboost.sdk.impl.aa
    public void d(boolean z) {
        this.b.d(z);
    }

    @Override // com.chartboost.sdk.impl.ka
    public void e(boolean z) {
        this.d.e(z);
    }

    @Override // com.chartboost.sdk.impl.ka
    public void f(boolean z) {
        this.d.f(z);
    }

    @Override // com.chartboost.sdk.impl.ka
    public void a(ViewGroup viewGroup) {
        this.d.a(viewGroup);
    }

    @Override // com.chartboost.sdk.impl.t9
    public void b(String location, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.c.b(location, f, f2);
    }

    @Override // com.chartboost.sdk.impl.s9
    public void c(boolean z) {
        this.f5051a.c(z);
    }

    public final void d(k3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        a(cbUrl.b(), cbUrl.a(), this.f);
    }

    @Override // com.chartboost.sdk.impl.t9
    public void a() {
        this.c.a();
    }

    @Override // com.chartboost.sdk.impl.ka
    public void b(boolean z) {
        this.d.b(z);
    }

    @Override // com.chartboost.sdk.impl.s9
    public boolean a(String urlFromCreative, Boolean bool, ga impressionState) {
        Intrinsics.checkNotNullParameter(urlFromCreative, "urlFromCreative");
        Intrinsics.checkNotNullParameter(impressionState, "impressionState");
        return this.f5051a.a(urlFromCreative, bool, impressionState);
    }

    public void b(ga newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.f = newState;
    }

    @Override // com.chartboost.sdk.impl.aa
    public void a(ga state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.b.a(state);
    }

    public final void b(CBError.Impression error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (g()) {
            this.e.c().j();
        } else {
            a(error);
        }
    }

    @Override // com.chartboost.sdk.impl.ka
    public void a(CBError.Impression error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.d.a(error);
    }

    @Override // com.chartboost.sdk.impl.s9
    public void a(k3 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        this.f5051a.a(cbUrl);
    }

    @Override // com.chartboost.sdk.impl.ka
    public void a(boolean z) {
        this.d.a(z);
    }

    @Override // com.chartboost.sdk.impl.s9
    public void a(String location, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f5051a.a(location, f, f2);
    }

    public final void a(String event) {
        List list;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.length() <= 0 || (list = (List) this.e.b().l().get(event)) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.e.r().d((String) it.next());
        }
    }

    public final void b(float f) {
        this.e.r().b(f);
    }

    public final void a(boolean z, String forceOrientation) {
        Intrinsics.checkNotNullParameter(forceOrientation, "forceOrientation");
        this.e.r().a(z, forceOrientation);
    }

    public final void a(List verificationScriptResourceList, Integer num) {
        Intrinsics.checkNotNullParameter(verificationScriptResourceList, "verificationScriptResourceList");
        this.e.r().a(verificationScriptResourceList, num);
    }

    public final void a(float f, float f2) {
        this.e.r().a(f, f2);
    }

    public final void a(float f) {
        this.e.r().a(f);
    }

    public final void a(re playerState) {
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        this.e.r().a(playerState);
    }

    public final void a(uj vastVideoEvent) {
        Intrinsics.checkNotNullParameter(vastVideoEvent, "vastVideoEvent");
        this.e.r().a(vastVideoEvent);
    }
}
