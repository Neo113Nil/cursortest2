package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzams implements com.google.android.gms.internal.ads.zzafy {
    private com.google.android.gms.internal.ads.zzagb zza;
    private com.google.android.gms.internal.ads.zzamz zzb;
    private boolean zzc;

    static {
        int i = com.google.android.gms.internal.ads.zzamr.zza;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private final boolean zzh(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzamu zzamuVar = new com.google.android.gms.internal.ads.zzamu();
        if (zzamuVar.zzc(zzafzVar, true) && (zzamuVar.zza & 2) == 2) {
            int min = java.lang.Math.min(zzamuVar.zze, 8);
            com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(min);
            zzafzVar.zzi(zzetVar.zzi(), 0, min);
            zzetVar.zzh(0);
            if (zzetVar.zzd() >= 5 && zzetVar.zzs() == 127 && zzetVar.zzz() == 1179402563) {
                this.zzb = new com.google.android.gms.internal.ads.zzamq();
            } else {
                zzetVar.zzh(0);
                try {
                    if (com.google.android.gms.internal.ads.zzhe.zzc(1, zzetVar, true)) {
                        this.zzb = new com.google.android.gms.internal.ads.zzanb();
                    }
                } catch (com.google.android.gms.internal.ads.zzat unused) {
                }
                zzetVar.zzh(0);
                if (com.google.android.gms.internal.ads.zzamw.zzd(zzetVar)) {
                    this.zzb = new com.google.android.gms.internal.ads.zzamw();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        try {
            return zzh(zzafzVar);
        } catch (com.google.android.gms.internal.ads.zzat unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ java.util.List zzb() {
        java.util.List zzi;
        zzi = com.google.android.gms.internal.ads.zzgwm.zzi();
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(com.google.android.gms.internal.ads.zzagb zzagbVar) {
        this.zza = zzagbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        this.zza.getClass();
        if (this.zzb == null) {
            if (!zzh(zzafzVar)) {
                throw com.google.android.gms.internal.ads.zzat.zzb("Failed to determine bitstream type", null);
            }
            zzafzVar.zzl();
        }
        if (!this.zzc) {
            com.google.android.gms.internal.ads.zzahk zzu = this.zza.zzu(0, 1);
            this.zza.zzv();
            this.zzb.zze(this.zza, zzu);
            this.zzc = true;
        }
        return this.zzb.zzg(zzafzVar, zzagyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j, long j2) {
        com.google.android.gms.internal.ads.zzamz zzamzVar = this.zzb;
        if (zzamzVar != null) {
            zzamzVar.zzf(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ com.google.android.gms.internal.ads.zzafy zzg() {
        return com.google.android.gms.internal.ads.zzafy.CC.$default$zzg(this);
    }
}
