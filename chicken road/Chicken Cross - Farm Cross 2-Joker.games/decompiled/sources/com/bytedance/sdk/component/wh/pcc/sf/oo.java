package com.bytedance.sdk.component.wh.pcc.sf;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.wh.pcc.qf;
import com.bytedance.sdk.component.wh.pcc.vj;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public class oo {
    private volatile Handler ork;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.wh.pcc.oo.pcc> tmg;
    private final Comparator<com.bytedance.sdk.component.wh.pcc.oo.pcc> vh;
    private volatile com.bytedance.sdk.component.wh.pcc.sf.sf.gm vy;
    public static final oo pcc = new oo();
    public static final com.bytedance.sdk.component.wh.pcc.sf.pcc.pcc oo = new com.bytedance.sdk.component.wh.pcc.sf.pcc.pcc();
    public static final AtomicLong vj = new AtomicLong(0);
    public static final AtomicLong wh = new AtomicLong(0);
    public static final long qf = System.currentTimeMillis();
    public static long kj = 0;
    public volatile boolean sf = false;
    public volatile boolean gm = false;

    public PriorityBlockingQueue<com.bytedance.sdk.component.wh.pcc.oo.pcc> pcc() {
        return this.tmg;
    }

    private oo() {
        Comparator<com.bytedance.sdk.component.wh.pcc.oo.pcc> comparator = new Comparator<com.bytedance.sdk.component.wh.pcc.oo.pcc>() { // from class: com.bytedance.sdk.component.wh.pcc.sf.oo.1
            @Override // java.util.Comparator
            /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar, com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar2) {
                return oo.this.pcc(pccVar, pccVar2);
            }
        };
        this.vh = comparator;
        this.tmg = new PriorityBlockingQueue<>(8, comparator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int pcc(com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar, com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar2) {
        long j;
        long j2;
        long j3;
        long j4;
        if (pccVar == null) {
            return pccVar2 == null ? 0 : -1;
        }
        if (pccVar2 == null) {
            return 1;
        }
        if (pccVar.vj() == pccVar2.vj()) {
            if (pccVar.pcc() != null) {
                j = pccVar.pcc().pcc();
                j2 = pccVar.pcc().sf();
            } else {
                j = 0;
                j2 = 0;
            }
            if (pccVar2.pcc() != null) {
                j4 = pccVar2.pcc().pcc();
                j3 = pccVar2.pcc().sf();
            } else {
                j3 = 0;
                j4 = 0;
            }
            if (j == 0 || j4 == 0) {
                return 0;
            }
            long j5 = j - j4;
            if (Math.abs(j5) > 2147483647L) {
                return 0;
            }
            if (j5 != 0) {
                return (int) j5;
            }
            if (j2 == 0 || j3 == 0) {
                return 0;
            }
            return (int) (j2 - j3);
        }
        return pccVar.vj() - pccVar2.vj();
    }

    public void sf() {
        oo();
        vj();
    }

    public void pcc(Handler handler) {
        this.ork = handler;
    }

    public void gm() {
        if (this.vy == null || !this.vy.isAlive()) {
            return;
        }
        synchronized (this) {
            if (this.vy != null && this.vy.isAlive()) {
                if (this.ork != null) {
                    this.ork.removeCallbacksAndMessages(null);
                }
                this.vy.pcc(false);
                this.vy.quitSafely();
                this.vy = null;
            }
        }
    }

    public boolean oo() {
        try {
            if (this.vy != null || com.bytedance.sdk.component.wh.pcc.sf.sf()) {
                return false;
            }
            synchronized (this) {
                if (this.vy != null) {
                    return false;
                }
                this.vy = new com.bytedance.sdk.component.wh.pcc.sf.sf.gm(this.tmg);
                this.vy.start();
                return true;
            }
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public void pcc(com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar, int i) {
        oo();
        vj jr = qf.wh().jr();
        com.bytedance.sdk.component.wh.pcc.sf.sf.gm gmVar = this.vy;
        if (gmVar != null) {
            pcc(jr, pccVar);
            gmVar.pcc(pccVar, pccVar.vj() == 4);
        }
    }

    private void pcc(final vj vjVar, com.bytedance.sdk.component.wh.pcc.oo.pcc pccVar) {
        if (vjVar != null) {
            try {
                if (vjVar.qf()) {
                    final long sf = (pccVar == null || pccVar.pcc() == null) ? 0L : pccVar.pcc().sf();
                    if (sf == 1) {
                        kj = System.currentTimeMillis();
                    }
                    AtomicLong vr = oo.vr();
                    com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(vr, 1);
                    if (vr.get() == 200) {
                        if (Looper.getMainLooper() == Looper.myLooper()) {
                            Executor oo2 = vjVar.oo();
                            if (oo2 == null) {
                                oo2 = vjVar.vj();
                            }
                            if (oo2 != null) {
                                oo2.execute(new com.bytedance.sdk.component.wh.pcc.vj.vj("report") { // from class: com.bytedance.sdk.component.wh.pcc.sf.oo.2
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        oo.this.pcc(vjVar, sf);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        pcc(vjVar, sf);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(vj vjVar, long j) {
        com.bytedance.sdk.component.wh.pcc.sf.sf.gm gmVar = this.vy;
        if (vjVar == null || gmVar == null) {
            return;
        }
        com.bytedance.sdk.component.wh.pcc.sf.pcc.pcc pccVar = oo;
        gmVar.pcc(vjVar.pcc(pccVar.sf(j)), true);
        pccVar.xb();
    }

    public void vj() {
        com.bytedance.sdk.component.wh.pcc.gm.sf.pcc(oo.mu(), 1);
        final com.bytedance.sdk.component.wh.pcc.sf.sf.gm gmVar = this.vy;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (gmVar != null) {
                gmVar.gm(2);
                return;
            }
            return;
        }
        vj jr = qf.wh().jr();
        if (jr != null) {
            Executor oo2 = jr.oo();
            if (oo2 == null) {
                oo2 = jr.vj();
            }
            if (oo2 != null) {
                oo2.execute(new com.bytedance.sdk.component.wh.pcc.vj.vj("flush") { // from class: com.bytedance.sdk.component.wh.pcc.sf.oo.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.wh.pcc.sf.sf.gm gmVar2 = gmVar;
                        if (gmVar2 != null) {
                            gmVar2.gm(2);
                        }
                    }
                });
            }
        }
    }
}
