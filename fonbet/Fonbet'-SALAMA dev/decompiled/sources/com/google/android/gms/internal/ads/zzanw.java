package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import android.util.Pair;

/* loaded from: classes.dex */
final class zzanw {
    public static Pair zza(zzacw zzacwVar) {
        zzacwVar.zzj();
        zzanv zzd = zzd(1684108385, zzacwVar, new zzed(8));
        zzacwVar.zzk(8);
        return Pair.create(Long.valueOf(zzacwVar.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzanu zzb(zzacw zzacwVar) {
        byte[] bArr;
        zzed zzedVar = new zzed(16);
        zzanv zzd = zzd(1718449184, zzacwVar, zzedVar);
        zzcv.zzf(zzd.zzb >= 16);
        zzacwVar.zzh(zzedVar.zzN(), 0, 16);
        zzedVar.zzL(0);
        int zzk = zzedVar.zzk();
        int zzk2 = zzedVar.zzk();
        int zzj = zzedVar.zzj();
        int zzj2 = zzedVar.zzj();
        int zzk3 = zzedVar.zzk();
        int zzk4 = zzedVar.zzk();
        int i7 = ((int) zzd.zzb) - 16;
        if (i7 > 0) {
            byte[] bArr2 = new byte[i7];
            zzacwVar.zzh(bArr2, 0, i7);
            bArr = bArr2;
        } else {
            bArr = zzen.zzc;
        }
        zzacwVar.zzk((int) (zzacwVar.zze() - zzacwVar.zzf()));
        return new zzanu(zzk, zzk2, zzj, zzj2, zzk3, zzk4, bArr);
    }

    public static boolean zzc(zzacw zzacwVar) {
        zzed zzedVar = new zzed(8);
        int i7 = zzanv.zza(zzacwVar, zzedVar).zza;
        if (i7 != 1380533830 && i7 != 1380333108) {
            return false;
        }
        zzacwVar.zzh(zzedVar.zzN(), 0, 4);
        zzedVar.zzL(0);
        int zzg = zzedVar.zzg();
        if (zzg == 1463899717) {
            return true;
        }
        zzdq.zzc("WavHeaderReader", "Unsupported form type: " + zzg);
        return false;
    }

    private static zzanv zzd(int i7, zzacw zzacwVar, zzed zzedVar) {
        zzanv zza = zzanv.zza(zzacwVar, zzedVar);
        while (true) {
            int i8 = zza.zza;
            if (i8 == i7) {
                return zza;
            }
            AbstractC0486a1.k(i8, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j = zza.zzb;
            long j3 = 8 + j;
            if ((1 & j) != 0) {
                j3 = j + 9;
            }
            if (j3 > 2147483647L) {
                throw zzaz.zzc("Chunk is too large (~2GB+) to skip; id: " + zza.zza);
            }
            zzacwVar.zzk((int) j3);
            zza = zzanv.zza(zzacwVar, zzedVar);
        }
    }
}
