package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhem {
    public static com.google.android.gms.internal.ads.zzheb zza(java.lang.String str) throws java.security.GeneralSecurityException {
        try {
            try {
                try {
                    com.google.android.gms.internal.ads.zzhsz zze = com.google.android.gms.internal.ads.zzhsz.zze(com.google.android.gms.internal.ads.zzhdp.zza(str).zzb().zzaN(), com.google.android.gms.internal.ads.zzido.zza());
                    for (com.google.android.gms.internal.ads.zzhsy zzhsyVar : zze.zzb()) {
                        if (zzhsyVar.zzb().zzc() == com.google.android.gms.internal.ads.zzhsp.UNKNOWN_KEYMATERIAL || zzhsyVar.zzb().zzc() == com.google.android.gms.internal.ads.zzhsp.SYMMETRIC || zzhsyVar.zzb().zzc() == com.google.android.gms.internal.ads.zzhsp.ASYMMETRIC_PRIVATE) {
                            throw new java.security.GeneralSecurityException(java.lang.String.format("keyset contains key material of type %s for type url %s", zzhsyVar.zzb().zzc().name(), zzhsyVar.zzb().zza()));
                        }
                    }
                    return com.google.android.gms.internal.ads.zzheb.zza(zze);
                } catch (com.google.android.gms.internal.ads.zziet unused) {
                    throw new java.security.GeneralSecurityException("invalid keyset");
                }
            } catch (com.google.android.gms.internal.ads.zziet unused2) {
                throw new java.security.GeneralSecurityException("invalid keyset");
            }
        } catch (java.io.IOException unused3) {
            throw new java.security.GeneralSecurityException("Parse keyset failed");
        }
    }
}
