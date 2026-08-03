package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzhj {
    final com.google.android.gms.measurement.internal.zzib zza;

    zzhj(com.google.android.gms.measurement.internal.zzpf zzpfVar) {
        this.zza = zzpfVar.zzaf();
    }

    final boolean zza() {
        try {
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zza;
            com.google.android.gms.common.wrappers.PackageManagerWrapper packageManager = com.google.android.gms.common.wrappers.Wrappers.packageManager(zzibVar.zzaY());
            if (packageManager != null) {
                return packageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            zzibVar.zzaV().zzk().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (java.lang.Exception e) {
            this.zza.zzaV().zzk().zzb("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
