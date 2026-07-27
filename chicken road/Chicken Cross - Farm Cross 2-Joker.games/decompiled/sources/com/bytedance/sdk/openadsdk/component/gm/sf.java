package com.bytedance.sdk.openadsdk.component.gm;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.rnn;

/* loaded from: classes4.dex */
public class sf implements PAGInterstitialAdLoadListener {
    final PAGInterstitialAdLoadListener pcc;

    public sf(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.pcc = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.qf
    public void onError(final int i, final String str) {
        if (this.pcc != null) {
            rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.gm.sf.1
                @Override // java.lang.Runnable
                public void run() {
                    if (sf.this.pcc != null) {
                        sf.this.pcc.onError(i, str);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.pcc != null) {
            rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.gm.sf.2
                @Override // java.lang.Runnable
                public void run() {
                    if (sf.this.pcc != null) {
                        sf.this.pcc.onAdLoaded(pAGInterstitialAd);
                    }
                }
            });
        }
    }
}
