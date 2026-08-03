package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhen {
    public static byte[] zza(com.google.android.gms.internal.ads.zzheh zzhehVar) throws java.security.GeneralSecurityException {
        return ((com.google.android.gms.internal.ads.zzhnn) com.google.android.gms.internal.ads.zzhmr.zza().zzk(zzhehVar, com.google.android.gms.internal.ads.zzhnn.class)).zzc().zzaN();
    }

    public static com.google.android.gms.internal.ads.zzheh zzb(byte[] bArr) throws java.security.GeneralSecurityException {
        try {
            com.google.android.gms.internal.ads.zzhst zzd = com.google.android.gms.internal.ads.zzhst.zzd(bArr, com.google.android.gms.internal.ads.zzido.zza());
            com.google.android.gms.internal.ads.zzhmr zza = com.google.android.gms.internal.ads.zzhmr.zza();
            com.google.android.gms.internal.ads.zzhnn zzb = com.google.android.gms.internal.ads.zzhnn.zzb(zzd);
            return !zza.zzi(zzb) ? new com.google.android.gms.internal.ads.zzhma(zzb) : zza.zzj(zzb);
        } catch (java.io.IOException e) {
            throw new java.security.GeneralSecurityException("Failed to parse proto", e);
        }
    }
}
