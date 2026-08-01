package com.bytedance.sdk.openadsdk.qy.sf;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.lo;

/* loaded from: classes4.dex */
public class qf {
    private static pcc pcc;
    private static HandlerThread sf;

    public static void pcc() {
    }

    public static void pcc(sf sfVar) {
        if (sfVar == null) {
            return;
        }
        sf();
        pcc pccVar = pcc;
        if (pccVar != null) {
            pccVar.pcc(sfVar);
        }
    }

    public static void sf(sf sfVar) {
        if (sfVar == null || pcc == null) {
            return;
        }
        try {
            int intValue = sfVar.vh().intValue();
            if (pcc.hasMessages(intValue)) {
                pcc.removeMessages(intValue);
            }
        } catch (Exception unused) {
        }
    }

    public static void sf() {
        if (pcc != null) {
            return;
        }
        try {
            HandlerThread handlerThread = sf;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (qf.class) {
                HandlerThread handlerThread2 = sf;
                if (handlerThread2 == null || !handlerThread2.isAlive()) {
                    sf = com.bytedance.sdk.component.utils.kj.pcc("pag_MRC");
                    pcc = new pcc(sf.getLooper());
                }
            }
        } catch (Throwable th) {
            lo.gm("MRC", th.getMessage());
        }
    }

    private static class pcc extends Handler {
        public pcc(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sf sfVar = (sf) message.obj;
            if (sfVar == null) {
                return;
            }
            int sf = sfVar.sf();
            if (sf == 1) {
                sfVar.qf();
            } else if (sf == 2) {
                sfVar.kj();
            } else {
                vj.sf(sfVar.vh());
                return;
            }
            if (sfVar.vy()) {
                vj.sf(sfVar.vh());
            } else if (sfVar.tmg()) {
                pcc(sfVar);
            }
        }

        public void pcc(sf sfVar) {
            if (sfVar == null) {
                return;
            }
            int intValue = sfVar.vh().intValue();
            if (hasMessages(intValue)) {
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = intValue;
            obtain.obj = sfVar;
            sendMessageDelayed(obtain, sfVar.wh());
        }
    }
}
