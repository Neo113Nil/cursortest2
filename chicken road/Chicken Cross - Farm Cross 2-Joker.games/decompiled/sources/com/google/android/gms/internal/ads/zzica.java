package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateCrtKey;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzica implements zzhfn {
    /* synthetic */ zzica(RSAPrivateCrtKey rSAPrivateCrtKey, zzibq zzibqVar, zzibq zzibqVar2, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (zzhly.zza()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzicf.zzb(zzibqVar);
        if (!zzibqVar.equals(zzibqVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        zzicf.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        zzicf.zzd(rSAPrivateCrtKey.getPublicExponent());
    }

    @Override // com.google.android.gms.internal.ads.zzhfn
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
