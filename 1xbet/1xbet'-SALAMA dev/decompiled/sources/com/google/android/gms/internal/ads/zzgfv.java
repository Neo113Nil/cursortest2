package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.security.GeneralSecurityException;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzgfv extends zzgdw {
    private final zzgga zza;
    private final zzgve zzb;
    private final zzgvd zzc;
    private final Integer zzd;

    private zzgfv(zzgga zzggaVar, zzgve zzgveVar, zzgvd zzgvdVar, Integer num) {
        this.zza = zzggaVar;
        this.zzb = zzgveVar;
        this.zzc = zzgvdVar;
        this.zzd = num;
    }

    public static zzgfv zzc(zzgfz zzgfzVar, zzgve zzgveVar, Integer num) throws GeneralSecurityException {
        zzgvd zzgvdVarZzb;
        zzgfz zzgfzVar2 = zzgfz.zzc;
        if (zzgfzVar != zzgfzVar2 && num == null) {
            throw new GeneralSecurityException(AbstractC0486a1.h("For given Variant ", zzgfzVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzgfzVar == zzgfzVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgveVar.zza() != 32) {
            throw new GeneralSecurityException(k.d(zzgveVar.zza(), "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        zzgga zzggaVarZzc = zzgga.zzc(zzgfzVar);
        if (zzggaVarZzc.zzb() == zzgfzVar2) {
            zzgvdVarZzb = zzglv.zza;
        } else if (zzggaVarZzc.zzb() == zzgfz.zzb) {
            zzgvdVarZzb = zzglv.zza(num.intValue());
        } else {
            if (zzggaVarZzc.zzb() != zzgfz.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzggaVarZzc.zzb().toString()));
            }
            zzgvdVarZzb = zzglv.zzb(num.intValue());
        }
        return new zzgfv(zzggaVarZzc, zzgveVar, zzgvdVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzgdw, com.google.android.gms.internal.ads.zzgcs
    public final /* synthetic */ zzgdf zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgdw
    public final zzgvd zzb() {
        return this.zzc;
    }

    public final zzgga zzd() {
        return this.zza;
    }

    public final zzgve zze() {
        return this.zzb;
    }

    public final Integer zzf() {
        return this.zzd;
    }
}
