package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzju;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzjw extends zzko {
    private final zzke zza;
    private final zzze zzb;

    private zzjw(zzke zzkeVar, zzze zzzeVar) {
        this.zza = zzkeVar;
        this.zzb = zzzeVar;
    }

    public static zzjw zza(zzke zzkeVar, zzze zzzeVar) {
        ECParameterSpec eCParameterSpec;
        if (zzkeVar == null) {
            throw new GeneralSecurityException("HPKE private key cannot be constructed without an HPKE public key");
        }
        if (zzzeVar == null) {
            throw new GeneralSecurityException("HPKE private key cannot be constructed without secret");
        }
        zzju.zzf zze = zzkeVar.zzb().zze();
        int zza = zzzeVar.zza();
        String str = "Encoded private key byte length for " + String.valueOf(zze) + " must be %d, not " + zza;
        zzju.zzf zzfVar = zzju.zzf.zza;
        if (zze == zzfVar) {
            if (zza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else if (zze == zzju.zzf.zzb) {
            if (zza != 48) {
                throw new GeneralSecurityException(String.format(str, 48));
            }
        } else if (zze == zzju.zzf.zzc) {
            if (zza != 66) {
                throw new GeneralSecurityException(String.format(str, 66));
            }
        } else {
            if (zze != zzju.zzf.zzd) {
                throw new GeneralSecurityException("Unable to validate private key length for ".concat(String.valueOf(zze)));
            }
            if (zza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        zzju.zzf zze2 = zzkeVar.zzb().zze();
        byte[] zzb = zzkeVar.zzd().zzb();
        byte[] zza2 = zzzeVar.zza(zzbq.zza());
        if (zze2 == zzfVar || zze2 == zzju.zzf.zzb || zze2 == zzju.zzf.zzc) {
            if (zze2 == zzfVar) {
                eCParameterSpec = zzmk.zza;
            } else if (zze2 == zzju.zzf.zzb) {
                eCParameterSpec = zzmk.zzb;
            } else {
                if (zze2 != zzju.zzf.zzc) {
                    throw new IllegalArgumentException("Unable to determine NIST curve params for ".concat(String.valueOf(zze2)));
                }
                eCParameterSpec = zzmk.zzc;
            }
            BigInteger order = eCParameterSpec.getOrder();
            BigInteger zza3 = zzmj.zza(zza2);
            if (zza3.signum() <= 0 || zza3.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private key.");
            }
            if (!zzmk.zza(zza3, eCParameterSpec).equals(zzyb.zza(eCParameterSpec.getCurve(), zzyd.UNCOMPRESSED, zzb))) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        } else {
            if (zze2 != zzju.zzf.zzd) {
                throw new IllegalArgumentException("Unable to validate key pair for ".concat(String.valueOf(zze2)));
            }
            if (!Arrays.equals(zzza.zza(zza2), zzb)) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        }
        return new zzjw(zzkeVar, zzzeVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzko, com.google.android.gms.internal.p002firebaseauthapi.zzck
    public final /* synthetic */ zzbp zzb() {
        return (zzke) zzb();
    }

    public final zzju zzc() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzko
    /* renamed from: zzd */
    public final /* synthetic */ zzkr zzb() {
        return this.zza;
    }

    public final zzze zze() {
        return this.zzb;
    }
}
