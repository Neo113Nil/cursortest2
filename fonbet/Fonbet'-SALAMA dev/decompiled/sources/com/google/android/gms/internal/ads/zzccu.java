package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzccu implements zzkj {
    private final zzyw zza = new zzyw(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    public final void zza(boolean z4) {
        this.zzf = 0;
        this.zzg = false;
        if (z4) {
            this.zza.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final long zzb(zzor zzorVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzc(zzor zzorVar) {
        zza(false);
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzd(zzor zzorVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zze(zzor zzorVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzf(zzki zzkiVar, zzwv zzwvVar, zzyh[] zzyhVarArr) {
        int i7;
        this.zzf = 0;
        for (zzyh zzyhVar : zzyhVarArr) {
            if (zzyhVar != null) {
                int i8 = this.zzf;
                int i9 = zzyhVar.zzg().zzc;
                if (i9 == 0) {
                    i7 = 144310272;
                } else if (i9 == 1) {
                    i7 = 13107200;
                } else if (i9 != 2) {
                    i7 = 131072;
                    if (i9 != 3 && i9 != 5 && i9 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i7 = 131072000;
                }
                this.zzf = i8 + i7;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzg(zzor zzorVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzh(zzki zzkiVar) {
        long j = zzkiVar.zzb;
        boolean z4 = true;
        char c3 = j > this.zzc ? (char) 0 : j < this.zzb ? (char) 2 : (char) 1;
        int zza = this.zza.zza();
        int i7 = this.zzf;
        if (c3 != 2 && (c3 != 1 || !this.zzg || zza >= i7)) {
            z4 = false;
        }
        this.zzg = z4;
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final /* synthetic */ boolean zzi(zzbn zzbnVar, zzuq zzuqVar, long j) {
        zzdq.zzf("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzj(zzki zzkiVar) {
        long j = zzkiVar.zzd ? this.zze : this.zzd;
        return j <= 0 || zzkiVar.zzb >= j;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final zzyw zzk() {
        return this.zza;
    }

    public final synchronized void zzl(int i7) {
        this.zzd = i7 * 1000;
    }

    public final synchronized void zzm(int i7) {
        this.zze = i7 * 1000;
    }

    public final synchronized void zzn(int i7) {
        this.zzc = i7 * 1000;
    }

    public final synchronized void zzo(int i7) {
        this.zzb = i7 * 1000;
    }
}
