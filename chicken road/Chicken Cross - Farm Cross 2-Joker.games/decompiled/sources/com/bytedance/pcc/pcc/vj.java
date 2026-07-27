package com.bytedance.pcc.pcc;

/* loaded from: classes4.dex */
public class vj {
    public static int pcc() {
        long maxMemory = Runtime.getRuntime().maxMemory();
        long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (maxMemory == 0) {
            return -1;
        }
        return 100 - ((int) ((freeMemory * 100.0f) / maxMemory));
    }

    public static float pcc(boolean z) {
        int pcc = pcc();
        if (pcc < 0) {
            return 1.0f;
        }
        if (pcc < 30) {
            return z ? 0.1f : 2.0f;
        }
        if (pcc < 60) {
            return z ? 0.5f : 1.5f;
        }
        return 1.0f;
    }
}
