package com.bytedance.sdk.openadsdk.component.reward.pcc;

import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;

/* loaded from: classes4.dex */
public class vy {
    public static int gm = 2;
    public static int pcc = 0;
    public static int sf = 1;
    private final boolean oo;
    private ork vj;

    public com.bytedance.sdk.openadsdk.hc.vj gm() {
        return null;
    }

    public com.bytedance.sdk.openadsdk.tz.kj pcc() {
        return null;
    }

    public boolean sf() {
        return false;
    }

    public vy(sf sfVar, of ofVar) {
        this.oo = ofVar.yir();
        this.vj = atb.wh(ofVar) ? new kj(sfVar) : new ork(sfVar);
    }

    public boolean oo() {
        ork orkVar = this.vj;
        if (orkVar != null) {
            return orkVar.ork();
        }
        return false;
    }

    public void vj() {
        ork orkVar = this.vj;
        if (orkVar != null) {
            orkVar.oo();
        }
    }

    public void wh() {
        ork orkVar = this.vj;
        if (orkVar != null) {
            orkVar.vy();
        }
    }

    public void pcc(int i) {
        ork orkVar = this.vj;
        if (orkVar != null) {
            orkVar.pcc(i);
        }
    }

    public void sf(int i) {
        ork orkVar = this.vj;
        if (orkVar != null) {
            orkVar.pcc(i);
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.gm.vj vjVar) {
        ork orkVar = this.vj;
        if (orkVar != null) {
            orkVar.pcc(vjVar);
        }
    }

    public void qf() {
        ork orkVar = this.vj;
        if (orkVar != null) {
            orkVar.pcc();
        }
    }

    public void kj() {
        ork orkVar = this.vj;
        if (orkVar != null) {
            orkVar.vj();
        }
    }

    public void gm(int i) {
        ork orkVar;
        if (i == gm || (orkVar = this.vj) == null) {
            return;
        }
        orkVar.wh();
    }

    public void pcc(boolean z) {
        ork orkVar = this.vj;
        if (orkVar != null) {
            orkVar.sf(z);
        }
    }

    public boolean oo(int i) {
        ork orkVar;
        if (i != sf || (orkVar = this.vj) == null) {
            return false;
        }
        return orkVar.hc();
    }

    public void vy() {
        ork orkVar = this.vj;
        if (orkVar != null) {
            orkVar.gbb();
        }
    }

    public void sf(boolean z) {
        ork orkVar = this.vj;
        if (orkVar != null) {
            orkVar.gm(z);
        }
    }

    public void ork() {
        ork orkVar = this.vj;
        if (orkVar != null) {
            orkVar.gm();
        }
    }

    public boolean vh() {
        ork orkVar = this.vj;
        if (orkVar != null) {
            return orkVar.jr();
        }
        return false;
    }
}
