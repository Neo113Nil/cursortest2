package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zziaw {
    public static java.lang.String zza(com.google.android.gms.internal.ads.zziai zziaiVar) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zziax.zzb(zziaiVar);
        return zziaiVar.toString().concat("withECDSA");
    }

    public static java.lang.String zzb(com.google.android.gms.internal.ads.zziai zziaiVar) throws java.security.GeneralSecurityException {
        int ordinal = zziaiVar.ordinal();
        if (ordinal == 0) {
            return com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1;
        }
        if (ordinal == 1) {
            return "SHA-224";
        }
        if (ordinal == 2) {
            return "SHA-256";
        }
        if (ordinal == 3) {
            return "SHA-384";
        }
        if (ordinal == 4) {
            return "SHA-512";
        }
        throw new java.security.GeneralSecurityException("Unsupported hash ".concat(zziaiVar.toString()));
    }
}
