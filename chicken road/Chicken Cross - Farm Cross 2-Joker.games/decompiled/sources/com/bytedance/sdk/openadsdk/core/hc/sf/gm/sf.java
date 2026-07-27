package com.bytedance.sdk.openadsdk.core.hc.sf.gm;

import android.content.Context;

/* loaded from: classes4.dex */
public class sf extends com.bytedance.adsdk.ugeno.sf.pcc<com.bytedance.adsdk.ugeno.vy.sf.pcc> {
    public sf(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    /* renamed from: gm, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.vy.sf.pcc pcc() {
        pcc pccVar = new pcc(this.sf);
        pccVar.pcc(this);
        return pccVar;
    }

    public com.bytedance.adsdk.ugeno.vy.sf.pcc oo() {
        return ((pcc) this.vj).getPlayableView();
    }
}
