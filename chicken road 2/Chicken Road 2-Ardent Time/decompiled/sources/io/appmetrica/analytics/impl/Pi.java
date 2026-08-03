package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Pi {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4845a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.services.SafePackageManager f4846b;

    public Pi(android.content.Context context, io.appmetrica.analytics.coreutils.internal.services.SafePackageManager safePackageManager) {
        this.f4845a = context;
        this.f4846b = safePackageManager;
    }

    public final java.util.ArrayList a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        io.appmetrica.analytics.coreutils.internal.services.SafePackageManager safePackageManager = this.f4846b;
        android.content.Context context = this.f4845a;
        android.content.pm.PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), io.appmetrica.analytics.coreutils.internal.io.Base64Utils.IO_BUFFER_SIZE);
        if (packageInfo == null) {
            return arrayList;
        }
        java.lang.String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr == null) {
            return arrayList;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            java.lang.String str = strArr[i2];
            if (iArr == null || iArr.length <= i2 || (iArr[i2] & 2) == 0) {
                arrayList.add(new io.appmetrica.analytics.coreapi.internal.permission.PermissionState(str, false));
            } else {
                arrayList.add(new io.appmetrica.analytics.coreapi.internal.permission.PermissionState(str, true));
            }
        }
        return arrayList;
    }
}
