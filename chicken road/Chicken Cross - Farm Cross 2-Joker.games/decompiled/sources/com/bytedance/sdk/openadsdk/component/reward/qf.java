package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.jr;

/* loaded from: classes4.dex */
public class qf extends pcc<PAGInterstitialAdLoadListener, TTClientBidding> {
    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    protected int sf() {
        return 8;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    protected int wh() {
        return 5;
    }

    public static qf pcc(Context context) {
        return (qf) fum.pcc(context, 8);
    }

    qf(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    protected jr pcc() {
        return jr.pcc(this.pcc, jr.pcc.FULL_SCREEN_VIDEO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public TTClientBidding pcc(Context context, com.bytedance.sdk.openadsdk.core.model.pcc pccVar, AdSlot adSlot) {
        return new gpj(context, pccVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public Object pcc(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof gpj) {
            return ((gpj) tTClientBidding).pcc();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public void pcc(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, int i, String str) {
        pAGInterstitialAdLoadListener.onError(i, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public void pcc(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, Object obj) {
        if (pAGInterstitialAdLoadListener == null || obj == null || !(obj instanceof PAGInterstitialAd)) {
            return;
        }
        pAGInterstitialAdLoadListener.onAdLoaded((PAGInterstitialAd) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public void sf(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof gpj) {
            ((gpj) tTClientBidding).sf();
        }
    }
}
