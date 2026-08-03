package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzias implements com.google.android.gms.internal.ads.zzhej {
    /* synthetic */ zzias(java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey, com.google.android.gms.internal.ads.zziai zziaiVar, com.google.android.gms.internal.ads.zziai zziaiVar2, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (com.google.android.gms.internal.ads.zzhks.zza()) {
            throw new java.security.GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.android.gms.internal.ads.zziax.zzb(zziaiVar);
        if (!zziaiVar.equals(zziaiVar2)) {
            throw new java.security.GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        com.google.android.gms.internal.ads.zziax.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        com.google.android.gms.internal.ads.zziax.zzd(rSAPrivateCrtKey.getPublicExponent());
    }

    @Override // com.google.android.gms.internal.ads.zzhej
    public final byte[] zza(byte[] bArr) throws java.security.GeneralSecurityException {
        throw null;
    }
}
