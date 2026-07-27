package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.rnn;

/* loaded from: classes4.dex */
public class sf {
    public static void pcc(final of ofVar, final boolean z, final boolean z2) {
        com.bytedance.sdk.openadsdk.core.jr.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.sf.1
            @Override // java.lang.Runnable
            public void run() {
                of ofVar2 = of.this;
                if (ofVar2 == null || ofVar2.duh() || of.wh(of.this)) {
                    return;
                }
                try {
                    Context pcc = com.bytedance.sdk.openadsdk.core.lu.pcc();
                    AdSlot gqd = of.this.gqd();
                    if (gqd != null) {
                        boolean oo = com.bytedance.sdk.openadsdk.utils.sf.oo();
                        if (oo) {
                            if (z2) {
                                lu.pcc(pcc).pcc(gqd.getCodeId(), of.this);
                            } else {
                                qf.pcc(pcc).pcc(gqd.getCodeId(), of.this);
                            }
                        } else if (z2) {
                            nac.pcc(pcc).pcc(gqd.getCodeId(), of.this);
                        } else {
                            wh.pcc(pcc).pcc(gqd.getCodeId(), of.this);
                        }
                        if (z) {
                            if (oo) {
                                if (z2) {
                                    lu.pcc(pcc).pcc(gqd);
                                    return;
                                } else {
                                    qf.pcc(pcc).pcc(gqd);
                                    return;
                                }
                            }
                            if (z2) {
                                nac.pcc(pcc).pcc(gqd);
                            } else {
                                wh.pcc(pcc).pcc(gqd);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static boolean pcc(final com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        com.bytedance.sdk.openadsdk.activity.single.sf sfVar2;
        int i = 0;
        if (sfVar == null) {
            return false;
        }
        if (sfVar.ywp == null || sfVar.ywp.rj() == null) {
            sfVar2 = null;
        } else {
            sfVar2 = sfVar.ywp.rj();
            if (sfVar2 != null) {
                i = sfVar2.zti();
            }
        }
        boolean pcc = rnn.pcc(sfVar.rnn, sfVar.sf, sfVar.vj, sfVar.oo ? 7 : 5, i);
        if (pcc) {
            if (sfVar.sf != null) {
                atb.pcc().pcc(sfVar.sf, new atb.sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.sf.2
                    @Override // com.bytedance.sdk.openadsdk.core.atb.sf
                    public void pcc() {
                        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar3 = com.bytedance.sdk.openadsdk.component.reward.pcc.sf.this;
                        if (sfVar3 == null || sfVar3.tsx == null) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.component.reward.pcc.sf.this.tsx.qcw();
                    }
                });
            }
            if (sfVar2 != null && sfVar2.jsj()) {
                sfVar2.atb();
            }
        }
        return pcc;
    }
}
