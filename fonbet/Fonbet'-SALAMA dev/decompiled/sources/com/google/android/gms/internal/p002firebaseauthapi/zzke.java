package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import com.google.android.gms.internal.p002firebaseauthapi.zzju;
import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;

/* loaded from: classes.dex */
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

    public static zzke zza(zzju zzjuVar, zzzc zzzcVar, Integer num) {
        EllipticCurve curve;
        zzzc zzb;
        zzju.zze zzf = zzjuVar.zzf();
        zzju.zze zzeVar = zzju.zze.zzc;
        if (!zzf.equals(zzeVar) && num == null) {
            throw new GeneralSecurityException(AbstractC0486a1.h("'idRequirement' must be non-null for ", String.valueOf(zzf), " variant."));
        }
        if (zzf.equals(zzeVar) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
        zzju.zzf zze = zzjuVar.zze();
        int zza = zzzcVar.zza();
        String str = "Encoded public key byte length for " + String.valueOf(zze) + " must be %d, not " + zza;
        zzju.zzf zzfVar = zzju.zzf.zza;
        if (zze == zzfVar) {
            if (zza != 65) {
                throw new GeneralSecurityException(String.format(str, 65));
            }
        } else if (zze == zzju.zzf.zzb) {
            if (zza != 97) {
                throw new GeneralSecurityException(String.format(str, 97));
            }
        } else if (zze == zzju.zzf.zzc) {
            if (zza != 133) {
                throw new GeneralSecurityException(String.format(str, 133));
            }
        } else {
            if (zze != zzju.zzf.zzd) {
                throw new GeneralSecurityException("Unable to validate public key length for ".concat(String.valueOf(zze)));
            }
            if (zza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        if (zze == zzfVar || zze == zzju.zzf.zzb || zze == zzju.zzf.zzc) {
            if (zze == zzfVar) {
                curve = zzmk.zza.getCurve();
            } else if (zze == zzju.zzf.zzb) {
                curve = zzmk.zzb.getCurve();
            } else {
                if (zze != zzju.zzf.zzc) {
                    throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(zze)));
                }
                curve = zzmk.zzc.getCurve();
            }
            zzmk.zza(zzyb.zza(curve, zzyd.UNCOMPRESSED, zzzcVar.zzb()), curve);
        }
        zzju.zze zzf2 = zzjuVar.zzf();
        if (zzf2 == zzeVar) {
            zzb = zzog.zza;
        } else {
            if (num == null) {
                throw new IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant ".concat(String.valueOf(zzf2)));
            }
            if (zzf2 == zzju.zze.zzb) {
                zzb = zzog.zza(num.intValue());
            } else {
                if (zzf2 != zzju.zze.zza) {
                    throw new IllegalStateException("Unknown HpkeParameters.Variant: ".concat(String.valueOf(zzf2)));
                }
                zzb = zzog.zzb(num.intValue());
            }
        }
        return new zzke(zzjuVar, zzzcVar, zzb, num);
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
