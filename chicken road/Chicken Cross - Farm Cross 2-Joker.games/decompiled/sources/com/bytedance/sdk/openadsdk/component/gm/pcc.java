package com.bytedance.sdk.openadsdk.component.gm;

import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.oo.ork;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class pcc implements com.bytedance.sdk.openadsdk.pcc.gm.sf {
    private final of oo;
    private final PAGInterstitialAdInteractionListener pcc;
    private final AtomicBoolean sf = new AtomicBoolean(false);
    private final AtomicBoolean gm = new AtomicBoolean(false);

    public pcc(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        this.pcc = pAGInterstitialAdInteractionListener;
        this.oo = pccVar != null ? pccVar.qf() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.pcc.gm.sf
    public void pcc() {
        if (!this.sf.compareAndSet(false, true)) {
            ork.pcc("show_callback_repeat", this.gm.get(), this.sf.get(), this.oo);
            return;
        }
        ork.pcc("show_callback", this.gm.get(), this.sf.get(), this.oo);
        lo.pcc("BVA", "full video onAdShow");
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.pcc;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.pcc.gm.sf
    public void sf() {
        if (!this.gm.compareAndSet(false, true)) {
            ork.pcc("close_callback_repeat", this.gm.get(), this.sf.get(), this.oo);
            return;
        }
        ork.pcc("close_callback", this.gm.get(), this.sf.get(), this.oo);
        lo.pcc("BVA", "full video onAdClose");
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.pcc;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.pcc;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }
}
