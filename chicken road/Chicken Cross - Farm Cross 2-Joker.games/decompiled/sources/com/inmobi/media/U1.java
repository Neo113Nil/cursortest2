package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class U1 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6882a;
    public static final String b;
    public static final String c;
    public static final HashMap d = new HashMap();
    public static final byte e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static {
        PackageManager packageManager;
        byte b2 = 2;
        e = (byte) 2;
        Context context = AbstractC3914mk.f7252a;
        String str = null;
        if (context != null) {
            try {
                packageManager = context.getPackageManager();
            } catch (Exception unused) {
            }
        } else {
            packageManager = null;
        }
        ApplicationInfo applicationInfo = packageManager != null ? packageManager.getApplicationInfo(context.getPackageName(), 128) : null;
        if (applicationInfo != null) {
            f6882a = applicationInfo.packageName;
            c = applicationInfo.loadLabel(packageManager).toString();
        }
        PackageInfo packageInfo = packageManager != null ? packageManager.getPackageInfo(context.getPackageName(), 128) : null;
        if (packageInfo != null && ((str = packageInfo.versionName) == null || str.length() == 0)) {
            str = Build.VERSION.SDK_INT < 28 ? String.valueOf(packageInfo.versionCode) : String.valueOf(packageInfo.getLongVersionCode());
        }
        if (AbstractC3727g4.a(str)) {
            b = str;
        }
        try {
            Y5.f6965a.getClass();
            b2 = Y5.y() ? !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : 0;
        } catch (Error | Exception unused2) {
        }
        e = b2;
        a();
    }

    public static void a() {
        String str = f6882a;
        if (str != null) {
            d.put("u-appbid", str);
        }
        String str2 = c;
        if (str2 != null) {
            d.put("u-appdnm", str2);
        }
        String str3 = b;
        if (str3 != null) {
            d.put("u-appver", str3);
        }
        HashMap hashMap = d;
        hashMap.put("u-appsecure", String.valueOf((int) e));
        Intrinsics.checkNotNullExpressionValue("U1", "TAG");
        String str4 = "AppInfoMap: " + hashMap;
    }
}
