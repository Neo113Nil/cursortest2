package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.rnn;

/* loaded from: classes4.dex */
public class vy implements PAGRewardedAdLoadListener {
    final PAGRewardedAdLoadListener pcc;

    public vy(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.pcc = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.qf
    public void onError(final int i, final String str) {
        if (this.pcc != null) {
            rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.vy.1
                @Override // java.lang.Runnable
                public void run() {
                    if (vy.this.pcc != null) {
                        vy.this.pcc.onError(i, str);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.pcc != null) {
            rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.vy.2
                @Override // java.lang.Runnable
                public void run() {
                    if (vy.this.pcc != null) {
                        vy.this.pcc.onAdLoaded(pAGRewardedAd);
                    }
                }
            });
        }
    }
}
