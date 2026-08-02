package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.W;
import com.google.android.gms.common.internal.o0;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.zza;
import com.haryanvi.netstream.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C0856f {
    public static final int a;
    public static final C0856f b;

    static {
        AtomicBoolean atomicBoolean = j.a;
        a = 12451000;
        b = new C0856f();
    }

    @Nullable
    public Intent a(@Nullable Context context, int i, @Nullable String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            int i2 = o0.a;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && DeviceProperties.isWearableWithoutPlayStore(context)) {
            int i3 = o0.a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(com.google.android.gms.common.wrappers.d.a(context).b(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        int i4 = o0.a;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public int b(@NonNull Context context) {
        return c(context, a);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0141 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int c(@NonNull Context context, int i) {
        PackageInfo packageInfo;
        Bundle bundle;
        AtomicBoolean atomicBoolean = j.a;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !j.d.get()) {
            synchronized (W.a) {
                try {
                    if (!W.b) {
                        W.b = true;
                        try {
                            bundle = com.google.android.gms.common.wrappers.d.a(context).a(128, context.getPackageName()).metaData;
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            W.c = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i2 = W.c;
            if (i2 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i2 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException(androidx.compose.runtime.collection.a.b("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", a, i2, " but found ", ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"));
            }
        }
        boolean z = (DeviceProperties.isWearableWithoutPlayStore(context) || DeviceProperties.zzb(context)) ? false : true;
        C0875q.a(i >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        int i3 = 9;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused3) {
                String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing.");
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            k.a(context);
            if (k.d(packageInfo2, true)) {
                if (z) {
                    C0875q.g(packageInfo);
                    if (!k.d(packageInfo, true)) {
                        String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid.");
                    }
                }
                if (z && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services.");
                } else if (zza.zza(packageInfo2.versionCode) < zza.zza(i)) {
                    i3 = 2;
                } else {
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException unused4) {
                            String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info.");
                            i3 = 1;
                            if (i3 != 18 ? i3 == 1 ? j.b(context) : false : true) {
                            }
                        }
                    }
                    i3 = !applicationInfo.enabled ? 3 : 0;
                }
            } else {
                String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid.");
            }
        } catch (PackageManager.NameNotFoundException unused5) {
            String.valueOf(packageName).concat(" requires Google Play services, but they are missing.");
        }
        if (i3 != 18 ? i3 == 1 ? j.b(context) : false : true) {
            return i3;
        }
        return 18;
    }
}
