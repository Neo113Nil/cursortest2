package com.bytedance.sdk.openadsdk.core.ork;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class nac extends com.bytedance.sdk.openadsdk.core.jr.sf.wh implements View.OnClickListener {
    private boolean nac;

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.wh
    protected void pcc(boolean z) {
    }

    public nac(Context context, com.bytedance.sdk.openadsdk.core.model.of ofVar, String str, com.bytedance.sdk.openadsdk.oo.qf qfVar, boolean z) {
        super(context, ofVar, false, str, false, false, qfVar);
        this.nac = false;
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
        setNeedSelfManagerVideo(!z);
    }

    public void pcc(int i, int i2) {
        if (this.sf != null) {
            this.sf.sf(i, i2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.wh
    protected void sf() {
        if (!this.vj || !tsz.sf(this.tmg)) {
            this.oo = false;
        }
        super.sf();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.wh
    protected void gm() {
        if (this.nac) {
            super.gm();
        }
    }

    public void setCanInterruptVideoPlay(boolean z) {
        this.nac = z;
    }

    public void setShouldCheckNetChange(boolean z) {
        if (this.sf != null) {
            this.sf.vj(z);
        }
    }

    public void oo() {
        if (this.ork != null) {
            rj.pcc((View) this.ork, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.wh, android.view.View
    protected void onWindowVisibilityChanged(int i) {
        if (this.vy != null && this.vy.getVisibility() == 0) {
            gpj();
        } else {
            super.onWindowVisibilityChanged(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.wh, android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (this.vy != null && this.vy.getVisibility() == 0) {
            gpj();
        } else {
            super.onWindowFocusChanged(z);
        }
    }

    private void lu() {
        rj.pcc((View) this.qf, 0);
        rj.pcc((View) this.kj, 0);
        rj.pcc((View) this.ork, 8);
    }

    private void gpj() {
        qf();
        if (this.qf != null) {
            if (this.qf.getVisibility() == 0) {
                return;
            } else {
                com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.pcc.kez().ork(), this.pcc.kez().gm(), this.pcc.kez().sf(), this.kj, this.pcc);
            }
        }
        lu();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.vy != null && this.vy.getVisibility() == 0) {
            rj.vj(this.qf);
        }
        gm();
    }

    public void setShowAdInteractionView(boolean z) {
        com.bytedance.sdk.openadsdk.core.jr.sf.vj fum;
        if (this.sf == null || (fum = this.sf.tmg()) == null) {
            return;
        }
        fum.pcc(z);
    }

    protected void vj() {
        qf();
        rj.pcc((View) this.qf, 0);
    }
}
