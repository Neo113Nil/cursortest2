package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzfs {
    private static final zznx<zzft> zza = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfr
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            zzfp zza2;
            zza2 = zzfp.zza((zzft) zzchVar, zzze.zza(32), num);
            return zza2;
        }
    };
    private static final zzor<zzfp, zzbg> zzb = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfu
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzhw.zza((zzfp) zzbpVar);
        }
    }, zzfp.class, zzbg.class);

    public static void zza(boolean z4) {
        zzhv.zza();
        zzod zza2 = zzod.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzfh.zzg);
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zzoc.zza().zza(zzb);
        zznv.zza().zza(zza, zzft.class);
    }
}
