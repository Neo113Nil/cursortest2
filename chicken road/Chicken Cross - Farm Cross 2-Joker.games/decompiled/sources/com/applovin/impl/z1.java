package com.applovin.impl;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.i6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.y1;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public class z1 extends y1 {
    private final a2 N;
    private i0 O;
    private long P;
    private final AtomicBoolean Q;

    public z1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.l lVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.N = new a2(this.f4559a, this.d, this.b);
        this.Q = new AtomicBoolean();
    }

    private long C() {
        com.applovin.impl.sdk.ad.b bVar = this.f4559a;
        if (!(bVar instanceof com.applovin.impl.sdk.ad.a)) {
            return 0L;
        }
        float k1 = ((com.applovin.impl.sdk.ad.a) bVar).k1();
        if (k1 <= 0.0f) {
            k1 = this.f4559a.s();
        }
        return (long) (t7.c(k1) * (this.f4559a.z() / 100.0d));
    }

    private int D() {
        i0 i0Var;
        int i = 100;
        if (h()) {
            if (((Boolean) this.b.a(c5.m1)).booleanValue() && !this.f4559a.hasShown()) {
                return 0;
            }
            if (!E() && (i0Var = this.O) != null) {
                i = (int) Math.min(100.0d, ((this.P - i0Var.b()) / this.P) * 100.0d);
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a("AppLovinFullscreenActivity", "Ad engaged at " + i + "%");
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        y1.a(this.f4559a, this.F, this.G, this.H, null, this.b, this.d, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.Q.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        this.r = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.k;
        if (gVar != null) {
            arrayList.add(new m4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.j;
            arrayList.add(new m4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f4559a.getAdEventTracker().b(b(), arrayList);
    }

    @Override // com.applovin.impl.y1
    protected void A() {
        this.N.a(this.l);
        this.r = SystemClock.elapsedRealtime();
        this.Q.set(true);
    }

    protected boolean E() {
        if (!(this.K && this.f4559a.a1()) && h()) {
            return this.Q.get();
        }
        return true;
    }

    protected void J() {
        long R;
        long j = 0;
        if (this.f4559a.Q() >= 0 || this.f4559a.R() >= 0) {
            if (this.f4559a.Q() >= 0) {
                R = this.f4559a.Q();
            } else {
                if (this.f4559a.W0()) {
                    int k1 = (int) ((com.applovin.impl.sdk.ad.a) this.f4559a).k1();
                    if (k1 > 0) {
                        j = TimeUnit.SECONDS.toMillis(k1);
                    } else {
                        int s = (int) this.f4559a.s();
                        if (s > 0) {
                            j = TimeUnit.SECONDS.toMillis(s);
                        }
                    }
                }
                R = (long) (j * (this.f4559a.R() / 100.0d));
            }
            c(R);
        }
    }

    @Override // com.applovin.impl.y1
    public void a(ViewGroup viewGroup) {
        this.N.a(this.k, this.j, b(), viewGroup);
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null) {
            kVar.b();
        }
        b().renderAd(this.f4559a);
        a("javascript:al_onPoststitialShow();", this.f4559a.y());
        if (h()) {
            long C = C();
            this.P = C;
            if (C > 0) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.a("AppLovinFullscreenActivity", "Scheduling timer for ad fully watched in " + this.P + "ms...");
                }
                this.O = i0.a(this.P, this.b, new Runnable() { // from class: com.applovin.impl.z1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        z1.this.G();
                    }
                });
            }
        }
        if (this.k != null) {
            if (this.f4559a.s() >= 0) {
                a(this.k, this.f4559a.s(), new Runnable() { // from class: com.applovin.impl.z1$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        z1.this.H();
                    }
                });
            } else {
                this.k.setVisibility(0);
            }
        }
        J();
        this.b.s0().a(new x6(this.b, "updateMainViewOM", new Runnable() { // from class: com.applovin.impl.z1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                z1.this.I();
            }
        }), i6.b.OTHER, TimeUnit.SECONDS.toMillis(1L));
        p();
        super.b(t7.e(this.b));
    }

    @Override // com.applovin.impl.y1
    public void b(long j) {
    }

    @Override // com.applovin.impl.y1
    public void e() {
        super.e();
        A();
    }

    @Override // com.applovin.impl.y1
    public void f() {
        super.f();
        int D = this.f4559a.D();
        if (D <= 0 || !(this.d instanceof AppLovinFullscreenActivity)) {
            A();
            return;
        }
        if (this.f4559a.U() >= D) {
            A();
            return;
        }
        d(true);
        this.f4559a.F0();
        this.f4559a.setHasShown(false);
        a("attempting_reshow_from_render_process_gone");
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.z1$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                z1.this.F();
            }
        }, this.f4559a.h());
    }

    @Override // com.applovin.impl.y1
    protected void m() {
        super.a(D(), false, E(), -2L);
    }

    @Override // com.applovin.impl.y1
    public void v() {
    }

    @Override // com.applovin.impl.y1
    public void w() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.y1
    protected void x() {
        super.x();
        this.Q.set(true);
    }

    class a implements y1.g {
        a() {
        }

        @Override // com.applovin.impl.y1.g
        public void a(y1 y1Var) {
            ((AppLovinFullscreenActivity) z1.this.d).setPresenter(y1Var);
            z1.this.r();
            y1Var.w();
        }

        @Override // com.applovin.impl.y1.g
        public void a(String str, Throwable th) {
            HashMap<String, String> hashMap = CollectionUtils.hashMap("source", "recreateFullscreenAdPresenterAfterRenderProcessGone");
            CollectionUtils.putStringIfValid("error_message", str, hashMap);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), hashMap);
            z1.this.b.g().a(h2.I, z1.this.f4559a, hashMap);
            z1.this.d(false);
            z1.this.d.finish();
        }
    }

    @Override // com.applovin.impl.y1
    public void a(String str) {
        if (!((Boolean) this.b.a(c5.W6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.f4559a;
            if (bVar != null) {
                bVar.a(str);
            }
            m();
        }
        i0 i0Var = this.O;
        if (i0Var != null) {
            i0Var.a();
            this.O = null;
        }
        super.a(str);
    }
}
