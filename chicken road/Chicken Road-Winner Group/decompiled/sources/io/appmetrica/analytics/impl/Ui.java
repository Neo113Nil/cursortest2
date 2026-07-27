package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Ui {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6725a;

    /* renamed from: b, reason: collision with root package name */
    public final SafePackageManager f6726b;

    public Ui(Context context, SafePackageManager safePackageManager) {
        this.f6725a = context;
        this.f6726b = safePackageManager;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        SafePackageManager safePackageManager = this.f6726b;
        Context context = this.f6725a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 4096);
        if (packageInfo != null) {
            String[] strArr = packageInfo.requestedPermissions;
            int[] iArr = packageInfo.requestedPermissionsFlags;
            if (strArr != null) {
                for (int i3 = 0; i3 < strArr.length; i3++) {
                    String str = strArr[i3];
                    if (iArr == null || iArr.length <= i3 || (iArr[i3] & 2) == 0) {
                        arrayList.add(new PermissionState(str, false));
                    } else {
                        arrayList.add(new PermissionState(str, true));
                    }
                }
            }
        }
        return arrayList;
    }
}
