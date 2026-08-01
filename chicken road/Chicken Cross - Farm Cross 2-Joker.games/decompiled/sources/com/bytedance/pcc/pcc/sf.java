package com.bytedance.pcc.pcc;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.pcc.gm;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public class sf implements Handler.Callback, com.bytedance.pcc.oo {
    private volatile gm oo;
    private final Context pcc;
    private final gm.vj sf;
    private volatile Handler vj;
    private volatile Handler wh;
    private final ConcurrentHashMap<Class<? extends com.bytedance.pcc.pcc>, qf<? extends com.bytedance.pcc.pcc>> gm = new ConcurrentHashMap<>();
    private volatile boolean qf = false;

    public sf(Context context, gm.vj vjVar) {
        this.pcc = context;
        this.sf = vjVar;
        vjVar.sf(true);
        new StringBuilder("init() called with: config = [").append(vjVar);
        for (Map.Entry<Class<? extends com.bytedance.pcc.pcc>, com.bytedance.pcc.sf<? extends com.bytedance.pcc.pcc>> entry : vjVar.vj().entrySet()) {
            Class<? extends com.bytedance.pcc.pcc> key = entry.getKey();
            this.gm.put(key, new qf<>(this, entry.getValue()));
            new StringBuilder("registered event = [").append(key);
        }
        new HandlerThread("AppLogS") { // from class: com.bytedance.pcc.pcc.sf.1
            @Override // android.os.HandlerThread
            protected void onLooperPrepared() {
                sf.this.wh = new Handler(getLooper(), sf.this);
                sf.this.oo();
            }
        }.start();
        new HandlerThread("AppLogU") { // from class: com.bytedance.pcc.pcc.sf.2
            @Override // android.os.HandlerThread
            protected void onLooperPrepared() {
                sf.this.vj = new Handler(getLooper(), sf.this);
                sf.this.oo();
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oo() {
        if (this.vj == null || this.wh == null) {
            return;
        }
        for (qf<? extends com.bytedance.pcc.pcc> qfVar : this.gm.values()) {
            try {
                qfVar.pcc(pcc());
                pcc((qf) qfVar, false);
                com.bytedance.pcc.pcc.pcc.pcc oo = qfVar.oo();
                if (oo != null) {
                    oo.pcc(this.vj.getLooper(), qfVar);
                }
            } catch (Exception unused) {
            }
        }
        this.qf = true;
    }

    @Override // com.bytedance.pcc.oo
    public boolean pcc(com.bytedance.pcc.pcc pccVar) {
        if (pccVar == null || !com.bytedance.pcc.pcc.pcc.pcc) {
            return false;
        }
        qf<? extends com.bytedance.pcc.pcc> qfVar = this.gm.get(pccVar.getClass());
        if (qfVar == null) {
            pccVar.getClass().getSimpleName();
            return false;
        }
        if (!this.qf) {
            new StringBuilder("reportEvent: init not finished, save event to thread pool, ").append(pccVar);
            sf(pccVar);
            return true;
        }
        if (this.sf.vy()) {
            sf(pccVar);
        } else {
            this.wh.sendMessage(this.wh.obtainMessage(1000, pccVar));
        }
        com.bytedance.pcc.pcc.pcc.pcc oo = qfVar.oo();
        if (oo != null) {
            oo.pcc(1);
        }
        return true;
    }

    private void sf(final com.bytedance.pcc.pcc pccVar) {
        gm.oo sf = this.sf.sf();
        ExecutorService pcc2 = sf != null ? sf.pcc() : null;
        if (pcc2 == null) {
            pcc2 = com.bytedance.pcc.pcc.sf.pcc.sf();
        }
        new StringBuilder("submit save task to thread pool, ").append(pccVar);
        pcc2.execute(new pcc(pccVar.qf()) { // from class: com.bytedance.pcc.pcc.sf.3
            @Override // com.bytedance.pcc.pcc.sf.pcc
            public void pcc() {
                sf.this.pcc((com.bytedance.pcc.pcc<?>) pccVar, true);
            }
        });
    }

    public gm pcc() {
        if (this.oo == null) {
            synchronized (this) {
                if (this.oo == null) {
                    this.oo = new gm(this.pcc, this, this.sf);
                }
            }
        }
        return this.oo;
    }

    public ConcurrentHashMap<Class<? extends com.bytedance.pcc.pcc>, qf<? extends com.bytedance.pcc.pcc>> sf() {
        return this.gm;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (!com.bytedance.pcc.pcc.pcc.pcc) {
            return true;
        }
        try {
            switch (message.what) {
                case 1000:
                    Object obj = message.obj;
                    if (obj instanceof com.bytedance.pcc.pcc) {
                        pcc((com.bytedance.pcc.pcc<?>) obj, false);
                        break;
                    } else {
                        obj.getClass().getSimpleName();
                        break;
                    }
                case 1001:
                    gm((qf) message.obj);
                    break;
                case 1002:
                    qf qfVar = (qf) message.obj;
                    if (this.sf.ork()) {
                        qfVar.wh(pcc());
                        break;
                    } else {
                        qfVar.pcc(pcc(), this.sf.kj());
                        break;
                    }
                case 1003:
                    ((qf) message.obj).oo(pcc());
                    break;
                case 1004:
                    ((qf) message.obj).vj(pcc());
                    break;
            }
        } catch (Exception unused) {
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bytedance.pcc.pcc<?> pccVar, boolean z) {
        new StringBuilder("begin process new event ").append(pccVar);
        qf<? extends com.bytedance.pcc.pcc> qfVar = this.gm.get(pccVar.getClass());
        if (qfVar == null) {
            pccVar.getClass().getSimpleName();
            return;
        }
        int pcc2 = qfVar.pcc((qf<? extends com.bytedance.pcc.pcc>) pccVar);
        if ((pcc2 & 4) == 4 && this.sf.pcc()) {
            new StringBuilder("onNewEvent: immediately upload after receive event = [").append(pccVar);
            qfVar.sf(pcc());
        }
        if (z || (pcc2 & 2) == 2) {
            if (this.wh != null) {
                this.wh.removeMessages(1001, qfVar);
            }
            new StringBuilder("onNewEvent: save event to disk immediately = [").append(pccVar);
            gm(qfVar);
        } else if (this.wh != null && !this.wh.hasMessages(1001, qfVar)) {
            this.wh.sendMessageDelayed(this.wh.obtainMessage(1001, qfVar), qfVar.vh());
            qfVar.vh();
        }
        com.bytedance.pcc.pcc.pcc.pcc oo = qfVar.oo();
        if (oo != null) {
            oo.pcc();
        }
    }

    private void gm(qf qfVar) {
        if (qfVar.gm() == 0) {
            new StringBuilder("saveEventToDisk: eventInMemoryCount is 0, no need to save to disk, ").append(qfVar.pcc());
            return;
        }
        boolean pcc2 = qfVar.pcc(this.sf, pcc());
        new StringBuilder("saveEventToDisk: saveSuccess = ").append(pcc2).append(", ").append(qfVar.pcc());
        if (this.vj != null) {
            if (pcc2) {
                boolean z = true;
                boolean z2 = (this.vj.hasMessages(1002, qfVar) || qfVar.vy()) ? false : true;
                boolean z3 = !this.sf.vy();
                if (z2 || !qfVar.ork()) {
                    z = z2;
                } else {
                    new StringBuilder("saveEventToDisk: force setup upload task for too many new saved events, ").append(qfVar.pcc());
                    z3 = true;
                }
                if (z) {
                    pcc(qfVar, z3);
                    return;
                }
                return;
            }
            qfVar.sf(pcc());
        }
    }

    public void pcc(qf qfVar, boolean z, boolean z2, boolean z3) {
        if (z2 && !z) {
            new StringBuilder("setupAutoUploadTask: upload success, and no more data, ").append(qfVar.pcc());
            return;
        }
        if (z2 && z3) {
            new StringBuilder("setupAutoUploadTask: upload success, reset upload task, ").append(qfVar.pcc());
        } else if (this.vj.hasMessages(1002, qfVar)) {
            return;
        }
        pcc(qfVar, z2 && z);
    }

    private void pcc(qf qfVar, boolean z) {
        long vj = z ? 0L : qfVar.vj();
        this.vj.removeMessages(1002, qfVar);
        this.vj.sendMessageDelayed(this.vj.obtainMessage(1002, qfVar), vj);
        new StringBuilder("scheduleNextUploadTask: send MSG_UPLOAD_EVENT with delay ").append(vj).append(", ").append(qfVar.pcc());
    }

    public gm.vj gm() {
        return this.sf;
    }

    public void pcc(qf qfVar) {
        if (this.vj.hasMessages(1003, qfVar)) {
            return;
        }
        this.vj.sendMessageDelayed(this.vj.obtainMessage(1003, qfVar), this.sf.qf());
    }

    public void sf(qf qfVar) {
        if (this.vj.hasMessages(1004, qfVar)) {
            return;
        }
        this.vj.sendMessageDelayed(this.vj.obtainMessage(1004, qfVar), this.sf.qf());
    }

    private static abstract class pcc implements Comparable<pcc>, Runnable {
        private final int pcc;

        protected abstract void pcc();

        public pcc(int i) {
            this.pcc = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            pcc();
        }

        @Override // java.lang.Comparable
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public int compareTo(pcc pccVar) {
            return pccVar.pcc - this.pcc;
        }
    }
}
