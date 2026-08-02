package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgji implements zzgci {
    private final zzgci zza;
    private final byte[] zzb;

    private zzgji(zzgci zzgciVar, byte[] bArr) {
        this.zza = zzgciVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzgci zzb(zzgku zzgkuVar) {
        byte[] zzd;
        zzgmw zzb = zzgkuVar.zzb(zzgcr.zza());
        zzgrx zza = zzgsa.zza();
        zza.zzb(zzb.zzg());
        zza.zzc(zzb.zze());
        zza.zza(zzb.zzb());
        zzgci zzgciVar = (zzgci) zzgdi.zza((zzgsa) zza.zzbr(), zzgci.class);
        zzgte zzc = zzb.zzc();
        int ordinal = zzc.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    zzd = zzglv.zza.zzd();
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzc)));
                }
            }
            zzd = zzglv.zza(zzgkuVar.zzd().intValue()).zzd();
        } else {
            zzd = zzglv.zzb(zzgkuVar.zzd().intValue()).zzd();
        }
        return new zzgji(zzgciVar, zzd);
    }

    public static zzgci zzc(zzgci zzgciVar, zzgvd zzgvdVar) {
        return new zzgji(zzgciVar, zzgvdVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgci
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzgni.zzc(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
