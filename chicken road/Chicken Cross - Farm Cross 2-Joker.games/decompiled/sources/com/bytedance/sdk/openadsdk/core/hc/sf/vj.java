package com.bytedance.sdk.openadsdk.core.hc.sf;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;

/* loaded from: classes4.dex */
public class vj extends com.bytedance.adsdk.ugeno.sf.gm<FrameLayout> {
    public vj(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    /* renamed from: gm, reason: merged with bridge method [inline-methods] */
    public FrameLayout pcc() {
        FrameLayout frameLayout = new FrameLayout(this.sf);
        com.bytedance.sdk.openadsdk.core.model.sf sfVar = new com.bytedance.sdk.openadsdk.core.model.sf();
        sfVar.pcc(true);
        PAGLogoView pAGLogoView = new PAGLogoView(this.sf);
        pAGLogoView.initData(sfVar);
        frameLayout.addView(pAGLogoView);
        return frameLayout;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        super.sf();
    }
}
