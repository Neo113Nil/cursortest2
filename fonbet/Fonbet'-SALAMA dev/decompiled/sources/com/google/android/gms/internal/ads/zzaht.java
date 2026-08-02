package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaht implements zzahp {
    private final zzed zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzaht(zzer zzerVar) {
        zzed zzedVar = zzerVar.zza;
        this.zza = zzedVar;
        zzedVar.zzL(12);
        this.zzc = zzedVar.zzp() & 255;
        this.zzb = zzedVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final int zzc() {
        int i7 = this.zzc;
        if (i7 == 8) {
            return this.zza.zzm();
        }
        if (i7 == 16) {
            return this.zza.zzq();
        }
        int i8 = this.zzd;
        this.zzd = i8 + 1;
        if (i8 % 2 != 0) {
            return this.zze & 15;
        }
        int zzm = this.zza.zzm();
        this.zze = zzm;
        return (zzm & 240) >> 4;
    }
}
