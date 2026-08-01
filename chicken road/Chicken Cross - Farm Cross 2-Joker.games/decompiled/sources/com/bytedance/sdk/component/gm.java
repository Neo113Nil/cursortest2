package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public class gm {
    private static volatile Handler sf;
    private static final Object pcc = new Object();
    private static final LinkedList<Runnable> gm = new LinkedList<>();
    private static Object oo = new Object();

    public static void pcc(Runnable runnable, boolean z) {
        try {
            Handler sf2 = sf();
            synchronized (pcc) {
                gm.add(runnable);
                if (z) {
                    sf2.sendEmptyMessageDelayed(1, 100L);
                } else {
                    sf2.sendEmptyMessage(1);
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }

    private static Handler sf() {
        Handler handler;
        if (sf == null) {
            synchronized (pcc) {
                if (sf == null) {
                    HandlerThread pcc2 = sf.pcc != null ? sf.pcc.pcc("queued-work-looper", -2) : null;
                    if (pcc2 == null) {
                        pcc2 = new HandlerThread("queued-work-looper", -2);
                        pcc2.start();
                    }
                    sf = new pcc(pcc2.getLooper());
                }
                handler = sf;
            }
            return handler;
        }
        return sf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void gm() {
        LinkedList linkedList;
        synchronized (oo) {
            synchronized (pcc) {
                LinkedList<Runnable> linkedList2 = gm;
                linkedList = (LinkedList) linkedList2.clone();
                linkedList2.clear();
                sf().removeMessages(1);
            }
            if (linkedList.size() > 0) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }
    }

    private static class pcc extends Handler {
        pcc(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    gm.gm();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }
}
