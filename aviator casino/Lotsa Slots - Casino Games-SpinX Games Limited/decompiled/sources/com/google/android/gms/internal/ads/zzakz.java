package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzakz {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final com.google.android.gms.internal.ads.zzet zzf;
    private final com.google.android.gms.internal.ads.zzet zzg;
    private int zzh;
    private int zzi;

    public zzakz(com.google.android.gms.internal.ads.zzet zzetVar, com.google.android.gms.internal.ads.zzet zzetVar2, boolean z) throws com.google.android.gms.internal.ads.zzat {
        this.zzg = zzetVar;
        this.zzf = zzetVar2;
        this.zze = z;
        zzetVar2.zzh(12);
        this.zza = zzetVar2.zzH();
        zzetVar.zzh(12);
        this.zzi = zzetVar.zzH();
        com.google.android.gms.internal.ads.zzagc.zza(zzetVar.zzB() == 1, "first_chunk must be 1");
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
            com.google.android.gms.internal.ads.zzet zzetVar = this.zzg;
            this.zzc = zzetVar.zzH();
            zzetVar.zzk(4);
            int i2 = this.zzi - 1;
            this.zzi = i2;
            this.zzh = i2 > 0 ? (-1) + zzetVar.zzH() : -1;
        }
        return true;
    }
}
