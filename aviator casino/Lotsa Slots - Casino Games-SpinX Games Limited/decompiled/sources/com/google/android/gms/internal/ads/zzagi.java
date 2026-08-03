package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzagi {
    public static boolean zzb(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagh zzaghVar) throws java.io.IOException {
        zzafzVar.zzl();
        com.google.android.gms.internal.ads.zzes zzesVar = new com.google.android.gms.internal.ads.zzes(new byte[4], 4);
        zzafzVar.zzi(zzesVar.zza, 0, 4);
        boolean zzi = zzesVar.zzi();
        int zzj = zzesVar.zzj(7);
        int zzj2 = zzesVar.zzj(24) + 4;
        if (zzj == 0) {
            byte[] bArr = new byte[38];
            zzafzVar.zzc(bArr, 0, 38);
            zzaghVar.zza = new com.google.android.gms.internal.ads.zzagl(bArr, 4);
        } else {
            com.google.android.gms.internal.ads.zzagl zzaglVar = zzaghVar.zza;
            if (zzaglVar == null) {
                throw new java.lang.IllegalArgumentException();
            }
            if (zzj == 3) {
                com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(zzj2);
                zzafzVar.zzc(zzetVar.zzi(), 0, zzj2);
                zzaghVar.zza = zzaglVar.zze(zzc(zzetVar));
            } else if (zzj == 4) {
                com.google.android.gms.internal.ads.zzet zzetVar2 = new com.google.android.gms.internal.ads.zzet(zzj2);
                zzafzVar.zzc(zzetVar2.zzi(), 0, zzj2);
                zzetVar2.zzk(4);
                zzaghVar.zza = new com.google.android.gms.internal.ads.zzagl(zzaglVar.zza, zzaglVar.zzb, zzaglVar.zzc, zzaglVar.zzd, zzaglVar.zze, zzaglVar.zzg, zzaglVar.zzh, zzaglVar.zzj, zzaglVar.zzk, zzaglVar.zzd(com.google.android.gms.internal.ads.zzahm.zzb(java.util.Arrays.asList(com.google.android.gms.internal.ads.zzhe.zzb(zzetVar2, false, false).zza))));
            } else if (zzj == 6) {
                com.google.android.gms.internal.ads.zzet zzetVar3 = new com.google.android.gms.internal.ads.zzet(zzj2);
                zzafzVar.zzc(zzetVar3.zzi(), 0, zzj2);
                zzetVar3.zzk(4);
                zzaghVar.zza = new com.google.android.gms.internal.ads.zzagl(zzaglVar.zza, zzaglVar.zzb, zzaglVar.zzc, zzaglVar.zzd, zzaglVar.zze, zzaglVar.zzg, zzaglVar.zzh, zzaglVar.zzj, zzaglVar.zzk, zzaglVar.zzd(new com.google.android.gms.internal.ads.zzap(com.google.android.gms.internal.ads.zzgwm.zzj(com.google.android.gms.internal.ads.zzajc.zzb(zzetVar3)))));
            } else {
                zzafzVar.zzf(zzj2);
            }
        }
        return zzi;
    }

    public static com.google.android.gms.internal.ads.zzagk zzc(com.google.android.gms.internal.ads.zzet zzetVar) {
        zzetVar.zzk(1);
        int zzx = zzetVar.zzx();
        long zzg = zzetVar.zzg();
        long j = zzx;
        int i = zzx / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long zzD = zzetVar.zzD();
            if (zzD == -1) {
                jArr = java.util.Arrays.copyOf(jArr, i2);
                jArr2 = java.util.Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = zzD;
            jArr2[i2] = zzetVar.zzD();
            zzetVar.zzk(2);
            i2++;
        }
        zzetVar.zzk((int) ((zzg + j) - zzetVar.zzg()));
        return new com.google.android.gms.internal.ads.zzagk(jArr, jArr2);
    }

    public static com.google.android.gms.internal.ads.zzap zza(com.google.android.gms.internal.ads.zzafz zzafzVar, boolean z) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzap zza = new com.google.android.gms.internal.ads.zzagt().zza(zzafzVar, z ? null : com.google.android.gms.internal.ads.zzajn.zza, 0);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }
}
