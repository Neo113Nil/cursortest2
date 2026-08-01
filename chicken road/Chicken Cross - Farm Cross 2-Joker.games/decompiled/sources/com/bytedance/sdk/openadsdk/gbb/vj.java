package com.bytedance.sdk.openadsdk.gbb;

import android.app.Activity;
import android.os.Build;

/* loaded from: classes4.dex */
public class vj {
    public static void pcc(Activity activity) {
        if (activity == null || Build.VERSION.SDK_INT == 26) {
            return;
        }
        try {
            if (activity.getRequestedOrientation() == 1) {
                return;
            }
            activity.setRequestedOrientation(1);
        } catch (Throwable unused) {
        }
    }
}
