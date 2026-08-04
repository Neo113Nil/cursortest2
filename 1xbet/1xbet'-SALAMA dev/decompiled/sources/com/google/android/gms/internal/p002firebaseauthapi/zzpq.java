package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzpq extends zzqo {
    private final zzpx zza;
    private final zzze zzb;
    private final zzzc zzc;
    private final Integer zzd;

    public static class zza {
        private zzpx zza;
        private zzze zzb;
        private Integer zzc;

        public final zza zza(zzze zzzeVar) {
            this.zzb = zzzeVar;
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(Integer num) {
            this.zzc = num;
            return this;
        }

        public final zza zza(zzpx zzpxVar) {
            this.zza = zzpxVar;
            return this;
        }

        public final zzpq zza() throws GeneralSecurityException {
            zzzc zzzcVarZza;
            zzpx zzpxVar = this.zza;
            if (zzpxVar != null && this.zzb != null) {
                if (zzpxVar.zzc() == this.zzb.zza()) {
                    if (this.zza.zza() && this.zzc == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.zza.zza() && this.zzc != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    if (this.zza.zze() == zzpx.zzb.zzd) {
                        zzzcVarZza = zzog.zza;
                    } else if (this.zza.zze() != zzpx.zzb.zzc && this.zza.zze() != zzpx.zzb.zzb) {
                        if (this.zza.zze() == zzpx.zzb.zza) {
                            zzzcVarZza = zzog.zzb(this.zzc.intValue());
                        } else {
                            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
                        }
                    } else {
                        zzzcVarZza = zzog.zza(this.zzc.intValue());
                    }
                    return new zzpq(this.zza, this.zzb, zzzcVarZza, this.zzc);
                }
                throw new GeneralSecurityException("Key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
    }

    public static zza zzb() {
        return new zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final Integer zza() {
        return this.zzd;
    }

    public final zzpx zzc() {
        return this.zza;
    }

    public final zzzc zzd() {
        return this.zzc;
    }

    public final zzze zze() {
        return this.zzb;
    }

    private zzpq(zzpx zzpxVar, zzze zzzeVar, zzzc zzzcVar, Integer num) {
        this.zza = zzpxVar;
        this.zzb = zzzeVar;
        this.zzc = zzzcVar;
        this.zzd = num;
    }
}
