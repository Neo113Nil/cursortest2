package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzart {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 0, com.google.common.base.Ascii.DLE, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] zzc = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(8);
        int i = com.google.android.gms.internal.ads.zzars.zza(zzafzVar, zzetVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        zzafzVar.zzi(zzetVar.zzi(), 0, 4);
        zzetVar.zzh(0);
        int zzB = zzetVar.zzB();
        if (zzB == 1463899717) {
            return true;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzB).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(zzB);
        com.google.android.gms.internal.ads.zzeg.zze("WavHeaderReader", sb.toString());
        return false;
    }

    public static com.google.android.gms.internal.ads.zzarr zzb(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        byte[] bArr;
        int i;
        com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(16);
        long j = zzd(1718449184, zzafzVar, zzetVar).zzb;
        com.google.android.gms.internal.ads.zzgtj.zzi(j >= 16);
        zzafzVar.zzi(zzetVar.zzi(), 0, 16);
        zzetVar.zzh(0);
        int zzu = zzetVar.zzu();
        int zzu2 = zzetVar.zzu();
        int zzI = zzetVar.zzI();
        int zzI2 = zzetVar.zzI();
        int zzu3 = zzetVar.zzu();
        int zzu4 = zzetVar.zzu();
        int i2 = ((int) j) - 16;
        if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            zzafzVar.zzi(bArr2, 0, i2);
            if (zzu == 65534) {
                if (i2 == 24) {
                    com.google.android.gms.internal.ads.zzet zzetVar2 = new com.google.android.gms.internal.ads.zzet(bArr2);
                    zzetVar2.zzu();
                    int zzu5 = zzetVar2.zzu();
                    if (zzu5 != 0 && zzu5 != zzu4) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzu5).length() + 33 + java.lang.String.valueOf(zzu4).length() + 19);
                        sb.append("validBits ( ");
                        sb.append(zzu5);
                        sb.append(")  != bitsPerSample( ");
                        sb.append(zzu4);
                        sb.append(") are not supported");
                        throw com.google.android.gms.internal.ads.zzat.zzc(sb.toString());
                    }
                    int zzI3 = zzetVar2.zzI();
                    if ((zzI3 >> 18) != 0) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzI3).length() + 21);
                        sb2.append("invalid channel mask ");
                        sb2.append(zzI3);
                        throw com.google.android.gms.internal.ads.zzat.zzc(sb2.toString());
                    }
                    if (zzI3 != 0 && java.lang.Integer.bitCount(zzI3) != zzu2) {
                        int bitCount = java.lang.Integer.bitCount(zzI3);
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(bitCount).length() + 46 + java.lang.String.valueOf(zzI3).length());
                        sb3.append("invalid number of channels (");
                        sb3.append(bitCount);
                        sb3.append(") in channel mask ");
                        sb3.append(zzI3);
                        throw com.google.android.gms.internal.ads.zzat.zzc(sb3.toString());
                    }
                    zzu = zzetVar2.zzu();
                    byte[] bArr3 = new byte[14];
                    zzetVar2.zzm(bArr3, 0, 14);
                    if (!java.util.Arrays.equals(bArr3, zzb) && !java.util.Arrays.equals(bArr3, zzc)) {
                        throw com.google.android.gms.internal.ads.zzat.zzc("invalid wav format extension guid");
                    }
                } else {
                    bArr = bArr2;
                    i = 65534;
                }
            }
            i = zzu;
            bArr = bArr2;
        } else {
            bArr = com.google.android.gms.internal.ads.zzfl.zzb;
            i = zzu;
        }
        zzafzVar.zzf((int) (zzafzVar.zzm() - zzafzVar.zzn()));
        return new com.google.android.gms.internal.ads.zzarr(i, zzu2, zzI, zzI2, zzu3, zzu4, bArr);
    }

    public static android.util.Pair zzc(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        zzafzVar.zzl();
        com.google.android.gms.internal.ads.zzars zzd = zzd(1684108385, zzafzVar, new com.google.android.gms.internal.ads.zzet(8));
        zzafzVar.zzf(8);
        return android.util.Pair.create(java.lang.Long.valueOf(zzafzVar.zzn()), java.lang.Long.valueOf(zzd.zzb));
    }

    private static com.google.android.gms.internal.ads.zzars zzd(int i, com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzet zzetVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzars zza2 = com.google.android.gms.internal.ads.zzars.zza(zzafzVar, zzetVar);
        while (true) {
            int i2 = zza2.zza;
            if (i2 == i) {
                return zza2;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 28);
            sb.append("Ignoring unknown WAV chunk: ");
            sb.append(i2);
            com.google.android.gms.internal.ads.zzeg.zzc("WavHeaderReader", sb.toString());
            long j = zza2.zzb;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 40);
                sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(i2);
                throw com.google.android.gms.internal.ads.zzat.zzc(sb2.toString());
            }
            zzafzVar.zzf((int) j2);
            zza2 = com.google.android.gms.internal.ads.zzars.zza(zzafzVar, zzetVar);
        }
    }
}
