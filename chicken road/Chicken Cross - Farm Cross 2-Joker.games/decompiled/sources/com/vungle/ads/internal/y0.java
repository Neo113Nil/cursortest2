package com.vungle.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.BaseFullscreenAd$play$2;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.j3;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class y0 extends s {
    public WeakReference q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(Context context, BaseFullscreenAd$play$2 adPlayCallback) {
        com.vungle.ads.internal.util.s e;
        Long a2;
        Long a3;
        Intrinsics.checkNotNullParameter(adPlayCallback, "adPlayCallback");
        com.vungle.ads.internal.util.s e2 = e();
        if ((e2 != null && (a3 = e2.a()) != null && a3.longValue() == 3) || ((e = e()) != null && (a2 = e.a()) != null && a2.longValue() == 4)) {
            l();
        }
        g().e();
        this.q = context != null ? new WeakReference(context) : null;
        VungleError a4 = a(true);
        if (a4 != null) {
            adPlayCallback.onFailure(a4);
            if (a(a4.getCom.tiktok.appevents.edp.TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE java.lang.String())) {
                a(h.g);
                return;
            }
            return;
        }
        com.vungle.ads.internal.model.i0 c = c();
        j3 f = f();
        if (c == null || f == null) {
            adPlayCallback.onFailure(new AdNotLoadedCantPlay("Ad or Placement is null: pl=" + f + " adv=" + c).setLogEntry$vungle_ads_release(e()).logError$vungle_ads_release());
            return;
        }
        x0 x0Var = new x0(adPlayCallback, this);
        a();
        Handler handler = com.vungle.ads.internal.util.y.f12193a;
        com.vungle.ads.internal.util.y.a(new w0(this, x0Var, c, f));
    }

    @Override // com.vungle.ads.internal.s
    public final boolean a(VungleAdSize vungleAdSize) {
        return true;
    }

    @Override // com.vungle.ads.internal.s
    public final VungleAdSize b() {
        return null;
    }

    public com.vungle.ads.internal.presenter.z m() {
        return null;
    }

    public static final void a(y0 y0Var, x0 x0Var, com.vungle.ads.internal.model.i0 i0Var, j3 j3Var) {
        Context d;
        WeakReference weakReference = y0Var.q;
        if (weakReference == null || (d = (Context) weakReference.get()) == null) {
            d = y0Var.d();
        }
        Intrinsics.checkNotNullExpressionValue(d, "playContext?.get() ?: context");
        com.vungle.ads.internal.presenter.a aVar = new com.vungle.ads.internal.presenter.a(x0Var, j3Var);
        v0 v0Var = new v0(i0Var, j3Var, y0Var.m());
        v0 v0Var2 = com.vungle.ads.internal.ui.l.h;
        com.vungle.ads.internal.ui.a.a(v0Var);
        com.vungle.ads.internal.ui.a.a(aVar);
        Intent a2 = com.vungle.ads.internal.ui.a.a(d, j3Var.b(), i0Var.h());
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        if (!com.vungle.ads.internal.util.a.a()) {
            boolean z = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.a("FullscreenAdInternal", "The ad activity is in background on play, log AD_VISIBILITY_INVISIBLE.");
            a2.putExtra("ad_invisible_logged", true);
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            k2 k2Var = new k2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
            k2Var.a((Long) 1L);
            AnalyticsClient.a(analyticsClient, k2Var, y0Var.e(), 4);
        }
        y0Var.g().d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, y0Var.g(), y0Var.e());
        y0Var.h().e();
        com.vungle.ads.internal.util.a.a(d, null, a2, null);
    }
}
