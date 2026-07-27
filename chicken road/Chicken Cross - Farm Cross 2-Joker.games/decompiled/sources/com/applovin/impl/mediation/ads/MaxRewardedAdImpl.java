package com.applovin.impl.mediation.ads;

import android.content.Context;
import com.applovin.impl.g3;
import com.applovin.impl.h2;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.x2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* loaded from: classes5.dex */
public class MaxRewardedAdImpl extends MaxFullscreenAdImpl {

    private class b extends MaxFullscreenAdImpl.b implements MaxRewardedAdListener {
        private b() {
            super();
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b, com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            MaxRewardedAdImpl.this.a((g3) maxAd, maxError);
            super.onAdDisplayFailed(maxAd, maxError);
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b, com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            MaxRewardedAdImpl.this.a((g3) maxAd, (MaxError) null);
            super.onAdHidden(maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            p pVar = MaxRewardedAdImpl.this.logger;
            if (p.a()) {
                MaxRewardedAdImpl maxRewardedAdImpl = MaxRewardedAdImpl.this;
                maxRewardedAdImpl.logger.a(maxRewardedAdImpl.tag, "MaxRewardedAdListener.onUserRewarded(ad=" + maxAd + ", reward=" + maxReward + "), listener=" + MaxRewardedAdImpl.this.adListener);
            }
            x2.a(MaxRewardedAdImpl.this.adListener, maxAd, maxReward, true);
        }
    }

    public MaxRewardedAdImpl(String str, MaxAdFormat maxAdFormat, MaxFullscreenAdImpl.a aVar, String str2, l lVar, Context context) {
        super(str, maxAdFormat, aVar, str2, lVar, context);
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl
    protected MaxFullscreenAdImpl.b createAdListenerWrapper() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(g3 g3Var, MaxError maxError) {
        if (g3Var.w0().get() || !g3Var.y0().compareAndSet(false, true)) {
            return;
        }
        if (p.a()) {
            this.logger.a(this.tag, "User not rewarded for ad: " + g3Var + " with error: " + maxError);
        }
        this.sdk.R().a(h2.A0, g3Var, maxError);
    }
}
