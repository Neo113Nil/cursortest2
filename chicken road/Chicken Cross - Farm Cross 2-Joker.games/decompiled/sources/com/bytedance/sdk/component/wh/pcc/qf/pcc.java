package com.bytedance.sdk.component.wh.pcc.qf;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.wh.pcc.qf;
import com.bytedance.sdk.component.wh.pcc.vj;

/* loaded from: classes4.dex */
public class pcc {
    private static int gm = 3000;
    private static volatile HandlerThread pcc;
    private static volatile Handler sf;

    static {
        gm();
    }

    private static void gm() {
        HandlerThread pcc2;
        vj jr = qf.wh().jr();
        if (jr != null && (pcc2 = jr.pcc("csj_ad_log", 10)) != null) {
            pcc = pcc2;
            return;
        }
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        pcc = handlerThread;
        handlerThread.start();
    }

    public static Handler pcc() {
        if (pcc == null || !pcc.isAlive()) {
            synchronized (pcc.class) {
                if (pcc == null || !pcc.isAlive()) {
                    gm();
                    sf = new Handler(pcc.getLooper());
                }
            }
        } else if (sf == null) {
            synchronized (pcc.class) {
                if (sf == null) {
                    sf = new Handler(pcc.getLooper());
                }
            }
        }
        return sf;
    }

    public static int sf() {
        if (gm <= 0) {
            gm = 3000;
        }
        return gm;
    }
}
