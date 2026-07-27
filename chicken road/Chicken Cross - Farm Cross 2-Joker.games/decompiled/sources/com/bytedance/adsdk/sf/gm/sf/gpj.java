package com.bytedance.adsdk.sf.gm.sf;

import com.bytedance.adsdk.sf.pcc.pcc.fum;

/* loaded from: classes4.dex */
public class gpj implements gm {
    private final com.bytedance.adsdk.sf.gm.pcc.sf gm;
    private final com.bytedance.adsdk.sf.gm.pcc.sf oo;
    private final String pcc;
    private final pcc sf;
    private final com.bytedance.adsdk.sf.gm.pcc.sf vj;
    private final boolean wh;

    public enum pcc {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static pcc pcc(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i)));
        }
    }

    public gpj(String str, pcc pccVar, com.bytedance.adsdk.sf.gm.pcc.sf sfVar, com.bytedance.adsdk.sf.gm.pcc.sf sfVar2, com.bytedance.adsdk.sf.gm.pcc.sf sfVar3, boolean z) {
        this.pcc = str;
        this.sf = pccVar;
        this.gm = sfVar;
        this.oo = sfVar2;
        this.vj = sfVar3;
        this.wh = z;
    }

    public String pcc() {
        return this.pcc;
    }

    public pcc sf() {
        return this.sf;
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf gm() {
        return this.oo;
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf oo() {
        return this.gm;
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf vj() {
        return this.vj;
    }

    public boolean wh() {
        return this.wh;
    }

    @Override // com.bytedance.adsdk.sf.gm.sf.gm
    public com.bytedance.adsdk.sf.pcc.pcc.gm pcc(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar) {
        return new fum(pccVar, this);
    }

    public String toString() {
        return "Trim Path: {start: " + this.gm + ", end: " + this.oo + ", offset: " + this.vj + "}";
    }
}
