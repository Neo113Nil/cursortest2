package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzghv {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmm zzb = zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzghs
        @Override // com.google.android.gms.internal.ads.zzgmk
        public final Object zza(zzgcs zzgcsVar) {
            zzghr zzghrVar = (zzghr) zzgcsVar;
            int i7 = zzghv.zza;
            return zzgjq.zzc() ? zzgjq.zzb(zzghrVar) : zzgvc.zzb(zzghrVar);
        }
    }, zzghr.class, zzgci.class);
    private static final zzgct zzc = zzgkq.zzd("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzgci.class, zzgry.SYMMETRIC, zzgtt.zzg());
    private static final zzgll zzd = new zzgll() { // from class: com.google.android.gms.internal.ads.zzght
    };
    private static final zzglj zze = new zzglj() { // from class: com.google.android.gms.internal.ads.zzghu
        @Override // com.google.android.gms.internal.ads.zzglj
        public final zzgcs zza(zzgdf zzgdfVar, Integer num) {
            int i7 = zzghv.zza;
            return zzghr.zzc(((zzghx) zzgdfVar).zzb(), zzgve.zzc(32), num);
        }
    };

    public static void zza(boolean z4) {
        if (!zzgjy.zza(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i7 = zzgjv.zza;
        zzgjv.zze(zzglu.zzc());
        zzglr.zza().zzc(zzb);
        zzglq zzb2 = zzglq.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", zzghx.zzc(zzghw.zza));
        hashMap.put("XCHACHA20_POLY1305_RAW", zzghx.zzc(zzghw.zzc));
        zzb2.zzd(Collections.unmodifiableMap(hashMap));
        zzglk.zzb().zzc(zze, zzghx.class);
        zzglm.zza().zzb(zzd, zzghx.class);
        zzgkh.zzc().zzd(zzc, true);
    }
}
