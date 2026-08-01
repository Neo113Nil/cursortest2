package com.bytedance.sdk.component.kj.pcc;

import android.os.Handler;

/* loaded from: classes4.dex */
public abstract class wh {
    public final Handler pcc;

    public abstract boolean pcc();

    public wh(Handler handler) {
        this.pcc = handler;
    }

    public void pcc(final Runnable runnable) {
        if (pcc()) {
            gm(new Runnable() { // from class: com.bytedance.sdk.component.kj.pcc.wh$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    wh.this.vj(runnable);
                }
            });
            return;
        }
        Handler handler = this.pcc;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void vj(Runnable runnable) {
        Handler handler = this.pcc;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public void pcc(final Runnable runnable, final long j) {
        if (pcc()) {
            gm(new Runnable() { // from class: com.bytedance.sdk.component.kj.pcc.wh$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    wh.this.sf(runnable, j);
                }
            });
            return;
        }
        Handler handler = this.pcc;
        if (handler != null) {
            handler.postDelayed(runnable, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void sf(Runnable runnable, long j) {
        Handler handler = this.pcc;
        if (handler != null) {
            handler.postDelayed(runnable, j);
        }
    }

    public void sf(final Runnable runnable) {
        if (pcc()) {
            gm(new Runnable() { // from class: com.bytedance.sdk.component.kj.pcc.wh$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    wh.this.oo(runnable);
                }
            });
            return;
        }
        Handler handler = this.pcc;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void oo(Runnable runnable) {
        Handler handler = this.pcc;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    protected void gm(Runnable runnable) {
        vj.pcc().pcc(runnable);
    }
}
