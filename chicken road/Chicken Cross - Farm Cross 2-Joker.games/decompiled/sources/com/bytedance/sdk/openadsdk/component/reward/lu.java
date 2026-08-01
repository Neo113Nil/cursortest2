package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.jr;

/* loaded from: classes4.dex */
public class lu extends pcc<PAGRewardedAdLoadListener, TTClientBidding> {
    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    protected int sf() {
        return 7;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    protected int wh() {
        return 6;
    }

    public static lu pcc(Context context) {
        return (lu) fum.pcc(context, 7);
    }

    lu(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    protected jr pcc() {
        return jr.pcc(this.pcc, jr.pcc.REWARD_VIDEO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public TTClientBidding pcc(Context context, com.bytedance.sdk.openadsdk.core.model.pcc pccVar, AdSlot adSlot) {
        return new lo(context, pccVar, adSlot);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public Object pcc(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof lo) {
            return ((lo) tTClientBidding).pcc();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public void pcc(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, int i, String str) {
        pAGRewardedAdLoadListener.onError(i, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public void pcc(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, Object obj) {
        if (pAGRewardedAdLoadListener == null || obj == null || !(obj instanceof PAGRewardedAd)) {
            return;
        }
        pAGRewardedAdLoadListener.onAdLoaded((PAGRewardedAd) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc
    public void sf(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof lo) {
            ((lo) tTClientBidding).sf();
        }
    }
}
