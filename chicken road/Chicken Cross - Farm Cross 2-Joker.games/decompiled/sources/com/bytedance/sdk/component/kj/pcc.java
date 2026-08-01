package com.bytedance.sdk.component.kj;

/* loaded from: classes4.dex */
public class pcc {
    private static com.bytedance.sdk.component.pcc pcc;

    public static void pcc(com.bytedance.sdk.component.pcc pccVar) {
        pcc = pccVar;
    }

    public static void pcc(Runnable runnable) {
        com.bytedance.sdk.component.pcc pccVar = pcc;
        if (pccVar == null) {
            return;
        }
        pccVar.pcc(runnable);
    }
}
