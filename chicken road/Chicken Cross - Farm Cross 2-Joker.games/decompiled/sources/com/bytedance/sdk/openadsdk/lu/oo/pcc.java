package com.bytedance.sdk.openadsdk.lu.oo;

/* loaded from: classes4.dex */
public class pcc {
    public static long pcc() {
        long currentTimeMillis = System.currentTimeMillis();
        return currentTimeMillis - (currentTimeMillis % 86400000);
    }

    public static boolean pcc(long j) {
        return j - (j % 86400000) == pcc();
    }
}
