package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzamy implements zzacv {
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private zzamv zzi;
    private zzacy zzj;
    private boolean zzk;
    private final zzek zza = new zzek(0);
    private final zzed zzc = new zzed(4096);
    private final SparseArray zzb = new SparseArray();
    private final zzamw zzd = new zzamw();

    /* JADX WARN: Code duplicated, block: B:64:0x014b  */
    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzb(zzacw zzacwVar, zzadr zzadrVar) {
        zzaly zzamaVar;
        zzcv.zzb(this.zzj);
        long jZzd = zzacwVar.zzd();
        if (jZzd != -1) {
            zzamw zzamwVar = this.zzd;
            if (!zzamwVar.zze()) {
                return zzamwVar.zza(zzacwVar, zzadrVar);
            }
        }
        if (!this.zzk) {
            this.zzk = true;
            zzamw zzamwVar2 = this.zzd;
            if (zzamwVar2.zzb() != -9223372036854775807L) {
                zzamv zzamvVar = new zzamv(zzamwVar2.zzd(), zzamwVar2.zzb(), jZzd);
                this.zzi = zzamvVar;
                this.zzj.zzP(zzamvVar.zzb());
            } else {
                this.zzj.zzP(new zzadt(zzamwVar2.zzb(), 0L));
            }
        }
        zzamv zzamvVar2 = this.zzi;
        if (zzamvVar2 != null && zzamvVar2.zze()) {
            return zzamvVar2.zza(zzacwVar, zzadrVar);
        }
        zzacwVar.zzj();
        long jZze = jZzd != -1 ? jZzd - zzacwVar.zze() : -1L;
        if ((jZze != -1 && jZze < 4) || !zzacwVar.zzm(this.zzc.zzN(), 0, 4, true)) {
            return -1;
        }
        this.zzc.zzL(0);
        int iZzg = this.zzc.zzg();
        if (iZzg == 441) {
            return -1;
        }
        if (iZzg == 442) {
            zzacwVar.zzh(this.zzc.zzN(), 0, 10);
            this.zzc.zzL(9);
            zzacwVar.zzk((this.zzc.zzm() & 7) + 14);
            return 0;
        }
        if (iZzg == 443) {
            zzacwVar.zzh(this.zzc.zzN(), 0, 2);
            this.zzc.zzL(0);
            zzacwVar.zzk(this.zzc.zzq() + 6);
            return 0;
        }
        if ((iZzg >> 8) != 1) {
            zzacwVar.zzk(1);
            return 0;
        }
        int i7 = iZzg & 255;
        zzamx zzamxVar = (zzamx) this.zzb.get(i7);
        if (!this.zze) {
            if (zzamxVar == null) {
                zzaly zzalyVar = null;
                if (i7 == 189) {
                    zzamaVar = new zzalq(null, 0, "video/mp2p");
                    this.zzf = true;
                    this.zzh = zzacwVar.zzf();
                } else if ((iZzg & 224) == 192) {
                    zzamaVar = new zzamk(null, 0, "video/mp2p");
                    this.zzf = true;
                    this.zzh = zzacwVar.zzf();
                } else if ((iZzg & 240) == 224) {
                    zzamaVar = new zzama(null, "video/mp2p");
                    this.zzg = true;
                    this.zzh = zzacwVar.zzf();
                } else if (zzalyVar != null) {
                    zzalyVar.zzb(this.zzj, new zzanm(Integer.MIN_VALUE, i7, 256));
                    zzamxVar = new zzamx(zzalyVar, this.zza);
                    this.zzb.put(i7, zzamxVar);
                }
                zzalyVar = zzamaVar;
                if (zzalyVar != null) {
                    zzalyVar.zzb(this.zzj, new zzanm(Integer.MIN_VALUE, i7, 256));
                    zzamxVar = new zzamx(zzalyVar, this.zza);
                    this.zzb.put(i7, zzamxVar);
                }
            }
            long j = 1048576;
            if (this.zzf && this.zzg) {
                j = 8192 + this.zzh;
            }
            if (zzacwVar.zzf() > j) {
                this.zze = true;
                this.zzj.zzG();
            }
        }
        zzacwVar.zzh(this.zzc.zzN(), 0, 2);
        this.zzc.zzL(0);
        int iZzq = this.zzc.zzq() + 6;
        if (zzamxVar == null) {
            zzacwVar.zzk(iZzq);
        } else {
            this.zzc.zzI(iZzq);
            zzacwVar.zzi(this.zzc.zzN(), 0, iZzq);
            this.zzc.zzL(6);
            zzamxVar.zza(this.zzc);
            zzed zzedVar = this.zzc;
            zzedVar.zzK(zzedVar.zzc());
        }
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
        this.zzj = zzacyVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzf(long j, long j3) {
        zzek zzekVar = this.zza;
        if (zzekVar.zzf() != -9223372036854775807L) {
            long jZzd = zzekVar.zzd();
            if (jZzd != -9223372036854775807L && jZzd != 0 && jZzd != j3) {
                zzekVar.zzi(j3);
            }
        } else {
            zzekVar.zzi(j3);
        }
        zzamv zzamvVar = this.zzi;
        if (zzamvVar != null) {
            zzamvVar.zzd(j3);
        }
        for (int i7 = 0; i7 < this.zzb.size(); i7++) {
            ((zzamx) this.zzb.valueAt(i7)).zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzi(zzacw zzacwVar) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        zzack zzackVar = (zzack) zzacwVar;
        zzackVar.zzm(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzackVar.zzl(bArr[13] & 7, false);
        zzackVar.zzm(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }
}
