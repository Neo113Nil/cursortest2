package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Sk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1029Sk extends java.lang.Thread {
    public final long A00;

    public C1029Sk(long j) {
        this.A00 = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        while (true) {
            try {
                try {
                    java.lang.Thread.sleep(this.A00);
                } catch (java.lang.Throwable th) {
                    com.facebook.ads.redexgen.core.WU.A00(th, this);
                    return;
                }
            } catch (java.lang.InterruptedException unused) {
            }
            com.facebook.ads.redexgen.core.C1027Si.A01();
        }
    }
}
