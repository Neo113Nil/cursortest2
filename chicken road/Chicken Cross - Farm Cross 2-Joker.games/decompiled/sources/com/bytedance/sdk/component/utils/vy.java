package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes4.dex */
public class vy {
    private static volatile Handler pcc;

    public static Handler pcc() {
        return com.bytedance.sdk.component.kj.pcc.pcc.pcc().sf();
    }

    public static Handler sf() {
        if (pcc == null) {
            synchronized (vy.class) {
                if (pcc == null) {
                    pcc = new Handler(Looper.getMainLooper());
                }
            }
        }
        return pcc;
    }
}
