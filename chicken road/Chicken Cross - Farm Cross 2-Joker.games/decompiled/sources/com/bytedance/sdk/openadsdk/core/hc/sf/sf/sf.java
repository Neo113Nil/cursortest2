package com.bytedance.sdk.openadsdk.core.hc.sf.sf;

import android.content.Context;
import com.bytedance.adsdk.sf.wh;
import com.bytedance.adsdk.ugeno.oo;

/* loaded from: classes4.dex */
public class sf extends wh {
    private oo pcc;

    public sf(Context context) {
        super(context);
    }

    public void pcc(oo ooVar) {
        this.pcc = ooVar;
    }

    @Override // com.bytedance.adsdk.sf.wh, android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.qf();
        }
    }

    @Override // com.bytedance.adsdk.sf.wh, android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.kj();
        }
    }
}
