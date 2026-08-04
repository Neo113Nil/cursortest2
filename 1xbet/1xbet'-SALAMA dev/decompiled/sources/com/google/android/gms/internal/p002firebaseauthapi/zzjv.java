package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* JADX INFO: loaded from: classes.dex */
public final class zzjv extends zzkr {
    private final zzjp zza;
    private final ECPoint zzb;
    private final zzzc zzc;
    private final zzzc zzd;
    private final Integer zze;

    private zzjv(zzjp zzjpVar, ECPoint eCPoint, zzzc zzzcVar, zzzc zzzcVar2, Integer num) {
        this.zza = zzjpVar;
        this.zzb = eCPoint;
        this.zzc = zzzcVar;
        this.zzd = zzzcVar2;
        this.zze = num;
    }

    public static zzjv zza(zzjp zzjpVar, zzzc zzzcVar, Integer num) throws GeneralSecurityException {
        if (!zzjpVar.zzd().equals(zzjp.zzc.zzd)) {
            throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
        }
        zzb(zzjpVar.zzg(), num);
        if (zzzcVar.zza() == 32) {
            return new zzjv(zzjpVar, null, zzzcVar, zza(zzjpVar.zzg(), num), num);
        }
        throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
    }

    public final zzjp zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkr
    public final zzzc zzc() {
        return this.zzd;
    }

    public final zzzc zzd() {
        return this.zzc;
    }

    public final ECPoint zze() {
        return this.zzb;
    }

    private static void zzb(zzjp.zzd zzdVar, Integer num) throws GeneralSecurityException {
        zzjp.zzd zzdVar2 = zzjp.zzd.zzc;
        if (!zzdVar.equals(zzdVar2) && num == null) {
            throw new GeneralSecurityException(AbstractC0486a1.h("'idRequirement' must be non-null for ", String.valueOf(zzdVar), " variant."));
        }
        if (zzdVar.equals(zzdVar2) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    public static zzjv zza(zzjp zzjpVar, ECPoint eCPoint, Integer num) throws GeneralSecurityException {
        EllipticCurve curve;
        if (!zzjpVar.zzd().equals(zzjp.zzc.zzd)) {
            zzb(zzjpVar.zzg(), num);
            zzjp.zzc zzcVarZzd = zzjpVar.zzd();
            if (zzcVarZzd == zzjp.zzc.zza) {
                curve = zzmk.zza.getCurve();
            } else if (zzcVarZzd == zzjp.zzc.zzb) {
                curve = zzmk.zzb.getCurve();
            } else if (zzcVarZzd == zzjp.zzc.zzc) {
                curve = zzmk.zzc.getCurve();
            } else {
                throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(zzcVarZzd)));
            }
            zzmk.zza(eCPoint, curve);
            return new zzjv(zzjpVar, eCPoint, null, zza(zzjpVar.zzg(), num), num);
        }
        throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
    }

    private static zzzc zza(zzjp.zzd zzdVar, Integer num) {
        if (zzdVar == zzjp.zzd.zzc) {
            return zzog.zza;
        }
        if (num != null) {
            if (zzdVar == zzjp.zzd.zzb) {
                return zzog.zza(num.intValue());
            }
            if (zzdVar == zzjp.zzd.zza) {
                return zzog.zzb(num.intValue());
            }
            throw new IllegalStateException("Unknown EciesParameters.Variant: ".concat(String.valueOf(zzdVar)));
        }
        throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: ".concat(String.valueOf(zzdVar)));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final Integer zza() {
        return this.zze;
    }
}
