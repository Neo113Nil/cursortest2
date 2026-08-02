package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
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
        zzaeq[] zzaeqVarArr;
        zzaeq[] zzaeqVarArr2;
        zzaeq[] zzaeqVarArr3;
        zzaeqVarArr = this.zza.zzi;
        zzads zza = zzaeqVarArr[0].zza(j);
        int i7 = 1;
        while (true) {
            zzaen zzaenVar = this.zza;
            zzaeqVarArr2 = zzaenVar.zzi;
            if (i7 >= zzaeqVarArr2.length) {
                return zza;
            }
            zzaeqVarArr3 = zzaenVar.zzi;
            zzads zza2 = zzaeqVarArr3[i7].zza(j);
            if (zza2.zza.zzc < zza.zza.zzc) {
                zza = zza2;
            }
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return true;
    }
}
