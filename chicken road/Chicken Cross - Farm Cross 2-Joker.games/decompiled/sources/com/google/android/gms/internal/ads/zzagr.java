package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzagr {
    public static boolean zzb(zzagi zzagiVar, zzagq zzagqVar) throws IOException {
        zzagiVar.zzl();
        zzet zzetVar = new zzet(new byte[4], 4);
        zzagiVar.zzi(zzetVar.zza, 0, 4);
        boolean zzi = zzetVar.zzi();
        int zzj = zzetVar.zzj(7);
        int zzj2 = zzetVar.zzj(24) + 4;
        if (zzj == 0) {
            byte[] bArr = new byte[38];
            zzagiVar.zzc(bArr, 0, 38);
            zzagqVar.zza = new zzagu(bArr, 4);
        } else {
            zzagu zzaguVar = zzagqVar.zza;
            if (zzaguVar == null) {
                throw new IllegalArgumentException();
            }
            if (zzj == 3) {
                zzeu zzeuVar = new zzeu(zzj2);
                zzagiVar.zzc(zzeuVar.zzi(), 0, zzj2);
                zzagqVar.zza = zzaguVar.zze(zzc(zzeuVar));
            } else if (zzj == 4) {
                zzeu zzeuVar2 = new zzeu(zzj2);
                zzagiVar.zzc(zzeuVar2.zzi(), 0, zzj2);
                zzeuVar2.zzk(4);
                zzagqVar.zza = new zzagu(zzaguVar.zza, zzaguVar.zzb, zzaguVar.zzc, zzaguVar.zzd, zzaguVar.zze, zzaguVar.zzg, zzaguVar.zzh, zzaguVar.zzj, zzaguVar.zzk, zzaguVar.zzd(zzahv.zzb(Arrays.asList(zzhh.zzb(zzeuVar2, false, false).zza))));
            } else if (zzj == 6) {
                zzeu zzeuVar3 = new zzeu(zzj2);
                zzagiVar.zzc(zzeuVar3.zzi(), 0, zzj2);
                zzeuVar3.zzk(4);
                zzagqVar.zza = new zzagu(zzaguVar.zza, zzaguVar.zzb, zzaguVar.zzc, zzaguVar.zzd, zzaguVar.zze, zzaguVar.zzg, zzaguVar.zzh, zzaguVar.zzj, zzaguVar.zzk, zzaguVar.zzd(new zzap(zzgxm.zzj(zzajn.zzb(zzeuVar3)))));
            } else {
                zzagiVar.zzf(zzj2);
            }
        }
        return zzi;
    }

    public static zzagt zzc(zzeu zzeuVar) {
        zzeuVar.zzk(1);
        int zzx = zzeuVar.zzx();
        long zzg = zzeuVar.zzg();
        long j = zzx;
        int i = zzx / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long zzD = zzeuVar.zzD();
            if (zzD == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = zzD;
            jArr2[i2] = zzeuVar.zzD();
            zzeuVar.zzk(2);
            i2++;
        }
        zzeuVar.zzk((int) ((zzg + j) - zzeuVar.zzg()));
        return new zzagt(jArr, jArr2);
    }

    public static zzap zza(zzagi zzagiVar, boolean z) throws IOException {
        zzap zza = new zzahc().zza(zzagiVar, z ? null : zzajy.zza, 0);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }
}
