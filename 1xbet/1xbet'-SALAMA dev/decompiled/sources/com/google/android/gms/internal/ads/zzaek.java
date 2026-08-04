package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzaek implements zzadu {
    final /* synthetic */ zzaen zza;
    private final long zzb;

    public zzaek(zzaen zzaenVar, long j) {
        this.zza = zzaenVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j) {
        zzads zzadsVarZza = this.zza.zzi[0].zza(j);
        int i7 = 1;
        while (true) {
            zzaen zzaenVar = this.zza;
            if (i7 >= zzaenVar.zzi.length) {
                return zzadsVarZza;
            }
            zzads zzadsVarZza2 = zzaenVar.zzi[i7].zza(j);
            if (zzadsVarZza2.zza.zzc < zzadsVarZza.zza.zzc) {
                zzadsVarZza = zzadsVarZza2;
            }
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return true;
    }
}
