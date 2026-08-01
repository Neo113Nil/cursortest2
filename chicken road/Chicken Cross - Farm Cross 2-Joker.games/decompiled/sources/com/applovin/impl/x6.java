package com.applovin.impl;

/* loaded from: classes5.dex */
public class x6 extends n5 {
    private final Runnable g;

    public x6(com.applovin.impl.sdk.l lVar, String str, Runnable runnable) {
        this(lVar, false, str, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.g.run();
    }

    public x6(com.applovin.impl.sdk.l lVar, boolean z, String str, Runnable runnable) {
        super("TaskRunnable:" + str, lVar, z);
        this.g = runnable;
    }
}
