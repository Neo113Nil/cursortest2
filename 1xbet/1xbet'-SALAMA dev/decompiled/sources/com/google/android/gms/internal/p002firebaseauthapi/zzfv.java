package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import java.security.GeneralSecurityException;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzfv extends zzcu {
    private final zzga zza;
    private final zzze zzb;
    private final zzzc zzc;
    private final Integer zzd;

    private zzfv(zzga zzgaVar, zzze zzzeVar, zzzc zzzcVar, Integer num) {
        this.zza = zzgaVar;
        this.zzb = zzzeVar;
        this.zzc = zzzcVar;
        this.zzd = num;
    }

    public static zzfv zza(zzga.zza zzaVar, zzze zzzeVar, Integer num) throws GeneralSecurityException {
        zzzc zzzcVarZzb;
        zzga.zza zzaVar2 = zzga.zza.zzc;
        if (zzaVar != zzaVar2 && num == null) {
            throw new GeneralSecurityException(AbstractC0486a1.h("For given Variant ", String.valueOf(zzaVar), " the value of idRequirement must be non-null"));
        }
        if (zzaVar == zzaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzzeVar.zza() != 32) {
            throw new GeneralSecurityException(k.d(zzzeVar.zza(), "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        zzga zzgaVarZza = zzga.zza(zzaVar);
        if (zzgaVarZza.zzb() == zzaVar2) {
            zzzcVarZzb = zzog.zza;
        } else if (zzgaVarZza.zzb() == zzga.zza.zzb) {
            zzzcVarZzb = zzog.zza(num.intValue());
        } else {
            if (zzgaVarZza.zzb() != zzga.zza.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(String.valueOf(zzgaVarZza.zzb())));
            }
            zzzcVarZzb = zzog.zzb(num.intValue());
        }
        return new zzfv(zzgaVarZza, zzzeVar, zzzcVarZzb, num);
    }

    public final zzga zzb() {
        return this.zza;
    }

    public final zzzc zzc() {
        return this.zzc;
    }

    public final zzze zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final Integer zza() {
        return this.zzd;
    }
}
