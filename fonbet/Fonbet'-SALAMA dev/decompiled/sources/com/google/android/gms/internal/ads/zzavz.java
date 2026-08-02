package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* loaded from: classes.dex */
final class zzavz implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzawa zza;

    public zzavz(zzawa zzawaVar) {
        this.zza = zzawaVar;
    }

    public final void onOpActiveChanged(String str, int i7, String str2, boolean z4) {
        long j;
        long j3;
        long j7;
        if (z4) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        zzawa zzawaVar = this.zza;
        long currentTimeMillis = System.currentTimeMillis();
        j = zzawaVar.zzc;
        if (j > 0) {
            zzawa zzawaVar2 = this.zza;
            j3 = zzawaVar2.zzc;
            if (currentTimeMillis >= j3) {
                j7 = zzawaVar2.zzc;
                zzawaVar2.zzd = currentTimeMillis - j7;
            }
        }
        this.zza.zze = false;
    }
}
