package com.bytedance.sdk.component.pcc;

/* loaded from: classes4.dex */
class kj {
    private static boolean pcc;

    static void pcc(RuntimeException runtimeException) {
        if (pcc) {
            throw runtimeException;
        }
    }
}
