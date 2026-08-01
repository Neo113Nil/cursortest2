package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes4.dex */
public class qy {
    public static boolean pcc() {
        if (Build.VERSION.SDK_INT < 33) {
            return Build.VERSION.SDK_INT >= 32 && pcc("T", Build.VERSION.CODENAME);
        }
        return true;
    }

    public static boolean pcc(String str, String str2) {
        return !"REL".equals(str2) && str2.toUpperCase(Locale.ROOT).compareTo(str.toUpperCase(Locale.ROOT)) >= 0;
    }
}
