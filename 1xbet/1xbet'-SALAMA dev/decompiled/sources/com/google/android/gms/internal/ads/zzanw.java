package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
final class zzanw {
    public static Pair zza(zzacw zzacwVar) throws zzaz {
        zzacwVar.zzj();
        zzanv zzanvVarZzd = zzd(1684108385, zzacwVar, new zzed(8));
        zzacwVar.zzk(8);
        return Pair.create(Long.valueOf(zzacwVar.zzf()), Long.valueOf(zzanvVarZzd.zzb));
    }

    public static zzanu zzb(zzacw zzacwVar) throws zzaz {
        byte[] bArr;
        zzed zzedVar = new zzed(16);
        zzanv zzanvVarZzd = zzd(1718449184, zzacwVar, zzedVar);
        zzcv.zzf(zzanvVarZzd.zzb >= 16);
        zzacwVar.zzh(zzedVar.zzN(), 0, 16);
        zzedVar.zzL(0);
        int iZzk = zzedVar.zzk();
        int iZzk2 = zzedVar.zzk();
        int iZzj = zzedVar.zzj();
        int iZzj2 = zzedVar.zzj();
        int iZzk3 = zzedVar.zzk();
        int iZzk4 = zzedVar.zzk();
        int i7 = ((int) zzanvVarZzd.zzb) - 16;
        if (i7 > 0) {
            byte[] bArr2 = new byte[i7];
            zzacwVar.zzh(bArr2, 0, i7);
            bArr = bArr2;
        } else {
            bArr = zzen.zzc;
        }
        zzacwVar.zzk((int) (zzacwVar.zze() - zzacwVar.zzf()));
        return new zzanu(iZzk, iZzk2, iZzj, iZzj2, iZzk3, iZzk4, bArr);
    }

    public static boolean zzc(zzacw zzacwVar) {
        zzed zzedVar = new zzed(8);
        int i7 = zzanv.zza(zzacwVar, zzedVar).zza;
        if (i7 != 1380533830 && i7 != 1380333108) {
            return false;
        }
        zzacwVar.zzh(zzedVar.zzN(), 0, 4);
        zzedVar.zzL(0);
        int iZzg = zzedVar.zzg();
        if (iZzg == 1463899717) {
            return true;
        }
        zzdq.zzc("WavHeaderReader", "Unsupported form type: " + iZzg);
        return false;
    }

    private static zzanv zzd(int i7, zzacw zzacwVar, zzed zzedVar) throws zzaz {
        zzanv zzanvVarZza = zzanv.zza(zzacwVar, zzedVar);
        while (true) {
            int i8 = zzanvVarZza.zza;
            if (i8 == i7) {
                return zzanvVarZza;
            }
            AbstractC0486a1.k(i8, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j = zzanvVarZza.zzb;
            long j3 = 8 + j;
            if ((1 & j) != 0) {
                j3 = j + 9;
            }
            if (j3 > 2147483647L) {
                throw zzaz.zzc("Chunk is too large (~2GB+) to skip; id: " + zzanvVarZza.zza);
            }
            zzacwVar.zzk((int) j3);
            zzanvVarZza = zzanv.zza(zzacwVar, zzedVar);
        }
    }
}
