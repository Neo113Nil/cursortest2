package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzadg {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzadf zzk;
    private final zzav zzl;

    private zzadg(int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j, zzadf zzadfVar, zzav zzavVar) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = zzi(i11);
        this.zzg = i12;
        this.zzh = i13;
        this.zzi = zzh(i13);
        this.zzj = j;
        this.zzk = zzadfVar;
        this.zzl = zzavVar;
    }

    private static int zzh(int i7) {
        if (i7 == 8) {
            return 1;
        }
        if (i7 == 12) {
            return 2;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 != 20) {
            return i7 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int zzi(int i7) {
        switch (i7) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j = this.zzj;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.zze;
    }

    public final long zzb(long j) {
        int i7 = zzen.zza;
        return Math.max(0L, Math.min((j * this.zze) / 1000000, this.zzj - 1));
    }

    public final zzz zzc(byte[] bArr, zzav zzavVar) {
        bArr[4] = Byte.MIN_VALUE;
        zzav zzd = zzd(zzavVar);
        zzx zzxVar = new zzx();
        zzxVar.zzad("audio/flac");
        int i7 = this.zzd;
        if (i7 <= 0) {
            i7 = -1;
        }
        zzxVar.zzT(i7);
        zzxVar.zzB(this.zzg);
        zzxVar.zzae(this.zze);
        zzxVar.zzX(zzen.zzn(this.zzh));
        zzxVar.zzP(Collections.singletonList(bArr));
        zzxVar.zzW(zzd);
        return zzxVar.zzaj();
    }

    public final zzav zzd(zzav zzavVar) {
        zzav zzavVar2 = this.zzl;
        return zzavVar2 == null ? zzavVar : zzavVar2.zzd(zzavVar);
    }

    public final zzadg zze(List list) {
        return new zzadg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzav(list)));
    }

    public final zzadg zzf(zzadf zzadfVar) {
        return new zzadg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzadfVar, this.zzl);
    }

    public final zzadg zzg(List list) {
        return new zzadg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzaeh.zzb(list)));
    }

    public zzadg(byte[] bArr, int i7) {
        zzec zzecVar = new zzec(bArr, bArr.length);
        zzecVar.zzl(i7 * 8);
        this.zza = zzecVar.zzd(16);
        this.zzb = zzecVar.zzd(16);
        this.zzc = zzecVar.zzd(24);
        this.zzd = zzecVar.zzd(24);
        int zzd = zzecVar.zzd(20);
        this.zze = zzd;
        this.zzf = zzi(zzd);
        this.zzg = zzecVar.zzd(3) + 1;
        int zzd2 = zzecVar.zzd(5) + 1;
        this.zzh = zzd2;
        this.zzi = zzh(zzd2);
        this.zzj = zzecVar.zze(36);
        this.zzk = null;
        this.zzl = null;
    }
}
