package com.inmobi.media;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.bb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3593bb {
    public static boolean a(Context context, String bundleId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            if (Build.VERSION.SDK_INT >= 33) {
                packageManager.getPackageInfo(bundleId, PackageManager.PackageInfoFlags.of(0L));
                return true;
            }
            packageManager.getPackageInfo(bundleId, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
