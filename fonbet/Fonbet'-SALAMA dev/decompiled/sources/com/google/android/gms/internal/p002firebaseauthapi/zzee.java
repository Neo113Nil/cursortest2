package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import com.google.android.gms.internal.p002firebaseauthapi.zzei;
import e1.k;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzee extends zzcu {
    private final zzei zza;
    private final zzze zzb;
    private final zzzc zzc;
    private final Integer zzd;

    private zzee(zzei zzeiVar, zzze zzzeVar, zzzc zzzcVar, Integer num) {
        this.zza = zzeiVar;
        this.zzb = zzzeVar;
        this.zzc = zzzcVar;
        this.zzd = num;
    }

    public static zzee zza(zzei.zza zzaVar, zzze zzzeVar, Integer num) {
        zzzc zzb;
        zzei.zza zzaVar2 = zzei.zza.zzc;
        if (zzaVar != zzaVar2 && num == null) {
            throw new GeneralSecurityException(AbstractC0486a1.h("For given Variant ", String.valueOf(zzaVar), " the value of idRequirement must be non-null"));
        }
        if (zzaVar == zzaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzzeVar.zza() != 32) {
            throw new GeneralSecurityException(k.d(zzzeVar.zza(), "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        zzei zza = zzei.zza(zzaVar);
        if (zza.zzb() == zzaVar2) {
            zzb = zzog.zza;
        } else if (zza.zzb() == zzei.zza.zzb) {
            zzb = zzog.zza(num.intValue());
        } else {
            if (zza.zzb() != zzei.zza.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(String.valueOf(zza.zzb())));
            }
            zzb = zzog.zzb(num.intValue());
        }
        return new zzee(zza, zzzeVar, zzb, num);
    }

    public final zzei zzb() {
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
