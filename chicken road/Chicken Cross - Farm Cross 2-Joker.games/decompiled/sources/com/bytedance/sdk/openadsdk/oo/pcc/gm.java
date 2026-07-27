package com.bytedance.sdk.openadsdk.oo.pcc;

/* loaded from: classes4.dex */
public class gm implements com.bytedance.sdk.component.wh.pcc.vj.gm {
    private final com.bytedance.sdk.component.qf.sf.sf pcc;

    public gm() {
        com.bytedance.sdk.component.qf.sf.sf gm = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().gm();
        this.pcc = gm;
        gm.pcc(7);
        gm.sf("track_url");
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj.gm
    public void pcc(String str) {
        this.pcc.gm(str);
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj.gm
    public void pcc(String str, String str2) {
        this.pcc.sf(str, str2);
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj.gm
    public com.bytedance.sdk.component.wh.pcc.vj.oo pcc() {
        return new vj(this.pcc.vj());
    }
}
