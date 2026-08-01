package com.bytedance.sdk.openadsdk.qy.pcc;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.kj;

/* loaded from: classes4.dex */
public class pcc {
    private static Handler pcc;
    private static HandlerThread sf;

    public static Handler pcc() {
        HandlerThread handlerThread;
        try {
            handlerThread = sf;
        } catch (Throwable unused) {
        }
        if (handlerThread != null && handlerThread.isAlive()) {
            if (pcc == null) {
                synchronized (pcc.class) {
                    if (pcc == null) {
                        pcc = new Handler(sf.getLooper());
                    }
                }
            }
            return pcc;
        }
        synchronized (pcc.class) {
            HandlerThread handlerThread2 = sf;
            if (handlerThread2 == null || !handlerThread2.isAlive()) {
                sf = kj.pcc("pag_ev");
                pcc = new Handler(sf.getLooper());
            }
        }
        return pcc;
    }
}
