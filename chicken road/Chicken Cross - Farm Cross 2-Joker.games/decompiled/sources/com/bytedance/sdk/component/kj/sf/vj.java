package com.bytedance.sdk.component.kj.sf;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class vj implements ThreadFactory {
    public static volatile boolean gm;
    private final AtomicInteger oo = new AtomicInteger(1);
    protected final ThreadGroup pcc;
    protected final String sf;

    public vj(String str) {
        this.pcc = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.sf = pcc(str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (gm) {
            return null;
        }
        Thread pcc = pcc(this.pcc, runnable, this.sf + "_" + this.oo.getAndIncrement());
        if (pcc.isDaemon()) {
            pcc.setDaemon(false);
        }
        return pcc;
    }

    protected Thread pcc(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    public static String pcc(String str) {
        return "pag_".concat(String.valueOf(str));
    }
}
