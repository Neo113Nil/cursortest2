package com.bytedance.sdk.openadsdk.pcc.sf.pcc;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.dax;
import com.bytedance.sdk.openadsdk.core.ork.fum;

/* loaded from: classes4.dex */
public class pcc extends com.bytedance.sdk.openadsdk.core.ork.pcc {
    private fum pcc;
    private com.bytedance.sdk.openadsdk.pcc.sf.pcc tmg;

    public pcc(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.pcc
    protected void pcc(View view, int i, dax daxVar) {
        fum fumVar = this.pcc;
        if (fumVar != null) {
            fumVar.pcc(view, i, daxVar);
        }
    }

    public void pcc(fum fumVar) {
        this.pcc = fumVar;
        fumVar.addView(this, new FrameLayout.LayoutParams(-1, -1));
    }

    public void setExtraFuncationHelper(com.bytedance.sdk.openadsdk.pcc.sf.pcc pccVar) {
        this.tmg = pccVar;
    }
}
