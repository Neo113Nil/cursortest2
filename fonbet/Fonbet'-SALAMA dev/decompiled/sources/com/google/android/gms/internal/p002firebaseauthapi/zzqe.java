package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.google.android.gms.internal.p002firebaseauthapi.zzqk;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzqe {
    private static final zzor<zzqd, zzqa> zza = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqh
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return new zzri((zzqd) zzbpVar);
        }
    }, zzqd.class, zzqa.class);
    private static final zzor<zzqd, zzci> zzb = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqg
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzyz.zza((zzqd) zzbpVar);
        }
    }, zzqd.class, zzci.class);
    private static final zzbs<zzci> zzc = zzna.zza("type.googleapis.com/google.crypto.tink.HmacKey", zzci.class, zzvq.zzb.SYMMETRIC, zzuu.c_());
    private static final zznz<zzqk> zzd = new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqj
    };
    private static final zznx<zzqk> zze = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqi
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            return zzqe.zza((zzqk) zzchVar, num);
        }
    };
    private static final zzil.zza zzf = zzil.zza.zzb;

    public static zzqd zza(zzqk zzqkVar, Integer num) {
        return zzqd.zzb().zza(zzqkVar).zza(zzze.zza(zzqkVar.zzc())).zza(num).zza();
    }

    public static void zza(boolean z4) {
        zzil.zza zzaVar = zzf;
        if (zzaVar.zza()) {
            zzrh.zza();
            zzoc.zza().zza(zza);
            zzoc.zza().zza(zzb);
            zzod zza2 = zzod.zza();
            HashMap hashMap = new HashMap();
            hashMap.put("HMAC_SHA256_128BITTAG", zzqu.zza);
            zzqk.zza zzb2 = zzqk.zzd().zza(32).zzb(16);
            zzqk.zzb zzbVar = zzqk.zzb.zzd;
            zzqk.zza zza3 = zzb2.zza(zzbVar);
            zzqk.zzc zzcVar = zzqk.zzc.zzc;
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", zza3.zza(zzcVar).zza());
            zzqk.zza zzb3 = zzqk.zzd().zza(32).zzb(32);
            zzqk.zzb zzbVar2 = zzqk.zzb.zza;
            hashMap.put("HMAC_SHA256_256BITTAG", zzb3.zza(zzbVar2).zza(zzcVar).zza());
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzqk.zzd().zza(32).zzb(32).zza(zzbVar).zza(zzcVar).zza());
            zzqk.zza zza4 = zzqk.zzd().zza(64).zzb(16).zza(zzbVar2);
            zzqk.zzc zzcVar2 = zzqk.zzc.zze;
            hashMap.put("HMAC_SHA512_128BITTAG", zza4.zza(zzcVar2).zza());
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzqk.zzd().zza(64).zzb(16).zza(zzbVar).zza(zzcVar2).zza());
            hashMap.put("HMAC_SHA512_256BITTAG", zzqk.zzd().zza(64).zzb(32).zza(zzbVar2).zza(zzcVar2).zza());
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzqk.zzd().zza(64).zzb(32).zza(zzbVar).zza(zzcVar2).zza());
            hashMap.put("HMAC_SHA512_512BITTAG", zzqu.zzb);
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzqk.zzd().zza(64).zzb(64).zza(zzbVar).zza(zzcVar2).zza());
            zza2.zza(Collections.unmodifiableMap(hashMap));
            zznv.zza().zza(zze, zzqk.class);
            zznw.zza().zza(zzd, zzqk.class);
            zzmt.zza().zza((zzbs) zzc, zzaVar, true);
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
