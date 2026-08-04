package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.security.GeneralSecurityException;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzghl extends zzgdw {
    private final zzghq zza;
    private final zzgve zzb;
    private final zzgvd zzc;
    private final Integer zzd;

    private zzghl(zzghq zzghqVar, zzgve zzgveVar, zzgvd zzgvdVar, Integer num) {
        this.zza = zzghqVar;
        this.zzb = zzgveVar;
        this.zzc = zzgvdVar;
        this.zzd = num;
    }

    public static zzghl zzc(zzghq zzghqVar, zzgve zzgveVar, Integer num) throws GeneralSecurityException {
        zzgvd zzgvdVarZzb;
        zzghp zzghpVarZzc = zzghqVar.zzc();
        zzghp zzghpVar = zzghp.zzb;
        if (zzghpVarZzc != zzghpVar && num == null) {
            throw new GeneralSecurityException(AbstractC0486a1.h("For given Variant ", zzghqVar.zzc().toString(), " the value of idRequirement must be non-null"));
        }
        if (zzghqVar.zzc() == zzghpVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgveVar.zza() != 32) {
            throw new GeneralSecurityException(k.d(zzgveVar.zza(), "XAesGcmKey key must be constructed with key of length 32 bytes, not "));
        }
        if (zzghqVar.zzc() == zzghpVar) {
            zzgvdVarZzb = zzglv.zza;
        } else {
            if (zzghqVar.zzc() != zzghp.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzghqVar.zzc().toString()));
            }
            zzgvdVarZzb = zzglv.zzb(num.intValue());
        }
        return new zzghl(zzghqVar, zzgveVar, zzgvdVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzgdw, com.google.android.gms.internal.ads.zzgcs
    public final /* synthetic */ zzgdf zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgdw
    public final zzgvd zzb() {
        return this.zzc;
    }

    public final zzghq zzd() {
        return this.zza;
    }

    public final zzgve zze() {
        return this.zzb;
    }

    public final Integer zzf() {
        return this.zzd;
    }
}
