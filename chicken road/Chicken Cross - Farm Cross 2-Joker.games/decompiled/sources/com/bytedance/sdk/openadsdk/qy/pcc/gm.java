package com.bytedance.sdk.openadsdk.qy.pcc;

import com.bytedance.sdk.openadsdk.core.model.of;

/* loaded from: classes4.dex */
public class gm {
    public static String gm = "engaged_view";
    public static boolean pcc = false;
    public static int sf = 6;

    public static void pcc(of ofVar) {
        sf gm2 = gm(ofVar);
        if (gm2 == null) {
            return;
        }
        gm2.pcc();
    }

    public static void sf(of ofVar) {
        sf gm2 = gm(ofVar);
        if (gm2 == null) {
            return;
        }
        gm2.sf();
    }

    public static void pcc(of ofVar, int i) {
        sf gm2 = gm(ofVar);
        if (gm2 == null || gm2.gm()) {
            return;
        }
        gm2.pcc(i);
    }

    public static void pcc(of ofVar, boolean z) {
        sf gm2 = gm(ofVar);
        if (gm2 == null || gm2.gm()) {
            return;
        }
        gm2.pcc(z);
        gm2.pcc(z ? 4 : 8);
    }

    private static sf gm(of ofVar) {
        if (ofVar == null || !ofVar.feh()) {
            return null;
        }
        return ofVar.ap();
    }
}
