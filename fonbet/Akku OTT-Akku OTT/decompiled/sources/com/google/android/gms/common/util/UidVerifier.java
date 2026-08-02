package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.j;
import com.google.android.gms.common.k;
import com.google.android.gms.common.wrappers.c;
import com.google.android.gms.common.wrappers.d;

/* loaded from: classes4.dex */
public final class UidVerifier {
    private UidVerifier() {
    }

    public static boolean isGooglePlayServicesUid(@NonNull Context context, int i) {
        if (uidHasPackageName(context, i, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                k a = k.a(context);
                a.getClass();
                return packageInfo != null && (k.d(packageInfo, false) || (k.d(packageInfo, true) && j.a(a.a)));
            } catch (PackageManager.NameNotFoundException unused) {
                Log.isLoggable("UidVerifier", 3);
            }
        }
        return false;
    }

    @TargetApi(19)
    public static boolean uidHasPackageName(@NonNull Context context, int i, @NonNull String str) {
        c a = d.a(context);
        a.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a.a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
