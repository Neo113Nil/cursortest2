package com.bytedance.sdk.openadsdk.pcc.oo;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.rnn;

/* loaded from: classes4.dex */
public class pcc implements PAGAppOpenAdLoadListener {
    private final PAGAppOpenAdLoadListener pcc;

    public pcc(PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
        this.pcc = pAGAppOpenAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.qf
    public void onError(final int i, final String str) {
        if (this.pcc == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.pcc.oo.pcc.1
            @Override // java.lang.Runnable
            public void run() {
                if (pcc.this.pcc != null) {
                    pcc.this.pcc.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGAppOpenAd pAGAppOpenAd) {
        if (this.pcc == null) {
            return;
        }
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.pcc.oo.pcc.2
            @Override // java.lang.Runnable
            public void run() {
                if (pcc.this.pcc != null) {
                    pcc.this.pcc.onAdLoaded(pAGAppOpenAd);
                }
            }
        });
    }
}
