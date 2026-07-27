package com.bytedance.adsdk.sf.gm.sf;

/* loaded from: classes4.dex */
public class tmg implements gm {
    private final com.bytedance.adsdk.sf.gm.pcc.sf gm;
    private final com.bytedance.adsdk.sf.gm.pcc.tmg oo;
    private final String pcc;
    private final com.bytedance.adsdk.sf.gm.pcc.sf sf;
    private final boolean vj;

    public tmg(String str, com.bytedance.adsdk.sf.gm.pcc.sf sfVar, com.bytedance.adsdk.sf.gm.pcc.sf sfVar2, com.bytedance.adsdk.sf.gm.pcc.tmg tmgVar, boolean z) {
        this.pcc = str;
        this.sf = sfVar;
        this.gm = sfVar2;
        this.oo = tmgVar;
        this.vj = z;
    }

    public String pcc() {
        return this.pcc;
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf sf() {
        return this.sf;
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf gm() {
        return this.gm;
    }

    public com.bytedance.adsdk.sf.gm.pcc.tmg oo() {
        return this.oo;
    }

    public boolean vj() {
        return this.vj;
    }

    @Override // com.bytedance.adsdk.sf.gm.sf.gm
    public com.bytedance.adsdk.sf.pcc.pcc.gm pcc(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar) {
        return new com.bytedance.adsdk.sf.pcc.pcc.dax(vyVar, pccVar, this);
    }
}
