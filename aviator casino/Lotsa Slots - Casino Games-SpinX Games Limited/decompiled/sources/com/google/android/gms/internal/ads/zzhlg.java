package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhlg {
    public static final java.security.spec.ECParameterSpec zza = zzh("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
    public static final java.security.spec.ECParameterSpec zzb = zzh("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
    public static final java.security.spec.ECParameterSpec zzc = zzh("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
    private static final java.math.BigInteger zzd = java.math.BigInteger.valueOf(2);
    private static final java.math.BigInteger zze = java.math.BigInteger.valueOf(3);
    private static final java.math.BigInteger zzf = java.math.BigInteger.valueOf(4);
    private static final java.math.BigInteger zzg = java.math.BigInteger.valueOf(8);

    public static void zza(java.security.spec.ECPoint eCPoint, java.security.spec.EllipticCurve ellipticCurve) throws java.security.GeneralSecurityException {
        java.math.BigInteger zzc2 = zzc(ellipticCurve);
        java.math.BigInteger affineX = eCPoint.getAffineX();
        java.math.BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new java.security.GeneralSecurityException("point is at infinity");
        }
        if (affineX.signum() == -1 || affineX.compareTo(zzc2) >= 0) {
            throw new java.security.GeneralSecurityException("x is out of range");
        }
        if (affineY.signum() == -1 || affineY.compareTo(zzc2) >= 0) {
            throw new java.security.GeneralSecurityException("y is out of range");
        }
        if (!affineY.multiply(affineY).mod(zzc2).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(zzc2))) {
            throw new java.security.GeneralSecurityException("Point is not on curve");
        }
    }

    public static boolean zzb(java.security.spec.ECParameterSpec eCParameterSpec, java.security.spec.ECParameterSpec eCParameterSpec2) {
        return eCParameterSpec.getCurve().equals(eCParameterSpec2.getCurve()) && eCParameterSpec.getGenerator().equals(eCParameterSpec2.getGenerator()) && eCParameterSpec.getOrder().equals(eCParameterSpec2.getOrder()) && eCParameterSpec.getCofactor() == eCParameterSpec2.getCofactor();
    }

    public static java.math.BigInteger zzc(java.security.spec.EllipticCurve ellipticCurve) throws java.security.GeneralSecurityException {
        java.security.spec.ECField field = ellipticCurve.getField();
        if (field instanceof java.security.spec.ECFieldFp) {
            return ((java.security.spec.ECFieldFp) field).getP();
        }
        throw new java.security.GeneralSecurityException("Only curves over prime order fields are supported");
    }

    public static java.security.spec.ECPoint zzd(java.math.BigInteger bigInteger, java.security.spec.ECParameterSpec eCParameterSpec) throws java.security.GeneralSecurityException {
        java.security.spec.ECPoint eCPoint;
        if (!zzb(eCParameterSpec, zza) && !zzb(eCParameterSpec, zzb) && !zzb(eCParameterSpec, zzc)) {
            throw new java.security.GeneralSecurityException("spec must be NIST P256, P384 or P521");
        }
        if (bigInteger.signum() != 1) {
            throw new java.security.GeneralSecurityException("k must be positive");
        }
        if (bigInteger.compareTo(eCParameterSpec.getOrder()) >= 0) {
            throw new java.security.GeneralSecurityException("k must be smaller than the order of the generator");
        }
        java.security.spec.EllipticCurve curve = eCParameterSpec.getCurve();
        java.security.spec.ECPoint generator = eCParameterSpec.getGenerator();
        zza(generator, curve);
        java.math.BigInteger a2 = eCParameterSpec.getCurve().getA();
        java.math.BigInteger zzc2 = zzc(curve);
        com.google.android.gms.internal.ads.zzhlf zze2 = zze(java.security.spec.ECPoint.POINT_INFINITY, zzc2);
        com.google.android.gms.internal.ads.zzhlf zze3 = zze(generator, zzc2);
        for (int bitLength = bigInteger.bitLength(); bitLength >= 0; bitLength--) {
            if (bigInteger.testBit(bitLength)) {
                zze2 = zzg(zze2, zze3, a2, zzc2);
                zze3 = zzf(zze3, a2, zzc2);
            } else {
                zze3 = zzg(zze2, zze3, a2, zzc2);
                zze2 = zzf(zze2, a2, zzc2);
            }
        }
        if (zze2.zza()) {
            eCPoint = java.security.spec.ECPoint.POINT_INFINITY;
        } else {
            java.math.BigInteger modInverse = zze2.zzc.modInverse(zzc2);
            java.math.BigInteger mod = modInverse.multiply(modInverse).mod(zzc2);
            eCPoint = new java.security.spec.ECPoint(zze2.zza.multiply(mod).mod(zzc2), zze2.zzb.multiply(mod).mod(zzc2).multiply(modInverse).mod(zzc2));
        }
        zza(eCPoint, curve);
        return eCPoint;
    }

    static com.google.android.gms.internal.ads.zzhlf zze(java.security.spec.ECPoint eCPoint, java.math.BigInteger bigInteger) {
        if (eCPoint.equals(java.security.spec.ECPoint.POINT_INFINITY)) {
            return com.google.android.gms.internal.ads.zzhlf.zzd;
        }
        java.math.BigInteger mod = new java.math.BigInteger(1, com.google.android.gms.internal.ads.zzhnp.zza((bigInteger.bitLength() + 8) / 8)).mod(bigInteger);
        java.math.BigInteger mod2 = mod.multiply(mod).mod(bigInteger);
        return new com.google.android.gms.internal.ads.zzhlf(eCPoint.getAffineX().multiply(mod2).mod(bigInteger), eCPoint.getAffineY().multiply(mod2.multiply(mod).mod(bigInteger)).mod(bigInteger), mod);
    }

    static com.google.android.gms.internal.ads.zzhlf zzf(com.google.android.gms.internal.ads.zzhlf zzhlfVar, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        java.math.BigInteger bigInteger3 = zzhlfVar.zzb;
        if (bigInteger3.equals(java.math.BigInteger.ZERO)) {
            return com.google.android.gms.internal.ads.zzhlf.zzd;
        }
        java.math.BigInteger bigInteger4 = zzhlfVar.zza;
        java.math.BigInteger mod = bigInteger4.multiply(bigInteger4).mod(bigInteger2);
        java.math.BigInteger mod2 = bigInteger3.multiply(bigInteger3).mod(bigInteger2);
        java.math.BigInteger mod3 = mod2.multiply(mod2).mod(bigInteger2);
        java.math.BigInteger bigInteger5 = zzhlfVar.zzc;
        java.math.BigInteger mod4 = bigInteger5.multiply(bigInteger5).mod(bigInteger2);
        java.math.BigInteger add = bigInteger4.add(mod2);
        java.math.BigInteger subtract = add.multiply(add).mod(bigInteger2).subtract(mod).subtract(mod3);
        java.math.BigInteger bigInteger6 = zzd;
        java.math.BigInteger multiply = subtract.multiply(bigInteger6);
        java.math.BigInteger add2 = mod.multiply(zze).add(bigInteger.multiply(mod4).multiply(mod4).mod(bigInteger2));
        java.math.BigInteger mod5 = add2.multiply(add2).mod(bigInteger2).subtract(multiply.multiply(bigInteger6)).mod(bigInteger2);
        java.math.BigInteger mod6 = add2.multiply(multiply.subtract(mod5)).mod(bigInteger2).subtract(mod3.multiply(zzg)).mod(bigInteger2);
        java.math.BigInteger add3 = bigInteger3.add(bigInteger5);
        return new com.google.android.gms.internal.ads.zzhlf(mod5, mod6, add3.multiply(add3).mod(bigInteger2).subtract(mod2).subtract(mod4).mod(bigInteger2));
    }

    static com.google.android.gms.internal.ads.zzhlf zzg(com.google.android.gms.internal.ads.zzhlf zzhlfVar, com.google.android.gms.internal.ads.zzhlf zzhlfVar2, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        if (zzhlfVar.zza()) {
            return zzhlfVar2;
        }
        if (zzhlfVar2.zza()) {
            return zzhlfVar;
        }
        java.math.BigInteger bigInteger3 = zzhlfVar.zzc;
        java.math.BigInteger mod = bigInteger3.multiply(bigInteger3).mod(bigInteger2);
        java.math.BigInteger bigInteger4 = zzhlfVar2.zzc;
        java.math.BigInteger mod2 = bigInteger4.multiply(bigInteger4).mod(bigInteger2);
        java.math.BigInteger mod3 = zzhlfVar.zza.multiply(mod2).mod(bigInteger2);
        java.math.BigInteger mod4 = zzhlfVar2.zza.multiply(mod).mod(bigInteger2);
        java.math.BigInteger mod5 = zzhlfVar.zzb.multiply(bigInteger4).mod(bigInteger2).multiply(mod2).mod(bigInteger2);
        java.math.BigInteger mod6 = zzhlfVar2.zzb.multiply(bigInteger3).mod(bigInteger2).multiply(mod).mod(bigInteger2);
        if (mod3.equals(mod4)) {
            return !mod5.equals(mod6) ? com.google.android.gms.internal.ads.zzhlf.zzd : zzf(zzhlfVar, bigInteger, bigInteger2);
        }
        java.math.BigInteger mod7 = mod4.subtract(mod3).mod(bigInteger2);
        java.math.BigInteger mod8 = mod7.multiply(zzf).multiply(mod7).mod(bigInteger2);
        java.math.BigInteger mod9 = mod7.multiply(mod8).mod(bigInteger2);
        java.math.BigInteger subtract = mod6.subtract(mod5);
        java.math.BigInteger bigInteger5 = zzd;
        java.math.BigInteger mod10 = subtract.multiply(bigInteger5).mod(bigInteger2);
        java.math.BigInteger mod11 = mod3.multiply(mod8).mod(bigInteger2);
        java.math.BigInteger mod12 = mod10.multiply(mod10).mod(bigInteger2).subtract(mod9).subtract(mod11.multiply(bigInteger5)).mod(bigInteger2);
        java.math.BigInteger mod13 = mod10.multiply(mod11.subtract(mod12)).subtract(mod5.multiply(bigInteger5).multiply(mod9)).mod(bigInteger2);
        java.math.BigInteger add = bigInteger3.add(bigInteger4);
        return new com.google.android.gms.internal.ads.zzhlf(mod12, mod13, add.multiply(add).mod(bigInteger2).subtract(mod).subtract(mod2).multiply(mod7).mod(bigInteger2));
    }

    private static java.security.spec.ECParameterSpec zzh(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.math.BigInteger bigInteger = new java.math.BigInteger(str);
        return new java.security.spec.ECParameterSpec(new java.security.spec.EllipticCurve(new java.security.spec.ECFieldFp(bigInteger), bigInteger.subtract(new java.math.BigInteger(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D)), new java.math.BigInteger(str3, 16)), new java.security.spec.ECPoint(new java.math.BigInteger(str4, 16), new java.math.BigInteger(str5, 16)), new java.math.BigInteger(str2), 1);
    }
}
