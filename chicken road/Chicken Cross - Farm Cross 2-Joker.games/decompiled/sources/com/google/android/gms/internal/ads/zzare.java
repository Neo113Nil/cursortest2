package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzare {
    private final zzaqh zza;
    private final zzfj zzb;
    private final zzet zzc = new zzet(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzare(zzaqh zzaqhVar, zzfj zzfjVar) {
        this.zza = zzaqhVar;
        this.zzb = zzfjVar;
    }

    public final void zza() {
        this.zzf = false;
        this.zza.zza();
    }

    public final void zzb(zzeu zzeuVar) throws zzat {
        long j;
        char c;
        zzet zzetVar = this.zzc;
        zzeuVar.zzm(zzetVar.zza, 0, 3);
        zzetVar.zzf(0);
        zzetVar.zzh(8);
        this.zzd = zzetVar.zzi();
        this.zze = zzetVar.zzi();
        zzetVar.zzh(6);
        zzeuVar.zzm(zzetVar.zza, 0, zzetVar.zzj(8));
        zzetVar.zzf(0);
        if (this.zzd) {
            zzetVar.zzh(4);
            long zzj = zzetVar.zzj(3);
            zzetVar.zzh(1);
            int zzj2 = zzetVar.zzj(15) << 15;
            zzetVar.zzh(1);
            long zzj3 = zzetVar.zzj(15);
            zzetVar.zzh(1);
            if (this.zzf || !this.zze) {
                c = 30;
            } else {
                zzetVar.zzh(4);
                zzetVar.zzh(1);
                int zzj4 = zzetVar.zzj(15) << 15;
                zzetVar.zzh(1);
                long zzj5 = zzetVar.zzj(15);
                zzetVar.zzh(1);
                this.zzb.zze((zzetVar.zzj(3) << 30) | zzj4 | zzj5);
                this.zzf = true;
                c = 30;
            }
            j = this.zzb.zze((zzj << c) | zzj2 | zzj3);
        } else {
            j = 0;
        }
        zzaqh zzaqhVar = this.zza;
        zzaqhVar.zzc(j, 4);
        zzaqhVar.zzd(zzeuVar);
        zzaqhVar.zzf();
    }

    final /* synthetic */ void zzc() {
        this.zza.zzn();
    }
}
