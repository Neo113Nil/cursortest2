package com.bytedance.sdk.component.kj.pcc;

import android.os.Handler;
import com.bytedance.sdk.component.utils.kj;
import com.bytedance.sdk.component.utils.tsz;

/* loaded from: classes4.dex */
public class pcc {
    private final oo<sf> pcc;
    private Handler sf;

    private pcc() {
        this.pcc = oo.pcc(2);
    }

    public static pcc pcc() {
        return C0125pcc.pcc;
    }

    /* renamed from: com.bytedance.sdk.component.kj.pcc.pcc$pcc, reason: collision with other inner class name */
    private static class C0125pcc {
        private static final pcc pcc = new pcc();
    }

    public Handler sf() {
        if (this.sf == null) {
            synchronized (pcc.class) {
                if (this.sf == null) {
                    this.sf = pcc("csj_io_handler");
                }
            }
        }
        return this.sf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(final Handler handler, final Handler handler2) {
        if (handler.getLooper().getQueue().isIdle()) {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
        } else {
            handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.kj.pcc.pcc.1
                @Override // java.lang.Runnable
                public void run() {
                    pcc.this.pcc(handler, handler2);
                }
            }, 1000L);
        }
    }

    public tsz pcc(tsz.pcc pccVar, final String str) {
        sf pcc = this.pcc.pcc();
        if (pcc != null) {
            pcc.pcc(pccVar);
            pcc.post(new Runnable() { // from class: com.bytedance.sdk.component.kj.pcc.pcc.2
                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setName(str);
                }
            });
            return pcc;
        }
        return sf(pccVar, str);
    }

    public tsz pcc(String str) {
        return pcc((tsz.pcc) null, str);
    }

    private sf sf(tsz.pcc pccVar, String str) {
        return new sf(kj.pcc(str), pccVar);
    }

    public boolean pcc(tsz tszVar) {
        if (!(tszVar instanceof sf)) {
            return false;
        }
        sf sfVar = (sf) tszVar;
        if (this.pcc.pcc((oo<sf>) sfVar)) {
            return true;
        }
        sfVar.sf();
        return true;
    }
}
