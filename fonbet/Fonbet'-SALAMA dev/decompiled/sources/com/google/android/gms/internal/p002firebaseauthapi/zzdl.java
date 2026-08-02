package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdm;
import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzdl {
    private static final zzor<zzdh, zzbg> zza = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdk
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzxp.zza((zzdh) zzbpVar);
        }
    }, zzdh.class, zzbg.class);
    private static final zzbs<zzbg> zzb = zzna.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", zzbg.class, zzvq.zzb.SYMMETRIC, zzsn.zzf());
    private static final zznx<zzdm> zzc = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdn
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            return zzdl.zza((zzdm) zzchVar, num);
        }
    };

    public static /* synthetic */ zzdh zza(zzdm zzdmVar, Integer num) {
        if (zzdmVar.zzc() != 24) {
            return zzdh.zzb().zza(zzdmVar).zza(num).zza(zzze.zza(zzdmVar.zzc())).zza();
        }
        throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
    }

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public static void zza(boolean z4) {
        if (zzil.zza.zza.zza()) {
            zzgi.zza();
            zzoc.zza().zza(zza);
            zzod zza2 = zzod.zza();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_EAX", zzfh.zzc);
            zzdm.zzb zzc2 = zzdm.zze().zza(16).zzb(16).zzc(16);
            zzdm.zza zzaVar = zzdm.zza.zzc;
            hashMap.put("AES128_EAX_RAW", zzc2.zza(zzaVar).zza());
            hashMap.put("AES256_EAX", zzfh.zzd);
            hashMap.put("AES256_EAX_RAW", zzdm.zze().zza(16).zzb(32).zzc(16).zza(zzaVar).zza());
            zza2.zza(Collections.unmodifiableMap(hashMap));
            zznv.zza().zza(zzc, zzdm.class);
            zzmt.zza().zza((zzbs) zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
    }
}
