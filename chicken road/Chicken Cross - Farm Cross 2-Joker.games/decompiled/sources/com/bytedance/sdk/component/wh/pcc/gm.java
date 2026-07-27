package com.bytedance.sdk.component.wh.pcc;

/* loaded from: classes4.dex */
public class gm {
    public static void pcc(Object obj, String str) {
        if (obj == null) {
            pcc(str);
        }
    }

    public static void pcc(String str) {
        throw new IllegalArgumentException(str);
    }
}
