package com.bytedance.sdk.openadsdk.oo.pcc;

import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.oo.pcc.pcc.vh;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.utils.tsz;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class kj implements com.bytedance.sdk.openadsdk.dax.sf.gm {
    public static final kj pcc = new kj();

    private kj() {
    }

    @Override // com.bytedance.sdk.openadsdk.dax.sf.gm
    public void pcc(com.bytedance.sdk.openadsdk.dax.sf sfVar) {
        pcc(sfVar, false);
    }

    @Override // com.bytedance.sdk.openadsdk.dax.sf.gm
    public void pcc(final com.bytedance.sdk.openadsdk.dax.sf sfVar, final boolean z) {
        pcc(new com.bytedance.sdk.component.kj.sf.gm("uploadLogEvent") { // from class: com.bytedance.sdk.openadsdk.oo.pcc.kj.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.dax.pcc.gm pcc2 = sfVar.pcc();
                    if (pcc2 == null) {
                        return;
                    }
                    JSONObject pcc3 = pcc2.pcc();
                    String pcc4 = tsz.pcc();
                    if (com.bytedance.sdk.openadsdk.oo.pcc.pcc.wh.pcc(pcc3.optString("type")) && com.bytedance.sdk.openadsdk.oo.pcc.pcc.qf.pcc()) {
                        vh vhVar = new vh(pcc4, vh.pcc(pcc3));
                        vhVar.pcc(z ? 1 : 0);
                        com.bytedance.sdk.openadsdk.oo.pcc.pcc.qf.pcc(vhVar);
                        return;
                    }
                    com.bytedance.sdk.component.wh.pcc.oo.pcc.pcc pccVar = new com.bytedance.sdk.component.wh.pcc.oo.pcc.pcc(pcc4, pcc3);
                    pccVar.pcc((byte) 0);
                    pccVar.gm(z ? (byte) 2 : (byte) 3);
                    pccVar.sf((byte) 1);
                    if (com.bytedance.sdk.component.wh.pcc.sf.sf()) {
                        sf.pcc(lu.pcc());
                    }
                    com.bytedance.sdk.component.wh.pcc.sf.pcc(pccVar);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void pcc(com.bytedance.sdk.component.kj.sf.gm gmVar) {
        if (gmVar == null) {
            return;
        }
        if (!rnn.qf()) {
            rnn.sf(gmVar, 5);
        } else {
            gmVar.run();
        }
    }
}
