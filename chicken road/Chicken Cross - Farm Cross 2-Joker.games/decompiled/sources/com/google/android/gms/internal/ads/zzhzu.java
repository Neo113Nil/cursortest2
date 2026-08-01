package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhzu implements zzhfn {
    private static final byte[] zzb = new byte[0];
    private static final byte[] zzc = {0};
    private static final byte[] zzd = {1, 2, 3};

    @Nullable
    Provider zza;
    private final RSAPrivateCrtKey zze;
    private final String zzf;
    private final byte[] zzg;
    private final byte[] zzh;
    private final zzhfo zzi;

    private zzhzu(RSAPrivateCrtKey rSAPrivateCrtKey, zzhxo zzhxoVar, byte[] bArr, byte[] bArr2, zzhfo zzhfoVar, @Nullable Provider provider) throws GeneralSecurityException {
        if (!zzhlx.zza(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (zzhxoVar != zzhxo.zza && zzhxoVar != zzhxo.zzb && zzhxoVar != zzhxo.zzc) {
            String valueOf = String.valueOf(zzhxoVar);
            String.valueOf(valueOf);
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(valueOf)));
        }
        zzicf.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        zzicf.zzd(rSAPrivateCrtKey.getPublicExponent());
        this.zze = rSAPrivateCrtKey;
        this.zzf = zzhzv.zzc(zzhxoVar);
        this.zzg = bArr;
        this.zzh = bArr2;
        this.zzi = zzhfoVar;
        this.zza = provider;
    }

    public static zzhfn zzb(zzhxs zzhxsVar) throws GeneralSecurityException {
        Provider zzb2 = zzhzv.zzb();
        zzhzu zzhzuVar = new zzhzu((RSAPrivateCrtKey) (zzb2 != null ? KeyFactory.getInstance("RSA", zzb2) : (KeyFactory) zzibh.zzf.zzb("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(zzhxsVar.zze().zzd(), zzhxsVar.zzd().zzd(), zzhxsVar.zzi().zzb(zzheq.zza()), zzhxsVar.zzf().zzb(zzheq.zza()), zzhxsVar.zzh().zzb(zzheq.zza()), zzhxsVar.zzj().zzb(zzheq.zza()), zzhxsVar.zzk().zzb(zzheq.zza()), zzhxsVar.zzl().zzb(zzheq.zza()))), zzhxsVar.zzd().zzf(), zzhxsVar.zze().zze().zzc(), zzhxsVar.zzd().zze().equals(zzhxp.zzc) ? zzc : zzb, zzb2 != null ? zzhzv.zze(zzhxsVar.zze(), zzb2) : zzibz.zzb(zzhxsVar.zze()), zzb2);
        zzhzuVar.zza(zzd);
        return zzhzuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfn
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        Signature signature;
        Provider provider = this.zza;
        if (provider != null) {
            signature = Signature.getInstance(this.zzf, provider);
        } else {
            signature = (Signature) zzibh.zzc.zzb(this.zzf);
        }
        signature.initSign(this.zze);
        signature.update(bArr);
        byte[] bArr2 = this.zzh;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] sign = signature.sign();
        byte[] bArr3 = this.zzg;
        if (bArr3.length > 0) {
            sign = zziat.zza(bArr3, sign);
        }
        try {
            this.zzi.zza(sign, bArr);
            return sign;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("RSA signature computation error", e);
        }
    }
}
