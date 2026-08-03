package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public class InneractiveFullscreenUnitController extends com.fyber.inneractive.sdk.flow.s0 implements com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider, com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener {
    public com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener b;
    protected com.fyber.inneractive.sdk.interfaces.f mRenderer;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3652a = false;
    public final com.fyber.inneractive.sdk.external.g c = new com.fyber.inneractive.sdk.external.g(this);

    public static class AdExpiredError extends com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError {
        public AdExpiredError() {
            super("Ad Expired");
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        com.fyber.inneractive.sdk.interfaces.f fVar = this.mRenderer;
        if (fVar != null) {
            fVar.destroy();
            this.mRenderer = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider
    public com.fyber.inneractive.sdk.interfaces.f getFullscreenRenderer() {
        return this.mRenderer;
    }

    public com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener getRewardedListener() {
        return this.b;
    }

    public boolean isAvailable() {
        com.fyber.inneractive.sdk.flow.i0 i0Var = (com.fyber.inneractive.sdk.flow.i0) com.fyber.inneractive.sdk.util.v.a(this.mAdSpot);
        return i0Var != null && i0Var.isReady();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener
    public void onActivityDestroyed(com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f3652a = false;
    }

    public void setRewardedListener(com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener) {
        this.b = inneractiveFullScreenAdRewardedListener;
    }

    public void show(android.app.Activity activity) {
        if (activity == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("show() called with a null activity", new java.lang.Object[0]);
            return;
        }
        if (this.f3652a) {
            com.fyber.inneractive.sdk.util.IAlog.f("InneractiveFullscreenUnitController->show(android.content.Context) called while an ad is already showing", new java.lang.Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot = getAdSpot();
        if (adSpot == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("InneractiveFullscreenUnitController was not attached to an ad spot", new java.lang.Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.flow.x adContent = adSpot.getAdContent();
        com.fyber.inneractive.sdk.interfaces.f fVar = null;
        if (adContent != null) {
            com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.IA_PUBLISHER_REQUESTED_SHOW;
            com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = adContent.f3765a;
            com.fyber.inneractive.sdk.response.e eVar = adContent.b;
            org.json.JSONArray b = adContent.c.b();
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
            wVar.c = uVar;
            wVar.f3860a = inneractiveAdRequest;
            wVar.d = b;
            wVar.a((java.lang.String) null);
        }
        if (!adSpot.isReady()) {
            com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener eventsListener = this.mEventsListener;
            if (eventsListener != null) {
                ((com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener) eventsListener).onAdEnteredErrorState(adSpot, new com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController.AdExpiredError());
                return;
            }
            return;
        }
        if (this.mRenderer == null) {
            com.fyber.inneractive.sdk.factories.i iVar = com.fyber.inneractive.sdk.factories.h.f3669a;
            com.fyber.inneractive.sdk.external.InneractiveAdSpot adSpot2 = getAdSpot();
            java.util.Iterator it = iVar.f3670a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.fyber.inneractive.sdk.factories.g gVar = (com.fyber.inneractive.sdk.factories.g) it.next();
                if (gVar.a(adSpot2)) {
                    fVar = gVar.b(adSpot2);
                    break;
                }
            }
            this.mRenderer = fVar;
        }
        selectContentController();
        adSpot.getLocalUniqueId();
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.class);
        intent.putExtra("spotId", adSpot.getLocalUniqueId());
        try {
            com.fyber.inneractive.sdk.util.IAlog.a("%sIAInterstitialUtil: Opening interstitial for spot id: %s", com.fyber.inneractive.sdk.util.IAlog.a(activity), adSpot.getLocalUniqueId());
            activity.startActivity(intent);
        } catch (android.content.ActivityNotFoundException unused) {
            com.fyber.inneractive.sdk.util.IAlog.c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", com.fyber.inneractive.sdk.util.IAlog.a(activity));
        }
        this.f3652a = true;
        com.fyber.inneractive.sdk.interfaces.f fVar2 = this.mRenderer;
        if (fVar2 != null) {
            fVar2.a(this.c);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supports(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.inneractive.sdk.config.s0 s0Var = inneractiveAdSpot.getAdContent().d;
        if (s0Var != null) {
            com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) s0Var;
            if (r0Var.e == null) {
                com.fyber.inneractive.sdk.config.l0 l0Var = r0Var.c;
                if (l0Var != null && com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL.equals(l0Var.b)) {
                    return true;
                }
                com.fyber.inneractive.sdk.config.t0 t0Var = r0Var.f;
                return t0Var != null && (com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED.equals(t0Var.j) || com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL.equals(t0Var.j) || com.fyber.inneractive.sdk.config.enums.UnitDisplayType.VERTICAL.equals(t0Var.j));
            }
        }
        com.fyber.inneractive.sdk.util.IAlog.f("%s : supports() called with unit config null", com.fyber.inneractive.sdk.util.IAlog.a(this));
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supportsRefresh() {
        return false;
    }
}
