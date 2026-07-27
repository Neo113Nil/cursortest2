package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zziae implements zzhfo {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};
    private final RSAPublicKey zzc;
    private final String zzd;
    private final PSSParameterSpec zze;
    private final byte[] zzf;
    private final byte[] zzg;
    private final Provider zzh;

    private zziae(RSAPublicKey rSAPublicKey, zzhya zzhyaVar, zzhya zzhyaVar2, int i, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhlx.zza(2)) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!zzhyaVar.equals(zzhyaVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        zzicf.zzc(rSAPublicKey.getModulus().bitLength());
        zzicf.zzd(rSAPublicKey.getPublicExponent());
        this.zzc = rSAPublicKey;
        this.zzd = zzc(zzhyaVar);
        this.zze = zzd(zzhyaVar, zzhyaVar2, i);
        this.zzf = bArr;
        this.zzg = bArr2;
        this.zzh = provider;
    }

    @Nullable
    static Provider zzb() {
        if (!zzhpd.zzc() || zzhpd.zzd().intValue() > 23) {
            return zzhmb.zza();
        }
        return null;
    }

    static String zzc(zzhya zzhyaVar) {
        if (zzhyaVar == zzhya.zza) {
            return "SHA256withRSA/PSS";
        }
        if (zzhyaVar == zzhya.zzb) {
            return "SHA384withRSA/PSS";
        }
        if (zzhyaVar == zzhya.zzc) {
            return "SHA512withRSA/PSS";
        }
        String valueOf = String.valueOf(zzhyaVar);
        String.valueOf(valueOf);
        throw new IllegalArgumentException("Unsupported hash: ".concat(String.valueOf(valueOf)));
    }

    static PSSParameterSpec zzd(zzhya zzhyaVar, zzhya zzhyaVar2, int i) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        zzhya zzhyaVar3 = zzhya.zza;
        if (zzhyaVar == zzhyaVar3) {
            str = "SHA-256";
        } else if (zzhyaVar == zzhya.zzb) {
            str = "SHA-384";
        } else {
            if (zzhyaVar != zzhya.zzc) {
                String valueOf = String.valueOf(zzhyaVar);
                String.valueOf(valueOf);
                throw new IllegalArgumentException("Unsupported MD hash: ".concat(String.valueOf(valueOf)));
            }
            str = "SHA-512";
        }
        String str2 = str;
        if (zzhyaVar2 == zzhyaVar3) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (zzhyaVar2 == zzhya.zzb) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (zzhyaVar2 != zzhya.zzc) {
                String valueOf2 = String.valueOf(zzhyaVar2);
                String.valueOf(valueOf2);
                throw new IllegalArgumentException("Unsupported MGF1 hash: ".concat(String.valueOf(valueOf2)));
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str2, "MGF1", mGF1ParameterSpec, i, 1);
    }

    public static zzhfo zze(zzhyg zzhygVar) throws GeneralSecurityException {
        Provider zzb2 = zzb();
        if (zzb2 == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA", zzb2).generatePublic(new RSAPublicKeySpec(zzhygVar.zzd(), zzhygVar.zzf().zzd()));
        zzhyc zzf = zzhygVar.zzf();
        return new zziae(rSAPublicKey, zzf.zzf(), zzf.zzg(), zzf.zzh(), zzhygVar.zze().zzc(), zzhygVar.zzf().zze().equals(zzhyb.zzc) ? zzb : zza, zzb2);
    }

    @Override // com.google.android.gms.internal.ads.zzhfo
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzf;
        if (!zzhpd.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str = this.zzd;
        Provider provider = this.zzh;
        RSAPublicKey rSAPublicKey = this.zzc;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.setParameter(this.zze);
        signature.update(bArr2);
        byte[] bArr4 = this.zzg;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (!signature.verify(bArr, length2, length - length2)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }
}
