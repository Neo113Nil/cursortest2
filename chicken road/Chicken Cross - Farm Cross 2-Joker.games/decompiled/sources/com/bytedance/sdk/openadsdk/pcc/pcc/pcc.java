package com.bytedance.sdk.openadsdk.pcc.pcc;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.rnn;

/* loaded from: classes4.dex */
public class pcc implements PAGBannerAdLoadListener {
    private final PAGBannerAdLoadListener pcc;

    public pcc(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.pcc = pAGBannerAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.qf
    public void onError(final int i, final String str) {
        if (this.pcc == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.pcc.pcc.pcc.1
            @Override // java.lang.Runnable
            public void run() {
                pcc.this.pcc.onError(i, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGBannerAd pAGBannerAd) {
        if (this.pcc == null) {
            return;
        }
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.pcc.pcc.pcc.2
            @Override // java.lang.Runnable
            public void run() {
                pcc.this.pcc.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
