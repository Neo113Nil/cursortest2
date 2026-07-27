package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhjf {
    private static final zzhmt zza = zzhje.zza;
    private static final zzhok zzb = zzhok.zzd(zzhjd.zza, zzhjc.class, zzhek.class);

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzhlk.zza;
        zzhlk.zza(zzhnw.zza());
        zzhns zza2 = zzhns.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("XAES_256_GCM_192_BIT_NONCE", zzhjb.zzg);
        hashMap.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzhjb.zzh);
        hashMap.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzhjb.zzi);
        hashMap.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzhjb.zzj);
        zza2.zzd(Collections.unmodifiableMap(hashMap));
        zzhnt.zza().zzb(zzb);
        zzhnn.zza().zzb(zza, zzhjh.class);
    }
}
