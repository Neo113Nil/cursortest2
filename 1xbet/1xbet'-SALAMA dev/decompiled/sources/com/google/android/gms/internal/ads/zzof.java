package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzof {
    final /* synthetic */ zzog zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzuq zze;
    private boolean zzf;
    private boolean zzg;

    public zzof(zzog zzogVar, String str, int i7, zzuq zzuqVar) {
        this.zza = zzogVar;
        this.zzb = str;
        this.zzc = i7;
        this.zzd = zzuqVar == null ? -1L : zzuqVar.zzd;
        if (zzuqVar == null || !zzuqVar.zzb()) {
            return;
        }
        this.zze = zzuqVar;
    }

    public final void zzg(int i7, zzuq zzuqVar) {
        if (this.zzd == -1 && i7 == this.zzc && zzuqVar != null) {
            zzog zzogVar = this.zza;
            long j = zzuqVar.zzd;
            if (j >= zzogVar.zzl()) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzj(int i7, zzuq zzuqVar) {
        if (zzuqVar == null) {
            return i7 == this.zzc;
        }
        zzuq zzuqVar2 = this.zze;
        if (zzuqVar2 == null) {
            return !zzuqVar.zzb() && zzuqVar.zzd == this.zzd;
        }
        return zzuqVar.zzd == zzuqVar2.zzd && zzuqVar.zzb == zzuqVar2.zzb && zzuqVar.zzc == zzuqVar2.zzc;
    }

    public final boolean zzk(zzlz zzlzVar) {
        zzuq zzuqVar = zzlzVar.zzd;
        if (zzuqVar == null) {
            return this.zzc != zzlzVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        if (zzuqVar.zzd > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbn zzbnVar = zzlzVar.zzb;
        int iZza = zzbnVar.zza(zzuqVar.zza);
        int iZza2 = zzbnVar.zza(this.zze.zza);
        zzuq zzuqVar2 = zzlzVar.zzd;
        if (zzuqVar2.zzd < this.zze.zzd || iZza < iZza2) {
            return false;
        }
        if (iZza > iZza2) {
            return true;
        }
        if (!zzuqVar2.zzb()) {
            int i7 = zzlzVar.zzd.zze;
            return i7 == -1 || i7 > this.zze.zzb;
        }
        zzuq zzuqVar3 = zzlzVar.zzd;
        int i8 = zzuqVar3.zzb;
        int i9 = zzuqVar3.zzc;
        zzuq zzuqVar4 = this.zze;
        int i10 = zzuqVar4.zzb;
        if (i8 <= i10) {
            return i8 == i10 && i9 > zzuqVar4.zzc;
        }
        return true;
    }

    public final boolean zzl(zzbn zzbnVar, zzbn zzbnVar2) {
        int i7 = this.zzc;
        if (i7 < zzbnVar.zzc()) {
            zzbnVar.zze(i7, this.zza.zzc, 0L);
            int i8 = this.zza.zzc.zzn;
            while (true) {
                if (i8 > this.zza.zzc.zzo) {
                    i7 = -1;
                    break;
                }
                int iZza = zzbnVar2.zza(zzbnVar.zzf(i8));
                if (iZza != -1) {
                    i7 = zzbnVar2.zzd(iZza, this.zza.zzd, false).zzc;
                    break;
                }
                i8++;
            }
        } else if (i7 >= zzbnVar2.zzc()) {
            i7 = -1;
            break;
        }
        this.zzc = i7;
        if (i7 == -1) {
            return false;
        }
        zzuq zzuqVar = this.zze;
        return zzuqVar == null || zzbnVar2.zza(zzuqVar.zza) != -1;
    }
}
