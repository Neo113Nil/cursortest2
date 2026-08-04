package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzgnp {
    private static final zzglj zza = new zzglj() { // from class: com.google.android.gms.internal.ads.zzgnm
        @Override // com.google.android.gms.internal.ads.zzglj
        public final zzgcs zza(zzgdf zzgdfVar, Integer num) {
            return zzgnp.zzb((zzgnt) zzgdfVar, num);
        }
    };
    private static final zzgmm zzb = zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzgnn
        @Override // com.google.android.gms.internal.ads.zzgmk
        public final Object zza(zzgcs zzgcsVar) {
            return zzgnp.zzc((zzgnl) zzgcsVar);
        }
    }, zzgnl.class, zzgnu.class);
    private static final zzgmm zzc = zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzgno
        @Override // com.google.android.gms.internal.ads.zzgmk
        public final Object zza(zzgcs zzgcsVar) {
            return zzgnp.zza((zzgnl) zzgcsVar);
        }
    }, zzgnl.class, zzgde.class);
    private static final zzgct zzd = zzgkq.zzd("type.googleapis.com/google.crypto.tink.AesCmacKey", zzgde.class, zzgry.SYMMETRIC, zzgpq.zzh());

    public static /* synthetic */ zzgde zza(zzgnl zzgnlVar) throws GeneralSecurityException {
        zze(zzgnlVar.zzc());
        return zzgva.zza(zzgnlVar);
    }

    public static /* synthetic */ zzgnl zzb(zzgnt zzgntVar, Integer num) throws GeneralSecurityException {
        zze(zzgntVar);
        zzgnj zzgnjVar = new zzgnj(null);
        zzgnjVar.zzc(zzgntVar);
        zzgnjVar.zza(zzgve.zzc(zzgntVar.zzc()));
        zzgnjVar.zzb(num);
        return zzgnjVar.zzd();
    }

    public static /* synthetic */ zzgnu zzc(zzgnl zzgnlVar) throws GeneralSecurityException {
        zze(zzgnlVar.zzc());
        return new zzgpf(zzgnlVar);
    }

    public static void zzd(boolean z4) throws GeneralSecurityException {
        if (!zzgjy.zza(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i7 = zzgpd.zza;
        zzgpd.zze(zzglu.zzc());
        zzglk.zzb().zzc(zza, zzgnt.class);
        zzglr.zza().zzc(zzb);
        zzglr.zza().zzc(zzc);
        zzglq zzglqVarZzb = zzglq.zzb();
        HashMap map = new HashMap();
        zzgnt zzgntVar = zzgoy.zzc;
        map.put("AES_CMAC", zzgntVar);
        map.put("AES256_CMAC", zzgntVar);
        zzgnq zzgnqVar = new zzgnq(null);
        zzgnqVar.zza(32);
        zzgnqVar.zzb(16);
        zzgnqVar.zzc(zzgnr.zzd);
        map.put("AES256_CMAC_RAW", zzgnqVar.zzd());
        zzglqVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgkh.zzc().zzd(zzd, true);
    }

    private static void zze(zzgnt zzgntVar) throws GeneralSecurityException {
        if (zzgntVar.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
