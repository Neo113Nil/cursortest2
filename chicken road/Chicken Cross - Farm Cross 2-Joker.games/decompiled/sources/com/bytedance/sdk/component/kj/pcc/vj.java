package com.bytedance.sdk.component.kj.pcc;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.lo;

/* loaded from: classes4.dex */
final class vj {
    private static volatile vj pcc;
    private volatile Handler gm;
    private volatile HandlerThread sf;

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
        sf();
    }

    public void pcc(Runnable runnable) {
        Handler handler;
        if (gm() && (handler = this.gm) != null) {
            handler.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void sf() {
        try {
            if (gm()) {
                return;
            }
            this.sf = new HandlerThread("csj_dispatch_msg") { // from class: com.bytedance.sdk.component.kj.pcc.vj.1
                boolean pcc = false;

                @Override // java.lang.Thread
                public synchronized void start() {
                    if (this.pcc) {
                        return;
                    }
                    this.pcc = true;
                    super.start();
                }
            };
            this.sf.start();
            this.gm = new Handler(this.sf.getLooper());
        } catch (Throwable th) {
            lo.pcc("TTDispatchThread", "new handlerThread error", th);
        }
    }

    private boolean gm() {
        return (this.sf == null || this.gm == null || !this.sf.isAlive()) ? false : true;
    }
}
