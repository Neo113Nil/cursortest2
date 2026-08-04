package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzcz extends zzcu {
    private final zzdg zza;
    private final zzze zzb;
    private final zzze zzc;
    private final zzzc zzd;
    private final Integer zze;

    public static class zza {
        private zzdg zza;
        private zzze zzb;
        private zzze zzc;
        private Integer zzd;

        public final zza zza(zzze zzzeVar) {
            this.zzb = zzzeVar;
            return this;
        }

        public final zza zzb(zzze zzzeVar) {
            this.zzc = zzzeVar;
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
        }

        public final zza zza(Integer num) {
            this.zzd = num;
            return this;
        }

        public final zza zza(zzdg zzdgVar) {
            this.zza = zzdgVar;
            return this;
        }

        public final zzcz zza() throws GeneralSecurityException {
            zzzc zzzcVarZzb;
            zzdg zzdgVar = this.zza;
            if (zzdgVar != null) {
                if (this.zzb != null && this.zzc != null) {
                    if (zzdgVar.zzb() == this.zzb.zza()) {
                        if (this.zza.zzc() == this.zzc.zza()) {
                            if (this.zza.zza() && this.zzd == null) {
                                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                            }
                            if (!this.zza.zza() && this.zzd != null) {
                                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                            }
                            if (this.zza.zzh() == zzdg.zzb.zzc) {
                                zzzcVarZzb = zzog.zza;
                            } else if (this.zza.zzh() == zzdg.zzb.zzb) {
                                zzzcVarZzb = zzog.zza(this.zzd.intValue());
                            } else if (this.zza.zzh() == zzdg.zzb.zza) {
                                zzzcVarZzb = zzog.zzb(this.zzd.intValue());
                            } else {
                                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzh())));
                            }
                            return new zzcz(this.zza, this.zzb, this.zzc, zzzcVarZzb, this.zzd);
                        }
                        throw new GeneralSecurityException("HMAC key size mismatch");
                    }
                    throw new GeneralSecurityException("AES key size mismatch");
                }
                throw new GeneralSecurityException("Cannot build without key material");
            }
            throw new GeneralSecurityException("Cannot build without parameters");
        }
    }

    public static zza zzb() {
        return new zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final Integer zza() {
        return this.zze;
    }

    public final zzdg zzc() {
        return this.zza;
    }

    public final zzzc zzd() {
        return this.zzd;
    }

    public final zzze zze() {
        return this.zzb;
    }

    public final zzze zzf() {
        return this.zzc;
    }

    private zzcz(zzdg zzdgVar, zzze zzzeVar, zzze zzzeVar2, zzzc zzzcVar, Integer num) {
        this.zza = zzdgVar;
        this.zzb = zzzeVar;
        this.zzc = zzzeVar2;
        this.zzd = zzzcVar;
        this.zze = num;
    }
}
