package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzibz implements zzhfo {
    static final zzhmo zza;
    private static final byte[] zzb = new byte[0];
    private static final byte[] zzc = {0};

    static {
        zzhmn zza2 = zzhmo.zza();
        zza2.zza(zzibq.SHA256, zzhxo.zza);
        zza2.zza(zzibq.SHA384, zzhxo.zzb);
        zza2.zza(zzibq.SHA512, zzhxo.zzc);
        zza = zza2.zzb();
    }

    public static zzhfo zzb(zzhxu zzhxuVar) throws GeneralSecurityException {
        try {
            return zzhzv.zzd(zzhxuVar);
        } catch (NoSuchProviderException unused) {
            return new zziby((RSAPublicKey) ((KeyFactory) zzibh.zzf.zzb("RSA")).generatePublic(new RSAPublicKeySpec(zzhxuVar.zzd(), zzhxuVar.zzf().zzd())), (zzibq) zza.zzb(zzhxuVar.zzf().zzf()), zzhxuVar.zze().zzc(), zzhxuVar.zzf().zze().equals(zzhxp.zzc) ? zzc : zzb, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfo
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
