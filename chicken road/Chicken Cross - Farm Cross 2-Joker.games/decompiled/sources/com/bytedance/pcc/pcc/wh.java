package com.bytedance.pcc.pcc;

import android.content.Context;

/* loaded from: classes4.dex */
public class wh {
    private static Context pcc;

    public static void pcc(Context context) {
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            pcc = applicationContext;
        } else {
            pcc = context;
        }
    }

    public static Context pcc() {
        return pcc;
    }
}
