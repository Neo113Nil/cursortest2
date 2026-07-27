package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzani {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzeu zzg = new zzeu(255);

    zzani() {
    }

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzagi zzagiVar, long j) throws IOException {
        zzguk.zza(zzagiVar.zzn() == zzagiVar.zzm());
        zzeu zzeuVar = this.zzg;
        zzeuVar.zza(4);
        while (true) {
            if ((j == -1 || zzagiVar.zzn() + 4 < j) && zzagl.zze(zzagiVar, zzeuVar.zzi(), 0, 4, true)) {
                zzeuVar.zzh(0);
                if (zzeuVar.zzz() == 1332176723) {
                    zzagiVar.zzl();
                    return true;
                }
                zzagiVar.zzf(1);
            }
        }
        do {
            if (j != -1 && zzagiVar.zzn() >= j) {
                break;
            }
        } while (zzagiVar.zzd(1) != -1);
        return false;
    }

    public final boolean zzc(zzagi zzagiVar, boolean z) throws IOException {
        zza();
        zzeu zzeuVar = this.zzg;
        zzeuVar.zza(27);
        if (zzagl.zze(zzagiVar, zzeuVar.zzi(), 0, 27, z) && zzeuVar.zzz() == 1332176723) {
            if (zzeuVar.zzs() != 0) {
                if (z) {
                    return false;
                }
                throw zzat.zzc("unsupported bit stream revision");
            }
            this.zza = zzeuVar.zzs();
            this.zzb = zzeuVar.zzE();
            zzeuVar.zzA();
            zzeuVar.zzA();
            zzeuVar.zzA();
            int zzs = zzeuVar.zzs();
            this.zzc = zzs;
            this.zzd = zzs + 27;
            zzeuVar.zza(zzs);
            if (zzagl.zze(zzagiVar, zzeuVar.zzi(), 0, this.zzc, z)) {
                for (int i = 0; i < this.zzc; i++) {
                    int[] iArr = this.zzf;
                    int zzs2 = zzeuVar.zzs();
                    iArr[i] = zzs2;
                    this.zze += zzs2;
                }
                return true;
            }
        }
        return false;
    }
}
