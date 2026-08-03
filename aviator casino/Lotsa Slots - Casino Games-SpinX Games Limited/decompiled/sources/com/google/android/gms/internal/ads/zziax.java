package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zziax {
    static {
        java.lang.String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+");
        java.lang.String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+");
    }

    public static void zza(int i) throws java.security.InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", java.lang.Integer.valueOf(i * 8)));
        }
    }

    public static void zzb(com.google.android.gms.internal.ads.zziai zziaiVar) throws java.security.GeneralSecurityException {
        int ordinal = zziaiVar.ordinal();
        if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
            return;
        }
        java.lang.String name = zziaiVar.name();
        java.lang.String.valueOf(name);
        throw new java.security.GeneralSecurityException("Unsupported hash: ".concat(java.lang.String.valueOf(name)));
    }

    public static void zzd(java.math.BigInteger bigInteger) throws java.security.GeneralSecurityException {
        if (!bigInteger.testBit(0)) {
            throw new java.security.GeneralSecurityException("Public exponent must be odd.");
        }
        if (bigInteger.compareTo(java.math.BigInteger.valueOf(android.support.v4.media.session.PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)) <= 0) {
            throw new java.security.GeneralSecurityException("Public exponent must be greater than 65536.");
        }
    }

    public static void zzc(int i) throws java.security.GeneralSecurityException {
        if (i < 2048) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", java.lang.Integer.valueOf(i)));
        }
        if (com.google.android.gms.internal.ads.zzhks.zza() && i != 2048 && i != 3072) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode.", java.lang.Integer.valueOf(i)));
        }
    }
}
