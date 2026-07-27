package com.fyber.inneractive.sdk.renderers;

import android.view.View;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.c1;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.q0;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.config.x0;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.p0;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.player.controller.g0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;

/* loaded from: classes4.dex */
public final class s extends p0 implements g0 {
    public boolean x = false;

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean I() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int K() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int L() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long M() {
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean N() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long a(long j) {
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(int i, boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.external.f fVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(boolean z, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final /* bridge */ /* synthetic */ boolean b(com.fyber.inneractive.sdk.flow.x xVar) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void c() {
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        if (!this.x) {
            k();
        }
        this.b = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void e() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void g() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void h() {
        a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void i() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void j() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void k() {
        this.x = true;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar != null) {
        }
        IAlog.a("%sunit controller is null!", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void m() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onPlayerError() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onProgress(int i, int i2) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void r() {
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.ui.controller.c
    public final void t() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final boolean u() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void f() {
        IAlog.a("%snShownCloseButton", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var, boolean z) {
        return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new Exception("No Companion clicked"));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.util.d0 a(g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        x0 x0Var;
        q0 q0Var;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar != null && (x0Var = ((t0) xVar).d) != null && (q0Var = ((w0) x0Var).c) != null) {
            UnitDisplayType unitDisplayType = q0Var.b;
            c1 c1Var = IAConfigManager.R.x;
            com.fyber.inneractive.sdk.cache.session.enums.c cVar = unitDisplayType == UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_VIDEO : com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_VIDEO;
            com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.CLICK;
            com.fyber.inneractive.sdk.cache.session.e eVar = c1Var.f5237a;
            if (eVar != null) {
                com.fyber.inneractive.sdk.util.r.f5965a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar, aVar, cVar));
            }
        }
        throw null;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(String str, String str2) {
        IAlog.a(IAlog.a(this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(View view, String str) {
        if (view == null || view.getContext() == null) {
            return;
        }
        InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
        c(view);
        c(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(View view) {
        c(view);
        c(false);
    }
}
