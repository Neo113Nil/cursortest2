package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
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
        long zzl;
        if (this.zzd == -1 && i7 == this.zzc && zzuqVar != null) {
            zzog zzogVar = this.zza;
            long j = zzuqVar.zzd;
            zzl = zzogVar.zzl();
            if (j >= zzl) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzj(int i7, zzuq zzuqVar) {
        if (zzuqVar == null) {
            return i7 == this.zzc;
        }
        zzuq zzuqVar2 = this.zze;
        return zzuqVar2 == null ? !zzuqVar.zzb() && zzuqVar.zzd == this.zzd : zzuqVar.zzd == zzuqVar2.zzd && zzuqVar.zzb == zzuqVar2.zzb && zzuqVar.zzc == zzuqVar2.zzc;
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
        int zza = zzbnVar.zza(zzuqVar.zza);
        int zza2 = zzbnVar.zza(this.zze.zza);
        zzuq zzuqVar2 = zzlzVar.zzd;
        if (zzuqVar2.zzd < this.zze.zzd || zza < zza2) {
            return false;
        }
        if (zza > zza2) {
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

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.zzc()) goto L15;
     */
    /* JADX WARN: Incorrect condition in loop: B:19:0x002e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzl(zzbn zzbnVar, zzbn zzbnVar2) {
        zzbm zzbmVar;
        zzbm zzbmVar2;
        zzbm zzbmVar3;
        zzbl zzblVar;
        int i7 = this.zzc;
        if (i7 < zzbnVar.zzc()) {
            zzbmVar = this.zza.zzc;
            zzbnVar.zze(i7, zzbmVar, 0L);
            zzbmVar2 = this.zza.zzc;
            for (int i8 = zzbmVar2.zzn; i8 <= zzbmVar3.zzo; i8++) {
                int zza = zzbnVar2.zza(zzbnVar.zzf(i8));
                if (zza != -1) {
                    zzblVar = this.zza.zzd;
                    i7 = zzbnVar2.zzd(zza, zzblVar, false).zzc;
                    break;
                }
            }
            i7 = -1;
        }
        this.zzc = i7;
        if (i7 == -1) {
            return false;
        }
        zzuq zzuqVar = this.zze;
        return zzuqVar == null || zzbnVar2.zza(zzuqVar.zza) != -1;
    }
}
