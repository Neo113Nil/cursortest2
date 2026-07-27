package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ch, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2683ch implements Runnable {
    public final /* synthetic */ C2093Ji A00;

    public RunnableC2683ch(C2093Ji c2093Ji) {
        this.A00 = c2093Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2607bT c2607bT;
        C2607bT c2607bT2;
        if (WU.A02(this)) {
            return;
        }
        try {
            c2607bT = this.A00.A09;
            if (c2607bT != null && this.A00.getResources().getConfiguration().orientation == 1) {
                c2607bT2 = this.A00.A09;
                c2607bT2.A0A();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
