package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzahl {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzed zzf;
    private final zzed zzg;
    private int zzh;
    private int zzi;

    public zzahl(zzed zzedVar, zzed zzedVar2, boolean z4) throws zzaz {
        this.zzg = zzedVar;
        this.zzf = zzedVar2;
        this.zze = z4;
        zzedVar2.zzL(12);
        this.zza = zzedVar2.zzp();
        zzedVar.zzL(12);
        this.zzi = zzedVar.zzp();
        zzacz.zzb(zzedVar.zzg() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i7 = this.zzb + 1;
        this.zzb = i7;
        if (i7 == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzw() : this.zzf.zzu();
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzp();
            this.zzg.zzM(4);
            int i8 = this.zzi - 1;
            this.zzi = i8;
            this.zzh = i8 > 0 ? (-1) + this.zzg.zzp() : -1;
        }
        return true;
    }
}
