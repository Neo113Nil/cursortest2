package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zziad implements zzhfn {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    private zziad(RSAPrivateCrtKey rSAPrivateCrtKey, zzhya zzhyaVar, zzhya zzhyaVar2, int i, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhlx.zza(2)) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzicf.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        zzicf.zzd(rSAPrivateCrtKey.getPublicExponent());
        zziae.zzc(zzhyaVar);
        zziae.zzd(zzhyaVar, zzhyaVar2, i);
    }

    public static zzhfn zzb(zzhye zzhyeVar) throws GeneralSecurityException {
        Provider zzb2 = zziae.zzb();
        if (zzb2 == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", zzb2);
        zzhyc zzd = zzhyeVar.zzd();
        return new zziad((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(zzhyeVar.zze().zzd(), zzd.zzd(), zzhyeVar.zzi().zzb(zzheq.zza()), zzhyeVar.zzf().zzb(zzheq.zza()), zzhyeVar.zzh().zzb(zzheq.zza()), zzhyeVar.zzj().zzb(zzheq.zza()), zzhyeVar.zzk().zzb(zzheq.zza()), zzhyeVar.zzl().zzb(zzheq.zza()))), zzd.zzf(), zzd.zzg(), zzd.zzh(), zzhyeVar.zze().zze().zzc(), zzd.zze().equals(zzhyb.zzc) ? zzb : zza, zzb2);
    }

    @Override // com.google.android.gms.internal.ads.zzhfn
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
