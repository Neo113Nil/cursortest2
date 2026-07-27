package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzicd implements zzhfo {
    static final zzhmo zza;
    private static final byte[] zzb;
    private static final byte[] zzc;

    static {
        zzhmn zza2 = zzhmo.zza();
        zza2.zza(zzibq.SHA256, zzhya.zza);
        zza2.zza(zzibq.SHA384, zzhya.zzb);
        zza2.zza(zzibq.SHA512, zzhya.zzc);
        zza = zza2.zzb();
        zzb = new byte[0];
        zzc = new byte[]{0};
    }

    public static zzhfo zzb(zzhyg zzhygVar) throws GeneralSecurityException {
        try {
            return zziae.zze(zzhygVar);
        } catch (NoSuchProviderException unused) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) zzibh.zzf.zzb("RSA")).generatePublic(new RSAPublicKeySpec(zzhygVar.zzd(), zzhygVar.zzf().zzd()));
            zzhyc zzf = zzhygVar.zzf();
            zzhmo zzhmoVar = zza;
            return new zzicc(rSAPublicKey, (zzibq) zzhmoVar.zzb(zzf.zzf()), (zzibq) zzhmoVar.zzb(zzf.zzg()), zzf.zzh(), zzhygVar.zze().zzc(), zzhygVar.zzf().zze().equals(zzhyb.zzc) ? zzc : zzb, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfo
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
