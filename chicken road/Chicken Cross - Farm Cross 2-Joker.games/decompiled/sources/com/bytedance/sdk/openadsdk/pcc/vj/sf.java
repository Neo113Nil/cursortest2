package com.bytedance.sdk.openadsdk.pcc.vj;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.rnn;

/* loaded from: classes4.dex */
public class sf implements PAGRewardedAdLoadListener {
    private final PAGRewardedAdLoadListener pcc;

    public sf(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.pcc = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.qf
    public void onError(final int i, final String str) {
        if (this.pcc == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.pcc.vj.sf.1
            @Override // java.lang.Runnable
            public void run() {
                if (sf.this.pcc != null) {
                    sf.this.pcc.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.pcc == null) {
            return;
        }
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.pcc.vj.sf.2
            @Override // java.lang.Runnable
            public void run() {
                if (sf.this.pcc != null) {
                    sf.this.pcc.onAdLoaded(pAGRewardedAd);
                }
            }
        });
    }
}
