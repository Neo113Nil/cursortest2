package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: loaded from: classes.dex */
final class zzavz implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzawa zza;

    public zzavz(zzawa zzawaVar) {
        this.zza = zzawaVar;
    }

    public final void onOpActiveChanged(String str, int i7, String str2, boolean z4) {
        if (z4) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        zzawa zzawaVar = this.zza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (zzawaVar.zzc > 0) {
            zzawa zzawaVar2 = this.zza;
            if (jCurrentTimeMillis >= zzawaVar2.zzc) {
                zzawaVar2.zzd = jCurrentTimeMillis - zzawaVar2.zzc;
            }
        }
        this.zza.zze = false;
    }
}
