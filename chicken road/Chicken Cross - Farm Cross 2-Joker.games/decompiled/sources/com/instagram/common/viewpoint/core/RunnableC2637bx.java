package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.bx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2637bx implements Runnable {
    public final /* synthetic */ C2113Kc A00;

    public RunnableC2637bx(C2113Kc c2113Kc) {
        this.A00 = c2113Kc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A03 = true;
            if (((AbstractC2643c3) this.A00).A07.A0D() != null) {
                ((AbstractC2643c3) this.A00).A07.A0D().AFw(true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
