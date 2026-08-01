package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ci, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2684ci implements Runnable {
    public final /* synthetic */ C2093Ji A00;

    public RunnableC2684ci(C2093Ji c2093Ji) {
        this.A00 = c2093Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0D;
            if (z) {
                this.A00.A0M();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
