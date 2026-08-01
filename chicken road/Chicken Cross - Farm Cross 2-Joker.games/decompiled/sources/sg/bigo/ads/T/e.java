package sg.bigo.ads.T;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static String f12545a;
    public static d b;

    public static d a(Context context) {
        String obj;
        String str;
        String str2;
        StringBuilder sb;
        int indexOf;
        d dVar = b;
        if (dVar != null) {
            return dVar;
        }
        boolean z = false;
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com")), 0);
        String str3 = null;
        String str4 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.chrome", 0);
            if (packageInfo == null || !"com.android.chrome".equals(packageInfo.packageName)) {
                str3 = "No chrome pkg";
                str2 = null;
            } else {
                f12545a = "com.android.chrome";
                str2 = packageInfo.versionName;
                try {
                    String substring = (TextUtils.isEmpty(str2) || (indexOf = str2.indexOf(".")) <= -1) ? null : str2.substring(0, indexOf);
                    if (TextUtils.isEmpty(substring)) {
                        sb = new StringBuilder("Invalid chrome version: ");
                    } else if (Integer.parseInt(substring) >= 45) {
                        z = true;
                    } else {
                        sb = new StringBuilder("Chrome version is low: ");
                    }
                    str3 = sb.append(str2).toString();
                } catch (PackageManager.NameNotFoundException | Exception e) {
                    e = e;
                    str3 = str2;
                    obj = e.toString();
                    str = str3;
                    d dVar2 = new d(z, f12545a, str, str4, obj);
                    b = dVar2;
                    return dVar2;
                }
            }
            str = str2;
            obj = str3;
        } catch (PackageManager.NameNotFoundException e2) {
            e = e2;
        } catch (Exception e3) {
            e = e3;
        }
        d dVar22 = new d(z, f12545a, str, str4, obj);
        b = dVar22;
        return dVar22;
    }
}
