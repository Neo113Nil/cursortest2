package com.bytedance.sdk.openadsdk.core.gm;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.utils.nac;

/* loaded from: classes4.dex */
public abstract class qf extends gm {
    private gm gm;
    private final String pcc;
    private final com.bytedance.sdk.openadsdk.core.gbb.pcc sf;

    public qf(String str, com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar) {
        this(str, pccVar, null);
    }

    public qf(String str, com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar, gm gmVar) {
        this.pcc = str;
        this.sf = pccVar;
        this.gm = gmVar;
    }

    public void pcc(gm gmVar) {
        this.gm = gmVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.gm.gm
    protected void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
        com.bytedance.sdk.openadsdk.core.gbb.pcc pccVar = this.sf;
        if (pccVar != null) {
            pccVar.vj(this.pcc);
        }
        if (view != null) {
            if (view.getId() == nac.vj) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == nac.vy) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.pcc);
            }
        }
        gm gmVar = this.gm;
        if (gmVar != null) {
            gmVar.yt = this.yt;
            this.gm.qy = this.qy;
            this.gm.jsj = this.jsj;
            this.gm.tsz = this.jsj;
            this.gm.mk = this.jsj;
            this.gm.pcc(view, f, f2, f3, f4, sparseArray, z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gm.gm, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }
}
