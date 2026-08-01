package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public class qy {
    private static volatile String pcc;

    public static String pcc() {
        if (!TextUtils.isEmpty(pcc)) {
            return pcc;
        }
        String str = Build.MODEL;
        pcc = str;
        return str;
    }

    public static int pcc(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().icon;
        } catch (Exception unused) {
            return 0;
        }
    }
}
