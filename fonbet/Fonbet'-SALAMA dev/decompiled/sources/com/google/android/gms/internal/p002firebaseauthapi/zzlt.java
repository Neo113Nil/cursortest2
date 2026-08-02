package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzlt implements zzbo {
    private final zzbo zza;
    private final byte[] zzb;

    private zzlt(zzbo zzboVar, byte[] bArr) {
        this.zza = zzboVar;
        this.zzb = bArr;
    }

    public static zzbo zza(zznc zzncVar) {
        byte[] zzb;
        zzpc zza = zzncVar.zza(zzbq.zza());
        zzbo zzboVar = (zzbo) zzco.zza((zzvq) ((zzajy) zzvq.zza().zza(zza.zzf()).zza(zza.zzd()).zza(zza.zza()).zze()), zzbo.class);
        zzws zzb2 = zza.zzb();
        int i7 = zzls.zza[zzb2.ordinal()];
        if (i7 == 1) {
            zzb = zzog.zza.zzb();
        } else if (i7 == 2 || i7 == 3) {
            zzb = zzog.zza(zzncVar.zza().intValue()).zzb();
        } else {
            if (i7 != 4) {
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzb2)));
            }
            zzb = zzog.zzb(zzncVar.zza().intValue()).zzb();
        }
        return new zzlt(zzboVar, zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzpr.zza(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, this.zzb.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
    }
}
