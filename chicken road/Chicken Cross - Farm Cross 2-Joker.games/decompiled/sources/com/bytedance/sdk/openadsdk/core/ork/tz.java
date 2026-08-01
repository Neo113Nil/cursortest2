package com.bytedance.sdk.openadsdk.core.ork;

import android.view.View;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.moloco.sdk.BidRequest;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class tz extends com.bytedance.sdk.component.adexpress.sf.pcc<pcc> {
    private final View gm;
    private com.bytedance.sdk.component.adexpress.sf.gm oo;
    AtomicBoolean pcc = new AtomicBoolean(false);
    private pcc sf;
    private com.bytedance.sdk.component.adexpress.sf.qf vj;
    private final com.bytedance.sdk.component.adexpress.sf.hc wh;

    public tz(View view, com.bytedance.sdk.component.adexpress.sf.hc hcVar) {
        this.gm = view;
        this.wh = hcVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.oo
    public void pcc(com.bytedance.sdk.component.adexpress.sf.qf qfVar) {
        this.vj = qfVar;
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.tz.1
            @Override // java.lang.Runnable
            public void run() {
                tz.this.sf();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf() {
        if (this.pcc.get()) {
            return;
        }
        com.bytedance.sdk.component.adexpress.sf.gm gmVar = this.oo;
        if (gmVar == null || !gmVar.pcc((fum) this.gm, 0)) {
            this.vj.pcc(BidRequest.SdkBidRequest.Imp.Native.NativeRequest.EventTrackers.EventType.CUSTOM_ACTION_07_VALUE, "backup false");
            return;
        }
        this.wh.vj().wh();
        pcc pccVar = (pcc) this.gm.findViewWithTag("tt_express_backup_fl_tag_26");
        this.sf = pccVar;
        if (pccVar != null) {
            com.bytedance.sdk.component.adexpress.sf.gbb gbbVar = new com.bytedance.sdk.component.adexpress.sf.gbb();
            pcc pccVar2 = this.sf;
            float realWidth = pccVar2 == null ? 0.0f : pccVar2.getRealWidth();
            pcc pccVar3 = this.sf;
            float realHeight = pccVar3 != null ? pccVar3.getRealHeight() : 0.0f;
            gbbVar.pcc(true);
            gbbVar.pcc(realWidth);
            gbbVar.sf(realHeight);
            this.vj.pcc(this.sf, gbbVar);
            return;
        }
        this.vj.pcc(BidRequest.SdkBidRequest.Imp.Native.NativeRequest.EventTrackers.EventType.CUSTOM_ACTION_07_VALUE, "backupview is null");
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.oo
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public pcc vj() {
        return this.sf;
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.pcc
    public void pcc(com.bytedance.sdk.component.adexpress.sf.gm gmVar) {
        this.oo = gmVar;
    }
}
