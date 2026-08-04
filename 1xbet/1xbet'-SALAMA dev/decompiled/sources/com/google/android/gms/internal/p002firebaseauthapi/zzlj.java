package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzlj implements zzbo {
    private static final byte[] zza = new byte[0];
    private final zzln zzb;
    private final zzlk zzc;
    private final zzll zzd;
    private final zzlh zze;
    private final int zzf;
    private final byte[] zzg;

    private zzlj(zzln zzlnVar, zzlk zzlkVar, zzll zzllVar, zzlh zzlhVar, int i7, zzzc zzzcVar) {
        this.zzb = zzlnVar;
        this.zzc = zzlkVar;
        this.zzd = zzllVar;
        this.zze = zzlhVar;
        this.zzf = i7;
        this.zzg = zzzcVar.zzb();
    }

    public static zzbo zza(zzjw zzjwVar) throws GeneralSecurityException {
        int i7;
        zzya zzyaVar;
        zzln zzlnVarZza;
        zzju zzjuVarZzc = zzjwVar.zzc();
        zzlk zzlkVarZza = zzli.zza(zzjuVarZzc.zze());
        zzll zzllVarZza = zzli.zza(zzjuVarZzc.zzd());
        zzlh zzlhVarZza = zzli.zza(zzjuVarZzc.zzb());
        zzju.zzf zzfVarZze = zzjuVarZzc.zze();
        zzju.zzf zzfVar = zzju.zzf.zzd;
        if (zzfVarZze.equals(zzfVar)) {
            i7 = 32;
        } else if (zzfVarZze.equals(zzju.zzf.zza)) {
            i7 = 65;
        } else if (zzfVarZze.equals(zzju.zzf.zzb)) {
            i7 = 97;
        } else {
            if (!zzfVarZze.equals(zzju.zzf.zzc)) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            i7 = 133;
        }
        int i8 = i7;
        zzju.zzf zzfVarZze2 = zzjwVar.zzc().zze();
        if (zzfVarZze2.equals(zzfVar)) {
            zzlnVarZza = zzmb.zza(zzjwVar.zze().zza(zzbq.zza()));
        } else {
            zzju.zzf zzfVar2 = zzju.zzf.zza;
            if (!zzfVarZze2.equals(zzfVar2) && !zzfVarZze2.equals(zzju.zzf.zzb) && !zzfVarZze2.equals(zzju.zzf.zzc)) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            byte[] bArrZza = zzjwVar.zze().zza(zzbq.zza());
            byte[] bArrZzb = ((zzke) ((zzkr) zzjwVar.zzb())).zzd().zzb();
            if (zzfVarZze2.equals(zzfVar2)) {
                zzyaVar = zzya.NIST_P256;
            } else if (zzfVarZze2.equals(zzju.zzf.zzb)) {
                zzyaVar = zzya.NIST_P384;
            } else {
                if (!zzfVarZze2.equals(zzju.zzf.zzc)) {
                    throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                }
                zzyaVar = zzya.NIST_P521;
            }
            zzlnVarZza = zzlz.zza(bArrZza, bArrZzb, zzyaVar);
        }
        return new zzlj(zzlnVarZza, zzlkVarZza, zzllVarZza, zzlhVarZza, i8, zzjwVar.zzg());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzg;
        int length = bArr3.length + this.zzf;
        if (bArr.length >= length) {
            if (zzpr.zza(bArr3, bArr)) {
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                return zzlg.zza(Arrays.copyOfRange(bArr, this.zzg.length, length), this.zzb, this.zzc, this.zzd, this.zze, bArr2).zza(bArr, length, zza);
            }
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        throw new GeneralSecurityException("Ciphertext is too short.");
    }
}
