package f2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5623a;

    /* renamed from: b, reason: collision with root package name */
    public String f5624b;

    /* renamed from: c, reason: collision with root package name */
    public String f5625c;

    /* renamed from: d, reason: collision with root package name */
    public int f5626d;

    /* renamed from: e, reason: collision with root package name */
    public int f5627e = 0;

    public o(Context context) {
        this.f5623a = context;
    }

    public static String b(K1.g gVar) {
        gVar.a();
        K1.i iVar = gVar.f1389c;
        String str = iVar.f1405e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = iVar.f1402b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized String a() {
        try {
            if (this.f5624b == null) {
                e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f5624b;
    }

    public final PackageInfo c(String str) {
        try {
            return this.f5623a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e3) {
            Log.w("FirebaseMessaging", "Failed to find package " + e3);
            return null;
        }
    }

    public final boolean d() {
        int i2;
        synchronized (this) {
            i2 = this.f5627e;
            if (i2 == 0) {
                PackageManager packageManager = this.f5623a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i2 = 0;
                } else {
                    if (!s1.b.b()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f5627e = 1;
                            i2 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (s1.b.b()) {
                            this.f5627e = 2;
                        } else {
                            this.f5627e = 1;
                        }
                        i2 = this.f5627e;
                    } else {
                        this.f5627e = 2;
                        i2 = 2;
                    }
                }
            }
        }
        return i2 != 0;
    }

    public final synchronized void e() {
        PackageInfo c2 = c(this.f5623a.getPackageName());
        if (c2 != null) {
            this.f5624b = Integer.toString(c2.versionCode);
            this.f5625c = c2.versionName;
        }
    }
}
