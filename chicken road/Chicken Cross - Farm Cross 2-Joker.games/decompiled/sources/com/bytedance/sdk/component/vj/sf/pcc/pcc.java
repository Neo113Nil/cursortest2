package com.bytedance.sdk.component.vj.sf.pcc;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class pcc implements ThreadFactory {
    private final ThreadGroup pcc;
    private final AtomicInteger sf = new AtomicInteger(1);

    public pcc(String str) {
        this.pcc = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.pcc, runnable, "tt_img_" + this.sf.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
