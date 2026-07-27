package com.bytedance.sdk.component.utils;

/* loaded from: classes4.dex */
public class jr {
    private static String gm = "";
    private static boolean pcc = false;
    private static int sf = 4;

    public static void pcc(String str) {
        gm = str;
    }

    public static void pcc(int i) {
        sf = i;
    }

    public static void pcc() {
        pcc = true;
        pcc(3);
    }

    public static void sf() {
        pcc = false;
        pcc(7);
    }

    public static boolean gm() {
        return pcc;
    }
}
