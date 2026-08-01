package com.bytedance.adsdk.pcc.sf.sf.pcc;

/* loaded from: classes5.dex */
public abstract class nac implements com.bytedance.adsdk.pcc.sf.sf.pcc {
    protected com.bytedance.adsdk.pcc.sf.oo.gm gm;
    protected com.bytedance.adsdk.pcc.sf.sf.pcc pcc;
    protected com.bytedance.adsdk.pcc.sf.sf.pcc sf;

    protected nac(com.bytedance.adsdk.pcc.sf.oo.gm gmVar) {
        this.gm = gmVar;
    }

    public void pcc(com.bytedance.adsdk.pcc.sf.sf.pcc pccVar) {
        this.pcc = pccVar;
    }

    public void sf(com.bytedance.adsdk.pcc.sf.sf.pcc pccVar) {
        this.sf = pccVar;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public com.bytedance.adsdk.pcc.sf.oo.vj pcc() {
        return com.bytedance.adsdk.pcc.sf.oo.wh.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public String sf() {
        return this.pcc.sf() + this.gm.pcc() + this.sf.sf();
    }

    public String toString() {
        return sf();
    }
}
