package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzgeu {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmm zzb = zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzges
        @Override // com.google.android.gms.internal.ads.zzgmk
        public final Object zza(zzgcs zzgcsVar) {
            return zzgub.zzb((zzger) zzgcsVar);
        }
    }, zzger.class, zzgci.class);
    private static final zzgct zzc = zzgkq.zzd("type.googleapis.com/google.crypto.tink.AesEaxKey", zzgci.class, zzgry.SYMMETRIC, zzgqo.zzh());
    private static final zzglj zzd = new zzglj() { // from class: com.google.android.gms.internal.ads.zzget
        @Override // com.google.android.gms.internal.ads.zzglj
        public final zzgcs zza(zzgdf zzgdfVar, Integer num) throws GeneralSecurityException {
            zzgey zzgeyVar = (zzgey) zzgdfVar;
            int i7 = zzgeu.zza;
            if (zzgeyVar.zzc() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            zzgep zzgepVar = new zzgep(null);
            zzgepVar.zzc(zzgeyVar);
            zzgepVar.zza(num);
            zzgepVar.zzb(zzgve.zzc(zzgeyVar.zzc()));
            return zzgepVar.zzd();
        }
    };

    public static void zza(boolean z4) throws GeneralSecurityException {
        if (!zzgjy.zza(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i7 = zzgih.zza;
        zzgih.zze(zzglu.zzc());
        zzglr.zza().zzc(zzb);
        zzglq zzglqVarZzb = zzglq.zzb();
        HashMap map = new HashMap();
        map.put("AES128_EAX", zzghk.zzc);
        zzgev zzgevVar = new zzgev(null);
        zzgevVar.zza(16);
        zzgevVar.zzb(16);
        zzgevVar.zzc(16);
        zzgew zzgewVar = zzgew.zzc;
        zzgevVar.zzd(zzgewVar);
        map.put("AES128_EAX_RAW", zzgevVar.zze());
        map.put("AES256_EAX", zzghk.zzd);
        zzgev zzgevVar2 = new zzgev(null);
        zzgevVar2.zza(16);
        zzgevVar2.zzb(32);
        zzgevVar2.zzc(16);
        zzgevVar2.zzd(zzgewVar);
        map.put("AES256_EAX_RAW", zzgevVar2.zze());
        zzglqVarZzb.zzd(Collections.unmodifiableMap(map));
        zzglk.zzb().zzc(zzd, zzgey.class);
        zzgkh.zzc().zzd(zzc, true);
    }
}
