package com.google.android.gms.measurement.internal;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.wrappers.c;
import com.google.android.gms.common.wrappers.d;

/* loaded from: classes4.dex */
public final class zzhk {
    final zzic zza;

    public zzhk(zzpg zzpgVar) {
        this.zza = zzpgVar.zzag();
    }

    @VisibleForTesting
    public final boolean zza() {
        try {
            zzic zzicVar = this.zza;
            c a = d.a(zzicVar.zzaY());
            if (a != null) {
                return a.b(128, "com.android.vending").versionCode >= 80837300;
            }
            zzicVar.zzaV().zzk().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.zza.zzaV().zzk().zzb("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
