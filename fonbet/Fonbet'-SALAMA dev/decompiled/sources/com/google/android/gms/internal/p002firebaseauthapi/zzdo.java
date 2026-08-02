package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdv;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzdo extends zzcu {
    private final zzdv zza;
    private final zzze zzb;
    private final zzzc zzc;
    private final Integer zzd;

    public static class zza {
        private zzdv zza;
        private zzze zzb;
        private Integer zzc;

        public final zza zza(Integer num) {
            this.zzc = num;
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(zzze zzzeVar) {
            this.zzb = zzzeVar;
            return this;
        }

        public final zza zza(zzdv zzdvVar) {
            this.zza = zzdvVar;
            return this;
        }

        public final zzdo zza() {
            zzzc zzb;
            zzdv zzdvVar = this.zza;
            if (zzdvVar != null && this.zzb != null) {
                if (zzdvVar.zzc() == this.zzb.zza()) {
                    if (this.zza.zza() && this.zzc == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!this.zza.zza() && this.zzc != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    if (this.zza.zzf() == zzdv.zzb.zzc) {
                        zzb = zzog.zza;
                    } else if (this.zza.zzf() == zzdv.zzb.zzb) {
                        zzb = zzog.zza(this.zzc.intValue());
                    } else if (this.zza.zzf() == zzdv.zzb.zza) {
                        zzb = zzog.zzb(this.zzc.intValue());
                    } else {
                        throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
                    }
                    return new zzdo(this.zza, this.zzb, zzb, this.zzc);
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

    public final zzdv zzc() {
        return this.zza;
    }

    public final zzzc zzd() {
        return this.zzc;
    }

    public final zzze zze() {
        return this.zzb;
    }

    private zzdo(zzdv zzdvVar, zzze zzzeVar, zzzc zzzcVar, Integer num) {
        this.zza = zzdvVar;
        this.zzb = zzzeVar;
        this.zzc = zzzcVar;
        this.zzd = num;
    }
}
