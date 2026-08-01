package com.bytedance.sdk.component.utils;

import android.os.HandlerThread;

/* loaded from: classes4.dex */
public class kj {
    public static volatile boolean pcc;
    private static HandlerThread sf;

    public static void pcc(HandlerThread handlerThread) {
        sf = handlerThread;
    }

    public static HandlerThread pcc(String str) {
        return pcc(str, 0);
    }

    public static HandlerThread pcc(String str, int i) {
        if (pcc) {
            return sf;
        }
        try {
            HandlerThread handlerThread = new HandlerThread(str, i) { // from class: com.bytedance.sdk.component.utils.kj.1
                boolean pcc = false;

                @Override // java.lang.Thread
                public synchronized void start() {
                    if (this.pcc) {
                        return;
                    }
                    this.pcc = true;
                    super.start();
                }
            };
            handlerThread.start();
            return handlerThread;
        } catch (Throwable th) {
            lo.pcc("HandlerThreadUtils", "new handlerThread error", th);
            return sf;
        }
    }
}
