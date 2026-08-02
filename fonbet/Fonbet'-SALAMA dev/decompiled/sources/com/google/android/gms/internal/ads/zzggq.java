package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzggq extends zzgdw {
    private final zzggv zza;
    private final zzgvd zzb;
    private final Integer zzc;

    private zzggq(zzggv zzggvVar, zzgvd zzgvdVar, Integer num) {
        this.zza = zzggvVar;
        this.zzb = zzgvdVar;
        this.zzc = num;
    }

    public static zzggq zzc(zzggv zzggvVar, Integer num) {
        zzgvd zzb;
        if (zzggvVar.zzc() == zzggt.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzb = zzglv.zza;
        } else {
            if (zzggvVar.zzc() != zzggt.zza) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzggvVar.zzc())));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzb = zzglv.zzb(num.intValue());
        }
        return new zzggq(zzggvVar, zzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzgdw, com.google.android.gms.internal.ads.zzgcs
    public final /* synthetic */ zzgdf zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgdw
    public final zzgvd zzb() {
        return this.zzb;
    }

    public final zzggv zzd() {
        return this.zza;
    }

    public final Integer zze() {
        return this.zzc;
    }
}
