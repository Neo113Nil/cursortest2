package com.bytedance.adsdk.ugeno.oo.oo;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public class sf extends gm implements com.bytedance.adsdk.ugeno.pcc.sf {
    private String vh;

    public sf(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.oo.oo.gm
    public boolean pcc(Object... objArr) {
        Object obj;
        com.bytedance.adsdk.ugeno.sf.gm kj;
        com.bytedance.adsdk.ugeno.pcc.pcc tmg;
        if (this.vj == null || this.vj.size() <= 0 || (obj = this.vj.get("name")) == null) {
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
        if (sf != null && (kj = sf.kj(valueOf)) != null && (tmg = kj.tmg(valueOf)) != null) {
            tmg.pcc(this);
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.sf
    public void pcc() {
        if ((TextUtils.equals(this.vh, "start") || TextUtils.isEmpty(this.vh)) && this.pcc != null) {
            this.pcc.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.sf
    public void sf() {
        if ((TextUtils.equals(this.vh, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE) || TextUtils.isEmpty(this.vh)) && this.pcc != null) {
            this.pcc.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
        }
    }
}
