package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.openadsdk.component.reward.gm.sf;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.wh.gm;

/* loaded from: classes4.dex */
public class TTFullWebActivity extends TTUnifyWebActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTUnifyWebActivity
    protected boolean pcc() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTUnifyWebActivity
    protected sf pcc(Activity activity, Context context, of ofVar, String str, gm gmVar, String str2) {
        return new com.bytedance.sdk.openadsdk.component.reward.gm.gm(activity, context, ofVar, str, gmVar, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTUnifyWebActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.oo != null) {
            com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc("videoForceBreak", this.vj);
        }
        if (this.oo != null) {
            this.oo.nac();
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTUnifyWebActivity
    public void sf() {
        super.finish();
    }
}
