package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzamu {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final com.google.android.gms.internal.ads.zzet zzg = new com.google.android.gms.internal.ads.zzet(255);

    zzamu() {
    }

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(com.google.android.gms.internal.ads.zzafz zzafzVar, long j) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzgtj.zza(zzafzVar.zzn() == zzafzVar.zzm());
        com.google.android.gms.internal.ads.zzet zzetVar = this.zzg;
        zzetVar.zza(4);
        while (true) {
            if ((j == -1 || zzafzVar.zzn() + 4 < j) && com.google.android.gms.internal.ads.zzagc.zze(zzafzVar, zzetVar.zzi(), 0, 4, true)) {
                zzetVar.zzh(0);
                if (zzetVar.zzz() == 1332176723) {
                    zzafzVar.zzl();
                    return true;
                }
                zzafzVar.zzf(1);
            }
        }
        do {
            if (j != -1 && zzafzVar.zzn() >= j) {
                break;
            }
        } while (zzafzVar.zzd(1) != -1);
        return false;
    }

    public final boolean zzc(com.google.android.gms.internal.ads.zzafz zzafzVar, boolean z) throws java.io.IOException {
        zza();
        com.google.android.gms.internal.ads.zzet zzetVar = this.zzg;
        zzetVar.zza(27);
        if (com.google.android.gms.internal.ads.zzagc.zze(zzafzVar, zzetVar.zzi(), 0, 27, z) && zzetVar.zzz() == 1332176723) {
            if (zzetVar.zzs() != 0) {
                if (z) {
                    return false;
                }
                throw com.google.android.gms.internal.ads.zzat.zzc("unsupported bit stream revision");
            }
            this.zza = zzetVar.zzs();
            this.zzb = zzetVar.zzE();
            zzetVar.zzA();
            zzetVar.zzA();
            zzetVar.zzA();
            int zzs = zzetVar.zzs();
            this.zzc = zzs;
            this.zzd = zzs + 27;
            zzetVar.zza(zzs);
            if (com.google.android.gms.internal.ads.zzagc.zze(zzafzVar, zzetVar.zzi(), 0, this.zzc, z)) {
                for (int i = 0; i < this.zzc; i++) {
                    int[] iArr = this.zzf;
                    int zzs2 = zzetVar.zzs();
                    iArr[i] = zzs2;
                    this.zze += zzs2;
                }
                return true;
            }
        }
        return false;
    }
}
