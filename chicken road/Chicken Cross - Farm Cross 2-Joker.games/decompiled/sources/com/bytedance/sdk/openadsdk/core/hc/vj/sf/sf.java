package com.bytedance.sdk.openadsdk.core.hc.vj.sf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public class sf extends com.bytedance.adsdk.ugeno.oo.oo.gm {
    private String vh;

    public sf(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.oo.oo.gm
    public boolean pcc(Object... objArr) {
        Object obj;
        if (this.vj == null || this.vj.size() <= 0 || (obj = this.vj.get("id")) == null) {
            return false;
        }
        String valueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(valueOf)) {
            return false;
        }
        Object obj2 = this.vj.get("state");
        if (obj2 != null) {
            this.vh = String.valueOf(obj2);
        }
        com.bytedance.adsdk.ugeno.sf.gm sf = this.sf.sf(this.sf);
        if (sf == null) {
            return false;
        }
        com.bytedance.adsdk.ugeno.sf.gm vj = sf.vj(valueOf);
        if (vj instanceof com.bytedance.sdk.openadsdk.core.hc.sf.sf.pcc) {
            ((com.bytedance.sdk.openadsdk.core.hc.sf.sf.pcc) vj).pcc(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.hc.vj.sf.sf.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (!TextUtils.equals(sf.this.vh, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE) || sf.this.pcc == null) {
                        return;
                    }
                    sf.this.pcc.pcc(sf.this.sf, sf.this.wh, sf.this.gm.sf(), sf.this.gm);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    if (!TextUtils.equals(sf.this.vh, "start") || sf.this.pcc == null) {
                        return;
                    }
                    sf.this.pcc.pcc(sf.this.sf, sf.this.wh, sf.this.gm.sf(), sf.this.gm);
                }
            });
        }
        return false;
    }
}
