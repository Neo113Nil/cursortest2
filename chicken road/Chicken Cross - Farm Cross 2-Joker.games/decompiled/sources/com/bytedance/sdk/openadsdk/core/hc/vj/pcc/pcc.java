package com.bytedance.sdk.openadsdk.core.hc.vj.pcc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.oo.wh;
import com.bytedance.adsdk.ugeno.sf.gm;

/* loaded from: classes4.dex */
public class pcc extends com.bytedance.adsdk.ugeno.oo.sf.pcc {
    @Override // com.bytedance.adsdk.ugeno.oo.sf.pcc
    public void sf() {
    }

    public pcc(gm gmVar, String str, wh.pcc pccVar) {
        super(gmVar, str, pccVar);
    }

    @Override // com.bytedance.adsdk.ugeno.oo.sf.pcc
    public void pcc() {
        Object obj;
        gm sf;
        if (this.wh == null || this.wh.isEmpty() || (obj = this.wh.get("id")) == null) {
            return;
        }
        String valueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(valueOf) || (sf = this.gm.sf(this.gm)) == null) {
            return;
        }
        gm vj = sf.vj(valueOf);
        if (vj instanceof com.bytedance.sdk.openadsdk.core.hc.sf.sf.pcc) {
            com.bytedance.sdk.openadsdk.core.hc.sf.sf.pcc pccVar = (com.bytedance.sdk.openadsdk.core.hc.sf.sf.pcc) vj;
            pccVar.oo();
            pccVar.pcc(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.hc.vj.pcc.pcc.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    pcc.this.gm();
                }
            });
        }
    }
}
