package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.oo.ork;
import com.ironsource.Wf;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class vj implements com.bytedance.sdk.openadsdk.pcc.oo.sf {
    private final AtomicBoolean gm = new AtomicBoolean(false);
    private final AtomicBoolean oo = new AtomicBoolean(false);
    private final of pcc;
    private final PAGAppOpenAdInteractionListener sf;

    public vj(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener, of ofVar) {
        this.pcc = ofVar;
        this.sf = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.pcc.oo.sf
    public void pcc() {
        if (!this.oo.compareAndSet(false, true)) {
            ork.pcc("show_callback_repeat", this.gm.get(), this.oo.get(), this.pcc);
            return;
        }
        ork.pcc("show_callback", this.gm.get(), this.oo.get(), this.pcc);
        lo.pcc("BVA", "onAdShow");
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.sf;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        lo.pcc("BVA", Wf.f);
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.sf;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.pcc.oo.sf
    public void sf() {
        lo.pcc("BVA", "onAdSkip");
        if (!this.gm.getAndSet(true)) {
            ork.pcc("close_callback", this.gm.get(), this.oo.get(), this.pcc);
            PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.sf;
            if (pAGAppOpenAdInteractionListener != null) {
                pAGAppOpenAdInteractionListener.onAdDismissed();
                return;
            }
            return;
        }
        ork.pcc("close_callback_repeat", this.gm.get(), this.oo.get(), this.pcc);
    }

    @Override // com.bytedance.sdk.openadsdk.pcc.oo.sf
    public void gm() {
        if (!this.gm.getAndSet(true)) {
            ork.pcc("close_callback", this.gm.get(), this.oo.get(), this.pcc);
            PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.sf;
            if (pAGAppOpenAdInteractionListener != null) {
                pAGAppOpenAdInteractionListener.onAdDismissed();
                return;
            }
            return;
        }
        ork.pcc("close_callback_repeat", this.gm.get(), this.oo.get(), this.pcc);
    }
}
