package com.bytedance.sdk.component.adexpress.sf;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.sf.ork;
import com.moloco.sdk.BidRequest;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class dax implements ork {
    private kj gm;
    private hc oo;
    private Context pcc;
    private com.bytedance.sdk.component.adexpress.vj.pcc sf;
    private ScheduledFuture<?> vj;
    private AtomicBoolean wh = new AtomicBoolean(false);

    public dax(Context context, hc hcVar, com.bytedance.sdk.component.adexpress.vj.pcc pccVar, kj kjVar) {
        this.pcc = context;
        this.oo = hcVar;
        this.gm = kjVar;
        this.sf = pccVar;
        pccVar.pcc(this.gm);
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.ork
    public boolean pcc(final ork.pcc pccVar) {
        int wh = this.oo.wh();
        if (wh < 0) {
            pcc(pccVar, BidRequest.SdkBidRequest.Imp.Native.NativeRequest.EventTrackers.EventType.CUSTOM_ACTION_07_VALUE, "time is ".concat(String.valueOf(wh)));
        } else {
            this.vj = com.bytedance.sdk.component.adexpress.oo.oo.pcc(new pcc(1, pccVar), wh, TimeUnit.MILLISECONDS);
            this.sf.pcc(new qf() { // from class: com.bytedance.sdk.component.adexpress.sf.dax.1
                @Override // com.bytedance.sdk.component.adexpress.sf.qf
                public void pcc(View view, gbb gbbVar) {
                    jr sf;
                    dax.this.gm();
                    if (pccVar.gm() || (sf = pccVar.sf()) == null) {
                        return;
                    }
                    sf.pcc(dax.this.sf, gbbVar);
                    pccVar.pcc(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.sf.qf
                public void pcc(int i, String str) {
                    dax.this.pcc(pccVar, i, str);
                }
            });
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.ork
    public void pcc() {
        this.sf.kj();
        gm();
    }

    public com.bytedance.sdk.component.adexpress.vj.pcc sf() {
        return this.sf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        try {
            ScheduledFuture<?> scheduledFuture = this.vj;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.vj.cancel(false);
            this.vj = null;
        } catch (Throwable unused) {
        }
    }

    private class pcc implements Runnable {
        private int gm;
        ork.pcc pcc;

        public pcc(int i, ork.pcc pccVar) {
            this.gm = i;
            this.pcc = pccVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.gm == 1) {
                dax.this.sf.pcc(true);
                dax.this.pcc(this.pcc, BidRequest.SdkBidRequest.Imp.Native.NativeRequest.EventTrackers.EventType.CUSTOM_ACTION_07_VALUE, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(ork.pcc pccVar, int i, String str) {
        jr sf;
        if (pccVar.gm() || this.wh.get()) {
            return;
        }
        gm();
        this.oo.vj().pcc(i, str);
        if (pccVar.sf(this)) {
            pccVar.pcc(this);
        } else {
            if (pccVar.gm() || (sf = pccVar.sf()) == null) {
                return;
            }
            pccVar.pcc(true);
            sf.a_(i);
        }
        this.wh.getAndSet(true);
    }
}
