package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzfa;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public class zzey extends zzcu {
    private final zzfa zza;
    private final zzzc zzb;
    private final Integer zzc;

    private zzey(zzfa zzfaVar, zzzc zzzcVar, Integer num) {
        this.zza = zzfaVar;
        this.zzb = zzzcVar;
        this.zzc = num;
    }

    public static zzey zza(zzfa zzfaVar, Integer num) {
        zzzc zzb;
        if (zzfaVar.zzc() == zzfa.zzb.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzb = zzog.zza;
        } else {
            if (zzfaVar.zzc() != zzfa.zzb.zza) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzfaVar.zzc())));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzb = zzog.zzb(num.intValue());
        }
        return new zzey(zzfaVar, zzb, num);
    }

    public final zzfa zzb() {
        return this.zza;
    }

    public final zzzc zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final Integer zza() {
        return this.zzc;
    }
}
