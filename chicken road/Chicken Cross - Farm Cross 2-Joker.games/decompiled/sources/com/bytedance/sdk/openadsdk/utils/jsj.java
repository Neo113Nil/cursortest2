package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.ironsource.Q3;

/* loaded from: classes4.dex */
public class jsj {
    public static String pcc(Context context) {
        int pcc = com.bytedance.sdk.component.utils.jsj.pcc(context, 0L);
        if (pcc == 2) {
            return "2g";
        }
        if (pcc == 3) {
            return Q3.f7855a;
        }
        if (pcc == 4) {
            return Q3.b;
        }
        if (pcc == 5) {
            return "4g";
        }
        if (pcc == 6) {
            return "5g";
        }
        return "mobile";
    }
}
