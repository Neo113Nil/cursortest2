package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzhmk {
    static final long[] zza;
    static final long[] zzb;
    static final long[] zzc;
    static final zzhmd[][] zzd;
    static final zzhmd[] zze;
    private static final BigInteger zzf;
    private static final BigInteger zzg;
    private static final BigInteger zzh;
    private static final BigInteger zzi;

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        zzf = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        zzg = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        zzh = mod2;
        BigInteger modPow = BigInteger.valueOf(2L).modPow(subtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), subtract);
        zzi = modPow;
        zzhmj zzhmjVar = new zzhmj(null);
        zzhmjVar.zzd(BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract));
        BigInteger zzc2 = zzhmjVar.zzc();
        BigInteger multiply = zzc2.pow(2).subtract(BigInteger.ONE).multiply(mod.multiply(zzc2.pow(2)).add(BigInteger.ONE).modInverse(subtract));
        BigInteger modPow2 = multiply.modPow(subtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), subtract);
        if (!modPow2.pow(2).subtract(multiply).mod(subtract).equals(BigInteger.ZERO)) {
            modPow2 = modPow2.multiply(modPow).mod(subtract);
        }
        if (modPow2.testBit(0)) {
            modPow2 = subtract.subtract(modPow2);
        }
        zzhmjVar.zzb(modPow2);
        zza = zzhmp.zzg(zzb(mod));
        zzb = zzhmp.zzg(zzb(mod2));
        zzc = zzhmp.zzg(zzb(modPow));
        zzd = (zzhmd[][]) Array.newInstance((Class<?>) zzhmd.class, 32, 8);
        zzhmj zzhmjVar2 = zzhmjVar;
        for (int i = 0; i < 32; i++) {
            zzhmj zzhmjVar3 = zzhmjVar2;
            for (int i2 = 0; i2 < 8; i2++) {
                zzd[i][i2] = zzc(zzhmjVar3);
                zzhmjVar3 = zza(zzhmjVar3, zzhmjVar2);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                zzhmjVar2 = zza(zzhmjVar2, zzhmjVar2);
            }
        }
        zzhmj zza2 = zza(zzhmjVar, zzhmjVar);
        zze = new zzhmd[8];
        for (int i4 = 0; i4 < 8; i4++) {
            zze[i4] = zzc(zzhmjVar);
            zzhmjVar = zza(zzhmjVar, zza2);
        }
    }

    private static zzhmj zza(zzhmj zzhmjVar, zzhmj zzhmjVar2) {
        zzhmj zzhmjVar3 = new zzhmj(null);
        BigInteger multiply = zzg.multiply(zzhmjVar.zza().multiply(zzhmjVar2.zza()).multiply(zzhmjVar.zzc()).multiply(zzhmjVar2.zzc()));
        BigInteger bigInteger = zzf;
        BigInteger mod = multiply.mod(bigInteger);
        zzhmjVar3.zzb(zzhmjVar.zza().multiply(zzhmjVar2.zzc()).add(zzhmjVar2.zza().multiply(zzhmjVar.zzc())).multiply(BigInteger.ONE.add(mod).modInverse(bigInteger)).mod(bigInteger));
        zzhmjVar3.zzd(zzhmjVar.zzc().multiply(zzhmjVar2.zzc()).add(zzhmjVar.zza().multiply(zzhmjVar2.zza())).multiply(BigInteger.ONE.subtract(mod).modInverse(bigInteger)).mod(bigInteger));
        return zzhmjVar3;
    }

    private static byte[] zzb(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = 31 - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }

    private static zzhmd zzc(zzhmj zzhmjVar) {
        BigInteger add = zzhmjVar.zzc().add(zzhmjVar.zza());
        BigInteger bigInteger = zzf;
        return new zzhmd(zzhmp.zzg(zzb(add.mod(bigInteger))), zzhmp.zzg(zzb(zzhmjVar.zzc().subtract(zzhmjVar.zza()).mod(bigInteger))), zzhmp.zzg(zzb(zzh.multiply(zzhmjVar.zza()).multiply(zzhmjVar.zzc()).mod(bigInteger))));
    }
}
