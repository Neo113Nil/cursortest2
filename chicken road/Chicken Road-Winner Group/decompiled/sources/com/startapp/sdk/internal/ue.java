package com.startapp.sdk.internal;

import android.content.pm.PackageManager;
import java.io.File;

/* loaded from: classes.dex */
public abstract class ue {
    public static boolean a(String str) {
        String[] strArr = ve.f4521c;
        boolean z3 = false;
        for (int i3 = 0; i3 < 14; i3++) {
            if (new File(strArr[i3], str).exists()) {
                z3 = true;
            }
        }
        return z3;
    }

    public static boolean a(PackageManager packageManager, String[] strArr) {
        boolean z3 = false;
        for (String str : strArr) {
            try {
                packageManager.getPackageInfo(str, 0);
                z3 = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z3;
    }
}
