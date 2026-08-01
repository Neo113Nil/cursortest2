package com.bykv.vk.openvk.pcc.pcc.sf.sf;

import android.os.Looper;

/* loaded from: classes5.dex */
public final class pcc {
    public static boolean pcc() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}
