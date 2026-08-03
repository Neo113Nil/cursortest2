package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzhm implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzhs zza;

    zzhm(com.google.android.gms.measurement.internal.zzhs zzhsVar) {
        java.util.Objects.requireNonNull(zzhsVar);
        this.zza = zzhsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i, java.lang.String str, java.util.List list, boolean z, boolean z2) {
        int i2 = i - 1;
        com.google.android.gms.measurement.internal.zzgr zzi = i2 != 0 ? i2 != 1 ? i2 != 3 ? i2 != 4 ? this.zza.zzu.zzaV().zzi() : z ? this.zza.zzu.zzaV().zzf() : !z2 ? this.zza.zzu.zzaV().zzh() : this.zza.zzu.zzaV().zze() : this.zza.zzu.zzaV().zzk() : z ? this.zza.zzu.zzaV().zzc() : !z2 ? this.zza.zzu.zzaV().zzd() : this.zza.zzu.zzaV().zzb() : this.zza.zzu.zzaV().zzj();
        int size = list.size();
        if (size == 1) {
            zzi.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzi.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzi.zza(str);
        } else {
            zzi.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
