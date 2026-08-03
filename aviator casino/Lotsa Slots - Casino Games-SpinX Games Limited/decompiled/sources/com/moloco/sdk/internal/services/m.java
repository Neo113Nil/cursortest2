package com.moloco.sdk.internal.services;

/* loaded from: classes5.dex */
public final class m {
    public static final android.content.pm.PackageInfo a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), android.content.pm.PackageManager.PackageInfoFlags.of(0L));
            kotlin.jvm.internal.Intrinsics.checkNotNull(packageInfo);
            return packageInfo;
        }
        android.content.pm.PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(packageInfo2);
        return packageInfo2;
    }
}
