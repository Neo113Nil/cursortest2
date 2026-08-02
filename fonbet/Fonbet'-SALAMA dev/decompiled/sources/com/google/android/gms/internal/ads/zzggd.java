package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzggd {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmm zzb = zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzggb
        @Override // com.google.android.gms.internal.ads.zzgmk
        public final Object zza(zzgcs zzgcsVar) {
            zzggi zzggiVar = (zzggi) zzgcsVar;
            int i7 = zzggd.zza;
            return zzgji.zzc(zzgdd.zza(zzggiVar.zzd().zzd()).zzb(), zzggiVar.zzb());
        }
    }, zzggi.class, zzgci.class);
    private static final zzgct zzc = zzgkq.zzd("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzgci.class, zzgry.REMOTE, zzgsu.zzg());
    private static final zzglj zzd = new zzglj() { // from class: com.google.android.gms.internal.ads.zzggc
        @Override // com.google.android.gms.internal.ads.zzglj
        public final zzgcs zza(zzgdf zzgdfVar, Integer num) {
            int i7 = zzggd.zza;
            return zzggi.zzc((zzggk) zzgdfVar, num);
        }
    };

    public static void zza(boolean z4) {
        if (!zzgjy.zza(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i7 = zzggp.zza;
        zzggp.zze(zzglu.zzc());
        zzglr.zza().zzc(zzb);
        zzglk.zzb().zzc(zzd, zzggk.class);
        zzgkh.zzc().zzd(zzc, true);
    }
}
