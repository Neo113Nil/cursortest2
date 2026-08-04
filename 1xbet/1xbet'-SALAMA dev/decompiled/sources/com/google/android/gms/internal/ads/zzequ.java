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
import p097n3.c;

/* JADX INFO: loaded from: classes.dex */
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

    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        String strValueOf;
        String installingPackageName;
        String str;
        PackageManager.NameNotFoundException e7;
        String initiatingPackageName;
        String str2 = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        PackageInfo packageInfo2 = this.zzb;
        String str3 = packageInfo2 == null ? null : packageInfo2.versionName;
        try {
            Context context = this.zzc;
            K k7 = P.f3579l;
            strValueOf = String.valueOf(c.a(context).r(str2));
        } catch (PackageManager.NameNotFoundException unused) {
            strValueOf = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmJ)).booleanValue()) {
                try {
                    InstallSourceInfo installSourceInfo = this.zzc.getPackageManager().getInstallSourceInfo(str2);
                    if (installSourceInfo != null) {
                        installingPackageName = installSourceInfo.getInstallingPackageName();
                        try {
                            if (TextUtils.isEmpty(installingPackageName)) {
                                J.k("No installing package name found");
                                installingPackageName = null;
                            }
                            initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                            try {
                                if (TextUtils.isEmpty(initiatingPackageName)) {
                                    J.k("No initiating package name found");
                                    str = null;
                                } else {
                                    str = initiatingPackageName;
                                }
                            } catch (PackageManager.NameNotFoundException e8) {
                                e7 = e8;
                                o.f1952C.f1961g.zzw(e7, "PackageInfoSignalSource.getInstallSourceInfo");
                            }
                        } catch (PackageManager.NameNotFoundException e9) {
                            e7 = e9;
                            initiatingPackageName = null;
                        }
                    } else {
                        installingPackageName = null;
                        str = null;
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    installingPackageName = null;
                    e7 = e10;
                    initiatingPackageName = null;
                }
            } else {
                installingPackageName = null;
                str = null;
            }
        } else {
            installingPackageName = null;
            str = null;
        }
        return zzgbc.zzh(new zzeqv(str2, numValueOf, str3, strValueOf, installingPackageName, str));
    }
}
