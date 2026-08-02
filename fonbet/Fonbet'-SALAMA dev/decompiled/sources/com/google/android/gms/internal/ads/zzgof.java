package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzgof {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmm zzb = zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzgob
        @Override // com.google.android.gms.internal.ads.zzgmk
        public final Object zza(zzgcs zzgcsVar) {
            return new zzgpg((zzgoa) zzgcsVar);
        }
    }, zzgoa.class, zzgnu.class);
    private static final zzgmm zzc = zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzgoc
        @Override // com.google.android.gms.internal.ads.zzgmk
        public final Object zza(zzgcs zzgcsVar) {
            return zzgva.zzb((zzgoa) zzgcsVar);
        }
    }, zzgoa.class, zzgde.class);
    private static final zzgct zzd = zzgkq.zzd("type.googleapis.com/google.crypto.tink.HmacKey", zzgde.class, zzgry.SYMMETRIC, zzgrq.zzi());
    private static final zzgll zze = new zzgll() { // from class: com.google.android.gms.internal.ads.zzgod
    };
    private static final zzglj zzf = new zzglj() { // from class: com.google.android.gms.internal.ads.zzgoe
        @Override // com.google.android.gms.internal.ads.zzglj
        public final zzgcs zza(zzgdf zzgdfVar, Integer num) {
            zzgok zzgokVar = (zzgok) zzgdfVar;
            int i7 = zzgof.zza;
            zzgny zzgnyVar = new zzgny(null);
            zzgnyVar.zzc(zzgokVar);
            zzgnyVar.zzb(zzgve.zzc(zzgokVar.zzc()));
            zzgnyVar.zza(num);
            return zzgnyVar.zzd();
        }
    };
    private static final int zzg = 2;

    public static void zza(boolean z4) {
        int i7 = zzg;
        if (!zzgjy.zza(i7)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i8 = zzgpl.zza;
        zzgpl.zze(zzglu.zzc());
        zzglr.zza().zzc(zzb);
        zzglr.zza().zzc(zzc);
        zzglq zzb2 = zzglq.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzgoy.zza);
        zzgog zzgogVar = new zzgog(null);
        zzgogVar.zzb(32);
        zzgogVar.zzc(16);
        zzgoi zzgoiVar = zzgoi.zzd;
        zzgogVar.zzd(zzgoiVar);
        zzgoh zzgohVar = zzgoh.zzc;
        zzgogVar.zza(zzgohVar);
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzgogVar.zze());
        zzgog zzgogVar2 = new zzgog(null);
        zzgogVar2.zzb(32);
        zzgogVar2.zzc(32);
        zzgoi zzgoiVar2 = zzgoi.zza;
        zzgogVar2.zzd(zzgoiVar2);
        zzgogVar2.zza(zzgohVar);
        hashMap.put("HMAC_SHA256_256BITTAG", zzgogVar2.zze());
        zzgog zzgogVar3 = new zzgog(null);
        zzgogVar3.zzb(32);
        zzgogVar3.zzc(32);
        zzgogVar3.zzd(zzgoiVar);
        zzgogVar3.zza(zzgohVar);
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzgogVar3.zze());
        zzgog zzgogVar4 = new zzgog(null);
        zzgogVar4.zzb(64);
        zzgogVar4.zzc(16);
        zzgogVar4.zzd(zzgoiVar2);
        zzgoh zzgohVar2 = zzgoh.zze;
        zzgogVar4.zza(zzgohVar2);
        hashMap.put("HMAC_SHA512_128BITTAG", zzgogVar4.zze());
        zzgog zzgogVar5 = new zzgog(null);
        zzgogVar5.zzb(64);
        zzgogVar5.zzc(16);
        zzgogVar5.zzd(zzgoiVar);
        zzgogVar5.zza(zzgohVar2);
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzgogVar5.zze());
        zzgog zzgogVar6 = new zzgog(null);
        zzgogVar6.zzb(64);
        zzgogVar6.zzc(32);
        zzgogVar6.zzd(zzgoiVar2);
        zzgogVar6.zza(zzgohVar2);
        hashMap.put("HMAC_SHA512_256BITTAG", zzgogVar6.zze());
        zzgog zzgogVar7 = new zzgog(null);
        zzgogVar7.zzb(64);
        zzgogVar7.zzc(32);
        zzgogVar7.zzd(zzgoiVar);
        zzgogVar7.zza(zzgohVar2);
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzgogVar7.zze());
        hashMap.put("HMAC_SHA512_512BITTAG", zzgoy.zzb);
        zzgog zzgogVar8 = new zzgog(null);
        zzgogVar8.zzb(64);
        zzgogVar8.zzc(64);
        zzgogVar8.zzd(zzgoiVar);
        zzgogVar8.zza(zzgohVar2);
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzgogVar8.zze());
        zzb2.zzd(Collections.unmodifiableMap(hashMap));
        zzglk.zzb().zzc(zzf, zzgok.class);
        zzglm.zza().zzb(zze, zzgok.class);
        zzgkh.zzc().zzf(zzd, i7, true);
    }
}
