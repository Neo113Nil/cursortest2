package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes.dex */
public final class zzgfq {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmm zzb = zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzgfn
        @Override // com.google.android.gms.internal.ads.zzgmk
        public final Object zza(zzgcs zzgcsVar) {
            return zzgjx.zzb((zzgfm) zzgcsVar);
        }
    }, zzgfm.class, zzgci.class);
    private static final zzglj zzc = new zzglj() { // from class: com.google.android.gms.internal.ads.zzgfo
        @Override // com.google.android.gms.internal.ads.zzglj
        public final zzgcs zza(zzgdf zzgdfVar, Integer num) {
            zzgfu zzgfuVar = (zzgfu) zzgdfVar;
            int i7 = zzgfq.zza;
            zzgfk zzgfkVar = new zzgfk(null);
            zzgfkVar.zzc(zzgfuVar);
            zzgfkVar.zza(num);
            zzgfkVar.zzb(zzgve.zzc(zzgfuVar.zzb()));
            return zzgfkVar.zzd();
        }
    };
    private static final zzgll zzd = new zzgll() { // from class: com.google.android.gms.internal.ads.zzgfp
    };
    private static final zzgct zze = zzgkq.zzd("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzgci.class, zzgry.SYMMETRIC, zzgrd.zzg());

    public static void zza(boolean z4) throws GeneralSecurityException {
        if (!zzgjy.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i7 = zzgit.zza;
        zzgit.zze(zzglu.zzc());
        if (zzb()) {
            zzglr.zza().zzc(zzb);
            zzglq zzglqVarZzb = zzglq.zzb();
            HashMap map = new HashMap();
            zzgfr zzgfrVar = new zzgfr(null);
            zzgfrVar.zza(16);
            zzgfs zzgfsVar = zzgfs.zza;
            zzgfrVar.zzb(zzgfsVar);
            map.put("AES128_GCM_SIV", zzgfrVar.zzc());
            zzgfr zzgfrVar2 = new zzgfr(null);
            zzgfrVar2.zza(16);
            zzgfs zzgfsVar2 = zzgfs.zzc;
            zzgfrVar2.zzb(zzgfsVar2);
            map.put("AES128_GCM_SIV_RAW", zzgfrVar2.zzc());
            zzgfr zzgfrVar3 = new zzgfr(null);
            zzgfrVar3.zza(32);
            zzgfrVar3.zzb(zzgfsVar);
            map.put("AES256_GCM_SIV", zzgfrVar3.zzc());
            zzgfr zzgfrVar4 = new zzgfr(null);
            zzgfrVar4.zza(32);
            zzgfrVar4.zzb(zzgfsVar2);
            map.put("AES256_GCM_SIV_RAW", zzgfrVar4.zzc());
            zzglqVarZzb.zzd(Collections.unmodifiableMap(map));
            zzglm.zza().zzb(zzd, zzgfu.class);
            zzglk.zzb().zzc(zzc, zzgfu.class);
            zzgkh.zzc().zzd(zze, true);
        }
    }

    private static boolean zzb() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }
}
