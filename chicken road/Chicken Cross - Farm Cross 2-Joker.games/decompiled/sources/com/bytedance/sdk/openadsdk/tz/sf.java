package com.bytedance.sdk.openadsdk.tz;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class sf {
    private int oo;
    private kj sf;
    private pcc vj;
    private ScheduledExecutorService pcc = null;
    private long gm = 0;

    public interface pcc {
    }

    public sf(kj kjVar, int i) {
        this.sf = kjVar;
        this.oo = i;
    }

    public void pcc(long j) {
        this.gm = j;
    }

    public void pcc(int i) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.pcc = newScheduledThreadPool;
        newScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tz.sf.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = sf.this.gm;
                if (System.currentTimeMillis() - sf.this.gm > sf.this.oo) {
                    sf.this.pcc.shutdown();
                    if (sf.this.sf != null) {
                        sf.this.sf.sf(0, "Automatic detection of stuck");
                    }
                    if (sf.this.vj != null) {
                        pcc unused2 = sf.this.vj;
                    }
                }
            }
        }, 0L, i, TimeUnit.MILLISECONDS);
    }

    public void pcc() {
        ScheduledExecutorService scheduledExecutorService = this.pcc;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }

    public boolean sf() {
        ScheduledExecutorService scheduledExecutorService = this.pcc;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }
}
