package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzggh {
    public static final /* synthetic */ int zza = 0;
    private static final zzgct zzb = zzgkq.zzd("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzgci.class, zzgry.SYMMETRIC, zzgta.zzg());
    private static final zzglj zzc = new zzglj() { // from class: com.google.android.gms.internal.ads.zzggf
        @Override // com.google.android.gms.internal.ads.zzglj
        public final zzgcs zza(zzgdf zzgdfVar, Integer num) {
            int i7 = zzggh.zza;
            return zzggq.zzc((zzggv) zzgdfVar, num);
        }
    };
    private static final zzgmm zzd = zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzggg
        @Override // com.google.android.gms.internal.ads.zzgmk
        public final Object zza(zzgcs zzgcsVar) {
            zzggq zzggqVar = (zzggq) zzgcsVar;
            int i7 = zzggh.zza;
            String zzd2 = zzggqVar.zzd().zzd();
            zzgdx zzb2 = zzggqVar.zzd().zzb();
            zzgci zzb3 = zzgdd.zza(zzd2).zzb();
            int i8 = zzgge.zza;
            try {
                return zzgji.zzc(new zzgge(zzgse.zzf(zzgdl.zzb(zzb2), zzgwq.zza()), zzb3), zzggqVar.zzb());
            } catch (zzgxv e7) {
                throw new GeneralSecurityException(e7);
            }
        }
    }, zzggq.class, zzgci.class);

    public static void zza(boolean z4) {
        if (!zzgjy.zza(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i7 = zzgha.zza;
        zzgha.zze(zzglu.zzc());
        zzglk.zzb().zzc(zzc, zzggv.class);
        zzglr.zza().zzc(zzd);
        zzgkh.zzc().zzd(zzb, true);
    }
}
