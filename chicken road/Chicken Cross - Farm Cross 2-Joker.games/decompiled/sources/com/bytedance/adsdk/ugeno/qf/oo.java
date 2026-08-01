package com.bytedance.adsdk.ugeno.qf;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes4.dex */
public final class oo {
    private static Context gm;
    private static String pcc;
    private static Resources sf;

    public static void pcc(String str) {
        pcc = str;
    }

    private static String pcc(Context context) {
        if (pcc == null) {
            pcc = context.getPackageName();
        }
        return pcc;
    }

    private static int pcc(Context context, String str, String str2) {
        if (sf == null) {
            sf = context.getResources();
        }
        return sf.getIdentifier(str, str2, pcc(context));
    }

    public static int pcc(Context context, String str) {
        return pcc(context, str, "raw");
    }

    public static int sf(Context context, String str) {
        return pcc(context, str, "drawable");
    }
}
