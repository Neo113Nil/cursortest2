package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhzq implements com.google.android.gms.internal.ads.zzhek {
    public static com.google.android.gms.internal.ads.zzhek zzb(com.google.android.gms.internal.ads.zzhvl zzhvlVar) throws java.security.GeneralSecurityException {
        if (!com.google.android.gms.internal.ads.zzhkr.zza(1)) {
            throw new java.security.GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return com.google.android.gms.internal.ads.zzhyc.zzb(zzhvlVar);
        } catch (java.security.GeneralSecurityException unused) {
            return new com.google.android.gms.internal.ads.zzhzp(zzhvlVar.zzd().zzc(), zzhvlVar.zze().zzc(), zzhvlVar.zzf().zzc().equals(com.google.android.gms.internal.ads.zzhvd.zzc) ? new byte[]{0} : new byte[0], null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final void zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        throw null;
    }
}
