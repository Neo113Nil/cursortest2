package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzgff {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmm zzb = zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzgfc
        @Override // com.google.android.gms.internal.ads.zzgmk
        public final Object zza(zzgcs zzgcsVar) {
            return zzguc.zzb((zzgfb) zzgcsVar);
        }
    }, zzgfb.class, zzgci.class);
    private static final zzgct zzc = zzgkq.zzd("type.googleapis.com/google.crypto.tink.AesGcmKey", zzgci.class, zzgry.SYMMETRIC, zzgqx.zzg());
    private static final zzgll zzd = new zzgll() { // from class: com.google.android.gms.internal.ads.zzgfd
    };
    private static final zzglj zze = new zzglj() { // from class: com.google.android.gms.internal.ads.zzgfe
        @Override // com.google.android.gms.internal.ads.zzglj
        public final zzgcs zza(zzgdf zzgdfVar, Integer num) {
            zzgfj zzgfjVar = (zzgfj) zzgdfVar;
            int i7 = zzgff.zza;
            if (zzgfjVar.zzb() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            zzgez zzgezVar = new zzgez(null);
            zzgezVar.zzc(zzgfjVar);
            zzgezVar.zza(num);
            zzgezVar.zzb(zzgve.zzc(zzgfjVar.zzb()));
            return zzgezVar.zzd();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z4) {
        int i7 = zzf;
        if (!zzgjy.zza(i7)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i8 = zzgio.zza;
        zzgio.zze(zzglu.zzc());
        zzglr.zza().zzc(zzb);
        zzglq zzb2 = zzglq.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzghk.zza);
        zzgfg zzgfgVar = new zzgfg(null);
        zzgfgVar.zza(12);
        zzgfgVar.zzb(16);
        zzgfgVar.zzc(16);
        zzgfh zzgfhVar = zzgfh.zzc;
        zzgfgVar.zzd(zzgfhVar);
        hashMap.put("AES128_GCM_RAW", zzgfgVar.zze());
        hashMap.put("AES256_GCM", zzghk.zzb);
        zzgfg zzgfgVar2 = new zzgfg(null);
        zzgfgVar2.zza(12);
        zzgfgVar2.zzb(32);
        zzgfgVar2.zzc(16);
        zzgfgVar2.zzd(zzgfhVar);
        hashMap.put("AES256_GCM_RAW", zzgfgVar2.zze());
        zzb2.zzd(Collections.unmodifiableMap(hashMap));
        zzglm.zza().zzb(zzd, zzgfj.class);
        zzglk.zzb().zzc(zze, zzgfj.class);
        zzgkh.zzc().zzf(zzc, i7, true);
    }
}
