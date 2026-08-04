package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzalr implements zzacv {
    private final zzals zza = new zzals(null, 0, "audio/ac4");
    private final zzed zzb = new zzed(16384);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) {
        int iZza = zzacwVar.zza(this.zzb.zzN(), 0, 16384);
        if (iZza == -1) {
            return -1;
        }
        this.zzb.zzL(0);
        this.zzb.zzK(iZza);
        if (!this.zzc) {
            this.zza.zzd(0L, 4);
            this.zzc = true;
        }
        this.zza.zza(this.zzb);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ zzacv zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final /* synthetic */ List zzd() {
        return zzfwh.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zze(zzacy zzacyVar) {
        this.zza.zzb(zzacyVar, new zzanm(Integer.MIN_VALUE, 0, 1));
        zzacyVar.zzG();
        zzacyVar.zzP(new zzadt(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(long j, long j3) {
        this.zzc = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzi(zzacw zzacwVar) throws EOFException, InterruptedIOException {
        int i7;
        zzed zzedVar = new zzed(10);
        int i8 = 0;
        while (true) {
            zzack zzackVar = (zzack) zzacwVar;
            zzackVar.zzm(zzedVar.zzN(), 0, 10, false);
            zzedVar.zzL(0);
            if (zzedVar.zzo() != 4801587) {
                break;
            }
            zzedVar.zzM(3);
            int iZzl = zzedVar.zzl();
            i8 += iZzl + 10;
            zzackVar.zzl(iZzl, false);
        }
        zzacwVar.zzj();
        zzack zzackVar2 = (zzack) zzacwVar;
        zzackVar2.zzl(i8, false);
        int i9 = 0;
        int i10 = i8;
        while (true) {
            int i11 = 7;
            zzackVar2.zzm(zzedVar.zzN(), 0, 7, false);
            zzedVar.zzL(0);
            int iZzq = zzedVar.zzq();
            if (iZzq == 44096 || iZzq == 44097) {
                i9++;
                if (i9 >= 4) {
                    return true;
                }
                byte[] bArrZzN = zzedVar.zzN();
                if (bArrZzN.length < 7) {
                    i7 = -1;
                } else {
                    int i12 = ((bArrZzN[2] & 255) << 8) | (bArrZzN[3] & 255);
                    if (i12 == 65535) {
                        i12 = ((bArrZzN[4] & 255) << 16) | ((bArrZzN[5] & 255) << 8) | (bArrZzN[6] & 255);
                    } else {
                        i11 = 4;
                    }
                    if (iZzq == 44097) {
                        i11 += 2;
                    }
                    i7 = i12 + i11;
                }
                if (i7 == -1) {
                    return false;
                }
                zzackVar2.zzl(i7 - 7, false);
            } else {
                zzacwVar.zzj();
                i10++;
                if (i10 - i8 >= 8192) {
                    return false;
                }
                zzackVar2.zzl(i10, false);
                i9 = 0;
            }
        }
    }
}
