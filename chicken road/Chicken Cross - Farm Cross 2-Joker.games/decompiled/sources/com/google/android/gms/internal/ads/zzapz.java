package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzapz implements zzagh {
    private final zzaqa zza = new zzaqa(null, 0, "audio/ac4");
    private final zzeu zzb = new zzeu(16384);
    private boolean zzc;

    static {
        int i = zzapy.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        int i;
        zzeu zzeuVar = new zzeu(10);
        int i2 = 0;
        while (true) {
            zzagiVar.zzi(zzeuVar.zzi(), 0, 10);
            zzeuVar.zzh(0);
            if (zzeuVar.zzx() != 4801587) {
                break;
            }
            zzeuVar.zzk(3);
            int zzG = zzeuVar.zzG();
            i2 += zzG + 10;
            zzagiVar.zzk(zzG);
        }
        zzagiVar.zzl();
        zzagiVar.zzk(i2);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            zzagiVar.zzi(zzeuVar.zzi(), 0, 7);
            zzeuVar.zzh(0);
            int zzt = zzeuVar.zzt();
            if (zzt == 44096 || zzt == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] zzi = zzeuVar.zzi();
                int i6 = zzafk.zza;
                if (zzi.length < 7) {
                    i = -1;
                } else {
                    int i7 = ((zzi[2] & 255) << 8) | (zzi[3] & 255);
                    if (i7 == 65535) {
                        i7 = ((zzi[4] & 255) << 16) | ((zzi[5] & 255) << 8) | (zzi[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (zzt == 44097) {
                        i5 += 2;
                    }
                    i = i7 + i5;
                }
                if (i == -1) {
                    return false;
                }
                zzagiVar.zzk(i - 7);
            } else {
                zzagiVar.zzl();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                zzagiVar.zzk(i4);
                i3 = 0;
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
        int zza = zzagiVar.zza(zzeuVar.zzi(), 0, 16384);
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
