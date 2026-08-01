package com.fyber.inneractive.sdk.external;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.q0;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.config.x0;
import com.fyber.inneractive.sdk.config.y0;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.factories.h;
import com.fyber.inneractive.sdk.factories.i;
import com.fyber.inneractive.sdk.flow.i0;
import com.fyber.inneractive.sdk.flow.s0;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class InneractiveFullscreenUnitController extends s0 implements InneractiveFullscreenAdActivity.FullScreenRendererProvider, InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener {
    public InneractiveFullScreenAdRewardedListener b;
    protected com.fyber.inneractive.sdk.interfaces.f mRenderer;

    /* renamed from: a, reason: collision with root package name */
    public boolean f5305a = false;
    public final f c = new f(this);

    public static class AdExpiredError extends InneractiveUnitController.AdDisplayError {
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

    public InneractiveFullScreenAdRewardedListener getRewardedListener() {
        return this.b;
    }

    public boolean isAvailable() {
        i0 i0Var = (i0) v.a(this.mAdSpot);
        return i0Var != null && i0Var.isReady();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener
    public void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f5305a = false;
    }

    public void setRewardedListener(InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener) {
        this.b = inneractiveFullScreenAdRewardedListener;
    }

    public void show(Activity activity) {
        if (activity == null) {
            IAlog.f("show() called with a null activity", new Object[0]);
            return;
        }
        if (this.f5305a) {
            IAlog.f("InneractiveFullscreenUnitController->show(android.content.Context) called while an ad is already showing", new Object[0]);
            return;
        }
        InneractiveAdSpot adSpot = getAdSpot();
        if (adSpot == null) {
            IAlog.f("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
            return;
        }
        x adContent = adSpot.getAdContent();
        com.fyber.inneractive.sdk.interfaces.f fVar = null;
        if (adContent != null) {
            u uVar = u.IA_PUBLISHER_REQUESTED_SHOW;
            InneractiveAdRequest inneractiveAdRequest = adContent.f5418a;
            com.fyber.inneractive.sdk.response.e eVar = adContent.b;
            JSONArray b = adContent.c.b();
            w wVar = new w(eVar);
            wVar.c = uVar;
            wVar.f5514a = inneractiveAdRequest;
            wVar.d = b;
            wVar.a((String) null);
        }
        if (!adSpot.isReady()) {
            InneractiveUnitController.EventsListener eventsListener = this.mEventsListener;
            if (eventsListener != null) {
                ((InneractiveFullscreenAdEventsListener) eventsListener).onAdEnteredErrorState(adSpot, new AdExpiredError());
                return;
            }
            return;
        }
        if (this.mRenderer == null) {
            i iVar = h.f5322a;
            InneractiveAdSpot adSpot2 = getAdSpot();
            Iterator it = iVar.f5323a.iterator();
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
        Intent intent = new Intent(activity, (Class<?>) InneractiveFullscreenAdActivity.class);
        intent.putExtra("spotId", adSpot.getLocalUniqueId());
        try {
            IAlog.a("%sIAInterstitialUtil: Opening interstitial for spot id: %s", IAlog.a(activity), adSpot.getLocalUniqueId());
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            IAlog.c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", IAlog.a(activity));
        }
        this.f5305a = true;
        com.fyber.inneractive.sdk.interfaces.f fVar2 = this.mRenderer;
        if (fVar2 != null) {
            fVar2.a(this.c);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        x0 x0Var = inneractiveAdSpot.getAdContent().d;
        if (x0Var != null) {
            w0 w0Var = (w0) x0Var;
            if (w0Var.e == null) {
                q0 q0Var = w0Var.c;
                if (q0Var != null && UnitDisplayType.INTERSTITIAL.equals(q0Var.b)) {
                    return true;
                }
                y0 y0Var = w0Var.f;
                return y0Var != null && (UnitDisplayType.REWARDED.equals(y0Var.j) || UnitDisplayType.INTERSTITIAL.equals(y0Var.j) || UnitDisplayType.VERTICAL.equals(y0Var.j));
            }
        }
        IAlog.f("%s : supports() called with unit config null", IAlog.a(this));
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supportsRefresh() {
        return false;
    }
}
