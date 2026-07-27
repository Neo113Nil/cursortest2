package com.bytedance.sdk.openadsdk.core.hc.sf;

import android.content.Context;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.nac;
import com.bytedance.sdk.component.adexpress.sf.gbb;
import com.bytedance.sdk.component.adexpress.sf.hc;
import com.bytedance.sdk.component.adexpress.sf.jr;
import com.bytedance.sdk.component.adexpress.sf.kj;
import com.bytedance.sdk.component.adexpress.sf.ork;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.ork.dax;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class qf implements ork {
    private hc gm;
    private ScheduledFuture<?> oo;
    private Context pcc;
    private com.bytedance.sdk.openadsdk.core.hc.wh.oo sf;
    private AtomicBoolean vj = new AtomicBoolean(false);
    private dax wh;

    @Override // com.bytedance.sdk.component.adexpress.sf.ork
    public void pcc() {
    }

    public qf(Context context, com.bytedance.sdk.openadsdk.core.hc.wh.oo ooVar, kj kjVar, hc hcVar) {
        this.pcc = context;
        this.sf = ooVar;
        this.gm = hcVar;
        this.sf.pcc(kjVar);
    }

    public void pcc(dax daxVar) {
        this.wh = daxVar;
        this.sf.pcc(daxVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.ork
    public boolean pcc(final ork.pcc pccVar) {
        int wh = this.gm.wh();
        if (wh < 0 && !(this.sf instanceof com.bytedance.sdk.openadsdk.core.hc.wh.pcc.wh)) {
            pcc(pccVar, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "time is ".concat(String.valueOf(wh)));
        } else {
            if (!(this.sf instanceof com.bytedance.sdk.openadsdk.core.hc.wh.pcc.wh)) {
                this.oo = rnn.pcc().schedule(new pcc(1, pccVar), wh, TimeUnit.MILLISECONDS);
            }
            this.sf.pcc(new com.bytedance.sdk.component.adexpress.sf.qf() { // from class: com.bytedance.sdk.openadsdk.core.hc.sf.qf.1
                @Override // com.bytedance.sdk.component.adexpress.sf.qf
                public void pcc(View view, gbb gbbVar) {
                    qf.this.sf();
                    if (pccVar.gm()) {
                        return;
                    }
                    nac nacVar = new nac();
                    nacVar.pcc(0);
                    if (qf.this.sf instanceof com.bytedance.sdk.openadsdk.core.hc.wh.pcc.wh) {
                        qf.this.gm.vj().wh();
                    } else {
                        ((com.bytedance.sdk.openadsdk.core.hc.wh.pcc) qf.this.gm).pq().pcc(nacVar);
                    }
                    qf.this.gm.vj().vy();
                    jr sf = pccVar.sf();
                    if (sf == null) {
                        return;
                    }
                    sf.pcc(qf.this.sf, gbbVar);
                    pccVar.pcc(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.sf.qf
                public void pcc(int i, String str) {
                    qf.this.pcc(pccVar, i, str);
                }
            });
        }
        return true;
    }

    private class pcc implements Runnable {
        private int gm;
        ork.pcc pcc;

        pcc(int i, ork.pcc pccVar) {
            this.gm = i;
            this.pcc = pccVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.gm == 1) {
                qf.this.sf.pcc(true);
                qf.this.pcc(this.pcc, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "real time out" + qf.this.gm.wh());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(ork.pcc pccVar, int i, String str) {
        jr sf;
        if (pccVar.gm() || this.vj.get()) {
            return;
        }
        sf();
        nac nacVar = new nac();
        nacVar.pcc(i);
        nacVar.pcc(str);
        ((com.bytedance.sdk.openadsdk.core.hc.wh.pcc) this.gm).pq().pcc(nacVar);
        if (pccVar.sf(this)) {
            pccVar.pcc(this);
        } else {
            if (pccVar.gm() || (sf = pccVar.sf()) == null) {
                return;
            }
            pccVar.pcc(true);
            sf.a_(i);
        }
        this.vj.getAndSet(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf() {
        try {
            ScheduledFuture<?> scheduledFuture = this.oo;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.oo.cancel(false);
            this.oo = null;
        } catch (Throwable th) {
            lo.gm("RenderInterceptor", "remove ugen time out task fail", th.getMessage());
        }
    }
}
