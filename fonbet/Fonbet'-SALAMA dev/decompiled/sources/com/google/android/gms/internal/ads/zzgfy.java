package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzgfy {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmm zzb = zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzgfw
        @Override // com.google.android.gms.internal.ads.zzgmk
        public final Object zza(zzgcs zzgcsVar) {
            zzgfv zzgfvVar = (zzgfv) zzgcsVar;
            int i7 = zzgfy.zza;
            return zzgiv.zze() ? zzgiv.zzb(zzgfvVar) : zzgue.zzb(zzgfvVar);
        }
    }, zzgfv.class, zzgci.class);
    private static final zzglj zzc = new zzglj() { // from class: com.google.android.gms.internal.ads.zzgfx
        @Override // com.google.android.gms.internal.ads.zzglj
        public final zzgcs zza(zzgdf zzgdfVar, Integer num) {
            int i7 = zzgfy.zza;
            return zzgfv.zzc(((zzgga) zzgdfVar).zzb(), zzgve.zzc(32), num);
        }
    };
    private static final zzgct zzd = zzgkq.zzd("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzgci.class, zzgry.SYMMETRIC, zzgrj.zzg());

    public static void zza(boolean z4) {
        if (!zzgjy.zza(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i7 = zzgja.zza;
        zzgja.zze(zzglu.zzc());
        zzglr.zza().zzc(zzb);
        zzglk.zzb().zzc(zzc, zzgga.class);
        zzglq zzb2 = zzglq.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", zzgga.zzc(zzgfz.zza));
        hashMap.put("CHACHA20_POLY1305_RAW", zzgga.zzc(zzgfz.zzc));
        zzb2.zzd(Collections.unmodifiableMap(hashMap));
        zzgkh.zzc().zzd(zzd, true);
    }
}
