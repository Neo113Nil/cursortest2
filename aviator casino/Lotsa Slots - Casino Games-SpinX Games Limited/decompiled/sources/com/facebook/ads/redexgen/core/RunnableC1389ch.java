package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ch, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1389ch implements java.lang.Runnable {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0799Ji A00;

    public RunnableC1389ch(com.facebook.ads.redexgen.core.C0799Ji c0799Ji) {
        this.A00 = c0799Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.facebook.ads.redexgen.core.C1313bT c1313bT;
        com.facebook.ads.redexgen.core.C1313bT c1313bT2;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            c1313bT = this.A00.A09;
            if (c1313bT != null && this.A00.getResources().getConfiguration().orientation == 1) {
                c1313bT2 = this.A00.A09;
                c1313bT2.A0A();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
