package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.cj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2685cj implements Runnable {
    public final /* synthetic */ C2093Ji A00;

    public RunnableC2685cj(C2093Ji c2093Ji) {
        this.A00 = c2093Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2647c7 c2647c7;
        C2647c7 c2647c72;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0C = true;
            c2647c7 = this.A00.A0b;
            if (c2647c7.A0D() != null) {
                c2647c72 = this.A00.A0b;
                c2647c72.A0D().AFw(true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
