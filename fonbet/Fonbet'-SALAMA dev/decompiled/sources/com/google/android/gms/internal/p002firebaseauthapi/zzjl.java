package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdg;
import com.google.android.gms.internal.p002firebaseauthapi.zzdv;
import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.google.android.gms.internal.p002firebaseauthapi.zzjp;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzjl {
    private static final zzor<zzjs, zzbo> zza = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjo
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzxx.zza((zzjs) zzbpVar);
        }
    }, zzjs.class, zzbo.class);
    private static final zzor<zzjv, zzbn> zzb = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjn
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzxw.zza((zzjv) zzbpVar);
        }
    }, zzjv.class, zzbn.class);
    private static final zzcj<zzbo> zzc = zzna.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", zzbo.class, zzug.zzf());
    private static final zzbs<zzbn> zzd = zzna.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", zzbn.class, zzvq.zzb.ASYMMETRIC_PUBLIC, zzuj.zzh());
    private static final zznx<zzjp> zze = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjq
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            return zzjl.zza((zzjp) zzchVar, num);
        }
    };

    public static /* synthetic */ zzjs zza(zzjp zzjpVar, Integer num) {
        ECParameterSpec eCParameterSpec;
        zzjp.zzc zzd2 = zzjpVar.zzd();
        if (zzd2 == zzjp.zzc.zza) {
            eCParameterSpec = zzmk.zza;
        } else if (zzd2 == zzjp.zzc.zzb) {
            eCParameterSpec = zzmk.zzb;
        } else {
            if (zzd2 != zzjp.zzc.zzc) {
                throw new GeneralSecurityException("Unsupported curve type: ".concat(String.valueOf(zzd2)));
            }
            eCParameterSpec = zzmk.zzc;
        }
        KeyPair zza2 = zzyb.zza(eCParameterSpec);
        return zzjs.zza(zzjv.zza(zzjpVar, ((ECPublicKey) zza2.getPublic()).getW(), num), zzzf.zza(((ECPrivateKey) zza2.getPrivate()).getS(), zzbq.zza()));
    }

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public static void zza(boolean z4) {
        if (zzil.zza.zza.zza()) {
            zzkz.zza();
            zzod zza2 = zzod.zza();
            HashMap hashMap = new HashMap();
            zzjp.zza zzc2 = zzjp.zzc();
            zzjp.zzc zzcVar = zzjp.zzc.zza;
            zzjp.zza zza3 = zzc2.zza(zzcVar);
            zzjp.zzb zzbVar = zzjp.zzb.zzc;
            zzjp.zza zza4 = zza3.zza(zzbVar);
            zzjp.zze zzeVar = zzjp.zze.zzb;
            zzjp.zza zza5 = zza4.zza(zzeVar);
            zzjp.zzd zzdVar = zzjp.zzd.zza;
            zzjp.zza zza6 = zza5.zza(zzdVar);
            zzdv.zza zzc3 = zzdv.zze().zza(12).zzb(16).zzc(16);
            zzdv.zzb zzbVar2 = zzdv.zzb.zzc;
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zza6.zza(zzc3.zza(zzbVar2).zza()).zza());
            zzjp.zza zza7 = zzjp.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar);
            zzjp.zzd zzdVar2 = zzjp.zzd.zzc;
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zza7.zza(zzdVar2).zza(zzdv.zze().zza(12).zzb(16).zzc(16).zza(zzbVar2).zza()).zza());
            zzjp.zza zza8 = zzjp.zzc().zza(zzcVar).zza(zzbVar);
            zzjp.zze zzeVar2 = zzjp.zze.zza;
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zza8.zza(zzeVar2).zza(zzdVar).zza(zzdv.zze().zza(12).zzb(16).zzc(16).zza(zzbVar2).zza()).zza());
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzjp.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar2).zza(zzdVar2).zza(zzdv.zze().zza(12).zzb(16).zzc(16).zza(zzbVar2).zza()).zza());
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzjp.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar2).zza(zzdVar2).zza(zzdv.zze().zza(12).zzb(16).zzc(16).zza(zzbVar2).zza()).zza());
            zzjp.zza zza9 = zzjp.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar).zza(zzdVar);
            zzdg.zza zzc4 = zzdg.zzf().zza(16).zzb(32).zzd(16).zzc(16);
            zzdg.zzc zzcVar2 = zzdg.zzc.zzc;
            zzdg.zza zza10 = zzc4.zza(zzcVar2);
            zzdg.zzb zzbVar3 = zzdg.zzb.zzc;
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zza9.zza(zza10.zza(zzbVar3).zza()).zza());
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzjp.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar).zza(zzdVar2).zza(zzdg.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzcVar2).zza(zzbVar3).zza()).zza());
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzjp.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar2).zza(zzdVar).zza(zzdg.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzcVar2).zza(zzbVar3).zza()).zza());
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzjp.zzc().zza(zzcVar).zza(zzbVar).zza(zzeVar2).zza(zzdVar2).zza(zzdg.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzcVar2).zza(zzbVar3).zza()).zza());
            zza2.zza(Collections.unmodifiableMap(hashMap));
            zzoc.zza().zza(zza);
            zzoc.zza().zza(zzb);
            zznv.zza().zza(zze, zzjp.class);
            zzmt.zza().zza((zzbs) zzc, true);
            zzmt.zza().zza((zzbs) zzd, false);
            return;
        }
        throw new GeneralSecurityException("Registering ECIES Hybrid Encryption is not supported in FIPS mode");
    }
}
