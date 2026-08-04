package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzgdv {
    public static final /* synthetic */ int zza = 0;
    private static final zzgkg zzb = zzb();

    public static zzgcm zza() throws GeneralSecurityException {
        if (zzgjz.zzb()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV0 in FIPS mode");
        }
        return zzb;
    }

    private static zzgkg zzb() {
        try {
            zzgmn zzgmnVarZza = zzgmq.zza();
            zzgec.zze(zzgmnVarZza);
            zzgmnVarZza.zza(zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzgdo
                @Override // com.google.android.gms.internal.ads.zzgmk
                public final Object zza(zzgcs zzgcsVar) {
                    return zzguf.zzb((zzgef) zzgcsVar);
                }
            }, zzgef.class, zzgci.class));
            zzgmnVarZza.zza(zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzgdp
                @Override // com.google.android.gms.internal.ads.zzgmk
                public final Object zza(zzgcs zzgcsVar) {
                    return zzguc.zzb((zzgfb) zzgcsVar);
                }
            }, zzgfb.class, zzgci.class));
            zzgmnVarZza.zza(zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzgdq
                @Override // com.google.android.gms.internal.ads.zzgmk
                public final Object zza(zzgcs zzgcsVar) {
                    return zzgjx.zzb((zzgfm) zzgcsVar);
                }
            }, zzgfm.class, zzgci.class));
            zzgmnVarZza.zza(zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzgdr
                @Override // com.google.android.gms.internal.ads.zzgmk
                public final Object zza(zzgcs zzgcsVar) {
                    return zzgub.zzb((zzger) zzgcsVar);
                }
            }, zzger.class, zzgci.class));
            zzgmnVarZza.zza(zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzgds
                @Override // com.google.android.gms.internal.ads.zzgmk
                public final Object zza(zzgcs zzgcsVar) {
                    zzgfv zzgfvVar = (zzgfv) zzgcsVar;
                    int i7 = zzgdv.zza;
                    return zzgiv.zze() ? zzgiv.zzb(zzgfvVar) : zzgue.zzb(zzgfvVar);
                }
            }, zzgfv.class, zzgci.class));
            zzgmnVarZza.zza(zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzgdt
                @Override // com.google.android.gms.internal.ads.zzgmk
                public final Object zza(zzgcs zzgcsVar) {
                    zzghr zzghrVar = (zzghr) zzgcsVar;
                    int i7 = zzgdv.zza;
                    return zzgjq.zzc() ? zzgjq.zzb(zzghrVar) : zzgvc.zzb(zzghrVar);
                }
            }, zzghr.class, zzgci.class));
            zzgmnVarZza.zza(zzgmm.zzb(new zzgmk() { // from class: com.google.android.gms.internal.ads.zzgdu
                @Override // com.google.android.gms.internal.ads.zzgmk
                public final Object zza(zzgcs zzgcsVar) {
                    return zzgjk.zzb((zzghl) zzgcsVar);
                }
            }, zzghl.class, zzgci.class));
            return zzgkg.zzd(zzgmnVarZza.zzc());
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }
}
