package com.google.android.gms.internal.ads;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzice {
    public static String zza(zzibq zzibqVar) throws GeneralSecurityException {
        zzicf.zzb(zzibqVar);
        return zzibqVar.toString().concat("withECDSA");
    }

    public static String zzb(zzibq zzibqVar) throws GeneralSecurityException {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1;
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
        throw new GeneralSecurityException("Unsupported hash ".concat(zzibqVar.toString()));
    }
}
