package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdx;
import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class zzdt {
    private static final zzps<zzds, zzba> zza = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdw
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzyy.zza((zzds) zzbiVar);
        }
    }, zzds.class, zzba.class);
    private static final zzbh<zzba> zzb = zzod.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", zzba.class, zzwx.zzb.SYMMETRIC, zzud.zze());
    private static final zzot<zzdx> zzc = new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdv
    };
    private static final zzor<zzdx> zzd = new zzor() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdy
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzor
        public final zzbi zza(zzcb zzcbVar, Integer num) {
            return zzdt.zza((zzdx) zzcbVar, num);
        }
    };
    private static final zziv.zza zze = zziv.zza.zzb;

    public static /* synthetic */ zzds zza(zzdx zzdxVar, Integer num) {
        if (zzdxVar.zzc() != 24) {
            return zzds.zze().zza(zzdxVar).zza(num).zza(zzaal.zza(zzdxVar.zzc())).zza();
        }
        throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
    }

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        zziv.zza zzaVar = zze;
        if (zzaVar.zza()) {
            zzgt.zza();
            zzpa.zza().zza(zza);
            zzox zza2 = zzox.zza();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_GCM", zzfm.zza);
            zzdx.zzb zzc2 = zzdx.zze().zza(12).zzb(16).zzc(16);
            zzdx.zza zzaVar2 = zzdx.zza.zzc;
            hashMap.put("AES128_GCM_RAW", zzc2.zza(zzaVar2).zza());
            hashMap.put("AES256_GCM", zzfm.zzb);
            hashMap.put("AES256_GCM_RAW", zzdx.zze().zza(12).zzb(32).zzc(16).zza(zzaVar2).zza());
            zza2.zza(Collections.unmodifiableMap(hashMap));
            zzou.zza().zza(zzc, zzdx.class);
            zzop.zza().zza(zzd, zzdx.class);
            zznq.zza().zza((zzbh) zzb, zzaVar, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
