package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class Y4 implements java.util.concurrent.Executor {
    public static final com.facebook.ads.redexgen.core.Y4 A01 = new com.facebook.ads.redexgen.core.Y4();
    public final android.os.Handler A00 = new android.os.Handler(android.os.Looper.getMainLooper());

    public static void A00(java.lang.Runnable runnable) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            runnable.run();
        } else {
            A01.execute(runnable);
        }
    }

    public final android.os.Handler A01() {
        return this.A00;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.A00.post(runnable);
    }
}
