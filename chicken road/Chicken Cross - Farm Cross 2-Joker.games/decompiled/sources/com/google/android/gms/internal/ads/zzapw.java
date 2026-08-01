package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzapw implements zzagh {
    private final zzapx zza = new zzapx(null, 0, "audio/ac3");
    private final zzeu zzb = new zzeu(2786);
    private boolean zzc;

    static {
        int i = zzapv.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        zzeu zzeuVar = new zzeu(10);
        int i = 0;
        while (true) {
            zzagiVar.zzi(zzeuVar.zzi(), 0, 10);
            zzeuVar.zzh(0);
            if (zzeuVar.zzx() != 4801587) {
                break;
            }
            zzeuVar.zzk(3);
            int zzG = zzeuVar.zzG();
            i += zzG + 10;
            zzagiVar.zzk(zzG);
        }
        zzagiVar.zzl();
        zzagiVar.zzk(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            zzagiVar.zzi(zzeuVar.zzi(), 0, 6);
            zzeuVar.zzh(0);
            if (zzeuVar.zzt() != 2935) {
                zzagiVar.zzl();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                zzagiVar.zzk(i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int zzd = zzafh.zzd(zzeuVar.zzi());
                if (zzd == -1) {
                    return false;
                }
                zzagiVar.zzk(zzd - 6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        this.zza.zzb(zzagkVar, new zzarv(Integer.MIN_VALUE, 0, 1));
        zzagkVar.zzv();
        zzagkVar.zzw(new zzahj(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        zzeu zzeuVar = this.zzb;
        int zza = zzagiVar.zza(zzeuVar.zzi(), 0, 2786);
        if (zza == -1) {
            return -1;
        }
        zzeuVar.zzh(0);
        zzeuVar.zzf(zza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzeuVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, long j2) {
        this.zzc = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }
}
