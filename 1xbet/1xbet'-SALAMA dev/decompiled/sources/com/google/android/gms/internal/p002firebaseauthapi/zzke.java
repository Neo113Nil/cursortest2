package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;

/* JADX INFO: loaded from: classes.dex */
public final class zzke extends zzkr {
    private final zzju zza;
    private final zzzc zzb;
    private final zzzc zzc;
    private final Integer zzd;

    private zzke(zzju zzjuVar, zzzc zzzcVar, zzzc zzzcVar2, Integer num) {
        this.zza = zzjuVar;
        this.zzb = zzzcVar;
        this.zzc = zzzcVar2;
        this.zzd = num;
    }

    public static zzke zza(zzju zzjuVar, zzzc zzzcVar, Integer num) throws GeneralSecurityException {
        EllipticCurve curve;
        zzzc zzzcVarZzb;
        zzju.zze zzeVarZzf = zzjuVar.zzf();
        zzju.zze zzeVar = zzju.zze.zzc;
        if (!zzeVarZzf.equals(zzeVar) && num == null) {
            throw new GeneralSecurityException(AbstractC0486a1.h("'idRequirement' must be non-null for ", String.valueOf(zzeVarZzf), " variant."));
        }
        if (zzeVarZzf.equals(zzeVar) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
        zzju.zzf zzfVarZze = zzjuVar.zze();
        int iZza = zzzcVar.zza();
        String str = "Encoded public key byte length for " + String.valueOf(zzfVarZze) + " must be %d, not " + iZza;
        zzju.zzf zzfVar = zzju.zzf.zza;
        if (zzfVarZze == zzfVar) {
            if (iZza != 65) {
                throw new GeneralSecurityException(String.format(str, 65));
            }
        } else if (zzfVarZze == zzju.zzf.zzb) {
            if (iZza != 97) {
                throw new GeneralSecurityException(String.format(str, 97));
            }
        } else if (zzfVarZze == zzju.zzf.zzc) {
            if (iZza != 133) {
                throw new GeneralSecurityException(String.format(str, 133));
            }
        } else {
            if (zzfVarZze != zzju.zzf.zzd) {
                throw new GeneralSecurityException("Unable to validate public key length for ".concat(String.valueOf(zzfVarZze)));
            }
            if (iZza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        if (zzfVarZze == zzfVar || zzfVarZze == zzju.zzf.zzb || zzfVarZze == zzju.zzf.zzc) {
            if (zzfVarZze == zzfVar) {
                curve = zzmk.zza.getCurve();
            } else if (zzfVarZze == zzju.zzf.zzb) {
                curve = zzmk.zzb.getCurve();
            } else {
                if (zzfVarZze != zzju.zzf.zzc) {
                    throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(zzfVarZze)));
                }
                curve = zzmk.zzc.getCurve();
            }
            zzmk.zza(zzyb.zza(curve, zzyd.UNCOMPRESSED, zzzcVar.zzb()), curve);
        }
        zzju.zze zzeVarZzf2 = zzjuVar.zzf();
        if (zzeVarZzf2 == zzeVar) {
            zzzcVarZzb = zzog.zza;
        } else {
            if (num == null) {
                throw new IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant ".concat(String.valueOf(zzeVarZzf2)));
            }
            if (zzeVarZzf2 == zzju.zze.zzb) {
                zzzcVarZzb = zzog.zza(num.intValue());
            } else {
                if (zzeVarZzf2 != zzju.zze.zza) {
                    throw new IllegalStateException("Unknown HpkeParameters.Variant: ".concat(String.valueOf(zzeVarZzf2)));
                }
                zzzcVarZzb = zzog.zzb(num.intValue());
            }
        }
        return new zzke(zzjuVar, zzzcVar, zzzcVarZzb, num);
    }

    public final zzju zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkr
    public final zzzc zzc() {
        return this.zzc;
    }

    public final zzzc zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final Integer zza() {
        return this.zzd;
    }
}
