package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhle {
    static final long[] zza;
    static final long[] zzb;
    static final long[] zzc;
    static final com.google.android.gms.internal.ads.zzhkx[][] zzd;
    static final com.google.android.gms.internal.ads.zzhkx[] zze;
    private static final java.math.BigInteger zzf;
    private static final java.math.BigInteger zzg;
    private static final java.math.BigInteger zzh;
    private static final java.math.BigInteger zzi;

    static {
        java.math.BigInteger subtract = java.math.BigInteger.valueOf(2L).pow(255).subtract(java.math.BigInteger.valueOf(19L));
        zzf = subtract;
        java.math.BigInteger mod = java.math.BigInteger.valueOf(-121665L).multiply(java.math.BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        zzg = mod;
        java.math.BigInteger mod2 = java.math.BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        zzh = mod2;
        java.math.BigInteger modPow = java.math.BigInteger.valueOf(2L).modPow(subtract.subtract(java.math.BigInteger.ONE).divide(java.math.BigInteger.valueOf(4L)), subtract);
        zzi = modPow;
        com.google.android.gms.internal.ads.zzhld zzhldVar = new com.google.android.gms.internal.ads.zzhld(null);
        zzhldVar.zzd(java.math.BigInteger.valueOf(4L).multiply(java.math.BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract));
        java.math.BigInteger zzc2 = zzhldVar.zzc();
        java.math.BigInteger multiply = zzc2.pow(2).subtract(java.math.BigInteger.ONE).multiply(mod.multiply(zzc2.pow(2)).add(java.math.BigInteger.ONE).modInverse(subtract));
        java.math.BigInteger modPow2 = multiply.modPow(subtract.add(java.math.BigInteger.valueOf(3L)).divide(java.math.BigInteger.valueOf(8L)), subtract);
        if (!modPow2.pow(2).subtract(multiply).mod(subtract).equals(java.math.BigInteger.ZERO)) {
            modPow2 = modPow2.multiply(modPow).mod(subtract);
        }
        if (modPow2.testBit(0)) {
            modPow2 = subtract.subtract(modPow2);
        }
        zzhldVar.zzb(modPow2);
        zza = com.google.android.gms.internal.ads.zzhlj.zzg(zzb(mod));
        zzb = com.google.android.gms.internal.ads.zzhlj.zzg(zzb(mod2));
        zzc = com.google.android.gms.internal.ads.zzhlj.zzg(zzb(modPow));
        zzd = (com.google.android.gms.internal.ads.zzhkx[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) com.google.android.gms.internal.ads.zzhkx.class, 32, 8);
        com.google.android.gms.internal.ads.zzhld zzhldVar2 = zzhldVar;
        for (int i = 0; i < 32; i++) {
            com.google.android.gms.internal.ads.zzhld zzhldVar3 = zzhldVar2;
            for (int i2 = 0; i2 < 8; i2++) {
                zzd[i][i2] = zzc(zzhldVar3);
                zzhldVar3 = zza(zzhldVar3, zzhldVar2);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                zzhldVar2 = zza(zzhldVar2, zzhldVar2);
            }
        }
        com.google.android.gms.internal.ads.zzhld zza2 = zza(zzhldVar, zzhldVar);
        zze = new com.google.android.gms.internal.ads.zzhkx[8];
        for (int i4 = 0; i4 < 8; i4++) {
            zze[i4] = zzc(zzhldVar);
            zzhldVar = zza(zzhldVar, zza2);
        }
    }

    private static com.google.android.gms.internal.ads.zzhld zza(com.google.android.gms.internal.ads.zzhld zzhldVar, com.google.android.gms.internal.ads.zzhld zzhldVar2) {
        com.google.android.gms.internal.ads.zzhld zzhldVar3 = new com.google.android.gms.internal.ads.zzhld(null);
        java.math.BigInteger multiply = zzg.multiply(zzhldVar.zza().multiply(zzhldVar2.zza()).multiply(zzhldVar.zzc()).multiply(zzhldVar2.zzc()));
        java.math.BigInteger bigInteger = zzf;
        java.math.BigInteger mod = multiply.mod(bigInteger);
        zzhldVar3.zzb(zzhldVar.zza().multiply(zzhldVar2.zzc()).add(zzhldVar2.zza().multiply(zzhldVar.zzc())).multiply(java.math.BigInteger.ONE.add(mod).modInverse(bigInteger)).mod(bigInteger));
        zzhldVar3.zzd(zzhldVar.zzc().multiply(zzhldVar2.zzc()).add(zzhldVar.zza().multiply(zzhldVar2.zza())).multiply(java.math.BigInteger.ONE.subtract(mod).modInverse(bigInteger)).mod(bigInteger));
        return zzhldVar3;
    }

    private static byte[] zzb(java.math.BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        java.lang.System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = 31 - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }

    private static com.google.android.gms.internal.ads.zzhkx zzc(com.google.android.gms.internal.ads.zzhld zzhldVar) {
        java.math.BigInteger add = zzhldVar.zzc().add(zzhldVar.zza());
        java.math.BigInteger bigInteger = zzf;
        return new com.google.android.gms.internal.ads.zzhkx(com.google.android.gms.internal.ads.zzhlj.zzg(zzb(add.mod(bigInteger))), com.google.android.gms.internal.ads.zzhlj.zzg(zzb(zzhldVar.zzc().subtract(zzhldVar.zza()).mod(bigInteger))), com.google.android.gms.internal.ads.zzhlj.zzg(zzb(zzh.multiply(zzhldVar.zza()).multiply(zzhldVar.zzc()).mod(bigInteger))));
    }
}
