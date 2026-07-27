package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.model.of;

/* loaded from: classes4.dex */
public class jr extends com.bytedance.sdk.openadsdk.core.ork.pcc.pcc {
    public jr(ViewGroup viewGroup, of ofVar, String str, Activity activity, Context context, com.bytedance.sdk.openadsdk.component.reward.gm.sf sfVar) {
        super(viewGroup, ofVar, str, activity, context, sfVar);
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.gm.wh whVar) {
        if (this.pcc != null) {
            this.pcc.setRewardControlListener(whVar);
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.gm.pcc pccVar) {
        if (this.pcc != null) {
            this.pcc.setAdInteractionListener(pccVar);
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.gm.vy vyVar) {
        if (this.pcc != null) {
            this.pcc.setVideoTrackListener(vyVar);
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.gm.oo ooVar) {
        if (this.pcc != null) {
            this.pcc.setHeartBeatListener(ooVar);
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.gm.pcc.gm gmVar) {
        if (this.pcc != null) {
            this.pcc.setLandingPageListener(gmVar);
        }
    }

    public void pcc() {
        if (this.pcc != null) {
            this.pcc.gbb();
        }
    }

    public void pcc(String str, int i, int i2) {
        if (this.pcc != null) {
            this.pcc.pcc(str, i, i2);
        }
    }

    public void pcc(com.bytedance.sdk.component.vy.vj vjVar) {
        if (this.pcc != null) {
            this.pcc.setWebTouchProxy(vjVar);
        }
    }
}
