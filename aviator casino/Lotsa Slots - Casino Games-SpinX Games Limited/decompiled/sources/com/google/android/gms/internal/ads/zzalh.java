package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzalh implements com.google.android.gms.internal.ads.zzald {
    private final com.google.android.gms.internal.ads.zzet zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzalh(com.google.android.gms.internal.ads.zzfy zzfyVar) {
        com.google.android.gms.internal.ads.zzet zzetVar = zzfyVar.zza;
        this.zza = zzetVar;
        zzetVar.zzh(12);
        this.zzc = zzetVar.zzH() & 255;
        this.zzb = zzetVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzald
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzald
    public final int zzb() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzald
    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzs();
        }
        if (i == 16) {
            return this.zza.zzt();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 != 0) {
            return this.zze & 15;
        }
        int zzs = this.zza.zzs();
        this.zze = zzs;
        return (zzs & 240) >> 4;
    }
}
