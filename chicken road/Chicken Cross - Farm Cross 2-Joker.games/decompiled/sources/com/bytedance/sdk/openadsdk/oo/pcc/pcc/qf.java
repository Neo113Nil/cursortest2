package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

import android.content.Context;
import com.bytedance.pcc.gm;
import com.bytedance.sdk.component.utils.lu;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.mbridge.msdk.foundation.entity.b;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public class qf {
    private static volatile com.bytedance.pcc.oo pcc;

    public static void pcc(final Context context) {
        gm.vj vjVar = new gm.vj(b.JSON_KEY_ADS) { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.qf.1
            @Override // com.bytedance.pcc.gm.vj
            public boolean pcc() {
                return lu.pcc(context);
            }
        };
        vjVar.pcc(vy.class, new pcc());
        vjVar.pcc(vh.class, new tmg());
        vjVar.pcc(hc.class, new gbb());
        vjVar.pcc(gm.sf().sf);
        vjVar.gm(gm.sf().oo);
        final com.bytedance.sdk.component.kj.sf.qf tmg = rnn.tmg();
        if (tmg != null) {
            vjVar.pcc(Math.max(2, tmg.pcc() / 2));
        }
        vjVar.pcc(gm.sf().vj);
        vjVar.oo(gm.sf().wh);
        vjVar.vj(gm.sf().qf);
        vjVar.pcc(new gm.oo() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.qf.2
            @Override // com.bytedance.pcc.gm.oo
            public ExecutorService pcc() {
                return rnn.vh();
            }

            @Override // com.bytedance.pcc.gm.oo
            public ExecutorService sf() {
                return com.bytedance.sdk.component.kj.sf.qf.this;
            }
        });
        vjVar.pcc(new gm.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.qf.3
            @Override // com.bytedance.pcc.gm.pcc
            public byte[] pcc(byte[] bArr) {
                return com.bytedance.sdk.component.oo.sf.sf(bArr, vj.pcc());
            }

            @Override // com.bytedance.pcc.gm.pcc
            public byte[] sf(byte[] bArr) {
                return com.bytedance.sdk.component.oo.sf.pcc(bArr, vj.pcc());
            }
        });
        pcc = com.bytedance.pcc.gm.pcc(context, vjVar);
    }

    public static void pcc(com.bytedance.sdk.openadsdk.oo.pcc pccVar) {
        pcc(new vy(pccVar));
    }

    public static void pcc(com.bytedance.pcc.pcc pccVar) {
        if (pcc == null || pccVar == null) {
            return;
        }
        pcc.pcc(pccVar);
    }

    public static boolean pcc() {
        return pcc != null;
    }
}
