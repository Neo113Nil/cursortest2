package com.bytedance.sdk.openadsdk.dax.sf;

/* loaded from: classes4.dex */
class vj implements gm {
    private static volatile vj pcc;

    @Override // com.bytedance.sdk.openadsdk.dax.sf.gm
    public void pcc(com.bytedance.sdk.openadsdk.dax.sf sfVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.dax.sf.gm
    public void pcc(com.bytedance.sdk.openadsdk.dax.sf sfVar, boolean z) {
    }

    public static vj pcc() {
        if (pcc == null) {
            synchronized (vj.class) {
                if (pcc == null) {
                    pcc = new vj();
                }
            }
        }
        return pcc;
    }

    private vj() {
    }
}
