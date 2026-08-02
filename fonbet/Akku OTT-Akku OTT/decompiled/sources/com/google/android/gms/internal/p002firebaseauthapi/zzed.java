package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzeg;
import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class zzed {
    private static final zzps<zzdz, zzba> zza = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzec
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzip.zza((zzdz) zzbiVar);
        }
    }, zzdz.class, zzba.class);
    private static final zzor<zzeg> zzb = new zzor() { // from class: com.google.android.gms.internal.firebase-auth-api.zzef
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzor
        public final zzbi zza(zzcb zzcbVar, Integer num) {
            zzdz zza2;
            zza2 = zzdz.zze().zza(r1).zza(num).zza(zzaal.zza(((zzeg) zzcbVar).zzb())).zza();
            return zza2;
        }
    };
    private static final zzot<zzeg> zzc = new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzee
    };
    private static final zzbh<zzba> zzd = zzod.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzba.class, zzwx.zzb.SYMMETRIC, zzuj.zze());

    public static void zza(boolean z) throws GeneralSecurityException {
        if (zziv.zza.zza.zza()) {
            zzhb.zza();
            zzox zza2 = zzox.zza();
            HashMap hashMap = new HashMap();
            zzeg.zza zza3 = zzeg.zzc().zza(16);
            zzeg.zzb zzbVar = zzeg.zzb.zza;
            hashMap.put("AES128_GCM_SIV", zza3.zza(zzbVar).zza());
            zzeg.zza zza4 = zzeg.zzc().zza(16);
            zzeg.zzb zzbVar2 = zzeg.zzb.zzc;
            hashMap.put("AES128_GCM_SIV_RAW", zza4.zza(zzbVar2).zza());
            hashMap.put("AES256_GCM_SIV", zzeg.zzc().zza(32).zza(zzbVar).zza());
            hashMap.put("AES256_GCM_SIV_RAW", zzeg.zzc().zza(32).zza(zzbVar2).zza());
            zza2.zza(Collections.unmodifiableMap(hashMap));
            zzou.zza().zza(zzc, zzeg.class);
            zzop.zza().zza(zzb, zzeg.class);
            zzpa.zza().zza(zza);
            zznq.zza().zza((zzbh) zzd, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
    }
}
