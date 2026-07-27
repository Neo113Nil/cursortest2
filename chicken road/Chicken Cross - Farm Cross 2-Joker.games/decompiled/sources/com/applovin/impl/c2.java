package com.applovin.impl;

import android.app.Activity;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.impl.c1;
import com.applovin.impl.u7;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class c2 extends f2 {
    private final u7 n0;
    private final Set o0;

    class a implements c1.b {
        a() {
        }

        @Override // com.applovin.impl.c1.b
        public void a() {
            float duration = c2.this.P.getDuration() - c2.this.P.getCurrentPosition();
            c2 c2Var = c2.this;
            long j = (long) (c2Var.d0 - duration);
            int D = c2Var.D();
            HashSet hashSet = new HashSet();
            for (e8 e8Var : new HashSet(c2.this.o0)) {
                if (e8Var.a(j, D)) {
                    hashSet.add(e8Var);
                    c2.this.o0.remove(e8Var);
                }
            }
            c2.this.a(hashSet);
            if (D >= 25 && D < 50) {
                c2.this.n0.getAdEventTracker().x();
                return;
            }
            if (D >= 50 && D < 75) {
                c2.this.n0.getAdEventTracker().y();
            } else if (D >= 75) {
                c2.this.n0.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.c1.b
        public boolean b() {
            return !c2.this.g0;
        }
    }

    public c2(final com.applovin.impl.sdk.ad.b bVar, final Activity activity, Map map, final com.applovin.impl.sdk.l lVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, lVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.o0 = hashSet;
        u7 u7Var = (u7) bVar;
        this.n0 = u7Var;
        if (u7Var.r1()) {
            ImageView a2 = a8.a(u7Var.l1().e(), activity, lVar);
            this.W = a2;
            a2.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.c2$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c2.this.a(bVar, lVar, activity, view);
                }
            });
        }
        u7.d dVar = u7.d.VIDEO;
        hashSet.addAll(u7Var.a(dVar, f8.f4204a));
        a(u7.d.IMPRESSION);
        a(dVar, "creativeView");
        u7Var.getAdEventTracker().g();
    }

    private boolean W() {
        return this.W != null && this.n0.r1();
    }

    private void X() {
        if (!H() || this.o0.isEmpty()) {
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.k("AppLovinFullscreenActivity", "Firing " + this.o0.size() + " un-fired video progress trackers when video was completed.");
        }
        a(this.o0);
    }

    @Override // com.applovin.impl.f2
    protected float C() {
        u7 u7Var = this.n0;
        h8 p1 = u7Var.p1();
        float f = 0.0f;
        if (p1 == null || p1.d() <= 0) {
            float f2 = this.d0;
            if (f2 > 0.0f) {
                f = 0.0f + f2;
            }
        } else {
            f = 0.0f + p1.d();
        }
        if (!u7Var.W0()) {
            return f;
        }
        long s = u7Var.s();
        return s > 0 ? f + s : f;
    }

    @Override // com.applovin.impl.f2
    public void E() {
        a(u7.d.VIDEO, "skip");
        this.n0.getAdEventTracker().B();
        super.E();
    }

    @Override // com.applovin.impl.f2
    protected void F() {
        super.F();
        u7 u7Var = this.n0;
        if (u7Var != null) {
            u7Var.getAdEventTracker().i();
        }
    }

    @Override // com.applovin.impl.f2
    protected void R() {
        super.R();
        u7 u7Var = this.n0;
        if (u7Var != null) {
            u7Var.getAdEventTracker().j();
        }
    }

    @Override // com.applovin.impl.f2
    public void S() {
        X();
        if (!g8.a(this.n0)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            a("no_valid_companion_ad");
        } else {
            if (this.g0) {
                return;
            }
            a(u7.d.COMPANION, "creativeView");
            this.n0.getAdEventTracker().w();
            super.S();
        }
    }

    @Override // com.applovin.impl.f2
    public void V() {
        super.V();
        a(u7.d.VIDEO, this.c0 ? CampaignEx.JSON_NATIVE_VIDEO_MUTE : CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
        this.n0.getAdEventTracker().b(this.c0);
    }

    @Override // com.applovin.impl.f2
    public void g(String str) {
        a(u7.d.ERROR, z7.MEDIA_FILE_ERROR);
        this.n0.getAdEventTracker().b(str);
        super.g(str);
    }

    @Override // com.applovin.impl.y1
    public void s() {
        super.s();
        a(this.g0 ? u7.d.COMPANION : u7.d.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        this.n0.getAdEventTracker().z();
    }

    @Override // com.applovin.impl.y1
    public void t() {
        super.t();
        a(this.g0 ? u7.d.COMPANION : u7.d.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        this.n0.getAdEventTracker().A();
    }

    @Override // com.applovin.impl.f2, com.applovin.impl.y1
    public void v() {
        this.Z.c();
        super.v();
    }

    @Override // com.applovin.impl.f2, com.applovin.impl.y1
    public void w() {
        a((ViewGroup) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.l lVar, Activity activity, View view) {
        Uri c = this.n0.l1().c();
        if (c != null) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a("AppLovinFullscreenActivity", "Industry Icon clicked, opening URL: " + c);
            }
            a(u7.d.INDUSTRY_ICON_CLICK);
            if (bVar.isCustomTabsEnabled()) {
                lVar.A().a(c, b().getController(), activity);
            } else {
                q7.b(c, bVar, activity, lVar);
            }
        }
    }

    @Override // com.applovin.impl.f2, com.applovin.impl.y1
    public void a(String str) {
        if (this.n0 != null) {
            a(u7.d.VIDEO, "close");
            a(u7.d.COMPANION, "close");
        }
        super.a(str);
    }

    @Override // com.applovin.impl.f2, com.applovin.impl.y1
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        if (W()) {
            a(u7.d.INDUSTRY_ICON_IMPRESSION);
            this.W.setVisibility(0);
        }
        this.Z.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new a());
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            arrayList.add(new m4(aVar, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        com.applovin.impl.adview.g gVar = this.R;
        if (gVar != null) {
            arrayList.add(new m4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        k0 k0Var = this.S;
        if (k0Var != null) {
            arrayList.add(new m4(k0Var, FriendlyObstructionPurpose.OTHER, "countdown clock"));
        }
        ProgressBar progressBar = this.U;
        if (progressBar != null) {
            arrayList.add(new m4(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ProgressBar progressBar2 = this.V;
        if (progressBar2 != null) {
            arrayList.add(new m4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        ImageView imageView = this.T;
        if (imageView != null) {
            arrayList.add(new m4(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.j;
            arrayList.add(new m4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.n0.getAdEventTracker().b(this.P, arrayList);
    }

    @Override // com.applovin.impl.f2
    public void a(MotionEvent motionEvent) {
        a(u7.d.VIDEO_CLICK);
        this.n0.getAdEventTracker().v();
        super.a(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set set) {
        a(set, z7.UNSPECIFIED);
    }

    private void a(u7.d dVar) {
        a(dVar, z7.UNSPECIFIED);
    }

    private void a(u7.d dVar, String str) {
        a(dVar, str, z7.UNSPECIFIED);
    }

    private void a(u7.d dVar, z7 z7Var) {
        a(dVar, "", z7Var);
    }

    private void a(u7.d dVar, String str, z7 z7Var) {
        a(this.n0.a(dVar, str), z7Var);
    }

    private void a(Set set, z7 z7Var) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long currentPosition = (long) this.P.getCurrentPosition();
        i8 q1 = this.n0.q1();
        Uri d = q1 != null ? q1.d() : null;
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        g8.a(set, currentPosition, d, z7Var, this.b);
    }
}
