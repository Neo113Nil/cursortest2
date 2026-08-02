package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.eG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1209eG implements Runnable {
    public final /* synthetic */ C1212eJ A00;

    public RunnableC1209eG(C1212eJ c1212eJ) {
        this.A00 = c1212eJ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0A();
            handler = this.A00.A01;
            handler.removeCallbacks(this);
            handler2 = this.A00.A01;
            handler2.postDelayed(this, 250L);
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
