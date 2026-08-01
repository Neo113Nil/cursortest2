package com.bytedance.sdk.openadsdk.pcc.sf;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.rnn;

/* loaded from: classes4.dex */
public class vj implements PAGNativeAdLoadListener {
    private final PAGNativeAdLoadListener pcc;

    public vj(PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        this.pcc = pAGNativeAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.qf
    public void onError(final int i, final String str) {
        if (this.pcc == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.pcc.sf.vj.1
            @Override // java.lang.Runnable
            public void run() {
                if (vj.this.pcc != null) {
                    vj.this.pcc.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGNativeAd pAGNativeAd) {
        if (this.pcc == null) {
            return;
        }
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.pcc.sf.vj.2
            @Override // java.lang.Runnable
            public void run() {
                if (vj.this.pcc != null) {
                    vj.this.pcc.onAdLoaded(pAGNativeAd);
                }
            }
        });
    }
}
