package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaqq {
    private final com.google.android.gms.internal.ads.zzapt zza;
    private final com.google.android.gms.internal.ads.zzfi zzb;
    private final com.google.android.gms.internal.ads.zzes zzc = new com.google.android.gms.internal.ads.zzes(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzaqq(com.google.android.gms.internal.ads.zzapt zzaptVar, com.google.android.gms.internal.ads.zzfi zzfiVar) {
        this.zza = zzaptVar;
        this.zzb = zzfiVar;
    }

    public final void zza() {
        this.zzf = false;
        this.zza.zza();
    }

    public final void zzb(com.google.android.gms.internal.ads.zzet zzetVar) throws com.google.android.gms.internal.ads.zzat {
        long j;
        long j2;
        com.google.android.gms.internal.ads.zzes zzesVar = this.zzc;
        zzetVar.zzm(zzesVar.zza, 0, 3);
        zzesVar.zzf(0);
        zzesVar.zzh(8);
        this.zzd = zzesVar.zzi();
        this.zze = zzesVar.zzi();
        zzesVar.zzh(6);
        zzetVar.zzm(zzesVar.zza, 0, zzesVar.zzj(8));
        zzesVar.zzf(0);
        if (this.zzd) {
            zzesVar.zzh(4);
            long zzj = zzesVar.zzj(3);
            zzesVar.zzh(1);
            int zzj2 = zzesVar.zzj(15) << 15;
            zzesVar.zzh(1);
            long zzj3 = zzesVar.zzj(15);
            zzesVar.zzh(1);
            if (this.zzf || !this.zze) {
                j2 = zzj;
            } else {
                zzesVar.zzh(4);
                zzesVar.zzh(1);
                int zzj4 = zzesVar.zzj(15) << 15;
                zzesVar.zzh(1);
                j2 = zzj;
                long zzj5 = zzesVar.zzj(15);
                zzesVar.zzh(1);
                this.zzb.zze((zzesVar.zzj(3) << 30) | zzj4 | zzj5);
                this.zzf = true;
            }
            j = this.zzb.zze((j2 << 30) | zzj2 | zzj3);
        } else {
            j = 0;
        }
        com.google.android.gms.internal.ads.zzapt zzaptVar = this.zza;
        zzaptVar.zzc(j, 4);
        zzaptVar.zzd(zzetVar);
        zzaptVar.zze(false);
    }
}
