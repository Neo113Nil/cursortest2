package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzgej {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmm zzb = zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzgeg
        @Override // com.google.android.gms.internal.ads.zzgmk
        public final Object zza(zzgcs zzgcsVar) {
            return zzguf.zzb((zzgef) zzgcsVar);
        }
    }, zzgef.class, zzgci.class);
    private static final zzgct zzc = zzgkq.zzd("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzgci.class, zzgry.SYMMETRIC, zzgpz.zzh());
    private static final zzgll zzd = new zzgll() { // from class: com.google.android.gms.internal.ads.zzgeh
    };
    private static final zzglj zze = new zzglj() { // from class: com.google.android.gms.internal.ads.zzgei
        @Override // com.google.android.gms.internal.ads.zzglj
        public final zzgcs zza(zzgdf zzgdfVar, Integer num) throws GeneralSecurityException {
            zzgeo zzgeoVar = (zzgeo) zzgdfVar;
            int i7 = zzgej.zza;
            if (zzgeoVar.zzb() != 16 && zzgeoVar.zzb() != 32) {
                throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
            }
            zzged zzgedVar = new zzged(null);
            zzgedVar.zzd(zzgeoVar);
            zzgedVar.zzc(num);
            zzgedVar.zza(zzgve.zzc(zzgeoVar.zzb()));
            zzgedVar.zzb(zzgve.zzc(zzgeoVar.zzc()));
            return zzgedVar.zze();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z4) throws GeneralSecurityException {
        int i7 = zzf;
        if (!zzgjy.zza(i7)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i8 = zzgic.zza;
        zzgic.zze(zzglu.zzc());
        zzglr.zza().zzc(zzb);
        zzglq zzglqVarZzb = zzglq.zzb();
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", zzghk.zze);
        zzgek zzgekVar = new zzgek(null);
        zzgekVar.zza(16);
        zzgekVar.zzc(32);
        zzgekVar.zze(16);
        zzgekVar.zzd(16);
        zzgel zzgelVar = zzgel.zzc;
        zzgekVar.zzb(zzgelVar);
        zzgem zzgemVar = zzgem.zzc;
        zzgekVar.zzf(zzgemVar);
        map.put("AES128_CTR_HMAC_SHA256_RAW", zzgekVar.zzg());
        map.put("AES256_CTR_HMAC_SHA256", zzghk.zzf);
        zzgek zzgekVar2 = new zzgek(null);
        zzgekVar2.zza(32);
        zzgekVar2.zzc(32);
        zzgekVar2.zze(32);
        zzgekVar2.zzd(16);
        zzgekVar2.zzb(zzgelVar);
        zzgekVar2.zzf(zzgemVar);
        map.put("AES256_CTR_HMAC_SHA256_RAW", zzgekVar2.zzg());
        zzglqVarZzb.zzd(Collections.unmodifiableMap(map));
        zzglm.zza().zzb(zzd, zzgeo.class);
        zzglk.zzb().zzc(zze, zzgeo.class);
        zzgkh.zzc().zzf(zzc, i7, true);
    }
}
