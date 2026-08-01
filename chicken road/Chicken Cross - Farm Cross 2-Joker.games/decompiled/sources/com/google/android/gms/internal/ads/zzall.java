package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzall {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzeu zzf;
    private final zzeu zzg;
    private int zzh;
    private int zzi;

    public zzall(zzeu zzeuVar, zzeu zzeuVar2, boolean z) throws zzat {
        this.zzg = zzeuVar;
        this.zzf = zzeuVar2;
        this.zze = z;
        zzeuVar2.zzh(12);
        this.zza = zzeuVar2.zzH();
        zzeuVar.zzh(12);
        this.zzi = zzeuVar.zzH();
        zzagl.zza(zzeuVar.zzB() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzJ() : this.zzf.zzz();
        if (this.zzb == this.zzh) {
            zzeu zzeuVar = this.zzg;
            this.zzc = zzeuVar.zzH();
            zzeuVar.zzk(4);
            int i2 = this.zzi - 1;
            this.zzi = i2;
            this.zzh = i2 > 0 ? (-1) + zzeuVar.zzH() : -1;
        }
        return true;
    }
}
