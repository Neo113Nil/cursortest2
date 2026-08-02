package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.K;
import I2.P;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import n3.c;

/* loaded from: classes.dex */
public final class zzequ implements zzesh {
    private final ApplicationInfo zza;
    private final PackageInfo zzb;
    private final Context zzc;

    public zzequ(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 29;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        String str;
        String str2;
        String str3;
        PackageManager.NameNotFoundException e7;
        String str4;
        InstallSourceInfo installSourceInfo;
        String str5 = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        PackageInfo packageInfo2 = this.zzb;
        String str6 = packageInfo2 == null ? null : packageInfo2.versionName;
        try {
            Context context = this.zzc;
            K k7 = P.f3579l;
            str = String.valueOf(c.a(context).r(str5));
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmJ)).booleanValue()) {
                try {
                    installSourceInfo = this.zzc.getPackageManager().getInstallSourceInfo(str5);
                } catch (PackageManager.NameNotFoundException e8) {
                    str2 = null;
                    e7 = e8;
                    str4 = null;
                }
                if (installSourceInfo != null) {
                    str2 = installSourceInfo.getInstallingPackageName();
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            J.k("No installing package name found");
                            str2 = null;
                        }
                        str4 = installSourceInfo.getInitiatingPackageName();
                    } catch (PackageManager.NameNotFoundException e9) {
                        e7 = e9;
                        str4 = null;
                    }
                    try {
                    } catch (PackageManager.NameNotFoundException e10) {
                        e7 = e10;
                        o.f1952C.f1961g.zzw(e7, "PackageInfoSignalSource.getInstallSourceInfo");
                        str3 = str4;
                        return zzgbc.zzh(new zzeqv(str5, valueOf, str6, str, str2, str3));
                    }
                    if (TextUtils.isEmpty(str4)) {
                        J.k("No initiating package name found");
                        str3 = null;
                        return zzgbc.zzh(new zzeqv(str5, valueOf, str6, str, str2, str3));
                    }
                    str3 = str4;
                    return zzgbc.zzh(new zzeqv(str5, valueOf, str6, str, str2, str3));
                }
            }
        }
        str2 = null;
        str3 = null;
        return zzgbc.zzh(new zzeqv(str5, valueOf, str6, str, str2, str3));
    }
}
