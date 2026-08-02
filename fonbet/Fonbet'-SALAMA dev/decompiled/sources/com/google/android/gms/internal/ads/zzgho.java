package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzgho {
    private static final zzglj zza = new zzglj() { // from class: com.google.android.gms.internal.ads.zzghm
        @Override // com.google.android.gms.internal.ads.zzglj
        public final zzgcs zza(zzgdf zzgdfVar, Integer num) {
            return zzghl.zzc((zzghq) zzgdfVar, zzgve.zzc(32), num);
        }
    };
    private static final zzgmm zzb = zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzghn
        @Override // com.google.android.gms.internal.ads.zzgmk
        public final Object zza(zzgcs zzgcsVar) {
            return zzgjk.zzb((zzghl) zzgcsVar);
        }
    }, zzghl.class, zzgci.class);

    public static void zza(boolean z4) {
        int i7 = zzgjp.zza;
        zzgjp.zze(zzglu.zzc());
        zzglq zzb2 = zzglq.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put("XAES_256_GCM_192_BIT_NONCE", zzghk.zzg);
        hashMap.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzghk.zzh);
        hashMap.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzghk.zzi);
        hashMap.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzghk.zzj);
        zzb2.zzd(Collections.unmodifiableMap(hashMap));
        zzglr.zza().zzc(zzb);
        zzglk.zzb().zzc(zza, zzghq.class);
    }
}
