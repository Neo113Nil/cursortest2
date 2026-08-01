package com.bytedance.adsdk.ugeno.qf;

import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class ork implements Runnable {
    private WeakReference<Runnable> pcc;

    public ork(Runnable runnable) {
        this.pcc = new WeakReference<>(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.pcc.get();
        if (runnable != null) {
            runnable.run();
        }
    }
}
