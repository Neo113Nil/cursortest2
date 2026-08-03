package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzmc {
    public final com.google.android.gms.internal.ads.zzxi zza;
    public final java.lang.Object zzb;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public com.google.android.gms.internal.ads.zzmd zzg;
    public boolean zzh;
    private final com.google.android.gms.internal.ads.zznc[] zzj;
    private final com.google.android.gms.internal.ads.zzabh zzk;
    private final com.google.android.gms.internal.ads.zzmr zzl;
    private com.google.android.gms.internal.ads.zzmc zzm;
    private com.google.android.gms.internal.ads.zzabi zzo;
    private long zzp;
    private com.google.android.gms.internal.ads.zzzn zzn = com.google.android.gms.internal.ads.zzzn.zza;
    public final com.google.android.gms.internal.ads.zzzc[] zzc = new com.google.android.gms.internal.ads.zzzc[2];
    private final boolean[] zzi = new boolean[2];

    public zzmc(com.google.android.gms.internal.ads.zznc[] zzncVarArr, long j, com.google.android.gms.internal.ads.zzabh zzabhVar, com.google.android.gms.internal.ads.zzabl zzablVar, com.google.android.gms.internal.ads.zzmr zzmrVar, com.google.android.gms.internal.ads.zzmd zzmdVar, com.google.android.gms.internal.ads.zzabi zzabiVar, long j2) {
        this.zzj = zzncVarArr;
        this.zzp = j;
        this.zzk = zzabhVar;
        this.zzl = zzmrVar;
        this.zzb = zzmdVar.zza.zza;
        this.zzg = zzmdVar;
        this.zzo = zzabiVar;
        com.google.android.gms.internal.ads.zzxk zzxkVar = zzmdVar.zza;
        long j3 = zzmdVar.zzb;
        long j4 = zzmdVar.zze;
        com.google.android.gms.internal.ads.zzxi zze = zzmrVar.zze(zzxkVar, zzablVar, j3);
        this.zza = j4 != -9223372036854775807L ? new com.google.android.gms.internal.ads.zzwo(zze, true, 0L, j4) : zze;
    }

    private final void zzu() {
        if (!zzw()) {
            return;
        }
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzabi zzabiVar = this.zzo;
            if (i >= zzabiVar.zza) {
                return;
            }
            zzabiVar.zza(i);
            com.google.android.gms.internal.ads.zzaba zzabaVar = this.zzo.zzc[i];
            i++;
        }
    }

    private final void zzv() {
        if (!zzw()) {
            return;
        }
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzabi zzabiVar = this.zzo;
            if (i >= zzabiVar.zza) {
                return;
            }
            zzabiVar.zza(i);
            com.google.android.gms.internal.ads.zzaba zzabaVar = this.zzo.zzc[i];
            i++;
        }
    }

    private final boolean zzw() {
        return this.zzm == null;
    }

    public final long zza() {
        return this.zzp;
    }

    public final void zzb(long j) {
        this.zzp = j;
    }

    public final long zzc() {
        return this.zzg.zzb + this.zzp;
    }

    public final boolean zzd() {
        if (this.zze) {
            return !this.zzf || this.zza.zzi() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zze() {
        if (this.zze) {
            return zzd() || zzf() - this.zzg.zzb >= -9223372036854775807L;
        }
        return false;
    }

    public final long zzf() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long zzi = this.zzf ? this.zza.zzi() : Long.MIN_VALUE;
        return zzi == Long.MIN_VALUE ? this.zzg.zzf : zzi;
    }

    public final long zzg() {
        if (this.zze) {
            return this.zza.zzl();
        }
        return 0L;
    }

    public final void zzh(float f, com.google.android.gms.internal.ads.zzbf zzbfVar, boolean z) throws com.google.android.gms.internal.ads.zzjk {
        this.zze = true;
        this.zzn = this.zza.zzd();
        com.google.android.gms.internal.ads.zzabi zzk = zzk(f, zzbfVar, z);
        com.google.android.gms.internal.ads.zzmd zzmdVar = this.zzg;
        long j = zzmdVar.zzb;
        long j2 = zzmdVar.zzf;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = java.lang.Math.max(0L, j2 - 1);
        }
        long zzl = zzl(zzk, j, false);
        long j3 = this.zzp;
        com.google.android.gms.internal.ads.zzmd zzmdVar2 = this.zzg;
        this.zzp = j3 + (zzmdVar2.zzb - zzl);
        this.zzg = zzmdVar2.zza(zzl, zzmdVar2.zzc);
    }

    public final void zzi(long j) {
        com.google.android.gms.internal.ads.zzgtj.zzi(zzw());
        if (this.zze) {
            this.zza.zzg(j - this.zzp);
        }
    }

    public final void zzj(com.google.android.gms.internal.ads.zzma zzmaVar) {
        com.google.android.gms.internal.ads.zzgtj.zzi(zzw());
        this.zza.zzm(zzmaVar);
    }

    public final com.google.android.gms.internal.ads.zzabi zzk(float f, com.google.android.gms.internal.ads.zzbf zzbfVar, boolean z) throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzzn zzznVar = this.zzn;
        com.google.android.gms.internal.ads.zzxk zzxkVar = this.zzg.zza;
        com.google.android.gms.internal.ads.zzabh zzabhVar = this.zzk;
        com.google.android.gms.internal.ads.zznc[] zzncVarArr = this.zzj;
        com.google.android.gms.internal.ads.zzabi zzr = zzabhVar.zzr(zzncVarArr, zzznVar, zzxkVar, zzbfVar);
        for (int i = 0; i < zzr.zza; i++) {
            if (zzr.zza(i)) {
                if (zzr.zzc[i] == null) {
                    zzncVarArr[i].zza();
                    r2 = false;
                }
                com.google.android.gms.internal.ads.zzgtj.zzi(r2);
            } else {
                com.google.android.gms.internal.ads.zzgtj.zzi(zzr.zzc[i] == null);
            }
        }
        for (com.google.android.gms.internal.ads.zzaba zzabaVar : zzr.zzc) {
        }
        return zzr;
    }

    public final long zzl(com.google.android.gms.internal.ads.zzabi zzabiVar, long j, boolean z) {
        return zzm(zzabiVar, j, false, new boolean[2]);
    }

    public final long zzm(com.google.android.gms.internal.ads.zzabi zzabiVar, long j, boolean z, boolean[] zArr) {
        com.google.android.gms.internal.ads.zznc[] zzncVarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzabiVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z || !zzabiVar.zzb(this.zzo, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzncVarArr = this.zzj;
            if (i2 >= 2) {
                break;
            }
            zzncVarArr[i2].zza();
            i2++;
        }
        zzv();
        this.zzo = zzabiVar;
        zzu();
        com.google.android.gms.internal.ads.zzxi zzxiVar = this.zza;
        com.google.android.gms.internal.ads.zzaba[] zzabaVarArr = zzabiVar.zzc;
        boolean[] zArr3 = this.zzi;
        com.google.android.gms.internal.ads.zzzc[] zzzcVarArr = this.zzc;
        long zze = zzxiVar.zze(zzabaVarArr, zArr3, zzzcVarArr, zArr, j);
        for (int i3 = 0; i3 < 2; i3++) {
            zzncVarArr[i3].zza();
        }
        this.zzf = false;
        for (int i4 = 0; i4 < 2; i4++) {
            if (zzzcVarArr[i4] != null) {
                com.google.android.gms.internal.ads.zzgtj.zzi(zzabiVar.zza(i4));
                zzncVarArr[i4].zza();
                this.zzf = true;
            } else {
                com.google.android.gms.internal.ads.zzgtj.zzi(zzabaVarArr[i4] == null);
            }
        }
        return zze;
    }

    public final void zzn() {
        zzv();
        com.google.android.gms.internal.ads.zzxi zzxiVar = this.zza;
        try {
            boolean z = zzxiVar instanceof com.google.android.gms.internal.ads.zzwo;
            com.google.android.gms.internal.ads.zzmr zzmrVar = this.zzl;
            if (z) {
                zzmrVar.zzf(((com.google.android.gms.internal.ads.zzwo) zzxiVar).zza);
            } else {
                zzmrVar.zzf(zzxiVar);
            }
        } catch (java.lang.RuntimeException e) {
            com.google.android.gms.internal.ads.zzeg.zzf("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzo(com.google.android.gms.internal.ads.zzmc zzmcVar) {
        if (zzmcVar == this.zzm) {
            return;
        }
        zzv();
        this.zzm = zzmcVar;
        zzu();
    }

    public final com.google.android.gms.internal.ads.zzmc zzp() {
        return this.zzm;
    }

    public final com.google.android.gms.internal.ads.zzzn zzq() {
        return this.zzn;
    }

    public final com.google.android.gms.internal.ads.zzabi zzr() {
        return this.zzo;
    }

    public final void zzs() {
        com.google.android.gms.internal.ads.zzxi zzxiVar = this.zza;
        if (zzxiVar instanceof com.google.android.gms.internal.ads.zzwo) {
            long j = this.zzg.zze;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((com.google.android.gms.internal.ads.zzwo) zzxiVar).zza(0L, j);
        }
    }

    public final void zzt(com.google.android.gms.internal.ads.zzxh zzxhVar, long j) {
        this.zzd = true;
        this.zza.zzb(zzxhVar, j);
    }
}
