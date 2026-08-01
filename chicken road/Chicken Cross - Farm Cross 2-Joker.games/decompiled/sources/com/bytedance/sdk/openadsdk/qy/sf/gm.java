package com.bytedance.sdk.openadsdk.qy.sf;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.qy.sf.vj;

/* loaded from: classes4.dex */
public class gm extends sf {
    private int oo;

    @Override // com.bytedance.sdk.openadsdk.qy.sf.sf
    protected void sf(int i) {
    }

    public gm(Integer num, View view, of ofVar, vj.pcc pccVar) {
        super(num, view, ofVar, 1000, pccVar);
        this.oo = -1;
        sf(view);
    }

    @Override // com.bytedance.sdk.openadsdk.qy.sf.sf
    protected boolean gm() {
        if (this.pcc == null || this.pcc.get() == null) {
            return false;
        }
        View view = this.pcc.get();
        if (this.oo == -1) {
            sf(view);
        }
        return wh.pcc(view, this.oo == 1, this.sf.tqg());
    }

    private void sf(View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.oo = width * height >= 242500 ? 1 : 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.qy.sf.sf
    protected void oo() {
        super.oo();
    }

    @Override // com.bytedance.sdk.openadsdk.qy.sf.sf
    public int wh() {
        return (this.sf != null && this.sf.xb() && this.sf.hh() == 1) ? 1000 : 100;
    }
}
